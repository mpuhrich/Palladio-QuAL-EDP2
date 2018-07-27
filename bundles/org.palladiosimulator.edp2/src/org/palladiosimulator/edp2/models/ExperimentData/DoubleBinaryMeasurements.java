/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.palladiosimulator.edp2.models.ExperimentData;

import javax.measure.quantity.Quantity;
import javax.measure.unit.Unit;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Double Binary Measurements</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc --> This class is responsible for double measurements. These are stored in
 * IEEE standardized binary format. All values are stored in the same unit. The file containing the
 * actual measurements is constructed from the uuid of this class (which it has because it is
 * Identifiable). <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.DoubleBinaryMeasurements#getStorageUnit
 * <em>Storage Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage#getDoubleBinaryMeasurements()
 * @model QBounds="org.palladiosimulator.metricspec.IJSQuantity"
 * @generated
 */
public interface DoubleBinaryMeasurements<Q extends Quantity> extends DataSeries {

    /**
     * Returns the value of the '<em><b>Storage Unit</b></em>' attribute. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Storage Unit</em>' attribute isn't clear, there really should be
     * more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Storage Unit</em>' attribute.
     * @see #setStorageUnit(Unit)
     * @see org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage#getDoubleBinaryMeasurements_StorageUnit()
     * @model dataType="org.palladiosimulator.metricspec.EJSUnit<Q>" required="true" ordered="false"
     * @generated
     */
    Unit<Q> getStorageUnit();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.edp2.models.ExperimentData.DoubleBinaryMeasurements#getStorageUnit
     * <em>Storage Unit</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Storage Unit</em>' attribute.
     * @see #getStorageUnit()
     * @generated
     */
    void setStorageUnit(Unit<Q> value);

} // DoubleBinaryMeasurements
