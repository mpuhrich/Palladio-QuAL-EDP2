/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.palladiosimulator.edp2.models.ExperimentData.impl;

import javax.measure.quantity.Quantity;
import javax.measure.unit.Unit;

import org.eclipse.emf.ecore.EClass;
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
        return (Unit<Q>) this.eDynamicGet(ExperimentDataPackage.DOUBLE_BINARY_MEASUREMENTS__STORAGE_UNIT,
                ExperimentDataPackage.Literals.DOUBLE_BINARY_MEASUREMENTS__STORAGE_UNIT, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setStorageUnit(final Unit<Q> newStorageUnit) {
        this.eDynamicSet(ExperimentDataPackage.DOUBLE_BINARY_MEASUREMENTS__STORAGE_UNIT,
                ExperimentDataPackage.Literals.DOUBLE_BINARY_MEASUREMENTS__STORAGE_UNIT, newStorageUnit);
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
            return this.getStorageUnit() != null;
        }
        return super.eIsSet(featureID);
    }

} // DoubleBinaryMeasurementsImpl
