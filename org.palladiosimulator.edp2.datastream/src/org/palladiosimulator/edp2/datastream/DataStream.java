package org.palladiosimulator.edp2.datastream;

import org.palladiosimulator.edp2.metricentity.MetricEntity;
import org.palladiosimulator.edp2.models.ExperimentData.MetricDescription;

public abstract class DataStream<M> extends MetricEntity implements IDataStream<M>{

    public DataStream(final MetricDescription metricSetDescription) {
        super(metricSetDescription);
    }

}
