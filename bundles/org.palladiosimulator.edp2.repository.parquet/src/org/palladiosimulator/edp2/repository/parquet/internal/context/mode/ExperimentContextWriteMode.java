package org.palladiosimulator.edp2.repository.parquet.internal.context.mode;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import javax.measure.quantity.Quantity;

import org.apache.avro.Schema;
import org.apache.avro.generic.GenericRecord;
import org.palladiosimulator.edp2.repository.parquet.dao.ParquetMeasurementsDao;
import org.palladiosimulator.edp2.repository.parquet.internal.backgroundlist.MeasurementsList;
import org.palladiosimulator.edp2.repository.parquet.internal.backgroundlist.MeasurementsWriteList;
import org.palladiosimulator.edp2.repository.parquet.internal.context.ExperimentContext;
import org.palladiosimulator.edp2.repository.parquet.internal.parquet.EDP2ParquetWriter;
import org.palladiosimulator.edp2.repository.parquet.internal.write.RowWriter;
import org.palladiosimulator.edp2.repository.parquet.internal.write.WriterFactory;

public class ExperimentContextWriteMode extends ExperimentContextMode {

    private Schema schema;
    private EDP2ParquetWriter<GenericRecord> parquetWriter;
    private RowWriter rowWriter;
    private Map<ParquetMeasurementsDao<?, ?>, MeasurementsWriteList<?, ?>> writeListRegistry;
    private WriterFactory writerFactory;

    public ExperimentContextWriteMode(final ExperimentContext context) {
        super(context);
    }

    @Override
    public void open() {
        if (Objects.isNull(parquetWriter)) {
            try {
                parquetWriter = (EDP2ParquetWriter<GenericRecord>) EDP2ParquetWriter.<GenericRecord>builder(context.getPath())
                        .withSchema(schema)
                        .build();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            rowWriter = new RowWriter(parquetWriter, schema);
            writeListRegistry = new HashMap<ParquetMeasurementsDao<?,?>, MeasurementsWriteList<?,?>>();
            writerFactory = new WriterFactory(rowWriter);
        }
    }

    @Override
    public void close() {
        if (Objects.nonNull(parquetWriter)) {
            try {
                parquetWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            parquetWriter = null;
            writeListRegistry = null;
            writerFactory = null;
        }
    }

    public Map<String, String> getMetaData() {
        return parquetWriter.getExtraMetaData();
    }

    @Override
    public void flush() {
        rowWriter.flush();
        close();
        context.setMode(new ExperimentContextReadMode(context));
        context.open();
    }

    public Schema getSchema() {
        return schema;
    }

    public void setSchema(final Schema schema) {
        this.schema = schema;
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
        final var daoWriter = writerFactory.createDaoWriter(dao);
        final var writeList = new MeasurementsWriteList<V, Q>(daoWriter);
        writeListRegistry.put(dao, writeList);
        return writeList;
    }

}
