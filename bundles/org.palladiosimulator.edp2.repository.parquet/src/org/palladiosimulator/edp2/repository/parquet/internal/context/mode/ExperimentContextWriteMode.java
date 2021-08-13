package org.palladiosimulator.edp2.repository.parquet.internal.context.mode;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.measure.quantity.Quantity;

import org.apache.avro.generic.GenericRecord;
import org.apache.hadoop.fs.Path;
import org.palladiosimulator.edp2.repository.parquet.dao.ParquetMeasurementsDao;
import org.palladiosimulator.edp2.repository.parquet.internal.ParquetRepositoryConstants;
import org.palladiosimulator.edp2.repository.parquet.internal.backgroundlist.MeasurementsList;
import org.palladiosimulator.edp2.repository.parquet.internal.backgroundlist.MeasurementsWriteList;
import org.palladiosimulator.edp2.repository.parquet.internal.context.ExperimentContext;
import org.palladiosimulator.edp2.repository.parquet.internal.parquet.EDP2ParquetWriter;
import org.palladiosimulator.edp2.repository.parquet.internal.schema.SchemaUtility;
import org.palladiosimulator.edp2.repository.parquet.internal.write.RowWriter;
import org.palladiosimulator.edp2.repository.parquet.internal.write.WriterFactory;

public class ExperimentContextWriteMode extends ExperimentContextMode {

    private Map<ParquetMeasurementsDao<?, ?>, MeasurementsWriteList<?, ?>> writeListRegistry;

    private List<ParquetMeasurementsDao<?, ?>> daosForNextFragment;
    private Map<ParquetMeasurementsDao<?, ?>, EDP2ParquetWriter<GenericRecord>> fragmentParquetWriters;
    private List<RowWriter> fragmentRowWriters;
    private Map<ParquetMeasurementsDao<?, ?>, WriterFactory> fragmentWriterFactories;

    public ExperimentContextWriteMode(final ExperimentContext context) {
        super(context);
        daosForNextFragment = new ArrayList<ParquetMeasurementsDao<?,?>>();
        fragmentParquetWriters = new HashMap<ParquetMeasurementsDao<?,?>, EDP2ParquetWriter<GenericRecord>>();
        fragmentRowWriters = new ArrayList<RowWriter>();
        fragmentWriterFactories = new HashMap<ParquetMeasurementsDao<?,?>, WriterFactory>();
        writeListRegistry = new HashMap<ParquetMeasurementsDao<?,?>, MeasurementsWriteList<?,?>>();
    }

    @Override
    public <V, Q extends Quantity> void open(final ParquetMeasurementsDao<V, Q> dao) {
        if (!fragmentWriterFactories.containsKey(dao.getDaoTuple().getValueDao()) && !daosForNextFragment.contains(dao.getDaoTuple().getValueDao())) {
            daosForNextFragment.add(dao.getDaoTuple().getTimeDao());
            daosForNextFragment.add(dao.getDaoTuple().getValueDao());
        }
    }

    @Override
    public void close() {
        fragmentParquetWriters.values().forEach(pw -> {
            try {
                pw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        fragmentParquetWriters = null;
        fragmentRowWriters = null;
        fragmentWriterFactories = null;
        daosForNextFragment = null;
    }

    public <V, Q extends Quantity> Map<String, String> getMetaData(final ParquetMeasurementsDao<V, Q> dao) {
        return fragmentParquetWriters.get(dao).getExtraMetaData();
    }

    @Override
    public void flush() {
        fragmentRowWriters.forEach(rw -> rw.flush());
        close();
        context.setMode(new ExperimentContextReadMode(context));
        context.open(null);
    }

    /**
     * In write mode the same list object can be requested multiple times.
     */
    @Override
    @SuppressWarnings("unchecked")
    public <V, Q extends Quantity> MeasurementsList<V, Q> getBackgroundList(final ParquetMeasurementsDao<V, Q> dao) {
        if (writeListRegistry.containsKey(dao)) {
            return (MeasurementsWriteList<V, Q>) writeListRegistry.get(dao);
        }
        final var writerFactory = getWriterFactory(dao);
        final var daoWriter = writerFactory.createDaoWriter(dao);
        final var writeList = new MeasurementsWriteList<V, Q>(daoWriter);
        writeListRegistry.put(dao, writeList);
        return writeList;
    }

    private <V, Q extends Quantity> WriterFactory getWriterFactory(final ParquetMeasurementsDao<V, Q> dao) {
        if (daosForNextFragment.contains(dao)) {
            initializeNewFragments();
        }
        return fragmentWriterFactories.get(dao);
    }

    private void initializeNewFragments() {
        final var schema = SchemaUtility.createSchemaFromParquetMeasurementsDaos(daosForNextFragment);
        final EDP2ParquetWriter<GenericRecord> writer;
        try {
            var fileName = context.getExperimentId()
                    + ParquetRepositoryConstants.PARQUET_FILE_FRAGMENT_NAME
                    + fragmentRowWriters.size()
                    + "." + ParquetRepositoryConstants.PARQUET_FILE_SUFFIX;
            var path = new Path(context.getBasePath(), fileName);
            writer = (EDP2ParquetWriter<GenericRecord>) EDP2ParquetWriter.<GenericRecord>builder(path)
                    .withSchema(schema)
                    .build();
            daosForNextFragment.forEach(dao -> fragmentParquetWriters.put(dao, writer));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        final var rowWriter = new RowWriter(writer, schema);
        fragmentRowWriters.add(rowWriter);
        final var writerFactory = new WriterFactory(rowWriter);
        daosForNextFragment.forEach(dao -> fragmentWriterFactories.put(dao, writerFactory));
        daosForNextFragment.clear();
    }

}
