/**
 * 
 */
package org.palladiosimulator.edp2.internal;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.measure.quantity.Quantity;

import org.palladiosimulator.edp2.MeasurementsDaoRegistry;
import org.palladiosimulator.edp2.NominalMeasurementsDao;
import org.palladiosimulator.edp2.impl.BinaryMeasurementsDao;
import org.palladiosimulator.edp2.impl.DataNotAccessibleException;
import org.palladiosimulator.edp2.impl.IdentifierMeasure;
import org.palladiosimulator.edp2.models.ExperimentData.DoubleBinaryMeasurements;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataFactory;
import org.palladiosimulator.edp2.models.ExperimentData.JSXmlMeasurements;
import org.palladiosimulator.edp2.models.ExperimentData.LongBinaryMeasurements;
import org.palladiosimulator.edp2.models.ExperimentData.ObservedIdentifier;
import org.palladiosimulator.edp2.models.ExperimentData.util.ExperimentDataSwitch;

/**Switch class to add a provided measurement to a data series.
 * @author groenda
 */
public class EmfmodelAddMeasurementToDataSeriesSwitch extends ExperimentDataSwitch<Boolean> {
    /** Logger for this class. */
    private static final Logger logger = Logger.getLogger(EmfmodelAddMeasurementToDataSeriesSwitch.class.getCanonicalName());
    /** Factory of EDP2 EMF model. */
    private static final ExperimentDataFactory factory = ExperimentDataFactory.eINSTANCE;
    /** Registry for the DAOs. */
    private final MeasurementsDaoRegistry daoRegistry;
    /** Measurement to add. */
    private Object measurementToAdd;

    public EmfmodelAddMeasurementToDataSeriesSwitch(final MeasurementsDaoRegistry daoRegistry) {
        this.daoRegistry = daoRegistry;
    }

    @Override
    public Boolean caseIdentifierBasedMeasurements(final org.palladiosimulator.edp2.models.ExperimentData.IdentifierBasedMeasurements object) {
        final NominalMeasurementsDao dao = (NominalMeasurementsDao) daoRegistry.getMeasurementsDao(object.getValuesUuid());
        if (!dao.isOpen()) {
            try {
                dao.open();
            } catch (final DataNotAccessibleException e) {
                logger.log(Level.SEVERE, "Could not access DAO with valuesUuid=" + object.getValuesUuid());
                return false;
            }
        }
        final ObservedIdentifier observedIdentifier = factory.createObservedIdentifier(dao.getObservedIdentifierBasedMeasurements(), ((IdentifierMeasure<?>) measurementToAdd).getValue());
        if (observedIdentifier != null) {
            dao.getObservedIdentifierBasedMeasurements().getObservedIdentifiers().add(observedIdentifier);
        }
        return observedIdentifier != null;
    }

    @Override
    public Boolean caseJSXmlMeasurements(
            final JSXmlMeasurements object) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    @SuppressWarnings("unchecked")
    @Override
    public Boolean caseDoubleBinaryMeasurements(
            final DoubleBinaryMeasurements object) {
        final BinaryMeasurementsDao<Double, Quantity> bmd =
                (BinaryMeasurementsDao<Double, Quantity>) daoRegistry.getMeasurementsDao(object.getValuesUuid());
        if (!bmd.isOpen()) {
            try {
                bmd.open();
            } catch (final DataNotAccessibleException e) {
                logger.log(Level.SEVERE, "Could not access DAO with valuesUuid=" + object.getValuesUuid());
                return false;
            }
        }
        bmd.getMeasurements().add((javax.measure.Measure<Double,Quantity>)measurementToAdd);
        return true;
    }

    @SuppressWarnings("unchecked")
    @Override
    public Boolean caseLongBinaryMeasurements(
            final LongBinaryMeasurements object) {
        final BinaryMeasurementsDao<Long, Quantity> bmd =
                (BinaryMeasurementsDao<Long, Quantity>) daoRegistry.getMeasurementsDao(object.getValuesUuid());
        if (!bmd.isOpen()) {
            try {
                bmd.open();
            } catch (final DataNotAccessibleException e) {
                logger.log(Level.SEVERE, "Could not access DAO with valuesUuid=" + object.getValuesUuid());
                return false;
            }
        }
        bmd.getMeasurements().add((javax.measure.Measure<Long, Quantity>)measurementToAdd);
        return true;
    }

    /**
     * @return the measurementToAdd
     */
    public Object getMeasurementToAdd() {
        return measurementToAdd;
    }

    /**
     * @param measurementToAdd the measurementToAdd to set
     */
    public void setMeasurementToAdd(final Object measurementToAdd) {
        this.measurementToAdd = measurementToAdd;
    }

}
