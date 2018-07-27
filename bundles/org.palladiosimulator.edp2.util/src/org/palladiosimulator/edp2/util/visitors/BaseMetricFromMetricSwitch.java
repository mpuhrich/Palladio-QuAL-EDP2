/**
 * 
 */
package org.palladiosimulator.edp2.util.visitors;

import java.util.Vector;

import org.palladiosimulator.metricspec.BaseMetricDescription;
import org.palladiosimulator.metricspec.MetricDescription;
import org.palladiosimulator.metricspec.MetricSetDescription;
import org.palladiosimulator.metricspec.util.MetricSpecSwitch;

/**
 * Switch to resolve all base metrics in the order they are specified in a metric description.
 * 
 * @author groenda
 */
public class BaseMetricFromMetricSwitch extends MetricSpecSwitch<BaseMetricDescription[]> {

    @Override
    public BaseMetricDescription[] caseBaseMetricDescription(final BaseMetricDescription object) {
        final BaseMetricDescription[] descriptions = new BaseMetricDescription[1];
        descriptions[0] = object;
        return descriptions;
    }

    @Override
    public BaseMetricDescription[] caseMetricSetDescription(final MetricSetDescription object) {
        final Vector<BaseMetricDescription> descriptions = new Vector<BaseMetricDescription>();
        for (final MetricDescription description : object.getSubsumedMetrics()) {
            final BaseMetricDescription[] baseDescriptions = new BaseMetricFromMetricSwitch().doSwitch(description);
            for (final BaseMetricDescription baseDescription : baseDescriptions) {
                descriptions.add(baseDescription);
            }
        }
        return descriptions.toArray(new BaseMetricDescription[0]);
    }
}
