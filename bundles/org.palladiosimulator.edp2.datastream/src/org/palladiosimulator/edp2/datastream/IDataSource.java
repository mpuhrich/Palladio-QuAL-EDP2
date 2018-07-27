package org.palladiosimulator.edp2.datastream;

import org.palladiosimulator.commons.designpatterns.IAbstractObservable;
import org.palladiosimulator.edp2.datastream.configurable.IPropertyConfigurable;
import org.palladiosimulator.edp2.models.measuringpoint.MeasuringPoint;
import org.palladiosimulator.measurementframework.measureprovider.IMeasureProvider;
import org.palladiosimulator.metricspec.metricentity.IMetricEntity;

public interface IDataSource extends IMetricEntity, IAbstractObservable<IDataSourceListener> {
    public <M extends IMeasureProvider> IDataStream<M> getDataStream();

    public <G extends IPropertyConfigurable> G getConfiguration();

    public MeasuringPoint getMeasuringPoint();
}
