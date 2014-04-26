package org.palladiosimulator.edp2.datastream;

import org.palladiosimulator.measurementspec.Measurement;
import org.palladiosimulator.metricspec.metricentity.IMetricEntity;

public interface IDataSource extends IMetricEntity {
    public <M extends Measurement> IDataStream<M> getDataStream();
}
