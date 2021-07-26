package org.palladiosimulator.edp2.repository.parquet.internal.read.measure;

import javax.measure.Measure;
import javax.measure.quantity.Quantity;
import javax.measure.unit.Unit;

/**
 * Factory for creating {@link Measure} objects that have the same background data type.
 */
public interface MeasureFactory {

    public <V, Q extends Quantity> Measure<V, Q> createMeasure(final V value, final Unit<Q> unit);

}
