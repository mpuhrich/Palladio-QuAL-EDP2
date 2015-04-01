package org.palladiosimulator.edp2.visualization.jfreechart.input.serviceLevelObjective;

import java.awt.BasicStroke;
import java.awt.Color;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.measure.Measure;
import javax.measure.quantity.Quantity;
import javax.measure.unit.Unit;

import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.DatasetRenderingOrder;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.general.AbstractDataset;
import org.jfree.data.xy.DefaultXYDataset;
import org.palladiosimulator.edp2.datastream.IDataSource;
import org.palladiosimulator.edp2.datastream.IDataStream;
import org.palladiosimulator.edp2.datastream.configurable.PropertyConfigurable;
import org.palladiosimulator.edp2.util.MetricDescriptionUtility;
import org.palladiosimulator.edp2.visualization.jfreechart.editor.JFreeChartEditor;
import org.palladiosimulator.edp2.visualization.jfreechart.input.AbstractXYVisualizationInput;
import org.palladiosimulator.edp2.visualization.jfreechart.input.JFreeChartVisualizationSingleDatastreamInput;
import org.palladiosimulator.edp2.visualization.wizards.SLODialogAggDataPage;
import org.palladiosimulator.measurementframework.TupleMeasurement;
import org.palladiosimulator.metricspec.BaseMetricDescription;
import org.palladiosimulator.metricspec.MetricDescription;
import org.palladiosimulator.metricspec.MetricSetDescription;
import org.palladiosimulator.metricspec.NumericalBaseMetricDescription;
import org.palladiosimulator.servicelevelobjective.LinearFuzzyThreshold;
import org.palladiosimulator.servicelevelobjective.ServiceLevelObjective;

/**
 * Input for {@link JFreeChartEditor}. Input has to be two dimensional, numerical data.
 * Additionally, an {@link ServiceLevelObjective} object has to be provided and optionally a
 * double[][] array containing aggregated data from a {@link SLODialogAggDataPage} can be added.
 * Data are presented quantitatively.
 * 
 * @author Andreas Flohre
 *
 */
public class SLOQuantitativePlotInput extends AbstractXYVisualizationInput {

    /**
     * An array containing aggregated data from several {@link Measurements}. Aggregation according
     * to {@link SLODataAggregationModus}.
     */
    private double[][] aggregatedData;

    /**
     * An {@link ServiceLevelObjective} object containing all relevant data, i.e. thresholds,
     * threshold units.
     */
    private ServiceLevelObjective slo;

    /**
     * Label for visualizations. Is only used for aggregated data from multiple measuring points.
     */
    private String measuringPointLabel;

    public SLOQuantitativePlotInput() {
        super();
    }

    @Override
    public String getFactoryId() {
        return SLOQuantitativePlotInputFactory.FACTORY_ID;
    }

    /**
     * Checks whether a {@link IDataSource} contains two dimensional data with a metric using real
     * or integer values.
     * 
     * @param source
     * @return
     */
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
        return new SLOQuantitativePlotInputConfiguration();
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
     * Generates a {@link XYPlot}. The plot shows the measurement data and lines for the respective
     * thresholds.
     * 
     * @param configuration
     *            Configuration for the plot, i.e. label visibility etc.
     * @param dataset
     *            Dataset to be used in the plot. However, if this SLOQuantitativePlotInput instance
     *            contains aggregated data, these are used for the plot.
     * @return the {@link XYPlot}
     */
    @Override
    @SuppressWarnings(value = { "unchecked" })
    protected Plot generatePlot(PropertyConfigurable config, AbstractDataset dataset) {
        // FIXME: hack to avoid redraw after new start of Eclipse instance, find
        // better solution
        if (this.slo == null) {
            return null;
        }
        DefaultXYDataset xyDataset = ((DefaultXYDataset) dataset);
        DefaultXYDataset thresholdDataset = new DefaultXYDataset();
        SLOQuantitativePlotInputConfiguration configuration = (SLOQuantitativePlotInputConfiguration) config;
        XYPlot plot = new XYPlot();

        ValueAxis domainAxis = new NumberAxis(
                configuration.isShowDomainAxisLabel() ? configuration.getDomainAxisLabel() : null);
        ValueAxis rangeAxis = new NumberAxis(configuration.isShowRangeAxisLabel() ? configuration.getRangeAxisLabel()
                : null);

        plot.setRangeAxis(rangeAxis);
        plot.setDomainAxis(domainAxis);

        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        renderer.setSeriesLinesVisible(0, configuration.isShowSeriesLine());
        renderer.setSeriesShapesVisible(0, configuration.isShowSeriesShapes());
        XYLineAndShapeRenderer thresholdDatasetRenderer = new XYLineAndShapeRenderer();
        thresholdDatasetRenderer.setSeriesPaint(0, Color.MAGENTA);
        thresholdDatasetRenderer.setSeriesStroke(0, new BasicStroke(4.f));
        thresholdDatasetRenderer.setSeriesPaint(1, Color.BLACK);
        thresholdDatasetRenderer.setSeriesStroke(1, new BasicStroke(4.f));

        double[][] upperThresholdData = new double[2][2];
        double[][] softUpperThresholdData = new double[2][2];
        double[][] lowerThresholdData = new double[2][2];
        double[][] softLowerThresholdData = new double[2][2];

        Unit<Quantity> unit = ((Unit<Quantity>) this.slo.getUpperThreshold().getThresholdLimit().getUnit());

        lowerThresholdData[0][0] = 0.;
        lowerThresholdData[0][1] = xyDataset.getXValue(0, xyDataset.getItemCount(0) - 1);
        lowerThresholdData[1][0] = ((Measure<?, Quantity>) this.slo.getLowerThreshold().getThresholdLimit())
                .doubleValue(unit);
        lowerThresholdData[1][1] = ((Measure<?, Quantity>) this.slo.getLowerThreshold().getThresholdLimit())
                .doubleValue(unit);

        upperThresholdData[0][0] = 0.;
        upperThresholdData[0][1] = xyDataset.getXValue(0, xyDataset.getItemCount(0) - 1);
        upperThresholdData[1][0] = ((Measure<?, Quantity>) this.slo.getUpperThreshold().getThresholdLimit())
                .doubleValue(unit);
        upperThresholdData[1][1] = ((Measure<?, Quantity>) this.slo.getUpperThreshold().getThresholdLimit())
                .doubleValue(unit);

        thresholdDataset.addSeries("Lower Threshold", lowerThresholdData);
        thresholdDataset.addSeries("Upper Threshold", upperThresholdData);

        if (this.slo.getLowerThreshold() instanceof LinearFuzzyThreshold) {
            softLowerThresholdData[0][0] = 0.;
            softLowerThresholdData[0][1] = xyDataset.getXValue(0, xyDataset.getItemCount(0) - 1);
            softLowerThresholdData[1][0] = ((Measure<?, Quantity>) ((LinearFuzzyThreshold) this.slo.getLowerThreshold())
                    .getSoftLimit()).doubleValue(unit);
            softLowerThresholdData[1][1] = ((Measure<?, Quantity>) ((LinearFuzzyThreshold) this.slo.getLowerThreshold())
                    .getSoftLimit()).doubleValue(unit);
            thresholdDataset.addSeries("Soft Lower Threshold", softLowerThresholdData);
            thresholdDatasetRenderer.setSeriesPaint(2, Color.MAGENTA);
        }

        if (this.slo.getUpperThreshold() instanceof LinearFuzzyThreshold) {
            softUpperThresholdData[0][0] = 0.;
            softUpperThresholdData[0][1] = xyDataset.getXValue(0, xyDataset.getItemCount(0) - 1);
            softUpperThresholdData[1][0] = ((Measure<?, Quantity>) ((LinearFuzzyThreshold) this.slo.getUpperThreshold())
                    .getSoftLimit()).doubleValue(unit);
            softUpperThresholdData[1][1] = ((Measure<?, Quantity>) ((LinearFuzzyThreshold) this.slo.getUpperThreshold())
                    .getSoftLimit()).doubleValue(unit);
            thresholdDataset.addSeries("Soft Upper Threshold", softUpperThresholdData);
            thresholdDatasetRenderer.setSeriesPaint(3, Color.BLACK);
        }

        // use aggregated data if possible
        if (aggregatedData != null) {
            DefaultXYDataset aggData = new DefaultXYDataset();
            aggData.addSeries("Service Level Objective \"" + this.slo.getName() + "\". " + "Measuring points: "
                    + measuringPointLabel, aggregatedData);
            plot.setDataset(0, aggData);
        } else {
            plot.setDataset(0, xyDataset);
        }

        plot.setDataset(1, thresholdDataset);

        plot.setRenderer(0, renderer);
        plot.setRenderer(1, thresholdDatasetRenderer);

        plot.setDatasetRenderingOrder(DatasetRenderingOrder.FORWARD);

        configureSeriesColors(renderer);
        return plot;
    }

    /**
     * Returns measurement data from an {@link IDataSource} as an double[][] array.
     * 
     * @param dataSource
     * @return
     */
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

    public void setAggregatedData(double[][] aggregatedData) {
        this.aggregatedData = aggregatedData;
    }

    public void setSlo(ServiceLevelObjective slo) {
        this.slo = slo;
    }

    public void setMeasuringPointLabel(String measuringPointLabel) {
        this.measuringPointLabel = measuringPointLabel;
    }

}
