/**
 */
package org.palladiosimulator.edp2.models.ExperimentData.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentGroup;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentGroupRun;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Experiment Group Run</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentGroupRunImpl#getExperimentgroup
 * <em>Experimentgroup</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExperimentGroupRunImpl extends RunImpl implements ExperimentGroupRun {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected ExperimentGroupRunImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ExperimentDataPackage.Literals.EXPERIMENT_GROUP_RUN;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public ExperimentGroup getExperimentgroup() {
        return (ExperimentGroup) this.eDynamicGet(ExperimentDataPackage.EXPERIMENT_GROUP_RUN__EXPERIMENTGROUP,
                ExperimentDataPackage.Literals.EXPERIMENT_GROUP_RUN__EXPERIMENTGROUP, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetExperimentgroup(final ExperimentGroup newExperimentgroup, NotificationChain msgs) {
        msgs = this.eBasicSetContainer((InternalEObject) newExperimentgroup,
                ExperimentDataPackage.EXPERIMENT_GROUP_RUN__EXPERIMENTGROUP, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setExperimentgroup(final ExperimentGroup newExperimentgroup) {
        this.eDynamicSet(ExperimentDataPackage.EXPERIMENT_GROUP_RUN__EXPERIMENTGROUP,
                ExperimentDataPackage.Literals.EXPERIMENT_GROUP_RUN__EXPERIMENTGROUP, newExperimentgroup);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(final InternalEObject otherEnd, final int featureID, NotificationChain msgs) {
        switch (featureID) {
        case ExperimentDataPackage.EXPERIMENT_GROUP_RUN__EXPERIMENTGROUP:
            if (this.eInternalContainer() != null) {
                msgs = this.eBasicRemoveFromContainer(msgs);
            }
            return this.basicSetExperimentgroup((ExperimentGroup) otherEnd, msgs);
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
        case ExperimentDataPackage.EXPERIMENT_GROUP_RUN__EXPERIMENTGROUP:
            return this.basicSetExperimentgroup(null, msgs);
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
        case ExperimentDataPackage.EXPERIMENT_GROUP_RUN__EXPERIMENTGROUP:
            return this.eInternalContainer().eInverseRemove(this, ExperimentDataPackage.EXPERIMENT_GROUP__REPORTS,
                    ExperimentGroup.class, msgs);
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
        case ExperimentDataPackage.EXPERIMENT_GROUP_RUN__EXPERIMENTGROUP:
            return this.getExperimentgroup();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
        case ExperimentDataPackage.EXPERIMENT_GROUP_RUN__EXPERIMENTGROUP:
            this.setExperimentgroup((ExperimentGroup) newValue);
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
        case ExperimentDataPackage.EXPERIMENT_GROUP_RUN__EXPERIMENTGROUP:
            this.setExperimentgroup((ExperimentGroup) null);
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
        case ExperimentDataPackage.EXPERIMENT_GROUP_RUN__EXPERIMENTGROUP:
            return this.getExperimentgroup() != null;
        }
        return super.eIsSet(featureID);
    }

} // ExperimentGroupRunImpl
