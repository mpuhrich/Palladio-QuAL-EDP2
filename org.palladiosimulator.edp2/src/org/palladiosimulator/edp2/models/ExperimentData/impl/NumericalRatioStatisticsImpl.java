/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.palladiosimulator.edp2.models.ExperimentData.impl;

import javax.measure.Measure;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
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
     * The cached value of the '{@link #getCoefficientOfVariation()
     * <em>Coefficient Of Variation</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getCoefficientOfVariation()
     * @generated
     * @ordered
     */
    protected Measure coefficientOfVariation;

    /**
     * The cached value of the '{@link #getGeometricMean() <em>Geometric Mean</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getGeometricMean()
     * @generated
     * @ordered
     */
    protected Measure geometricMean;

    /**
     * The cached value of the '{@link #getHarmonicMean() <em>Harmonic Mean</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getHarmonicMean()
     * @generated
     * @ordered
     */
    protected Measure harmonicMean;

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
        return this.coefficientOfVariation;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setCoefficientOfVariation(final Measure newCoefficientOfVariation) {
        final Measure oldCoefficientOfVariation = this.coefficientOfVariation;
        this.coefficientOfVariation = newCoefficientOfVariation;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    ExperimentDataPackage.NUMERICAL_RATIO_STATISTICS__COEFFICIENT_OF_VARIATION,
                    oldCoefficientOfVariation, this.coefficientOfVariation));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Measure getGeometricMean() {
        return this.geometricMean;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setGeometricMean(final Measure newGeometricMean) {
        final Measure oldGeometricMean = this.geometricMean;
        this.geometricMean = newGeometricMean;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    ExperimentDataPackage.NUMERICAL_RATIO_STATISTICS__GEOMETRIC_MEAN, oldGeometricMean,
                    this.geometricMean));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Measure getHarmonicMean() {
        return this.harmonicMean;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setHarmonicMean(final Measure newHarmonicMean) {
        final Measure oldHarmonicMean = this.harmonicMean;
        this.harmonicMean = newHarmonicMean;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    ExperimentDataPackage.NUMERICAL_RATIO_STATISTICS__HARMONIC_MEAN, oldHarmonicMean, this.harmonicMean));
        }
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
            return this.coefficientOfVariation != null;
        case ExperimentDataPackage.NUMERICAL_RATIO_STATISTICS__GEOMETRIC_MEAN:
            return this.geometricMean != null;
        case ExperimentDataPackage.NUMERICAL_RATIO_STATISTICS__HARMONIC_MEAN:
            return this.harmonicMean != null;
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
        result.append(" (coefficientOfVariation: ");
        result.append(this.coefficientOfVariation);
        result.append(", geometricMean: ");
        result.append(this.geometricMean);
        result.append(", harmonicMean: ");
        result.append(this.harmonicMean);
        result.append(')');
        return result.toString();
    }

} // NumericalRatioStatisticsImpl
