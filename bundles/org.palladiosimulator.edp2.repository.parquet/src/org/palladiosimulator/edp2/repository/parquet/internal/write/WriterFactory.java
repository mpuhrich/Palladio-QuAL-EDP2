package org.palladiosimulator.edp2.repository.parquet.internal.write;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import javax.measure.quantity.Quantity;

import org.palladiosimulator.edp2.repository.parquet.dao.ParquetMeasurementsDao;
import org.palladiosimulator.edp2.repository.parquet.dao.ParquetMeasurementsDaoTuple;

/**
 * WriterFactory to create {@link DaoWriter} objects which are bound to a specific {@link RowWriter}.
 */
public class WriterFactory {

    private RowWriter rowWriter;
    private Map<ParquetMeasurementsDaoTuple, TupleWriter> tupleWriterRegistry;

    public WriterFactory(final RowWriter rowWriter) {
        this.rowWriter = Objects.requireNonNull(rowWriter);
        this.tupleWriterRegistry = new HashMap<ParquetMeasurementsDaoTuple, TupleWriter>();
    }

    public <V, Q extends Quantity> DaoWriter<V, Q> createDaoWriter(final ParquetMeasurementsDao<V, Q> dao) {
        final var tupleWriter = createTupleWriter(dao);
        final var measureWriter = createMeasureWriter(tupleWriter, dao);
        final var daoWriter = new DaoWriter<V, Q>(measureWriter);
        return daoWriter;
    }

    private <V, Q extends Quantity> TupleWriter createTupleWriter(final ParquetMeasurementsDao<V, Q> dao) {
        TupleWriter tupleWriter = tupleWriterRegistry.remove(dao.getDaoTuple());
        if (tupleWriter == null) {
            tupleWriter = new TupleWriter(rowWriter);
            tupleWriterRegistry.put(dao.getDaoTuple(), tupleWriter);
        }
        return tupleWriter;
    }

    private <V, Q extends Quantity> MeasureWriter<V> createMeasureWriter(final TupleWriter tupleWriter, final ParquetMeasurementsDao<V, Q> dao) {
        MeasureWriter<V> measureWriter;
        if (dao.isTimeDao()) {
            tupleWriter.setTimeFieldName(dao.getFieldName());
            measureWriter = new TimeWriter<V>(tupleWriter);
        } else {
            tupleWriter.setValueFieldName(dao.getFieldName());
            measureWriter = new ValueWriter<V>(tupleWriter);
        }
        return measureWriter;
    }

}
