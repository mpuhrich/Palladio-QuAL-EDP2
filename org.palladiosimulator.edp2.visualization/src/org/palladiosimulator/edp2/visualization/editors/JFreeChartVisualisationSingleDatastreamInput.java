/**
 * 
 */
package org.palladiosimulator.edp2.visualization.editors;

import java.awt.Color;

import org.eclipse.jface.viewers.ISelection;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.Dataset;
import org.palladiosimulator.edp2.datastream.IDataSource;
import org.palladiosimulator.edp2.visualization.AbstractVisualizationSingleDatastreamInput;

/**
 * Basic implementation of an {@link AbstractVisualizationSingleDatastreamInput} for the
 * {@link JFreeChartEditor}. Responsible for common properties of any subclass
 * of {@link JFreeChartVisualisationSingleDatastreamInput}.
 * 
 * @author Dominik Ernst
 * 
 */
public abstract class JFreeChartVisualisationSingleDatastreamInput<T extends Dataset>
extends AbstractVisualizationSingleDatastreamInput
implements ISelection {

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
    private String hexColor;

    /**
     * The alpha value for this {@link JFreeChartVisualisationSingleDatastreamInput}'s color.
     */
    private float alpha;

    protected T dataset;

    public JFreeChartVisualisationSingleDatastreamInput() {
        this(null);
    }

    public JFreeChartVisualisationSingleDatastreamInput(final IDataSource source) {
        super(source);
        // set default values
        setColor(NO_COLOR);
        setAlpha(1.0f);
        // add to properties
        properties.put(COLOR_KEY, NO_COLOR);
        properties.put(ALPHA_KEY, getAlpha());
    }

    /**
     * Returns the JFreeChart, using the specific dataset, which is required by
     * the implementing class.
     * 
     * @return a newly created {@link JFreeChart}
     */
    public abstract JFreeChart getChart();

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jface.viewers.ISelection#isEmpty()
     */
    @Override
    public boolean isEmpty() {
        return this.getDataSource() != null;
    }

    /**
     * Generic method which returns a typed instance of the wrapper for datasets
     * used by JFreeCharts.
     * 
     * @param parentInput
     *            reference to the handle for all inputs
     * @return a typed Dataset
     */
    public T getDataset() {
        return dataset;
    }

    public String getColor() {
        return hexColor;
    }

    public void setColor(final String color) {
        final Color col = Color.decode(color);
        setColor(col);
    }

    public void setColor(final Color color) {
        this.hexColor = "#" + Integer.toHexString(color.getRGB()).substring(2);
    }

    /**
     * Method to return a default-title for the specific chart as provided by
     * sub-classes. Typically used during chart creation in {@link #getChart()}.
     * 
     * @return a {@link String} used as the default chart title.
     */
    public abstract String getDefaultTitle();

    public float getAlpha() {
        return alpha;
    }

    public void setAlpha(final float alpha) {
        if (alpha < 0) {
            this.alpha = 0.0f;
        } else if (alpha > 1) {
            this.alpha = 1.0f;
        } else {
            this.alpha = alpha;
        }
    }

}
