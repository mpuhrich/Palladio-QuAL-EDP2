package org.palladiosimulator.edp2.visualization.inputs.xyplots;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

import javax.measure.Measure;
import javax.measure.quantity.Duration;
import javax.measure.unit.SI;

import org.jfree.chart.ChartColor;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.AbstractRenderer;
import org.jfree.chart.renderer.xy.DefaultXYItemRenderer;
import org.jfree.data.xy.DefaultXYDataset;
import org.palladiosimulator.edp2.datastream.IDataSource;
import org.palladiosimulator.edp2.datastream.IDataStream;
import org.palladiosimulator.edp2.datastream.configurable.PropertyConfigurable;
import org.palladiosimulator.edp2.impl.MetricDescriptionUtility;
import org.palladiosimulator.edp2.visualization.editors.JFreeChartEditor;
import org.palladiosimulator.edp2.visualization.editors.JFreeChartVisualisationInput;
import org.palladiosimulator.edp2.visualization.editors.JFreeChartVisualisationSingleDatastreamConfiguration;
import org.palladiosimulator.edp2.visualization.editors.JFreeChartVisualisationSingleDatastreamInput;
import org.palladiosimulator.edp2.visualization.util.DefaultUnitSwitch;
import org.palladiosimulator.measurementspec.MeasurementTuple;
import org.palladiosimulator.metricspec.BaseMetricDescription;
import org.palladiosimulator.metricspec.CaptureType;
import org.palladiosimulator.metricspec.constants.MetricDescriptionConstants;

/**
 * Input for {@link JFreeChartEditor} .
 * 
 * @author Steffen Becker, Dominik Ernst, Roland Richter
 */
public class XYPlotVisualisationInput
extends JFreeChartVisualisationInput {

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

    /* (non-Javadoc)
     * @see org.palladiosimulator.edp2.visualization.AbstractVisualizationInput#firstChildInputAdded(org.palladiosimulator.edp2.visualization.AbstractVisualizationSingleDatastreamInput)
     */
    @Override
    protected void firstChildInputAdded(final JFreeChartVisualisationSingleDatastreamInput newChildInput) {
        super.firstChildInputAdded(newChildInput);
        final Map<String,Object> configuration = new HashMap<String,Object>(getConfiguration().getProperties());
        configuration.put(XYPlotVisualisationInputConfiguration.DOMAIN_AXIS_LABEL_KEY,getAxisLabel(0));
        configuration.put(XYPlotVisualisationInputConfiguration.RANGE_AXIS_LABEL_KEY,getAxisLabel(1));
        getConfiguration().setProperties(configuration);
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

        for (final JFreeChartVisualisationSingleDatastreamInput childInput : getInputs()) {
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

        final NumberAxis domainAxis = new NumberAxis(configuration.getDomainAxisLabel());
        final NumberAxis rangeAxis = new NumberAxis(configuration.getRangeAxisLabel());
        plot.setRangeAxis(rangeAxis);
        plot.setDomainAxis(domainAxis);

        plot.setDataset(dataset);

        final DefaultXYItemRenderer renderer = new DefaultXYItemRenderer();
        renderer.setDrawSeriesLineAsPath(false);
        plot.setRenderer(renderer);

        configureSeriesColors(renderer);
        return plot;
    }

    /**
     * @param renderer
     */
    private void configureSeriesColors(final AbstractRenderer renderer) {
        for (int i = 0; i < getInputs().size(); i++) {
            final JFreeChartVisualisationSingleDatastreamConfiguration config = getInputs().get(i).getConfiguration();
            final float alpha = config.getAlpha();
            if (config.getColor() != null && !config.getColor().equals(JFreeChartVisualisationSingleDatastreamConfiguration.NO_COLOR)){
                final Color opaque = Color.decode(config.getColor());
                final float[] comp = opaque.getRGBColorComponents(null);
                final Color col = new Color(comp[0], comp[1], comp[2], alpha);
                renderer.setSeriesPaint(i, col);
            } else {
                final Color defaultColor = (Color) ChartColor.createDefaultPaintArray()[i];
                final float[] comp = defaultColor.getRGBColorComponents(null);
                final Color col = new Color(comp[0], comp[1], comp[2], alpha);
                renderer.setSeriesPaint(i, col);
            }
        }
    }

    private double[][] getXYData(final IDataSource dataSource) {
        final IDataStream<MeasurementTuple> inputStream = dataSource.getDataStream();
        final double[][] result = new double[2][inputStream.size()];
        try {
            int i = 0;
            for (final MeasurementTuple tuple : inputStream) {
                final Measure<Double, Duration> pointInTime = tuple.getMeasureForMetric(MetricDescriptionConstants.POINT_IN_TIME_METRIC);
                result[0][i] = pointInTime.doubleValue(SI.SECOND);
                result[1][i] = (Double) tuple.asArray()[1].getValue();
                i++;
            }
        } finally {
            inputStream.close();
        }
        return result;
    }
}
