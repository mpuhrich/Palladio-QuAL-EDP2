/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.palladiosimulator.edp2.models.ExperimentData.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
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
     * The cached value of the '{@link #getFrequency() <em>Frequency</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getFrequency()
     * @generated
     * @ordered
     */
    protected long frequency = FREQUENCY_EDEFAULT;

    /**
     * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getIdentifier()
     * @generated
     * @ordered
     */
    protected Identifier identifier;

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
    public long getFrequency() {
        return this.frequency;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setFrequency(final long newFrequency) {
        final long oldFrequency = this.frequency;
        this.frequency = newFrequency;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    ExperimentDataPackage.TEXTUAL_MASS_DISTRIBUTION__FREQUENCY, oldFrequency, this.frequency));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Identifier getIdentifier() {
        if (this.identifier != null && ((EObject) this.identifier).eIsProxy()) {
            final InternalEObject oldIdentifier = (InternalEObject) this.identifier;
            this.identifier = (Identifier) this.eResolveProxy(oldIdentifier);
            if (this.identifier != oldIdentifier) {
                if (this.eNotificationRequired()) {
                    this.eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            ExperimentDataPackage.TEXTUAL_MASS_DISTRIBUTION__IDENTIFIER, oldIdentifier, this.identifier));
                }
            }
        }
        return this.identifier;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public Identifier basicGetIdentifier() {
        return this.identifier;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setIdentifier(final Identifier newIdentifier) {
        final Identifier oldIdentifier = this.identifier;
        this.identifier = newIdentifier;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    ExperimentDataPackage.TEXTUAL_MASS_DISTRIBUTION__IDENTIFIER, oldIdentifier, this.identifier));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public TextualNominalStatistics getTextualNominalStatistics() {
        if (this.eContainerFeatureID() != ExperimentDataPackage.TEXTUAL_MASS_DISTRIBUTION__TEXTUAL_NOMINAL_STATISTICS) {
            return null;
        }
        return (TextualNominalStatistics) this.eInternalContainer();
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
        if (newTextualNominalStatistics != this.eInternalContainer()
                || (this.eContainerFeatureID() != ExperimentDataPackage.TEXTUAL_MASS_DISTRIBUTION__TEXTUAL_NOMINAL_STATISTICS && newTextualNominalStatistics != null)) {
            if (EcoreUtil.isAncestor(this, newTextualNominalStatistics)) {
                throw new IllegalArgumentException("Recursive containment not allowed for " + this.toString());
            }
            NotificationChain msgs = null;
            if (this.eInternalContainer() != null) {
                msgs = this.eBasicRemoveFromContainer(msgs);
            }
            if (newTextualNominalStatistics != null) {
                msgs = ((InternalEObject) newTextualNominalStatistics).eInverseAdd(this,
                        ExperimentDataPackage.TEXTUAL_NOMINAL_STATISTICS__MASS_DISTRIBUTION,
                        TextualNominalStatistics.class, msgs);
            }
            msgs = this.basicSetTextualNominalStatistics(newTextualNominalStatistics, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        } else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    ExperimentDataPackage.TEXTUAL_MASS_DISTRIBUTION__TEXTUAL_NOMINAL_STATISTICS,
                    newTextualNominalStatistics, newTextualNominalStatistics));
        }
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
            return this.frequency != FREQUENCY_EDEFAULT;
        case ExperimentDataPackage.TEXTUAL_MASS_DISTRIBUTION__IDENTIFIER:
            return this.identifier != null;
        case ExperimentDataPackage.TEXTUAL_MASS_DISTRIBUTION__TEXTUAL_NOMINAL_STATISTICS:
            return this.getTextualNominalStatistics() != null;
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
        result.append(" (frequency: ");
        result.append(this.frequency);
        result.append(')');
        return result.toString();
    }

} // TextualMassDistributionImpl
