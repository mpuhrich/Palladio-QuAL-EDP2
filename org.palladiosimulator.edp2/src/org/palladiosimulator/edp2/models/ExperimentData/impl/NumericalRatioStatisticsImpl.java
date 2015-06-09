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
import org.palladiosimulator.edp2.models.ExperimentData.NumericalRatioStatistics;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Numerical Ratio Statistics</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.NumericalRatioStatisticsImpl#getCoefficientOfVariation
 * <em>Coefficient Of Variation</em>}</li>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.NumericalRatioStatisticsImpl#getGeometricMean
 * <em>Geometric Mean</em>}</li>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.NumericalRatioStatisticsImpl#getHarmonicMean
 * <em>Harmonic Mean</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NumericalRatioStatisticsImpl extends NumericalIntervalStatisticsImpl implements NumericalRatioStatistics {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected NumericalRatioStatisticsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ExperimentDataPackage.Literals.NUMERICAL_RATIO_STATISTICS;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Measure getCoefficientOfVariation() {
        return (Measure) this.eDynamicGet(ExperimentDataPackage.NUMERICAL_RATIO_STATISTICS__COEFFICIENT_OF_VARIATION,
                ExperimentDataPackage.Literals.NUMERICAL_RATIO_STATISTICS__COEFFICIENT_OF_VARIATION, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setCoefficientOfVariation(final Measure newCoefficientOfVariation) {
        this.eDynamicSet(ExperimentDataPackage.NUMERICAL_RATIO_STATISTICS__COEFFICIENT_OF_VARIATION,
                ExperimentDataPackage.Literals.NUMERICAL_RATIO_STATISTICS__COEFFICIENT_OF_VARIATION,
                newCoefficientOfVariation);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Measure getGeometricMean() {
        return (Measure) this.eDynamicGet(ExperimentDataPackage.NUMERICAL_RATIO_STATISTICS__GEOMETRIC_MEAN,
                ExperimentDataPackage.Literals.NUMERICAL_RATIO_STATISTICS__GEOMETRIC_MEAN, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setGeometricMean(final Measure newGeometricMean) {
        this.eDynamicSet(ExperimentDataPackage.NUMERICAL_RATIO_STATISTICS__GEOMETRIC_MEAN,
                ExperimentDataPackage.Literals.NUMERICAL_RATIO_STATISTICS__GEOMETRIC_MEAN, newGeometricMean);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Measure getHarmonicMean() {
        return (Measure) this.eDynamicGet(ExperimentDataPackage.NUMERICAL_RATIO_STATISTICS__HARMONIC_MEAN,
                ExperimentDataPackage.Literals.NUMERICAL_RATIO_STATISTICS__HARMONIC_MEAN, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setHarmonicMean(final Measure newHarmonicMean) {
        this.eDynamicSet(ExperimentDataPackage.NUMERICAL_RATIO_STATISTICS__HARMONIC_MEAN,
                ExperimentDataPackage.Literals.NUMERICAL_RATIO_STATISTICS__HARMONIC_MEAN, newHarmonicMean);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case ExperimentDataPackage.NUMERICAL_RATIO_STATISTICS__COEFFICIENT_OF_VARIATION:
            return this.getCoefficientOfVariation();
        case ExperimentDataPackage.NUMERICAL_RATIO_STATISTICS__GEOMETRIC_MEAN:
            return this.getGeometricMean();
        case ExperimentDataPackage.NUMERICAL_RATIO_STATISTICS__HARMONIC_MEAN:
            return this.getHarmonicMean();
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
        switch (featureID) {
        case ExperimentDataPackage.NUMERICAL_RATIO_STATISTICS__COEFFICIENT_OF_VARIATION:
            this.setCoefficientOfVariation((Measure) newValue);
            return;
        case ExperimentDataPackage.NUMERICAL_RATIO_STATISTICS__GEOMETRIC_MEAN:
            this.setGeometricMean((Measure) newValue);
            return;
        case ExperimentDataPackage.NUMERICAL_RATIO_STATISTICS__HARMONIC_MEAN:
            this.setHarmonicMean((Measure) newValue);
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
        case ExperimentDataPackage.NUMERICAL_RATIO_STATISTICS__COEFFICIENT_OF_VARIATION:
            this.setCoefficientOfVariation((Measure) null);
            return;
        case ExperimentDataPackage.NUMERICAL_RATIO_STATISTICS__GEOMETRIC_MEAN:
            this.setGeometricMean((Measure) null);
            return;
        case ExperimentDataPackage.NUMERICAL_RATIO_STATISTICS__HARMONIC_MEAN:
            this.setHarmonicMean((Measure) null);
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
        case ExperimentDataPackage.NUMERICAL_RATIO_STATISTICS__COEFFICIENT_OF_VARIATION:
            return this.getCoefficientOfVariation() != null;
        case ExperimentDataPackage.NUMERICAL_RATIO_STATISTICS__GEOMETRIC_MEAN:
            return this.getGeometricMean() != null;
        case ExperimentDataPackage.NUMERICAL_RATIO_STATISTICS__HARMONIC_MEAN:
            return this.getHarmonicMean() != null;
        }
        return super.eIsSet(featureID);
    }

} // NumericalRatioStatisticsImpl
