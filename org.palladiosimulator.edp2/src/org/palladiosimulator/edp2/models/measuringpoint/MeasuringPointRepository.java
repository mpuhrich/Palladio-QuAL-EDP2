/**
 */
package org.palladiosimulator.edp2.models.measuringpoint;

import org.eclipse.emf.common.util.EList;

import de.uka.ipd.sdq.identifier.Identifier;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Measuring Point Repository</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link org.palladiosimulator.edp2.models.measuringpoint.MeasuringPointRepository#getMeasuringPoints
 * <em>Measuring Points</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointPackage#getMeasuringPointRepository()
 * @model
 * @generated
 */
public interface MeasuringPointRepository extends Identifier {

    /**
     * Returns the value of the '<em><b>Measuring Points</b></em>' containment reference list. The
     * list contents are of type
     * {@link org.palladiosimulator.edp2.models.measuringpoint.MeasuringPoint}. It is bidirectional
     * and its opposite is '
     * {@link org.palladiosimulator.edp2.models.measuringpoint.MeasuringPoint#getMeasuringPointRepository
     * <em>Measuring Point Repository</em>}'. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Measuring Points</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Measuring Points</em>' containment reference list.
     * @see org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointPackage#getMeasuringPointRepository_MeasuringPoints()
     * @see org.palladiosimulator.edp2.models.measuringpoint.MeasuringPoint#getMeasuringPointRepository
     * @model opposite="measuringPointRepository" containment="true"
     * @generated
     */
    EList<MeasuringPoint> getMeasuringPoints();

} // MeasuringPointRepository
