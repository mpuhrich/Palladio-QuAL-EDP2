package org.palladiosimulator.edp2.visualization.inputs.histogram;

import java.text.ParseException;
import java.text.ParsePosition;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.measure.quantity.Quantity;
import javax.measure.unit.Unit;
import javax.measure.unit.UnitFormat;

import org.palladiosimulator.edp2.visualization.inputs.xyplots.XYPlotVisualizationInputConfiguration;

public class HistogramVisualizationInputConfiguration
extends XYPlotVisualizationInputConfiguration {

    /**
     * Keys for persistence of properties
     */
    public static final String INCLUDE_ZERO_KEY = "includeZero";
    public final static String NUMBER_BINS_KEY = "numberOfBins";
    public final static String SHOW_ITEM_VALUES_KEY = "showItemValues";
    public final static String BAR_MARGIN_KEY = "barMargin";
    public final static String ABSOLUTE_FREQUENCY_KEY = "absoluteFrequency";
    public final static String UNIT_KEY = "unit";

    /**
     * Default value for <code>numberOfBins</code>
     */
    private final static int DEFAULT_NUMBER_BINS = 5;

    /**
     * Default value if no unit is specified.
     */
    private static final String NO_UNIT = "noUnit";

    /**
     * The number of bins, i.e. the number of intervals of equal length in which the measurements
     * are counted.
     */
    private int numberOfBins;

    /**
     * Option to show the value for each bar in the histogram, i.e. the absolute or relative number
     * of items contained in each bin.
     */
    private boolean showItemValues;

    /**
     * Whether to use absolute frequency or relative frequency for the chart. NOTE: this does affect
     * other input items as well, but is specific for histograms, thus it is located here.
     */
    private boolean absoluteFrequency;

    /**
     * The width of the whitespace between the bars in percentage of each bar's width.
     */
    private double barMargin;

    /**
     * The unit of the horizontal axis as a String.
     */
    private String unit;

    /**
     * Always include zero in the diagram?
     */
    private boolean includeZero;
    private Unit<?> jscienceUnit;

    public boolean isIncludeZero() {
        return includeZero;
    }

    public int getNumberOfBins() {
        if (numberOfBins != 0) {
            return numberOfBins;
        }
        return DEFAULT_NUMBER_BINS;
    }

    private void parseJScienceUnit(final String unit) {
        final ParsePosition pos = new ParsePosition(0);
        Unit<?> parsedUnit = null;
        try {
            parsedUnit = UnitFormat.getInstance().parseSingleUnit(unit, pos);
        } catch (final ParseException e) {
            throw new RuntimeException(e);
        }
        if (parsedUnit != null) {
            this.jscienceUnit = parsedUnit;
            this.unit = parsedUnit.toString();
        }
    }

    public String getUnitAsString() {
        return unit;
    }

    @SuppressWarnings("unchecked")
    public <Q extends Quantity> Unit<Q> getUnit() {
        return (Unit<Q>) jscienceUnit;
    }

    public boolean isAbsoluteFrequency() {
        return absoluteFrequency;
    }

    public double getBarMargin() {
        return barMargin;
    }

    public boolean isShowItemValues() {
        return showItemValues;
    }

    /* (non-Javadoc)
     * @see org.palladiosimulator.edp2.visualization.editors.JFreeChartVisualisationConfiguration#getKeys()
     */
    @Override
    public Set<String> getKeys() {
        final Set<String> result = new HashSet<String>(super.getKeys());
        result.add(INCLUDE_ZERO_KEY);
        result.add(NUMBER_BINS_KEY);
        result.add(SHOW_ITEM_VALUES_KEY);
        result.add(BAR_MARGIN_KEY);
        result.add(ABSOLUTE_FREQUENCY_KEY);
        result.add(UNIT_KEY);
        return result;
    }

    /* (non-Javadoc)
     * @see org.palladiosimulator.edp2.visualization.editors.JFreeChartVisualisationConfiguration#getDefaultConfiguration()
     */
    @Override
    public Map<? extends String, ? extends Object> getDefaultConfiguration() {
        final Map<String,Object> result = new HashMap<String, Object>(super.getDefaultConfiguration());
        result.put(INCLUDE_ZERO_KEY,"false");
        result.put(NUMBER_BINS_KEY,DEFAULT_NUMBER_BINS + "");
        result.put(SHOW_ITEM_VALUES_KEY,"false");
        result.put(BAR_MARGIN_KEY,"false");
        result.put(ABSOLUTE_FREQUENCY_KEY,"false");
        result.put(UNIT_KEY,NO_UNIT);
        return result;
    }

    @Override
    public void propertyChanged(final String key, final Object oldValue, final Object newValue) {
        super.propertyChanged(key, oldValue, newValue);
        if (NUMBER_BINS_KEY.equals(key)) {
            numberOfBins = Integer.parseInt(newValue.toString());
        } else if (INCLUDE_ZERO_KEY.equals(key)) {
            includeZero = "true".equals(newValue);
        } else if (SHOW_ITEM_VALUES_KEY.equals(key)) {
            showItemValues = "true".equals(newValue);
        } else if (BAR_MARGIN_KEY.equals(key)) {
            barMargin = Double.parseDouble(newValue.toString());
        } else if (UNIT_KEY.equals(key)) {
            parseJScienceUnit((String)newValue);
        } else if (ABSOLUTE_FREQUENCY_KEY.equals(key)) {
            absoluteFrequency = "true".equals(newValue);
        }
    }
}
