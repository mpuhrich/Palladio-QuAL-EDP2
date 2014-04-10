package org.palladiosimulator.edp2.datastream.edp2source;

import org.palladiosimulator.edp2.datastream.IDataSource;
import org.palladiosimulator.edp2.datastream.IDataStream;
import org.palladiosimulator.edp2.impl.MeasurementsUtility;
import org.palladiosimulator.edp2.metricentity.MetricEntity;
import org.palladiosimulator.edp2.models.ExperimentData.MetricSetDescription;
import org.palladiosimulator.edp2.models.ExperimentData.RawMeasurements;

public class Edp2DataTupleDataSource extends MetricEntity implements IDataSource {

    private final Edp2DataTupleStreamForRawMeasurements dataStream;

    public Edp2DataTupleDataSource(final RawMeasurements measurements) {
        super(MeasurementsUtility.getMetricDescriptionFromRawMeasurements(measurements));
        this.dataStream = new Edp2DataTupleStreamForRawMeasurements(measurements, (MetricSetDescription) this.getMetricDesciption());
    }

    @Override
    public <M> IDataStream<M> getDataStream() {
        return (IDataStream<M>) dataStream;
    }

}
