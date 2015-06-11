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
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage;
import org.palladiosimulator.edp2.models.ExperimentData.TextualMassDistribution;
import org.palladiosimulator.edp2.models.ExperimentData.TextualNominalStatistics;
import org.palladiosimulator.metricspec.Identifier;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Textual Mass Distribution</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.TextualMassDistributionImpl#getFrequency
 * <em>Frequency</em>}</li>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.TextualMassDistributionImpl#getIdentifier
 * <em>Identifier</em>}</li>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.TextualMassDistributionImpl#getTextualNominalStatistics
 * <em>Textual Nominal Statistics</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TextualMassDistributionImpl extends CDOObjectImpl implements TextualMassDistribution {

    /**
     * The default value of the '{@link #getFrequency() <em>Frequency</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getFrequency()
     * @generated
     * @ordered
     */
    protected static final long FREQUENCY_EDEFAULT = 0L;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected TextualMassDistributionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ExperimentDataPackage.Literals.TEXTUAL_MASS_DISTRIBUTION;
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
    public long getFrequency() {
        return (Long) this.eDynamicGet(ExperimentDataPackage.TEXTUAL_MASS_DISTRIBUTION__FREQUENCY,
                ExperimentDataPackage.Literals.TEXTUAL_MASS_DISTRIBUTION__FREQUENCY, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setFrequency(final long newFrequency) {
        this.eDynamicSet(ExperimentDataPackage.TEXTUAL_MASS_DISTRIBUTION__FREQUENCY,
                ExperimentDataPackage.Literals.TEXTUAL_MASS_DISTRIBUTION__FREQUENCY, newFrequency);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Identifier getIdentifier() {
        return (Identifier) this.eDynamicGet(ExperimentDataPackage.TEXTUAL_MASS_DISTRIBUTION__IDENTIFIER,
                ExperimentDataPackage.Literals.TEXTUAL_MASS_DISTRIBUTION__IDENTIFIER, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public Identifier basicGetIdentifier() {
        return (Identifier) this.eDynamicGet(ExperimentDataPackage.TEXTUAL_MASS_DISTRIBUTION__IDENTIFIER,
                ExperimentDataPackage.Literals.TEXTUAL_MASS_DISTRIBUTION__IDENTIFIER, false, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setIdentifier(final Identifier newIdentifier) {
        this.eDynamicSet(ExperimentDataPackage.TEXTUAL_MASS_DISTRIBUTION__IDENTIFIER,
                ExperimentDataPackage.Literals.TEXTUAL_MASS_DISTRIBUTION__IDENTIFIER, newIdentifier);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public TextualNominalStatistics getTextualNominalStatistics() {
        return (TextualNominalStatistics) this.eDynamicGet(
                ExperimentDataPackage.TEXTUAL_MASS_DISTRIBUTION__TEXTUAL_NOMINAL_STATISTICS,
                ExperimentDataPackage.Literals.TEXTUAL_MASS_DISTRIBUTION__TEXTUAL_NOMINAL_STATISTICS, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetTextualNominalStatistics(
            final TextualNominalStatistics newTextualNominalStatistics, NotificationChain msgs) {
        msgs = this.eBasicSetContainer((InternalEObject) newTextualNominalStatistics,
                ExperimentDataPackage.TEXTUAL_MASS_DISTRIBUTION__TEXTUAL_NOMINAL_STATISTICS, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setTextualNominalStatistics(final TextualNominalStatistics newTextualNominalStatistics) {
        this.eDynamicSet(ExperimentDataPackage.TEXTUAL_MASS_DISTRIBUTION__TEXTUAL_NOMINAL_STATISTICS,
                ExperimentDataPackage.Literals.TEXTUAL_MASS_DISTRIBUTION__TEXTUAL_NOMINAL_STATISTICS,
                newTextualNominalStatistics);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(final InternalEObject otherEnd, final int featureID, NotificationChain msgs) {
        switch (featureID) {
        case ExperimentDataPackage.TEXTUAL_MASS_DISTRIBUTION__TEXTUAL_NOMINAL_STATISTICS:
            if (this.eInternalContainer() != null) {
                msgs = this.eBasicRemoveFromContainer(msgs);
            }
            return this.basicSetTextualNominalStatistics((TextualNominalStatistics) otherEnd, msgs);
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
        case ExperimentDataPackage.TEXTUAL_MASS_DISTRIBUTION__TEXTUAL_NOMINAL_STATISTICS:
            return this.basicSetTextualNominalStatistics(null, msgs);
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
        case ExperimentDataPackage.TEXTUAL_MASS_DISTRIBUTION__TEXTUAL_NOMINAL_STATISTICS:
            return this.eInternalContainer().eInverseRemove(this,
                    ExperimentDataPackage.TEXTUAL_NOMINAL_STATISTICS__MASS_DISTRIBUTION,
                    TextualNominalStatistics.class, msgs);
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
        case ExperimentDataPackage.TEXTUAL_MASS_DISTRIBUTION__FREQUENCY:
            return this.getFrequency();
        case ExperimentDataPackage.TEXTUAL_MASS_DISTRIBUTION__IDENTIFIER:
            if (resolve) {
                return this.getIdentifier();
            }
            return this.basicGetIdentifier();
        case ExperimentDataPackage.TEXTUAL_MASS_DISTRIBUTION__TEXTUAL_NOMINAL_STATISTICS:
            return this.getTextualNominalStatistics();
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
        case ExperimentDataPackage.TEXTUAL_MASS_DISTRIBUTION__FREQUENCY:
            this.setFrequency((Long) newValue);
            return;
        case ExperimentDataPackage.TEXTUAL_MASS_DISTRIBUTION__IDENTIFIER:
            this.setIdentifier((Identifier) newValue);
            return;
        case ExperimentDataPackage.TEXTUAL_MASS_DISTRIBUTION__TEXTUAL_NOMINAL_STATISTICS:
            this.setTextualNominalStatistics((TextualNominalStatistics) newValue);
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
        case ExperimentDataPackage.TEXTUAL_MASS_DISTRIBUTION__FREQUENCY:
            this.setFrequency(FREQUENCY_EDEFAULT);
            return;
        case ExperimentDataPackage.TEXTUAL_MASS_DISTRIBUTION__IDENTIFIER:
            this.setIdentifier((Identifier) null);
            return;
        case ExperimentDataPackage.TEXTUAL_MASS_DISTRIBUTION__TEXTUAL_NOMINAL_STATISTICS:
            this.setTextualNominalStatistics((TextualNominalStatistics) null);
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
        case ExperimentDataPackage.TEXTUAL_MASS_DISTRIBUTION__FREQUENCY:
            return this.getFrequency() != FREQUENCY_EDEFAULT;
        case ExperimentDataPackage.TEXTUAL_MASS_DISTRIBUTION__IDENTIFIER:
            return this.basicGetIdentifier() != null;
        case ExperimentDataPackage.TEXTUAL_MASS_DISTRIBUTION__TEXTUAL_NOMINAL_STATISTICS:
            return this.getTextualNominalStatistics() != null;
        }
        return super.eIsSet(featureID);
    }

} // TextualMassDistributionImpl
