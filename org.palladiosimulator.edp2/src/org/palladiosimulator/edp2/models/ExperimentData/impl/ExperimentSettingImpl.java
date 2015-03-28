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
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentGroup;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentRun;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentSetting;
import org.palladiosimulator.edp2.models.ExperimentData.MeasuringType;
import org.palladiosimulator.edp2.models.ExperimentData.Propertyable;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Experiment Setting</b></em>
 * '. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentSettingImpl#getAdditionalInformation
 * <em>Additional Information</em>}</li>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentSettingImpl#getDescription
 * <em>Description</em>}</li>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentSettingImpl#getExperimentRuns
 * <em>Experiment Runs</em>}</li>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentSettingImpl#getMeasuringTypes
 * <em>Measuring Types</em>}</li>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentSettingImpl#getExperimentGroup
 * <em>Experiment Group</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExperimentSettingImpl extends IdentifierImpl implements ExperimentSetting {
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
     * The default value of the '{@link #getDescription() <em>Description</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getDescription()
     * @generated
     * @ordered
     */
    protected static final String DESCRIPTION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getDescription()
     * @generated
     * @ordered
     */
    protected String description = DESCRIPTION_EDEFAULT;

    /**
     * The cached value of the '{@link #getExperimentRuns() <em>Experiment Runs</em>}' containment
     * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getExperimentRuns()
     * @generated
     * @ordered
     */
    protected EList<ExperimentRun> experimentRuns;

    /**
     * The cached value of the '{@link #getMeasuringTypes() <em>Measuring Types</em>}' reference
     * list. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getMeasuringTypes()
     * @generated
     * @ordered
     */
    protected EList<MeasuringType> measuringTypes;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ExperimentSettingImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ExperimentDataPackage.Literals.EXPERIMENT_SETTING;
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
                    this, ExperimentDataPackage.EXPERIMENT_SETTING__ADDITIONAL_INFORMATION);
        }
        return this.additionalInformation;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String getDescription() {
        return this.description;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setDescription(final String newDescription) {
        final String oldDescription = this.description;
        this.description = newDescription;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    ExperimentDataPackage.EXPERIMENT_SETTING__DESCRIPTION, oldDescription, this.description));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<ExperimentRun> getExperimentRuns() {
        if (this.experimentRuns == null) {
            this.experimentRuns = new EObjectContainmentWithInverseEList<ExperimentRun>(ExperimentRun.class, this,
                    ExperimentDataPackage.EXPERIMENT_SETTING__EXPERIMENT_RUNS,
                    ExperimentDataPackage.EXPERIMENT_RUN__EXPERIMENT_SETTING);
        }
        return this.experimentRuns;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<MeasuringType> getMeasuringTypes() {
        if (this.measuringTypes == null) {
            this.measuringTypes = new EObjectWithInverseResolvingEList.ManyInverse<MeasuringType>(MeasuringType.class,
                    this, ExperimentDataPackage.EXPERIMENT_SETTING__MEASURING_TYPES,
                    ExperimentDataPackage.MEASURING_TYPE__EXPERIMENT_SETTINGS);
        }
        return this.measuringTypes;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ExperimentGroup getExperimentGroup() {
        if (this.eContainerFeatureID() != ExperimentDataPackage.EXPERIMENT_SETTING__EXPERIMENT_GROUP) {
            return null;
        }
        return (ExperimentGroup) this.eInternalContainer();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetExperimentGroup(final ExperimentGroup newExperimentGroup, NotificationChain msgs) {
        msgs = this.eBasicSetContainer((InternalEObject) newExperimentGroup,
                ExperimentDataPackage.EXPERIMENT_SETTING__EXPERIMENT_GROUP, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setExperimentGroup(final ExperimentGroup newExperimentGroup) {
        if (newExperimentGroup != this.eInternalContainer()
                || (this.eContainerFeatureID() != ExperimentDataPackage.EXPERIMENT_SETTING__EXPERIMENT_GROUP && newExperimentGroup != null)) {
            if (EcoreUtil.isAncestor(this, newExperimentGroup)) {
                throw new IllegalArgumentException("Recursive containment not allowed for " + this.toString());
            }
            NotificationChain msgs = null;
            if (this.eInternalContainer() != null) {
                msgs = this.eBasicRemoveFromContainer(msgs);
            }
            if (newExperimentGroup != null) {
                msgs = ((InternalEObject) newExperimentGroup).eInverseAdd(this,
                        ExperimentDataPackage.EXPERIMENT_GROUP__EXPERIMENT_SETTINGS, ExperimentGroup.class, msgs);
            }
            msgs = this.basicSetExperimentGroup(newExperimentGroup, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        } else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    ExperimentDataPackage.EXPERIMENT_SETTING__EXPERIMENT_GROUP, newExperimentGroup, newExperimentGroup));
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
        case ExperimentDataPackage.EXPERIMENT_SETTING__EXPERIMENT_RUNS:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) this.getExperimentRuns()).basicAdd(otherEnd,
                    msgs);
        case ExperimentDataPackage.EXPERIMENT_SETTING__MEASURING_TYPES:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) this.getMeasuringTypes()).basicAdd(otherEnd,
                    msgs);
        case ExperimentDataPackage.EXPERIMENT_SETTING__EXPERIMENT_GROUP:
            if (this.eInternalContainer() != null) {
                msgs = this.eBasicRemoveFromContainer(msgs);
            }
            return this.basicSetExperimentGroup((ExperimentGroup) otherEnd, msgs);
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
        case ExperimentDataPackage.EXPERIMENT_SETTING__ADDITIONAL_INFORMATION:
            return ((InternalEList<?>) this.getAdditionalInformation()).basicRemove(otherEnd, msgs);
        case ExperimentDataPackage.EXPERIMENT_SETTING__EXPERIMENT_RUNS:
            return ((InternalEList<?>) this.getExperimentRuns()).basicRemove(otherEnd, msgs);
        case ExperimentDataPackage.EXPERIMENT_SETTING__MEASURING_TYPES:
            return ((InternalEList<?>) this.getMeasuringTypes()).basicRemove(otherEnd, msgs);
        case ExperimentDataPackage.EXPERIMENT_SETTING__EXPERIMENT_GROUP:
            return this.basicSetExperimentGroup(null, msgs);
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
        case ExperimentDataPackage.EXPERIMENT_SETTING__EXPERIMENT_GROUP:
            return this.eInternalContainer().eInverseRemove(this,
                    ExperimentDataPackage.EXPERIMENT_GROUP__EXPERIMENT_SETTINGS, ExperimentGroup.class, msgs);
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
        case ExperimentDataPackage.EXPERIMENT_SETTING__ADDITIONAL_INFORMATION:
            if (coreType) {
                return this.getAdditionalInformation();
            } else {
                return this.getAdditionalInformation().map();
            }
        case ExperimentDataPackage.EXPERIMENT_SETTING__DESCRIPTION:
            return this.getDescription();
        case ExperimentDataPackage.EXPERIMENT_SETTING__EXPERIMENT_RUNS:
            return this.getExperimentRuns();
        case ExperimentDataPackage.EXPERIMENT_SETTING__MEASURING_TYPES:
            return this.getMeasuringTypes();
        case ExperimentDataPackage.EXPERIMENT_SETTING__EXPERIMENT_GROUP:
            return this.getExperimentGroup();
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
        case ExperimentDataPackage.EXPERIMENT_SETTING__ADDITIONAL_INFORMATION:
            ((EStructuralFeature.Setting) this.getAdditionalInformation()).set(newValue);
            return;
        case ExperimentDataPackage.EXPERIMENT_SETTING__DESCRIPTION:
            this.setDescription((String) newValue);
            return;
        case ExperimentDataPackage.EXPERIMENT_SETTING__EXPERIMENT_RUNS:
            this.getExperimentRuns().clear();
            this.getExperimentRuns().addAll((Collection<? extends ExperimentRun>) newValue);
            return;
        case ExperimentDataPackage.EXPERIMENT_SETTING__MEASURING_TYPES:
            this.getMeasuringTypes().clear();
            this.getMeasuringTypes().addAll((Collection<? extends MeasuringType>) newValue);
            return;
        case ExperimentDataPackage.EXPERIMENT_SETTING__EXPERIMENT_GROUP:
            this.setExperimentGroup((ExperimentGroup) newValue);
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
        case ExperimentDataPackage.EXPERIMENT_SETTING__ADDITIONAL_INFORMATION:
            this.getAdditionalInformation().clear();
            return;
        case ExperimentDataPackage.EXPERIMENT_SETTING__DESCRIPTION:
            this.setDescription(DESCRIPTION_EDEFAULT);
            return;
        case ExperimentDataPackage.EXPERIMENT_SETTING__EXPERIMENT_RUNS:
            this.getExperimentRuns().clear();
            return;
        case ExperimentDataPackage.EXPERIMENT_SETTING__MEASURING_TYPES:
            this.getMeasuringTypes().clear();
            return;
        case ExperimentDataPackage.EXPERIMENT_SETTING__EXPERIMENT_GROUP:
            this.setExperimentGroup((ExperimentGroup) null);
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
        case ExperimentDataPackage.EXPERIMENT_SETTING__ADDITIONAL_INFORMATION:
            return this.additionalInformation != null && !this.additionalInformation.isEmpty();
        case ExperimentDataPackage.EXPERIMENT_SETTING__DESCRIPTION:
            return DESCRIPTION_EDEFAULT == null ? this.description != null : !DESCRIPTION_EDEFAULT
                    .equals(this.description);
        case ExperimentDataPackage.EXPERIMENT_SETTING__EXPERIMENT_RUNS:
            return this.experimentRuns != null && !this.experimentRuns.isEmpty();
        case ExperimentDataPackage.EXPERIMENT_SETTING__MEASURING_TYPES:
            return this.measuringTypes != null && !this.measuringTypes.isEmpty();
        case ExperimentDataPackage.EXPERIMENT_SETTING__EXPERIMENT_GROUP:
            return this.getExperimentGroup() != null;
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
            case ExperimentDataPackage.EXPERIMENT_SETTING__ADDITIONAL_INFORMATION:
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
                return ExperimentDataPackage.EXPERIMENT_SETTING__ADDITIONAL_INFORMATION;
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
        result.append(" (description: ");
        result.append(this.description);
        result.append(')');
        return result.toString();
    }

} // ExperimentSettingImpl
