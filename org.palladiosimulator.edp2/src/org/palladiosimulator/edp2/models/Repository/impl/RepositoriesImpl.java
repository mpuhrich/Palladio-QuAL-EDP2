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
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
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
public class RepositoriesImpl extends EObjectImpl implements Repositories {

    /**
     * The cached value of the '{@link #getAvailableRepositories() <em>Available Repositories</em>}'
     * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getAvailableRepositories()
     * @generated
     * @ordered
     */
    protected EList<Repository> availableRepositories;

    /**
     * The cached value of the '{@link #getCommonResourceSet() <em>Common Resource Set</em>}'
     * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getCommonResourceSet()
     * @generated
     * @ordered
     */
    protected ResourceSet commonResourceSet;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated NOT
     */
    protected RepositoriesImpl() {
        super();
        // DEFAULT: Generate a new resource set by which all EMF resources are managed.
        this.commonResourceSet = EmfModelXMIResourceFactoryImpl.createResourceSet();
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
    public EList<Repository> getAvailableRepositories() {
        if (this.availableRepositories == null) {
            this.availableRepositories = new EObjectContainmentWithInverseEList<Repository>(Repository.class, this,
                    RepositoryPackage.REPOSITORIES__AVAILABLE_REPOSITORIES, RepositoryPackage.REPOSITORY__REPOSITORIES);
        }
        return this.availableRepositories;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated NOT
     */
    @Override
    public ResourceSet getCommonResourceSet() {
        // Added "commonResourceSet instanceof EObject && " as this returns an error
        if (this.commonResourceSet != null && this.commonResourceSet instanceof EObject
                && ((EObject) this.commonResourceSet).eIsProxy()) {
            final InternalEObject oldCommonResourceSet = (InternalEObject) this.commonResourceSet;
            this.commonResourceSet = (ResourceSet) this.eResolveProxy(oldCommonResourceSet);
            if (this.commonResourceSet != oldCommonResourceSet) {
                if (this.eNotificationRequired()) {
                    this.eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            RepositoryPackage.REPOSITORIES__COMMON_RESOURCE_SET, oldCommonResourceSet,
                            this.commonResourceSet));
                }
            }
        }
        return this.commonResourceSet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public ResourceSet basicGetCommonResourceSet() {
        return this.commonResourceSet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setCommonResourceSet(final ResourceSet newCommonResourceSet) {
        final ResourceSet oldCommonResourceSet = this.commonResourceSet;
        this.commonResourceSet = newCommonResourceSet;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    RepositoryPackage.REPOSITORIES__COMMON_RESOURCE_SET, oldCommonResourceSet, this.commonResourceSet));
        }
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
        switch (featureID) {
        case RepositoryPackage.REPOSITORIES__AVAILABLE_REPOSITORIES:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) this.getAvailableRepositories()).basicAdd(
                    otherEnd, msgs);
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
        switch (featureID) {
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
        switch (featureID) {
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
        switch (featureID) {
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
        switch (featureID) {
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
        switch (featureID) {
        case RepositoryPackage.REPOSITORIES__AVAILABLE_REPOSITORIES:
            return this.availableRepositories != null && !this.availableRepositories.isEmpty();
        case RepositoryPackage.REPOSITORIES__COMMON_RESOURCE_SET:
            return this.commonResourceSet != null;
        }
        return super.eIsSet(featureID);
    }

} // RepositoriesImpl
