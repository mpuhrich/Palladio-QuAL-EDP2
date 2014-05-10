package org.palladiosimulator.edp2.datastream.edp2source;

import java.util.Collections;
import java.util.Map;
import java.util.Set;

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

    @SuppressWarnings("unchecked")
    @Override
    public <M extends Measurement> IDataStream<M> getDataStream() {
        return (IDataStream<M>) dataStream;
    }

    @Override
    public Set<String> getKeys() {
        return Collections.emptySet();
    }

    @Override
    public Map<? extends String, ? extends Object> getDefaultConfiguration() {
        return Collections.emptyMap();
    }

}
