package org.palladiosimulator.edp2.visualization.jfreechart.input.pie;

import java.util.HashMap;
import java.util.Map;

import org.palladiosimulator.edp2.datastream.configurable.reflective.ConfigurationProperty;
import org.palladiosimulator.edp2.visualization.jfreechart.input.JFreeChartVisualizationConfiguration;

public class PieChartVisualizationConfiguration extends JFreeChartVisualizationConfiguration {

    public final static String SHOW_RELATIVE_AMOUNT_KEY = "showRelativeAmount";

    @ConfigurationProperty(description = "Show relative amounts")
    private boolean showRelativeAmount;

    @Override
    public Map<String, Object> getDefaultConfiguration() {
        final Map<String, Object> result = new HashMap<String, Object>(super.getDefaultConfiguration());
        result.put(SHOW_RELATIVE_AMOUNT_KEY, true);
        return result;
    }

    /**
     * @return the showRelativeAmount
     */
    public final boolean isShowRelativeAmount() {
        return showRelativeAmount;
    }
}
