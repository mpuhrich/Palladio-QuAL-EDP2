/**
 * 
 */
package org.palladiosimulator.edp2.util;

import javax.measure.Measure;

import org.palladiosimulator.edp2.util.visitors.BaseMetricFromMetricSwitch;
import org.palladiosimulator.metricspec.BaseMetricDescription;
import org.palladiosimulator.metricspec.CaptureType;
import org.palladiosimulator.metricspec.Identifier;
import org.palladiosimulator.metricspec.MetricDescription;
import org.palladiosimulator.metricspec.TextualBaseMetricDescription;

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
                    if (ident.getId().equals(((Measure<Identifier,?>)value).getValue().getId())) {
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
