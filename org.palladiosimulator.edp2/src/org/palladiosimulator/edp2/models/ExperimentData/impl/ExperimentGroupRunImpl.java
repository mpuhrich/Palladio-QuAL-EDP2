/**
 */
package org.palladiosimulator.edp2.models.ExperimentData.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentGroup;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentGroupRun;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Experiment Group Run</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentGroupRunImpl#getExperimentgroup <em>Experimentgroup</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExperimentGroupRunImpl extends RunImpl implements
		ExperimentGroupRun {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ExperimentGroupRunImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExperimentDataPackage.Literals.EXPERIMENT_GROUP_RUN;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExperimentGroup getExperimentgroup() {
		if (eContainerFeatureID() != ExperimentDataPackage.EXPERIMENT_GROUP_RUN__EXPERIMENTGROUP)
			return null;
		return (ExperimentGroup) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExperimentgroup(
			ExperimentGroup newExperimentgroup, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newExperimentgroup,
				ExperimentDataPackage.EXPERIMENT_GROUP_RUN__EXPERIMENTGROUP,
				msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExperimentgroup(ExperimentGroup newExperimentgroup) {
		if (newExperimentgroup != eInternalContainer()
				|| (eContainerFeatureID() != ExperimentDataPackage.EXPERIMENT_GROUP_RUN__EXPERIMENTGROUP && newExperimentgroup != null)) {
			if (EcoreUtil.isAncestor(this, newExperimentgroup))
				throw new IllegalArgumentException(
						"Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newExperimentgroup != null)
				msgs = ((InternalEObject) newExperimentgroup).eInverseAdd(this,
						ExperimentDataPackage.EXPERIMENT_GROUP__REPORTS,
						ExperimentGroup.class, msgs);
			msgs = basicSetExperimentgroup(newExperimentgroup, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					ExperimentDataPackage.EXPERIMENT_GROUP_RUN__EXPERIMENTGROUP,
					newExperimentgroup, newExperimentgroup));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ExperimentDataPackage.EXPERIMENT_GROUP_RUN__EXPERIMENTGROUP:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetExperimentgroup((ExperimentGroup) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ExperimentDataPackage.EXPERIMENT_GROUP_RUN__EXPERIMENTGROUP:
			return basicSetExperimentgroup(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(
			NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case ExperimentDataPackage.EXPERIMENT_GROUP_RUN__EXPERIMENTGROUP:
			return eInternalContainer().eInverseRemove(this,
					ExperimentDataPackage.EXPERIMENT_GROUP__REPORTS,
					ExperimentGroup.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ExperimentDataPackage.EXPERIMENT_GROUP_RUN__EXPERIMENTGROUP:
			return getExperimentgroup();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ExperimentDataPackage.EXPERIMENT_GROUP_RUN__EXPERIMENTGROUP:
			setExperimentgroup((ExperimentGroup) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ExperimentDataPackage.EXPERIMENT_GROUP_RUN__EXPERIMENTGROUP:
			setExperimentgroup((ExperimentGroup) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ExperimentDataPackage.EXPERIMENT_GROUP_RUN__EXPERIMENTGROUP:
			return getExperimentgroup() != null;
		}
		return super.eIsSet(featureID);
	}

} // ExperimentGroupRunImpl
