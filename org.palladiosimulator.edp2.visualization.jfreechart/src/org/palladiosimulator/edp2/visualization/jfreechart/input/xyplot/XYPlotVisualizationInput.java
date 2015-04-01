package org.palladiosimulator.edp2.visualization.jfreechart.input.xyplot;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.measure.Measure;
import javax.measure.quantity.Quantity;
import javax.measure.unit.Unit;

import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
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
import org.palladiosimulator.metricspec.MetricDescription;
import org.palladiosimulator.metricspec.MetricSetDescription;
import org.palladiosimulator.metricspec.NumericalBaseMetricDescription;

/**
 * Input for {@link JFreeChartEditor} .
 *
 * @author Steffen Becker, Dominik Ernst, Roland Richter, Florian Rosenthal
 */
public class XYPlotVisualizationInput extends AbstractXYVisualizationInput {

    public XYPlotVisualizationInput() {
        super();
    }

    @Override
    public String getFactoryId() {
        return XYPlotVisualizationInputFactory.FACTORY_ID;
    }

    public boolean canAccept(IDataSource source) {
        BaseMetricDescription[] mds = MetricDescriptionUtility.toBaseMetricDescriptions(source.getMetricDesciption());
        if (mds.length != 2) {
            return false; // two-dimensional data needed
        }
        for (BaseMetricDescription md : mds) {
            if (!(md instanceof NumericalBaseMetricDescription)) {
                return false; // only metrics that use real or integer values
                              // can be plotted
            }
        }
        return true;
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
        DefaultXYDataset dataset = new DefaultXYDataset();

        int i = 1;
        for (JFreeChartVisualizationSingleDatastreamInput childInput : getInputs()) {
            dataset.addSeries(i + ": " + childInput.getInputName(), getXYData(childInput.getDataSource()));
            i++;
        }
        return dataset;
    }

    /**
     * @param configuration
     * @param dataset
     * @return
     */
    @Override
    protected Plot generatePlot(PropertyConfigurable config, AbstractDataset dataset) {
        XYPlotVisualizationInputConfiguration configuration = (XYPlotVisualizationInputConfiguration) config;
        XYPlot plot = new XYPlot();
        XYDataset xyDataset = (XYDataset) dataset;

        ValueAxis domainAxis = new NumberAxis(
                configuration.isShowDomainAxisLabel() ? configuration.getDomainAxisLabel() : null);
        ValueAxis rangeAxis = new NumberAxis(configuration.isShowRangeAxisLabel() ? configuration.getRangeAxisLabel()
                : null);

        plot.setRangeAxis(rangeAxis);
        plot.setDomainAxis(domainAxis);

        plot.setDataset(xyDataset);

        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        boolean isShowSeriesLine = configuration.isShowSeriesLine();
        boolean isShowSeriesShape = configuration.isShowSeriesShapes();

        for (int i = 0; i < xyDataset.getSeriesCount(); ++i) {
            renderer.setSeriesLinesVisible(i, isShowSeriesLine);
            renderer.setSeriesShapesVisible(i, isShowSeriesShape);
        }

        plot.setRenderer(renderer);

        configureSeriesColors(renderer);
        return plot;
    }

    private double[][] getXYData(final IDataSource dataSource) {
        if (!canAccept(dataSource)) {
            throw new IllegalArgumentException("XYData has to be a two-dimensional metric set description.");
        }

        IDataStream<TupleMeasurement> inputStream = dataSource.getDataStream();
        List<MetricDescription> subsumedMetrics = ((MetricSetDescription) inputStream.getMetricDesciption())
                .getSubsumedMetrics();
        Unit<Quantity> domainUnit = ((NumericalBaseMetricDescription) subsumedMetrics.get(getXPos())).getDefaultUnit();
        Unit<Quantity> rangeUnit = ((NumericalBaseMetricDescription) subsumedMetrics.get(getYPos())).getDefaultUnit();

        try {
            double[][] result = new double[2][inputStream.size()];
            int i = 0;
            for (TupleMeasurement tuple : inputStream) {

                @SuppressWarnings("unchecked")
                Measure<?, Quantity>[] measurement = (Measure<?, Quantity>[]) tuple.asArray();

                result[0][i] = measurement[getXPos()].doubleValue(domainUnit); // x
                                                                               // (domain)
                result[1][i] = measurement[getYPos()].doubleValue(rangeUnit); // y
                                                                              // (range)

                i++;
            }
            return result;
        } finally {
            inputStream.close();
        }
    }

    @Override
    protected Set<String> getPropertyKeysTriggeringUpdate() {
        return Collections.emptySet();
    }
}
