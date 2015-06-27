/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.palladiosimulator.edp2.models.ExperimentData.impl;

import javax.measure.unit.Unit;

import org.eclipse.emf.ecore.EClass;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage;
import org.palladiosimulator.edp2.models.ExperimentData.LongBinaryMeasurements;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Long Binary Measurements</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.LongBinaryMeasurementsImpl#getStorageUnit
 * <em>Storage Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LongBinaryMeasurementsImpl extends DataSeriesImpl implements LongBinaryMeasurements {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected LongBinaryMeasurementsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ExperimentDataPackage.Literals.LONG_BINARY_MEASUREMENTS;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Unit getStorageUnit() {
        return (Unit) this.eDynamicGet(ExperimentDataPackage.LONG_BINARY_MEASUREMENTS__STORAGE_UNIT,
                ExperimentDataPackage.Literals.LONG_BINARY_MEASUREMENTS__STORAGE_UNIT, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setStorageUnit(final Unit newStorageUnit) {
        this.eDynamicSet(ExperimentDataPackage.LONG_BINARY_MEASUREMENTS__STORAGE_UNIT,
                ExperimentDataPackage.Literals.LONG_BINARY_MEASUREMENTS__STORAGE_UNIT, newStorageUnit);
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
        case ExperimentDataPackage.LONG_BINARY_MEASUREMENTS__STORAGE_UNIT:
            return this.getStorageUnit();
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
        case ExperimentDataPackage.LONG_BINARY_MEASUREMENTS__STORAGE_UNIT:
            this.setStorageUnit((Unit) newValue);
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
        case ExperimentDataPackage.LONG_BINARY_MEASUREMENTS__STORAGE_UNIT:
            this.setStorageUnit((Unit) null);
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
        case ExperimentDataPackage.LONG_BINARY_MEASUREMENTS__STORAGE_UNIT:
            return this.getStorageUnit() != null;
        }
        return super.eIsSet(featureID);
    }

} // LongBinaryMeasurementsImpl
