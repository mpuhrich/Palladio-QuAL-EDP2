/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.palladiosimulator.edp2.models.ExperimentData.impl;

import java.util.Map;

import javax.measure.Measure;
import javax.measure.quantity.Duration;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.palladiosimulator.edp2.models.ExperimentData.AggregatedMeasurements;
import org.palladiosimulator.edp2.models.ExperimentData.AggregationStatistics;
import org.palladiosimulator.edp2.models.ExperimentData.DataSeries;
import org.palladiosimulator.edp2.models.ExperimentData.DoubleBinaryMeasurements;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataFactory;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentGroup;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentGroupRun;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentRun;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentSetting;
import org.palladiosimulator.edp2.models.ExperimentData.FixedIntervals;
import org.palladiosimulator.edp2.models.ExperimentData.FixedWidthAggregatedMeasurements;
import org.palladiosimulator.edp2.models.ExperimentData.IdentifierBasedMeasurements;
import org.palladiosimulator.edp2.models.ExperimentData.JSXmlMeasurements;
import org.palladiosimulator.edp2.models.ExperimentData.LongBinaryMeasurements;
import org.palladiosimulator.edp2.models.ExperimentData.Measurement;
import org.palladiosimulator.edp2.models.ExperimentData.MeasurementRange;
import org.palladiosimulator.edp2.models.ExperimentData.MeasuringType;
import org.palladiosimulator.edp2.models.ExperimentData.NumericalIntervalStatistics;
import org.palladiosimulator.edp2.models.ExperimentData.NumericalMassDistribution;
import org.palladiosimulator.edp2.models.ExperimentData.NumericalNominalStatistics;
import org.palladiosimulator.edp2.models.ExperimentData.NumericalOrdinalStatistics;
import org.palladiosimulator.edp2.models.ExperimentData.NumericalPercentile;
import org.palladiosimulator.edp2.models.ExperimentData.NumericalRatioStatistics;
import org.palladiosimulator.edp2.models.ExperimentData.Propertyable;
import org.palladiosimulator.edp2.models.ExperimentData.RawMeasurements;
import org.palladiosimulator.edp2.models.ExperimentData.Run;
import org.palladiosimulator.edp2.models.ExperimentData.TextualMassDistribution;
import org.palladiosimulator.edp2.models.ExperimentData.TextualNominalStatistics;
import org.palladiosimulator.edp2.models.ExperimentData.TextualOrdinalStatistics;
import org.palladiosimulator.edp2.models.Repository.RepositoryPackage;
import org.palladiosimulator.edp2.models.Repository.impl.RepositoryPackageImpl;
import org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointPackage;
import org.palladiosimulator.edp2.models.measuringpoint.impl.MeasuringpointPackageImpl;
import org.palladiosimulator.metricspec.MetricSpecPackage;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class ExperimentDataPackageImpl extends EPackageImpl implements ExperimentDataPackage {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass aggregatedMeasurementsEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass measurementRangeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass dataSeriesEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass numericalNominalStatisticsEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass numericalMassDistributionEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass fixedWidthAggregatedMeasurementsEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass fixedIntervalsEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass textualNominalStatisticsEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass textualMassDistributionEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass propertyableEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass eStringtoEObjectMapEntryEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass rawMeasurementsEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass experimentGroupEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass experimentSettingEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass experimentRunEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass measurementEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass measuringTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass aggregationStatisticsEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass longBinaryMeasurementsEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass doubleBinaryMeasurementsEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass numericalIntervalStatisticsEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass numericalOrdinalStatisticsEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass numericalPercentileEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass jsXmlMeasurementsEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass ijsDurationEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass eComparableEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass textualOrdinalStatisticsEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass runEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass experimentGroupRunEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass identifierBasedMeasurementsEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass numericalRatioStatisticsEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EDataType ejsMeasureEDataType = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EDataType ejsDurationMeasureEDataType = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package package URI
     * value.
     * <p>
     * Note: the correct way to create the package is via the static factory method {@link #init
     * init()}, which also performs initialization of the package, or returns the registered
     * package, if one already exists. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private ExperimentDataPackageImpl() {
        super(eNS_URI, ExperimentDataFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others
     * upon which it depends.
     *
     * <p>
     * This method is used to initialize {@link ExperimentDataPackage#eINSTANCE} when that field is
     * accessed. Clients should not invoke it directly. Instead, they should simply access that
     * field to obtain the package. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static ExperimentDataPackage init() {
        if (isInited) {
            return (ExperimentDataPackage) EPackage.Registry.INSTANCE.getEPackage(ExperimentDataPackage.eNS_URI);
        }

        // Obtain or create and register package
        final ExperimentDataPackageImpl theExperimentDataPackage = (ExperimentDataPackageImpl) (EPackage.Registry.INSTANCE
                .get(eNS_URI) instanceof ExperimentDataPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
                        : new ExperimentDataPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        MetricSpecPackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        final RepositoryPackageImpl theRepositoryPackage = (RepositoryPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(RepositoryPackage.eNS_URI) instanceof RepositoryPackageImpl ? EPackage.Registry.INSTANCE
                        .getEPackage(RepositoryPackage.eNS_URI) : RepositoryPackage.eINSTANCE);
        final MeasuringpointPackageImpl theMeasuringpointPackage = (MeasuringpointPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(MeasuringpointPackage.eNS_URI) instanceof MeasuringpointPackageImpl ? EPackage.Registry.INSTANCE
                        .getEPackage(MeasuringpointPackage.eNS_URI)
                : MeasuringpointPackage.eINSTANCE);

        // Create package meta-data objects
        theExperimentDataPackage.createPackageContents();
        theRepositoryPackage.createPackageContents();
        theMeasuringpointPackage.createPackageContents();

        // Initialize created meta-data
        theExperimentDataPackage.initializePackageContents();
        theRepositoryPackage.initializePackageContents();
        theMeasuringpointPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theExperimentDataPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(ExperimentDataPackage.eNS_URI, theExperimentDataPackage);
        return theExperimentDataPackage;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getAggregatedMeasurements() {
        return this.aggregatedMeasurementsEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getAggregatedMeasurements_MeasurementRange() {
        return (EReference) this.aggregatedMeasurementsEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getAggregatedMeasurements_Valid() {
        return (EAttribute) this.aggregatedMeasurementsEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getAggregatedMeasurements_Function() {
        return (EReference) this.aggregatedMeasurementsEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getAggregatedMeasurements_AggregationStatistics() {
        return (EReference) this.aggregatedMeasurementsEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getAggregatedMeasurements_AggregationOn() {
        return (EReference) this.aggregatedMeasurementsEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getAggregatedMeasurements_Metric() {
        return (EReference) this.aggregatedMeasurementsEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getMeasurementRange() {
        return this.measurementRangeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getMeasurementRange_RawMeasurements() {
        return (EReference) this.measurementRangeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getMeasurementRange_Measurement() {
        return (EReference) this.measurementRangeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getMeasurementRange_EndTime() {
        return (EAttribute) this.measurementRangeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getMeasurementRange_StartTime() {
        return (EAttribute) this.measurementRangeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getMeasurementRange_AggregatedMeasurements() {
        return (EReference) this.measurementRangeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getDataSeries() {
        return this.dataSeriesEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getDataSeries_NumericalStatistics() {
        return (EReference) this.dataSeriesEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getDataSeries_AggregatedMeasurements() {
        return (EReference) this.dataSeriesEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getDataSeries_ValuesUuid() {
        return (EAttribute) this.dataSeriesEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getDataSeries_TextualStatistics() {
        return (EReference) this.dataSeriesEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getDataSeries_RawMeasurements() {
        return (EReference) this.dataSeriesEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getNumericalNominalStatistics() {
        return this.numericalNominalStatisticsEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getNumericalNominalStatistics_NumberMeasurements() {
        return (EAttribute) this.numericalNominalStatisticsEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getNumericalNominalStatistics_NumericalMassDistribution() {
        return (EReference) this.numericalNominalStatisticsEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getNumericalNominalStatistics_DataSeries() {
        return (EReference) this.numericalNominalStatisticsEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getNumericalMassDistribution() {
        return this.numericalMassDistributionEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getNumericalMassDistribution_Frequency() {
        return (EAttribute) this.numericalMassDistributionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getNumericalMassDistribution_Value() {
        return (EAttribute) this.numericalMassDistributionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getNumericalMassDistribution_NumericalNominalStatistics() {
        return (EReference) this.numericalMassDistributionEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getFixedWidthAggregatedMeasurements() {
        return this.fixedWidthAggregatedMeasurementsEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getFixedWidthAggregatedMeasurements_Intervals() {
        return (EReference) this.fixedWidthAggregatedMeasurementsEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getFixedWidthAggregatedMeasurements_DataSeries() {
        return (EReference) this.fixedWidthAggregatedMeasurementsEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getFixedIntervals() {
        return this.fixedIntervalsEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getFixedIntervals_LowerBound() {
        return (EAttribute) this.fixedIntervalsEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getFixedIntervals_Width() {
        return (EAttribute) this.fixedIntervalsEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getFixedIntervals_NumberOfIntervals() {
        return (EAttribute) this.fixedIntervalsEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getFixedIntervals_AggregatedMeasurements() {
        return (EReference) this.fixedIntervalsEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getTextualNominalStatistics() {
        return this.textualNominalStatisticsEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getTextualNominalStatistics_NumberMeasurements() {
        return (EAttribute) this.textualNominalStatisticsEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getTextualNominalStatistics_MassDistribution() {
        return (EReference) this.textualNominalStatisticsEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getTextualNominalStatistics_DataSeries() {
        return (EReference) this.textualNominalStatisticsEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getTextualMassDistribution() {
        return this.textualMassDistributionEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getTextualMassDistribution_Frequency() {
        return (EAttribute) this.textualMassDistributionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getTextualMassDistribution_Identifier() {
        return (EReference) this.textualMassDistributionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getTextualMassDistribution_TextualNominalStatistics() {
        return (EReference) this.textualMassDistributionEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getPropertyable() {
        return this.propertyableEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getPropertyable_AdditionalInformation() {
        return (EReference) this.propertyableEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getEStringtoEObjectMapEntry() {
        return this.eStringtoEObjectMapEntryEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getEStringtoEObjectMapEntry_Key() {
        return (EAttribute) this.eStringtoEObjectMapEntryEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getEStringtoEObjectMapEntry_Value() {
        return (EAttribute) this.eStringtoEObjectMapEntryEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getRawMeasurements() {
        return this.rawMeasurementsEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getRawMeasurements_DataSeries() {
        return (EReference) this.rawMeasurementsEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getRawMeasurements_MeasurementRange() {
        return (EReference) this.rawMeasurementsEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getExperimentGroup() {
        return this.experimentGroupEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getExperimentGroup_ExperimentSettings() {
        return (EReference) this.experimentGroupEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getExperimentGroup_MeasuringTypes() {
        return (EReference) this.experimentGroupEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getExperimentGroup_Repository() {
        return (EReference) this.experimentGroupEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getExperimentGroup_Reports() {
        return (EReference) this.experimentGroupEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getExperimentGroup_MeasuringPointRepositories() {
        return (EReference) this.experimentGroupEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getExperimentGroup_Purpose() {
        return (EAttribute) this.experimentGroupEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getExperimentSetting() {
        return this.experimentSettingEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getExperimentSetting_Description() {
        return (EAttribute) this.experimentSettingEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getExperimentSetting_ExperimentRuns() {
        return (EReference) this.experimentSettingEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getExperimentSetting_MeasuringTypes() {
        return (EReference) this.experimentSettingEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getExperimentSetting_ExperimentGroup() {
        return (EReference) this.experimentSettingEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getExperimentRun() {
        return this.experimentRunEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getExperimentRun_ExperimentSetting() {
        return (EReference) this.experimentRunEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getMeasurement() {
        return this.measurementEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getMeasurement_MeasuringType() {
        return (EReference) this.measurementEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getMeasurement_MeasurementRanges() {
        return (EReference) this.measurementEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getMeasurement_Run() {
        return (EReference) this.measurementEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getMeasuringType() {
        return this.measuringTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getMeasuringType_ExperimentGroup() {
        return (EReference) this.measuringTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getMeasuringType_ExperimentSettings() {
        return (EReference) this.measuringTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getMeasuringType_Metric() {
        return (EReference) this.measuringTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getMeasuringType_MeasuringPoint() {
        return (EReference) this.measuringTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getAggregationStatistics() {
        return this.aggregationStatisticsEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getAggregationStatistics_DistinctValuesBeforeAggregation() {
        return (EAttribute) this.aggregationStatisticsEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getAggregationStatistics_DistinctValuesAfterAggregation() {
        return (EAttribute) this.aggregationStatisticsEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getAggregationStatistics_AggregatedMeasurements() {
        return (EReference) this.aggregationStatisticsEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getLongBinaryMeasurements() {
        return this.longBinaryMeasurementsEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getLongBinaryMeasurements_StorageUnit() {
        return (EAttribute) this.longBinaryMeasurementsEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getDoubleBinaryMeasurements() {
        return this.doubleBinaryMeasurementsEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getDoubleBinaryMeasurements_StorageUnit() {
        return (EAttribute) this.doubleBinaryMeasurementsEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getNumericalIntervalStatistics() {
        return this.numericalIntervalStatisticsEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getNumericalIntervalStatistics_ArithmethicMean() {
        return (EAttribute) this.numericalIntervalStatisticsEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getNumericalIntervalStatistics_Variance() {
        return (EAttribute) this.numericalIntervalStatisticsEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getNumericalIntervalStatistics_StandardDeviation() {
        return (EAttribute) this.numericalIntervalStatisticsEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getNumericalIntervalStatistics_Sum() {
        return (EAttribute) this.numericalIntervalStatisticsEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getNumericalOrdinalStatistics() {
        return this.numericalOrdinalStatisticsEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getNumericalOrdinalStatistics_Minimum() {
        return (EAttribute) this.numericalOrdinalStatisticsEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getNumericalOrdinalStatistics_Maximum() {
        return (EAttribute) this.numericalOrdinalStatisticsEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getNumericalOrdinalStatistics_Median() {
        return (EAttribute) this.numericalOrdinalStatisticsEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getNumericalOrdinalStatistics_Percentiles() {
        return (EReference) this.numericalOrdinalStatisticsEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getNumericalPercentile() {
        return this.numericalPercentileEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getNumericalPercentile_Percentile() {
        return (EAttribute) this.numericalPercentileEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getNumericalPercentile_Value() {
        return (EAttribute) this.numericalPercentileEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getNumericalPercentile_OrdinalStatistics() {
        return (EReference) this.numericalPercentileEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getJSXmlMeasurements() {
        return this.jsXmlMeasurementsEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getIJSDuration() {
        return this.ijsDurationEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getEComparable() {
        return this.eComparableEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getTextualOrdinalStatistics() {
        return this.textualOrdinalStatisticsEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getTextualOrdinalStatistics_Minimum() {
        return (EReference) this.textualOrdinalStatisticsEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getTextualOrdinalStatistics_Maximum() {
        return (EReference) this.textualOrdinalStatisticsEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getTextualOrdinalStatistics_Median() {
        return (EReference) this.textualOrdinalStatisticsEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getRun() {
        return this.runEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getRun_Duration() {
        return (EAttribute) this.runEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getRun_StartTime() {
        return (EAttribute) this.runEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getRun_Measurement() {
        return (EReference) this.runEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getExperimentGroupRun() {
        return this.experimentGroupRunEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getExperimentGroupRun_Experimentgroup() {
        return (EReference) this.experimentGroupRunEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getIdentifierBasedMeasurements() {
        return this.identifierBasedMeasurementsEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getNumericalRatioStatistics() {
        return this.numericalRatioStatisticsEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getNumericalRatioStatistics_CoefficientOfVariation() {
        return (EAttribute) this.numericalRatioStatisticsEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getNumericalRatioStatistics_GeometricMean() {
        return (EAttribute) this.numericalRatioStatisticsEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getNumericalRatioStatistics_HarmonicMean() {
        return (EAttribute) this.numericalRatioStatisticsEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EDataType getEJSMeasure() {
        return this.ejsMeasureEDataType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EDataType getEJSDurationMeasure() {
        return this.ejsDurationMeasureEDataType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public ExperimentDataFactory getExperimentDataFactory() {
        return (ExperimentDataFactory) this.getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package. This method is guarded to have no affect on
     * any invocation but its first. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void createPackageContents() {
        if (this.isCreated) {
            return;
        }
        this.isCreated = true;

        // Create classes and their features
        this.aggregatedMeasurementsEClass = this.createEClass(AGGREGATED_MEASUREMENTS);
        this.createEReference(this.aggregatedMeasurementsEClass, AGGREGATED_MEASUREMENTS__MEASUREMENT_RANGE);
        this.createEAttribute(this.aggregatedMeasurementsEClass, AGGREGATED_MEASUREMENTS__VALID);
        this.createEReference(this.aggregatedMeasurementsEClass, AGGREGATED_MEASUREMENTS__FUNCTION);
        this.createEReference(this.aggregatedMeasurementsEClass, AGGREGATED_MEASUREMENTS__AGGREGATION_STATISTICS);
        this.createEReference(this.aggregatedMeasurementsEClass, AGGREGATED_MEASUREMENTS__AGGREGATION_ON);
        this.createEReference(this.aggregatedMeasurementsEClass, AGGREGATED_MEASUREMENTS__METRIC);

        this.measurementRangeEClass = this.createEClass(MEASUREMENT_RANGE);
        this.createEReference(this.measurementRangeEClass, MEASUREMENT_RANGE__RAW_MEASUREMENTS);
        this.createEReference(this.measurementRangeEClass, MEASUREMENT_RANGE__MEASUREMENT);
        this.createEAttribute(this.measurementRangeEClass, MEASUREMENT_RANGE__END_TIME);
        this.createEAttribute(this.measurementRangeEClass, MEASUREMENT_RANGE__START_TIME);
        this.createEReference(this.measurementRangeEClass, MEASUREMENT_RANGE__AGGREGATED_MEASUREMENTS);

        this.propertyableEClass = this.createEClass(PROPERTYABLE);
        this.createEReference(this.propertyableEClass, PROPERTYABLE__ADDITIONAL_INFORMATION);

        this.eStringtoEObjectMapEntryEClass = this.createEClass(ESTRINGTO_EOBJECT_MAP_ENTRY);
        this.createEAttribute(this.eStringtoEObjectMapEntryEClass, ESTRINGTO_EOBJECT_MAP_ENTRY__KEY);
        this.createEAttribute(this.eStringtoEObjectMapEntryEClass, ESTRINGTO_EOBJECT_MAP_ENTRY__VALUE);

        this.rawMeasurementsEClass = this.createEClass(RAW_MEASUREMENTS);
        this.createEReference(this.rawMeasurementsEClass, RAW_MEASUREMENTS__DATA_SERIES);
        this.createEReference(this.rawMeasurementsEClass, RAW_MEASUREMENTS__MEASUREMENT_RANGE);

        this.dataSeriesEClass = this.createEClass(DATA_SERIES);
        this.createEReference(this.dataSeriesEClass, DATA_SERIES__NUMERICAL_STATISTICS);
        this.createEReference(this.dataSeriesEClass, DATA_SERIES__AGGREGATED_MEASUREMENTS);
        this.createEAttribute(this.dataSeriesEClass, DATA_SERIES__VALUES_UUID);
        this.createEReference(this.dataSeriesEClass, DATA_SERIES__TEXTUAL_STATISTICS);
        this.createEReference(this.dataSeriesEClass, DATA_SERIES__RAW_MEASUREMENTS);

        this.numericalNominalStatisticsEClass = this.createEClass(NUMERICAL_NOMINAL_STATISTICS);
        this.createEAttribute(this.numericalNominalStatisticsEClass, NUMERICAL_NOMINAL_STATISTICS__NUMBER_MEASUREMENTS);
        this.createEReference(this.numericalNominalStatisticsEClass,
                NUMERICAL_NOMINAL_STATISTICS__NUMERICAL_MASS_DISTRIBUTION);
        this.createEReference(this.numericalNominalStatisticsEClass, NUMERICAL_NOMINAL_STATISTICS__DATA_SERIES);

        this.numericalMassDistributionEClass = this.createEClass(NUMERICAL_MASS_DISTRIBUTION);
        this.createEAttribute(this.numericalMassDistributionEClass, NUMERICAL_MASS_DISTRIBUTION__FREQUENCY);
        this.createEAttribute(this.numericalMassDistributionEClass, NUMERICAL_MASS_DISTRIBUTION__VALUE);
        this.createEReference(this.numericalMassDistributionEClass,
                NUMERICAL_MASS_DISTRIBUTION__NUMERICAL_NOMINAL_STATISTICS);

        this.fixedWidthAggregatedMeasurementsEClass = this.createEClass(FIXED_WIDTH_AGGREGATED_MEASUREMENTS);
        this.createEReference(this.fixedWidthAggregatedMeasurementsEClass,
                FIXED_WIDTH_AGGREGATED_MEASUREMENTS__INTERVALS);
        this.createEReference(this.fixedWidthAggregatedMeasurementsEClass,
                FIXED_WIDTH_AGGREGATED_MEASUREMENTS__DATA_SERIES);

        this.fixedIntervalsEClass = this.createEClass(FIXED_INTERVALS);
        this.createEAttribute(this.fixedIntervalsEClass, FIXED_INTERVALS__LOWER_BOUND);
        this.createEAttribute(this.fixedIntervalsEClass, FIXED_INTERVALS__WIDTH);
        this.createEAttribute(this.fixedIntervalsEClass, FIXED_INTERVALS__NUMBER_OF_INTERVALS);
        this.createEReference(this.fixedIntervalsEClass, FIXED_INTERVALS__AGGREGATED_MEASUREMENTS);

        this.textualNominalStatisticsEClass = this.createEClass(TEXTUAL_NOMINAL_STATISTICS);
        this.createEAttribute(this.textualNominalStatisticsEClass, TEXTUAL_NOMINAL_STATISTICS__NUMBER_MEASUREMENTS);
        this.createEReference(this.textualNominalStatisticsEClass, TEXTUAL_NOMINAL_STATISTICS__MASS_DISTRIBUTION);
        this.createEReference(this.textualNominalStatisticsEClass, TEXTUAL_NOMINAL_STATISTICS__DATA_SERIES);

        this.textualMassDistributionEClass = this.createEClass(TEXTUAL_MASS_DISTRIBUTION);
        this.createEAttribute(this.textualMassDistributionEClass, TEXTUAL_MASS_DISTRIBUTION__FREQUENCY);
        this.createEReference(this.textualMassDistributionEClass, TEXTUAL_MASS_DISTRIBUTION__IDENTIFIER);
        this.createEReference(this.textualMassDistributionEClass, TEXTUAL_MASS_DISTRIBUTION__TEXTUAL_NOMINAL_STATISTICS);

        this.experimentGroupEClass = this.createEClass(EXPERIMENT_GROUP);
        this.createEReference(this.experimentGroupEClass, EXPERIMENT_GROUP__EXPERIMENT_SETTINGS);
        this.createEReference(this.experimentGroupEClass, EXPERIMENT_GROUP__MEASURING_TYPES);
        this.createEAttribute(this.experimentGroupEClass, EXPERIMENT_GROUP__PURPOSE);
        this.createEReference(this.experimentGroupEClass, EXPERIMENT_GROUP__REPOSITORY);
        this.createEReference(this.experimentGroupEClass, EXPERIMENT_GROUP__REPORTS);
        this.createEReference(this.experimentGroupEClass, EXPERIMENT_GROUP__MEASURING_POINT_REPOSITORIES);

        this.experimentSettingEClass = this.createEClass(EXPERIMENT_SETTING);
        this.createEAttribute(this.experimentSettingEClass, EXPERIMENT_SETTING__DESCRIPTION);
        this.createEReference(this.experimentSettingEClass, EXPERIMENT_SETTING__EXPERIMENT_RUNS);
        this.createEReference(this.experimentSettingEClass, EXPERIMENT_SETTING__MEASURING_TYPES);
        this.createEReference(this.experimentSettingEClass, EXPERIMENT_SETTING__EXPERIMENT_GROUP);

        this.experimentRunEClass = this.createEClass(EXPERIMENT_RUN);
        this.createEReference(this.experimentRunEClass, EXPERIMENT_RUN__EXPERIMENT_SETTING);

        this.measurementEClass = this.createEClass(MEASUREMENT);
        this.createEReference(this.measurementEClass, MEASUREMENT__MEASURING_TYPE);
        this.createEReference(this.measurementEClass, MEASUREMENT__MEASUREMENT_RANGES);
        this.createEReference(this.measurementEClass, MEASUREMENT__RUN);

        this.measuringTypeEClass = this.createEClass(MEASURING_TYPE);
        this.createEReference(this.measuringTypeEClass, MEASURING_TYPE__EXPERIMENT_GROUP);
        this.createEReference(this.measuringTypeEClass, MEASURING_TYPE__EXPERIMENT_SETTINGS);
        this.createEReference(this.measuringTypeEClass, MEASURING_TYPE__METRIC);
        this.createEReference(this.measuringTypeEClass, MEASURING_TYPE__MEASURING_POINT);

        this.aggregationStatisticsEClass = this.createEClass(AGGREGATION_STATISTICS);
        this.createEAttribute(this.aggregationStatisticsEClass,
                AGGREGATION_STATISTICS__DISTINCT_VALUES_BEFORE_AGGREGATION);
        this.createEAttribute(this.aggregationStatisticsEClass,
                AGGREGATION_STATISTICS__DISTINCT_VALUES_AFTER_AGGREGATION);
        this.createEReference(this.aggregationStatisticsEClass, AGGREGATION_STATISTICS__AGGREGATED_MEASUREMENTS);

        this.doubleBinaryMeasurementsEClass = this.createEClass(DOUBLE_BINARY_MEASUREMENTS);
        this.createEAttribute(this.doubleBinaryMeasurementsEClass, DOUBLE_BINARY_MEASUREMENTS__STORAGE_UNIT);

        this.numericalIntervalStatisticsEClass = this.createEClass(NUMERICAL_INTERVAL_STATISTICS);
        this.createEAttribute(this.numericalIntervalStatisticsEClass, NUMERICAL_INTERVAL_STATISTICS__ARITHMETHIC_MEAN);
        this.createEAttribute(this.numericalIntervalStatisticsEClass, NUMERICAL_INTERVAL_STATISTICS__VARIANCE);
        this.createEAttribute(this.numericalIntervalStatisticsEClass, NUMERICAL_INTERVAL_STATISTICS__STANDARD_DEVIATION);
        this.createEAttribute(this.numericalIntervalStatisticsEClass, NUMERICAL_INTERVAL_STATISTICS__SUM);

        this.numericalOrdinalStatisticsEClass = this.createEClass(NUMERICAL_ORDINAL_STATISTICS);
        this.createEAttribute(this.numericalOrdinalStatisticsEClass, NUMERICAL_ORDINAL_STATISTICS__MINIMUM);
        this.createEAttribute(this.numericalOrdinalStatisticsEClass, NUMERICAL_ORDINAL_STATISTICS__MAXIMUM);
        this.createEAttribute(this.numericalOrdinalStatisticsEClass, NUMERICAL_ORDINAL_STATISTICS__MEDIAN);
        this.createEReference(this.numericalOrdinalStatisticsEClass, NUMERICAL_ORDINAL_STATISTICS__PERCENTILES);

        this.numericalPercentileEClass = this.createEClass(NUMERICAL_PERCENTILE);
        this.createEAttribute(this.numericalPercentileEClass, NUMERICAL_PERCENTILE__PERCENTILE);
        this.createEAttribute(this.numericalPercentileEClass, NUMERICAL_PERCENTILE__VALUE);
        this.createEReference(this.numericalPercentileEClass, NUMERICAL_PERCENTILE__ORDINAL_STATISTICS);

        this.jsXmlMeasurementsEClass = this.createEClass(JS_XML_MEASUREMENTS);

        this.longBinaryMeasurementsEClass = this.createEClass(LONG_BINARY_MEASUREMENTS);
        this.createEAttribute(this.longBinaryMeasurementsEClass, LONG_BINARY_MEASUREMENTS__STORAGE_UNIT);

        this.identifierBasedMeasurementsEClass = this.createEClass(IDENTIFIER_BASED_MEASUREMENTS);

        this.numericalRatioStatisticsEClass = this.createEClass(NUMERICAL_RATIO_STATISTICS);
        this.createEAttribute(this.numericalRatioStatisticsEClass, NUMERICAL_RATIO_STATISTICS__COEFFICIENT_OF_VARIATION);
        this.createEAttribute(this.numericalRatioStatisticsEClass, NUMERICAL_RATIO_STATISTICS__GEOMETRIC_MEAN);
        this.createEAttribute(this.numericalRatioStatisticsEClass, NUMERICAL_RATIO_STATISTICS__HARMONIC_MEAN);

        this.ijsDurationEClass = this.createEClass(IJS_DURATION);

        this.eComparableEClass = this.createEClass(ECOMPARABLE);

        this.textualOrdinalStatisticsEClass = this.createEClass(TEXTUAL_ORDINAL_STATISTICS);
        this.createEReference(this.textualOrdinalStatisticsEClass, TEXTUAL_ORDINAL_STATISTICS__MINIMUM);
        this.createEReference(this.textualOrdinalStatisticsEClass, TEXTUAL_ORDINAL_STATISTICS__MAXIMUM);
        this.createEReference(this.textualOrdinalStatisticsEClass, TEXTUAL_ORDINAL_STATISTICS__MEDIAN);

        this.runEClass = this.createEClass(RUN);
        this.createEAttribute(this.runEClass, RUN__DURATION);
        this.createEAttribute(this.runEClass, RUN__START_TIME);
        this.createEReference(this.runEClass, RUN__MEASUREMENT);

        this.experimentGroupRunEClass = this.createEClass(EXPERIMENT_GROUP_RUN);
        this.createEReference(this.experimentGroupRunEClass, EXPERIMENT_GROUP_RUN__EXPERIMENTGROUP);

        // Create data types
        this.ejsMeasureEDataType = this.createEDataType(EJS_MEASURE);
        this.ejsDurationMeasureEDataType = this.createEDataType(EJS_DURATION_MEASURE);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model. This method is guarded to have
     * no affect on any invocation but its first. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void initializePackageContents() {
        if (this.isInitialized) {
            return;
        }
        this.isInitialized = true;

        // Initialize package
        this.setName(eNAME);
        this.setNsPrefix(eNS_PREFIX);
        this.setNsURI(eNS_URI);

        // Obtain other dependent packages
        final IdentifierPackage theIdentifierPackage = (IdentifierPackage) EPackage.Registry.INSTANCE
                .getEPackage(IdentifierPackage.eNS_URI);
        final MetricSpecPackage theMetricSpecPackage = (MetricSpecPackage) EPackage.Registry.INSTANCE
                .getEPackage(MetricSpecPackage.eNS_URI);
        final RepositoryPackage theRepositoryPackage = (RepositoryPackage) EPackage.Registry.INSTANCE
                .getEPackage(RepositoryPackage.eNS_URI);
        final MeasuringpointPackage theMeasuringpointPackage = (MeasuringpointPackage) EPackage.Registry.INSTANCE
                .getEPackage(MeasuringpointPackage.eNS_URI);

        // Create type parameters
        final ETypeParameter doubleBinaryMeasurementsEClass_Q = this.addETypeParameter(
                this.doubleBinaryMeasurementsEClass, "Q");
        this.addETypeParameter(this.ejsMeasureEDataType, "V");
        final ETypeParameter ejsMeasureEDataType_Q = this.addETypeParameter(this.ejsMeasureEDataType, "Q");

        // Set bounds for type parameters
        EGenericType g1 = this.createEGenericType(theMetricSpecPackage.getIJSQuantity());
        doubleBinaryMeasurementsEClass_Q.getEBounds().add(g1);
        g1 = this.createEGenericType(theMetricSpecPackage.getIJSQuantity());
        ejsMeasureEDataType_Q.getEBounds().add(g1);

        // Add supertypes to classes
        this.aggregatedMeasurementsEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
        this.measurementRangeEClass.getESuperTypes().add(this.getPropertyable());
        this.rawMeasurementsEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
        this.numericalNominalStatisticsEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
        this.fixedWidthAggregatedMeasurementsEClass.getESuperTypes().add(this.getAggregatedMeasurements());
        this.fixedIntervalsEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
        this.experimentGroupEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
        this.experimentGroupEClass.getESuperTypes().add(this.getPropertyable());
        this.experimentSettingEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
        this.experimentSettingEClass.getESuperTypes().add(this.getPropertyable());
        this.experimentRunEClass.getESuperTypes().add(this.getRun());
        this.measurementEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
        this.measurementEClass.getESuperTypes().add(this.getPropertyable());
        this.measuringTypeEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
        this.aggregationStatisticsEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
        this.doubleBinaryMeasurementsEClass.getESuperTypes().add(this.getDataSeries());
        this.numericalIntervalStatisticsEClass.getESuperTypes().add(this.getNumericalOrdinalStatistics());
        this.numericalOrdinalStatisticsEClass.getESuperTypes().add(this.getNumericalNominalStatistics());
        this.numericalPercentileEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
        this.jsXmlMeasurementsEClass.getESuperTypes().add(this.getDataSeries());
        this.longBinaryMeasurementsEClass.getESuperTypes().add(this.getDataSeries());
        this.identifierBasedMeasurementsEClass.getESuperTypes().add(this.getDataSeries());
        this.numericalRatioStatisticsEClass.getESuperTypes().add(this.getNumericalIntervalStatistics());
        this.textualOrdinalStatisticsEClass.getESuperTypes().add(this.getTextualNominalStatistics());
        this.runEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
        this.runEClass.getESuperTypes().add(this.getPropertyable());
        this.experimentGroupRunEClass.getESuperTypes().add(this.getRun());

        // Initialize classes and features; add operations and parameters
        this.initEClass(this.aggregatedMeasurementsEClass, AggregatedMeasurements.class, "AggregatedMeasurements",
                IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getAggregatedMeasurements_MeasurementRange(), this.getMeasurementRange(),
                this.getMeasurementRange_AggregatedMeasurements(), "measurementRange", null, 1, 1,
                AggregatedMeasurements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEAttribute(this.getAggregatedMeasurements_Valid(), this.ecorePackage.getEBoolean(), "valid", null, 1,
                1,
                AggregatedMeasurements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getAggregatedMeasurements_Function(),
                theMetricSpecPackage.getAggregationFunctionDescription(),
                null, "function", null, 1, 1, AggregatedMeasurements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getAggregatedMeasurements_AggregationStatistics(), this.getAggregationStatistics(),
                this.getAggregationStatistics_AggregatedMeasurements(), "aggregationStatistics", null, 0, 1,
                AggregatedMeasurements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getAggregatedMeasurements_AggregationOn(),
                theMetricSpecPackage.getBaseMetricDescription(),
                null, "aggregationOn", null, 1, 1, AggregatedMeasurements.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getAggregatedMeasurements_Metric(), theMetricSpecPackage.getMetricDescription(), null,
                "metric",
                null, 1, 1, AggregatedMeasurements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.measurementRangeEClass, MeasurementRange.class, "MeasurementRange", !IS_ABSTRACT,
                !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getMeasurementRange_RawMeasurements(), this.getRawMeasurements(),
                this.getRawMeasurements_MeasurementRange(), "rawMeasurements", null, 0, 1, MeasurementRange.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getMeasurementRange_Measurement(), this.getMeasurement(),
                this.getMeasurement_MeasurementRanges(), "measurement", null, 1, 1, MeasurementRange.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEAttribute(this.getMeasurementRange_EndTime(), this.getEJSDurationMeasure(), "endTime", null, 1, 1,
                MeasurementRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, !IS_ORDERED);
        this.initEAttribute(this.getMeasurementRange_StartTime(), this.getEJSDurationMeasure(), "startTime", null, 1,
                1,
                MeasurementRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getMeasurementRange_AggregatedMeasurements(), this.getAggregatedMeasurements(),
                this.getAggregatedMeasurements_MeasurementRange(), "aggregatedMeasurements", null, 0, -1,
                MeasurementRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.propertyableEClass, Propertyable.class, "Propertyable", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getPropertyable_AdditionalInformation(), this.getEStringtoEObjectMapEntry(), null,
                "additionalInformation", null, 0, -1, Propertyable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.eStringtoEObjectMapEntryEClass, Map.Entry.class, "EStringtoEObjectMapEntry", !IS_ABSTRACT,
                !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getEStringtoEObjectMapEntry_Key(), this.ecorePackage.getEString(), "key", null, 1, 1,
                Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, !IS_ORDERED);
        this.initEAttribute(this.getEStringtoEObjectMapEntry_Value(), this.ecorePackage.getEJavaObject(), "value",
                null, 1, 1,
                Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.rawMeasurementsEClass, RawMeasurements.class, "RawMeasurements", !IS_ABSTRACT,
                !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getRawMeasurements_DataSeries(), this.getDataSeries(),
                this.getDataSeries_RawMeasurements(),
                "dataSeries", null, 1, -1, RawMeasurements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getRawMeasurements_MeasurementRange(), this.getMeasurementRange(),
                this.getMeasurementRange_RawMeasurements(), "measurementRange", null, 1, 1, RawMeasurements.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.dataSeriesEClass, DataSeries.class, "DataSeries", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getDataSeries_NumericalStatistics(), this.getNumericalNominalStatistics(),
                this.getNumericalNominalStatistics_DataSeries(), "numericalStatistics", null, 0, 1, DataSeries.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getDataSeries_AggregatedMeasurements(), this.getFixedWidthAggregatedMeasurements(),
                this.getFixedWidthAggregatedMeasurements_DataSeries(), "aggregatedMeasurements", null, 0, 1,
                DataSeries.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEAttribute(this.getDataSeries_ValuesUuid(), this.ecorePackage.getEString(), "valuesUuid", null, 1, 1,
                DataSeries.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE,
                !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getDataSeries_TextualStatistics(), this.getTextualNominalStatistics(),
                this.getTextualNominalStatistics_DataSeries(), "textualStatistics", null, 0, 1, DataSeries.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getDataSeries_RawMeasurements(), this.getRawMeasurements(),
                this.getRawMeasurements_DataSeries(), "rawMeasurements", null, 0, 1, DataSeries.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
                !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.numericalNominalStatisticsEClass, NumericalNominalStatistics.class,
                "NumericalNominalStatistics",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getNumericalNominalStatistics_NumberMeasurements(), this.getEJSMeasure(),
                "numberMeasurements",
                null, 1, 1, NumericalNominalStatistics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getNumericalNominalStatistics_NumericalMassDistribution(),
                this.getNumericalMassDistribution(),
                this.getNumericalMassDistribution_NumericalNominalStatistics(), "numericalMassDistribution", null, 0,
                -1, NumericalNominalStatistics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getNumericalNominalStatistics_DataSeries(), this.getDataSeries(),
                this.getDataSeries_NumericalStatistics(), "dataSeries", null, 1, 1, NumericalNominalStatistics.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.numericalMassDistributionEClass, NumericalMassDistribution.class,
                "NumericalMassDistribution",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getNumericalMassDistribution_Frequency(), this.ecorePackage.getELong(), "frequency",
                null, 1, 1,
                NumericalMassDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEAttribute(this.getNumericalMassDistribution_Value(), this.getEJSMeasure(), "value", null, 1, 1,
                NumericalMassDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getNumericalMassDistribution_NumericalNominalStatistics(),
                this.getNumericalNominalStatistics(),
                this.getNumericalNominalStatistics_NumericalMassDistribution(), "numericalNominalStatistics", null, 1,
                1, NumericalMassDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.fixedWidthAggregatedMeasurementsEClass, FixedWidthAggregatedMeasurements.class,
                "FixedWidthAggregatedMeasurements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getFixedWidthAggregatedMeasurements_Intervals(), this.getFixedIntervals(),
                this.getFixedIntervals_AggregatedMeasurements(), "intervals", null, 1, 1,
                FixedWidthAggregatedMeasurements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getFixedWidthAggregatedMeasurements_DataSeries(), this.getDataSeries(),
                this.getDataSeries_AggregatedMeasurements(), "dataSeries", null, 1, -1,
                FixedWidthAggregatedMeasurements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.fixedIntervalsEClass, FixedIntervals.class, "FixedIntervals", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getFixedIntervals_LowerBound(), this.getEJSMeasure(), "lowerBound", null, 1, 1,
                FixedIntervals.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, !IS_ORDERED);
        this.initEAttribute(this.getFixedIntervals_Width(), this.getEJSMeasure(), "width", null, 1, 1,
                FixedIntervals.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEAttribute(this.getFixedIntervals_NumberOfIntervals(), this.ecorePackage.getELong(),
                "numberOfIntervals", null, 1, 1,
                FixedIntervals.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getFixedIntervals_AggregatedMeasurements(),
                this.getFixedWidthAggregatedMeasurements(),
                this.getFixedWidthAggregatedMeasurements_Intervals(), "aggregatedMeasurements", null, 1, 1,
                FixedIntervals.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.textualNominalStatisticsEClass, TextualNominalStatistics.class,
                "TextualNominalStatistics",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getTextualNominalStatistics_NumberMeasurements(), this.ecorePackage.getELong(),
                "numberMeasurements",
                null, 1, 1, TextualNominalStatistics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
                !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getTextualNominalStatistics_MassDistribution(), this.getTextualMassDistribution(),
                this.getTextualMassDistribution_TextualNominalStatistics(), "massDistribution", null, 0, -1,
                TextualNominalStatistics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getTextualNominalStatistics_DataSeries(), this.getDataSeries(),
                this.getDataSeries_TextualStatistics(), "dataSeries", null, 1, 1, TextualNominalStatistics.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.textualMassDistributionEClass, TextualMassDistribution.class, "TextualMassDistribution",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getTextualMassDistribution_Frequency(), this.ecorePackage.getELong(), "frequency",
                null, 1, 1,
                TextualMassDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getTextualMassDistribution_Identifier(), theMetricSpecPackage.getIdentifier(), null,
                "identifier", null, 1, 1, TextualMassDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getTextualMassDistribution_TextualNominalStatistics(),
                this.getTextualNominalStatistics(),
                this.getTextualNominalStatistics_MassDistribution(), "textualNominalStatistics", null, 1, 1,
                TextualMassDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.experimentGroupEClass, ExperimentGroup.class, "ExperimentGroup", !IS_ABSTRACT,
                !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getExperimentGroup_ExperimentSettings(), this.getExperimentSetting(),
                this.getExperimentSetting_ExperimentGroup(), "experimentSettings", null, 0, -1, ExperimentGroup.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getExperimentGroup_MeasuringTypes(), this.getMeasuringType(),
                this.getMeasuringType_ExperimentGroup(), "measuringTypes", null, 0, -1, ExperimentGroup.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEAttribute(this.getExperimentGroup_Purpose(), this.ecorePackage.getEString(), "purpose", null, 1, 1,
                ExperimentGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getExperimentGroup_Repository(), theRepositoryPackage.getRepository(),
                theRepositoryPackage.getRepository_ExperimentGroups(), "repository", null, 0, 1, ExperimentGroup.class,
                IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getExperimentGroup_Reports(), this.getExperimentGroupRun(),
                this.getExperimentGroupRun_Experimentgroup(), "reports", null, 0, -1, ExperimentGroup.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getExperimentGroup_MeasuringPointRepositories(),
                theMeasuringpointPackage.getMeasuringPointRepository(), null, "measuringPointRepositories", null, 0,
                -1, ExperimentGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.experimentSettingEClass, ExperimentSetting.class, "ExperimentSetting", !IS_ABSTRACT,
                !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getExperimentSetting_Description(), this.ecorePackage.getEString(), "description",
                null, 1, 1,
                ExperimentSetting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getExperimentSetting_ExperimentRuns(), this.getExperimentRun(),
                this.getExperimentRun_ExperimentSetting(), "experimentRuns", null, 0, -1, ExperimentSetting.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getExperimentSetting_MeasuringTypes(), this.getMeasuringType(),
                this.getMeasuringType_ExperimentSettings(), "measuringTypes", null, 0, -1, ExperimentSetting.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getExperimentSetting_ExperimentGroup(), this.getExperimentGroup(),
                this.getExperimentGroup_ExperimentSettings(), "experimentGroup", null, 1, 1, ExperimentSetting.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.experimentRunEClass, ExperimentRun.class, "ExperimentRun", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getExperimentRun_ExperimentSetting(), this.getExperimentSetting(),
                this.getExperimentSetting_ExperimentRuns(), "experimentSetting", null, 1, 1, ExperimentRun.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.measurementEClass, Measurement.class, "Measurement", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getMeasurement_MeasuringType(), this.getMeasuringType(), null, "measuringType", null,
                1, 1,
                Measurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getMeasurement_MeasurementRanges(), this.getMeasurementRange(),
                this.getMeasurementRange_Measurement(), "measurementRanges", null, 0, -1, Measurement.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getMeasurement_Run(), this.getRun(), this.getRun_Measurement(), "run", null, 1, 1,
                Measurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.measuringTypeEClass, MeasuringType.class, "MeasuringType", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getMeasuringType_ExperimentGroup(), this.getExperimentGroup(),
                this.getExperimentGroup_MeasuringTypes(), "experimentGroup", null, 1, 1, MeasuringType.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getMeasuringType_ExperimentSettings(), this.getExperimentSetting(),
                this.getExperimentSetting_MeasuringTypes(), "experimentSettings", null, 0, -1, MeasuringType.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getMeasuringType_Metric(), theMetricSpecPackage.getMetricDescription(), null,
                "metric", null, 1,
                1, MeasuringType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getMeasuringType_MeasuringPoint(), theMeasuringpointPackage.getMeasuringPoint(), null,
                "measuringPoint", null, 1, 1, MeasuringType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.aggregationStatisticsEClass, AggregationStatistics.class, "AggregationStatistics",
                !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getAggregationStatistics_DistinctValuesBeforeAggregation(),
                this.ecorePackage.getELong(),
                "distinctValuesBeforeAggregation", null, 1, 1, AggregationStatistics.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEAttribute(this.getAggregationStatistics_DistinctValuesAfterAggregation(),
                this.ecorePackage.getELong(),
                "distinctValuesAfterAggregation", null, 1, 1, AggregationStatistics.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getAggregationStatistics_AggregatedMeasurements(), this.getAggregatedMeasurements(),
                this.getAggregatedMeasurements_AggregationStatistics(), "aggregatedMeasurements", null, 1, 1,
                AggregationStatistics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.doubleBinaryMeasurementsEClass, DoubleBinaryMeasurements.class,
                "DoubleBinaryMeasurements",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        g1 = this.createEGenericType(theMetricSpecPackage.getEJSUnit());
        final EGenericType g2 = this.createEGenericType(doubleBinaryMeasurementsEClass_Q);
        g1.getETypeArguments().add(g2);
        this.initEAttribute(this.getDoubleBinaryMeasurements_StorageUnit(), g1, "storageUnit", null, 1, 1,
                DoubleBinaryMeasurements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.numericalIntervalStatisticsEClass, NumericalIntervalStatistics.class,
                "NumericalIntervalStatistics",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getNumericalIntervalStatistics_ArithmethicMean(), this.getEJSMeasure(),
                "arithmethicMean", null,
                1, 1, NumericalIntervalStatistics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
                !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEAttribute(this.getNumericalIntervalStatistics_Variance(), this.getEJSMeasure(), "variance", null, 1,
                1,
                NumericalIntervalStatistics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEAttribute(this.getNumericalIntervalStatistics_StandardDeviation(), this.getEJSMeasure(),
                "standardDeviation",
                null, 1, 1, NumericalIntervalStatistics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEAttribute(this.getNumericalIntervalStatistics_Sum(), this.getEJSMeasure(), "sum", null, 1, 1,
                NumericalIntervalStatistics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.numericalOrdinalStatisticsEClass, NumericalOrdinalStatistics.class,
                "NumericalOrdinalStatistics",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getNumericalOrdinalStatistics_Minimum(), this.getEJSMeasure(), "minimum", null, 1, 1,
                NumericalOrdinalStatistics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEAttribute(this.getNumericalOrdinalStatistics_Maximum(), this.getEJSMeasure(), "maximum", null, 1, 1,
                NumericalOrdinalStatistics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEAttribute(this.getNumericalOrdinalStatistics_Median(), this.getEJSMeasure(), "median", null, 0, 1,
                NumericalOrdinalStatistics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getNumericalOrdinalStatistics_Percentiles(), this.getNumericalPercentile(),
                this.getNumericalPercentile_OrdinalStatistics(), "percentiles", null, 0, -1,
                NumericalOrdinalStatistics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.numericalPercentileEClass, NumericalPercentile.class, "NumericalPercentile", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getNumericalPercentile_Percentile(), this.ecorePackage.getEDouble(), "percentile",
                null, 1, 1,
                NumericalPercentile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEAttribute(this.getNumericalPercentile_Value(), this.getEJSMeasure(), "value", null, 1, 1,
                NumericalPercentile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getNumericalPercentile_OrdinalStatistics(), this.getNumericalOrdinalStatistics(),
                this.getNumericalOrdinalStatistics_Percentiles(), "ordinalStatistics", null, 1, 1,
                NumericalPercentile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.jsXmlMeasurementsEClass, JSXmlMeasurements.class, "JSXmlMeasurements", !IS_ABSTRACT,
                !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.longBinaryMeasurementsEClass, LongBinaryMeasurements.class, "LongBinaryMeasurements",
                !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getLongBinaryMeasurements_StorageUnit(), theMetricSpecPackage.getEJSUnit(),
                "storageUnit", null,
                1, 1, LongBinaryMeasurements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.identifierBasedMeasurementsEClass, IdentifierBasedMeasurements.class,
                "IdentifierBasedMeasurements",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.numericalRatioStatisticsEClass, NumericalRatioStatistics.class,
                "NumericalRatioStatistics",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getNumericalRatioStatistics_CoefficientOfVariation(), this.getEJSMeasure(),
                "coefficientOfVariation", null, 1, 1, NumericalRatioStatistics.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEAttribute(this.getNumericalRatioStatistics_GeometricMean(), this.getEJSMeasure(), "geometricMean",
                null, 1, 1,
                NumericalRatioStatistics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEAttribute(this.getNumericalRatioStatistics_HarmonicMean(), this.getEJSMeasure(), "harmonicMean",
                null, 1, 1,
                NumericalRatioStatistics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.ijsDurationEClass, Duration.class, "IJSDuration", IS_ABSTRACT, IS_INTERFACE,
                !IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.eComparableEClass, Comparable.class, "EComparable", IS_ABSTRACT, IS_INTERFACE,
                !IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.textualOrdinalStatisticsEClass, TextualOrdinalStatistics.class,
                "TextualOrdinalStatistics",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getTextualOrdinalStatistics_Minimum(), theMetricSpecPackage.getIdentifier(), null,
                "minimum",
                null, 1, 1, TextualOrdinalStatistics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getTextualOrdinalStatistics_Maximum(), theMetricSpecPackage.getIdentifier(), null,
                "maximum",
                null, 1, 1, TextualOrdinalStatistics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getTextualOrdinalStatistics_Median(), theMetricSpecPackage.getIdentifier(), null,
                "median",
                null, 1, 1, TextualOrdinalStatistics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.runEClass, Run.class, "Run", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getRun_Duration(), this.getEJSDurationMeasure(), "duration", null, 1, 1, Run.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEAttribute(this.getRun_StartTime(), this.ecorePackage.getEDate(), "startTime", null, 1, 1, Run.class,
                !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getRun_Measurement(), this.getMeasurement(), this.getMeasurement_Run(), "measurement",
                null, 0,
                -1, Run.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.experimentGroupRunEClass, ExperimentGroupRun.class, "ExperimentGroupRun", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getExperimentGroupRun_Experimentgroup(), this.getExperimentGroup(),
                this.getExperimentGroup_Reports(), "experimentgroup", null, 1, 1, ExperimentGroupRun.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Initialize data types
        this.initEDataType(this.ejsMeasureEDataType, Measure.class, "EJSMeasure", IS_SERIALIZABLE,
                !IS_GENERATED_INSTANCE_CLASS);
        this.initEDataType(this.ejsDurationMeasureEDataType, Measure.class, "EJSDurationMeasure", IS_SERIALIZABLE,
                !IS_GENERATED_INSTANCE_CLASS);

        // Create resource
        this.createResource(eNS_URI);
    }

} // EmfmodelPackageImpl
