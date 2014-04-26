package org.palladiosimulator.edp2.datastream;

import org.palladiosimulator.measurementspec.Measurement;
import org.palladiosimulator.metricspec.MetricDescription;
import org.palladiosimulator.metricspec.metricentity.MetricEntity;

public abstract class DataStream<M extends Measurement> extends MetricEntity implements IDataStream<M>{

    public DataStream(final MetricDescription metricSetDescription) {
        super(metricSetDescription);
    }

}
