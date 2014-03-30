package org.palladiosimulator.edp2.datastream.edp2source;

import java.util.Iterator;

import javax.measure.Measure;
import javax.measure.quantity.Quantity;

import org.palladiosimulator.edp2.datastream.BasicDataStream;
import org.palladiosimulator.edp2.models.ExperimentData.BaseMetricDescription;
import org.palladiosimulator.edp2.models.ExperimentData.DataSeries;

public class Edp2BasicDataStream<V,Q extends Quantity> extends BasicDataStream<V,Q> {

    final DataSeries dataSeries;

    public Edp2BasicDataStream(final DataSeries dataSeries, final BaseMetricDescription metricDescription) {
        super(metricDescription);
        this.dataSeries = dataSeries;
        // MeasurementsUtility.
    }

    @Override
    public Iterator<Measure<V, Q>> iterator() {
        return null;
    }

}
