package org.palladiosimulator.edp2.repository.parquet.internal.read.measure;

import javax.measure.Measure;
import javax.measure.quantity.Quantity;
import javax.measure.unit.Unit;

/**
 * Factory for creating {@link Measure} objects that use {@link Long} as background data type.
 */
public class LongMeasureFactory implements MeasureFactory {

    @Override
    @SuppressWarnings("unchecked")
    public <V, Q extends Quantity> Measure<V, Q> createMeasure(final V value, final Unit<Q> unit) {
        return (Measure<V, Q>) Measure.valueOf((Long) value, unit);
    }

}
