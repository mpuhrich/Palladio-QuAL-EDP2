package org.palladiosimulator.edp2.datastream.edp2source;

import org.palladiosimulator.edp2.datastream.AbstractDataSource;
import org.palladiosimulator.edp2.datastream.IDataSource;
import org.palladiosimulator.edp2.datastream.IDataStream;
import org.palladiosimulator.edp2.impl.MeasurementsUtility;
import org.palladiosimulator.edp2.models.ExperimentData.RawMeasurements;
import org.palladiosimulator.measurementspec.Measurement;
import org.palladiosimulator.metricspec.MetricSetDescription;

public class Edp2DataTupleDataSource extends AbstractDataSource implements IDataSource {

    private final Edp2DataTupleStreamForRawMeasurements dataStream;

    public Edp2DataTupleDataSource(final RawMeasurements measurements) {
        super(MeasurementsUtility.getMetricDescriptionFromRawMeasurements(measurements));
        this.dataStream = new Edp2DataTupleStreamForRawMeasurements(measurements, (MetricSetDescription) this.getMetricDesciption());
    }

    @Override
    public <M extends Measurement> IDataStream<M> getDataStream() {
        return (IDataStream<M>) dataStream;
    }

    @Override
    public String[] getKeys() {
        return new String[] {};
    }

}
