package org.palladiosimulator.edp2.visualization.jfreechart.input;

import java.util.HashMap;
import java.util.Map;

import org.palladiosimulator.edp2.datastream.IDataSource;
import org.palladiosimulator.edp2.util.MetricDescriptionUtility;
import org.palladiosimulator.edp2.visualization.jfreechart.input.xyplot.XYPlotVisualizationInputConfiguration;
import org.palladiosimulator.metricspec.BaseMetricDescription;
import org.palladiosimulator.metricspec.MetricSetDescription;
import org.palladiosimulator.metricspec.NumericalBaseMetricDescription;
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

    @Override
    public boolean canAccept(final IDataSource source) {
        final BaseMetricDescription[] mds = MetricDescriptionUtility.toBaseMetricDescriptions(source.getMetricDesciption());
        if (mds.length != 2) {
            return false; // two-dimensional data needed
        }
        for (final BaseMetricDescription md : mds) {
            if (!(md instanceof NumericalBaseMetricDescription)) {
                return false; // only metrics that use real or integer values
                // can be plotted
            }
        }
        return true;
    }

    protected int getXPos() {
        return this.xPos;
    }

    protected int getYPos() {
        return 1 - this.xPos;
    }

}
