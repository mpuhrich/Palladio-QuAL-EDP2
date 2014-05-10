package org.palladiosimulator.edp2.datastream;

import org.palladiosimulator.measurementspec.Measurement;
import org.palladiosimulator.metricspec.metricentity.IMetricEntity;

public interface IDataStream<M extends Measurement> extends Iterable<M>, IMetricEntity {
    public void close();

    public int size();
}
