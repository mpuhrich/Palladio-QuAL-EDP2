/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.palladiosimulator.edp2.models.ExperimentData.impl;

import java.util.Collection;

import javax.measure.Measure;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.palladiosimulator.edp2.models.ExperimentData.AggregatedMeasurements;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage;
import org.palladiosimulator.edp2.models.ExperimentData.Measurements;
import org.palladiosimulator.edp2.models.ExperimentData.MeasurementsRange;
import org.palladiosimulator.edp2.models.ExperimentData.RawMeasurements;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Measurements Range</b></em>
 * '. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.MeasurementsRangeImpl#getRawMeasurements
 * <em>Raw Measurements</em>}</li>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.MeasurementsRangeImpl#getMeasurements
 * <em>Measurements</em>}</li>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.MeasurementsRangeImpl#getEndTime
 * <em>End Time</em>}</li>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.MeasurementsRangeImpl#getStartTime
 * <em>Start Time</em>}</li>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.MeasurementsRangeImpl#getAggregatedMeasurements
 * <em>Aggregated Measurements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MeasurementsRangeImpl extends PropertyableImpl implements MeasurementsRange {
    /**
     * The cached value of the '{@link #getRawMeasurements() <em>Raw Measurements</em>}' containment
     * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getRawMeasurements()
     * @generated
     * @ordered
     */
    protected RawMeasurements rawMeasurements;

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
     * The cached value of the '{@link #getEndTime() <em>End Time</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getEndTime()
     * @generated
     * @ordered
     */
    protected Measure endTime = END_TIME_EDEFAULT;

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
     * The cached value of the '{@link #getStartTime() <em>Start Time</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getStartTime()
     * @generated
     * @ordered
     */
    protected Measure startTime = START_TIME_EDEFAULT;

    /**
     * The cached value of the '{@link #getAggregatedMeasurements()
     * <em>Aggregated Measurements</em>}' containment reference list. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see #getAggregatedMeasurements()
     * @generated
     * @ordered
     */
    protected EList<AggregatedMeasurements> aggregatedMeasurements;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected MeasurementsRangeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ExperimentDataPackage.Literals.MEASUREMENTS_RANGE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public RawMeasurements getRawMeasurements() {
        return this.rawMeasurements;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetRawMeasurements(final RawMeasurements newRawMeasurements, NotificationChain msgs) {
        final RawMeasurements oldRawMeasurements = this.rawMeasurements;
        this.rawMeasurements = newRawMeasurements;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    ExperimentDataPackage.MEASUREMENTS_RANGE__RAW_MEASUREMENTS, oldRawMeasurements, newRawMeasurements);
            if (msgs == null) {
                msgs = notification;
            } else {
                msgs.add(notification);
            }
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setRawMeasurements(final RawMeasurements newRawMeasurements) {
        if (newRawMeasurements != this.rawMeasurements) {
            NotificationChain msgs = null;
            if (this.rawMeasurements != null) {
                msgs = ((InternalEObject) this.rawMeasurements).eInverseRemove(this,
                        ExperimentDataPackage.RAW_MEASUREMENTS__MEASUREMENTS_RANGE, RawMeasurements.class, msgs);
            }
            if (newRawMeasurements != null) {
                msgs = ((InternalEObject) newRawMeasurements).eInverseAdd(this,
                        ExperimentDataPackage.RAW_MEASUREMENTS__MEASUREMENTS_RANGE, RawMeasurements.class, msgs);
            }
            msgs = this.basicSetRawMeasurements(newRawMeasurements, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        } else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    ExperimentDataPackage.MEASUREMENTS_RANGE__RAW_MEASUREMENTS, newRawMeasurements, newRawMeasurements));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Measure getEndTime() {
        return this.endTime;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setEndTime(final Measure newEndTime) {
        final Measure oldEndTime = this.endTime;
        this.endTime = newEndTime;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    ExperimentDataPackage.MEASUREMENTS_RANGE__END_TIME, oldEndTime, this.endTime));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Measure getStartTime() {
        return this.startTime;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setStartTime(final Measure newStartTime) {
        final Measure oldStartTime = this.startTime;
        this.startTime = newStartTime;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    ExperimentDataPackage.MEASUREMENTS_RANGE__START_TIME, oldStartTime, this.startTime));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Measurements getMeasurements() {
        if (this.eContainerFeatureID() != ExperimentDataPackage.MEASUREMENTS_RANGE__MEASUREMENTS) {
            return null;
        }
        return (Measurements) this.eInternalContainer();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetMeasurements(final Measurements newMeasurements, NotificationChain msgs) {
        msgs = this.eBasicSetContainer((InternalEObject) newMeasurements,
                ExperimentDataPackage.MEASUREMENTS_RANGE__MEASUREMENTS, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setMeasurements(final Measurements newMeasurements) {
        if (newMeasurements != this.eInternalContainer()
                || (this.eContainerFeatureID() != ExperimentDataPackage.MEASUREMENTS_RANGE__MEASUREMENTS && newMeasurements != null)) {
            if (EcoreUtil.isAncestor(this, newMeasurements)) {
                throw new IllegalArgumentException("Recursive containment not allowed for " + this.toString());
            }
            NotificationChain msgs = null;
            if (this.eInternalContainer() != null) {
                msgs = this.eBasicRemoveFromContainer(msgs);
            }
            if (newMeasurements != null) {
                msgs = ((InternalEObject) newMeasurements).eInverseAdd(this,
                        ExperimentDataPackage.MEASUREMENTS__MEASUREMENTS_RANGES, Measurements.class, msgs);
            }
            msgs = this.basicSetMeasurements(newMeasurements, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        } else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    ExperimentDataPackage.MEASUREMENTS_RANGE__MEASUREMENTS, newMeasurements, newMeasurements));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<AggregatedMeasurements> getAggregatedMeasurements() {
        if (this.aggregatedMeasurements == null) {
            this.aggregatedMeasurements = new EObjectContainmentWithInverseEList<AggregatedMeasurements>(
                    AggregatedMeasurements.class, this,
                    ExperimentDataPackage.MEASUREMENTS_RANGE__AGGREGATED_MEASUREMENTS,
                    ExperimentDataPackage.AGGREGATED_MEASUREMENTS__MEASUREMENTS_RANGE);
        }
        return this.aggregatedMeasurements;
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
        case ExperimentDataPackage.MEASUREMENTS_RANGE__RAW_MEASUREMENTS:
            if (this.rawMeasurements != null) {
                msgs = ((InternalEObject) this.rawMeasurements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                        - ExperimentDataPackage.MEASUREMENTS_RANGE__RAW_MEASUREMENTS, null, msgs);
            }
            return this.basicSetRawMeasurements((RawMeasurements) otherEnd, msgs);
        case ExperimentDataPackage.MEASUREMENTS_RANGE__MEASUREMENTS:
            if (this.eInternalContainer() != null) {
                msgs = this.eBasicRemoveFromContainer(msgs);
            }
            return this.basicSetMeasurements((Measurements) otherEnd, msgs);
        case ExperimentDataPackage.MEASUREMENTS_RANGE__AGGREGATED_MEASUREMENTS:
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
        case ExperimentDataPackage.MEASUREMENTS_RANGE__RAW_MEASUREMENTS:
            return this.basicSetRawMeasurements(null, msgs);
        case ExperimentDataPackage.MEASUREMENTS_RANGE__MEASUREMENTS:
            return this.basicSetMeasurements(null, msgs);
        case ExperimentDataPackage.MEASUREMENTS_RANGE__AGGREGATED_MEASUREMENTS:
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
        case ExperimentDataPackage.MEASUREMENTS_RANGE__MEASUREMENTS:
            return this.eInternalContainer().eInverseRemove(this,
                    ExperimentDataPackage.MEASUREMENTS__MEASUREMENTS_RANGES, Measurements.class, msgs);
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
        case ExperimentDataPackage.MEASUREMENTS_RANGE__RAW_MEASUREMENTS:
            return this.getRawMeasurements();
        case ExperimentDataPackage.MEASUREMENTS_RANGE__MEASUREMENTS:
            return this.getMeasurements();
        case ExperimentDataPackage.MEASUREMENTS_RANGE__END_TIME:
            return this.getEndTime();
        case ExperimentDataPackage.MEASUREMENTS_RANGE__START_TIME:
            return this.getStartTime();
        case ExperimentDataPackage.MEASUREMENTS_RANGE__AGGREGATED_MEASUREMENTS:
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
        case ExperimentDataPackage.MEASUREMENTS_RANGE__RAW_MEASUREMENTS:
            this.setRawMeasurements((RawMeasurements) newValue);
            return;
        case ExperimentDataPackage.MEASUREMENTS_RANGE__MEASUREMENTS:
            this.setMeasurements((Measurements) newValue);
            return;
        case ExperimentDataPackage.MEASUREMENTS_RANGE__END_TIME:
            this.setEndTime((Measure) newValue);
            return;
        case ExperimentDataPackage.MEASUREMENTS_RANGE__START_TIME:
            this.setStartTime((Measure) newValue);
            return;
        case ExperimentDataPackage.MEASUREMENTS_RANGE__AGGREGATED_MEASUREMENTS:
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
        case ExperimentDataPackage.MEASUREMENTS_RANGE__RAW_MEASUREMENTS:
            this.setRawMeasurements((RawMeasurements) null);
            return;
        case ExperimentDataPackage.MEASUREMENTS_RANGE__MEASUREMENTS:
            this.setMeasurements((Measurements) null);
            return;
        case ExperimentDataPackage.MEASUREMENTS_RANGE__END_TIME:
            this.setEndTime(END_TIME_EDEFAULT);
            return;
        case ExperimentDataPackage.MEASUREMENTS_RANGE__START_TIME:
            this.setStartTime(START_TIME_EDEFAULT);
            return;
        case ExperimentDataPackage.MEASUREMENTS_RANGE__AGGREGATED_MEASUREMENTS:
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
        case ExperimentDataPackage.MEASUREMENTS_RANGE__RAW_MEASUREMENTS:
            return this.rawMeasurements != null;
        case ExperimentDataPackage.MEASUREMENTS_RANGE__MEASUREMENTS:
            return this.getMeasurements() != null;
        case ExperimentDataPackage.MEASUREMENTS_RANGE__END_TIME:
            return END_TIME_EDEFAULT == null ? this.endTime != null : !END_TIME_EDEFAULT.equals(this.endTime);
        case ExperimentDataPackage.MEASUREMENTS_RANGE__START_TIME:
            return START_TIME_EDEFAULT == null ? this.startTime != null : !START_TIME_EDEFAULT.equals(this.startTime);
        case ExperimentDataPackage.MEASUREMENTS_RANGE__AGGREGATED_MEASUREMENTS:
            return this.aggregatedMeasurements != null && !this.aggregatedMeasurements.isEmpty();
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String toString() {
        if (this.eIsProxy()) {
            return super.toString();
        }

        final StringBuffer result = new StringBuffer(super.toString());
        result.append(" (endTime: ");
        result.append(this.endTime);
        result.append(", startTime: ");
        result.append(this.startTime);
        result.append(')');
        return result.toString();
    }

} // MeasurementsRangeImpl
