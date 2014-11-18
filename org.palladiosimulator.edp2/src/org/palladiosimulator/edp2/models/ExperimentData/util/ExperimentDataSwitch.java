/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.palladiosimulator.edp2.models.ExperimentData.util;

import java.util.Map;

import javax.measure.quantity.Duration;
import javax.measure.quantity.Quantity;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.palladiosimulator.edp2.models.ExperimentData.AggregatedMeasurements;
import org.palladiosimulator.edp2.models.ExperimentData.AggregationStatistics;
import org.palladiosimulator.edp2.models.ExperimentData.DataSeries;
import org.palladiosimulator.edp2.models.ExperimentData.DoubleBinaryMeasurements;
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
import org.palladiosimulator.edp2.models.ExperimentData.Propertyable;
import org.palladiosimulator.edp2.models.ExperimentData.RawMeasurements;
import org.palladiosimulator.edp2.models.ExperimentData.Run;
import org.palladiosimulator.edp2.models.ExperimentData.SensorFrameworkV1DoubleBinaryMeasurements;
import org.palladiosimulator.edp2.models.ExperimentData.SensorFrameworkV1IdentifierBasedMeasurements;
import org.palladiosimulator.edp2.models.ExperimentData.TextualMassDistribution;
import org.palladiosimulator.edp2.models.ExperimentData.TextualNominalStatistics;
import org.palladiosimulator.edp2.models.ExperimentData.TextualOrdinalStatistics;

import de.uka.ipd.sdq.identifier.Identifier;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the
 * call {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for
 * each class of the model, starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage
 * @generated
 */
public class ExperimentDataSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static ExperimentDataPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ExperimentDataSwitch() {
		if (modelPackage == null) {
			modelPackage = ExperimentDataPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case ExperimentDataPackage.AGGREGATED_MEASUREMENTS: {
			AggregatedMeasurements aggregatedMeasurements = (AggregatedMeasurements) theEObject;
			T result = caseAggregatedMeasurements(aggregatedMeasurements);
			if (result == null)
				result = caseIdentifier(aggregatedMeasurements);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExperimentDataPackage.MEASUREMENTS_RANGE: {
			MeasurementsRange measurementsRange = (MeasurementsRange) theEObject;
			T result = caseMeasurementsRange(measurementsRange);
			if (result == null)
				result = casePropertyable(measurementsRange);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExperimentDataPackage.PROPERTYABLE: {
			Propertyable propertyable = (Propertyable) theEObject;
			T result = casePropertyable(propertyable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExperimentDataPackage.ESTRINGTO_EOBJECT_MAP_ENTRY: {
			@SuppressWarnings("unchecked")
			Map.Entry<String, Object> eStringtoEObjectMapEntry = (Map.Entry<String, Object>) theEObject;
			T result = caseEStringtoEObjectMapEntry(eStringtoEObjectMapEntry);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExperimentDataPackage.RAW_MEASUREMENTS: {
			RawMeasurements rawMeasurements = (RawMeasurements) theEObject;
			T result = caseRawMeasurements(rawMeasurements);
			if (result == null)
				result = caseIdentifier(rawMeasurements);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExperimentDataPackage.DATA_SERIES: {
			DataSeries dataSeries = (DataSeries) theEObject;
			T result = caseDataSeries(dataSeries);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExperimentDataPackage.NUMERICAL_NOMINAL_STATISTICS: {
			NumericalNominalStatistics numericalNominalStatistics = (NumericalNominalStatistics) theEObject;
			T result = caseNumericalNominalStatistics(numericalNominalStatistics);
			if (result == null)
				result = caseIdentifier(numericalNominalStatistics);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExperimentDataPackage.NUMERICAL_MASS_DISTRIBUTION: {
			NumericalMassDistribution numericalMassDistribution = (NumericalMassDistribution) theEObject;
			T result = caseNumericalMassDistribution(numericalMassDistribution);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExperimentDataPackage.FIXED_WIDTH_AGGREGATED_MEASUREMENTS: {
			FixedWidthAggregatedMeasurements fixedWidthAggregatedMeasurements = (FixedWidthAggregatedMeasurements) theEObject;
			T result = caseFixedWidthAggregatedMeasurements(fixedWidthAggregatedMeasurements);
			if (result == null)
				result = caseAggregatedMeasurements(fixedWidthAggregatedMeasurements);
			if (result == null)
				result = caseIdentifier(fixedWidthAggregatedMeasurements);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExperimentDataPackage.FIXED_INTERVALS: {
			FixedIntervals fixedIntervals = (FixedIntervals) theEObject;
			T result = caseFixedIntervals(fixedIntervals);
			if (result == null)
				result = caseIdentifier(fixedIntervals);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExperimentDataPackage.TEXTUAL_NOMINAL_STATISTICS: {
			TextualNominalStatistics textualNominalStatistics = (TextualNominalStatistics) theEObject;
			T result = caseTextualNominalStatistics(textualNominalStatistics);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExperimentDataPackage.TEXTUAL_MASS_DISTRIBUTION: {
			TextualMassDistribution textualMassDistribution = (TextualMassDistribution) theEObject;
			T result = caseTextualMassDistribution(textualMassDistribution);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExperimentDataPackage.EXPERIMENT_GROUP: {
			ExperimentGroup experimentGroup = (ExperimentGroup) theEObject;
			T result = caseExperimentGroup(experimentGroup);
			if (result == null)
				result = caseIdentifier(experimentGroup);
			if (result == null)
				result = casePropertyable(experimentGroup);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExperimentDataPackage.EXPERIMENT_SETTING: {
			ExperimentSetting experimentSetting = (ExperimentSetting) theEObject;
			T result = caseExperimentSetting(experimentSetting);
			if (result == null)
				result = caseIdentifier(experimentSetting);
			if (result == null)
				result = casePropertyable(experimentSetting);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExperimentDataPackage.EXPERIMENT_RUN: {
			ExperimentRun experimentRun = (ExperimentRun) theEObject;
			T result = caseExperimentRun(experimentRun);
			if (result == null)
				result = caseRun(experimentRun);
			if (result == null)
				result = caseIdentifier(experimentRun);
			if (result == null)
				result = casePropertyable(experimentRun);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExperimentDataPackage.MEASUREMENTS: {
			Measurements measurements = (Measurements) theEObject;
			T result = caseMeasurements(measurements);
			if (result == null)
				result = caseIdentifier(measurements);
			if (result == null)
				result = casePropertyable(measurements);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExperimentDataPackage.MEASURE: {
			Measure measure = (Measure) theEObject;
			T result = caseMeasure(measure);
			if (result == null)
				result = caseIdentifier(measure);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExperimentDataPackage.AGGREGATION_STATISTICS: {
			AggregationStatistics aggregationStatistics = (AggregationStatistics) theEObject;
			T result = caseAggregationStatistics(aggregationStatistics);
			if (result == null)
				result = caseIdentifier(aggregationStatistics);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExperimentDataPackage.DOUBLE_BINARY_MEASUREMENTS: {
			DoubleBinaryMeasurements<?> doubleBinaryMeasurements = (DoubleBinaryMeasurements<?>) theEObject;
			T result = caseDoubleBinaryMeasurements(doubleBinaryMeasurements);
			if (result == null)
				result = caseDataSeries(doubleBinaryMeasurements);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExperimentDataPackage.NUMERICAL_INTERVAL_STATISTICS: {
			NumericalIntervalStatistics numericalIntervalStatistics = (NumericalIntervalStatistics) theEObject;
			T result = caseNumericalIntervalStatistics(numericalIntervalStatistics);
			if (result == null)
				result = caseNumericalOrdinalStatistics(numericalIntervalStatistics);
			if (result == null)
				result = caseNumericalNominalStatistics(numericalIntervalStatistics);
			if (result == null)
				result = caseIdentifier(numericalIntervalStatistics);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExperimentDataPackage.NUMERICAL_ORDINAL_STATISTICS: {
			NumericalOrdinalStatistics numericalOrdinalStatistics = (NumericalOrdinalStatistics) theEObject;
			T result = caseNumericalOrdinalStatistics(numericalOrdinalStatistics);
			if (result == null)
				result = caseNumericalNominalStatistics(numericalOrdinalStatistics);
			if (result == null)
				result = caseIdentifier(numericalOrdinalStatistics);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExperimentDataPackage.NUMERICAL_PERCENTILE: {
			NumericalPercentile numericalPercentile = (NumericalPercentile) theEObject;
			T result = caseNumericalPercentile(numericalPercentile);
			if (result == null)
				result = caseIdentifier(numericalPercentile);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExperimentDataPackage.JS_XML_MEASUREMENTS: {
			JSXmlMeasurements jsXmlMeasurements = (JSXmlMeasurements) theEObject;
			T result = caseJSXmlMeasurements(jsXmlMeasurements);
			if (result == null)
				result = caseDataSeries(jsXmlMeasurements);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExperimentDataPackage.LONG_BINARY_MEASUREMENTS: {
			LongBinaryMeasurements longBinaryMeasurements = (LongBinaryMeasurements) theEObject;
			T result = caseLongBinaryMeasurements(longBinaryMeasurements);
			if (result == null)
				result = caseDataSeries(longBinaryMeasurements);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExperimentDataPackage.IDENTIFIER_BASED_MEASUREMENTS: {
			IdentifierBasedMeasurements identifierBasedMeasurements = (IdentifierBasedMeasurements) theEObject;
			T result = caseIdentifierBasedMeasurements(identifierBasedMeasurements);
			if (result == null)
				result = caseDataSeries(identifierBasedMeasurements);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExperimentDataPackage.NUMERICAL_RATIO_STATISTICS: {
			NumericalRatioStatistics numericalRatioStatistics = (NumericalRatioStatistics) theEObject;
			T result = caseNumericalRatioStatistics(numericalRatioStatistics);
			if (result == null)
				result = caseNumericalIntervalStatistics(numericalRatioStatistics);
			if (result == null)
				result = caseNumericalOrdinalStatistics(numericalRatioStatistics);
			if (result == null)
				result = caseNumericalNominalStatistics(numericalRatioStatistics);
			if (result == null)
				result = caseIdentifier(numericalRatioStatistics);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExperimentDataPackage.SENSOR_FRAMEWORK_V1_DOUBLE_BINARY_MEASUREMENTS: {
			SensorFrameworkV1DoubleBinaryMeasurements sensorFrameworkV1DoubleBinaryMeasurements = (SensorFrameworkV1DoubleBinaryMeasurements) theEObject;
			T result = caseSensorFrameworkV1DoubleBinaryMeasurements(sensorFrameworkV1DoubleBinaryMeasurements);
			if (result == null)
				result = (T) caseDoubleBinaryMeasurements(sensorFrameworkV1DoubleBinaryMeasurements);
			if (result == null)
				result = caseDataSeries(sensorFrameworkV1DoubleBinaryMeasurements);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExperimentDataPackage.SENSOR_FRAMEWORK_V1_IDENTIFIER_BASED_MEASUREMENTS: {
			SensorFrameworkV1IdentifierBasedMeasurements sensorFrameworkV1IdentifierBasedMeasurements = (SensorFrameworkV1IdentifierBasedMeasurements) theEObject;
			T result = caseSensorFrameworkV1IdentifierBasedMeasurements(sensorFrameworkV1IdentifierBasedMeasurements);
			if (result == null)
				result = caseIdentifierBasedMeasurements(sensorFrameworkV1IdentifierBasedMeasurements);
			if (result == null)
				result = caseDataSeries(sensorFrameworkV1IdentifierBasedMeasurements);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExperimentDataPackage.IJS_DURATION: {
			Duration ijsDuration = (Duration) theEObject;
			T result = caseIJSDuration(ijsDuration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExperimentDataPackage.ECOMPARABLE: {
			Comparable eComparable = (Comparable) theEObject;
			T result = caseEComparable(eComparable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExperimentDataPackage.TEXTUAL_ORDINAL_STATISTICS: {
			TextualOrdinalStatistics textualOrdinalStatistics = (TextualOrdinalStatistics) theEObject;
			T result = caseTextualOrdinalStatistics(textualOrdinalStatistics);
			if (result == null)
				result = caseTextualNominalStatistics(textualOrdinalStatistics);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExperimentDataPackage.RUN: {
			Run run = (Run) theEObject;
			T result = caseRun(run);
			if (result == null)
				result = caseIdentifier(run);
			if (result == null)
				result = casePropertyable(run);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExperimentDataPackage.EXPERIMENT_GROUP_RUN: {
			ExperimentGroupRun experimentGroupRun = (ExperimentGroupRun) theEObject;
			T result = caseExperimentGroupRun(experimentGroupRun);
			if (result == null)
				result = caseRun(experimentGroupRun);
			if (result == null)
				result = caseIdentifier(experimentGroupRun);
			if (result == null)
				result = casePropertyable(experimentGroupRun);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aggregated Measurements</em>'.
	 * <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregated Measurements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAggregatedMeasurements(AggregatedMeasurements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measurements Range</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measurements Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasurementsRange(MeasurementsRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Propertyable</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Propertyable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyable(Propertyable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EStringto EObject Map Entry</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EStringto EObject Map Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEStringtoEObjectMapEntry(Map.Entry<String, Object> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Raw Measurements</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Raw Measurements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRawMeasurements(RawMeasurements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Series</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Series</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataSeries(DataSeries object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Numerical Nominal Statistics</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Numerical Nominal Statistics</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumericalNominalStatistics(NumericalNominalStatistics object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Numerical Mass Distribution</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Numerical Mass Distribution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumericalMassDistribution(NumericalMassDistribution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fixed Width Aggregated Measurements</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fixed Width Aggregated Measurements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFixedWidthAggregatedMeasurements(
			FixedWidthAggregatedMeasurements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fixed Intervals</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fixed Intervals</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFixedIntervals(FixedIntervals object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Textual Nominal Statistics</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Textual Nominal Statistics</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextualNominalStatistics(TextualNominalStatistics object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Textual Mass Distribution</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Textual Mass Distribution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextualMassDistribution(TextualMassDistribution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measurements</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measurements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasurements(Measurements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasure(Measure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Experiment Group</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Experiment Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExperimentGroup(ExperimentGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Experiment Setting</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Experiment Setting</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExperimentSetting(ExperimentSetting object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Experiment Run</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Experiment Run</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExperimentRun(ExperimentRun object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aggregation Statistics</em>'.
	 * <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregation Statistics</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAggregationStatistics(AggregationStatistics object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double Binary Measurements</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double Binary Measurements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <Q extends Quantity> T caseDoubleBinaryMeasurements(
			DoubleBinaryMeasurements<Q> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Numerical Interval Statistics</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Numerical Interval Statistics</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumericalIntervalStatistics(NumericalIntervalStatistics object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Numerical Ordinal Statistics</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Numerical Ordinal Statistics</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumericalOrdinalStatistics(NumericalOrdinalStatistics object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Numerical Percentile</em>'.
	 * <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Numerical Percentile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumericalPercentile(NumericalPercentile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JS Xml Measurements</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JS Xml Measurements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJSXmlMeasurements(JSXmlMeasurements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Long Binary Measurements</em>'.
	 * <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Long Binary Measurements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLongBinaryMeasurements(LongBinaryMeasurements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifier Based Measurements</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifier Based Measurements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifierBasedMeasurements(IdentifierBasedMeasurements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Numerical Ratio Statistics</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Numerical Ratio Statistics</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumericalRatioStatistics(NumericalRatioStatistics object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sensor Framework V1 Double Binary Measurements</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sensor Framework V1 Double Binary Measurements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensorFrameworkV1DoubleBinaryMeasurements(
			SensorFrameworkV1DoubleBinaryMeasurements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sensor Framework V1 Identifier Based Measurements</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sensor Framework V1 Identifier Based Measurements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensorFrameworkV1IdentifierBasedMeasurements(
			SensorFrameworkV1IdentifierBasedMeasurements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IJS Duration</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IJS Duration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIJSDuration(Duration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EComparable</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EComparable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public T caseEComparable(Comparable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Textual Ordinal Statistics</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Textual Ordinal Statistics</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextualOrdinalStatistics(TextualOrdinalStatistics object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Run</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Run</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRun(Run object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Experiment Group Run</em>'.
	 * <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Experiment Group Run</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExperimentGroupRun(ExperimentGroupRun object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifier</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifier(Identifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch, but this is the last case anyway. <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} // ExperimentDataSwitch
