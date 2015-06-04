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
import org.palladiosimulator.edp2.models.ExperimentData.SensorFrameworkV1DoubleBinaryMeasurements;
import org.palladiosimulator.edp2.models.ExperimentData.SensorFrameworkV1IdentifierBasedMeasurements;
import org.palladiosimulator.edp2.models.ExperimentData.TextualMassDistribution;
import org.palladiosimulator.edp2.models.ExperimentData.TextualNominalStatistics;
import org.palladiosimulator.edp2.models.ExperimentData.TextualOrdinalStatistics;
import org.palladiosimulator.mdsdprofiles.StereotypableElement;

import de.uka.ipd.sdq.identifier.Identifier;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the
 * call {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for
 * each class of the model, starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the result of the switch.
 * <!-- end-user-doc -->
 * 
 * @see org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage
 * @generated
 */
public class ExperimentDataSwitch<T> extends Switch<T> {

    /**
     * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected static ExperimentDataPackage modelPackage;

    /**
     * Creates an instance of the switch. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public ExperimentDataSwitch() {
        if (modelPackage == null) {
            modelPackage = ExperimentDataPackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @parameter ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor(final EPackage ePackage) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result;
     * it yields that result. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch(final int classifierID, final EObject theEObject) {
        switch (classifierID) {
        case ExperimentDataPackage.AGGREGATED_MEASUREMENTS: {
            final AggregatedMeasurements aggregatedMeasurements = (AggregatedMeasurements) theEObject;
            T result = this.caseAggregatedMeasurements(aggregatedMeasurements);
            if (result == null) {
                result = this.caseIdentifier(aggregatedMeasurements);
            }
            if (result == null) {
                result = this.caseStereotypableElement(aggregatedMeasurements);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case ExperimentDataPackage.MEASUREMENT_RANGE: {
            final MeasurementRange measurementRange = (MeasurementRange) theEObject;
            T result = this.caseMeasurementRange(measurementRange);
            if (result == null) {
                result = this.casePropertyable(measurementRange);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case ExperimentDataPackage.PROPERTYABLE: {
            final Propertyable propertyable = (Propertyable) theEObject;
            T result = this.casePropertyable(propertyable);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case ExperimentDataPackage.ESTRINGTO_EOBJECT_MAP_ENTRY: {
            @SuppressWarnings("unchecked")
            final Map.Entry<String, Object> eStringtoEObjectMapEntry = (Map.Entry<String, Object>) theEObject;
            T result = this.caseEStringtoEObjectMapEntry(eStringtoEObjectMapEntry);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case ExperimentDataPackage.RAW_MEASUREMENTS: {
            final RawMeasurements rawMeasurements = (RawMeasurements) theEObject;
            T result = this.caseRawMeasurements(rawMeasurements);
            if (result == null) {
                result = this.caseIdentifier(rawMeasurements);
            }
            if (result == null) {
                result = this.caseStereotypableElement(rawMeasurements);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case ExperimentDataPackage.DATA_SERIES: {
            final DataSeries dataSeries = (DataSeries) theEObject;
            T result = this.caseDataSeries(dataSeries);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case ExperimentDataPackage.NUMERICAL_NOMINAL_STATISTICS: {
            final NumericalNominalStatistics numericalNominalStatistics = (NumericalNominalStatistics) theEObject;
            T result = this.caseNumericalNominalStatistics(numericalNominalStatistics);
            if (result == null) {
                result = this.caseIdentifier(numericalNominalStatistics);
            }
            if (result == null) {
                result = this.caseStereotypableElement(numericalNominalStatistics);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case ExperimentDataPackage.NUMERICAL_MASS_DISTRIBUTION: {
            final NumericalMassDistribution numericalMassDistribution = (NumericalMassDistribution) theEObject;
            T result = this.caseNumericalMassDistribution(numericalMassDistribution);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case ExperimentDataPackage.FIXED_WIDTH_AGGREGATED_MEASUREMENTS: {
            final FixedWidthAggregatedMeasurements fixedWidthAggregatedMeasurements = (FixedWidthAggregatedMeasurements) theEObject;
            T result = this.caseFixedWidthAggregatedMeasurements(fixedWidthAggregatedMeasurements);
            if (result == null) {
                result = this.caseAggregatedMeasurements(fixedWidthAggregatedMeasurements);
            }
            if (result == null) {
                result = this.caseIdentifier(fixedWidthAggregatedMeasurements);
            }
            if (result == null) {
                result = this.caseStereotypableElement(fixedWidthAggregatedMeasurements);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case ExperimentDataPackage.FIXED_INTERVALS: {
            final FixedIntervals fixedIntervals = (FixedIntervals) theEObject;
            T result = this.caseFixedIntervals(fixedIntervals);
            if (result == null) {
                result = this.caseIdentifier(fixedIntervals);
            }
            if (result == null) {
                result = this.caseStereotypableElement(fixedIntervals);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case ExperimentDataPackage.TEXTUAL_NOMINAL_STATISTICS: {
            final TextualNominalStatistics textualNominalStatistics = (TextualNominalStatistics) theEObject;
            T result = this.caseTextualNominalStatistics(textualNominalStatistics);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case ExperimentDataPackage.TEXTUAL_MASS_DISTRIBUTION: {
            final TextualMassDistribution textualMassDistribution = (TextualMassDistribution) theEObject;
            T result = this.caseTextualMassDistribution(textualMassDistribution);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case ExperimentDataPackage.EXPERIMENT_GROUP: {
            final ExperimentGroup experimentGroup = (ExperimentGroup) theEObject;
            T result = this.caseExperimentGroup(experimentGroup);
            if (result == null) {
                result = this.caseIdentifier(experimentGroup);
            }
            if (result == null) {
                result = this.casePropertyable(experimentGroup);
            }
            if (result == null) {
                result = this.caseStereotypableElement(experimentGroup);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case ExperimentDataPackage.EXPERIMENT_SETTING: {
            final ExperimentSetting experimentSetting = (ExperimentSetting) theEObject;
            T result = this.caseExperimentSetting(experimentSetting);
            if (result == null) {
                result = this.caseIdentifier(experimentSetting);
            }
            if (result == null) {
                result = this.casePropertyable(experimentSetting);
            }
            if (result == null) {
                result = this.caseStereotypableElement(experimentSetting);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case ExperimentDataPackage.EXPERIMENT_RUN: {
            final ExperimentRun experimentRun = (ExperimentRun) theEObject;
            T result = this.caseExperimentRun(experimentRun);
            if (result == null) {
                result = this.caseRun(experimentRun);
            }
            if (result == null) {
                result = this.caseIdentifier(experimentRun);
            }
            if (result == null) {
                result = this.casePropertyable(experimentRun);
            }
            if (result == null) {
                result = this.caseStereotypableElement(experimentRun);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case ExperimentDataPackage.MEASUREMENT: {
            final Measurement measurement = (Measurement) theEObject;
            T result = this.caseMeasurement(measurement);
            if (result == null) {
                result = this.caseIdentifier(measurement);
            }
            if (result == null) {
                result = this.casePropertyable(measurement);
            }
            if (result == null) {
                result = this.caseStereotypableElement(measurement);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case ExperimentDataPackage.MEASURING_TYPE: {
            final MeasuringType measuringType = (MeasuringType) theEObject;
            T result = this.caseMeasuringType(measuringType);
            if (result == null) {
                result = this.caseIdentifier(measuringType);
            }
            if (result == null) {
                result = this.caseStereotypableElement(measuringType);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case ExperimentDataPackage.AGGREGATION_STATISTICS: {
            final AggregationStatistics aggregationStatistics = (AggregationStatistics) theEObject;
            T result = this.caseAggregationStatistics(aggregationStatistics);
            if (result == null) {
                result = this.caseIdentifier(aggregationStatistics);
            }
            if (result == null) {
                result = this.caseStereotypableElement(aggregationStatistics);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case ExperimentDataPackage.DOUBLE_BINARY_MEASUREMENTS: {
            final DoubleBinaryMeasurements<?> doubleBinaryMeasurements = (DoubleBinaryMeasurements<?>) theEObject;
            T result = this.caseDoubleBinaryMeasurements(doubleBinaryMeasurements);
            if (result == null) {
                result = this.caseDataSeries(doubleBinaryMeasurements);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case ExperimentDataPackage.NUMERICAL_INTERVAL_STATISTICS: {
            final NumericalIntervalStatistics numericalIntervalStatistics = (NumericalIntervalStatistics) theEObject;
            T result = this.caseNumericalIntervalStatistics(numericalIntervalStatistics);
            if (result == null) {
                result = this.caseNumericalOrdinalStatistics(numericalIntervalStatistics);
            }
            if (result == null) {
                result = this.caseNumericalNominalStatistics(numericalIntervalStatistics);
            }
            if (result == null) {
                result = this.caseIdentifier(numericalIntervalStatistics);
            }
            if (result == null) {
                result = this.caseStereotypableElement(numericalIntervalStatistics);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case ExperimentDataPackage.NUMERICAL_ORDINAL_STATISTICS: {
            final NumericalOrdinalStatistics numericalOrdinalStatistics = (NumericalOrdinalStatistics) theEObject;
            T result = this.caseNumericalOrdinalStatistics(numericalOrdinalStatistics);
            if (result == null) {
                result = this.caseNumericalNominalStatistics(numericalOrdinalStatistics);
            }
            if (result == null) {
                result = this.caseIdentifier(numericalOrdinalStatistics);
            }
            if (result == null) {
                result = this.caseStereotypableElement(numericalOrdinalStatistics);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case ExperimentDataPackage.NUMERICAL_PERCENTILE: {
            final NumericalPercentile numericalPercentile = (NumericalPercentile) theEObject;
            T result = this.caseNumericalPercentile(numericalPercentile);
            if (result == null) {
                result = this.caseIdentifier(numericalPercentile);
            }
            if (result == null) {
                result = this.caseStereotypableElement(numericalPercentile);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case ExperimentDataPackage.JS_XML_MEASUREMENTS: {
            final JSXmlMeasurements jsXmlMeasurements = (JSXmlMeasurements) theEObject;
            T result = this.caseJSXmlMeasurements(jsXmlMeasurements);
            if (result == null) {
                result = this.caseDataSeries(jsXmlMeasurements);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case ExperimentDataPackage.LONG_BINARY_MEASUREMENTS: {
            final LongBinaryMeasurements longBinaryMeasurements = (LongBinaryMeasurements) theEObject;
            T result = this.caseLongBinaryMeasurements(longBinaryMeasurements);
            if (result == null) {
                result = this.caseDataSeries(longBinaryMeasurements);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case ExperimentDataPackage.IDENTIFIER_BASED_MEASUREMENTS: {
            final IdentifierBasedMeasurements identifierBasedMeasurements = (IdentifierBasedMeasurements) theEObject;
            T result = this.caseIdentifierBasedMeasurements(identifierBasedMeasurements);
            if (result == null) {
                result = this.caseDataSeries(identifierBasedMeasurements);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case ExperimentDataPackage.NUMERICAL_RATIO_STATISTICS: {
            final NumericalRatioStatistics numericalRatioStatistics = (NumericalRatioStatistics) theEObject;
            T result = this.caseNumericalRatioStatistics(numericalRatioStatistics);
            if (result == null) {
                result = this.caseNumericalIntervalStatistics(numericalRatioStatistics);
            }
            if (result == null) {
                result = this.caseNumericalOrdinalStatistics(numericalRatioStatistics);
            }
            if (result == null) {
                result = this.caseNumericalNominalStatistics(numericalRatioStatistics);
            }
            if (result == null) {
                result = this.caseIdentifier(numericalRatioStatistics);
            }
            if (result == null) {
                result = this.caseStereotypableElement(numericalRatioStatistics);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case ExperimentDataPackage.SENSOR_FRAMEWORK_V1_DOUBLE_BINARY_MEASUREMENTS: {
            final SensorFrameworkV1DoubleBinaryMeasurements sensorFrameworkV1DoubleBinaryMeasurements = (SensorFrameworkV1DoubleBinaryMeasurements) theEObject;
            T result = this.caseSensorFrameworkV1DoubleBinaryMeasurements(sensorFrameworkV1DoubleBinaryMeasurements);
            if (result == null) {
                result = (T) this.caseDoubleBinaryMeasurements(sensorFrameworkV1DoubleBinaryMeasurements);
            }
            if (result == null) {
                result = this.caseDataSeries(sensorFrameworkV1DoubleBinaryMeasurements);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case ExperimentDataPackage.SENSOR_FRAMEWORK_V1_IDENTIFIER_BASED_MEASUREMENTS: {
            final SensorFrameworkV1IdentifierBasedMeasurements sensorFrameworkV1IdentifierBasedMeasurements = (SensorFrameworkV1IdentifierBasedMeasurements) theEObject;
            T result = this
                    .caseSensorFrameworkV1IdentifierBasedMeasurements(sensorFrameworkV1IdentifierBasedMeasurements);
            if (result == null) {
                result = this.caseIdentifierBasedMeasurements(sensorFrameworkV1IdentifierBasedMeasurements);
            }
            if (result == null) {
                result = this.caseDataSeries(sensorFrameworkV1IdentifierBasedMeasurements);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case ExperimentDataPackage.IJS_DURATION: {
            final Duration ijsDuration = (Duration) theEObject;
            T result = this.caseIJSDuration(ijsDuration);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case ExperimentDataPackage.ECOMPARABLE: {
            final Comparable eComparable = (Comparable) theEObject;
            T result = this.caseEComparable(eComparable);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case ExperimentDataPackage.TEXTUAL_ORDINAL_STATISTICS: {
            final TextualOrdinalStatistics textualOrdinalStatistics = (TextualOrdinalStatistics) theEObject;
            T result = this.caseTextualOrdinalStatistics(textualOrdinalStatistics);
            if (result == null) {
                result = this.caseTextualNominalStatistics(textualOrdinalStatistics);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case ExperimentDataPackage.RUN: {
            final Run run = (Run) theEObject;
            T result = this.caseRun(run);
            if (result == null) {
                result = this.caseIdentifier(run);
            }
            if (result == null) {
                result = this.casePropertyable(run);
            }
            if (result == null) {
                result = this.caseStereotypableElement(run);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case ExperimentDataPackage.EXPERIMENT_GROUP_RUN: {
            final ExperimentGroupRun experimentGroupRun = (ExperimentGroupRun) theEObject;
            T result = this.caseExperimentGroupRun(experimentGroupRun);
            if (result == null) {
                result = this.caseRun(experimentGroupRun);
            }
            if (result == null) {
                result = this.caseIdentifier(experimentGroupRun);
            }
            if (result == null) {
                result = this.casePropertyable(experimentGroupRun);
            }
            if (result == null) {
                result = this.caseStereotypableElement(experimentGroupRun);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        default:
            return this.defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Aggregated Measurements</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Aggregated Measurements</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAggregatedMeasurements(final AggregatedMeasurements object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Measurement Range</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Measurement Range</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMeasurementRange(final MeasurementRange object) {
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
    public T casePropertyable(final Propertyable object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>EStringto EObject Map Entry</em>'. <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>EStringto EObject Map Entry</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEStringtoEObjectMapEntry(final Map.Entry<String, Object> object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Raw Measurements</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Raw Measurements</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRawMeasurements(final RawMeasurements object) {
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
    public T caseDataSeries(final DataSeries object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Numerical Nominal Statistics</em>'. <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Numerical Nominal Statistics</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNumericalNominalStatistics(final NumericalNominalStatistics object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Numerical Mass Distribution</em>'. <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Numerical Mass Distribution</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNumericalMassDistribution(final NumericalMassDistribution object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Fixed Width Aggregated Measurements</em>'. <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Fixed Width Aggregated Measurements</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFixedWidthAggregatedMeasurements(final FixedWidthAggregatedMeasurements object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Fixed Intervals</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Fixed Intervals</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFixedIntervals(final FixedIntervals object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Textual Nominal Statistics</em>'. <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Textual Nominal Statistics</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTextualNominalStatistics(final TextualNominalStatistics object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Textual Mass Distribution</em>'. <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Textual Mass Distribution</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTextualMassDistribution(final TextualMassDistribution object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Experiment Group</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Experiment Group</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExperimentGroup(final ExperimentGroup object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Experiment Setting</em>
     * '. <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Experiment Setting</em>
     *         '.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExperimentSetting(final ExperimentSetting object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Experiment Run</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Experiment Run</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExperimentRun(final ExperimentRun object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Measurement</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Measurement</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMeasurement(final Measurement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Measuring Type</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Measuring Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMeasuringType(final MeasuringType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Aggregation Statistics</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Aggregation Statistics</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAggregationStatistics(final AggregationStatistics object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Double Binary Measurements</em>'. <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Double Binary Measurements</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public <Q extends Quantity> T caseDoubleBinaryMeasurements(final DoubleBinaryMeasurements<Q> object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Numerical Interval Statistics</em>'. <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Numerical Interval Statistics</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNumericalIntervalStatistics(final NumericalIntervalStatistics object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Numerical Ordinal Statistics</em>'. <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Numerical Ordinal Statistics</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNumericalOrdinalStatistics(final NumericalOrdinalStatistics object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Numerical Percentile</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Numerical Percentile</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNumericalPercentile(final NumericalPercentile object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>JS Xml Measurements</em>
     * '. <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>JS Xml Measurements</em>
     *         '.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseJSXmlMeasurements(final JSXmlMeasurements object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Long Binary Measurements</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Long Binary Measurements</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLongBinaryMeasurements(final LongBinaryMeasurements object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Identifier Based Measurements</em>'. <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Identifier Based Measurements</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIdentifierBasedMeasurements(final IdentifierBasedMeasurements object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Numerical Ratio Statistics</em>'. <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Numerical Ratio Statistics</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNumericalRatioStatistics(final NumericalRatioStatistics object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Sensor Framework V1 Double Binary Measurements</em>'. <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Sensor Framework V1 Double Binary Measurements</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSensorFrameworkV1DoubleBinaryMeasurements(final SensorFrameworkV1DoubleBinaryMeasurements object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Sensor Framework V1 Identifier Based Measurements</em>'. <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Sensor Framework V1 Identifier Based Measurements</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSensorFrameworkV1IdentifierBasedMeasurements(final SensorFrameworkV1IdentifierBasedMeasurements object) {
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
    public T caseIJSDuration(final Duration object) {
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
    public T caseEComparable(final Comparable object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Textual Ordinal Statistics</em>'. <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Textual Ordinal Statistics</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTextualOrdinalStatistics(final TextualOrdinalStatistics object) {
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
    public T caseRun(final Run object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Experiment Group Run</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Experiment Group Run</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExperimentGroupRun(final ExperimentGroupRun object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Stereotypable Element</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Stereotypable Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStereotypableElement(final StereotypableElement object) {
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
    public T caseIdentifier(final Identifier object) {
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
    public T defaultCase(final EObject object) {
        return null;
    }

} // ExperimentDataSwitch
