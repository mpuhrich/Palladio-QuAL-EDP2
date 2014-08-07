/**
 * <copyright>
 * </copyright>
 *
 * $Id$
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
import org.palladiosimulator.edp2.models.ExperimentData.Measure;
import org.palladiosimulator.edp2.models.ExperimentData.Measurements;
import org.palladiosimulator.edp2.models.ExperimentData.MeasurementsRange;
import org.palladiosimulator.edp2.models.ExperimentData.Propertyable;
import org.palladiosimulator.edp2.models.ExperimentData.Run;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Measurements</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.MeasurementsImpl#getAdditionalInformation
 * <em>Additional Information</em>}</li>
 * <li>{@link org.palladiosimulator.edp2.models.ExperimentData.impl.MeasurementsImpl#getMeasure <em>
 * Measure</em>}</li>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.MeasurementsImpl#getMeasurementsRanges
 * <em>Measurements Ranges</em>}</li>
 * <li>{@link org.palladiosimulator.edp2.models.ExperimentData.impl.MeasurementsImpl#getRun <em>Run
 * </em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MeasurementsImpl extends IdentifierImpl implements Measurements {
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
     * The cached value of the '{@link #getMeasure() <em>Measure</em>}' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getMeasure()
     * @generated
     * @ordered
     */
    protected Measure measure;

    /**
     * The cached value of the '{@link #getMeasurementsRanges() <em>Measurements Ranges</em>}'
     * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getMeasurementsRanges()
     * @generated
     * @ordered
     */
    protected EList<MeasurementsRange> measurementsRanges;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected MeasurementsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ExperimentDataPackage.Literals.MEASUREMENTS;
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
                    this, ExperimentDataPackage.MEASUREMENTS__ADDITIONAL_INFORMATION);
        }
        return this.additionalInformation;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Measure getMeasure() {
        if (this.measure != null && this.measure.eIsProxy()) {
            final InternalEObject oldMeasure = (InternalEObject) this.measure;
            this.measure = (Measure) this.eResolveProxy(oldMeasure);
            if (this.measure != oldMeasure) {
                if (this.eNotificationRequired()) {
                    this.eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            ExperimentDataPackage.MEASUREMENTS__MEASURE, oldMeasure, this.measure));
                }
            }
        }
        return this.measure;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public Measure basicGetMeasure() {
        return this.measure;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setMeasure(final Measure newMeasure) {
        final Measure oldMeasure = this.measure;
        this.measure = newMeasure;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, ExperimentDataPackage.MEASUREMENTS__MEASURE,
                    oldMeasure, this.measure));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<MeasurementsRange> getMeasurementsRanges() {
        if (this.measurementsRanges == null) {
            this.measurementsRanges = new EObjectContainmentWithInverseEList<MeasurementsRange>(
                    MeasurementsRange.class, this, ExperimentDataPackage.MEASUREMENTS__MEASUREMENTS_RANGES,
                    ExperimentDataPackage.MEASUREMENTS_RANGE__MEASUREMENTS);
        }
        return this.measurementsRanges;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Run getRun() {
        if (this.eContainerFeatureID() != ExperimentDataPackage.MEASUREMENTS__RUN) {
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
        msgs = this.eBasicSetContainer((InternalEObject) newRun, ExperimentDataPackage.MEASUREMENTS__RUN, msgs);
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
                || (this.eContainerFeatureID() != ExperimentDataPackage.MEASUREMENTS__RUN && newRun != null)) {
            if (EcoreUtil.isAncestor(this, newRun)) {
                throw new IllegalArgumentException("Recursive containment not allowed for " + this.toString());
            }
            NotificationChain msgs = null;
            if (this.eInternalContainer() != null) {
                msgs = this.eBasicRemoveFromContainer(msgs);
            }
            if (newRun != null) {
                msgs = ((InternalEObject) newRun).eInverseAdd(this, ExperimentDataPackage.RUN__MEASUREMENTS, Run.class,
                        msgs);
            }
            msgs = this.basicSetRun(newRun, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        } else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, ExperimentDataPackage.MEASUREMENTS__RUN, newRun,
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
        case ExperimentDataPackage.MEASUREMENTS__MEASUREMENTS_RANGES:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) this.getMeasurementsRanges()).basicAdd(
                    otherEnd, msgs);
        case ExperimentDataPackage.MEASUREMENTS__RUN:
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
        case ExperimentDataPackage.MEASUREMENTS__ADDITIONAL_INFORMATION:
            return ((InternalEList<?>) this.getAdditionalInformation()).basicRemove(otherEnd, msgs);
        case ExperimentDataPackage.MEASUREMENTS__MEASUREMENTS_RANGES:
            return ((InternalEList<?>) this.getMeasurementsRanges()).basicRemove(otherEnd, msgs);
        case ExperimentDataPackage.MEASUREMENTS__RUN:
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
        case ExperimentDataPackage.MEASUREMENTS__RUN:
            return this.eInternalContainer().eInverseRemove(this, ExperimentDataPackage.RUN__MEASUREMENTS, Run.class,
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
        case ExperimentDataPackage.MEASUREMENTS__ADDITIONAL_INFORMATION:
            if (coreType) {
                return this.getAdditionalInformation();
            } else {
                return this.getAdditionalInformation().map();
            }
        case ExperimentDataPackage.MEASUREMENTS__MEASURE:
            if (resolve) {
                return this.getMeasure();
            }
            return this.basicGetMeasure();
        case ExperimentDataPackage.MEASUREMENTS__MEASUREMENTS_RANGES:
            return this.getMeasurementsRanges();
        case ExperimentDataPackage.MEASUREMENTS__RUN:
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
        case ExperimentDataPackage.MEASUREMENTS__ADDITIONAL_INFORMATION:
            ((EStructuralFeature.Setting) this.getAdditionalInformation()).set(newValue);
            return;
        case ExperimentDataPackage.MEASUREMENTS__MEASURE:
            this.setMeasure((Measure) newValue);
            return;
        case ExperimentDataPackage.MEASUREMENTS__MEASUREMENTS_RANGES:
            this.getMeasurementsRanges().clear();
            this.getMeasurementsRanges().addAll((Collection<? extends MeasurementsRange>) newValue);
            return;
        case ExperimentDataPackage.MEASUREMENTS__RUN:
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
        case ExperimentDataPackage.MEASUREMENTS__ADDITIONAL_INFORMATION:
            this.getAdditionalInformation().clear();
            return;
        case ExperimentDataPackage.MEASUREMENTS__MEASURE:
            this.setMeasure((Measure) null);
            return;
        case ExperimentDataPackage.MEASUREMENTS__MEASUREMENTS_RANGES:
            this.getMeasurementsRanges().clear();
            return;
        case ExperimentDataPackage.MEASUREMENTS__RUN:
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
        case ExperimentDataPackage.MEASUREMENTS__ADDITIONAL_INFORMATION:
            return this.additionalInformation != null && !this.additionalInformation.isEmpty();
        case ExperimentDataPackage.MEASUREMENTS__MEASURE:
            return this.measure != null;
        case ExperimentDataPackage.MEASUREMENTS__MEASUREMENTS_RANGES:
            return this.measurementsRanges != null && !this.measurementsRanges.isEmpty();
        case ExperimentDataPackage.MEASUREMENTS__RUN:
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
            case ExperimentDataPackage.MEASUREMENTS__ADDITIONAL_INFORMATION:
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
                return ExperimentDataPackage.MEASUREMENTS__ADDITIONAL_INFORMATION;
            default:
                return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} // MeasurementsImpl
