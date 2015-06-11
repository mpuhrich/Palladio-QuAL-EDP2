/**
 * <copyright>
 * </copyright>
 *
 * $Id$
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
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentGroup;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentRun;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentSetting;
import org.palladiosimulator.edp2.models.ExperimentData.MeasuringType;
import org.palladiosimulator.edp2.models.ExperimentData.Propertyable;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Experiment Setting</b></em>
 * '. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentSettingImpl#getAdditionalInformation
 * <em>Additional Information</em>}</li>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentSettingImpl#getDescription
 * <em>Description</em>}</li>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentSettingImpl#getExperimentRuns
 * <em>Experiment Runs</em>}</li>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentSettingImpl#getMeasuringTypes
 * <em>Measuring Types</em>}</li>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentSettingImpl#getExperimentGroup
 * <em>Experiment Group</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExperimentSettingImpl extends IdentifierImpl implements ExperimentSetting {

    /**
     * The default value of the '{@link #getDescription() <em>Description</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getDescription()
     * @generated
     * @ordered
     */
    protected static final String DESCRIPTION_EDEFAULT = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ExperimentSettingImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ExperimentDataPackage.Literals.EXPERIMENT_SETTING;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public EMap<String, Object> getAdditionalInformation() {
        return (EMap<String, Object>) this.eDynamicGet(
                ExperimentDataPackage.EXPERIMENT_SETTING__ADDITIONAL_INFORMATION,
                ExperimentDataPackage.Literals.PROPERTYABLE__ADDITIONAL_INFORMATION, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String getDescription() {
        return (String) this.eDynamicGet(ExperimentDataPackage.EXPERIMENT_SETTING__DESCRIPTION,
                ExperimentDataPackage.Literals.EXPERIMENT_SETTING__DESCRIPTION, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setDescription(final String newDescription) {
        this.eDynamicSet(ExperimentDataPackage.EXPERIMENT_SETTING__DESCRIPTION,
                ExperimentDataPackage.Literals.EXPERIMENT_SETTING__DESCRIPTION, newDescription);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public EList<ExperimentRun> getExperimentRuns() {
        return (EList<ExperimentRun>) this.eDynamicGet(ExperimentDataPackage.EXPERIMENT_SETTING__EXPERIMENT_RUNS,
                ExperimentDataPackage.Literals.EXPERIMENT_SETTING__EXPERIMENT_RUNS, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public EList<MeasuringType> getMeasuringTypes() {
        return (EList<MeasuringType>) this.eDynamicGet(ExperimentDataPackage.EXPERIMENT_SETTING__MEASURING_TYPES,
                ExperimentDataPackage.Literals.EXPERIMENT_SETTING__MEASURING_TYPES, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ExperimentGroup getExperimentGroup() {
        return (ExperimentGroup) this.eDynamicGet(ExperimentDataPackage.EXPERIMENT_SETTING__EXPERIMENT_GROUP,
                ExperimentDataPackage.Literals.EXPERIMENT_SETTING__EXPERIMENT_GROUP, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetExperimentGroup(final ExperimentGroup newExperimentGroup, NotificationChain msgs) {
        msgs = this.eBasicSetContainer((InternalEObject) newExperimentGroup,
                ExperimentDataPackage.EXPERIMENT_SETTING__EXPERIMENT_GROUP, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setExperimentGroup(final ExperimentGroup newExperimentGroup) {
        this.eDynamicSet(ExperimentDataPackage.EXPERIMENT_SETTING__EXPERIMENT_GROUP,
                ExperimentDataPackage.Literals.EXPERIMENT_SETTING__EXPERIMENT_GROUP, newExperimentGroup);
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
        case ExperimentDataPackage.EXPERIMENT_SETTING__EXPERIMENT_RUNS:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) this.getExperimentRuns()).basicAdd(otherEnd,
                    msgs);
        case ExperimentDataPackage.EXPERIMENT_SETTING__MEASURING_TYPES:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) this.getMeasuringTypes()).basicAdd(otherEnd,
                    msgs);
        case ExperimentDataPackage.EXPERIMENT_SETTING__EXPERIMENT_GROUP:
            if (this.eInternalContainer() != null) {
                msgs = this.eBasicRemoveFromContainer(msgs);
            }
            return this.basicSetExperimentGroup((ExperimentGroup) otherEnd, msgs);
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
        case ExperimentDataPackage.EXPERIMENT_SETTING__ADDITIONAL_INFORMATION:
            return ((InternalEList<?>) this.getAdditionalInformation()).basicRemove(otherEnd, msgs);
        case ExperimentDataPackage.EXPERIMENT_SETTING__EXPERIMENT_RUNS:
            return ((InternalEList<?>) this.getExperimentRuns()).basicRemove(otherEnd, msgs);
        case ExperimentDataPackage.EXPERIMENT_SETTING__MEASURING_TYPES:
            return ((InternalEList<?>) this.getMeasuringTypes()).basicRemove(otherEnd, msgs);
        case ExperimentDataPackage.EXPERIMENT_SETTING__EXPERIMENT_GROUP:
            return this.basicSetExperimentGroup(null, msgs);
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
        case ExperimentDataPackage.EXPERIMENT_SETTING__EXPERIMENT_GROUP:
            return this.eInternalContainer().eInverseRemove(this,
                    ExperimentDataPackage.EXPERIMENT_GROUP__EXPERIMENT_SETTINGS, ExperimentGroup.class, msgs);
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
        case ExperimentDataPackage.EXPERIMENT_SETTING__ADDITIONAL_INFORMATION:
            if (coreType) {
                return this.getAdditionalInformation();
            } else {
                return this.getAdditionalInformation().map();
            }
        case ExperimentDataPackage.EXPERIMENT_SETTING__DESCRIPTION:
            return this.getDescription();
        case ExperimentDataPackage.EXPERIMENT_SETTING__EXPERIMENT_RUNS:
            return this.getExperimentRuns();
        case ExperimentDataPackage.EXPERIMENT_SETTING__MEASURING_TYPES:
            return this.getMeasuringTypes();
        case ExperimentDataPackage.EXPERIMENT_SETTING__EXPERIMENT_GROUP:
            return this.getExperimentGroup();
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
        case ExperimentDataPackage.EXPERIMENT_SETTING__ADDITIONAL_INFORMATION:
            ((EStructuralFeature.Setting) this.getAdditionalInformation()).set(newValue);
            return;
        case ExperimentDataPackage.EXPERIMENT_SETTING__DESCRIPTION:
            this.setDescription((String) newValue);
            return;
        case ExperimentDataPackage.EXPERIMENT_SETTING__EXPERIMENT_RUNS:
            this.getExperimentRuns().clear();
            this.getExperimentRuns().addAll((Collection<? extends ExperimentRun>) newValue);
            return;
        case ExperimentDataPackage.EXPERIMENT_SETTING__MEASURING_TYPES:
            this.getMeasuringTypes().clear();
            this.getMeasuringTypes().addAll((Collection<? extends MeasuringType>) newValue);
            return;
        case ExperimentDataPackage.EXPERIMENT_SETTING__EXPERIMENT_GROUP:
            this.setExperimentGroup((ExperimentGroup) newValue);
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
        case ExperimentDataPackage.EXPERIMENT_SETTING__ADDITIONAL_INFORMATION:
            this.getAdditionalInformation().clear();
            return;
        case ExperimentDataPackage.EXPERIMENT_SETTING__DESCRIPTION:
            this.setDescription(DESCRIPTION_EDEFAULT);
            return;
        case ExperimentDataPackage.EXPERIMENT_SETTING__EXPERIMENT_RUNS:
            this.getExperimentRuns().clear();
            return;
        case ExperimentDataPackage.EXPERIMENT_SETTING__MEASURING_TYPES:
            this.getMeasuringTypes().clear();
            return;
        case ExperimentDataPackage.EXPERIMENT_SETTING__EXPERIMENT_GROUP:
            this.setExperimentGroup((ExperimentGroup) null);
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
        case ExperimentDataPackage.EXPERIMENT_SETTING__ADDITIONAL_INFORMATION:
            return !this.getAdditionalInformation().isEmpty();
        case ExperimentDataPackage.EXPERIMENT_SETTING__DESCRIPTION:
            return DESCRIPTION_EDEFAULT == null ? this.getDescription() != null : !DESCRIPTION_EDEFAULT.equals(this
                    .getDescription());
        case ExperimentDataPackage.EXPERIMENT_SETTING__EXPERIMENT_RUNS:
            return !this.getExperimentRuns().isEmpty();
        case ExperimentDataPackage.EXPERIMENT_SETTING__MEASURING_TYPES:
            return !this.getMeasuringTypes().isEmpty();
        case ExperimentDataPackage.EXPERIMENT_SETTING__EXPERIMENT_GROUP:
            return this.getExperimentGroup() != null;
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
            case ExperimentDataPackage.EXPERIMENT_SETTING__ADDITIONAL_INFORMATION:
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
                return ExperimentDataPackage.EXPERIMENT_SETTING__ADDITIONAL_INFORMATION;
            default:
                return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} // ExperimentSettingImpl
