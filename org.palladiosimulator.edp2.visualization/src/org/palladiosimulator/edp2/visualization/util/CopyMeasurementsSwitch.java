package org.palladiosimulator.edp2.visualization.util;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.measure.Measure;
import javax.measure.quantity.Dimensionless;
import javax.measure.quantity.Quantity;

import org.palladiosimulator.edp2.NominalMeasurementsDao;
import org.palladiosimulator.edp2.OrdinalMeasurementsDao;
import org.palladiosimulator.edp2.impl.IdentifierMeasure;
import org.palladiosimulator.edp2.impl.Measurement;
import org.palladiosimulator.edp2.impl.MeasurementsUtility;
import org.palladiosimulator.edp2.models.ExperimentData.BaseMetricDescription;
import org.palladiosimulator.edp2.models.ExperimentData.NumericalBaseMetricDescription;
import org.palladiosimulator.edp2.models.ExperimentData.ObservedIdentifier;
import org.palladiosimulator.edp2.models.ExperimentData.ObservedIdentifierBasedMeasurements;
import org.palladiosimulator.edp2.models.ExperimentData.RawMeasurements;
import org.palladiosimulator.edp2.models.ExperimentData.TextualBaseMetricDescription;
import org.palladiosimulator.edp2.models.ExperimentData.util.ExperimentDataSwitch;

/**
 * Class for copying single values of data contained in {@link RawMeasurements}.
 * Works for data described by:
 * <ul>
 * <li>{@link NumericalBaseMetricDescription}</li>
 * <li>{@link TextualBaseMetricDescription}</li>
 * </ul>
 * @author Dominik Ernst
 *
 */
public class CopyMeasurementsSwitch extends ExperimentDataSwitch<Boolean> {

    /**
     * Logger for this class
     */
    private final static Logger logger = Logger
            .getLogger(CopyMeasurementsSwitch.class.getSimpleName());

    /**
     * The {@link RawMeasurements} containing the original data, which are to be copied.
     */
    private final RawMeasurements rawMeasurementsToCopy;
    /**
     * The index of the item in the data series to be copied.
     */
    private final int index;
    /**
     * The dimension, i.e. the index of the data series to be copied.
     */
    private final int dimension;
    /**
     * The {@link Measurement} to which the value is copied.
     */
    private final Measurement measurement;

    public CopyMeasurementsSwitch(final RawMeasurements rawMeasurementsToCopy,
            final int index, final int dimension, final Measurement measurement) {
        this.rawMeasurementsToCopy = rawMeasurementsToCopy;
        this.index = index;
        this.dimension = dimension;
        this.measurement = measurement;
    }

    /*
     * (non-Javadoc)
     * @see org.palladiosimulator.edp2.models.ExperimentData.util.ExperimentDataSwitch#caseNumericalBaseMetricDescription(org.palladiosimulator.edp2.models.ExperimentData.NumericalBaseMetricDescription)
     */
    @Override
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public Boolean caseNumericalBaseMetricDescription(
            final NumericalBaseMetricDescription object) {
        final OrdinalMeasurementsDao<?,? extends Quantity> dao = MeasurementsUtility
                .getOrdinalMeasurementsDao(rawMeasurementsToCopy
                        .getDataSeries().get(dimension));
        final List<?> measures = dao.getMeasurements();
        final Measure measure = (Measure) measures.get(index);
        measurement.setMeasuredValue(dimension, measure);
        return true;
    }

    /*
     * (non-Javadoc)
     * @see org.palladiosimulator.edp2.models.ExperimentData.util.ExperimentDataSwitch#caseTextualBaseMetricDescription(org.palladiosimulator.edp2.models.ExperimentData.TextualBaseMetricDescription)
     */
    @Override
    public Boolean caseTextualBaseMetricDescription(
            final TextualBaseMetricDescription object) {
        final NominalMeasurementsDao dao = MeasurementsUtility
                .getNominalMeasurementsDao(rawMeasurementsToCopy
                        .getDataSeries().get(dimension));
        final ObservedIdentifierBasedMeasurements mms = dao
                .getObservedIdentifierBasedMeasurements();
        final List<ObservedIdentifier> obsId = mms.getObservedIdentifiers();
        measurement.setMeasuredValue(dimension, IdentifierMeasure.valueOf(obsId.get(index)
                .getIdentifier(),Dimensionless.UNIT));
        return true;
    }

    /*
     * (non-Javadoc)
     * @see org.palladiosimulator.edp2.models.ExperimentData.util.ExperimentDataSwitch#caseBaseMetricDescription(org.palladiosimulator.edp2.models.ExperimentData.BaseMetricDescription)
     */
    @Override
    public Boolean caseBaseMetricDescription(final BaseMetricDescription object) {
        logger.log(
                Level.SEVERE,
                "Unsupported Base Metric: the selected measurements could not be opened, because it is neither described by a TextualBaseMetricDescription nor a NumericalBaseMetricDescription.");
        throw new RuntimeException("Unsupported Base Metric.");
    }

}
