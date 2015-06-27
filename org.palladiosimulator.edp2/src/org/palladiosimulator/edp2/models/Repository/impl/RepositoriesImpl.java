/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.palladiosimulator.edp2.models.Repository.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.palladiosimulator.edp2.impl.resource.EmfModelXMIResourceFactoryImpl;
import org.palladiosimulator.edp2.models.Repository.Repositories;
import org.palladiosimulator.edp2.models.Repository.Repository;
import org.palladiosimulator.edp2.models.Repository.RepositoryPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Repositories</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.palladiosimulator.edp2.models.Repository.impl.RepositoriesImpl#getAvailableRepositories
 * <em>Available Repositories</em>}</li>
 * <li>
 * {@link org.palladiosimulator.edp2.models.Repository.impl.RepositoriesImpl#getCommonResourceSet
 * <em>Common Resource Set</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RepositoriesImpl extends CDOObjectImpl implements Repositories {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated NOT
     */
    protected RepositoriesImpl() {
        super();
        // DEFAULT: Generate a new resource set by which all EMF resources are managed.
        this.setCommonResourceSet(EmfModelXMIResourceFactoryImpl.createResourceSet());
        // EmfmodelPackageImpl.eINSTANCE.eClass();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return RepositoryPackage.Literals.REPOSITORIES;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected int eStaticFeatureCount() {
        return 0;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public EList<Repository> getAvailableRepositories() {
        return (EList<Repository>) this.eDynamicGet(RepositoryPackage.REPOSITORIES__AVAILABLE_REPOSITORIES,
                RepositoryPackage.Literals.REPOSITORIES__AVAILABLE_REPOSITORIES, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated NOT
     */
    @Override
    public ResourceSet getCommonResourceSet() {
        // Added "commonResourceSet instanceof EObject && " as this returns an error
        if (this.basicGetCommonResourceSet() != null && this.basicGetCommonResourceSet() instanceof EObject
                && ((EObject) this.basicGetCommonResourceSet()).eIsProxy()) {
            final InternalEObject oldCommonResourceSet = (InternalEObject) this.basicGetCommonResourceSet();
            this.setCommonResourceSet((ResourceSet) this.eResolveProxy(oldCommonResourceSet));
            if (this.basicGetCommonResourceSet() != oldCommonResourceSet) {
                if (this.eNotificationRequired()) {
                    this.eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            RepositoryPackage.REPOSITORIES__COMMON_RESOURCE_SET, oldCommonResourceSet, this
                            .basicGetCommonResourceSet()));
                }
            }
        }
        return this.basicGetCommonResourceSet();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public ResourceSet basicGetCommonResourceSet() {
        return (ResourceSet) this.eDynamicGet(RepositoryPackage.REPOSITORIES__COMMON_RESOURCE_SET,
                RepositoryPackage.Literals.REPOSITORIES__COMMON_RESOURCE_SET, false, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setCommonResourceSet(final ResourceSet newCommonResourceSet) {
        this.eDynamicSet(RepositoryPackage.REPOSITORIES__COMMON_RESOURCE_SET,
                RepositoryPackage.Literals.REPOSITORIES__COMMON_RESOURCE_SET, newCommonResourceSet);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(final InternalEObject otherEnd, final int featureID,
            final NotificationChain msgs) {
        switch (featureID)
        {
        case RepositoryPackage.REPOSITORIES__AVAILABLE_REPOSITORIES:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) this.getAvailableRepositories()).basicAdd(
                    otherEnd,
                    msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID,
            final NotificationChain msgs) {
        switch (featureID)
        {
        case RepositoryPackage.REPOSITORIES__AVAILABLE_REPOSITORIES:
            return ((InternalEList<?>) this.getAvailableRepositories()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
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
        case RepositoryPackage.REPOSITORIES__AVAILABLE_REPOSITORIES:
            return this.getAvailableRepositories();
        case RepositoryPackage.REPOSITORIES__COMMON_RESOURCE_SET:
            if (resolve) {
                return this.getCommonResourceSet();
            }
            return this.basicGetCommonResourceSet();
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
        switch (featureID)
        {
        case RepositoryPackage.REPOSITORIES__AVAILABLE_REPOSITORIES:
            this.getAvailableRepositories().clear();
            this.getAvailableRepositories().addAll((Collection<? extends Repository>) newValue);
            return;
        case RepositoryPackage.REPOSITORIES__COMMON_RESOURCE_SET:
            this.setCommonResourceSet((ResourceSet) newValue);
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
        case RepositoryPackage.REPOSITORIES__AVAILABLE_REPOSITORIES:
            this.getAvailableRepositories().clear();
            return;
        case RepositoryPackage.REPOSITORIES__COMMON_RESOURCE_SET:
            this.setCommonResourceSet((ResourceSet) null);
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
        case RepositoryPackage.REPOSITORIES__AVAILABLE_REPOSITORIES:
            return !this.getAvailableRepositories().isEmpty();
        case RepositoryPackage.REPOSITORIES__COMMON_RESOURCE_SET:
            return this.basicGetCommonResourceSet() != null;
        }
        return super.eIsSet(featureID);
    }

} // RepositoriesImpl
