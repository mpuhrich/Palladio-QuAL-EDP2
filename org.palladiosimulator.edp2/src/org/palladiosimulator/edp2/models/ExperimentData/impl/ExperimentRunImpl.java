/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.palladiosimulator.edp2.models.ExperimentData.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
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
        if (this.eContainerFeatureID() != ExperimentDataPackage.EXPERIMENT_RUN__EXPERIMENT_SETTING) {
            return null;
        }
        return (ExperimentSetting) this.eInternalContainer();
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
        if (newExperimentSetting != this.eInternalContainer()
                || (this.eContainerFeatureID() != ExperimentDataPackage.EXPERIMENT_RUN__EXPERIMENT_SETTING && newExperimentSetting != null)) {
            if (EcoreUtil.isAncestor(this, newExperimentSetting)) {
                throw new IllegalArgumentException("Recursive containment not allowed for " + this.toString());
            }
            NotificationChain msgs = null;
            if (this.eInternalContainer() != null) {
                msgs = this.eBasicRemoveFromContainer(msgs);
            }
            if (newExperimentSetting != null) {
                msgs = ((InternalEObject) newExperimentSetting).eInverseAdd(this,
                        ExperimentDataPackage.EXPERIMENT_SETTING__EXPERIMENT_RUNS, ExperimentSetting.class, msgs);
            }
            msgs = this.basicSetExperimentSetting(newExperimentSetting, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        } else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    ExperimentDataPackage.EXPERIMENT_RUN__EXPERIMENT_SETTING, newExperimentSetting,
                    newExperimentSetting));
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
