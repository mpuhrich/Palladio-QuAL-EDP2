package org.palladiosimulator.edp2.visualization.jfreechart.input.pie;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.palladiosimulator.edp2.visualization.jfreechart.input.JFreeChartVisualizationConfiguration;

public class PieChartVisualizationConfiguration
extends JFreeChartVisualizationConfiguration {

    public final static String SHOW_RELATIVE_AMOUNT_KEY = "showRelativeAmount";

    private boolean showRelativeAmount = true;

    /* (non-Javadoc)
     * @see org.palladiosimulator.edp2.visualization.editors.JFreeChartVisualizationConfiguration#getKeys()
     */
    @Override
    public Set<String> getKeys() {
        final Set<String> result = new HashSet<String>(super.getKeys());
        result.add(SHOW_RELATIVE_AMOUNT_KEY);
        return result;
    }

    /* (non-Javadoc)
     * @see org.palladiosimulator.edp2.visualization.editors.JFreeChartVisualizationConfiguration#propertyChanged(java.lang.String, java.lang.Object, java.lang.Object)
     */
    @Override
    public void propertyChanged(final String key, final Object oldValue, final Object newValue) {
        super.propertyChanged(key, oldValue, newValue);
        if (SHOW_RELATIVE_AMOUNT_KEY.equals(key)) {
            showRelativeAmount = "true".equals(newValue);
        }
    }

    /* (non-Javadoc)
     * @see org.palladiosimulator.edp2.visualization.editors.JFreeChartVisualizationConfiguration#getDefaultConfiguration()
     */
    @Override
    public Map<String,Object> getDefaultConfiguration() {
        final Map<String,Object> result = new HashMap<String,Object>(super.getDefaultConfiguration());
        result.put(SHOW_RELATIVE_AMOUNT_KEY, "true");
        return result;
    }

    /**
     * @return the showRelativeAmount
     */
    public final boolean isShowRelativeAmount() {
        return showRelativeAmount;
    }
}
