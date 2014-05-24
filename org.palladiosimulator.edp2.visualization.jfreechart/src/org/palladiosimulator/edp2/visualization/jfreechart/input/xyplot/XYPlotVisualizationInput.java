package org.palladiosimulator.edp2.visualization.jfreechart.input.xyplot;

import java.util.Collections;
import java.util.Set;

import javax.measure.Measure;
import javax.measure.quantity.Duration;
import javax.measure.unit.SI;

import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.DefaultXYItemRenderer;
import org.jfree.data.general.AbstractDataset;
import org.jfree.data.xy.DefaultXYDataset;
import org.jfree.data.xy.XYDataset;
import org.palladiosimulator.edp2.datastream.IDataSource;
import org.palladiosimulator.edp2.datastream.IDataStream;
import org.palladiosimulator.edp2.datastream.configurable.PropertyConfigurable;
import org.palladiosimulator.edp2.util.MetricDescriptionUtility;
import org.palladiosimulator.edp2.visualization.jfreechart.editor.JFreeChartEditor;
import org.palladiosimulator.edp2.visualization.jfreechart.input.AbstractXYVisualizationInput;
import org.palladiosimulator.edp2.visualization.jfreechart.input.JFreeChartVisualizationSingleDatastreamInput;
import org.palladiosimulator.measurementframework.TupleMeasurement;
import org.palladiosimulator.metricspec.BaseMetricDescription;
import org.palladiosimulator.metricspec.CaptureType;
import org.palladiosimulator.metricspec.constants.MetricDescriptionConstants;

/**
 * Input for {@link JFreeChartEditor} .
 * 
 * @author Steffen Becker, Dominik Ernst, Roland Richter
 */
public class XYPlotVisualizationInput
extends AbstractXYVisualizationInput {

    public XYPlotVisualizationInput() {
        super();
    }

    @Override
    public String getFactoryId() {
        return XYPlotVisualizationInputFactory.FACTORY_ID;
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
        return new XYPlotVisualizationInputConfiguration();
    }

    /**
     * @return
     */
    @Override
    protected AbstractDataset generateDataset() {
        final DefaultXYDataset dataset = new DefaultXYDataset();

        for (final JFreeChartVisualizationSingleDatastreamInput childInput : getInputs()) {
            dataset.addSeries(childInput.getInputName(),getXYData(childInput.getDataSource()));
        }
        return dataset;
    }

    /**
     * @param configuration
     * @param dataset
     * @return
     */
    @Override
    protected Plot generatePlot(final PropertyConfigurable config, final AbstractDataset dataset) {
        final XYPlotVisualizationInputConfiguration configuration = (XYPlotVisualizationInputConfiguration) config;
        final XYPlot plot = new XYPlot();

        final NumberAxis domainAxis = new NumberAxis(configuration.isShowDomainAxisLabel() ? configuration.getDomainAxisLabel() : null);
        final NumberAxis rangeAxis = new NumberAxis(configuration.isShowRangeAxisLabel() ? configuration.getRangeAxisLabel() : null);

        plot.setRangeAxis(rangeAxis);
        plot.setDomainAxis(domainAxis);

        plot.setDataset((XYDataset) dataset);

        final DefaultXYItemRenderer renderer = new DefaultXYItemRenderer();
        renderer.setDrawSeriesLineAsPath(false);
        renderer.setBaseLinesVisible(false);

        plot.setRenderer(renderer);

        configureSeriesColors(renderer);
        return plot;
    }

    private double[][] getXYData(final IDataSource dataSource) {
        final IDataStream<TupleMeasurement> inputStream = dataSource.getDataStream();
        final double[][] result = new double[2][inputStream.size()];
        try {
            int i = 0;
            for (final TupleMeasurement tuple : inputStream) {
                final Measure<Double, Duration> pointInTime = tuple.getMeasureForMetric(MetricDescriptionConstants.POINT_IN_TIME_METRIC);
                result[0][i] = pointInTime.doubleValue(SI.SECOND);
                if (tuple.asArray()[1].getValue() instanceof Double) {
                    result[1][i] = (Double) tuple.asArray()[1].getValue();
                } else if (tuple.asArray()[1].getValue() instanceof Long) {
                    result[1][i] = (Long) tuple.asArray()[1].getValue();
                }
                i++;
            }
        } finally {
            inputStream.close();
        }
        return result;
    }

    @Override
    protected Set<String> getPropertyKeysTriggeringUpdate() {
        return Collections.emptySet();
    }
}
