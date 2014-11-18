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
 *   <li>{@link org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentRunImpl#getExperimentSetting <em>Experiment Setting</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExperimentRunImpl extends RunImpl implements ExperimentRun {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ExperimentRunImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExperimentDataPackage.Literals.EXPERIMENT_RUN;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExperimentSetting getExperimentSetting() {
		if (eContainerFeatureID() != ExperimentDataPackage.EXPERIMENT_RUN__EXPERIMENT_SETTING)
			return null;
		return (ExperimentSetting) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExperimentSetting(
			ExperimentSetting newExperimentSetting, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newExperimentSetting,
				ExperimentDataPackage.EXPERIMENT_RUN__EXPERIMENT_SETTING, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExperimentSetting(ExperimentSetting newExperimentSetting) {
		if (newExperimentSetting != eInternalContainer()
				|| (eContainerFeatureID() != ExperimentDataPackage.EXPERIMENT_RUN__EXPERIMENT_SETTING && newExperimentSetting != null)) {
			if (EcoreUtil.isAncestor(this, newExperimentSetting))
				throw new IllegalArgumentException(
						"Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newExperimentSetting != null)
				msgs = ((InternalEObject) newExperimentSetting)
						.eInverseAdd(
								this,
								ExperimentDataPackage.EXPERIMENT_SETTING__EXPERIMENT_RUNS,
								ExperimentSetting.class, msgs);
			msgs = basicSetExperimentSetting(newExperimentSetting, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ExperimentDataPackage.EXPERIMENT_RUN__EXPERIMENT_SETTING,
					newExperimentSetting, newExperimentSetting));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ExperimentDataPackage.EXPERIMENT_RUN__EXPERIMENT_SETTING:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetExperimentSetting((ExperimentSetting) otherEnd, msgs);
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
		case ExperimentDataPackage.EXPERIMENT_RUN__EXPERIMENT_SETTING:
			return basicSetExperimentSetting(null, msgs);
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
		case ExperimentDataPackage.EXPERIMENT_RUN__EXPERIMENT_SETTING:
			return eInternalContainer().eInverseRemove(this,
					ExperimentDataPackage.EXPERIMENT_SETTING__EXPERIMENT_RUNS,
					ExperimentSetting.class, msgs);
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
		case ExperimentDataPackage.EXPERIMENT_RUN__EXPERIMENT_SETTING:
			return getExperimentSetting();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ExperimentDataPackage.EXPERIMENT_RUN__EXPERIMENT_SETTING:
			setExperimentSetting((ExperimentSetting) newValue);
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
		case ExperimentDataPackage.EXPERIMENT_RUN__EXPERIMENT_SETTING:
			setExperimentSetting((ExperimentSetting) null);
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
		case ExperimentDataPackage.EXPERIMENT_RUN__EXPERIMENT_SETTING:
			return getExperimentSetting() != null;
		}
		return super.eIsSet(featureID);
	}

} // ExperimentRunImpl
