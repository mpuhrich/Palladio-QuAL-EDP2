/**
 */
package org.palladiosimulator.edp2.models.ExperimentData.impl;

import java.util.Collection;
import java.util.Date;

import javax.measure.Measure;

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
import org.eclipse.emf.ecore.util.InternalEList;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage;
import org.palladiosimulator.edp2.models.ExperimentData.Measurement;
import org.palladiosimulator.edp2.models.ExperimentData.Propertyable;
import org.palladiosimulator.edp2.models.ExperimentData.Run;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Run</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.RunImpl#getAdditionalInformation
 * <em>Additional Information</em>}</li>
 * <li>{@link org.palladiosimulator.edp2.models.ExperimentData.impl.RunImpl#getDuration <em>Duration
 * </em>}</li>
 * <li>{@link org.palladiosimulator.edp2.models.ExperimentData.impl.RunImpl#getStartTime <em>Start
 * Time</em>}</li>
 * <li>{@link org.palladiosimulator.edp2.models.ExperimentData.impl.RunImpl#getMeasurement <em>
 * Measurement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RunImpl extends IdentifierImpl implements Run {

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
     * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getDuration()
     * @generated
     * @ordered
     */
    protected static final Measure DURATION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getDuration()
     * @generated
     * @ordered
     */
    protected Measure duration = DURATION_EDEFAULT;

    /**
     * The default value of the '{@link #getStartTime() <em>Start Time</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getStartTime()
     * @generated
     * @ordered
     */
    protected static final Date START_TIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getStartTime() <em>Start Time</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getStartTime()
     * @generated
     * @ordered
     */
    protected Date startTime = START_TIME_EDEFAULT;

    /**
     * The cached value of the '{@link #getMeasurement() <em>Measurement</em>}' containment
     * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getMeasurement()
     * @generated
     * @ordered
     */
    protected EList<Measurement> measurement;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected RunImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ExperimentDataPackage.Literals.RUN;
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
                    this, ExperimentDataPackage.RUN__ADDITIONAL_INFORMATION);
        }
        return this.additionalInformation;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Measure getDuration() {
        return this.duration;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setDuration(final Measure newDuration) {
        final Measure oldDuration = this.duration;
        this.duration = newDuration;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, ExperimentDataPackage.RUN__DURATION,
                    oldDuration, this.duration));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Date getStartTime() {
        return this.startTime;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setStartTime(final Date newStartTime) {
        final Date oldStartTime = this.startTime;
        this.startTime = newStartTime;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, ExperimentDataPackage.RUN__START_TIME,
                    oldStartTime, this.startTime));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EList<Measurement> getMeasurement() {
        if (this.measurement == null) {
            this.measurement = new EObjectContainmentWithInverseEList<Measurement>(Measurement.class, this,
                    ExperimentDataPackage.RUN__MEASUREMENT, ExperimentDataPackage.MEASUREMENT__RUN);
        }
        return this.measurement;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(final InternalEObject otherEnd, final int featureID,
            final NotificationChain msgs) {
        switch (featureID) {
        case ExperimentDataPackage.RUN__MEASUREMENT:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) this.getMeasurement()).basicAdd(otherEnd, msgs);
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
        case ExperimentDataPackage.RUN__ADDITIONAL_INFORMATION:
            return ((InternalEList<?>) this.getAdditionalInformation()).basicRemove(otherEnd, msgs);
        case ExperimentDataPackage.RUN__MEASUREMENT:
            return ((InternalEList<?>) this.getMeasurement()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case ExperimentDataPackage.RUN__ADDITIONAL_INFORMATION:
            if (coreType) {
                return this.getAdditionalInformation();
            } else {
                return this.getAdditionalInformation().map();
            }
        case ExperimentDataPackage.RUN__DURATION:
            return this.getDuration();
        case ExperimentDataPackage.RUN__START_TIME:
            return this.getStartTime();
        case ExperimentDataPackage.RUN__MEASUREMENT:
            return this.getMeasurement();
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
        case ExperimentDataPackage.RUN__ADDITIONAL_INFORMATION:
            ((EStructuralFeature.Setting) this.getAdditionalInformation()).set(newValue);
            return;
        case ExperimentDataPackage.RUN__DURATION:
            this.setDuration((Measure) newValue);
            return;
        case ExperimentDataPackage.RUN__START_TIME:
            this.setStartTime((Date) newValue);
            return;
        case ExperimentDataPackage.RUN__MEASUREMENT:
            this.getMeasurement().clear();
            this.getMeasurement().addAll((Collection<? extends Measurement>) newValue);
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
        case ExperimentDataPackage.RUN__ADDITIONAL_INFORMATION:
            this.getAdditionalInformation().clear();
            return;
        case ExperimentDataPackage.RUN__DURATION:
            this.setDuration(DURATION_EDEFAULT);
            return;
        case ExperimentDataPackage.RUN__START_TIME:
            this.setStartTime(START_TIME_EDEFAULT);
            return;
        case ExperimentDataPackage.RUN__MEASUREMENT:
            this.getMeasurement().clear();
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
        case ExperimentDataPackage.RUN__ADDITIONAL_INFORMATION:
            return this.additionalInformation != null && !this.additionalInformation.isEmpty();
        case ExperimentDataPackage.RUN__DURATION:
            return DURATION_EDEFAULT == null ? this.duration != null : !DURATION_EDEFAULT.equals(this.duration);
        case ExperimentDataPackage.RUN__START_TIME:
            return START_TIME_EDEFAULT == null ? this.startTime != null : !START_TIME_EDEFAULT.equals(this.startTime);
        case ExperimentDataPackage.RUN__MEASUREMENT:
            return this.measurement != null && !this.measurement.isEmpty();
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
            case ExperimentDataPackage.RUN__ADDITIONAL_INFORMATION:
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
                return ExperimentDataPackage.RUN__ADDITIONAL_INFORMATION;
            default:
                return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
        result.append(" (duration: ");
        result.append(this.duration);
        result.append(", startTime: ");
        result.append(this.startTime);
        result.append(')');
        return result.toString();
    }

} // RunImpl
