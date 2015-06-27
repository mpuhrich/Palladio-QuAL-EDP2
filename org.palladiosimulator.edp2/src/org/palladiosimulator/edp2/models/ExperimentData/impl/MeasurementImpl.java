/**
 */
package org.palladiosimulator.edp2.models.ExperimentData.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
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
    @SuppressWarnings("unchecked")
    @Override
    public EMap<String, Object> getAdditionalInformation() {
        return (EMap<String, Object>) this.eDynamicGet(ExperimentDataPackage.MEASUREMENT__ADDITIONAL_INFORMATION,
                ExperimentDataPackage.Literals.PROPERTYABLE__ADDITIONAL_INFORMATION, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public MeasuringType getMeasuringType() {
        return (MeasuringType) this.eDynamicGet(ExperimentDataPackage.MEASUREMENT__MEASURING_TYPE,
                ExperimentDataPackage.Literals.MEASUREMENT__MEASURING_TYPE, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public MeasuringType basicGetMeasuringType() {
        return (MeasuringType) this.eDynamicGet(ExperimentDataPackage.MEASUREMENT__MEASURING_TYPE,
                ExperimentDataPackage.Literals.MEASUREMENT__MEASURING_TYPE, false, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setMeasuringType(final MeasuringType newMeasuringType) {
        this.eDynamicSet(ExperimentDataPackage.MEASUREMENT__MEASURING_TYPE,
                ExperimentDataPackage.Literals.MEASUREMENT__MEASURING_TYPE, newMeasuringType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public EList<MeasurementRange> getMeasurementRanges() {
        return (EList<MeasurementRange>) this.eDynamicGet(ExperimentDataPackage.MEASUREMENT__MEASUREMENT_RANGES,
                ExperimentDataPackage.Literals.MEASUREMENT__MEASUREMENT_RANGES, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Run getRun() {
        return (Run) this.eDynamicGet(ExperimentDataPackage.MEASUREMENT__RUN,
                ExperimentDataPackage.Literals.MEASUREMENT__RUN, true, true);
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
        this.eDynamicSet(ExperimentDataPackage.MEASUREMENT__RUN, ExperimentDataPackage.Literals.MEASUREMENT__RUN,
                newRun);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(final InternalEObject otherEnd, final int featureID, NotificationChain msgs) {
        switch (featureID)
        {
        case ExperimentDataPackage.MEASUREMENT__MEASUREMENT_RANGES:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) this.getMeasurementRanges())
                    .basicAdd(otherEnd, msgs);
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
        switch (featureID)
        {
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
        switch (this.eContainerFeatureID())
        {
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
        switch (featureID)
        {
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
        switch (featureID)
        {
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
        switch (featureID)
        {
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
        switch (featureID)
        {
        case ExperimentDataPackage.MEASUREMENT__ADDITIONAL_INFORMATION:
            return !this.getAdditionalInformation().isEmpty();
        case ExperimentDataPackage.MEASUREMENT__MEASURING_TYPE:
            return this.basicGetMeasuringType() != null;
        case ExperimentDataPackage.MEASUREMENT__MEASUREMENT_RANGES:
            return !this.getMeasurementRanges().isEmpty();
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
        if (baseClass == Propertyable.class)
        {
            switch (derivedFeatureID)
            {
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
        if (baseClass == Propertyable.class)
        {
            switch (baseFeatureID)
            {
            case ExperimentDataPackage.PROPERTYABLE__ADDITIONAL_INFORMATION:
                return ExperimentDataPackage.MEASUREMENT__ADDITIONAL_INFORMATION;
            default:
                return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} // MeasurementImpl
