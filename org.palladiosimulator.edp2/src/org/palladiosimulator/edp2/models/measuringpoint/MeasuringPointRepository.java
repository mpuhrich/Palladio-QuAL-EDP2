/**
 */
package org.palladiosimulator.edp2.models.measuringpoint;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measuring Point Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.palladiosimulator.edp2.models.measuringpoint.MeasuringPointRepository#getContains <em>Contains</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointPackage#getMeasuringPointRepository()
 * @model
 * @generated
 */
public interface MeasuringPointRepository extends EObject {

	/**
	 * Returns the value of the '<em><b>Contains</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.edp2.models.measuringpoint.MeasuringPoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains</em>' containment reference list.
	 * @see org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointPackage#getMeasuringPointRepository_Contains()
	 * @model containment="true"
	 * @generated
	 */
	EList<MeasuringPoint> getContains();

} // MeasuringPointRepository
