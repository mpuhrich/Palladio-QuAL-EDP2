package org.palladiosimulator.edp2.repository.parquet.internal.read;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import javax.measure.quantity.Quantity;

import org.apache.avro.generic.GenericRecord;
import org.apache.parquet.hadoop.ParquetReader;
import org.palladiosimulator.edp2.repository.parquet.dao.ParquetMeasurementsDao;
import org.palladiosimulator.edp2.repository.parquet.dao.ParquetMeasurementsDaoTuple;
import org.palladiosimulator.edp2.repository.parquet.internal.read.measure.DoubleMeasureFactory;
import org.palladiosimulator.edp2.repository.parquet.internal.read.measure.LongMeasureFactory;
import org.palladiosimulator.edp2.repository.parquet.internal.read.measure.MeasureFactory;
import org.palladiosimulator.edp2.repository.parquet.internal.schema.SchemaUtility;

public class ReaderFactory {

    /**
     * Registry to temporarily store the {@link TupleReader} so that two {@link ParquetMeasurementsDao} objects can share the parquet reader.
     */
    private Map<ParquetMeasurementsDaoTuple, TupleReader> tupleReaderRegistry = new HashMap<ParquetMeasurementsDaoTuple, TupleReader>();

    public <V, Q extends Quantity> DaoReader<V, Q> createDaoReader(final ParquetReader<GenericRecord> parquetReader,
            final ParquetMeasurementsDao<V, Q> dao) {
        final var tupleReader = getTupleReader(parquetReader, dao);
        final var measureReader = createMeasureReader(tupleReader, dao);
        final var measureFactory = createMeasureFactory(dao);
        final var daoReader = new DaoReader<V, Q>(measureReader, measureFactory, dao.getUnit());
        return daoReader;
    }

    private <V, Q extends Quantity> TupleReader getTupleReader(final ParquetReader<GenericRecord> parquetReader,
            final ParquetMeasurementsDao<V, Q> dao) {
        var tupleReader = tupleReaderRegistry.remove(dao.getDaoTuple());
        if (Objects.nonNull(tupleReader) && !tupleReader.isUsed() && !tupleReader.isClosed()) {
            return tupleReader;
        }
        tupleReader = createTupleReader(parquetReader, dao);
        tupleReaderRegistry.put(dao.getDaoTuple(), tupleReader);
        return tupleReader;
    }

    private <V, Q extends Quantity> TupleReader createTupleReader(final ParquetReader<GenericRecord> parquetReader,
            final ParquetMeasurementsDao<V, Q> dao) {
        final var timeFieldName = dao.getDaoTuple().getTimeDao().getFieldName();
        final var valueFieldName = dao.getDaoTuple().getValueDao().getFieldName();
        return new TupleReader(parquetReader, timeFieldName, valueFieldName);
    }

    private <V, Q extends Quantity> MeasureReader<V> createMeasureReader(final TupleReader tupleReader,
            final ParquetMeasurementsDao<V, Q> dao) {
        final MeasureReader<V> measureReader;
        if (dao.isTimeDao()) {
            measureReader = new TimeReader<V>(tupleReader);
        } else {
            measureReader = new ValueReader<V>(tupleReader);
        }
        return measureReader;
    }

    private <V, Q extends Quantity> MeasureFactory createMeasureFactory(ParquetMeasurementsDao<V, Q> dao) {
        switch (SchemaUtility.getTypeFromSchema(dao.getFieldType())) {
            case DOUBLE:
                return new DoubleMeasureFactory();
            case LONG:
                return new LongMeasureFactory();
            default:
                throw new RuntimeException();
        }
    }

}
