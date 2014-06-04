/**
 */
package org.palladiosimulator.edp2.models.ExperimentData.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentGroup;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentSetting;
import org.palladiosimulator.edp2.models.ExperimentData.Measure;
import org.palladiosimulator.edp2.models.measuringpoint.MeasuringPoint;
import org.palladiosimulator.metricspec.MetricDescription;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Measure</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.palladiosimulator.edp2.models.ExperimentData.impl.MeasureImpl#getExperimentGroup
 * <em>Experiment Group</em>}</li>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.MeasureImpl#getExperimentSettings
 * <em>Experiment Settings</em>}</li>
 * <li>{@link org.palladiosimulator.edp2.models.ExperimentData.impl.MeasureImpl#getMetric <em>Metric
 * </em>}</li>
 * <li>{@link org.palladiosimulator.edp2.models.ExperimentData.impl.MeasureImpl#getMeasuringPoint
 * <em>Measuring Point</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class MeasureImpl extends IdentifierImpl implements Measure {
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
     * The cached value of the '{@link #getMeasuringPoint() <em>Measuring Point</em>}' containment
     * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
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
    protected MeasureImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ExperimentDataPackage.Literals.MEASURE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public ExperimentGroup getExperimentGroup() {
        if (eContainerFeatureID() != ExperimentDataPackage.MEASURE__EXPERIMENT_GROUP)
            return null;
        return (ExperimentGroup) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetExperimentGroup(ExperimentGroup newExperimentGroup, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject) newExperimentGroup,
                ExperimentDataPackage.MEASURE__EXPERIMENT_GROUP, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setExperimentGroup(ExperimentGroup newExperimentGroup) {
        if (newExperimentGroup != eInternalContainer()
                || (eContainerFeatureID() != ExperimentDataPackage.MEASURE__EXPERIMENT_GROUP && newExperimentGroup != null)) {
            if (EcoreUtil.isAncestor(this, newExperimentGroup))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newExperimentGroup != null)
                msgs = ((InternalEObject) newExperimentGroup).eInverseAdd(this,
                        ExperimentDataPackage.EXPERIMENT_GROUP__MEASURE, ExperimentGroup.class, msgs);
            msgs = basicSetExperimentGroup(newExperimentGroup, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ExperimentDataPackage.MEASURE__EXPERIMENT_GROUP,
                    newExperimentGroup, newExperimentGroup));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EList<ExperimentSetting> getExperimentSettings() {
        if (experimentSettings == null) {
            experimentSettings = new EObjectWithInverseResolvingEList.ManyInverse<ExperimentSetting>(
                    ExperimentSetting.class, this, ExperimentDataPackage.MEASURE__EXPERIMENT_SETTINGS,
                    ExperimentDataPackage.EXPERIMENT_SETTING__MEASURE);
        }
        return experimentSettings;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public MetricDescription getMetric() {
        if (metric != null && metric.eIsProxy()) {
            InternalEObject oldMetric = (InternalEObject) metric;
            metric = (MetricDescription) eResolveProxy(oldMetric);
            if (metric != oldMetric) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExperimentDataPackage.MEASURE__METRIC,
                            oldMetric, metric));
            }
        }
        return metric;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public MetricDescription basicGetMetric() {
        return metric;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setMetric(MetricDescription newMetric) {
        MetricDescription oldMetric = metric;
        metric = newMetric;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ExperimentDataPackage.MEASURE__METRIC, oldMetric,
                    metric));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public MeasuringPoint getMeasuringPoint() {
        return measuringPoint;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetMeasuringPoint(MeasuringPoint newMeasuringPoint, NotificationChain msgs) {
        MeasuringPoint oldMeasuringPoint = measuringPoint;
        measuringPoint = newMeasuringPoint;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    ExperimentDataPackage.MEASURE__MEASURING_POINT, oldMeasuringPoint, newMeasuringPoint);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setMeasuringPoint(MeasuringPoint newMeasuringPoint) {
        if (newMeasuringPoint != measuringPoint) {
            NotificationChain msgs = null;
            if (measuringPoint != null)
                msgs = ((InternalEObject) measuringPoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                        - ExperimentDataPackage.MEASURE__MEASURING_POINT, null, msgs);
            if (newMeasuringPoint != null)
                msgs = ((InternalEObject) newMeasuringPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                        - ExperimentDataPackage.MEASURE__MEASURING_POINT, null, msgs);
            msgs = basicSetMeasuringPoint(newMeasuringPoint, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ExperimentDataPackage.MEASURE__MEASURING_POINT,
                    newMeasuringPoint, newMeasuringPoint));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case ExperimentDataPackage.MEASURE__EXPERIMENT_GROUP:
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            return basicSetExperimentGroup((ExperimentGroup) otherEnd, msgs);
        case ExperimentDataPackage.MEASURE__EXPERIMENT_SETTINGS:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getExperimentSettings()).basicAdd(otherEnd,
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
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case ExperimentDataPackage.MEASURE__EXPERIMENT_GROUP:
            return basicSetExperimentGroup(null, msgs);
        case ExperimentDataPackage.MEASURE__EXPERIMENT_SETTINGS:
            return ((InternalEList<?>) getExperimentSettings()).basicRemove(otherEnd, msgs);
        case ExperimentDataPackage.MEASURE__MEASURING_POINT:
            return basicSetMeasuringPoint(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
        switch (eContainerFeatureID()) {
        case ExperimentDataPackage.MEASURE__EXPERIMENT_GROUP:
            return eInternalContainer().eInverseRemove(this, ExperimentDataPackage.EXPERIMENT_GROUP__MEASURE,
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
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case ExperimentDataPackage.MEASURE__EXPERIMENT_GROUP:
            return getExperimentGroup();
        case ExperimentDataPackage.MEASURE__EXPERIMENT_SETTINGS:
            return getExperimentSettings();
        case ExperimentDataPackage.MEASURE__METRIC:
            if (resolve)
                return getMetric();
            return basicGetMetric();
        case ExperimentDataPackage.MEASURE__MEASURING_POINT:
            return getMeasuringPoint();
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
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case ExperimentDataPackage.MEASURE__EXPERIMENT_GROUP:
            setExperimentGroup((ExperimentGroup) newValue);
            return;
        case ExperimentDataPackage.MEASURE__EXPERIMENT_SETTINGS:
            getExperimentSettings().clear();
            getExperimentSettings().addAll((Collection<? extends ExperimentSetting>) newValue);
            return;
        case ExperimentDataPackage.MEASURE__METRIC:
            setMetric((MetricDescription) newValue);
            return;
        case ExperimentDataPackage.MEASURE__MEASURING_POINT:
            setMeasuringPoint((MeasuringPoint) newValue);
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
    public void eUnset(int featureID) {
        switch (featureID) {
        case ExperimentDataPackage.MEASURE__EXPERIMENT_GROUP:
            setExperimentGroup((ExperimentGroup) null);
            return;
        case ExperimentDataPackage.MEASURE__EXPERIMENT_SETTINGS:
            getExperimentSettings().clear();
            return;
        case ExperimentDataPackage.MEASURE__METRIC:
            setMetric((MetricDescription) null);
            return;
        case ExperimentDataPackage.MEASURE__MEASURING_POINT:
            setMeasuringPoint((MeasuringPoint) null);
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
    public boolean eIsSet(int featureID) {
        switch (featureID) {
        case ExperimentDataPackage.MEASURE__EXPERIMENT_GROUP:
            return getExperimentGroup() != null;
        case ExperimentDataPackage.MEASURE__EXPERIMENT_SETTINGS:
            return experimentSettings != null && !experimentSettings.isEmpty();
        case ExperimentDataPackage.MEASURE__METRIC:
            return metric != null;
        case ExperimentDataPackage.MEASURE__MEASURING_POINT:
            return measuringPoint != null;
        }
        return super.eIsSet(featureID);
    }

} // MeasureImpl
