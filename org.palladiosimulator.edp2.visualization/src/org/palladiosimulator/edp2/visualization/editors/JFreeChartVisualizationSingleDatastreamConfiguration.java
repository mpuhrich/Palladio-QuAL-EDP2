package org.palladiosimulator.edp2.visualization.editors;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.palladiosimulator.edp2.visualization.AbstractVisualizationSingleDatastreamConfiguration;

public class JFreeChartVisualizationSingleDatastreamConfiguration
extends AbstractVisualizationSingleDatastreamConfiguration {

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
     * Color for this {@link JFreeChartVisualizationSingleDatastreamInput}'s data in the graph.
     */
    private String hexColor = NO_COLOR;

    /**
     * The alpha value for this {@link JFreeChartVisualizationSingleDatastreamInput}'s color.
     */
    private float alpha = 1.0f;

    @Override
    public Set<String> getKeys() {
        final Set<String> result = new HashSet<String>(super.getKeys());
        result.add(COLOR_KEY);
        result.add(ALPHA_KEY);
        return result;
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

    @Override
    public void propertyChanged(final String key, final Object oldValue, final Object newValue) {
        super.propertyChanged(key, oldValue, newValue);
        if (COLOR_KEY.equals(key)) {
            hexColor = (String) newValue;
        } else if (ALPHA_KEY.equals(key)) {
            alpha = Float.parseFloat((String) newValue);
        }
    }
}
