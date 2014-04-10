package org.palladiosimulator.edp2.datastream.edp2source;

import java.util.ArrayList;
import java.util.List;

import org.palladiosimulator.edp2.datastream.BasicDataStream;
import org.palladiosimulator.edp2.datastream.DataTupleStream;
import org.palladiosimulator.edp2.models.ExperimentData.BaseMetricDescription;
import org.palladiosimulator.edp2.models.ExperimentData.MetricSetDescription;
import org.palladiosimulator.edp2.models.ExperimentData.RawMeasurements;

public class Edp2DataTupleStreamForRawMeasurements extends DataTupleStream {

    public Edp2DataTupleStreamForRawMeasurements(
            final RawMeasurements measurements,
            final MetricSetDescription metricSetDescription) {
        super(getChildDataStreams(measurements, metricSetDescription), metricSetDescription);
    }

    private static List<BasicDataStream<?, ?>> getChildDataStreams(final RawMeasurements measurements, final MetricSetDescription metricSetDescription) {
        final List<BasicDataStream<?,?>> result = new ArrayList<BasicDataStream<?,?>>(measurements.getDataSeries().size());
        for (int i = 0; i < measurements.getDataSeries().size(); i++) {
            result.add(new Edp2BasicDataStream(measurements.getDataSeries().get(i), (BaseMetricDescription) metricSetDescription.getSubsumedMetrics().get(i)));
        }
        return result;
    }

}
