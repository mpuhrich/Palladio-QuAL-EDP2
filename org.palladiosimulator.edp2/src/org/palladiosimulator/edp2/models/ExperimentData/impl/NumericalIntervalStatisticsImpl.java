/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.palladiosimulator.edp2.models.ExperimentData.impl;

import javax.measure.Measure;

import org.eclipse.emf.ecore.EClass;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage;
import org.palladiosimulator.edp2.models.ExperimentData.NumericalIntervalStatistics;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Numerical Interval Statistics</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.NumericalIntervalStatisticsImpl#getArithmethicMean
 * <em>Arithmethic Mean</em>}</li>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.NumericalIntervalStatisticsImpl#getVariance
 * <em>Variance</em>}</li>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.NumericalIntervalStatisticsImpl#getStandardDeviation
 * <em>Standard Deviation</em>}</li>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.NumericalIntervalStatisticsImpl#getSum
 * <em>Sum</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NumericalIntervalStatisticsImpl extends NumericalOrdinalStatisticsImpl implements
NumericalIntervalStatistics {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected NumericalIntervalStatisticsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ExperimentDataPackage.Literals.NUMERICAL_INTERVAL_STATISTICS;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Measure getArithmethicMean() {
        return (Measure) this.eDynamicGet(ExperimentDataPackage.NUMERICAL_INTERVAL_STATISTICS__ARITHMETHIC_MEAN,
                ExperimentDataPackage.Literals.NUMERICAL_INTERVAL_STATISTICS__ARITHMETHIC_MEAN, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setArithmethicMean(final Measure newArithmethicMean) {
        this.eDynamicSet(ExperimentDataPackage.NUMERICAL_INTERVAL_STATISTICS__ARITHMETHIC_MEAN,
                ExperimentDataPackage.Literals.NUMERICAL_INTERVAL_STATISTICS__ARITHMETHIC_MEAN, newArithmethicMean);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Measure getVariance() {
        return (Measure) this.eDynamicGet(ExperimentDataPackage.NUMERICAL_INTERVAL_STATISTICS__VARIANCE,
                ExperimentDataPackage.Literals.NUMERICAL_INTERVAL_STATISTICS__VARIANCE, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setVariance(final Measure newVariance) {
        this.eDynamicSet(ExperimentDataPackage.NUMERICAL_INTERVAL_STATISTICS__VARIANCE,
                ExperimentDataPackage.Literals.NUMERICAL_INTERVAL_STATISTICS__VARIANCE, newVariance);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Measure getStandardDeviation() {
        return (Measure) this.eDynamicGet(ExperimentDataPackage.NUMERICAL_INTERVAL_STATISTICS__STANDARD_DEVIATION,
                ExperimentDataPackage.Literals.NUMERICAL_INTERVAL_STATISTICS__STANDARD_DEVIATION, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setStandardDeviation(final Measure newStandardDeviation) {
        this.eDynamicSet(ExperimentDataPackage.NUMERICAL_INTERVAL_STATISTICS__STANDARD_DEVIATION,
                ExperimentDataPackage.Literals.NUMERICAL_INTERVAL_STATISTICS__STANDARD_DEVIATION, newStandardDeviation);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Measure getSum() {
        return (Measure) this.eDynamicGet(ExperimentDataPackage.NUMERICAL_INTERVAL_STATISTICS__SUM,
                ExperimentDataPackage.Literals.NUMERICAL_INTERVAL_STATISTICS__SUM, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setSum(final Measure newSum) {
        this.eDynamicSet(ExperimentDataPackage.NUMERICAL_INTERVAL_STATISTICS__SUM,
                ExperimentDataPackage.Literals.NUMERICAL_INTERVAL_STATISTICS__SUM, newSum);
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
        case ExperimentDataPackage.NUMERICAL_INTERVAL_STATISTICS__ARITHMETHIC_MEAN:
            return this.getArithmethicMean();
        case ExperimentDataPackage.NUMERICAL_INTERVAL_STATISTICS__VARIANCE:
            return this.getVariance();
        case ExperimentDataPackage.NUMERICAL_INTERVAL_STATISTICS__STANDARD_DEVIATION:
            return this.getStandardDeviation();
        case ExperimentDataPackage.NUMERICAL_INTERVAL_STATISTICS__SUM:
            return this.getSum();
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
        case ExperimentDataPackage.NUMERICAL_INTERVAL_STATISTICS__ARITHMETHIC_MEAN:
            this.setArithmethicMean((Measure) newValue);
            return;
        case ExperimentDataPackage.NUMERICAL_INTERVAL_STATISTICS__VARIANCE:
            this.setVariance((Measure) newValue);
            return;
        case ExperimentDataPackage.NUMERICAL_INTERVAL_STATISTICS__STANDARD_DEVIATION:
            this.setStandardDeviation((Measure) newValue);
            return;
        case ExperimentDataPackage.NUMERICAL_INTERVAL_STATISTICS__SUM:
            this.setSum((Measure) newValue);
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
        case ExperimentDataPackage.NUMERICAL_INTERVAL_STATISTICS__ARITHMETHIC_MEAN:
            this.setArithmethicMean((Measure) null);
            return;
        case ExperimentDataPackage.NUMERICAL_INTERVAL_STATISTICS__VARIANCE:
            this.setVariance((Measure) null);
            return;
        case ExperimentDataPackage.NUMERICAL_INTERVAL_STATISTICS__STANDARD_DEVIATION:
            this.setStandardDeviation((Measure) null);
            return;
        case ExperimentDataPackage.NUMERICAL_INTERVAL_STATISTICS__SUM:
            this.setSum((Measure) null);
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
        case ExperimentDataPackage.NUMERICAL_INTERVAL_STATISTICS__ARITHMETHIC_MEAN:
            return this.getArithmethicMean() != null;
        case ExperimentDataPackage.NUMERICAL_INTERVAL_STATISTICS__VARIANCE:
            return this.getVariance() != null;
        case ExperimentDataPackage.NUMERICAL_INTERVAL_STATISTICS__STANDARD_DEVIATION:
            return this.getStandardDeviation() != null;
        case ExperimentDataPackage.NUMERICAL_INTERVAL_STATISTICS__SUM:
            return this.getSum() != null;
        }
        return super.eIsSet(featureID);
    }

} // NumericalIntervalStatisticsImpl
