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
 *   <li>{@link org.palladiosimulator.edp2.models.ExperimentData.impl.MeasurementsImpl#getAdditionalInformation <em>Additional Information</em>}</li>
 *   <li>{@link org.palladiosimulator.edp2.models.ExperimentData.impl.MeasurementsImpl#getMeasure <em>Measure</em>}</li>
 *   <li>{@link org.palladiosimulator.edp2.models.ExperimentData.impl.MeasurementsImpl#getMeasurementsRanges <em>Measurements Ranges</em>}</li>
 *   <li>{@link org.palladiosimulator.edp2.models.ExperimentData.impl.MeasurementsImpl#getRun <em>Run</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MeasurementsImpl extends IdentifierImpl implements Measurements {
	/**
	 * The cached value of the '{@link #getAdditionalInformation() <em>Additional Information</em>}' map.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * The cached value of the '{@link #getMeasurementsRanges() <em>Measurements Ranges</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMeasurementsRanges()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasurementsRange> measurementsRanges;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasurementsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExperimentDataPackage.Literals.MEASUREMENTS;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, Object> getAdditionalInformation() {
		if (additionalInformation == null) {
			additionalInformation = new EcoreEMap<String, Object>(
					ExperimentDataPackage.Literals.ESTRINGTO_EOBJECT_MAP_ENTRY,
					EStringtoEObjectMapEntryImpl.class, this,
					ExperimentDataPackage.MEASUREMENTS__ADDITIONAL_INFORMATION);
		}
		return additionalInformation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Measure getMeasure() {
		if (measure != null && measure.eIsProxy()) {
			InternalEObject oldMeasure = (InternalEObject) measure;
			measure = (Measure) eResolveProxy(oldMeasure);
			if (measure != oldMeasure) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ExperimentDataPackage.MEASUREMENTS__MEASURE,
							oldMeasure, measure));
			}
		}
		return measure;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Measure basicGetMeasure() {
		return measure;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMeasure(Measure newMeasure) {
		Measure oldMeasure = measure;
		measure = newMeasure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ExperimentDataPackage.MEASUREMENTS__MEASURE, oldMeasure,
					measure));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MeasurementsRange> getMeasurementsRanges() {
		if (measurementsRanges == null) {
			measurementsRanges = new EObjectContainmentWithInverseEList<MeasurementsRange>(
					MeasurementsRange.class, this,
					ExperimentDataPackage.MEASUREMENTS__MEASUREMENTS_RANGES,
					ExperimentDataPackage.MEASUREMENTS_RANGE__MEASUREMENTS);
		}
		return measurementsRanges;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Run getRun() {
		if (eContainerFeatureID() != ExperimentDataPackage.MEASUREMENTS__RUN)
			return null;
		return (Run) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRun(Run newRun, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newRun,
				ExperimentDataPackage.MEASUREMENTS__RUN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRun(Run newRun) {
		if (newRun != eInternalContainer()
				|| (eContainerFeatureID() != ExperimentDataPackage.MEASUREMENTS__RUN && newRun != null)) {
			if (EcoreUtil.isAncestor(this, newRun))
				throw new IllegalArgumentException(
						"Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRun != null)
				msgs = ((InternalEObject) newRun).eInverseAdd(this,
						ExperimentDataPackage.RUN__MEASUREMENTS, Run.class,
						msgs);
			msgs = basicSetRun(newRun, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ExperimentDataPackage.MEASUREMENTS__RUN, newRun, newRun));
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
		case ExperimentDataPackage.MEASUREMENTS__MEASUREMENTS_RANGES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getMeasurementsRanges())
					.basicAdd(otherEnd, msgs);
		case ExperimentDataPackage.MEASUREMENTS__RUN:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetRun((Run) otherEnd, msgs);
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
		case ExperimentDataPackage.MEASUREMENTS__ADDITIONAL_INFORMATION:
			return ((InternalEList<?>) getAdditionalInformation()).basicRemove(
					otherEnd, msgs);
		case ExperimentDataPackage.MEASUREMENTS__MEASUREMENTS_RANGES:
			return ((InternalEList<?>) getMeasurementsRanges()).basicRemove(
					otherEnd, msgs);
		case ExperimentDataPackage.MEASUREMENTS__RUN:
			return basicSetRun(null, msgs);
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
		case ExperimentDataPackage.MEASUREMENTS__RUN:
			return eInternalContainer().eInverseRemove(this,
					ExperimentDataPackage.RUN__MEASUREMENTS, Run.class, msgs);
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
		case ExperimentDataPackage.MEASUREMENTS__ADDITIONAL_INFORMATION:
			if (coreType)
				return getAdditionalInformation();
			else
				return getAdditionalInformation().map();
		case ExperimentDataPackage.MEASUREMENTS__MEASURE:
			if (resolve)
				return getMeasure();
			return basicGetMeasure();
		case ExperimentDataPackage.MEASUREMENTS__MEASUREMENTS_RANGES:
			return getMeasurementsRanges();
		case ExperimentDataPackage.MEASUREMENTS__RUN:
			return getRun();
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
		case ExperimentDataPackage.MEASUREMENTS__ADDITIONAL_INFORMATION:
			((EStructuralFeature.Setting) getAdditionalInformation())
					.set(newValue);
			return;
		case ExperimentDataPackage.MEASUREMENTS__MEASURE:
			setMeasure((Measure) newValue);
			return;
		case ExperimentDataPackage.MEASUREMENTS__MEASUREMENTS_RANGES:
			getMeasurementsRanges().clear();
			getMeasurementsRanges().addAll(
					(Collection<? extends MeasurementsRange>) newValue);
			return;
		case ExperimentDataPackage.MEASUREMENTS__RUN:
			setRun((Run) newValue);
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
		case ExperimentDataPackage.MEASUREMENTS__ADDITIONAL_INFORMATION:
			getAdditionalInformation().clear();
			return;
		case ExperimentDataPackage.MEASUREMENTS__MEASURE:
			setMeasure((Measure) null);
			return;
		case ExperimentDataPackage.MEASUREMENTS__MEASUREMENTS_RANGES:
			getMeasurementsRanges().clear();
			return;
		case ExperimentDataPackage.MEASUREMENTS__RUN:
			setRun((Run) null);
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
		case ExperimentDataPackage.MEASUREMENTS__ADDITIONAL_INFORMATION:
			return additionalInformation != null
					&& !additionalInformation.isEmpty();
		case ExperimentDataPackage.MEASUREMENTS__MEASURE:
			return measure != null;
		case ExperimentDataPackage.MEASUREMENTS__MEASUREMENTS_RANGES:
			return measurementsRanges != null && !measurementsRanges.isEmpty();
		case ExperimentDataPackage.MEASUREMENTS__RUN:
			return getRun() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
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
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
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
