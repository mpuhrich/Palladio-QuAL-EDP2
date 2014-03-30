package org.palladiosimulator.edp2.datastream;

import org.palladiosimulator.edp2.metricentity.IMetricEntity;

public interface IDataSource extends IMetricEntity {
    public <M> IDataStream<M> getDataStream();
}
