/**
 */
package org.palladiosimulator.edp2.local;

import java.io.File;

import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.edp2.dao.exception.DataNotAccessibleException;
import org.palladiosimulator.edp2.models.Repository.Repository;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Directory Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Repository which provides access to data stored in a local directory.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.palladiosimulator.edp2.local.LocalDirectoryRepository#getUri <em>Uri</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.palladiosimulator.edp2.local.localPackage#getLocalDirectoryRepository()
 * @model
 * @generated
 */
public interface LocalDirectoryRepository extends EObject, Repository
{
    /**
     * Returns the value of the '<em><b>Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Uri</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Uri</em>' attribute.
     * @see #setUri(String)
     * @see org.palladiosimulator.edp2.local.localPackage#getLocalDirectoryRepository_Uri()
     * @model required="true" ordered="false"
     * @generated
     */
    String getUri();

    /**
     * Sets the value of the '{@link org.palladiosimulator.edp2.local.LocalDirectoryRepository#getUri <em>Uri</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Uri</em>' attribute.
     * @see #getUri()
     * @generated
     */
    void setUri(String value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @throws DataNotAccessibleException
     * @model type="org.palladiosimulator.edp2.local.File" required="true" ordered="false" uriStringRequired="true" uriStringOrdered="false"
     * @generated NOT (at least the exception)
     */
    File convertUriStringToFile(String uriString) throws DataNotAccessibleException;

} // LocalDirectoryRepository
