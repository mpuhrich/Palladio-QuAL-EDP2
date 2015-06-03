/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.palladiosimulator.edp2.models.ExperimentData.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
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
public class TextualNominalStatisticsImpl extends EObjectImpl implements TextualNominalStatistics {

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
     * The cached value of the '{@link #getNumberMeasurements() <em>Number Measurements</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getNumberMeasurements()
     * @generated
     * @ordered
     */
    protected long numberMeasurements = NUMBER_MEASUREMENTS_EDEFAULT;

    /**
     * The cached value of the '{@link #getMassDistribution() <em>Mass Distribution</em>}'
     * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getMassDistribution()
     * @generated
     * @ordered
     */
    protected EList<TextualMassDistribution> massDistribution;

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
    public long getNumberMeasurements() {
        return this.numberMeasurements;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setNumberMeasurements(final long newNumberMeasurements) {
        final long oldNumberMeasurements = this.numberMeasurements;
        this.numberMeasurements = newNumberMeasurements;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    ExperimentDataPackage.TEXTUAL_NOMINAL_STATISTICS__NUMBER_MEASUREMENTS, oldNumberMeasurements,
                    this.numberMeasurements));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<TextualMassDistribution> getMassDistribution() {
        if (this.massDistribution == null) {
            this.massDistribution = new EObjectContainmentWithInverseEList<TextualMassDistribution>(
                    TextualMassDistribution.class, this,
                    ExperimentDataPackage.TEXTUAL_NOMINAL_STATISTICS__MASS_DISTRIBUTION,
                    ExperimentDataPackage.TEXTUAL_MASS_DISTRIBUTION__TEXTUAL_NOMINAL_STATISTICS);
        }
        return this.massDistribution;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public DataSeries getDataSeries() {
        if (this.eContainerFeatureID() != ExperimentDataPackage.TEXTUAL_NOMINAL_STATISTICS__DATA_SERIES) {
            return null;
        }
        return (DataSeries) this.eInternalContainer();
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
        if (newDataSeries != this.eInternalContainer()
                || (this.eContainerFeatureID() != ExperimentDataPackage.TEXTUAL_NOMINAL_STATISTICS__DATA_SERIES && newDataSeries != null)) {
            if (EcoreUtil.isAncestor(this, newDataSeries)) {
                throw new IllegalArgumentException("Recursive containment not allowed for " + this.toString());
            }
            NotificationChain msgs = null;
            if (this.eInternalContainer() != null) {
                msgs = this.eBasicRemoveFromContainer(msgs);
            }
            if (newDataSeries != null) {
                msgs = ((InternalEObject) newDataSeries).eInverseAdd(this,
                        ExperimentDataPackage.DATA_SERIES__TEXTUAL_STATISTICS, DataSeries.class, msgs);
            }
            msgs = this.basicSetDataSeries(newDataSeries, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        } else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    ExperimentDataPackage.TEXTUAL_NOMINAL_STATISTICS__DATA_SERIES, newDataSeries, newDataSeries));
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
            return this.numberMeasurements != NUMBER_MEASUREMENTS_EDEFAULT;
        case ExperimentDataPackage.TEXTUAL_NOMINAL_STATISTICS__MASS_DISTRIBUTION:
            return this.massDistribution != null && !this.massDistribution.isEmpty();
        case ExperimentDataPackage.TEXTUAL_NOMINAL_STATISTICS__DATA_SERIES:
            return this.getDataSeries() != null;
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
        result.append(" (numberMeasurements: ");
        result.append(this.numberMeasurements);
        result.append(')');
        return result.toString();
    }

} // TextualNominalStatisticsImpl
