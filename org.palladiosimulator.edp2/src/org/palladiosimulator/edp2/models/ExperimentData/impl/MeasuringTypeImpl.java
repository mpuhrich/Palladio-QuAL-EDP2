/**
 */
package org.palladiosimulator.edp2.models.ExperimentData.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
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
     * The cached value of the '{@link #getExperimentSettings() <em>Experiment Settings</em>}'
     * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getExperimentSettings()
     * @generated
     * @ordered
     */
    protected EList<ExperimentSetting> experimentSettings;

    /**
     * The cached value of the '{@link #getMetric() <em>Metric</em>}' reference. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @see #getMetric()
     * @generated
     * @ordered
     */
    protected MetricDescription metric;

    /**
     * The cached value of the '{@link #getMeasuringPoint() <em>Measuring Point</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getMeasuringPoint()
     * @generated
     * @ordered
     */
    protected MeasuringPoint measuringPoint;

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
        if (this.eContainerFeatureID() != ExperimentDataPackage.MEASURING_TYPE__EXPERIMENT_GROUP) {
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
        if (newExperimentGroup != this.eInternalContainer()
                || (this.eContainerFeatureID() != ExperimentDataPackage.MEASURING_TYPE__EXPERIMENT_GROUP && newExperimentGroup != null)) {
            if (EcoreUtil.isAncestor(this, newExperimentGroup)) {
                throw new IllegalArgumentException("Recursive containment not allowed for " + this.toString());
            }
            NotificationChain msgs = null;
            if (this.eInternalContainer() != null) {
                msgs = this.eBasicRemoveFromContainer(msgs);
            }
            if (newExperimentGroup != null) {
                msgs = ((InternalEObject) newExperimentGroup).eInverseAdd(this,
                        ExperimentDataPackage.EXPERIMENT_GROUP__MEASURING_TYPES, ExperimentGroup.class, msgs);
            }
            msgs = this.basicSetExperimentGroup(newExperimentGroup, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        } else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    ExperimentDataPackage.MEASURING_TYPE__EXPERIMENT_GROUP, newExperimentGroup, newExperimentGroup));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<ExperimentSetting> getExperimentSettings() {
        if (this.experimentSettings == null) {
            this.experimentSettings = new EObjectWithInverseResolvingEList.ManyInverse<ExperimentSetting>(
                    ExperimentSetting.class, this, ExperimentDataPackage.MEASURING_TYPE__EXPERIMENT_SETTINGS,
                    ExperimentDataPackage.EXPERIMENT_SETTING__MEASURING_TYPES);
        }
        return this.experimentSettings;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public MetricDescription getMetric() {
        if (this.metric != null && ((EObject) this.metric).eIsProxy()) {
            final InternalEObject oldMetric = (InternalEObject) this.metric;
            this.metric = (MetricDescription) this.eResolveProxy(oldMetric);
            if (this.metric != oldMetric) {
                if (this.eNotificationRequired()) {
                    this.eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            ExperimentDataPackage.MEASURING_TYPE__METRIC, oldMetric, this.metric));
                }
            }
        }
        return this.metric;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public MetricDescription basicGetMetric() {
        return this.metric;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setMetric(final MetricDescription newMetric) {
        final MetricDescription oldMetric = this.metric;
        this.metric = newMetric;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, ExperimentDataPackage.MEASURING_TYPE__METRIC,
                    oldMetric, this.metric));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public MeasuringPoint getMeasuringPoint() {
        if (this.measuringPoint != null && ((EObject) this.measuringPoint).eIsProxy()) {
            final InternalEObject oldMeasuringPoint = (InternalEObject) this.measuringPoint;
            this.measuringPoint = (MeasuringPoint) this.eResolveProxy(oldMeasuringPoint);
            if (this.measuringPoint != oldMeasuringPoint) {
                if (this.eNotificationRequired()) {
                    this.eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            ExperimentDataPackage.MEASURING_TYPE__MEASURING_POINT, oldMeasuringPoint,
                            this.measuringPoint));
                }
            }
        }
        return this.measuringPoint;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public MeasuringPoint basicGetMeasuringPoint() {
        return this.measuringPoint;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setMeasuringPoint(final MeasuringPoint newMeasuringPoint) {
        final MeasuringPoint oldMeasuringPoint = this.measuringPoint;
        this.measuringPoint = newMeasuringPoint;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    ExperimentDataPackage.MEASURING_TYPE__MEASURING_POINT, oldMeasuringPoint, this.measuringPoint));
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
        case ExperimentDataPackage.MEASURING_TYPE__EXPERIMENT_GROUP:
            if (this.eInternalContainer() != null) {
                msgs = this.eBasicRemoveFromContainer(msgs);
            }
            return this.basicSetExperimentGroup((ExperimentGroup) otherEnd, msgs);
        case ExperimentDataPackage.MEASURING_TYPE__EXPERIMENT_SETTINGS:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) this.getExperimentSettings()).basicAdd(
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
        switch (this.eContainerFeatureID()) {
        case ExperimentDataPackage.MEASURING_TYPE__EXPERIMENT_GROUP:
            return this.eInternalContainer().eInverseRemove(this,
                    ExperimentDataPackage.EXPERIMENT_GROUP__MEASURING_TYPES, ExperimentGroup.class, msgs);
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
        switch (featureID) {
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
        switch (featureID) {
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
        switch (featureID) {
        case ExperimentDataPackage.MEASURING_TYPE__EXPERIMENT_GROUP:
            return this.getExperimentGroup() != null;
        case ExperimentDataPackage.MEASURING_TYPE__EXPERIMENT_SETTINGS:
            return this.experimentSettings != null && !this.experimentSettings.isEmpty();
        case ExperimentDataPackage.MEASURING_TYPE__METRIC:
            return this.metric != null;
        case ExperimentDataPackage.MEASURING_TYPE__MEASURING_POINT:
            return this.measuringPoint != null;
        }
        return super.eIsSet(featureID);
    }

} // MeasuringTypeImpl
