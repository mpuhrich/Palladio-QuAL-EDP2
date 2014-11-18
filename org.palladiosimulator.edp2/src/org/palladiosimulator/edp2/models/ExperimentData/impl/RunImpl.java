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
import org.palladiosimulator.edp2.models.ExperimentData.Measurements;
import org.palladiosimulator.edp2.models.ExperimentData.Propertyable;
import org.palladiosimulator.edp2.models.ExperimentData.Run;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Run</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.palladiosimulator.edp2.models.ExperimentData.impl.RunImpl#getAdditionalInformation <em>Additional Information</em>}</li>
 *   <li>{@link org.palladiosimulator.edp2.models.ExperimentData.impl.RunImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.palladiosimulator.edp2.models.ExperimentData.impl.RunImpl#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link org.palladiosimulator.edp2.models.ExperimentData.impl.RunImpl#getMeasurements <em>Measurements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RunImpl extends IdentifierImpl implements Run {
	/**
	 * The cached value of the '{@link #getAdditionalInformation() <em>Additional Information</em>}' map.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * The cached value of the '{@link #getMeasurements() <em>Measurements</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMeasurements()
	 * @generated
	 * @ordered
	 */
	protected EList<Measurements> measurements;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected RunImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExperimentDataPackage.Literals.RUN;
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
					ExperimentDataPackage.RUN__ADDITIONAL_INFORMATION);
		}
		return additionalInformation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Measure getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDuration(Measure newDuration) {
		Measure oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ExperimentDataPackage.RUN__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getStartTime() {
		return startTime;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartTime(Date newStartTime) {
		Date oldStartTime = startTime;
		startTime = newStartTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ExperimentDataPackage.RUN__START_TIME, oldStartTime,
					startTime));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Measurements> getMeasurements() {
		if (measurements == null) {
			measurements = new EObjectContainmentWithInverseEList<Measurements>(
					Measurements.class, this,
					ExperimentDataPackage.RUN__MEASUREMENTS,
					ExperimentDataPackage.MEASUREMENTS__RUN);
		}
		return measurements;
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
		case ExperimentDataPackage.RUN__MEASUREMENTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getMeasurements())
					.basicAdd(otherEnd, msgs);
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
		case ExperimentDataPackage.RUN__ADDITIONAL_INFORMATION:
			return ((InternalEList<?>) getAdditionalInformation()).basicRemove(
					otherEnd, msgs);
		case ExperimentDataPackage.RUN__MEASUREMENTS:
			return ((InternalEList<?>) getMeasurements()).basicRemove(otherEnd,
					msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ExperimentDataPackage.RUN__ADDITIONAL_INFORMATION:
			if (coreType)
				return getAdditionalInformation();
			else
				return getAdditionalInformation().map();
		case ExperimentDataPackage.RUN__DURATION:
			return getDuration();
		case ExperimentDataPackage.RUN__START_TIME:
			return getStartTime();
		case ExperimentDataPackage.RUN__MEASUREMENTS:
			return getMeasurements();
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
		case ExperimentDataPackage.RUN__ADDITIONAL_INFORMATION:
			((EStructuralFeature.Setting) getAdditionalInformation())
					.set(newValue);
			return;
		case ExperimentDataPackage.RUN__DURATION:
			setDuration((Measure) newValue);
			return;
		case ExperimentDataPackage.RUN__START_TIME:
			setStartTime((Date) newValue);
			return;
		case ExperimentDataPackage.RUN__MEASUREMENTS:
			getMeasurements().clear();
			getMeasurements().addAll(
					(Collection<? extends Measurements>) newValue);
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
		case ExperimentDataPackage.RUN__ADDITIONAL_INFORMATION:
			getAdditionalInformation().clear();
			return;
		case ExperimentDataPackage.RUN__DURATION:
			setDuration(DURATION_EDEFAULT);
			return;
		case ExperimentDataPackage.RUN__START_TIME:
			setStartTime(START_TIME_EDEFAULT);
			return;
		case ExperimentDataPackage.RUN__MEASUREMENTS:
			getMeasurements().clear();
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
		case ExperimentDataPackage.RUN__ADDITIONAL_INFORMATION:
			return additionalInformation != null
					&& !additionalInformation.isEmpty();
		case ExperimentDataPackage.RUN__DURATION:
			return DURATION_EDEFAULT == null ? duration != null
					: !DURATION_EDEFAULT.equals(duration);
		case ExperimentDataPackage.RUN__START_TIME:
			return START_TIME_EDEFAULT == null ? startTime != null
					: !START_TIME_EDEFAULT.equals(startTime);
		case ExperimentDataPackage.RUN__MEASUREMENTS:
			return measurements != null && !measurements.isEmpty();
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
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
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
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (duration: ");
		result.append(duration);
		result.append(", startTime: ");
		result.append(startTime);
		result.append(')');
		return result.toString();
	}

} // RunImpl
