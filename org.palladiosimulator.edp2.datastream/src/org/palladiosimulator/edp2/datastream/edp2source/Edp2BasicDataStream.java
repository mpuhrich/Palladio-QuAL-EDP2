package org.palladiosimulator.edp2.datastream.edp2source;

import java.util.Iterator;

import javax.measure.Measure;
import javax.measure.quantity.Quantity;

import org.palladiosimulator.edp2.MeasurementsDao;
import org.palladiosimulator.edp2.datastream.BasicDataStream;
import org.palladiosimulator.edp2.impl.MeasurementsUtility;
import org.palladiosimulator.edp2.models.ExperimentData.BaseMetricDescription;
import org.palladiosimulator.edp2.models.ExperimentData.DataSeries;

public class Edp2BasicDataStream<V,Q extends Quantity> extends BasicDataStream<V,Q> {

    private final DataSeries dataSeries;
    private final MeasurementsDao<V, Q> measurementsDao;

    @SuppressWarnings("unchecked")
    public Edp2BasicDataStream(final DataSeries dataSeries, final BaseMetricDescription metricDescription) {
        super(metricDescription);
        this.dataSeries = dataSeries;
        measurementsDao = (MeasurementsDao<V, Q>) MeasurementsUtility.getMeasurementsDao(this.dataSeries);
    }

    @Override
    public Iterator<Measure<V, Q>> iterator() {
        return measurementsDao.getMeasurements().iterator();
    }

}
