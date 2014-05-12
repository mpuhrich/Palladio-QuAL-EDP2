package org.palladiosimulator.edp2.visualization.editors;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.palladiosimulator.edp2.datastream.configurable.IPropertyListener;
import org.palladiosimulator.edp2.datastream.configurable.PropertyConfigurable;

public class JFreeChartVisualizationConfiguration
extends PropertyConfigurable implements IPropertyListener {

    public static final String TITLE_KEY = "title";
    public static final String SHOW_TITLE_KEY = "showTitle";
    public static final String SHOW_LEGEND_KEY = "showLegend";

    private String title = "JFreeChart";
    private boolean showTitle = true;
    private boolean showLegend = true;

    public JFreeChartVisualizationConfiguration() {
        super();
        this.addObserver(this);
    }

    @Override
    public Set<String> getKeys() {
        final Set<String> result = new HashSet<String>();
        result.add(TITLE_KEY);
        result.add(SHOW_LEGEND_KEY);
        result.add(SHOW_TITLE_KEY);
        return result;
    }

    @Override
    public void propertyChanged(final String key, final Object oldValue, final Object newValue) {
        if (TITLE_KEY.equals(key)) {
            title = (String) newValue;
        } else if (SHOW_LEGEND_KEY.equals(key)) {
            showLegend = "true".equals(newValue);
        } else if (SHOW_TITLE_KEY.equals(key)) {
            showTitle = "true".equals(newValue);
        }
    }

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
    public Map<? extends String, ? extends Object> getDefaultConfiguration() {
        final Map<String,Object> result = new HashMap<String, Object>();
        result.put(TITLE_KEY, "JFreeChart");
        result.put(SHOW_LEGEND_KEY, "true");
        result.put(SHOW_TITLE_KEY, "true");
        return result;
    }

    @Override
    public void propertyChangeCompleted() {
    }
}
