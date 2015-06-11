/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.palladiosimulator.edp2.models.ExperimentData.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentRun;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentSetting;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Experiment Run</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentRunImpl#getExperimentSetting
 * <em>Experiment Setting</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExperimentRunImpl extends RunImpl implements ExperimentRun {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ExperimentRunImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ExperimentDataPackage.Literals.EXPERIMENT_RUN;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ExperimentSetting getExperimentSetting() {
        return (ExperimentSetting) this.eDynamicGet(ExperimentDataPackage.EXPERIMENT_RUN__EXPERIMENT_SETTING,
                ExperimentDataPackage.Literals.EXPERIMENT_RUN__EXPERIMENT_SETTING, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetExperimentSetting(final ExperimentSetting newExperimentSetting,
            NotificationChain msgs) {
        msgs = this.eBasicSetContainer((InternalEObject) newExperimentSetting,
                ExperimentDataPackage.EXPERIMENT_RUN__EXPERIMENT_SETTING, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setExperimentSetting(final ExperimentSetting newExperimentSetting) {
        this.eDynamicSet(ExperimentDataPackage.EXPERIMENT_RUN__EXPERIMENT_SETTING,
                ExperimentDataPackage.Literals.EXPERIMENT_RUN__EXPERIMENT_SETTING, newExperimentSetting);
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
        case ExperimentDataPackage.EXPERIMENT_RUN__EXPERIMENT_SETTING:
            if (this.eInternalContainer() != null) {
                msgs = this.eBasicRemoveFromContainer(msgs);
            }
            return this.basicSetExperimentSetting((ExperimentSetting) otherEnd, msgs);
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
        case ExperimentDataPackage.EXPERIMENT_RUN__EXPERIMENT_SETTING:
            return this.basicSetExperimentSetting(null, msgs);
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
        case ExperimentDataPackage.EXPERIMENT_RUN__EXPERIMENT_SETTING:
            return this.eInternalContainer().eInverseRemove(this,
                    ExperimentDataPackage.EXPERIMENT_SETTING__EXPERIMENT_RUNS, ExperimentSetting.class, msgs);
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
        case ExperimentDataPackage.EXPERIMENT_RUN__EXPERIMENT_SETTING:
            return this.getExperimentSetting();
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
        case ExperimentDataPackage.EXPERIMENT_RUN__EXPERIMENT_SETTING:
            this.setExperimentSetting((ExperimentSetting) newValue);
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
        case ExperimentDataPackage.EXPERIMENT_RUN__EXPERIMENT_SETTING:
            this.setExperimentSetting((ExperimentSetting) null);
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
        case ExperimentDataPackage.EXPERIMENT_RUN__EXPERIMENT_SETTING:
            return this.getExperimentSetting() != null;
        }
        return super.eIsSet(featureID);
    }

} // ExperimentRunImpl
