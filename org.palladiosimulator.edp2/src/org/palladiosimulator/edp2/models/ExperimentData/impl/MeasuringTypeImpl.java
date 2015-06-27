/**
 */
package org.palladiosimulator.edp2.models.ExperimentData.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentGroup;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentSetting;
import org.palladiosimulator.edp2.models.ExperimentData.MeasuringType;
import org.palladiosimulator.edp2.models.measuringpoint.MeasuringPoint;
import org.palladiosimulator.metricspec.MetricDescription;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Measuring Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.MeasuringTypeImpl#getExperimentGroup
 * <em>Experiment Group</em>}</li>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.MeasuringTypeImpl#getExperimentSettings
 * <em>Experiment Settings</em>}</li>
 * <li>{@link org.palladiosimulator.edp2.models.ExperimentData.impl.MeasuringTypeImpl#getMetric <em>
 * Metric</em>}</li>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.MeasuringTypeImpl#getMeasuringPoint
 * <em>Measuring Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MeasuringTypeImpl extends IdentifierImpl implements MeasuringType {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected MeasuringTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ExperimentDataPackage.Literals.MEASURING_TYPE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ExperimentGroup getExperimentGroup() {
        return (ExperimentGroup) this.eDynamicGet(ExperimentDataPackage.MEASURING_TYPE__EXPERIMENT_GROUP,
                ExperimentDataPackage.Literals.MEASURING_TYPE__EXPERIMENT_GROUP, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetExperimentGroup(final ExperimentGroup newExperimentGroup, NotificationChain msgs) {
        msgs = this.eBasicSetContainer((InternalEObject) newExperimentGroup,
                ExperimentDataPackage.MEASURING_TYPE__EXPERIMENT_GROUP, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setExperimentGroup(final ExperimentGroup newExperimentGroup) {
        this.eDynamicSet(ExperimentDataPackage.MEASURING_TYPE__EXPERIMENT_GROUP,
                ExperimentDataPackage.Literals.MEASURING_TYPE__EXPERIMENT_GROUP, newExperimentGroup);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public EList<ExperimentSetting> getExperimentSettings() {
        return (EList<ExperimentSetting>) this.eDynamicGet(ExperimentDataPackage.MEASURING_TYPE__EXPERIMENT_SETTINGS,
                ExperimentDataPackage.Literals.MEASURING_TYPE__EXPERIMENT_SETTINGS, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public MetricDescription getMetric() {
        return (MetricDescription) this.eDynamicGet(ExperimentDataPackage.MEASURING_TYPE__METRIC,
                ExperimentDataPackage.Literals.MEASURING_TYPE__METRIC, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public MetricDescription basicGetMetric() {
        return (MetricDescription) this.eDynamicGet(ExperimentDataPackage.MEASURING_TYPE__METRIC,
                ExperimentDataPackage.Literals.MEASURING_TYPE__METRIC, false, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setMetric(final MetricDescription newMetric) {
        this.eDynamicSet(ExperimentDataPackage.MEASURING_TYPE__METRIC,
                ExperimentDataPackage.Literals.MEASURING_TYPE__METRIC, newMetric);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public MeasuringPoint getMeasuringPoint() {
        return (MeasuringPoint) this.eDynamicGet(ExperimentDataPackage.MEASURING_TYPE__MEASURING_POINT,
                ExperimentDataPackage.Literals.MEASURING_TYPE__MEASURING_POINT, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public MeasuringPoint basicGetMeasuringPoint() {
        return (MeasuringPoint) this.eDynamicGet(ExperimentDataPackage.MEASURING_TYPE__MEASURING_POINT,
                ExperimentDataPackage.Literals.MEASURING_TYPE__MEASURING_POINT, false, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setMeasuringPoint(final MeasuringPoint newMeasuringPoint) {
        this.eDynamicSet(ExperimentDataPackage.MEASURING_TYPE__MEASURING_POINT,
                ExperimentDataPackage.Literals.MEASURING_TYPE__MEASURING_POINT, newMeasuringPoint);
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
        case ExperimentDataPackage.MEASURING_TYPE__EXPERIMENT_GROUP:
            if (this.eInternalContainer() != null) {
                msgs = this.eBasicRemoveFromContainer(msgs);
            }
            return this.basicSetExperimentGroup((ExperimentGroup) otherEnd, msgs);
        case ExperimentDataPackage.MEASURING_TYPE__EXPERIMENT_SETTINGS:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) this.getExperimentSettings()).basicAdd(
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
        case ExperimentDataPackage.MEASURING_TYPE__EXPERIMENT_GROUP:
            return this.basicSetExperimentGroup(null, msgs);
        case ExperimentDataPackage.MEASURING_TYPE__EXPERIMENT_SETTINGS:
            return ((InternalEList<?>) this.getExperimentSettings()).basicRemove(otherEnd, msgs);
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
        switch (this.eContainerFeatureID())
        {
        case ExperimentDataPackage.MEASURING_TYPE__EXPERIMENT_GROUP:
            return this.eInternalContainer().eInverseRemove(this,
                    ExperimentDataPackage.EXPERIMENT_GROUP__MEASURING_TYPES,
                    ExperimentGroup.class, msgs);
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
        switch (featureID)
        {
        case ExperimentDataPackage.MEASURING_TYPE__EXPERIMENT_GROUP:
            return this.getExperimentGroup();
        case ExperimentDataPackage.MEASURING_TYPE__EXPERIMENT_SETTINGS:
            return this.getExperimentSettings();
        case ExperimentDataPackage.MEASURING_TYPE__METRIC:
            if (resolve) {
                return this.getMetric();
            }
            return this.basicGetMetric();
        case ExperimentDataPackage.MEASURING_TYPE__MEASURING_POINT:
            if (resolve) {
                return this.getMeasuringPoint();
            }
            return this.basicGetMeasuringPoint();
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
        case ExperimentDataPackage.MEASURING_TYPE__EXPERIMENT_GROUP:
            this.setExperimentGroup((ExperimentGroup) newValue);
            return;
        case ExperimentDataPackage.MEASURING_TYPE__EXPERIMENT_SETTINGS:
            this.getExperimentSettings().clear();
            this.getExperimentSettings().addAll((Collection<? extends ExperimentSetting>) newValue);
            return;
        case ExperimentDataPackage.MEASURING_TYPE__METRIC:
            this.setMetric((MetricDescription) newValue);
            return;
        case ExperimentDataPackage.MEASURING_TYPE__MEASURING_POINT:
            this.setMeasuringPoint((MeasuringPoint) newValue);
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
        case ExperimentDataPackage.MEASURING_TYPE__EXPERIMENT_GROUP:
            this.setExperimentGroup((ExperimentGroup) null);
            return;
        case ExperimentDataPackage.MEASURING_TYPE__EXPERIMENT_SETTINGS:
            this.getExperimentSettings().clear();
            return;
        case ExperimentDataPackage.MEASURING_TYPE__METRIC:
            this.setMetric((MetricDescription) null);
            return;
        case ExperimentDataPackage.MEASURING_TYPE__MEASURING_POINT:
            this.setMeasuringPoint((MeasuringPoint) null);
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
        case ExperimentDataPackage.MEASURING_TYPE__EXPERIMENT_GROUP:
            return this.getExperimentGroup() != null;
        case ExperimentDataPackage.MEASURING_TYPE__EXPERIMENT_SETTINGS:
            return !this.getExperimentSettings().isEmpty();
        case ExperimentDataPackage.MEASURING_TYPE__METRIC:
            return this.basicGetMetric() != null;
        case ExperimentDataPackage.MEASURING_TYPE__MEASURING_POINT:
            return this.basicGetMeasuringPoint() != null;
        }
        return super.eIsSet(featureID);
    }

} // MeasuringTypeImpl
