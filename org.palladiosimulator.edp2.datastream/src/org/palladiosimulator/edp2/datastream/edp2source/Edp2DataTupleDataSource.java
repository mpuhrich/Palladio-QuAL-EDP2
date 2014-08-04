package org.palladiosimulator.edp2.datastream.edp2source;

import org.eclipse.ui.IMemento;
import org.eclipse.ui.IPersistableElement;
import org.palladiosimulator.edp2.datastream.AbstractDataSource;
import org.palladiosimulator.edp2.datastream.IDataSource;
import org.palladiosimulator.edp2.datastream.IDataStream;
import org.palladiosimulator.edp2.datastream.configurable.EmptyConfiguration;
import org.palladiosimulator.edp2.datastream.configurable.PropertyConfigurable;
import org.palladiosimulator.edp2.datastream.elementfactories.Edp2DataTupleDataSourceFactory;
import org.palladiosimulator.edp2.models.ExperimentData.RawMeasurements;
import org.palladiosimulator.edp2.models.measuringpoint.MeasuringPoint;
import org.palladiosimulator.edp2.util.MeasurementsUtility;
import org.palladiosimulator.measurementframework.measureprovider.IMeasureProvider;
import org.palladiosimulator.metricspec.MetricSetDescription;

public class Edp2DataTupleDataSource extends AbstractDataSource implements IDataSource, IPersistableElement {

    private final RawMeasurements rawMeasurements;

    public Edp2DataTupleDataSource(final RawMeasurements measurements) {
        super(MeasurementsUtility.getMetricDescriptionFromRawMeasurements(measurements));
        rawMeasurements = measurements;
    }

    @SuppressWarnings("unchecked")
    @Override
    public <M extends IMeasureProvider> IDataStream<M> getDataStream() {
        return (IDataStream<M>) new Edp2DataTupleStreamForRawMeasurements(rawMeasurements,
                (MetricSetDescription) this.getMetricDesciption());
    }

    @Override
    public void saveState(final IMemento memento) {
        Edp2DataTupleDataSourceFactory.saveState(memento, this);
    }

    @Override
    public String getFactoryId() {
        return Edp2DataTupleDataSourceFactory.FACTORY_ID;
    }

    public RawMeasurements getRawMeasurements() {
        return rawMeasurements;
    }

    @Override
    protected PropertyConfigurable createProperties() {
        return new EmptyConfiguration();
    }

    @Override
    public MeasuringPoint getMeasuringPoint() {
        return MeasurementsUtility.getMeasureFromRawMeasurements(this.rawMeasurements).getMeasuringPoint();
    }
}
