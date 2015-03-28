/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.palladiosimulator.edp2.models.ExperimentData.impl;

import javax.measure.quantity.Quantity;
import javax.measure.unit.Unit;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.palladiosimulator.edp2.models.ExperimentData.DoubleBinaryMeasurements;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Double Binary Measurements</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.DoubleBinaryMeasurementsImpl#getStorageUnit
 * <em>Storage Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DoubleBinaryMeasurementsImpl<Q extends Quantity> extends DataSeriesImpl implements
DoubleBinaryMeasurements<Q> {
    /**
     * The cached value of the '{@link #getStorageUnit() <em>Storage Unit</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getStorageUnit()
     * @generated
     * @ordered
     */
    protected Unit<Q> storageUnit;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected DoubleBinaryMeasurementsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ExperimentDataPackage.Literals.DOUBLE_BINARY_MEASUREMENTS;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Unit<Q> getStorageUnit() {
        return this.storageUnit;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setStorageUnit(final Unit<Q> newStorageUnit) {
        final Unit<Q> oldStorageUnit = this.storageUnit;
        this.storageUnit = newStorageUnit;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    ExperimentDataPackage.DOUBLE_BINARY_MEASUREMENTS__STORAGE_UNIT, oldStorageUnit, this.storageUnit));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case ExperimentDataPackage.DOUBLE_BINARY_MEASUREMENTS__STORAGE_UNIT:
            return this.getStorageUnit();
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
        case ExperimentDataPackage.DOUBLE_BINARY_MEASUREMENTS__STORAGE_UNIT:
            this.setStorageUnit((Unit<Q>) newValue);
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
        case ExperimentDataPackage.DOUBLE_BINARY_MEASUREMENTS__STORAGE_UNIT:
            this.setStorageUnit((Unit<Q>) null);
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
        case ExperimentDataPackage.DOUBLE_BINARY_MEASUREMENTS__STORAGE_UNIT:
            return this.storageUnit != null;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String toString() {
        if (this.eIsProxy()) {
            return super.toString();
        }

        final StringBuffer result = new StringBuffer(super.toString());
        result.append(" (storageUnit: ");
        result.append(this.storageUnit);
        result.append(')');
        return result.toString();
    }

} // DoubleBinaryMeasurementsImpl
