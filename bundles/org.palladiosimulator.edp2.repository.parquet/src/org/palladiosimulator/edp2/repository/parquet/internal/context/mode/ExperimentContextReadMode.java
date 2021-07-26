package org.palladiosimulator.edp2.repository.parquet.internal.context.mode;

import java.io.IOException;
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

    public ExperimentContextReadMode(final ExperimentContext context) {
        super(context);
    }

    @Override
    public void open() {
        if (Objects.isNull(parquetReaderBuilder)) {
            try {
                final var file = HadoopInputFile.fromPath(context.getPath(), new Configuration());
                parquetReaderBuilder = AvroParquetReader.<GenericRecord> builder(file);
                final var parquetOptions = ParquetReadOptions.builder().build();
                parquetFileReader = new ParquetFileReader(file, parquetOptions);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            readFactory = new ReaderFactory();
            readListRegistry = new HashMap<ParquetMeasurementsDao<?,?>, MeasurementsReadList<?,?>>();
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
    }

    @Override
    public Map<String, String> getMetaData() {
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
        final var size = getMetaData().get(dao.getDaoTuple().getValueDao().getFieldName() + ".size");
        final var measureReadList =  new MeasurementsReadList<V, Q>(daoReader, Integer.valueOf(size));
        return measureReadList;
    }

    private <V, Q extends Quantity> ParquetReader<GenericRecord> createParquetReader(final ParquetMeasurementsDao<V, Q> dao) {
        final var conf = new Configuration();
        AvroReadSupport.setRequestedProjection(conf, getProjectionSchema(dao));
        try {
            return parquetReaderBuilder
                    .withConf(conf)
                    .withFilter(getFilter(dao))
                    .build();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
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
