package org.palladiosimulator.edp2.datastream;

import java.util.Iterator;

import javax.measure.Measure;
import javax.measure.quantity.Quantity;

import org.palladiosimulator.edp2.models.ExperimentData.BaseMetricDescription;

public abstract class BasicDataStream<V,Q extends Quantity> extends DataStream<Measure<V,Q>> {

    public BasicDataStream(final BaseMetricDescription metricDescription) {
        super(metricDescription);
    }

    @Override
    public abstract Iterator<Measure<V, Q>> iterator();

}
