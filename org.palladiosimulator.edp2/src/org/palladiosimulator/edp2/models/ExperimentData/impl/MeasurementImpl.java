/**
 */
package org.palladiosimulator.edp2.models.ExperimentData.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage;
import org.palladiosimulator.edp2.models.ExperimentData.Measurement;
import org.palladiosimulator.edp2.models.ExperimentData.MeasurementRange;
import org.palladiosimulator.edp2.models.ExperimentData.MeasuringType;
import org.palladiosimulator.edp2.models.ExperimentData.Propertyable;
import org.palladiosimulator.edp2.models.ExperimentData.Run;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Measurement</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.MeasurementImpl#getAdditionalInformation
 * <em>Additional Information</em>}</li>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.MeasurementImpl#getMeasuringType
 * <em>Measuring Type</em>}</li>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.MeasurementImpl#getMeasurementRanges
 * <em>Measurement Ranges</em>}</li>
 * <li>{@link org.palladiosimulator.edp2.models.ExperimentData.impl.MeasurementImpl#getRun <em>Run
 * </em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MeasurementImpl extends IdentifierImpl implements Measurement {
    /**
     * The cached value of the '{@link #getAdditionalInformation() <em>Additional Information</em>}'
     * map. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getAdditionalInformation()
     * @generated
     * @ordered
     */
    protected EMap<String, Object> additionalInformation;

    /**
     * The cached value of the '{@link #getMeasuringType() <em>Measuring Type</em>}' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getMeasuringType()
     * @generated
     * @ordered
     */
    protected MeasuringType measuringType;

    /**
     * The cached value of the '{@link #getMeasurementRanges() <em>Measurement Ranges</em>}'
     * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getMeasurementRanges()
     * @generated
     * @ordered
     */
    protected EList<MeasurementRange> measurementRanges;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected MeasurementImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ExperimentDataPackage.Literals.MEASUREMENT;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EMap<String, Object> getAdditionalInformation() {
        if (this.additionalInformation == null) {
            this.additionalInformation = new EcoreEMap<String, Object>(
                    ExperimentDataPackage.Literals.ESTRINGTO_EOBJECT_MAP_ENTRY, EStringtoEObjectMapEntryImpl.class,
                    this, ExperimentDataPackage.MEASUREMENT__ADDITIONAL_INFORMATION);
        }
        return this.additionalInformation;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public MeasuringType getMeasuringType() {
        if (this.measuringType != null && this.measuringType.eIsProxy()) {
            final InternalEObject oldMeasuringType = (InternalEObject) this.measuringType;
            this.measuringType = (MeasuringType) this.eResolveProxy(oldMeasuringType);
            if (this.measuringType != oldMeasuringType) {
                if (this.eNotificationRequired()) {
                    this.eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            ExperimentDataPackage.MEASUREMENT__MEASURING_TYPE, oldMeasuringType, this.measuringType));
                }
            }
        }
        return this.measuringType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public MeasuringType basicGetMeasuringType() {
        return this.measuringType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setMeasuringType(final MeasuringType newMeasuringType) {
        final MeasuringType oldMeasuringType = this.measuringType;
        this.measuringType = newMeasuringType;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    ExperimentDataPackage.MEASUREMENT__MEASURING_TYPE, oldMeasuringType, this.measuringType));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<MeasurementRange> getMeasurementRanges() {
        if (this.measurementRanges == null) {
            this.measurementRanges = new EObjectContainmentWithInverseEList<MeasurementRange>(MeasurementRange.class,
                    this, ExperimentDataPackage.MEASUREMENT__MEASUREMENT_RANGES,
                    ExperimentDataPackage.MEASUREMENT_RANGE__MEASUREMENT);
        }
        return this.measurementRanges;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Run getRun() {
        if (this.eContainerFeatureID() != ExperimentDataPackage.MEASUREMENT__RUN) {
            return null;
        }
        return (Run) this.eInternalContainer();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetRun(final Run newRun, NotificationChain msgs) {
        msgs = this.eBasicSetContainer((InternalEObject) newRun, ExperimentDataPackage.MEASUREMENT__RUN, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setRun(final Run newRun) {
        if (newRun != this.eInternalContainer()
                || (this.eContainerFeatureID() != ExperimentDataPackage.MEASUREMENT__RUN && newRun != null)) {
            if (EcoreUtil.isAncestor(this, newRun)) {
                throw new IllegalArgumentException("Recursive containment not allowed for " + this.toString());
            }
            NotificationChain msgs = null;
            if (this.eInternalContainer() != null) {
                msgs = this.eBasicRemoveFromContainer(msgs);
            }
            if (newRun != null) {
                msgs = ((InternalEObject) newRun).eInverseAdd(this, ExperimentDataPackage.RUN__MEASUREMENT, Run.class,
                        msgs);
            }
            msgs = this.basicSetRun(newRun, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        } else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, ExperimentDataPackage.MEASUREMENT__RUN, newRun,
                    newRun));
        }
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
        case ExperimentDataPackage.MEASUREMENT__MEASUREMENT_RANGES:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) this.getMeasurementRanges()).basicAdd(otherEnd,
                    msgs);
        case ExperimentDataPackage.MEASUREMENT__RUN:
            if (this.eInternalContainer() != null) {
                msgs = this.eBasicRemoveFromContainer(msgs);
            }
            return this.basicSetRun((Run) otherEnd, msgs);
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
        case ExperimentDataPackage.MEASUREMENT__ADDITIONAL_INFORMATION:
            return ((InternalEList<?>) this.getAdditionalInformation()).basicRemove(otherEnd, msgs);
        case ExperimentDataPackage.MEASUREMENT__MEASUREMENT_RANGES:
            return ((InternalEList<?>) this.getMeasurementRanges()).basicRemove(otherEnd, msgs);
        case ExperimentDataPackage.MEASUREMENT__RUN:
            return this.basicSetRun(null, msgs);
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
        case ExperimentDataPackage.MEASUREMENT__RUN:
            return this.eInternalContainer().eInverseRemove(this, ExperimentDataPackage.RUN__MEASUREMENT, Run.class,
                    msgs);
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
        case ExperimentDataPackage.MEASUREMENT__ADDITIONAL_INFORMATION:
            if (coreType) {
                return this.getAdditionalInformation();
            } else {
                return this.getAdditionalInformation().map();
            }
        case ExperimentDataPackage.MEASUREMENT__MEASURING_TYPE:
            if (resolve) {
                return this.getMeasuringType();
            }
            return this.basicGetMeasuringType();
        case ExperimentDataPackage.MEASUREMENT__MEASUREMENT_RANGES:
            return this.getMeasurementRanges();
        case ExperimentDataPackage.MEASUREMENT__RUN:
            return this.getRun();
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
        case ExperimentDataPackage.MEASUREMENT__ADDITIONAL_INFORMATION:
            ((EStructuralFeature.Setting) this.getAdditionalInformation()).set(newValue);
            return;
        case ExperimentDataPackage.MEASUREMENT__MEASURING_TYPE:
            this.setMeasuringType((MeasuringType) newValue);
            return;
        case ExperimentDataPackage.MEASUREMENT__MEASUREMENT_RANGES:
            this.getMeasurementRanges().clear();
            this.getMeasurementRanges().addAll((Collection<? extends MeasurementRange>) newValue);
            return;
        case ExperimentDataPackage.MEASUREMENT__RUN:
            this.setRun((Run) newValue);
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
        case ExperimentDataPackage.MEASUREMENT__ADDITIONAL_INFORMATION:
            this.getAdditionalInformation().clear();
            return;
        case ExperimentDataPackage.MEASUREMENT__MEASURING_TYPE:
            this.setMeasuringType((MeasuringType) null);
            return;
        case ExperimentDataPackage.MEASUREMENT__MEASUREMENT_RANGES:
            this.getMeasurementRanges().clear();
            return;
        case ExperimentDataPackage.MEASUREMENT__RUN:
            this.setRun((Run) null);
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
        case ExperimentDataPackage.MEASUREMENT__ADDITIONAL_INFORMATION:
            return this.additionalInformation != null && !this.additionalInformation.isEmpty();
        case ExperimentDataPackage.MEASUREMENT__MEASURING_TYPE:
            return this.measuringType != null;
        case ExperimentDataPackage.MEASUREMENT__MEASUREMENT_RANGES:
            return this.measurementRanges != null && !this.measurementRanges.isEmpty();
        case ExperimentDataPackage.MEASUREMENT__RUN:
            return this.getRun() != null;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public int eBaseStructuralFeatureID(final int derivedFeatureID, final Class<?> baseClass) {
        if (baseClass == Propertyable.class) {
            switch (derivedFeatureID) {
            case ExperimentDataPackage.MEASUREMENT__ADDITIONAL_INFORMATION:
                return ExperimentDataPackage.PROPERTYABLE__ADDITIONAL_INFORMATION;
            default:
                return -1;
            }
        }
        return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID(final int baseFeatureID, final Class<?> baseClass) {
        if (baseClass == Propertyable.class) {
            switch (baseFeatureID) {
            case ExperimentDataPackage.PROPERTYABLE__ADDITIONAL_INFORMATION:
                return ExperimentDataPackage.MEASUREMENT__ADDITIONAL_INFORMATION;
            default:
                return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} // MeasurementImpl
