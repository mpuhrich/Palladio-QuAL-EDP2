/**
 */
package org.palladiosimulator.edp2.local.impl;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EDataType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LocalFactoryImpl extends LocalFactoryImplGen
{
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URI createURIFromString(EDataType eDataType, String initialValue)
	{
	    return URI.createURI(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertURIToString(EDataType eDataType, Object instanceValue)
	{
	    if (instanceValue instanceof URI) {
	        return ((URI)instanceValue).toString();
	    }
		return super.convertToString(eDataType, instanceValue);
	}

} //LocalFactoryImpl
