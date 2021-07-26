package org.palladiosimulator.edp2.repository.parquet.internal.read;

import java.util.Objects;

import javax.measure.Measure;
import javax.measure.quantity.Quantity;
import javax.measure.unit.Unit;

import org.palladiosimulator.edp2.repository.parquet.dao.ParquetMeasurementsDao;
import org.palladiosimulator.edp2.repository.parquet.internal.read.measure.MeasureFactory;

/**
 * Entry point to read the measurements of a {@link ParquetMeasurementsDao} object from a parquet file.
 */
public class DaoReader<V, Q extends Quantity> {

    private MeasureReader<V> measureReader;
    private MeasureFactory measureFactory;
    private Unit<Q> unit;

    public DaoReader(final MeasureReader<V> measureReader, final MeasureFactory measureFactory, final Unit<Q> unit) {
        this.measureReader = Objects.requireNonNull(measureReader);
        this.measureFactory = Objects.requireNonNull(measureFactory);
        this.unit = Objects.requireNonNull(unit);
    }

    public Measure<V, Q> read() {
        return measureFactory.createMeasure(measureReader.read(), unit);
    }

    public void close() {
        measureReader.close();
    }

    public boolean isUsed() {
        return measureReader.isUsed();
    }

}
