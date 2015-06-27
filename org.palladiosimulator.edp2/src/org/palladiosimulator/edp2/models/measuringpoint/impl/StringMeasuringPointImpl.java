/**
 */
package org.palladiosimulator.edp2.models.measuringpoint.impl;

import org.eclipse.emf.ecore.EClass;
import org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointPackage;
import org.palladiosimulator.edp2.models.measuringpoint.StringMeasuringPoint;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>String Measuring Point</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.palladiosimulator.edp2.models.measuringpoint.impl.StringMeasuringPointImpl#getMeasuringPoint
 * <em>Measuring Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StringMeasuringPointImpl extends MeasuringPointImpl implements StringMeasuringPoint {

    /**
     * The default value of the '{@link #getMeasuringPoint() <em>Measuring Point</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getMeasuringPoint()
     * @generated
     * @ordered
     */
    protected static final String MEASURING_POINT_EDEFAULT = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected StringMeasuringPointImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MeasuringpointPackage.Literals.STRING_MEASURING_POINT;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String getMeasuringPoint() {
        return (String) this.eDynamicGet(MeasuringpointPackage.STRING_MEASURING_POINT__MEASURING_POINT,
                MeasuringpointPackage.Literals.STRING_MEASURING_POINT__MEASURING_POINT, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setMeasuringPoint(final String newMeasuringPoint) {
        this.eDynamicSet(MeasuringpointPackage.STRING_MEASURING_POINT__MEASURING_POINT,
                MeasuringpointPackage.Literals.STRING_MEASURING_POINT__MEASURING_POINT, newMeasuringPoint);
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
        case MeasuringpointPackage.STRING_MEASURING_POINT__MEASURING_POINT:
            return this.getMeasuringPoint();
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
        switch (featureID)
        {
        case MeasuringpointPackage.STRING_MEASURING_POINT__MEASURING_POINT:
            this.setMeasuringPoint((String) newValue);
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
        case MeasuringpointPackage.STRING_MEASURING_POINT__MEASURING_POINT:
            this.setMeasuringPoint(MEASURING_POINT_EDEFAULT);
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
        case MeasuringpointPackage.STRING_MEASURING_POINT__MEASURING_POINT:
            return MEASURING_POINT_EDEFAULT == null ? this.getMeasuringPoint() != null : !MEASURING_POINT_EDEFAULT
            .equals(this.getMeasuringPoint());
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated NOT
     */
    @Override
    public String getStringRepresentation() {
        return this.getMeasuringPoint();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated NOT
     */
    @Override
    public String getResourceURIRepresentation() {
        return "Unkown Resource URI -- String Measuring Point only!";
    }

} // StringMeasuringPointImpl
