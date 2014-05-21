package org.palladiosimulator.edp2.datastream;

import org.palladiosimulator.measurementframework.measureprovider.IMeasureProvider;
import org.palladiosimulator.metricspec.metricentity.IMetricEntity;

public interface IDataStream<M extends IMeasureProvider> extends Iterable<M>, IMetricEntity {
    public void close();

    public int size();
}
