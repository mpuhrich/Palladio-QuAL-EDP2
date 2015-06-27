/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.palladiosimulator.edp2.models.ExperimentData.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.palladiosimulator.edp2.models.ExperimentData.AggregatedMeasurements;
import org.palladiosimulator.edp2.models.ExperimentData.AggregationStatistics;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Aggregation Statistics</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.AggregationStatisticsImpl#getDistinctValuesBeforeAggregation
 * <em>Distinct Values Before Aggregation</em>}</li>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.AggregationStatisticsImpl#getDistinctValuesAfterAggregation
 * <em>Distinct Values After Aggregation</em>}</li>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.AggregationStatisticsImpl#getAggregatedMeasurements
 * <em>Aggregated Measurements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AggregationStatisticsImpl extends IdentifierImpl implements AggregationStatistics {

    /**
     * The default value of the '{@link #getDistinctValuesBeforeAggregation()
     * <em>Distinct Values Before Aggregation</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getDistinctValuesBeforeAggregation()
     * @generated
     * @ordered
     */
    protected static final long DISTINCT_VALUES_BEFORE_AGGREGATION_EDEFAULT = 0L;

    /**
     * The default value of the '{@link #getDistinctValuesAfterAggregation()
     * <em>Distinct Values After Aggregation</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getDistinctValuesAfterAggregation()
     * @generated
     * @ordered
     */
    protected static final long DISTINCT_VALUES_AFTER_AGGREGATION_EDEFAULT = 0L;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected AggregationStatisticsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ExperimentDataPackage.Literals.AGGREGATION_STATISTICS;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public long getDistinctValuesBeforeAggregation() {
        return (Long) this.eDynamicGet(
                ExperimentDataPackage.AGGREGATION_STATISTICS__DISTINCT_VALUES_BEFORE_AGGREGATION,
                ExperimentDataPackage.Literals.AGGREGATION_STATISTICS__DISTINCT_VALUES_BEFORE_AGGREGATION, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setDistinctValuesBeforeAggregation(final long newDistinctValuesBeforeAggregation) {
        this.eDynamicSet(ExperimentDataPackage.AGGREGATION_STATISTICS__DISTINCT_VALUES_BEFORE_AGGREGATION,
                ExperimentDataPackage.Literals.AGGREGATION_STATISTICS__DISTINCT_VALUES_BEFORE_AGGREGATION,
                newDistinctValuesBeforeAggregation);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public long getDistinctValuesAfterAggregation() {
        return (Long) this.eDynamicGet(ExperimentDataPackage.AGGREGATION_STATISTICS__DISTINCT_VALUES_AFTER_AGGREGATION,
                ExperimentDataPackage.Literals.AGGREGATION_STATISTICS__DISTINCT_VALUES_AFTER_AGGREGATION, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setDistinctValuesAfterAggregation(final long newDistinctValuesAfterAggregation) {
        this.eDynamicSet(ExperimentDataPackage.AGGREGATION_STATISTICS__DISTINCT_VALUES_AFTER_AGGREGATION,
                ExperimentDataPackage.Literals.AGGREGATION_STATISTICS__DISTINCT_VALUES_AFTER_AGGREGATION,
                newDistinctValuesAfterAggregation);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public AggregatedMeasurements getAggregatedMeasurements() {
        return (AggregatedMeasurements) this.eDynamicGet(
                ExperimentDataPackage.AGGREGATION_STATISTICS__AGGREGATED_MEASUREMENTS,
                ExperimentDataPackage.Literals.AGGREGATION_STATISTICS__AGGREGATED_MEASUREMENTS, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetAggregatedMeasurements(final AggregatedMeasurements newAggregatedMeasurements,
            NotificationChain msgs) {
        msgs = this.eBasicSetContainer((InternalEObject) newAggregatedMeasurements,
                ExperimentDataPackage.AGGREGATION_STATISTICS__AGGREGATED_MEASUREMENTS, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setAggregatedMeasurements(final AggregatedMeasurements newAggregatedMeasurements) {
        this.eDynamicSet(ExperimentDataPackage.AGGREGATION_STATISTICS__AGGREGATED_MEASUREMENTS,
                ExperimentDataPackage.Literals.AGGREGATION_STATISTICS__AGGREGATED_MEASUREMENTS,
                newAggregatedMeasurements);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(final InternalEObject otherEnd, final int featureID, NotificationChain msgs) {
        switch (featureID)
        {
        case ExperimentDataPackage.AGGREGATION_STATISTICS__AGGREGATED_MEASUREMENTS:
            if (this.eInternalContainer() != null) {
                msgs = this.eBasicRemoveFromContainer(msgs);
            }
            return this.basicSetAggregatedMeasurements((AggregatedMeasurements) otherEnd, msgs);
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
        case ExperimentDataPackage.AGGREGATION_STATISTICS__AGGREGATED_MEASUREMENTS:
            return this.basicSetAggregatedMeasurements(null, msgs);
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
        case ExperimentDataPackage.AGGREGATION_STATISTICS__AGGREGATED_MEASUREMENTS:
            return this.eInternalContainer().eInverseRemove(this,
                    ExperimentDataPackage.AGGREGATED_MEASUREMENTS__AGGREGATION_STATISTICS,
                    AggregatedMeasurements.class, msgs);
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
        case ExperimentDataPackage.AGGREGATION_STATISTICS__DISTINCT_VALUES_BEFORE_AGGREGATION:
            return this.getDistinctValuesBeforeAggregation();
        case ExperimentDataPackage.AGGREGATION_STATISTICS__DISTINCT_VALUES_AFTER_AGGREGATION:
            return this.getDistinctValuesAfterAggregation();
        case ExperimentDataPackage.AGGREGATION_STATISTICS__AGGREGATED_MEASUREMENTS:
            return this.getAggregatedMeasurements();
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
        case ExperimentDataPackage.AGGREGATION_STATISTICS__DISTINCT_VALUES_BEFORE_AGGREGATION:
            this.setDistinctValuesBeforeAggregation((Long) newValue);
            return;
        case ExperimentDataPackage.AGGREGATION_STATISTICS__DISTINCT_VALUES_AFTER_AGGREGATION:
            this.setDistinctValuesAfterAggregation((Long) newValue);
            return;
        case ExperimentDataPackage.AGGREGATION_STATISTICS__AGGREGATED_MEASUREMENTS:
            this.setAggregatedMeasurements((AggregatedMeasurements) newValue);
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
        case ExperimentDataPackage.AGGREGATION_STATISTICS__DISTINCT_VALUES_BEFORE_AGGREGATION:
            this.setDistinctValuesBeforeAggregation(DISTINCT_VALUES_BEFORE_AGGREGATION_EDEFAULT);
            return;
        case ExperimentDataPackage.AGGREGATION_STATISTICS__DISTINCT_VALUES_AFTER_AGGREGATION:
            this.setDistinctValuesAfterAggregation(DISTINCT_VALUES_AFTER_AGGREGATION_EDEFAULT);
            return;
        case ExperimentDataPackage.AGGREGATION_STATISTICS__AGGREGATED_MEASUREMENTS:
            this.setAggregatedMeasurements((AggregatedMeasurements) null);
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
        case ExperimentDataPackage.AGGREGATION_STATISTICS__DISTINCT_VALUES_BEFORE_AGGREGATION:
            return this.getDistinctValuesBeforeAggregation() != DISTINCT_VALUES_BEFORE_AGGREGATION_EDEFAULT;
        case ExperimentDataPackage.AGGREGATION_STATISTICS__DISTINCT_VALUES_AFTER_AGGREGATION:
            return this.getDistinctValuesAfterAggregation() != DISTINCT_VALUES_AFTER_AGGREGATION_EDEFAULT;
        case ExperimentDataPackage.AGGREGATION_STATISTICS__AGGREGATED_MEASUREMENTS:
            return this.getAggregatedMeasurements() != null;
        }
        return super.eIsSet(featureID);
    }

} // AggregationStatisticsImpl
