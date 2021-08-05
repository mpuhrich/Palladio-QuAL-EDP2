package org.palladiosimulator.edp2.repository.parquet.internal.context.mode;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import javax.measure.quantity.Quantity;

import org.apache.avro.Schema;
import org.apache.avro.SchemaBuilder;
import org.apache.avro.generic.GenericRecord;
import org.apache.hadoop.conf.Configuration;
import org.apache.parquet.ParquetReadOptions;
import org.apache.parquet.avro.AvroParquetReader;
import org.apache.parquet.avro.AvroReadSupport;
import org.apache.parquet.filter2.compat.FilterCompat;
import org.apache.parquet.filter2.compat.FilterCompat.Filter;
import org.apache.parquet.filter2.predicate.FilterApi;
import org.apache.parquet.hadoop.ParquetFileReader;
import org.apache.parquet.hadoop.ParquetReader;
import org.apache.parquet.hadoop.util.HadoopInputFile;
import org.palladiosimulator.edp2.repository.parquet.dao.ParquetMeasurementsDao;
import org.palladiosimulator.edp2.repository.parquet.internal.ParquetRepositoryConstants;
import org.palladiosimulator.edp2.repository.parquet.internal.backgroundlist.MeasurementsList;
import org.palladiosimulator.edp2.repository.parquet.internal.backgroundlist.MeasurementsReadList;
import org.palladiosimulator.edp2.repository.parquet.internal.context.ExperimentContext;
import org.palladiosimulator.edp2.repository.parquet.internal.read.ReaderFactory;
import org.palladiosimulator.edp2.repository.parquet.internal.schema.SchemaUtility;

import static org.apache.parquet.filter2.predicate.FilterApi.notEq;

public class ExperimentContextReadMode extends ExperimentContextMode {

    private ParquetReader.Builder<GenericRecord> parquetReaderBuilder;
    private ReaderFactory readFactory;
    private ParquetFileReader parquetFileReader;
    private Map<ParquetMeasurementsDao<?, ?>, MeasurementsReadList<?, ?>> readListRegistry;

    /**
     * Key: fieldName from valueDao
     */
    private Map<String, ParquetFileReader> fragmentParquetFileReader;
    /**
     * Key: fieldName from valueDao
     */
    private Map<String, ParquetReader.Builder<GenericRecord>> fragmentParquetReaderBuilder;

    public ExperimentContextReadMode(final ExperimentContext context) {
        super(context);
    }

    @Override
    public <V, Q extends Quantity> void open(final ParquetMeasurementsDao<V, Q> dao) {
        if (Objects.isNull(parquetReaderBuilder)) {
            try {
                final var file = HadoopInputFile.fromPath(context.getPath(), new Configuration());
                parquetReaderBuilder = AvroParquetReader.<GenericRecord> builder(file);
                final var parquetOptions = ParquetReadOptions.builder().build();
                parquetFileReader = new ParquetFileReader(file, parquetOptions);
                fragmentParquetFileReader = new HashMap<String, ParquetFileReader>();
                fragmentParquetReaderBuilder = new HashMap<String, ParquetReader.Builder<GenericRecord>>();
                loadFragments();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            readFactory = new ReaderFactory();
            readListRegistry = new HashMap<ParquetMeasurementsDao<?,?>, MeasurementsReadList<?,?>>();
        }
    }

    private void loadFragments() throws IOException {
        var path = Path.of(context.getPath().getParent().toString());
        var name = context.getPath().getName();
        var filter = name.substring(0, name.lastIndexOf('.'))
                + ParquetRepositoryConstants.PARQUET_FILE_FRAGMENT_NAME
                + "*." + ParquetRepositoryConstants.PARQUET_FILE_SUFFIX;
        var directoryStream = Files.newDirectoryStream(path, filter);
        for (var file : directoryStream) {
            final var parquetOptions = ParquetReadOptions.builder().build();
            final var hadoopPath = new org.apache.hadoop.fs.Path(file.toString());
            final var inputFile = HadoopInputFile.fromPath(hadoopPath, new Configuration());
            final var parquetFileReader = new ParquetFileReader(inputFile, parquetOptions);
            final var parquetReaderBuilder = AvroParquetReader.<GenericRecord>builder(inputFile);

            final var fields = parquetFileReader.getFileMetaData().getSchema().getFields();
            for (var field : fields) {
                if (!field.getName().equals(SchemaUtility.getFieldNameForTimeData())) {
                    fragmentParquetFileReader.put(field.getName(), parquetFileReader);
                    fragmentParquetReaderBuilder.put(field.getName(), parquetReaderBuilder);
                }
            }
        }
    }

    @Override
    public void close() {
        readListRegistry.forEach((k, v) -> {v.close();});
        try {
            parquetFileReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        fragmentParquetFileReader.values().forEach(r -> {
            try {
                r.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    @Override
    public <V, Q extends Quantity> Map<String, String> getMetaData(final ParquetMeasurementsDao<V, Q> dao) {
        final var valueDaoFieldName = dao.getDaoTuple().getValueDao().getFieldName();
        if (fragmentParquetFileReader.containsKey(valueDaoFieldName)) {
            return fragmentParquetFileReader.get(valueDaoFieldName)
                    .getFileMetaData()
                    .getKeyValueMetaData();
        }
        return parquetFileReader.getFileMetaData().getKeyValueMetaData();
    }

    /**
     * Creates a new {@link MeasurementsList} that can only be iterated once.
     */
    @Override
    public <V, Q extends Quantity> MeasurementsList<V, Q> getBackgroundList(final ParquetMeasurementsDao<V, Q> dao) {
        var readList = getMeasurementsReadList(dao);
        if (Objects.nonNull(readList)) {
            return readList;
        }
        readList = createMeasurementsReadList(dao);
        readListRegistry.put(dao, readList);
        return readList;
    }

    @SuppressWarnings("unchecked")
    private <V, Q extends Quantity> MeasurementsReadList<V, Q> getMeasurementsReadList(final ParquetMeasurementsDao<V, Q> dao) {
        final var readList = readListRegistry.get(dao);
        if (Objects.isNull(readList)) {
            return null;
        }
        if (!readList.isUsed()) {
            return (MeasurementsReadList<V, Q>) readList;
        }
        readList.close();
        readListRegistry.remove(dao);
        return null;
    }

    private <V, Q extends Quantity> MeasurementsReadList<V, Q> createMeasurementsReadList(final ParquetMeasurementsDao<V, Q> dao) {
        final var parquetReader = createParquetReader(dao);
        final var daoReader = readFactory.createDaoReader(parquetReader, dao);
        final var size = getMetaData(dao).get(dao.getDaoTuple().getValueDao().getFieldName() + ".size");
        final var measureReadList =  new MeasurementsReadList<V, Q>(daoReader, Integer.valueOf(size));
        return measureReadList;
    }

    private <V, Q extends Quantity> ParquetReader<GenericRecord> createParquetReader(final ParquetMeasurementsDao<V, Q> dao) {
        final var conf = new Configuration();
        AvroReadSupport.setRequestedProjection(conf, getProjectionSchema(dao));
        try {
            final var parquetReaderBuilder = getParquetReaderBuilder(dao);
            return parquetReaderBuilder
                    .withConf(conf)
                    .withFilter(getFilter(dao))
                    .build();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private <V, Q extends Quantity> ParquetReader.Builder<GenericRecord> getParquetReaderBuilder(final ParquetMeasurementsDao<V, Q> dao) {
        final var valueDaoFieldName = dao.getDaoTuple().getValueDao().getFieldName();
        if (fragmentParquetReaderBuilder.containsKey(valueDaoFieldName)) {
            return fragmentParquetReaderBuilder.get(valueDaoFieldName);
        }
        return parquetReaderBuilder;
    }

    /**
     * Creates a filter that skips null values.
     */
    private <V, Q extends Quantity> Filter getFilter(final ParquetMeasurementsDao<V, Q> dao) {
        final var valueDao = dao.getDaoTuple().getValueDao();
        switch (SchemaUtility.getTypeFromSchema(valueDao.getFieldType())) {
        case DOUBLE:
            return FilterCompat.get(notEq(FilterApi.doubleColumn(valueDao.getFieldName()), null));
        case LONG:
            return FilterCompat.get(notEq(FilterApi.longColumn(valueDao.getFieldName()), null));
        default:
            throw new RuntimeException();
        }
    }

    /**
     * Creates a schema so that only relevant columns are read.
     */
    private <V, Q extends Quantity> Schema getProjectionSchema(final ParquetMeasurementsDao<V, Q> dao) {
        final var valueDao = dao.getDaoTuple().getValueDao();
        return SchemaBuilder.record(ParquetRepositoryConstants.PARQUET_RECORD_NAME)
                .fields()
                .name(SchemaUtility.getFieldNameForTimeData()).type().doubleType().noDefault()
                .name(valueDao.getFieldName()).type(valueDao.getFieldType()).withDefault(null)
                .endRecord();
    }

}
