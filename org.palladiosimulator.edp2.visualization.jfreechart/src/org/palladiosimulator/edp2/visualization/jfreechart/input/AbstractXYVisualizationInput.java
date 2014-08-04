package org.palladiosimulator.edp2.visualization.jfreechart.input;

import java.util.HashMap;
import java.util.Map;

import org.palladiosimulator.edp2.visualization.jfreechart.input.xyplot.XYPlotVisualizationInputConfiguration;
import org.palladiosimulator.metricspec.MetricSetDescription;
import org.palladiosimulator.metricspec.constants.MetricDescriptionConstants;

public abstract class AbstractXYVisualizationInput extends JFreeChartVisualizationInput {

    private int xPos;

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.palladiosimulator.edp2.visualization.AbstractVisualizationInput#firstChildInputAdded(
     * org.palladiosimulator.edp2.visualization.AbstractVisualizationSingleDatastreamInput)
     */
    @Override
    protected void firstChildInputAdded(final JFreeChartVisualizationSingleDatastreamInput newChildInput) {
        super.firstChildInputAdded(newChildInput);

        final MetricSetDescription metricSetDescription = ((MetricSetDescription) newChildInput.getDataSource()
                .getMetricDesciption());

        xPos = 0;
        if (metricSetDescription.getSubsumedMetrics().get(1).getId()
                .equals(MetricDescriptionConstants.POINT_IN_TIME_METRIC.getId())) {
            // TODO Find and use general concept for metric equality.
            xPos = 1;
        }

        final Map<String, Object> configuration = new HashMap<String, Object>(getConfiguration().getProperties());
        configuration.put(XYPlotVisualizationInputConfiguration.DOMAIN_AXIS_LABEL_KEY, getAxisDefaultLabel(getXPos()));
        configuration.put(XYPlotVisualizationInputConfiguration.RANGE_AXIS_LABEL_KEY, getAxisDefaultLabel(getYPos()));
        getConfiguration().setProperties(configuration);
    }

    protected int getXPos() {
        return this.xPos;
    }

    protected int getYPos() {
        return 1 - this.xPos;
    }

}
