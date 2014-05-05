package org.palladiosimulator.edp2.visualization.util;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.measure.quantity.Quantity;

import org.palladiosimulator.edp2.MeasurementsDao;
import org.palladiosimulator.edp2.impl.MeasurementsUtility;
import org.palladiosimulator.edp2.models.ExperimentData.DataSeries;
import org.palladiosimulator.edp2.models.ExperimentData.RawMeasurements;
import org.palladiosimulator.metricspec.BaseMetricDescription;
import org.palladiosimulator.metricspec.NumericalBaseMetricDescription;
import org.palladiosimulator.metricspec.TextualBaseMetricDescription;
import org.palladiosimulator.metricspec.util.MetricSpecSwitch;

/**
 * Switch to retrieve the number of measurements contained in a
 * {@link RawMeasurements}-instance. It assumes that there exists at least one
 * {@link DataSeries} in the {@link RawMeasurements}.
 * 
 * @author Dominik Ernst
 * 
 */
public class NumberOfMeasurementsSwitch extends MetricSpecSwitch<Integer> {

    /**
     * Logger for this class.
     */
    private final static Logger logger = Logger
            .getLogger(NumberOfMeasurementsSwitch.class.getSimpleName());

    private final RawMeasurements rawMeasurements;

    public NumberOfMeasurementsSwitch(final RawMeasurements rawMeasurements) {
        this.rawMeasurements = rawMeasurements;
    }

    @Override
    public Integer caseNumericalBaseMetricDescription(
            final NumericalBaseMetricDescription object) {
        final MeasurementsDao<?,? extends Quantity> dao = MeasurementsUtility
                .getMeasurementsDao(rawMeasurements.getDataSeries().get(
                        0));
        final List<?> measures = dao.getMeasurements();
        return measures.size();
    }

    @Override
    public Integer caseTextualBaseMetricDescription(
            final TextualBaseMetricDescription object) {
        final MeasurementsDao<?,? extends Quantity> dao = MeasurementsUtility
                .getMeasurementsDao(rawMeasurements.getDataSeries().get(
                        0));
        final List<?> measures = dao.getMeasurements();
        return measures.size();
    }

    @Override
    public Integer caseBaseMetricDescription(final BaseMetricDescription object) {
        logger.log(
                Level.SEVERE,
                "Unsupported Base Metric: the selected measurements could not be opened, because it is neither described by a TextualBaseMetricDescription nor a NumericalBaseMetricDescription.");
        throw new RuntimeException("Unsupported Base Metric.");
    }
}
