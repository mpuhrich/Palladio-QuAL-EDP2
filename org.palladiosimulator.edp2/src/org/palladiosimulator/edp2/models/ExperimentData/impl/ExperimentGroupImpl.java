/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.palladiosimulator.edp2.models.ExperimentData.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
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
     * The default value of the '{@link #getPurpose() <em>Purpose</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getPurpose()
     * @generated
     * @ordered
     */
    protected static final String PURPOSE_EDEFAULT = null;

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
    @SuppressWarnings("unchecked")
    @Override
    public EMap<String, Object> getAdditionalInformation() {
        return (EMap<String, Object>) this.eDynamicGet(ExperimentDataPackage.EXPERIMENT_GROUP__ADDITIONAL_INFORMATION,
                ExperimentDataPackage.Literals.PROPERTYABLE__ADDITIONAL_INFORMATION, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public EList<ExperimentSetting> getExperimentSettings() {
        return (EList<ExperimentSetting>) this.eDynamicGet(ExperimentDataPackage.EXPERIMENT_GROUP__EXPERIMENT_SETTINGS,
                ExperimentDataPackage.Literals.EXPERIMENT_GROUP__EXPERIMENT_SETTINGS, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public EList<MeasuringType> getMeasuringTypes() {
        return (EList<MeasuringType>) this.eDynamicGet(ExperimentDataPackage.EXPERIMENT_GROUP__MEASURING_TYPES,
                ExperimentDataPackage.Literals.EXPERIMENT_GROUP__MEASURING_TYPES, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Repository getRepository() {
        return (Repository) this.eDynamicGet(ExperimentDataPackage.EXPERIMENT_GROUP__REPOSITORY,
                ExperimentDataPackage.Literals.EXPERIMENT_GROUP__REPOSITORY, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public Repository basicGetRepository() {
        return (Repository) this.eDynamicGet(ExperimentDataPackage.EXPERIMENT_GROUP__REPOSITORY,
                ExperimentDataPackage.Literals.EXPERIMENT_GROUP__REPOSITORY, false, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetRepository(final Repository newRepository, NotificationChain msgs) {
        msgs = this.eDynamicInverseAdd((InternalEObject) newRepository,
                ExperimentDataPackage.EXPERIMENT_GROUP__REPOSITORY,
                msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setRepository(final Repository newRepository) {
        this.eDynamicSet(ExperimentDataPackage.EXPERIMENT_GROUP__REPOSITORY,
                ExperimentDataPackage.Literals.EXPERIMENT_GROUP__REPOSITORY, newRepository);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public EList<ExperimentGroupRun> getReports() {
        return (EList<ExperimentGroupRun>) this.eDynamicGet(ExperimentDataPackage.EXPERIMENT_GROUP__REPORTS,
                ExperimentDataPackage.Literals.EXPERIMENT_GROUP__REPORTS, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public EList<MeasuringPointRepository> getMeasuringPointRepositories() {
        return (EList<MeasuringPointRepository>) this.eDynamicGet(
                ExperimentDataPackage.EXPERIMENT_GROUP__MEASURING_POINT_REPOSITORIES,
                ExperimentDataPackage.Literals.EXPERIMENT_GROUP__MEASURING_POINT_REPOSITORIES, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String getPurpose() {
        return (String) this.eDynamicGet(ExperimentDataPackage.EXPERIMENT_GROUP__PURPOSE,
                ExperimentDataPackage.Literals.EXPERIMENT_GROUP__PURPOSE, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setPurpose(final String newPurpose) {
        this.eDynamicSet(ExperimentDataPackage.EXPERIMENT_GROUP__PURPOSE,
                ExperimentDataPackage.Literals.EXPERIMENT_GROUP__PURPOSE, newPurpose);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(final InternalEObject otherEnd, final int featureID, NotificationChain msgs) {
        switch (featureID)
        {
        case ExperimentDataPackage.EXPERIMENT_GROUP__EXPERIMENT_SETTINGS:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) this.getExperimentSettings()).basicAdd(
                    otherEnd,
                    msgs);
        case ExperimentDataPackage.EXPERIMENT_GROUP__MEASURING_TYPES:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) this.getMeasuringTypes()).basicAdd(otherEnd,
                    msgs);
        case ExperimentDataPackage.EXPERIMENT_GROUP__REPOSITORY:
            final Repository repository = this.basicGetRepository();
            if (repository != null) {
                msgs = ((InternalEObject) repository).eInverseRemove(this,
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
        switch (featureID)
        {
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
        switch (featureID)
        {
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
        switch (featureID)
        {
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
        switch (featureID)
        {
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
        switch (featureID)
        {
        case ExperimentDataPackage.EXPERIMENT_GROUP__ADDITIONAL_INFORMATION:
            return !this.getAdditionalInformation().isEmpty();
        case ExperimentDataPackage.EXPERIMENT_GROUP__EXPERIMENT_SETTINGS:
            return !this.getExperimentSettings().isEmpty();
        case ExperimentDataPackage.EXPERIMENT_GROUP__MEASURING_TYPES:
            return !this.getMeasuringTypes().isEmpty();
        case ExperimentDataPackage.EXPERIMENT_GROUP__PURPOSE:
            return PURPOSE_EDEFAULT == null ? this.getPurpose() != null : !PURPOSE_EDEFAULT.equals(this.getPurpose());
        case ExperimentDataPackage.EXPERIMENT_GROUP__REPOSITORY:
            return this.basicGetRepository() != null;
        case ExperimentDataPackage.EXPERIMENT_GROUP__REPORTS:
            return !this.getReports().isEmpty();
        case ExperimentDataPackage.EXPERIMENT_GROUP__MEASURING_POINT_REPOSITORIES:
            return !this.getMeasuringPointRepositories().isEmpty();
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
        if (baseClass == Propertyable.class)
        {
            switch (derivedFeatureID)
            {
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
        if (baseClass == Propertyable.class)
        {
            switch (baseFeatureID)
            {
            case ExperimentDataPackage.PROPERTYABLE__ADDITIONAL_INFORMATION:
                return ExperimentDataPackage.EXPERIMENT_GROUP__ADDITIONAL_INFORMATION;
            default:
                return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} // ExperimentGroupImpl
