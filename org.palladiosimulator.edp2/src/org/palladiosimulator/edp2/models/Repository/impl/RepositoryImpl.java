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
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.palladiosimulator.edp2.dao.MeasurementsDaoFactory;
import org.palladiosimulator.edp2.dao.MetaDao;
import org.palladiosimulator.edp2.dao.exception.DataNotAccessibleException;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentGroup;
import org.palladiosimulator.edp2.models.Repository.Repositories;
import org.palladiosimulator.edp2.models.Repository.Repository;
import org.palladiosimulator.edp2.models.Repository.RepositoryPackage;
import org.palladiosimulator.metricspec.Description;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Repository</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.palladiosimulator.edp2.models.Repository.impl.RepositoryImpl#getRepositories <em>
 * Repositories</em>}</li>
 * <li>{@link org.palladiosimulator.edp2.models.Repository.impl.RepositoryImpl#getExperimentGroups
 * <em>Experiment Groups</em>}</li>
 * <li>{@link org.palladiosimulator.edp2.models.Repository.impl.RepositoryImpl#isReadOnly <em>Read
 * Only</em>}</li>
 * <li>{@link org.palladiosimulator.edp2.models.Repository.impl.RepositoryImpl#getDescriptions <em>
 * Descriptions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RepositoryImpl extends IdentifierImpl implements Repository {
    /**
     * The cached value of the '{@link #getExperimentGroups() <em>Experiment Groups</em>}' reference
     * list. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getExperimentGroups()
     * @generated
     * @ordered
     */
    protected EList<ExperimentGroup> experimentGroups;

    /**
     * The default value of the '{@link #isReadOnly() <em>Read Only</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #isReadOnly()
     * @generated
     * @ordered
     */
    protected static final boolean READ_ONLY_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isReadOnly() <em>Read Only</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #isReadOnly()
     * @generated
     * @ordered
     */
    protected boolean readOnly = READ_ONLY_EDEFAULT;

    /**
     * The cached value of the '{@link #getDescriptions() <em>Descriptions</em>}' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getDescriptions()
     * @generated
     * @ordered
     */
    protected EList<Description> descriptions;

    /**
     * The DAO to load/access/store the data handled by this repository.
     *
     * @generated NOT
     */
    protected MetaDao metaDao;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated NOT
     */
    protected RepositoryImpl() {
        super();
        this.metaDao = null;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return RepositoryPackage.Literals.REPOSITORY;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Repositories getRepositories() {
        if (this.eContainerFeatureID() != RepositoryPackage.REPOSITORY__REPOSITORIES) {
            return null;
        }
        return (Repositories) this.eInternalContainer();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetRepositories(final Repositories newRepositories, NotificationChain msgs) {
        msgs = this.eBasicSetContainer((InternalEObject) newRepositories, RepositoryPackage.REPOSITORY__REPOSITORIES,
                msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setRepositories(final Repositories newRepositories) {
        if (newRepositories != this.eInternalContainer()
                || (this.eContainerFeatureID() != RepositoryPackage.REPOSITORY__REPOSITORIES && newRepositories != null)) {
            if (EcoreUtil.isAncestor(this, newRepositories)) {
                throw new IllegalArgumentException("Recursive containment not allowed for " + this.toString());
            }
            NotificationChain msgs = null;
            if (this.eInternalContainer() != null) {
                msgs = this.eBasicRemoveFromContainer(msgs);
            }
            if (newRepositories != null) {
                msgs = ((InternalEObject) newRepositories).eInverseAdd(this,
                        RepositoryPackage.REPOSITORIES__AVAILABLE_REPOSITORIES, Repositories.class, msgs);
            }
            msgs = this.basicSetRepositories(newRepositories, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        } else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.REPOSITORY__REPOSITORIES,
                    newRepositories, newRepositories));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isReadOnly() {
        return this.readOnly;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setReadOnly(final boolean newReadOnly) {
        final boolean oldReadOnly = this.readOnly;
        this.readOnly = newReadOnly;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.REPOSITORY__READ_ONLY,
                    oldReadOnly, this.readOnly));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<Description> getDescriptions() {
        if (this.descriptions == null) {
            this.descriptions = new EObjectResolvingEList<Description>(Description.class, this,
                    RepositoryPackage.REPOSITORY__DESCRIPTIONS);
        }
        return this.descriptions;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<ExperimentGroup> getExperimentGroups() {
        if (this.experimentGroups == null) {
            this.experimentGroups = new EObjectWithInverseResolvingEList<ExperimentGroup>(ExperimentGroup.class, this,
                    RepositoryPackage.REPOSITORY__EXPERIMENT_GROUPS, ExperimentDataPackage.EXPERIMENT_GROUP__REPOSITORY);
        }
        return this.experimentGroups;
    }

    /**
     * <!-- begin-user-doc --> Resets the experiment groups attribute. <!-- end-user-doc -->
     *
     * @generated NOT
     */
    @Override
    public void resetExperimentGroups() {
        this.experimentGroups = new EObjectWithInverseResolvingEList<ExperimentGroup>(ExperimentGroup.class, this,
                RepositoryPackage.REPOSITORY__EXPERIMENT_GROUPS, ExperimentDataPackage.EXPERIMENT_GROUP__REPOSITORY);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(final InternalEObject otherEnd, final int featureID, NotificationChain msgs) {
        switch (featureID) {
        case RepositoryPackage.REPOSITORY__REPOSITORIES:
            if (this.eInternalContainer() != null) {
                msgs = this.eBasicRemoveFromContainer(msgs);
            }
            return this.basicSetRepositories((Repositories) otherEnd, msgs);
        case RepositoryPackage.REPOSITORY__EXPERIMENT_GROUPS:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) this.getExperimentGroups()).basicAdd(otherEnd,
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
        switch (featureID) {
        case RepositoryPackage.REPOSITORY__REPOSITORIES:
            return this.basicSetRepositories(null, msgs);
        case RepositoryPackage.REPOSITORY__EXPERIMENT_GROUPS:
            return ((InternalEList<?>) this.getExperimentGroups()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature(final NotificationChain msgs) {
        switch (this.eContainerFeatureID()) {
        case RepositoryPackage.REPOSITORY__REPOSITORIES:
            return this.eInternalContainer().eInverseRemove(this,
                    RepositoryPackage.REPOSITORIES__AVAILABLE_REPOSITORIES, Repositories.class, msgs);
        }
        return super.eBasicRemoveFromContainerFeature(msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case RepositoryPackage.REPOSITORY__REPOSITORIES:
            return this.getRepositories();
        case RepositoryPackage.REPOSITORY__EXPERIMENT_GROUPS:
            return this.getExperimentGroups();
        case RepositoryPackage.REPOSITORY__READ_ONLY:
            return this.isReadOnly();
        case RepositoryPackage.REPOSITORY__DESCRIPTIONS:
            return this.getDescriptions();
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
        case RepositoryPackage.REPOSITORY__REPOSITORIES:
            this.setRepositories((Repositories) newValue);
            return;
        case RepositoryPackage.REPOSITORY__EXPERIMENT_GROUPS:
            this.getExperimentGroups().clear();
            this.getExperimentGroups().addAll((Collection<? extends ExperimentGroup>) newValue);
            return;
        case RepositoryPackage.REPOSITORY__READ_ONLY:
            this.setReadOnly((Boolean) newValue);
            return;
        case RepositoryPackage.REPOSITORY__DESCRIPTIONS:
            this.getDescriptions().clear();
            this.getDescriptions().addAll((Collection<? extends Description>) newValue);
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
        case RepositoryPackage.REPOSITORY__REPOSITORIES:
            this.setRepositories((Repositories) null);
            return;
        case RepositoryPackage.REPOSITORY__EXPERIMENT_GROUPS:
            this.getExperimentGroups().clear();
            return;
        case RepositoryPackage.REPOSITORY__READ_ONLY:
            this.setReadOnly(READ_ONLY_EDEFAULT);
            return;
        case RepositoryPackage.REPOSITORY__DESCRIPTIONS:
            this.getDescriptions().clear();
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
        case RepositoryPackage.REPOSITORY__REPOSITORIES:
            return this.getRepositories() != null;
        case RepositoryPackage.REPOSITORY__EXPERIMENT_GROUPS:
            return this.experimentGroups != null && !this.experimentGroups.isEmpty();
        case RepositoryPackage.REPOSITORY__READ_ONLY:
            return this.readOnly != READ_ONLY_EDEFAULT;
        case RepositoryPackage.REPOSITORY__DESCRIPTIONS:
            return this.descriptions != null && !this.descriptions.isEmpty();
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String toString() {
        if (this.eIsProxy()) {
            return super.toString();
        }

        final StringBuffer result = new StringBuffer(super.toString());
        result.append(" (readOnly: ");
        result.append(this.readOnly);
        result.append(')');
        return result.toString();
    }

    @Override
    public MeasurementsDaoFactory getMeasurementsDaoFactory() {
        if (this.metaDao != null) {
            return this.metaDao.getMeasurementsDaoFactory();
        } else {
            return null;
        }
    }

    @Override
    public boolean canClose() {
        if (this.metaDao != null) {
            return this.metaDao.canClose();
        } else {
            return false;
        }
    }

    @Override
    public boolean canDelete() {
        if (this.metaDao != null) {
            return this.metaDao.canDelete();
        } else {
            return false;
        }
    }

    @Override
    public boolean canOpen() {
        if (this.metaDao != null) {
            return this.metaDao.canOpen();
        } else {
            return false;
        }
    }

    @Override
    public void close() throws DataNotAccessibleException {
        if (this.metaDao != null) {
            this.metaDao.close();
        }
    }

    @Override
    public void delete() throws DataNotAccessibleException {
        if (this.metaDao != null) {
            this.metaDao.delete();
        }
    }

    @Override
    public boolean isDeleted() {
        if (this.metaDao != null) {
            return this.metaDao.isDeleted();
        } else {
            return false;
        }
    }

    @Override
    public boolean isOpen() {
        if (this.metaDao != null) {
            return this.metaDao.isOpen();
        } else {
            return false;
        }
    }

    @Override
    public void open() throws DataNotAccessibleException {
        if (this.metaDao != null) {
            this.metaDao.open();
        }
    }

    @Override
    public void flush() {
        if (this.metaDao != null) {
            this.metaDao.flush();
        }
    }

} // RepositoryImpl
