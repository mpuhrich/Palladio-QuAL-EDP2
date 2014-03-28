/**
 * 
 */
package org.palladiosimulator.edp2.impl;

import javax.measure.Measure;

import org.palladiosimulator.edp2.internal.BaseMetricFromMetricSwitch;
import org.palladiosimulator.edp2.models.ExperimentData.BaseMetricDescription;
import org.palladiosimulator.edp2.models.ExperimentData.CaptureType;
import org.palladiosimulator.edp2.models.ExperimentData.Identifier;
import org.palladiosimulator.edp2.models.ExperimentData.MetricDescription;
import org.palladiosimulator.edp2.models.ExperimentData.TextualBaseMetricDescription;

/**Utility class to handle MetricDescription(s).
 * 
 * @author groenda
 */
public class MetricDescriptionUtility {

    /**Returns all base metric descriptions in the order they are specified in a metric description.
     * @param description The description which is processed.
     * @return Ordered array of base metrics.
     */
    public static BaseMetricDescription[] toBaseMetricDescriptions(final MetricDescription description) {
        return new BaseMetricFromMetricSwitch().doSwitch(description);
    }

    /**Checks if a provided object is valid according to the specified metric.
     * @param description The description to use for the validation.
     * @param value The value to check.
     * @return <code>true</code> if the object has a valid type, <code>false</code> otherwise.
     */
    public static boolean isValidValue(final BaseMetricDescription description, final Object value) {
        if (description.getCaptureType() == CaptureType.IDENTIFIER) {
            if (value instanceof Measure && ((Measure)value).getValue() instanceof Identifier) {
                boolean isDefinedAtMetric = false;
                for (final Identifier ident : ((TextualBaseMetricDescription)description).getIdentifiers()) {
                    if (ident.getUuid().equals(((Measure<Identifier,?>)value).getValue().getUuid())) {
                        isDefinedAtMetric = true;
                        break;
                    }
                }
                if (!isDefinedAtMetric) {
                    throw new IllegalArgumentException("The provided identifier " + value + " does not exists for the metric " + description + ".");
                }
                return true;
            } else {
                return false;
            }
        } else { // CaptureType.{INTEGER_NUMBER|REAL_NUMBER}
            if (value instanceof Measure) {
                return true;
            } else {
                return false;
            }
        }
    }
}
