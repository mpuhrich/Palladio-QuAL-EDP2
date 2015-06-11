/**
 */
package org.palladiosimulator.edp2.models.ExperimentData.impl;

import java.util.Collection;

import javax.measure.Measure;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.palladiosimulator.edp2.models.ExperimentData.AggregatedMeasurements;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage;
import org.palladiosimulator.edp2.models.ExperimentData.Measurement;
import org.palladiosimulator.edp2.models.ExperimentData.MeasurementRange;
import org.palladiosimulator.edp2.models.ExperimentData.RawMeasurements;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Measurement Range</b></em>
 * '. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.MeasurementRangeImpl#getRawMeasurements
 * <em>Raw Measurements</em>}</li>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.MeasurementRangeImpl#getMeasurement
 * <em>Measurement</em>}</li>
 * <li>{@link org.palladiosimulator.edp2.models.ExperimentData.impl.MeasurementRangeImpl#getEndTime
 * <em>End Time</em>}</li>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.MeasurementRangeImpl#getStartTime
 * <em>Start Time</em>}</li>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.MeasurementRangeImpl#getAggregatedMeasurements
 * <em>Aggregated Measurements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MeasurementRangeImpl extends PropertyableImpl implements MeasurementRange {

    /**
     * The default value of the '{@link #getEndTime() <em>End Time</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getEndTime()
     * @generated
     * @ordered
     */
    protected static final Measure END_TIME_EDEFAULT = null;

    /**
     * The default value of the '{@link #getStartTime() <em>Start Time</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getStartTime()
     * @generated
     * @ordered
     */
    protected static final Measure START_TIME_EDEFAULT = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected MeasurementRangeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ExperimentDataPackage.Literals.MEASUREMENT_RANGE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public RawMeasurements getRawMeasurements() {
        return (RawMeasurements) this.eDynamicGet(ExperimentDataPackage.MEASUREMENT_RANGE__RAW_MEASUREMENTS,
                ExperimentDataPackage.Literals.MEASUREMENT_RANGE__RAW_MEASUREMENTS, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetRawMeasurements(final RawMeasurements newRawMeasurements, NotificationChain msgs) {
        msgs = this.eDynamicInverseAdd((InternalEObject) newRawMeasurements,
                ExperimentDataPackage.MEASUREMENT_RANGE__RAW_MEASUREMENTS, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setRawMeasurements(final RawMeasurements newRawMeasurements) {
        this.eDynamicSet(ExperimentDataPackage.MEASUREMENT_RANGE__RAW_MEASUREMENTS,
                ExperimentDataPackage.Literals.MEASUREMENT_RANGE__RAW_MEASUREMENTS, newRawMeasurements);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Measurement getMeasurement() {
        return (Measurement) this.eDynamicGet(ExperimentDataPackage.MEASUREMENT_RANGE__MEASUREMENT,
                ExperimentDataPackage.Literals.MEASUREMENT_RANGE__MEASUREMENT, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetMeasurement(final Measurement newMeasurement, NotificationChain msgs) {
        msgs = this.eBasicSetContainer((InternalEObject) newMeasurement,
                ExperimentDataPackage.MEASUREMENT_RANGE__MEASUREMENT, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setMeasurement(final Measurement newMeasurement) {
        this.eDynamicSet(ExperimentDataPackage.MEASUREMENT_RANGE__MEASUREMENT,
                ExperimentDataPackage.Literals.MEASUREMENT_RANGE__MEASUREMENT, newMeasurement);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Measure getEndTime() {
        return (Measure) this.eDynamicGet(ExperimentDataPackage.MEASUREMENT_RANGE__END_TIME,
                ExperimentDataPackage.Literals.MEASUREMENT_RANGE__END_TIME, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setEndTime(final Measure newEndTime) {
        this.eDynamicSet(ExperimentDataPackage.MEASUREMENT_RANGE__END_TIME,
                ExperimentDataPackage.Literals.MEASUREMENT_RANGE__END_TIME, newEndTime);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Measure getStartTime() {
        return (Measure) this.eDynamicGet(ExperimentDataPackage.MEASUREMENT_RANGE__START_TIME,
                ExperimentDataPackage.Literals.MEASUREMENT_RANGE__START_TIME, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setStartTime(final Measure newStartTime) {
        this.eDynamicSet(ExperimentDataPackage.MEASUREMENT_RANGE__START_TIME,
                ExperimentDataPackage.Literals.MEASUREMENT_RANGE__START_TIME, newStartTime);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public EList<AggregatedMeasurements> getAggregatedMeasurements() {
        return (EList<AggregatedMeasurements>) this.eDynamicGet(
                ExperimentDataPackage.MEASUREMENT_RANGE__AGGREGATED_MEASUREMENTS,
                ExperimentDataPackage.Literals.MEASUREMENT_RANGE__AGGREGATED_MEASUREMENTS, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(final InternalEObject otherEnd, final int featureID, NotificationChain msgs) {
        switch (featureID) {
        case ExperimentDataPackage.MEASUREMENT_RANGE__RAW_MEASUREMENTS:
            final RawMeasurements rawMeasurements = this.getRawMeasurements();
            if (rawMeasurements != null) {
                msgs = ((InternalEObject) rawMeasurements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                        - ExperimentDataPackage.MEASUREMENT_RANGE__RAW_MEASUREMENTS, null, msgs);
            }
            return this.basicSetRawMeasurements((RawMeasurements) otherEnd, msgs);
        case ExperimentDataPackage.MEASUREMENT_RANGE__MEASUREMENT:
            if (this.eInternalContainer() != null) {
                msgs = this.eBasicRemoveFromContainer(msgs);
            }
            return this.basicSetMeasurement((Measurement) otherEnd, msgs);
        case ExperimentDataPackage.MEASUREMENT_RANGE__AGGREGATED_MEASUREMENTS:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) this.getAggregatedMeasurements()).basicAdd(
                    otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID,
            final NotificationChain msgs) {
        switch (featureID) {
        case ExperimentDataPackage.MEASUREMENT_RANGE__RAW_MEASUREMENTS:
            return this.basicSetRawMeasurements(null, msgs);
        case ExperimentDataPackage.MEASUREMENT_RANGE__MEASUREMENT:
            return this.basicSetMeasurement(null, msgs);
        case ExperimentDataPackage.MEASUREMENT_RANGE__AGGREGATED_MEASUREMENTS:
            return ((InternalEList<?>) this.getAggregatedMeasurements()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature(final NotificationChain msgs) {
        switch (this.eContainerFeatureID()) {
        case ExperimentDataPackage.MEASUREMENT_RANGE__MEASUREMENT:
            return this.eInternalContainer().eInverseRemove(this,
                    ExperimentDataPackage.MEASUREMENT__MEASUREMENT_RANGES, Measurement.class, msgs);
        }
        return super.eBasicRemoveFromContainerFeature(msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case ExperimentDataPackage.MEASUREMENT_RANGE__RAW_MEASUREMENTS:
            return this.getRawMeasurements();
        case ExperimentDataPackage.MEASUREMENT_RANGE__MEASUREMENT:
            return this.getMeasurement();
        case ExperimentDataPackage.MEASUREMENT_RANGE__END_TIME:
            return this.getEndTime();
        case ExperimentDataPackage.MEASUREMENT_RANGE__START_TIME:
            return this.getStartTime();
        case ExperimentDataPackage.MEASUREMENT_RANGE__AGGREGATED_MEASUREMENTS:
            return this.getAggregatedMeasurements();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
        case ExperimentDataPackage.MEASUREMENT_RANGE__RAW_MEASUREMENTS:
            this.setRawMeasurements((RawMeasurements) newValue);
            return;
        case ExperimentDataPackage.MEASUREMENT_RANGE__MEASUREMENT:
            this.setMeasurement((Measurement) newValue);
            return;
        case ExperimentDataPackage.MEASUREMENT_RANGE__END_TIME:
            this.setEndTime((Measure) newValue);
            return;
        case ExperimentDataPackage.MEASUREMENT_RANGE__START_TIME:
            this.setStartTime((Measure) newValue);
            return;
        case ExperimentDataPackage.MEASUREMENT_RANGE__AGGREGATED_MEASUREMENTS:
            this.getAggregatedMeasurements().clear();
            this.getAggregatedMeasurements().addAll((Collection<? extends AggregatedMeasurements>) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void eUnset(final int featureID) {
        switch (featureID) {
        case ExperimentDataPackage.MEASUREMENT_RANGE__RAW_MEASUREMENTS:
            this.setRawMeasurements((RawMeasurements) null);
            return;
        case ExperimentDataPackage.MEASUREMENT_RANGE__MEASUREMENT:
            this.setMeasurement((Measurement) null);
            return;
        case ExperimentDataPackage.MEASUREMENT_RANGE__END_TIME:
            this.setEndTime(END_TIME_EDEFAULT);
            return;
        case ExperimentDataPackage.MEASUREMENT_RANGE__START_TIME:
            this.setStartTime(START_TIME_EDEFAULT);
            return;
        case ExperimentDataPackage.MEASUREMENT_RANGE__AGGREGATED_MEASUREMENTS:
            this.getAggregatedMeasurements().clear();
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
        case ExperimentDataPackage.MEASUREMENT_RANGE__RAW_MEASUREMENTS:
            return this.getRawMeasurements() != null;
        case ExperimentDataPackage.MEASUREMENT_RANGE__MEASUREMENT:
            return this.getMeasurement() != null;
        case ExperimentDataPackage.MEASUREMENT_RANGE__END_TIME:
            return END_TIME_EDEFAULT == null ? this.getEndTime() != null : !END_TIME_EDEFAULT.equals(this.getEndTime());
        case ExperimentDataPackage.MEASUREMENT_RANGE__START_TIME:
            return START_TIME_EDEFAULT == null ? this.getStartTime() != null : !START_TIME_EDEFAULT.equals(this
                    .getStartTime());
        case ExperimentDataPackage.MEASUREMENT_RANGE__AGGREGATED_MEASUREMENTS:
            return !this.getAggregatedMeasurements().isEmpty();
        }
        return super.eIsSet(featureID);
    }

} // MeasurementRangeImpl
