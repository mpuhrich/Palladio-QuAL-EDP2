package org.palladiosimulator.edp2.visualization.editors;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.palladiosimulator.edp2.datastream.configurable.PropertyConfigurable;

public class JFreeChartVisualisationSingleDatastreamConfiguration extends PropertyConfigurable {

    /**
     * Keys used for persistence of properties.
     */
    public static final String COLOR_KEY = "color";
    public final static String ALPHA_KEY = "alpha";

    /**
     * Constant, describing that no color is used for this input (actually, it
     * is white).
     */
    public final static String NO_COLOR = "#ffffff";

    /**
     * Color for this {@link JFreeChartVisualisationSingleDatastreamInput}'s data in the graph.
     */
    private final String hexColor = NO_COLOR;

    /**
     * The alpha value for this {@link JFreeChartVisualisationSingleDatastreamInput}'s color.
     */
    private final float alpha = 1.0f;

    @Override
    public Set<String> getKeys() {
        return null;
    }

    public String getColor() {
        return hexColor;
    }

    public float getAlpha() {
        return alpha;
    }

    @Override
    public Map<? extends String, ? extends Object> getDefaultConfiguration() {
        final Map<String,Object> result = new HashMap<String, Object>();
        result.put(COLOR_KEY, NO_COLOR);
        result.put(ALPHA_KEY, "1.0");
        return result;
    }
}
