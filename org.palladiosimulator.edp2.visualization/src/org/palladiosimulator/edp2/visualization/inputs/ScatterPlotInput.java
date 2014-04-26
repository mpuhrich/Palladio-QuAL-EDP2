/**
 * 
 */
package org.palladiosimulator.edp2.visualization.inputs;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.measure.Measure;

import org.eclipse.ui.IMemento;
import org.jfree.chart.ChartColor;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.DefaultXYItemRenderer;
import org.jfree.data.xy.DefaultXYDataset;
import org.palladiosimulator.edp2.datastream.IDataSource;
import org.palladiosimulator.edp2.impl.MetricDescriptionUtility;
import org.palladiosimulator.edp2.models.ExperimentData.BaseMetricDescription;
import org.palladiosimulator.edp2.models.ExperimentData.CaptureType;
import org.palladiosimulator.edp2.visualization.datasource.ElementFactory;
import org.palladiosimulator.edp2.visualization.editors.JFreeChartEditorInput;
import org.palladiosimulator.edp2.visualization.util.DefaultUnitSwitch;

/**
 * Input for {@link ScatterPlotEditor} .
 * 
 * @author Dominik Ernst, Roland Richter
 */
public class ScatterPlotInput extends JFreeChartEditorInput<DefaultXYDataset> {

    /**
     * Name constant, which is used to identify this class in properties.
     */
    private static final String ELEMENT_NAME = "ScatterPlotInput";
    public static final String DOMAIN_AXIS_LABEL_KEY = "domainAxisLabel";
    public static final String RANGE_AXIS_LABEL_KEY = "rangeAxisLabel";
    public static final String SHOW_RANGE_AXIS_LABEL_KEY = "showRangeAxisLabel";
    public static final String SHOW_DOMAIN_AXIS_LABEL_KEY = "showDomainAxisLabel";

    /**
     * Logger for this class.
     */
    private final static Logger logger = Logger
            .getLogger(ScatterPlotInput.class.getCanonicalName());

    /**
     * The data provided by this {@link JFreeChartEditorInput}
     */
    private double[][] rawData;

    /**
     * Label for the number axis (= horizontal axis)
     */
    private String domainAxisLabel;

    /**
     * Label for the range axis (= vertical axis)
     */
    private String rangeAxisLabel;

    /**
     * Show different labels?
     */
    private boolean showRangeAxisLabel;
    private boolean showDomainAxisLabel;

    private DefaultXYItemRenderer renderer;

    public ScatterPlotInput() {
        setShowDomainAxisLabel(true);
        setShowRangeAxisLabel(true);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.palladiosimulator.edp2.models.ExperimentData.presentation.IDataSink#canAccept
     * (org.palladiosimulator.edp2.models.ExperimentData.presentation.IDataSource)
     */
    public boolean canAccept(final IDataSource source) {
        final BaseMetricDescription[] mds = MetricDescriptionUtility
                .toBaseMetricDescriptions(source.getMetricDesciption());
        boolean allDataNumeric = true;
        for (final BaseMetricDescription md : mds) {
            if (!(md.getCaptureType().equals(CaptureType.INTEGER_NUMBER) || md
                    .getCaptureType().equals(CaptureType.REAL_NUMBER))) {
                allDataNumeric = false;
            }
        }
        return allDataNumeric && mds.length == 2;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.IPersistable#saveState(org.eclipse.ui.IMemento)
     */
    @Override
    public void saveState(final IMemento memento) {
        ScatterPlotInputFactory.saveState(memento, this);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.palladiosimulator.edp2.visualization.IDataFlow#getProperties()
     */
    @Override
    public Map<String, Object> getProperties() {
        properties.put(ElementFactory.ELEMENT_KEY, ELEMENT_NAME);
        properties.put(RANGE_AXIS_LABEL_KEY, getRangeAxisLabel());
        properties.put(DOMAIN_AXIS_LABEL_KEY, getDomainAxisLabel());
        properties.put(SHOW_DOMAIN_AXIS_LABEL_KEY,
                String.valueOf(isShowDomainAxisLabel()));
        properties.put(SHOW_RANGE_AXIS_LABEL_KEY,
                String.valueOf(isShowRangeAxisLabel()));
        properties.put(COLOR_KEY, getColor());
        return properties;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.palladiosimulator.edp2.visualization.IDataFlow#setProperties(java.util.HashMap
     * )
     */
    @Override
    public void setProperties(final HashMap<String, Object> newProperties) {
        if (newProperties.get(COLOR_KEY) != null) {
            setColor(newProperties.get(COLOR_KEY).toString());
        }
        if (newProperties.get(RANGE_AXIS_LABEL_KEY) != null) {
            setRangeAxisLabel(newProperties.get(RANGE_AXIS_LABEL_KEY)
                    .toString());
        }
        if (newProperties.get(DOMAIN_AXIS_LABEL_KEY) != null) {
            setDomainAxisLabel(newProperties.get(DOMAIN_AXIS_LABEL_KEY)
                    .toString());
        }
        if (newProperties.get(SHOW_DOMAIN_AXIS_LABEL_KEY) != null) {
            setShowDomainAxisLabel(Boolean.parseBoolean(newProperties.get(
                    SHOW_DOMAIN_AXIS_LABEL_KEY).toString()));
        }
        if (newProperties.get(SHOW_RANGE_AXIS_LABEL_KEY) != null) {
            setShowRangeAxisLabel(Boolean.parseBoolean(newProperties.get(
                    SHOW_RANGE_AXIS_LABEL_KEY).toString()));
        }
    }

    @Override
    public JFreeChart getChart() {
        final NumberAxis domainAxis = new NumberAxis(
                isShowDomainAxisLabel() ? getDomainAxisLabel() : null);
        final NumberAxis rangeAxis = new NumberAxis(
                isShowRangeAxisLabel() ? getRangeAxisLabel() : null);

        dataset = new DefaultXYDataset();
        // add all inputs anew
        // assume that if the getChart()-Method of this input is called, the
        // remaining inputs have the same type of data
        for (int i = 0; i < getHandle().getInputsSize(); i++) {
            dataset.addSeries(getHandle().getInputs().get(i).getInputName(),
                    (double[][]) getHandle().getInputs().get(i).getData());
        }
        final XYPlot plot = new XYPlot();
        plot.setDataset(getDataset());

        // the renderer for the chart
        renderer = new DefaultXYItemRenderer();
        plot.setRenderer(renderer);
        plot.setRangeAxis(rangeAxis);
        plot.setDomainAxis(domainAxis);

        // modifiy the colors of the data series, if there are persisted color
        // properties
        for (int i = 0; i < getHandle().getInputsSize(); i++) {
            final float alpha = Float.parseFloat(getHandle().getInputProperties()[i]
                    .get(JFreeChartEditorInput.ALPHA_KEY).toString());
            if ((getHandle().getInputProperties()[i]
                    .get(JFreeChartEditorInput.COLOR_KEY) != null)
                    && !getHandle().getInputProperties()[i]
                            .get(JFreeChartEditorInput.COLOR_KEY).toString()
                            .equals(NO_COLOR)) {
                final Color opaque = Color.decode(getHandle().getInputProperties()[i]
                        .get(JFreeChartEditorInput.COLOR_KEY).toString());

                final float[] comp = opaque.getRGBColorComponents(null);
                final Color col = new Color(comp[0], comp[1], comp[2], alpha);
                renderer.setSeriesPaint(i, col);
            } else {
                final Color defaultColor = (Color) ChartColor
                        .createDefaultPaintArray()[i];
                final float[] comp = defaultColor.getRGBColorComponents(null);
                final Color col = new Color(comp[0], comp[1], comp[2], alpha);
                renderer.setSeriesPaint(i, col);
            }
        }
        renderer.setDrawSeriesLineAsPath(false);

        // finally, create the chart using the plot
        final JFreeChart chart = new JFreeChart(
                getHandle().isShowTitle() ? getHandle().getTitle() : null,
                        JFreeChart.DEFAULT_TITLE_FONT, plot, getHandle().isShowLegend());

        return chart;
    }

    @Override
    public double[][] getData() {
        return rawData;
    }

    @Override
    public void updateInputData() {
        final DefaultXYDataset defaultDataset = new DefaultXYDataset();

        for (int i = 0; i < list1.size(); i++) {
            final Measure x = (Measure) list1.get(i);
            final Measure y = (Measure) list2.get(i);
            rawData[0][i] = x.doubleValue(x.getUnit());
            rawData[1][i] = y.doubleValue(y.getUnit());
        }

        defaultDataset.addSeries(getInputName(), rawData);

        logger.log(Level.INFO, "Editor input updateDataSet end");

    }

    public String getElementName() {
        return ELEMENT_NAME;
    }

    @Override
    public String getDefaultTitle() {
        return "Scatterplot";
    }

    public String getDefaultDomainAxisLabel() {
        final BaseMetricDescription metric = MetricDescriptionUtility
                .toBaseMetricDescriptions(getSource().getMetricDesciption())[0];
        return metric.getName() + " ["
        + new DefaultUnitSwitch(metric).doSwitch(metric) + "]";
    }

    public String getDefaultRangeAxisLabel() {
        final BaseMetricDescription metric = MetricDescriptionUtility
                .toBaseMetricDescriptions(getSource().getMetricDesciption())[1];
        return metric.getName() + " ["
        + new DefaultUnitSwitch(metric).doSwitch(metric) + "]";
    }

    public String getDomainAxisLabel() {
        if (domainAxisLabel == null) {
            return getDefaultDomainAxisLabel();
        }
        return domainAxisLabel;
    }

    public void setDomainAxisLabel(final String domainAxisLabel) {
        this.domainAxisLabel = domainAxisLabel;
    }

    public void setRangeAxisLabel(final String rangeAxisLabel) {
        this.rangeAxisLabel = rangeAxisLabel;
    }

    public String getRangeAxisLabel() {
        if (rangeAxisLabel == null) {
            return getDefaultRangeAxisLabel();
        }
        return rangeAxisLabel;
    }

    public boolean isShowRangeAxisLabel() {
        return showRangeAxisLabel;
    }

    public void setShowRangeAxisLabel(final boolean showRangeAxisLabel) {
        this.showRangeAxisLabel = showRangeAxisLabel;
    }

    public boolean isShowDomainAxisLabel() {
        return showDomainAxisLabel;
    }

    public void setShowDomainAxisLabel(final boolean showDomainAxisLabel) {
        this.showDomainAxisLabel = showDomainAxisLabel;
    }
}
