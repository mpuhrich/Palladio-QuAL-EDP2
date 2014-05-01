package org.palladiosimulator.edp2.datastream.edp2source;

import java.util.Collections;
import java.util.Set;

import javax.measure.quantity.Quantity;

import org.palladiosimulator.edp2.datastream.AbstractDataSource;
import org.palladiosimulator.edp2.datastream.IDataSource;
import org.palladiosimulator.edp2.datastream.IDataStream;
import org.palladiosimulator.measurementspec.BasicMeasurement;
import org.palladiosimulator.metricspec.BaseMetricDescription;

public class Edp2BasicDataSource<V,Q extends Quantity> extends AbstractDataSource implements IDataSource {

    public Edp2BasicDataSource(final BaseMetricDescription metricDescription) {
        super(metricDescription);
    }

    @SuppressWarnings("unchecked")
    @Override
    public IDataStream<BasicMeasurement<V,Q>> getDataStream() {
        return new Edp2BasicDataStream<V,Q>(null, (BaseMetricDescription) getMetricDesciption());
    }

    @Override
    public Set<String> getKeys() {
        return Collections.EMPTY_SET;
    }
}
