/**
 */
package org.palladiosimulator.edp2.models.measuringpoint.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointPackage;
import org.palladiosimulator.edp2.models.measuringpoint.StringMeasuringPoint;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>String Measuring Point</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.palladiosimulator.edp2.models.measuringpoint.impl.StringMeasuringPointImpl#getMeasuringPoint <em>Measuring Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StringMeasuringPointImpl extends MeasuringPointImpl implements
		StringMeasuringPoint {
	/**
	 * The default value of the '{@link #getMeasuringPoint() <em>Measuring Point</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMeasuringPoint()
	 * @generated
	 * @ordered
	 */
	protected static final String MEASURING_POINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMeasuringPoint() <em>Measuring Point</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMeasuringPoint()
	 * @generated
	 * @ordered
	 */
	protected String measuringPoint = MEASURING_POINT_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected StringMeasuringPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeasuringpointPackage.Literals.STRING_MEASURING_POINT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMeasuringPoint() {
		return measuringPoint;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMeasuringPoint(String newMeasuringPoint) {
		String oldMeasuringPoint = measuringPoint;
		measuringPoint = newMeasuringPoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					MeasuringpointPackage.STRING_MEASURING_POINT__MEASURING_POINT,
					oldMeasuringPoint, measuringPoint));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MeasuringpointPackage.STRING_MEASURING_POINT__MEASURING_POINT:
			return getMeasuringPoint();
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
		case MeasuringpointPackage.STRING_MEASURING_POINT__MEASURING_POINT:
			setMeasuringPoint((String) newValue);
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
		case MeasuringpointPackage.STRING_MEASURING_POINT__MEASURING_POINT:
			setMeasuringPoint(MEASURING_POINT_EDEFAULT);
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
		case MeasuringpointPackage.STRING_MEASURING_POINT__MEASURING_POINT:
			return MEASURING_POINT_EDEFAULT == null ? measuringPoint != null
					: !MEASURING_POINT_EDEFAULT.equals(measuringPoint);
		}
		return super.eIsSet(featureID);
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
		result.append(" (measuringPoint: ");
		result.append(measuringPoint);
		result.append(')');
		return result.toString();
	}

} // StringMeasuringPointImpl
