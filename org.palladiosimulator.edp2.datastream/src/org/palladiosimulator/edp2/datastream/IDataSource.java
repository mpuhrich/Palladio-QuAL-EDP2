package org.palladiosimulator.edp2.datastream;

import org.palladiosimulator.commons.designpatterns.IAbstractObservable;
import org.palladiosimulator.edp2.datastream.configurable.IPropertyConfigurable;
import org.palladiosimulator.measurementspec.Measurement;
import org.palladiosimulator.metricspec.metricentity.IMetricEntity;

public interface IDataSource
extends IMetricEntity, IAbstractObservable<IDataSourceListener> {
    public <M extends Measurement> IDataStream<M> getDataStream();
    public <G extends IPropertyConfigurable> G getConfiguration();
}
