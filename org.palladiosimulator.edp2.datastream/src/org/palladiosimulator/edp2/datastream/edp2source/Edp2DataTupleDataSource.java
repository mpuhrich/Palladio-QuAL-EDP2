package org.palladiosimulator.edp2.datastream.edp2source;

import org.palladiosimulator.edp2.datastream.IDataSource;
import org.palladiosimulator.edp2.datastream.IDataStream;
import org.palladiosimulator.edp2.metricentity.MetricEntity;
import org.palladiosimulator.edp2.models.ExperimentData.MetricSetDescription;
import org.palladiosimulator.edp2.models.ExperimentData.RawMeasurements;

public class Edp2DataTupleDataSource extends MetricEntity implements IDataSource {

    private final Edp2DataTupleStreamForRawMeasurements dataStream;

    public Edp2DataTupleDataSource(final RawMeasurements measurements, final MetricSetDescription metricDesciption) {
        super(metricDesciption);
        this.dataStream = new Edp2DataTupleStreamForRawMeasurements(measurements, metricDesciption);
    }

    @Override
    public <M> IDataStream<M> getDataStream() {
        return (IDataStream<M>) dataStream;
    }

}
