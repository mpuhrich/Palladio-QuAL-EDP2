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
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.palladiosimulator.edp2.models.ExperimentData.DataSeries;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage;
import org.palladiosimulator.edp2.models.ExperimentData.TextualMassDistribution;
import org.palladiosimulator.edp2.models.ExperimentData.TextualNominalStatistics;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Textual Nominal Statistics</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.TextualNominalStatisticsImpl#getNumberMeasurements
 * <em>Number Measurements</em>}</li>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.TextualNominalStatisticsImpl#getMassDistribution
 * <em>Mass Distribution</em>}</li>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.TextualNominalStatisticsImpl#getDataSeries
 * <em>Data Series</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TextualNominalStatisticsImpl extends CDOObjectImpl implements TextualNominalStatistics {

    /**
     * The default value of the '{@link #getNumberMeasurements() <em>Number Measurements</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getNumberMeasurements()
     * @generated
     * @ordered
     */
    protected static final long NUMBER_MEASUREMENTS_EDEFAULT = 0L;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected TextualNominalStatisticsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ExperimentDataPackage.Literals.TEXTUAL_NOMINAL_STATISTICS;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected int eStaticFeatureCount() {
        return 0;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public long getNumberMeasurements() {
        return (Long) this.eDynamicGet(ExperimentDataPackage.TEXTUAL_NOMINAL_STATISTICS__NUMBER_MEASUREMENTS,
                ExperimentDataPackage.Literals.TEXTUAL_NOMINAL_STATISTICS__NUMBER_MEASUREMENTS, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setNumberMeasurements(final long newNumberMeasurements) {
        this.eDynamicSet(ExperimentDataPackage.TEXTUAL_NOMINAL_STATISTICS__NUMBER_MEASUREMENTS,
                ExperimentDataPackage.Literals.TEXTUAL_NOMINAL_STATISTICS__NUMBER_MEASUREMENTS, newNumberMeasurements);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public EList<TextualMassDistribution> getMassDistribution() {
        return (EList<TextualMassDistribution>) this.eDynamicGet(
                ExperimentDataPackage.TEXTUAL_NOMINAL_STATISTICS__MASS_DISTRIBUTION,
                ExperimentDataPackage.Literals.TEXTUAL_NOMINAL_STATISTICS__MASS_DISTRIBUTION, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public DataSeries getDataSeries() {
        return (DataSeries) this.eDynamicGet(ExperimentDataPackage.TEXTUAL_NOMINAL_STATISTICS__DATA_SERIES,
                ExperimentDataPackage.Literals.TEXTUAL_NOMINAL_STATISTICS__DATA_SERIES, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetDataSeries(final DataSeries newDataSeries, NotificationChain msgs) {
        msgs = this.eBasicSetContainer((InternalEObject) newDataSeries,
                ExperimentDataPackage.TEXTUAL_NOMINAL_STATISTICS__DATA_SERIES, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setDataSeries(final DataSeries newDataSeries) {
        this.eDynamicSet(ExperimentDataPackage.TEXTUAL_NOMINAL_STATISTICS__DATA_SERIES,
                ExperimentDataPackage.Literals.TEXTUAL_NOMINAL_STATISTICS__DATA_SERIES, newDataSeries);
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
        case ExperimentDataPackage.TEXTUAL_NOMINAL_STATISTICS__MASS_DISTRIBUTION:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) this.getMassDistribution()).basicAdd(otherEnd,
                    msgs);
        case ExperimentDataPackage.TEXTUAL_NOMINAL_STATISTICS__DATA_SERIES:
            if (this.eInternalContainer() != null) {
                msgs = this.eBasicRemoveFromContainer(msgs);
            }
            return this.basicSetDataSeries((DataSeries) otherEnd, msgs);
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
        case ExperimentDataPackage.TEXTUAL_NOMINAL_STATISTICS__MASS_DISTRIBUTION:
            return ((InternalEList<?>) this.getMassDistribution()).basicRemove(otherEnd, msgs);
        case ExperimentDataPackage.TEXTUAL_NOMINAL_STATISTICS__DATA_SERIES:
            return this.basicSetDataSeries(null, msgs);
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
        case ExperimentDataPackage.TEXTUAL_NOMINAL_STATISTICS__DATA_SERIES:
            return this.eInternalContainer().eInverseRemove(this,
                    ExperimentDataPackage.DATA_SERIES__TEXTUAL_STATISTICS, DataSeries.class, msgs);
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
        case ExperimentDataPackage.TEXTUAL_NOMINAL_STATISTICS__NUMBER_MEASUREMENTS:
            return this.getNumberMeasurements();
        case ExperimentDataPackage.TEXTUAL_NOMINAL_STATISTICS__MASS_DISTRIBUTION:
            return this.getMassDistribution();
        case ExperimentDataPackage.TEXTUAL_NOMINAL_STATISTICS__DATA_SERIES:
            return this.getDataSeries();
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
        case ExperimentDataPackage.TEXTUAL_NOMINAL_STATISTICS__NUMBER_MEASUREMENTS:
            this.setNumberMeasurements((Long) newValue);
            return;
        case ExperimentDataPackage.TEXTUAL_NOMINAL_STATISTICS__MASS_DISTRIBUTION:
            this.getMassDistribution().clear();
            this.getMassDistribution().addAll((Collection<? extends TextualMassDistribution>) newValue);
            return;
        case ExperimentDataPackage.TEXTUAL_NOMINAL_STATISTICS__DATA_SERIES:
            this.setDataSeries((DataSeries) newValue);
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
        case ExperimentDataPackage.TEXTUAL_NOMINAL_STATISTICS__NUMBER_MEASUREMENTS:
            this.setNumberMeasurements(NUMBER_MEASUREMENTS_EDEFAULT);
            return;
        case ExperimentDataPackage.TEXTUAL_NOMINAL_STATISTICS__MASS_DISTRIBUTION:
            this.getMassDistribution().clear();
            return;
        case ExperimentDataPackage.TEXTUAL_NOMINAL_STATISTICS__DATA_SERIES:
            this.setDataSeries((DataSeries) null);
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
        case ExperimentDataPackage.TEXTUAL_NOMINAL_STATISTICS__NUMBER_MEASUREMENTS:
            return this.getNumberMeasurements() != NUMBER_MEASUREMENTS_EDEFAULT;
        case ExperimentDataPackage.TEXTUAL_NOMINAL_STATISTICS__MASS_DISTRIBUTION:
            return !this.getMassDistribution().isEmpty();
        case ExperimentDataPackage.TEXTUAL_NOMINAL_STATISTICS__DATA_SERIES:
            return this.getDataSeries() != null;
        }
        return super.eIsSet(featureID);
    }

} // TextualNominalStatisticsImpl
