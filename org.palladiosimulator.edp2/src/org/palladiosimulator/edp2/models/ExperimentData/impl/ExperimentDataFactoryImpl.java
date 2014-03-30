/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.palladiosimulator.edp2.models.ExperimentData.impl;

import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.measure.Measure;
import javax.measure.quantity.Quantity;
import javax.measure.unit.Unit;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.palladiosimulator.edp2.internal.DataSeriesFromRawMeasurementsSwitch;
import org.palladiosimulator.edp2.internal.SerializationUtil;
import org.palladiosimulator.edp2.models.ExperimentData.AggregationFunctionDescription;
import org.palladiosimulator.edp2.models.ExperimentData.AggregationStatistics;
import org.palladiosimulator.edp2.models.ExperimentData.CaptureType;
import org.palladiosimulator.edp2.models.ExperimentData.DataType;
import org.palladiosimulator.edp2.models.ExperimentData.Descriptions;
import org.palladiosimulator.edp2.models.ExperimentData.DoubleBinaryMeasurements;
import org.palladiosimulator.edp2.models.ExperimentData.Edp2Measure;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataFactory;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentGroup;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentRun;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentSetting;
import org.palladiosimulator.edp2.models.ExperimentData.FixedIntervals;
import org.palladiosimulator.edp2.models.ExperimentData.FixedWidthAggregatedMeasurements;
import org.palladiosimulator.edp2.models.ExperimentData.Identifier;
import org.palladiosimulator.edp2.models.ExperimentData.IdentifierBasedMeasurements;
import org.palladiosimulator.edp2.models.ExperimentData.JSXmlMeasurements;
import org.palladiosimulator.edp2.models.ExperimentData.LongBinaryMeasurements;
import org.palladiosimulator.edp2.models.ExperimentData.Measurements;
import org.palladiosimulator.edp2.models.ExperimentData.MeasurementsRange;
import org.palladiosimulator.edp2.models.ExperimentData.MetricDescription;
import org.palladiosimulator.edp2.models.ExperimentData.MetricSetDescription;
import org.palladiosimulator.edp2.models.ExperimentData.Monotonic;
import org.palladiosimulator.edp2.models.ExperimentData.NumericalBaseMetricDescription;
import org.palladiosimulator.edp2.models.ExperimentData.NumericalIntervalStatistics;
import org.palladiosimulator.edp2.models.ExperimentData.NumericalMassDistribution;
import org.palladiosimulator.edp2.models.ExperimentData.NumericalNominalStatistics;
import org.palladiosimulator.edp2.models.ExperimentData.NumericalOrdinalStatistics;
import org.palladiosimulator.edp2.models.ExperimentData.NumericalPercentile;
import org.palladiosimulator.edp2.models.ExperimentData.NumericalRatioStatistics;
import org.palladiosimulator.edp2.models.ExperimentData.PersistenceKindOptions;
import org.palladiosimulator.edp2.models.ExperimentData.RawMeasurements;
import org.palladiosimulator.edp2.models.ExperimentData.Scale;
import org.palladiosimulator.edp2.models.ExperimentData.SensorFrameworkV1DoubleBinaryMeasurements;
import org.palladiosimulator.edp2.models.ExperimentData.SensorFrameworkV1IdentifierBasedMeasurements;
import org.palladiosimulator.edp2.models.ExperimentData.TextualBaseMetricDescription;
import org.palladiosimulator.edp2.models.ExperimentData.TextualMassDistribution;
import org.palladiosimulator.edp2.models.ExperimentData.TextualNominalStatistics;
import org.palladiosimulator.edp2.models.ExperimentData.TextualOrdinalStatistics;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExperimentDataFactoryImpl extends EFactoryImpl implements ExperimentDataFactory {
    /** Logger for this class.
     * @generated NOT
     */
    private static final Logger logger = Logger
            .getLogger(ExperimentDataFactoryImpl.class.getCanonicalName());

    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ExperimentDataFactory init() {
        try {
            final ExperimentDataFactory theExperimentDataFactory = (ExperimentDataFactory)EPackage.Registry.INSTANCE.getEFactory(ExperimentDataPackage.eNS_URI);
            if (theExperimentDataFactory != null) {
                return theExperimentDataFactory;
            }
        }
        catch (final Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new ExperimentDataFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExperimentDataFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(final EClass eClass) {
        switch (eClass.getClassifierID()) {
        case ExperimentDataPackage.MEASUREMENTS_RANGE: return createMeasurementsRange();
        case ExperimentDataPackage.ESTRINGTO_EOBJECT_MAP_ENTRY: return (EObject)createEStringtoEObjectMapEntry();
        case ExperimentDataPackage.RAW_MEASUREMENTS: return createRawMeasurements();
        case ExperimentDataPackage.NUMERICAL_NOMINAL_STATISTICS: return createNumericalNominalStatistics();
        case ExperimentDataPackage.NUMERICAL_MASS_DISTRIBUTION: return createNumericalMassDistribution();
        case ExperimentDataPackage.FIXED_WIDTH_AGGREGATED_MEASUREMENTS: return createFixedWidthAggregatedMeasurements();
        case ExperimentDataPackage.FIXED_INTERVALS: return createFixedIntervals();
        case ExperimentDataPackage.TEXTUAL_NOMINAL_STATISTICS: return createTextualNominalStatistics();
        case ExperimentDataPackage.TEXTUAL_MASS_DISTRIBUTION: return createTextualMassDistribution();
        case ExperimentDataPackage.IDENTIFIER: return createIdentifier();
        case ExperimentDataPackage.TEXTUAL_BASE_METRIC_DESCRIPTION: return createTextualBaseMetricDescription();
        case ExperimentDataPackage.EXPERIMENT_GROUP: return createExperimentGroup();
        case ExperimentDataPackage.EXPERIMENT_SETTING: return createExperimentSetting();
        case ExperimentDataPackage.EXPERIMENT_RUN: return createExperimentRun();
        case ExperimentDataPackage.MEASUREMENTS: return createMeasurements();
        case ExperimentDataPackage.EDP2_MEASURE: return createEdp2Measure();
        case ExperimentDataPackage.DESCRIPTIONS: return createDescriptions();
        case ExperimentDataPackage.AGGREGATION_FUNCTION_DESCRIPTION: return createAggregationFunctionDescription();
        case ExperimentDataPackage.AGGREGATION_STATISTICS: return createAggregationStatistics();
        case ExperimentDataPackage.DOUBLE_BINARY_MEASUREMENTS: return createDoubleBinaryMeasurements();
        case ExperimentDataPackage.NUMERICAL_INTERVAL_STATISTICS: return createNumericalIntervalStatistics();
        case ExperimentDataPackage.NUMERICAL_ORDINAL_STATISTICS: return createNumericalOrdinalStatistics();
        case ExperimentDataPackage.NUMERICAL_PERCENTILE: return createNumericalPercentile();
        case ExperimentDataPackage.JS_XML_MEASUREMENTS: return createJSXmlMeasurements();
        case ExperimentDataPackage.LONG_BINARY_MEASUREMENTS: return createLongBinaryMeasurements();
        case ExperimentDataPackage.METRIC_SET_DESCRIPTION: return createMetricSetDescription();
        case ExperimentDataPackage.IDENTIFIER_BASED_MEASUREMENTS: return createIdentifierBasedMeasurements();
        case ExperimentDataPackage.NUMERICAL_RATIO_STATISTICS: return createNumericalRatioStatistics();
        case ExperimentDataPackage.SENSOR_FRAMEWORK_V1_DOUBLE_BINARY_MEASUREMENTS: return createSensorFrameworkV1DoubleBinaryMeasurements();
        case ExperimentDataPackage.SENSOR_FRAMEWORK_V1_IDENTIFIER_BASED_MEASUREMENTS: return createSensorFrameworkV1IdentifierBasedMeasurements();
        case ExperimentDataPackage.NUMERICAL_BASE_METRIC_DESCRIPTION: return createNumericalBaseMetricDescription();
        case ExperimentDataPackage.TEXTUAL_ORDINAL_STATISTICS: return createTextualOrdinalStatistics();
        default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object createFromString(final EDataType eDataType, final String initialValue) {
        switch (eDataType.getClassifierID()) {
        case ExperimentDataPackage.CAPTURE_TYPE:
            return createCaptureTypeFromString(eDataType, initialValue);
        case ExperimentDataPackage.SCALE:
            return createScaleFromString(eDataType, initialValue);
        case ExperimentDataPackage.MONOTONIC:
            return createMonotonicFromString(eDataType, initialValue);
        case ExperimentDataPackage.PERSISTENCE_KIND_OPTIONS:
            return createPersistenceKindOptionsFromString(eDataType, initialValue);
        case ExperimentDataPackage.DATA_TYPE:
            return createDataTypeFromString(eDataType, initialValue);
        case ExperimentDataPackage.EJS_MEASURE:
            return createEJSMeasureFromString(eDataType, initialValue);
        case ExperimentDataPackage.EJS_DURATION_MEASURE:
            return createEJSDurationMeasureFromString(eDataType, initialValue);
        case ExperimentDataPackage.EJS_UNIT:
            return createEJSUnitFromString(eDataType, initialValue);
        default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String convertToString(final EDataType eDataType, final Object instanceValue) {
        switch (eDataType.getClassifierID()) {
        case ExperimentDataPackage.CAPTURE_TYPE:
            return convertCaptureTypeToString(eDataType, instanceValue);
        case ExperimentDataPackage.SCALE:
            return convertScaleToString(eDataType, instanceValue);
        case ExperimentDataPackage.MONOTONIC:
            return convertMonotonicToString(eDataType, instanceValue);
        case ExperimentDataPackage.PERSISTENCE_KIND_OPTIONS:
            return convertPersistenceKindOptionsToString(eDataType, instanceValue);
        case ExperimentDataPackage.DATA_TYPE:
            return convertDataTypeToString(eDataType, instanceValue);
        case ExperimentDataPackage.EJS_MEASURE:
            return convertEJSMeasureToString(eDataType, instanceValue);
        case ExperimentDataPackage.EJS_DURATION_MEASURE:
            return convertEJSDurationMeasureToString(eDataType, instanceValue);
        case ExperimentDataPackage.EJS_UNIT:
            return convertEJSUnitToString(eDataType, instanceValue);
        default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public MeasurementsRange createMeasurementsRange() {
        final MeasurementsRangeImpl measurementsRange = new MeasurementsRangeImpl();
        return measurementsRange;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public FixedWidthAggregatedMeasurements createFixedWidthAggregatedMeasurements() {
        final FixedWidthAggregatedMeasurementsImpl fixedWidthAggregatedMeasurements = new FixedWidthAggregatedMeasurementsImpl();
        return fixedWidthAggregatedMeasurements;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public FixedIntervals createFixedIntervals() {
        final FixedIntervalsImpl fixedIntervals = new FixedIntervalsImpl();
        return fixedIntervals;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TextualNominalStatistics createTextualNominalStatistics() {
        final TextualNominalStatisticsImpl textualNominalStatistics = new TextualNominalStatisticsImpl();
        return textualNominalStatistics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TextualMassDistribution createTextualMassDistribution() {
        final TextualMassDistributionImpl textualMassDistribution = new TextualMassDistributionImpl();
        return textualMassDistribution;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Measurements createMeasurements() {
        final MeasurementsImpl measurements = new MeasurementsImpl();
        return measurements;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Edp2Measure createEdp2Measure() {
        final Edp2MeasureImpl edp2Measure = new Edp2MeasureImpl();
        return edp2Measure;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Map.Entry<String, Object> createEStringtoEObjectMapEntry() {
        final EStringtoEObjectMapEntryImpl eStringtoEObjectMapEntry = new EStringtoEObjectMapEntryImpl();
        return eStringtoEObjectMapEntry;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public RawMeasurements createRawMeasurements() {
        final RawMeasurementsImpl rawMeasurements = new RawMeasurementsImpl();
        return rawMeasurements;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NumericalNominalStatistics createNumericalNominalStatistics() {
        final NumericalNominalStatisticsImpl numericalNominalStatistics = new NumericalNominalStatisticsImpl();
        return numericalNominalStatistics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NumericalMassDistribution createNumericalMassDistribution() {
        final NumericalMassDistributionImpl numericalMassDistribution = new NumericalMassDistributionImpl();
        return numericalMassDistribution;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExperimentGroup createExperimentGroup() {
        final ExperimentGroupImpl experimentGroup = new ExperimentGroupImpl();
        return experimentGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExperimentSetting createExperimentSetting() {
        final ExperimentSettingImpl experimentSetting = new ExperimentSettingImpl();
        return experimentSetting;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExperimentRun createExperimentRun() {
        final ExperimentRunImpl experimentRun = new ExperimentRunImpl();
        return experimentRun;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Identifier createIdentifier() {
        final IdentifierImpl identifier = new IdentifierImpl();
        return identifier;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TextualBaseMetricDescription createTextualBaseMetricDescription() {
        final TextualBaseMetricDescriptionImpl textualBaseMetricDescription = new TextualBaseMetricDescriptionImpl();
        return textualBaseMetricDescription;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TextualBaseMetricDescription createTextualBaseMetricDescription(
            final String name, final String textualDescription, final Scale scale,
            final DataType dataType, final Monotonic monotonic) {
        final TextualBaseMetricDescription tbmd = createTextualBaseMetricDescription();
        tbmd.setName(name);
        tbmd.setTextualDescription(textualDescription);
        tbmd.setScale(scale);
        tbmd.setDataType(dataType);
        tbmd.setMonotonic(monotonic);
        tbmd.setCaptureType(CaptureType.IDENTIFIER);
        return tbmd;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identifier createIdentifier(final String literal) {
        final IdentifierImpl identifier = new IdentifierImpl();
        identifier.setLiteral(literal);
        return identifier;
    }

    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("unchecked")
    @Override
    public NumericalBaseMetricDescription createNumericalBaseMetricDescription(
            final String name, final String textualDescription,
            final CaptureType captureType, final Scale scale, final DataType dataType,
            final Unit defaultUnit, final Monotonic monotonic,
            final PersistenceKindOptions persistenceKind) {
        final NumericalBaseMetricDescription bmd = ExperimentDataFactory.eINSTANCE.createNumericalBaseMetricDescription();
        bmd.setName(name);
        bmd.setTextualDescription(textualDescription);
        bmd.setCaptureType(captureType);
        bmd.setScale(scale);
        bmd.setDefaultUnit(defaultUnit);
        bmd.setMonotonic(monotonic);
        return bmd;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MetricSetDescription createMetricSetDescription(final String name,
            final String textualDescription) {
        final MetricSetDescription msd = ExperimentDataFactory.eINSTANCE
                .createMetricSetDescription();
        msd.setName(name);
        msd.setTextualDescription(textualDescription);
        return msd;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Edp2Measure createEdp2Measure(final String measuredObject,
            final MetricDescription metricDescription) {
        final Edp2Measure measure = createEdp2Measure();
        measure.setMeasuredObject(measuredObject);
        measure.setMetric(metricDescription);
        return measure;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExperimentSetting createExperimentSetting(
            final ExperimentGroup experimentGroup, final String description) {
        final ExperimentSetting es = createExperimentSetting();
        experimentGroup.getExperimentSettings().add(es);
        es.setDescription(description);
        return es;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExperimentGroup createExperimentGroup(final String purpose) {
        final ExperimentGroup eg = createExperimentGroup();
        eg.setPurpose(purpose);
        return eg;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Measurements createMeasurements(final Edp2Measure forMeasure) {
        final Measurements mms = createMeasurements();
        mms.setMeasure(forMeasure);
        return mms;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExperimentRun createExperimentRun(
            final ExperimentSetting forExperimentSetting) {
        final ExperimentRun er = createExperimentRun();
        forExperimentSetting.getExperimentRuns().add(er);
        return er;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RawMeasurements createRawMeasurements(
            final MeasurementsRange forMeasurementsRange) {
        final RawMeasurements rm = createRawMeasurements();
        forMeasurementsRange.setRawMeasurements(rm);

        // create necessary data series from measure (after input model validation)
        // input validation
        String errorMsg = "Cannot create data series for raw measurements. ";
        if (forMeasurementsRange == null) {
            errorMsg += "Measurement range must not be null in order to create "
                    + "data series for raw measurements.";
        } else if (forMeasurementsRange.getMeasurements() == null) {
            errorMsg = "Measurements must not be null in order to create data "
                    + "series for raw measurements.";
        } else if (rm.getMeasurementsRange().getMeasurements().getMeasure() == null) {
            errorMsg = "Measure (definition) must not be null in order to create "
                    + "data series for raw measurements.";
        } else {
            errorMsg = null;
        }
        if (errorMsg != null) {
            logger.log(Level.SEVERE, errorMsg);
            throw new IllegalStateException(errorMsg);
        }
        // create necessary data series instances themselves
        new DataSeriesFromRawMeasurementsSwitch().doSwitch(rm);
        return rm;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JSXmlMeasurements createJSXmlMeasurements(
            final RawMeasurements forRawMeasurements, final String valuesUuid) {
        final JSXmlMeasurements jsxm = createJSXmlMeasurements();
        jsxm.setValuesUuid(valuesUuid);
        forRawMeasurements.getDataSeries().add(jsxm);
        return jsxm;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @SuppressWarnings("unchecked")
    public LongBinaryMeasurements createLongBinaryMeasurements(
            final RawMeasurements forRawMeasurements, final String valuesUuid,
            final Unit defaultUnit) {
        final LongBinaryMeasurements lbm = createLongBinaryMeasurements();
        lbm.setValuesUuid(valuesUuid);
        lbm.setStorageUnit(defaultUnit);
        forRawMeasurements.getDataSeries().add(lbm);
        return lbm;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @SuppressWarnings("unchecked")
    public DoubleBinaryMeasurements createDoubleBinaryMeasurements(
            final RawMeasurements forRawMeasurements, final String valuesUuid,
            final Unit defaultUnit) {
        final DoubleBinaryMeasurements dbm = createDoubleBinaryMeasurements();
        dbm.setValuesUuid(valuesUuid);
        dbm.setStorageUnit(defaultUnit);
        forRawMeasurements.getDataSeries().add(dbm);
        return dbm;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IdentifierBasedMeasurements createIdentifierBasedMeasurements(
            final RawMeasurements forRawMeasurements, final String valuesUuid) {
        final IdentifierBasedMeasurements ibm = createIdentifierBasedMeasurements();
        ibm.setValuesUuid(valuesUuid);
        forRawMeasurements.getDataSeries().add(ibm);
        return ibm;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MeasurementsRange createMeasurementsRange(final Measurements forMeasurements) {
        final MeasurementsRange mr = createMeasurementsRange();
        mr.setMeasurements(forMeasurements);
        return mr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AggregationFunctionDescription createAggregationFunctionDescription() {
        final AggregationFunctionDescriptionImpl aggregationFunctionDescription = new AggregationFunctionDescriptionImpl();
        return aggregationFunctionDescription;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AggregationStatistics createAggregationStatistics() {
        final AggregationStatisticsImpl aggregationStatistics = new AggregationStatisticsImpl();
        return aggregationStatistics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LongBinaryMeasurements createLongBinaryMeasurements() {
        final LongBinaryMeasurementsImpl longBinaryMeasurements = new LongBinaryMeasurementsImpl();
        return longBinaryMeasurements;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public <Q extends Quantity> DoubleBinaryMeasurements<Q> createDoubleBinaryMeasurements() {
        final DoubleBinaryMeasurementsImpl<Q> doubleBinaryMeasurements = new DoubleBinaryMeasurementsImpl<Q>();
        return doubleBinaryMeasurements;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NumericalIntervalStatistics createNumericalIntervalStatistics() {
        final NumericalIntervalStatisticsImpl numericalIntervalStatistics = new NumericalIntervalStatisticsImpl();
        return numericalIntervalStatistics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NumericalOrdinalStatistics createNumericalOrdinalStatistics() {
        final NumericalOrdinalStatisticsImpl numericalOrdinalStatistics = new NumericalOrdinalStatisticsImpl();
        return numericalOrdinalStatistics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NumericalPercentile createNumericalPercentile() {
        final NumericalPercentileImpl numericalPercentile = new NumericalPercentileImpl();
        return numericalPercentile;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public JSXmlMeasurements createJSXmlMeasurements() {
        final JSXmlMeasurementsImpl jsXmlMeasurements = new JSXmlMeasurementsImpl();
        return jsXmlMeasurements;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Descriptions createDescriptions() {
        final DescriptionsImpl descriptions = new DescriptionsImpl();
        return descriptions;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public MetricSetDescription createMetricSetDescription() {
        final MetricSetDescriptionImpl metricSetDescription = new MetricSetDescriptionImpl();
        return metricSetDescription;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IdentifierBasedMeasurements createIdentifierBasedMeasurements() {
        final IdentifierBasedMeasurementsImpl identifierBasedMeasurements = new IdentifierBasedMeasurementsImpl();
        return identifierBasedMeasurements;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NumericalRatioStatistics createNumericalRatioStatistics() {
        final NumericalRatioStatisticsImpl numericalRatioStatistics = new NumericalRatioStatisticsImpl();
        return numericalRatioStatistics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SensorFrameworkV1DoubleBinaryMeasurements createSensorFrameworkV1DoubleBinaryMeasurements() {
        final SensorFrameworkV1DoubleBinaryMeasurementsImpl sensorFrameworkV1DoubleBinaryMeasurements = new SensorFrameworkV1DoubleBinaryMeasurementsImpl();
        return sensorFrameworkV1DoubleBinaryMeasurements;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SensorFrameworkV1IdentifierBasedMeasurements createSensorFrameworkV1IdentifierBasedMeasurements() {
        final SensorFrameworkV1IdentifierBasedMeasurementsImpl sensorFrameworkV1IdentifierBasedMeasurements = new SensorFrameworkV1IdentifierBasedMeasurementsImpl();
        return sensorFrameworkV1IdentifierBasedMeasurements;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NumericalBaseMetricDescription createNumericalBaseMetricDescription() {
        final NumericalBaseMetricDescriptionImpl numericalBaseMetricDescription = new NumericalBaseMetricDescriptionImpl();
        return numericalBaseMetricDescription;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TextualOrdinalStatistics createTextualOrdinalStatistics() {
        final TextualOrdinalStatisticsImpl textualOrdinalStatistics = new TextualOrdinalStatisticsImpl();
        return textualOrdinalStatistics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PersistenceKindOptions createPersistenceKindOptionsFromString(final EDataType eDataType, final String initialValue) {
        final PersistenceKindOptions result = PersistenceKindOptions.get(initialValue);
        if (result == null) {
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        }
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertPersistenceKindOptionsToString(final EDataType eDataType, final Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CaptureType createCaptureTypeFromString(final EDataType eDataType, final String initialValue) {
        final CaptureType result = CaptureType.get(initialValue);
        if (result == null) {
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        }
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertCaptureTypeToString(final EDataType eDataType, final Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataType createDataTypeFromString(final EDataType eDataType, final String initialValue) {
        final DataType result = DataType.get(initialValue);
        if (result == null) {
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        }
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertDataTypeToString(final EDataType eDataType, final Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Scale createScaleFromString(final EDataType eDataType, final String initialValue) {
        final Scale result = Scale.get(initialValue);
        if (result == null) {
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        }
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertScaleToString(final EDataType eDataType, final Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Monotonic createMonotonicFromString(final EDataType eDataType, final String initialValue) {
        final Monotonic result = Monotonic.get(initialValue);
        if (result == null) {
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        }
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertMonotonicToString(final EDataType eDataType, final Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    @SuppressWarnings("unchecked")
    public Measure createEJSMeasureFromString(final EDataType eDataType, final String initialValue) {
        return (Measure) SerializationUtil.readObject(initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public String convertEJSMeasureToString(final EDataType eDataType, final Object instanceValue) {
        return SerializationUtil.writeObject(instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    @SuppressWarnings("unchecked")
    public Measure createEJSDurationMeasureFromString(final EDataType eDataType, final String initialValue) {
        return (Measure) SerializationUtil.readObject(initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public String convertEJSDurationMeasureToString(final EDataType eDataType, final Object instanceValue) {
        return SerializationUtil.writeObject(instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    @SuppressWarnings("unchecked")
    public Unit createEJSUnitFromString(final EDataType eDataType, final String initialValue) {
        return (Unit) SerializationUtil.readObject(initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public String convertEJSUnitToString(final EDataType eDataType, final Object instanceValue) {
        return SerializationUtil.writeObject(instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExperimentDataPackage getExperimentDataPackage() {
        return (ExperimentDataPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static ExperimentDataPackage getPackage() {
        return ExperimentDataPackage.eINSTANCE;
    }

} //EmfmodelFactoryImpl
