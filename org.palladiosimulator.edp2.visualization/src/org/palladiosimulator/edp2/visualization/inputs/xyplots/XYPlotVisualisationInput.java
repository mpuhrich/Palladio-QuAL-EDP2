package org.palladiosimulator.edp2.visualization.inputs.xyplots;

import java.awt.Color;

import org.jfree.chart.ChartColor;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.AbstractRenderer;
import org.jfree.chart.renderer.xy.DefaultXYItemRenderer;
import org.jfree.data.xy.DefaultXYDataset;
import org.palladiosimulator.edp2.datastream.IDataSource;
import org.palladiosimulator.edp2.datastream.configurable.PropertyConfigurable;
import org.palladiosimulator.edp2.impl.MetricDescriptionUtility;
import org.palladiosimulator.edp2.visualization.editors.JFreeChartEditor;
import org.palladiosimulator.edp2.visualization.editors.JFreeChartVisualisationInput;
import org.palladiosimulator.edp2.visualization.editors.JFreeChartVisualisationSingleDatastreamInput;
import org.palladiosimulator.edp2.visualization.util.DefaultUnitSwitch;
import org.palladiosimulator.metricspec.BaseMetricDescription;
import org.palladiosimulator.metricspec.CaptureType;

/**
 * Input for {@link JFreeChartEditor} .
 * 
 * @author Steffen Becker, Dominik Ernst, Roland Richter
 */
public class XYPlotVisualisationInput
extends JFreeChartVisualisationInput<DefaultXYDataset> {

    public XYPlotVisualisationInput() {
        super();
    }

    @Override
    public JFreeChart createChart() {
        final XYPlotVisualisationInputConfiguration configuration = getConfiguration();
        final XYPlot plot = generatePlot(configuration, generateDataset());

        return new JFreeChart(
                configuration.isShowTitle() ? configuration.getTitle() : "",
                        JFreeChart.DEFAULT_TITLE_FONT, plot, configuration.isShowLegend());
    }

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

    @Override
    protected PropertyConfigurable createConfiguration() {
        return new XYPlotVisualisationInputConfiguration();
    }

    private String getAxisLabel(final int pos) {
        final BaseMetricDescription metric = MetricDescriptionUtility
                .toBaseMetricDescriptions(getInputs().get(0).getDataSource().getMetricDesciption())[pos];
        return metric.getName() + " ["
        + new DefaultUnitSwitch(metric).doSwitch(metric) + "]";
    }

    /**
     * @return
     */
    private DefaultXYDataset generateDataset() {
        final DefaultXYDataset dataset = new DefaultXYDataset();

        for (final JFreeChartVisualisationSingleDatastreamInput<DefaultXYDataset> childInput : getInputs()) {
            dataset.addSeries(childInput.getInputName(),getXYData(childInput.getDataSource()));
        }
        return dataset;
    }

    /**
     * @param configuration
     * @param dataset
     * @return
     */
    private XYPlot generatePlot(final XYPlotVisualisationInputConfiguration configuration,
            final DefaultXYDataset dataset) {
        final XYPlot plot = new XYPlot();
        plot.setDataset(dataset);

        final DefaultXYItemRenderer renderer = new DefaultXYItemRenderer();
        renderer.setDrawSeriesLineAsPath(false);
        plot.setRenderer(renderer);

        final NumberAxis domainAxis = new NumberAxis(configuration.getDomainAxisLabel());
        final NumberAxis rangeAxis = new NumberAxis(configuration.getRangeAxisLabel());
        plot.setRangeAxis(rangeAxis);
        plot.setDomainAxis(domainAxis);

        configureSeriesColors(renderer);
        return plot;
    }

    /**
     * @param renderer
     */
    private void configureSeriesColors(final AbstractRenderer renderer) {
        for (int i = 0; i < getInputs().size(); i++) {
            final float alpha = 0.0f;
            //            final float alpha = Float.parseFloat(getHandle().getInputProperties()[i]
            //                    .get(JFreeChartVisualisationSingleDatastreamInput.ALPHA_KEY).toString());
            //            if ((getHandle().getInputProperties()[i]
            //                    .get(JFreeChartVisualisationSingleDatastreamInput.COLOR_KEY) != null)
            //                    && !getHandle().getInputProperties()[i]
            //                            .get(JFreeChartVisualisationSingleDatastreamInput.COLOR_KEY).toString()
            //                            .equals(NO_COLOR)) {
            //                final Color opaque = Color.decode(getHandle().getInputProperties()[i]
            //                        .get(JFreeChartVisualisationSingleDatastreamInput.COLOR_KEY).toString());
            //
            //                final float[] comp = opaque.getRGBColorComponents(null);
            //                final Color col = new Color(comp[0], comp[1], comp[2], alpha);
            //                renderer.setSeriesPaint(i, col);
            //            } else {
            final Color defaultColor = (Color) ChartColor
                    .createDefaultPaintArray()[i];
            final float[] comp = defaultColor.getRGBColorComponents(null);
            final Color col = new Color(comp[0], comp[1], comp[2], alpha);
            renderer.setSeriesPaint(i, col);
            //            }
        }
    }

    private double[][] getXYData(final IDataSource dataSource) {
        // TODO Auto-generated method stub
        return null;
    }
}
