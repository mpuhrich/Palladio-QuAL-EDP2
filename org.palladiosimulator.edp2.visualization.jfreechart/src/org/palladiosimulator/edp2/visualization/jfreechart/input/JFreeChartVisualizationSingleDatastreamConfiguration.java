package org.palladiosimulator.edp2.visualization.jfreechart.input;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

import org.palladiosimulator.edp2.datastream.configurable.reflective.ConfigurationProperty;
import org.palladiosimulator.edp2.visualization.AbstractVisualizationSingleDatastreamConfiguration;

public class JFreeChartVisualizationSingleDatastreamConfiguration extends
        AbstractVisualizationSingleDatastreamConfiguration {

    /**
     * Keys used for persistence of properties.
     */
    public static final String COLOR_KEY = "color";

    /**
     * Constant, describing that no color is used for this input (actually, it is white).
     */
    public final static Color NO_COLOR = new Color(0, 0, 0, 0);

    /**
     * Color for this {@link JFreeChartVisualizationSingleDatastreamInput}'s data in the graph.
     */
    @ConfigurationProperty(description = "Color of the dataseries")
    private final Color color = NO_COLOR;

    public Color getColor() {
        return color;
    }

    @Override
    public Map<String, Object> getDefaultConfiguration() {
        final Map<String, Object> result = new HashMap<String, Object>(super.getDefaultConfiguration());
        result.put(COLOR_KEY, NO_COLOR);
        return result;
    }
}
