package org.palladiosimulator.edp2.visualization.jfreechart.input;

import java.util.HashMap;
import java.util.Map;

import org.palladiosimulator.edp2.datastream.configurable.reflective.ConfigurationProperty;
import org.palladiosimulator.edp2.datastream.configurable.reflective.ReflectivePropertyConfigurable;

public class JFreeChartVisualizationConfiguration extends ReflectivePropertyConfigurable {

    public static final String TITLE_KEY = "title";
    public static final String SHOW_TITLE_KEY = "showTitle";
    public static final String SHOW_LEGEND_KEY = "showLegend";

    @ConfigurationProperty(description = "Chart Title")
    private String title;

    @ConfigurationProperty(description = "Show Chart Title")
    private boolean showTitle;

    @ConfigurationProperty(description = "Show Legend")
    private boolean showLegend;

    public String getTitle() {
        return title;
    }

    public boolean isShowTitle() {
        return showTitle;
    }

    public boolean isShowLegend() {
        return showLegend;
    }

    @Override
    public Map<String, Object> getDefaultConfiguration() {
        final Map<String, Object> result = new HashMap<String, Object>();
        result.put(TITLE_KEY, "JFreeChart");
        result.put(SHOW_LEGEND_KEY, true);
        result.put(SHOW_TITLE_KEY, true);
        return result;
    }
}
