/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.palladiosimulator.edp2.models.ExperimentData.impl;

import org.eclipse.emf.ecore.EClass;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage;
import org.palladiosimulator.edp2.models.ExperimentData.TextualOrdinalStatistics;
import org.palladiosimulator.metricspec.Identifier;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Textual Ordinal Statistics</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.TextualOrdinalStatisticsImpl#getMinimum
 * <em>Minimum</em>}</li>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.TextualOrdinalStatisticsImpl#getMaximum
 * <em>Maximum</em>}</li>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.TextualOrdinalStatisticsImpl#getMedian
 * <em>Median</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TextualOrdinalStatisticsImpl extends TextualNominalStatisticsImpl implements TextualOrdinalStatistics {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected TextualOrdinalStatisticsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ExperimentDataPackage.Literals.TEXTUAL_ORDINAL_STATISTICS;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Identifier getMinimum() {
        return (Identifier) this.eDynamicGet(ExperimentDataPackage.TEXTUAL_ORDINAL_STATISTICS__MINIMUM,
                ExperimentDataPackage.Literals.TEXTUAL_ORDINAL_STATISTICS__MINIMUM, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public Identifier basicGetMinimum() {
        return (Identifier) this.eDynamicGet(ExperimentDataPackage.TEXTUAL_ORDINAL_STATISTICS__MINIMUM,
                ExperimentDataPackage.Literals.TEXTUAL_ORDINAL_STATISTICS__MINIMUM, false, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setMinimum(final Identifier newMinimum) {
        this.eDynamicSet(ExperimentDataPackage.TEXTUAL_ORDINAL_STATISTICS__MINIMUM,
                ExperimentDataPackage.Literals.TEXTUAL_ORDINAL_STATISTICS__MINIMUM, newMinimum);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Identifier getMaximum() {
        return (Identifier) this.eDynamicGet(ExperimentDataPackage.TEXTUAL_ORDINAL_STATISTICS__MAXIMUM,
                ExperimentDataPackage.Literals.TEXTUAL_ORDINAL_STATISTICS__MAXIMUM, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public Identifier basicGetMaximum() {
        return (Identifier) this.eDynamicGet(ExperimentDataPackage.TEXTUAL_ORDINAL_STATISTICS__MAXIMUM,
                ExperimentDataPackage.Literals.TEXTUAL_ORDINAL_STATISTICS__MAXIMUM, false, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setMaximum(final Identifier newMaximum) {
        this.eDynamicSet(ExperimentDataPackage.TEXTUAL_ORDINAL_STATISTICS__MAXIMUM,
                ExperimentDataPackage.Literals.TEXTUAL_ORDINAL_STATISTICS__MAXIMUM, newMaximum);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Identifier getMedian() {
        return (Identifier) this.eDynamicGet(ExperimentDataPackage.TEXTUAL_ORDINAL_STATISTICS__MEDIAN,
                ExperimentDataPackage.Literals.TEXTUAL_ORDINAL_STATISTICS__MEDIAN, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public Identifier basicGetMedian() {
        return (Identifier) this.eDynamicGet(ExperimentDataPackage.TEXTUAL_ORDINAL_STATISTICS__MEDIAN,
                ExperimentDataPackage.Literals.TEXTUAL_ORDINAL_STATISTICS__MEDIAN, false, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setMedian(final Identifier newMedian) {
        this.eDynamicSet(ExperimentDataPackage.TEXTUAL_ORDINAL_STATISTICS__MEDIAN,
                ExperimentDataPackage.Literals.TEXTUAL_ORDINAL_STATISTICS__MEDIAN, newMedian);
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
        case ExperimentDataPackage.TEXTUAL_ORDINAL_STATISTICS__MINIMUM:
            if (resolve) {
                return this.getMinimum();
            }
            return this.basicGetMinimum();
        case ExperimentDataPackage.TEXTUAL_ORDINAL_STATISTICS__MAXIMUM:
            if (resolve) {
                return this.getMaximum();
            }
            return this.basicGetMaximum();
        case ExperimentDataPackage.TEXTUAL_ORDINAL_STATISTICS__MEDIAN:
            if (resolve) {
                return this.getMedian();
            }
            return this.basicGetMedian();
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
        case ExperimentDataPackage.TEXTUAL_ORDINAL_STATISTICS__MINIMUM:
            this.setMinimum((Identifier) newValue);
            return;
        case ExperimentDataPackage.TEXTUAL_ORDINAL_STATISTICS__MAXIMUM:
            this.setMaximum((Identifier) newValue);
            return;
        case ExperimentDataPackage.TEXTUAL_ORDINAL_STATISTICS__MEDIAN:
            this.setMedian((Identifier) newValue);
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
        case ExperimentDataPackage.TEXTUAL_ORDINAL_STATISTICS__MINIMUM:
            this.setMinimum((Identifier) null);
            return;
        case ExperimentDataPackage.TEXTUAL_ORDINAL_STATISTICS__MAXIMUM:
            this.setMaximum((Identifier) null);
            return;
        case ExperimentDataPackage.TEXTUAL_ORDINAL_STATISTICS__MEDIAN:
            this.setMedian((Identifier) null);
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
        case ExperimentDataPackage.TEXTUAL_ORDINAL_STATISTICS__MINIMUM:
            return this.basicGetMinimum() != null;
        case ExperimentDataPackage.TEXTUAL_ORDINAL_STATISTICS__MAXIMUM:
            return this.basicGetMaximum() != null;
        case ExperimentDataPackage.TEXTUAL_ORDINAL_STATISTICS__MEDIAN:
            return this.basicGetMedian() != null;
        }
        return super.eIsSet(featureID);
    }

} // TextualOrdinalStatisticsImpl
