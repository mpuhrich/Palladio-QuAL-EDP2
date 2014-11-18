/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.palladiosimulator.edp2.models.ExperimentData.impl;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.measure.MeasureFormat;
import javax.measure.quantity.Dimensionless;
import javax.measure.quantity.Quantity;
import javax.measure.unit.Unit;
import javax.measure.unit.UnitFormat;

import org.apache.commons.codec.binary.Base64;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.palladiosimulator.edp2.models.ExperimentData.AggregationStatistics;
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
import org.palladiosimulator.edp2.models.ExperimentData.Measure;
import org.palladiosimulator.edp2.models.ExperimentData.Measurements;
import org.palladiosimulator.edp2.models.ExperimentData.MeasurementsRange;
import org.palladiosimulator.edp2.models.ExperimentData.NumericalIntervalStatistics;
import org.palladiosimulator.edp2.models.ExperimentData.NumericalMassDistribution;
import org.palladiosimulator.edp2.models.ExperimentData.NumericalNominalStatistics;
import org.palladiosimulator.edp2.models.ExperimentData.NumericalOrdinalStatistics;
import org.palladiosimulator.edp2.models.ExperimentData.NumericalPercentile;
import org.palladiosimulator.edp2.models.ExperimentData.NumericalRatioStatistics;
import org.palladiosimulator.edp2.models.ExperimentData.RawMeasurements;
import org.palladiosimulator.edp2.models.ExperimentData.SensorFrameworkV1DoubleBinaryMeasurements;
import org.palladiosimulator.edp2.models.ExperimentData.SensorFrameworkV1IdentifierBasedMeasurements;
import org.palladiosimulator.edp2.models.ExperimentData.TextualMassDistribution;
import org.palladiosimulator.edp2.models.ExperimentData.TextualNominalStatistics;
import org.palladiosimulator.edp2.models.ExperimentData.TextualOrdinalStatistics;
import org.palladiosimulator.edp2.models.measuringpoint.MeasuringPoint;
import org.palladiosimulator.metricspec.MetricDescription;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * @generated
 */
public class ExperimentDataFactoryImpl extends EFactoryImpl implements
		ExperimentDataFactory {
	/**
	 * Logger for this class.
	 *
	 * @generated NOT
	 */
	private static final Logger LOGGER = Logger
			.getLogger(ExperimentDataFactoryImpl.class.getCanonicalName());

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static ExperimentDataFactory init() {
		try {
			ExperimentDataFactory theExperimentDataFactory = (ExperimentDataFactory) EPackage.Registry.INSTANCE
					.getEFactory(ExperimentDataPackage.eNS_URI);
			if (theExperimentDataFactory != null) {
				return theExperimentDataFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ExperimentDataFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ExperimentDataFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case ExperimentDataPackage.MEASUREMENTS_RANGE:
			return createMeasurementsRange();
		case ExperimentDataPackage.ESTRINGTO_EOBJECT_MAP_ENTRY:
			return (EObject) createEStringtoEObjectMapEntry();
		case ExperimentDataPackage.RAW_MEASUREMENTS:
			return createRawMeasurements();
		case ExperimentDataPackage.NUMERICAL_NOMINAL_STATISTICS:
			return createNumericalNominalStatistics();
		case ExperimentDataPackage.NUMERICAL_MASS_DISTRIBUTION:
			return createNumericalMassDistribution();
		case ExperimentDataPackage.FIXED_WIDTH_AGGREGATED_MEASUREMENTS:
			return createFixedWidthAggregatedMeasurements();
		case ExperimentDataPackage.FIXED_INTERVALS:
			return createFixedIntervals();
		case ExperimentDataPackage.TEXTUAL_NOMINAL_STATISTICS:
			return createTextualNominalStatistics();
		case ExperimentDataPackage.TEXTUAL_MASS_DISTRIBUTION:
			return createTextualMassDistribution();
		case ExperimentDataPackage.EXPERIMENT_GROUP:
			return createExperimentGroup();
		case ExperimentDataPackage.EXPERIMENT_SETTING:
			return createExperimentSetting();
		case ExperimentDataPackage.EXPERIMENT_RUN:
			return createExperimentRun();
		case ExperimentDataPackage.MEASUREMENTS:
			return createMeasurements();
		case ExperimentDataPackage.MEASURE:
			return createMeasure();
		case ExperimentDataPackage.AGGREGATION_STATISTICS:
			return createAggregationStatistics();
		case ExperimentDataPackage.DOUBLE_BINARY_MEASUREMENTS:
			return createDoubleBinaryMeasurements();
		case ExperimentDataPackage.NUMERICAL_INTERVAL_STATISTICS:
			return createNumericalIntervalStatistics();
		case ExperimentDataPackage.NUMERICAL_ORDINAL_STATISTICS:
			return createNumericalOrdinalStatistics();
		case ExperimentDataPackage.NUMERICAL_PERCENTILE:
			return createNumericalPercentile();
		case ExperimentDataPackage.JS_XML_MEASUREMENTS:
			return createJSXmlMeasurements();
		case ExperimentDataPackage.LONG_BINARY_MEASUREMENTS:
			return createLongBinaryMeasurements();
		case ExperimentDataPackage.IDENTIFIER_BASED_MEASUREMENTS:
			return createIdentifierBasedMeasurements();
		case ExperimentDataPackage.NUMERICAL_RATIO_STATISTICS:
			return createNumericalRatioStatistics();
		case ExperimentDataPackage.SENSOR_FRAMEWORK_V1_DOUBLE_BINARY_MEASUREMENTS:
			return createSensorFrameworkV1DoubleBinaryMeasurements();
		case ExperimentDataPackage.SENSOR_FRAMEWORK_V1_IDENTIFIER_BASED_MEASUREMENTS:
			return createSensorFrameworkV1IdentifierBasedMeasurements();
		case ExperimentDataPackage.TEXTUAL_ORDINAL_STATISTICS:
			return createTextualOrdinalStatistics();
		case ExperimentDataPackage.EXPERIMENT_GROUP_RUN:
			return createExperimentGroupRun();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName()
					+ "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case ExperimentDataPackage.EJS_MEASURE:
			return createEJSMeasureFromString(eDataType, initialValue);
		case ExperimentDataPackage.EJS_DURATION_MEASURE:
			return createEJSDurationMeasureFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '"
					+ eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case ExperimentDataPackage.EJS_MEASURE:
			return convertEJSMeasureToString(eDataType, instanceValue);
		case ExperimentDataPackage.EJS_DURATION_MEASURE:
			return convertEJSDurationMeasureToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '"
					+ eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasurementsRange createMeasurementsRange() {
		MeasurementsRangeImpl measurementsRange = new MeasurementsRangeImpl();
		return measurementsRange;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FixedWidthAggregatedMeasurements createFixedWidthAggregatedMeasurements() {
		FixedWidthAggregatedMeasurementsImpl fixedWidthAggregatedMeasurements = new FixedWidthAggregatedMeasurementsImpl();
		return fixedWidthAggregatedMeasurements;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FixedIntervals createFixedIntervals() {
		FixedIntervalsImpl fixedIntervals = new FixedIntervalsImpl();
		return fixedIntervals;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextualNominalStatistics createTextualNominalStatistics() {
		TextualNominalStatisticsImpl textualNominalStatistics = new TextualNominalStatisticsImpl();
		return textualNominalStatistics;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextualMassDistribution createTextualMassDistribution() {
		TextualMassDistributionImpl textualMassDistribution = new TextualMassDistributionImpl();
		return textualMassDistribution;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Measurements createMeasurements() {
		MeasurementsImpl measurements = new MeasurementsImpl();
		return measurements;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Measure createMeasure() {
		MeasureImpl measure = new MeasureImpl();
		return measure;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, Object> createEStringtoEObjectMapEntry() {
		EStringtoEObjectMapEntryImpl eStringtoEObjectMapEntry = new EStringtoEObjectMapEntryImpl();
		return eStringtoEObjectMapEntry;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RawMeasurements createRawMeasurements() {
		RawMeasurementsImpl rawMeasurements = new RawMeasurementsImpl();
		return rawMeasurements;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NumericalNominalStatistics createNumericalNominalStatistics() {
		NumericalNominalStatisticsImpl numericalNominalStatistics = new NumericalNominalStatisticsImpl();
		return numericalNominalStatistics;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NumericalMassDistribution createNumericalMassDistribution() {
		NumericalMassDistributionImpl numericalMassDistribution = new NumericalMassDistributionImpl();
		return numericalMassDistribution;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExperimentGroup createExperimentGroup() {
		ExperimentGroupImpl experimentGroup = new ExperimentGroupImpl();
		return experimentGroup;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExperimentSetting createExperimentSetting() {
		ExperimentSettingImpl experimentSetting = new ExperimentSettingImpl();
		return experimentSetting;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExperimentRun createExperimentRun() {
		ExperimentRunImpl experimentRun = new ExperimentRunImpl();
		return experimentRun;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Measure createMeasure(final MeasuringPoint measuringPoint,
			final MetricDescription metricDescription) {
		final Measure measure = this.createMeasure();
		measure.setMeasuringPoint(measuringPoint);
		measure.setMetric(metricDescription);
		return measure;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExperimentSetting createExperimentSetting(
			final ExperimentGroup experimentGroup, final String description) {
		final ExperimentSetting es = this.createExperimentSetting();
		experimentGroup.getExperimentSettings().add(es);
		es.setDescription(description);
		return es;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExperimentGroup createExperimentGroup(final String purpose) {
		final ExperimentGroup eg = this.createExperimentGroup();
		eg.setPurpose(purpose);
		return eg;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Measurements createMeasurements(final Measure forMeasure) {
		final Measurements mms = this.createMeasurements();
		mms.setMeasure(forMeasure);
		return mms;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExperimentRun createExperimentRun(
			final ExperimentSetting forExperimentSetting) {
		final ExperimentRun er = this.createExperimentRun();
		forExperimentSetting.getExperimentRuns().add(er);
		return er;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RawMeasurements createRawMeasurements(
			final MeasurementsRange forMeasurementsRange) {
		final RawMeasurements rm = this.createRawMeasurements();
		forMeasurementsRange.setRawMeasurements(rm);

		return rm;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JSXmlMeasurements createJSXmlMeasurements(
			final RawMeasurements forRawMeasurements, final String valuesUuid) {
		final JSXmlMeasurements jsxm = this.createJSXmlMeasurements();
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
		final LongBinaryMeasurements lbm = this.createLongBinaryMeasurements();
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
		final DoubleBinaryMeasurements dbm = this
				.createDoubleBinaryMeasurements();
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
		final IdentifierBasedMeasurements ibm = this
				.createIdentifierBasedMeasurements();
		ibm.setValuesUuid(valuesUuid);
		forRawMeasurements.getDataSeries().add(ibm);
		return ibm;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MeasurementsRange createMeasurementsRange(
			final Measurements forMeasurements) {
		final MeasurementsRange mr = this.createMeasurementsRange();
		mr.setMeasurements(forMeasurements);
		return mr;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AggregationStatistics createAggregationStatistics() {
		AggregationStatisticsImpl aggregationStatistics = new AggregationStatisticsImpl();
		return aggregationStatistics;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LongBinaryMeasurements createLongBinaryMeasurements() {
		LongBinaryMeasurementsImpl longBinaryMeasurements = new LongBinaryMeasurementsImpl();
		return longBinaryMeasurements;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public <Q extends Quantity> DoubleBinaryMeasurements<Q> createDoubleBinaryMeasurements() {
		DoubleBinaryMeasurementsImpl<Q> doubleBinaryMeasurements = new DoubleBinaryMeasurementsImpl<Q>();
		return doubleBinaryMeasurements;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NumericalIntervalStatistics createNumericalIntervalStatistics() {
		NumericalIntervalStatisticsImpl numericalIntervalStatistics = new NumericalIntervalStatisticsImpl();
		return numericalIntervalStatistics;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NumericalOrdinalStatistics createNumericalOrdinalStatistics() {
		NumericalOrdinalStatisticsImpl numericalOrdinalStatistics = new NumericalOrdinalStatisticsImpl();
		return numericalOrdinalStatistics;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NumericalPercentile createNumericalPercentile() {
		NumericalPercentileImpl numericalPercentile = new NumericalPercentileImpl();
		return numericalPercentile;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JSXmlMeasurements createJSXmlMeasurements() {
		JSXmlMeasurementsImpl jsXmlMeasurements = new JSXmlMeasurementsImpl();
		return jsXmlMeasurements;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IdentifierBasedMeasurements createIdentifierBasedMeasurements() {
		IdentifierBasedMeasurementsImpl identifierBasedMeasurements = new IdentifierBasedMeasurementsImpl();
		return identifierBasedMeasurements;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NumericalRatioStatistics createNumericalRatioStatistics() {
		NumericalRatioStatisticsImpl numericalRatioStatistics = new NumericalRatioStatisticsImpl();
		return numericalRatioStatistics;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SensorFrameworkV1DoubleBinaryMeasurements createSensorFrameworkV1DoubleBinaryMeasurements() {
		SensorFrameworkV1DoubleBinaryMeasurementsImpl sensorFrameworkV1DoubleBinaryMeasurements = new SensorFrameworkV1DoubleBinaryMeasurementsImpl();
		return sensorFrameworkV1DoubleBinaryMeasurements;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SensorFrameworkV1IdentifierBasedMeasurements createSensorFrameworkV1IdentifierBasedMeasurements() {
		SensorFrameworkV1IdentifierBasedMeasurementsImpl sensorFrameworkV1IdentifierBasedMeasurements = new SensorFrameworkV1IdentifierBasedMeasurementsImpl();
		return sensorFrameworkV1IdentifierBasedMeasurements;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextualOrdinalStatistics createTextualOrdinalStatistics() {
		TextualOrdinalStatisticsImpl textualOrdinalStatistics = new TextualOrdinalStatisticsImpl();
		return textualOrdinalStatistics;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExperimentGroupRun createExperimentGroupRun() {
		ExperimentGroupRunImpl experimentGroupRun = new ExperimentGroupRunImpl();
		return experimentGroupRun;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated not
	 */
	public javax.measure.Measure<?, ?> createEJSMeasureFromString(
			final EDataType eDataType, final String initialValue) {
		try {
			return (javax.measure.Measure<?, ?>) MeasureFormat.getInstance(
					NumberFormat.getInstance(Locale.ENGLISH),
					UnitFormat.getInstance()).parseObject(initialValue);
		} catch (ParseException e) {
			LOGGER.log(Level.SEVERE, "Could not restore Measure object. "
					+ "Object: " + initialValue + "Error: " + e.getMessage());
			return null;
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated not
	 */
	public String convertEJSMeasureToString(final EDataType eDataType,
			final Object instanceValue) {
		String result = "";
		if (instanceValue != null) {
			MeasureFormat formatter = MeasureFormat.getInstance(
					NumberFormat.getInstance(Locale.ENGLISH),
					UnitFormat.getInstance());
			result = formatter.format(instanceValue);
		}
		return result;
	}

	private javax.measure.Measure readEJSMeasureObject(String initialValue) {
		if (initialValue == null || initialValue.isEmpty()) {
			return null;
		}
		String[] items = initialValue.split(" ");
		Double value = 0.0d;
		Unit<? extends Quantity> unit = null;
		try {
			value = Double.valueOf(items[0]);

			// in case the measure has no dimension
			if (items.length < 2) {
				return javax.measure.Measure.valueOf(value, Dimensionless.UNIT);
			}

			UnitFormat formatter = UnitFormat.getInstance();
			unit = formatter.parseObject(items[1], new ParsePosition(0));
		} catch (NumberFormatException nfe) {
			LOGGER.log(
					Level.SEVERE,
					"Could not restore Measure object. It has to start with a number."
							+ "Object: " + initialValue + "Error: "
							+ nfe.getMessage());
			return null;
		} catch (IllegalArgumentException iae) {
			LOGGER.log(
					Level.SEVERE,
					"Could not restore Measure object. It has wrong dimension. It receives no dimension."
							+ "Object: "
							+ initialValue
							+ "Error: "
							+ iae.getMessage());
		}
		if (unit == null) {
			unit = Dimensionless.UNIT;
		}
		return javax.measure.Measure.valueOf(value, unit);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated not
	 */
	public javax.measure.Measure createEJSDurationMeasureFromString(
			final EDataType eDataType, final String initialValue) {
		return (javax.measure.Measure) this.readObject(initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated not
	 */
	public String convertEJSDurationMeasureToString(final EDataType eDataType,
			final Object instanceValue) {
		return this.writeObject(instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExperimentDataPackage getExperimentDataPackage() {
		return (ExperimentDataPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ExperimentDataPackage getPackage() {
		return ExperimentDataPackage.eINSTANCE;
	}

	/**
	 * Serializes an object to a string.
	 *
	 * @param o
	 *            The object to store.
	 * @return String containing the serialized object.
	 * @throws IOException
	 *             Error occurred during serialization.
	 */
	private String writeObject(final Object o) {
		final ByteArrayOutputStream bas = new ByteArrayOutputStream();
		ObjectOutputStream oos;
		try {
			oos = new ObjectOutputStream(bas);
			oos.writeObject(o);
			oos.close();
		} catch (final IOException e) {
			LOGGER.log(Level.SEVERE,
					"Could not serialize object to string. Data corruption is likely. "
							+ "Object: " + o + "Error: " + e.getMessage());
		}
		return Base64.encodeBase64String(bas.toByteArray());
	}

	/**
	 * Deserialized an object from a string.
	 *
	 * @param bis
	 *            The input string containing the object.
	 * @return The deserialized object.
	 * @throws IOException
	 *             Error occurred during serialization.
	 * @throws ClassNotFoundException
	 *             Error occurred during serialization.
	 */
	private Object readObject(final String input) {
		Object o = null;
		try {
			ObjectInputStream ois;
			ois = new ObjectInputStream(new ByteArrayInputStream(
					Base64.decodeBase64(input)));
			o = ois.readObject();
			ois.close();
		} catch (final IOException e) {
			LOGGER.log(Level.SEVERE,
					"Could not deserialize object from string. Data corruption is likely. "
							+ "Error: " + e.getMessage());
		} catch (final ClassNotFoundException e) {
			LOGGER.log(
					Level.SEVERE,
					"Could not deserialize object from string. No class for object could be found. "
							+ "Data corruption is likely. "
							+ "Error: "
							+ e.getMessage());
		}
		return o;
	}

} // EmfmodelFactoryImpl
