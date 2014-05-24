/**
 * 
 */
package org.palladiosimulator.edp2.util.visitors;

import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataFactory;
import org.palladiosimulator.edp2.models.ExperimentData.RawMeasurements;
import org.palladiosimulator.metricspec.BaseMetricDescription;
import org.palladiosimulator.metricspec.CaptureType;
import org.palladiosimulator.metricspec.MetricDescription;
import org.palladiosimulator.metricspec.MetricSetDescription;
import org.palladiosimulator.metricspec.NumericalBaseMetricDescription;
import org.palladiosimulator.metricspec.PersistenceKindOptions;
import org.palladiosimulator.metricspec.util.MetricSpecSwitch;

/**EMF switch to create data series based on RawMeasurements.
 * @author groenda
 */
public class DataSeriesFromRawMeasurementsSwitch extends MetricSpecSwitch<Boolean> {
    /** Logger for this class. */
    private static final Logger logger = Logger
            .getLogger(DataSeriesFromRawMeasurementsSwitch.class.getCanonicalName());
    /** Factory for EMF model. */
    private static final ExperimentDataFactory factory = ExperimentDataFactory.eINSTANCE;

    /** RawMeasurement on which the DataSeries should be added. */
    private final RawMeasurements rm;

    /**
     * @param rm
     */
    public DataSeriesFromRawMeasurementsSwitch(final RawMeasurements rm) {
        super();
        this.rm = rm;
    }

    @Override
    public Boolean caseMetricSetDescription(final MetricSetDescription object) {
        final Iterator<MetricDescription> iter = object.getSubsumedMetrics().iterator();
        boolean success = true;
        while (iter.hasNext()) {
            success &= doSwitch(iter.next());
        }
        return success;
    }

    @Override
    public Boolean caseBaseMetricDescription(final BaseMetricDescription bmd) {
        final String valuesUuid = EcoreUtil.generateUUID();
        if (bmd.getCaptureType() == CaptureType.IDENTIFIER) {
            factory.createIdentifierBasedMeasurements(rm, valuesUuid);
        } else if (bmd.getCaptureType() == CaptureType.INTEGER_NUMBER) {
            final NumericalBaseMetricDescription nmbd = (NumericalBaseMetricDescription) bmd;
            if (nmbd.getPersistenceKind() == PersistenceKindOptions.BINARY_PREFERRED) {
                factory.createLongBinaryMeasurements(rm, valuesUuid, nmbd.getDefaultUnit());
            } else if (nmbd.getPersistenceKind() == PersistenceKindOptions.JS_XML_PREFERRED) {
                factory.createJSXmlMeasurements(rm, valuesUuid);
            } else {
                final String msg = "PersistenceKindOption of measure not known.";
                logger.log(Level.SEVERE, msg);
                throw new IllegalArgumentException(msg);
            }
        } else if (bmd.getCaptureType() == CaptureType.REAL_NUMBER) {
            final NumericalBaseMetricDescription nmbd = (NumericalBaseMetricDescription) bmd;
            if (nmbd.getPersistenceKind() == PersistenceKindOptions.BINARY_PREFERRED) {
                factory.createDoubleBinaryMeasurements(rm, valuesUuid, nmbd.getDefaultUnit());
            } else if (nmbd.getPersistenceKind() == PersistenceKindOptions.JS_XML_PREFERRED) {
                factory.createJSXmlMeasurements(rm, valuesUuid);
            } else {
                final String msg = "PersistenceKindOption of measure not known.";
                logger.log(Level.SEVERE, msg);
                throw new IllegalArgumentException(msg);
            }
        } else {
            final String msg = "CaptureType of measure not known.";
            logger.log(Level.SEVERE, msg);
            throw new IllegalArgumentException(msg);
        }
        return true;
    }
}
