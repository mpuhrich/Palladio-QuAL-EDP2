package org.palladiosimulator.edp2.impl;

import org.palladiosimulator.edp2.models.ExperimentData.BaseMetricDescription;
import org.palladiosimulator.edp2.models.ExperimentData.MetricDescription;

/**
 * A single measurement for a measure (definition).
 * 
 * @author groenda, Sebastian Lehrig
 */
public class Measurement {
	
	/** The definition of the metric which is used to gather the measured values. */
	private final MetricDescription metric;
	
	/** The base metric definitions of the provided metric. This depends on metric. */
	private final BaseMetricDescription[] descriptions;
	
	/** A single measurement with a value for each element specified in the metric definition. */
	private final Object[] measuredValue;
	
	public Measurement(MetricDescription metric) {
		this.metric = metric;
		this.descriptions = MetricDescriptionUtility.toBaseMetricDescriptions(metric);
		this.measuredValue = new Object[descriptions.length];
	}

	/**Set the value of the specified index.
	 * @param measuredValueIndex Index of the measurement.
	 * @param value The value to set.
	 */
	public void setMeasuredValue(int measuredValueIndex, Object value) {
		assert(measuredValue != null);
		if (measuredValueIndex < 0) {
			throw new IndexOutOfBoundsException("Index must be greater or equal to 0. It was " + measuredValueIndex);
		}
		if (measuredValueIndex >= measuredValue.length) {
			throw new IndexOutOfBoundsException("Index must be less than the number of measurements length in the metric specification. Length is " + measuredValue.length + " requested index was " + measuredValueIndex);
		}
		if (value == null) {
			throw new IllegalArgumentException("Provided value must not be null.");
		}
		if (!MetricDescriptionUtility.isValidValue(descriptions[measuredValueIndex], value)) {
			throw new IllegalArgumentException("Type of provided value was not valid. BaseMetricDescription is " + descriptions[measuredValueIndex] + ", value was " + value);
		}

		measuredValue[measuredValueIndex] = value;
	}
	
	/**Returns the value of the specified index.
	 * @param index Index for which the value is requested.
	 * @return Measured value.
	 */
	public Object getMeasuredValue(int index) {
		assert(measuredValue != null);
		return measuredValue[index];
	}

	/**Returns the metric associated with the measure value stored in this instance.
	 * @return the metric
	 */
	public MetricDescription getMetric() {
		return this.metric;
	}
	
}
