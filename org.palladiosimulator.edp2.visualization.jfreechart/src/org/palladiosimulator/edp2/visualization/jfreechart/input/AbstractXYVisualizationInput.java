package org.palladiosimulator.edp2.visualization.jfreechart.input;

import java.util.HashMap;
import java.util.Map;

import org.palladiosimulator.edp2.visualization.jfreechart.input.xyplot.XYPlotVisualizationInputConfiguration;

public abstract class AbstractXYVisualizationInput extends JFreeChartVisualizationInput {

    /* (non-Javadoc)
     * @see org.palladiosimulator.edp2.visualization.AbstractVisualizationInput#firstChildInputAdded(org.palladiosimulator.edp2.visualization.AbstractVisualizationSingleDatastreamInput)
     */
    @Override
    protected void firstChildInputAdded(final JFreeChartVisualizationSingleDatastreamInput newChildInput) {
        super.firstChildInputAdded(newChildInput);
        final Map<String,Object> configuration = new HashMap<String,Object>(getConfiguration().getProperties());
        configuration.put(XYPlotVisualizationInputConfiguration.DOMAIN_AXIS_LABEL_KEY,getAxisDefaultLabel(0));
        configuration.put(XYPlotVisualizationInputConfiguration.RANGE_AXIS_LABEL_KEY,getAxisDefaultLabel(1));
        getConfiguration().setProperties(configuration);
    }

}
