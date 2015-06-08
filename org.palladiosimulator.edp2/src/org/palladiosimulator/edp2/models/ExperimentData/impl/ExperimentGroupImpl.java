/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.palladiosimulator.edp2.models.ExperimentData.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentGroup;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentGroupRun;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentSetting;
import org.palladiosimulator.edp2.models.ExperimentData.MeasuringType;
import org.palladiosimulator.edp2.models.ExperimentData.Propertyable;
import org.palladiosimulator.edp2.models.Repository.Repository;
import org.palladiosimulator.edp2.models.Repository.RepositoryPackage;
import org.palladiosimulator.edp2.models.measuringpoint.MeasuringPointRepository;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Experiment Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentGroupImpl#getAdditionalInformation
 * <em>Additional Information</em>}</li>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentGroupImpl#getExperimentSettings
 * <em>Experiment Settings</em>}</li>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentGroupImpl#getMeasuringTypes
 * <em>Measuring Types</em>}</li>
 * <li>{@link org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentGroupImpl#getPurpose
 * <em>Purpose</em>}</li>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentGroupImpl#getRepository
 * <em>Repository</em>}</li>
 * <li>{@link org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentGroupImpl#getReports
 * <em>Reports</em>}</li>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentGroupImpl#getMeasuringPointRepositories
 * <em>Measuring Point Repositories</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExperimentGroupImpl extends IdentifierImpl implements ExperimentGroup {

    /**
     * The cached value of the '{@link #getAdditionalInformation() <em>Additional Information</em>}'
     * map. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getAdditionalInformation()
     * @generated
     * @ordered
     */
    protected EMap<String, Object> additionalInformation;

    /**
     * The cached value of the '{@link #getExperimentSettings() <em>Experiment Settings</em>}'
     * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getExperimentSettings()
     * @generated
     * @ordered
     */
    protected EList<ExperimentSetting> experimentSettings;

    /**
     * The cached value of the '{@link #getMeasuringTypes() <em>Measuring Types</em>}' containment
     * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getMeasuringTypes()
     * @generated
     * @ordered
     */
    protected EList<MeasuringType> measuringTypes;

    /**
     * The default value of the '{@link #getPurpose() <em>Purpose</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getPurpose()
     * @generated
     * @ordered
     */
    protected static final String PURPOSE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPurpose() <em>Purpose</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getPurpose()
     * @generated
     * @ordered
     */
    protected String purpose = PURPOSE_EDEFAULT;

    /**
     * The cached value of the '{@link #getRepository() <em>Repository</em>}' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getRepository()
     * @generated
     * @ordered
     */
    protected Repository repository;

    /**
     * The cached value of the '{@link #getReports() <em>Reports</em>}' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getReports()
     * @generated
     * @ordered
     */
    protected EList<ExperimentGroupRun> reports;

    /**
     * The cached value of the '{@link #getMeasuringPointRepositories()
     * <em>Measuring Point Repositories</em>}' containment reference list. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getMeasuringPointRepositories()
     * @generated
     * @ordered
     */
    protected EList<MeasuringPointRepository> measuringPointRepositories;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ExperimentGroupImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ExperimentDataPackage.Literals.EXPERIMENT_GROUP;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EMap<String, Object> getAdditionalInformation() {
        if (this.additionalInformation == null) {
            this.additionalInformation = new EcoreEMap<String, Object>(
                    ExperimentDataPackage.Literals.ESTRINGTO_EOBJECT_MAP_ENTRY, EStringtoEObjectMapEntryImpl.class,
                    this, ExperimentDataPackage.EXPERIMENT_GROUP__ADDITIONAL_INFORMATION);
        }
        return this.additionalInformation;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<ExperimentSetting> getExperimentSettings() {
        if (this.experimentSettings == null) {
            this.experimentSettings = new EObjectContainmentWithInverseEList<ExperimentSetting>(
                    ExperimentSetting.class, this, ExperimentDataPackage.EXPERIMENT_GROUP__EXPERIMENT_SETTINGS,
                    ExperimentDataPackage.EXPERIMENT_SETTING__EXPERIMENT_GROUP);
        }
        return this.experimentSettings;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<MeasuringType> getMeasuringTypes() {
        if (this.measuringTypes == null) {
            this.measuringTypes = new EObjectContainmentWithInverseEList<MeasuringType>(MeasuringType.class, this,
                    ExperimentDataPackage.EXPERIMENT_GROUP__MEASURING_TYPES,
                    ExperimentDataPackage.MEASURING_TYPE__EXPERIMENT_GROUP);
        }
        return this.measuringTypes;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Repository getRepository() {
        if (this.repository != null && ((EObject) this.repository).eIsProxy()) {
            final InternalEObject oldRepository = (InternalEObject) this.repository;
            this.repository = (Repository) this.eResolveProxy(oldRepository);
            if (this.repository != oldRepository) {
                if (this.eNotificationRequired()) {
                    this.eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            ExperimentDataPackage.EXPERIMENT_GROUP__REPOSITORY, oldRepository, this.repository));
                }
            }
        }
        return this.repository;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public Repository basicGetRepository() {
        return this.repository;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetRepository(final Repository newRepository, NotificationChain msgs) {
        final Repository oldRepository = this.repository;
        this.repository = newRepository;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    ExperimentDataPackage.EXPERIMENT_GROUP__REPOSITORY, oldRepository, newRepository);
            if (msgs == null) {
                msgs = notification;
            } else {
                msgs.add(notification);
            }
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setRepository(final Repository newRepository) {
        if (newRepository != this.repository) {
            NotificationChain msgs = null;
            if (this.repository != null) {
                msgs = ((InternalEObject) this.repository).eInverseRemove(this,
                        RepositoryPackage.REPOSITORY__EXPERIMENT_GROUPS, Repository.class, msgs);
            }
            if (newRepository != null) {
                msgs = ((InternalEObject) newRepository).eInverseAdd(this,
                        RepositoryPackage.REPOSITORY__EXPERIMENT_GROUPS, Repository.class, msgs);
            }
            msgs = this.basicSetRepository(newRepository, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        } else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    ExperimentDataPackage.EXPERIMENT_GROUP__REPOSITORY, newRepository, newRepository));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<ExperimentGroupRun> getReports() {
        if (this.reports == null) {
            this.reports = new EObjectContainmentWithInverseEList<ExperimentGroupRun>(ExperimentGroupRun.class, this,
                    ExperimentDataPackage.EXPERIMENT_GROUP__REPORTS,
                    ExperimentDataPackage.EXPERIMENT_GROUP_RUN__EXPERIMENTGROUP);
        }
        return this.reports;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<MeasuringPointRepository> getMeasuringPointRepositories() {
        if (this.measuringPointRepositories == null) {
            this.measuringPointRepositories = new EObjectContainmentEList<MeasuringPointRepository>(
                    MeasuringPointRepository.class, this,
                    ExperimentDataPackage.EXPERIMENT_GROUP__MEASURING_POINT_REPOSITORIES);
        }
        return this.measuringPointRepositories;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String getPurpose() {
        return this.purpose;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setPurpose(final String newPurpose) {
        final String oldPurpose = this.purpose;
        this.purpose = newPurpose;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, ExperimentDataPackage.EXPERIMENT_GROUP__PURPOSE,
                    oldPurpose, this.purpose));
        }
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
        case ExperimentDataPackage.EXPERIMENT_GROUP__EXPERIMENT_SETTINGS:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) this.getExperimentSettings()).basicAdd(
                    otherEnd, msgs);
        case ExperimentDataPackage.EXPERIMENT_GROUP__MEASURING_TYPES:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) this.getMeasuringTypes()).basicAdd(otherEnd,
                    msgs);
        case ExperimentDataPackage.EXPERIMENT_GROUP__REPOSITORY:
            if (this.repository != null) {
                msgs = ((InternalEObject) this.repository).eInverseRemove(this,
                        RepositoryPackage.REPOSITORY__EXPERIMENT_GROUPS, Repository.class, msgs);
            }
            return this.basicSetRepository((Repository) otherEnd, msgs);
        case ExperimentDataPackage.EXPERIMENT_GROUP__REPORTS:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) this.getReports()).basicAdd(otherEnd, msgs);
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
        case ExperimentDataPackage.EXPERIMENT_GROUP__ADDITIONAL_INFORMATION:
            return ((InternalEList<?>) this.getAdditionalInformation()).basicRemove(otherEnd, msgs);
        case ExperimentDataPackage.EXPERIMENT_GROUP__EXPERIMENT_SETTINGS:
            return ((InternalEList<?>) this.getExperimentSettings()).basicRemove(otherEnd, msgs);
        case ExperimentDataPackage.EXPERIMENT_GROUP__MEASURING_TYPES:
            return ((InternalEList<?>) this.getMeasuringTypes()).basicRemove(otherEnd, msgs);
        case ExperimentDataPackage.EXPERIMENT_GROUP__REPOSITORY:
            return this.basicSetRepository(null, msgs);
        case ExperimentDataPackage.EXPERIMENT_GROUP__REPORTS:
            return ((InternalEList<?>) this.getReports()).basicRemove(otherEnd, msgs);
        case ExperimentDataPackage.EXPERIMENT_GROUP__MEASURING_POINT_REPOSITORIES:
            return ((InternalEList<?>) this.getMeasuringPointRepositories()).basicRemove(otherEnd, msgs);
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
        case ExperimentDataPackage.EXPERIMENT_GROUP__ADDITIONAL_INFORMATION:
            if (coreType) {
                return this.getAdditionalInformation();
            } else {
                return this.getAdditionalInformation().map();
            }
        case ExperimentDataPackage.EXPERIMENT_GROUP__EXPERIMENT_SETTINGS:
            return this.getExperimentSettings();
        case ExperimentDataPackage.EXPERIMENT_GROUP__MEASURING_TYPES:
            return this.getMeasuringTypes();
        case ExperimentDataPackage.EXPERIMENT_GROUP__PURPOSE:
            return this.getPurpose();
        case ExperimentDataPackage.EXPERIMENT_GROUP__REPOSITORY:
            if (resolve) {
                return this.getRepository();
            }
            return this.basicGetRepository();
        case ExperimentDataPackage.EXPERIMENT_GROUP__REPORTS:
            return this.getReports();
        case ExperimentDataPackage.EXPERIMENT_GROUP__MEASURING_POINT_REPOSITORIES:
            return this.getMeasuringPointRepositories();
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
        case ExperimentDataPackage.EXPERIMENT_GROUP__ADDITIONAL_INFORMATION:
            ((EStructuralFeature.Setting) this.getAdditionalInformation()).set(newValue);
            return;
        case ExperimentDataPackage.EXPERIMENT_GROUP__EXPERIMENT_SETTINGS:
            this.getExperimentSettings().clear();
            this.getExperimentSettings().addAll((Collection<? extends ExperimentSetting>) newValue);
            return;
        case ExperimentDataPackage.EXPERIMENT_GROUP__MEASURING_TYPES:
            this.getMeasuringTypes().clear();
            this.getMeasuringTypes().addAll((Collection<? extends MeasuringType>) newValue);
            return;
        case ExperimentDataPackage.EXPERIMENT_GROUP__PURPOSE:
            this.setPurpose((String) newValue);
            return;
        case ExperimentDataPackage.EXPERIMENT_GROUP__REPOSITORY:
            this.setRepository((Repository) newValue);
            return;
        case ExperimentDataPackage.EXPERIMENT_GROUP__REPORTS:
            this.getReports().clear();
            this.getReports().addAll((Collection<? extends ExperimentGroupRun>) newValue);
            return;
        case ExperimentDataPackage.EXPERIMENT_GROUP__MEASURING_POINT_REPOSITORIES:
            this.getMeasuringPointRepositories().clear();
            this.getMeasuringPointRepositories().addAll((Collection<? extends MeasuringPointRepository>) newValue);
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
        case ExperimentDataPackage.EXPERIMENT_GROUP__ADDITIONAL_INFORMATION:
            this.getAdditionalInformation().clear();
            return;
        case ExperimentDataPackage.EXPERIMENT_GROUP__EXPERIMENT_SETTINGS:
            this.getExperimentSettings().clear();
            return;
        case ExperimentDataPackage.EXPERIMENT_GROUP__MEASURING_TYPES:
            this.getMeasuringTypes().clear();
            return;
        case ExperimentDataPackage.EXPERIMENT_GROUP__PURPOSE:
            this.setPurpose(PURPOSE_EDEFAULT);
            return;
        case ExperimentDataPackage.EXPERIMENT_GROUP__REPOSITORY:
            this.setRepository((Repository) null);
            return;
        case ExperimentDataPackage.EXPERIMENT_GROUP__REPORTS:
            this.getReports().clear();
            return;
        case ExperimentDataPackage.EXPERIMENT_GROUP__MEASURING_POINT_REPOSITORIES:
            this.getMeasuringPointRepositories().clear();
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
        case ExperimentDataPackage.EXPERIMENT_GROUP__ADDITIONAL_INFORMATION:
            return this.additionalInformation != null && !this.additionalInformation.isEmpty();
        case ExperimentDataPackage.EXPERIMENT_GROUP__EXPERIMENT_SETTINGS:
            return this.experimentSettings != null && !this.experimentSettings.isEmpty();
        case ExperimentDataPackage.EXPERIMENT_GROUP__MEASURING_TYPES:
            return this.measuringTypes != null && !this.measuringTypes.isEmpty();
        case ExperimentDataPackage.EXPERIMENT_GROUP__PURPOSE:
            return PURPOSE_EDEFAULT == null ? this.purpose != null : !PURPOSE_EDEFAULT.equals(this.purpose);
        case ExperimentDataPackage.EXPERIMENT_GROUP__REPOSITORY:
            return this.repository != null;
        case ExperimentDataPackage.EXPERIMENT_GROUP__REPORTS:
            return this.reports != null && !this.reports.isEmpty();
        case ExperimentDataPackage.EXPERIMENT_GROUP__MEASURING_POINT_REPOSITORIES:
            return this.measuringPointRepositories != null && !this.measuringPointRepositories.isEmpty();
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public int eBaseStructuralFeatureID(final int derivedFeatureID, final Class<?> baseClass) {
        if (baseClass == Propertyable.class) {
            switch (derivedFeatureID) {
            case ExperimentDataPackage.EXPERIMENT_GROUP__ADDITIONAL_INFORMATION:
                return ExperimentDataPackage.PROPERTYABLE__ADDITIONAL_INFORMATION;
            default:
                return -1;
            }
        }
        return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID(final int baseFeatureID, final Class<?> baseClass) {
        if (baseClass == Propertyable.class) {
            switch (baseFeatureID) {
            case ExperimentDataPackage.PROPERTYABLE__ADDITIONAL_INFORMATION:
                return ExperimentDataPackage.EXPERIMENT_GROUP__ADDITIONAL_INFORMATION;
            default:
                return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
        result.append(" (purpose: ");
        result.append(this.purpose);
        result.append(')');
        return result.toString();
    }

} // ExperimentGroupImpl
