package org.palladiosimulator.edp2.repository.parquet.internal.write;

import java.util.Objects;

import javax.measure.Measure;
import javax.measure.quantity.Quantity;

import org.palladiosimulator.edp2.repository.parquet.dao.ParquetMeasurementsDao;

/**
 * Entry point to write the measurements of a {@link ParquetMeasurementsDao} object in a parquet file.
 */
public class DaoWriter<V, Q extends Quantity> {

    private MeasureWriter<V> measureWriter;

    public DaoWriter(final MeasureWriter<V> measureWriter) {
        this.measureWriter = Objects.requireNonNull(measureWriter);
    }

    public void write(final Measure<V, Q> measure) {
        measureWriter.write(measure.getValue());
    }

}
