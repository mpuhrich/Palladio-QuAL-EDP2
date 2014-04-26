package org.palladiosimulator.edp2.datastream.edp2source;

import javax.measure.quantity.Quantity;

import org.palladiosimulator.edp2.datastream.IDataSource;
import org.palladiosimulator.edp2.datastream.IDataStream;
import org.palladiosimulator.measurementspec.BasicMeasurement;
import org.palladiosimulator.metricspec.BaseMetricDescription;
import org.palladiosimulator.metricspec.metricentity.MetricEntity;

public class Edp2BasicDataSource<V,Q extends Quantity> extends MetricEntity implements IDataSource {

    public Edp2BasicDataSource(final BaseMetricDescription metricDescription) {
        super(metricDescription);
    }

    @SuppressWarnings("unchecked")
    @Override
    public IDataStream<BasicMeasurement<V,Q>> getDataStream() {
        return new Edp2BasicDataStream<V,Q>(null, null);
    }


}
