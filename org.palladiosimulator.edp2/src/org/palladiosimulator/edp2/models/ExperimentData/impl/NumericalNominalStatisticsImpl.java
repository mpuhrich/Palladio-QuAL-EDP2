/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.palladiosimulator.edp2.models.ExperimentData.impl;

import java.util.Collection;

import javax.measure.Measure;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.palladiosimulator.edp2.models.ExperimentData.DataSeries;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage;
import org.palladiosimulator.edp2.models.ExperimentData.NumericalMassDistribution;
import org.palladiosimulator.edp2.models.ExperimentData.NumericalNominalStatistics;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Numerical Nominal Statistics</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.NumericalNominalStatisticsImpl#getNumberMeasurements
 * <em>Number Measurements</em>}</li>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.NumericalNominalStatisticsImpl#getNumericalMassDistribution
 * <em>Numerical Mass Distribution</em>}</li>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.NumericalNominalStatisticsImpl#getDataSeries
 * <em>Data Series</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NumericalNominalStatisticsImpl extends IdentifierImpl implements NumericalNominalStatistics {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected NumericalNominalStatisticsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ExperimentDataPackage.Literals.NUMERICAL_NOMINAL_STATISTICS;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Measure getNumberMeasurements() {
        return (Measure) this.eDynamicGet(ExperimentDataPackage.NUMERICAL_NOMINAL_STATISTICS__NUMBER_MEASUREMENTS,
                ExperimentDataPackage.Literals.NUMERICAL_NOMINAL_STATISTICS__NUMBER_MEASUREMENTS, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setNumberMeasurements(final Measure newNumberMeasurements) {
        this.eDynamicSet(ExperimentDataPackage.NUMERICAL_NOMINAL_STATISTICS__NUMBER_MEASUREMENTS,
                ExperimentDataPackage.Literals.NUMERICAL_NOMINAL_STATISTICS__NUMBER_MEASUREMENTS, newNumberMeasurements);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public EList<NumericalMassDistribution> getNumericalMassDistribution() {
        return (EList<NumericalMassDistribution>) this.eDynamicGet(
                ExperimentDataPackage.NUMERICAL_NOMINAL_STATISTICS__NUMERICAL_MASS_DISTRIBUTION,
                ExperimentDataPackage.Literals.NUMERICAL_NOMINAL_STATISTICS__NUMERICAL_MASS_DISTRIBUTION, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public DataSeries getDataSeries() {
        return (DataSeries) this.eDynamicGet(ExperimentDataPackage.NUMERICAL_NOMINAL_STATISTICS__DATA_SERIES,
                ExperimentDataPackage.Literals.NUMERICAL_NOMINAL_STATISTICS__DATA_SERIES, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetDataSeries(final DataSeries newDataSeries, NotificationChain msgs) {
        msgs = this.eBasicSetContainer((InternalEObject) newDataSeries,
                ExperimentDataPackage.NUMERICAL_NOMINAL_STATISTICS__DATA_SERIES, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setDataSeries(final DataSeries newDataSeries) {
        this.eDynamicSet(ExperimentDataPackage.NUMERICAL_NOMINAL_STATISTICS__DATA_SERIES,
                ExperimentDataPackage.Literals.NUMERICAL_NOMINAL_STATISTICS__DATA_SERIES, newDataSeries);
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
        case ExperimentDataPackage.NUMERICAL_NOMINAL_STATISTICS__NUMERICAL_MASS_DISTRIBUTION:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) this.getNumericalMassDistribution()).basicAdd(
                    otherEnd, msgs);
        case ExperimentDataPackage.NUMERICAL_NOMINAL_STATISTICS__DATA_SERIES:
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
        switch (featureID)
        {
        case ExperimentDataPackage.NUMERICAL_NOMINAL_STATISTICS__NUMERICAL_MASS_DISTRIBUTION:
            return ((InternalEList<?>) this.getNumericalMassDistribution()).basicRemove(otherEnd, msgs);
        case ExperimentDataPackage.NUMERICAL_NOMINAL_STATISTICS__DATA_SERIES:
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
        switch (this.eContainerFeatureID())
        {
        case ExperimentDataPackage.NUMERICAL_NOMINAL_STATISTICS__DATA_SERIES:
            return this.eInternalContainer().eInverseRemove(this,
                    ExperimentDataPackage.DATA_SERIES__NUMERICAL_STATISTICS,
                    DataSeries.class, msgs);
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
        case ExperimentDataPackage.NUMERICAL_NOMINAL_STATISTICS__NUMBER_MEASUREMENTS:
            return this.getNumberMeasurements();
        case ExperimentDataPackage.NUMERICAL_NOMINAL_STATISTICS__NUMERICAL_MASS_DISTRIBUTION:
            return this.getNumericalMassDistribution();
        case ExperimentDataPackage.NUMERICAL_NOMINAL_STATISTICS__DATA_SERIES:
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
        switch (featureID)
        {
        case ExperimentDataPackage.NUMERICAL_NOMINAL_STATISTICS__NUMBER_MEASUREMENTS:
            this.setNumberMeasurements((Measure) newValue);
            return;
        case ExperimentDataPackage.NUMERICAL_NOMINAL_STATISTICS__NUMERICAL_MASS_DISTRIBUTION:
            this.getNumericalMassDistribution().clear();
            this.getNumericalMassDistribution().addAll((Collection<? extends NumericalMassDistribution>) newValue);
            return;
        case ExperimentDataPackage.NUMERICAL_NOMINAL_STATISTICS__DATA_SERIES:
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
        switch (featureID)
        {
        case ExperimentDataPackage.NUMERICAL_NOMINAL_STATISTICS__NUMBER_MEASUREMENTS:
            this.setNumberMeasurements((Measure) null);
            return;
        case ExperimentDataPackage.NUMERICAL_NOMINAL_STATISTICS__NUMERICAL_MASS_DISTRIBUTION:
            this.getNumericalMassDistribution().clear();
            return;
        case ExperimentDataPackage.NUMERICAL_NOMINAL_STATISTICS__DATA_SERIES:
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
        switch (featureID)
        {
        case ExperimentDataPackage.NUMERICAL_NOMINAL_STATISTICS__NUMBER_MEASUREMENTS:
            return this.getNumberMeasurements() != null;
        case ExperimentDataPackage.NUMERICAL_NOMINAL_STATISTICS__NUMERICAL_MASS_DISTRIBUTION:
            return !this.getNumericalMassDistribution().isEmpty();
        case ExperimentDataPackage.NUMERICAL_NOMINAL_STATISTICS__DATA_SERIES:
            return this.getDataSeries() != null;
        }
        return super.eIsSet(featureID);
    }

} // NumericalNominalStatisticsImpl
