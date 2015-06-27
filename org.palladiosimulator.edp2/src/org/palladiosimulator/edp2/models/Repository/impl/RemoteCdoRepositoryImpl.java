/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.palladiosimulator.edp2.models.Repository.impl;

import org.eclipse.emf.ecore.EClass;
import org.palladiosimulator.edp2.models.Repository.RemoteCdoRepository;
import org.palladiosimulator.edp2.models.Repository.RepositoryPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Remote Cdo Repository</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.palladiosimulator.edp2.models.Repository.impl.RemoteCdoRepositoryImpl#getUrl <em>
 * Url</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RemoteCdoRepositoryImpl extends RepositoryImpl implements RemoteCdoRepository {

    /**
     * The default value of the '{@link #getUrl() <em>Url</em>}' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getUrl()
     * @generated
     * @ordered
     */
    protected static final String URL_EDEFAULT = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected RemoteCdoRepositoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return RepositoryPackage.Literals.REMOTE_CDO_REPOSITORY;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String getUrl() {
        return (String) this.eDynamicGet(RepositoryPackage.REMOTE_CDO_REPOSITORY__URL,
                RepositoryPackage.Literals.REMOTE_CDO_REPOSITORY__URL, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setUrl(final String newUrl) {
        this.eDynamicSet(RepositoryPackage.REMOTE_CDO_REPOSITORY__URL,
                RepositoryPackage.Literals.REMOTE_CDO_REPOSITORY__URL, newUrl);
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
        case RepositoryPackage.REMOTE_CDO_REPOSITORY__URL:
            return this.getUrl();
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
        case RepositoryPackage.REMOTE_CDO_REPOSITORY__URL:
            this.setUrl((String) newValue);
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
        case RepositoryPackage.REMOTE_CDO_REPOSITORY__URL:
            this.setUrl(URL_EDEFAULT);
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
        case RepositoryPackage.REMOTE_CDO_REPOSITORY__URL:
            return URL_EDEFAULT == null ? this.getUrl() != null : !URL_EDEFAULT.equals(this.getUrl());
        }
        return super.eIsSet(featureID);
    }

} // RemoteCdoRepositoryImpl
