package org.palladiosimulator.edp2.visualization.jfreechart.input.serviceLevelObjective;

import java.awt.BasicStroke;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.measure.Measure;
import javax.measure.quantity.Quantity;
import javax.measure.unit.Unit;

import org.apache.commons.math.stat.descriptive.DescriptiveStatistics;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
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
 * Data are presented qualitatively.
 * 
 * @author Andreas Flohre
 *
 */
public class SLOQualitativePlotInput extends AbstractXYVisualizationInput {

    /**
     * An array containing aggregated data from several {@link Measurements}. Aggregation according
     * to {@link SLODataAggregationModus}.
     */
    private double[][] aggregatedData;

    /**
     * An {@link ServiceLevelObjective} object containing thresholds, threshold units.
     */
    private ServiceLevelObjective slo;

    /**
     * Label for visualizations. Is only used for aggregated data from multiple measuring points.
     */
    private String measuringPointLabel;

    // set up range [seconds] for computing slo fulfillment ratio
    private double timestep = 10.;

    public SLOQualitativePlotInput() {
        super();
    }

    @Override
    public String getFactoryId() {
        return SLOQualitativePlotInputFactory.FACTORY_ID;
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
        return new SLOQualitativePlotInputConfiguration();
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
     * Computes percentage fulfillment of a given {@link ServiceLevelObjective} by a list of Double
     * inputs, i.e. checks whether an input value is within the thresholds given by the
     * {@link ServiceLevelObjective}. For each input, the fulfillment is computed and finally the
     * mean of all fulfillment ratios is returned.
     * 
     * @param input
     *            List of double input values.
     * @return the mean fulfillment ratio
     */
    @SuppressWarnings(value = { "unchecked" })
    private double computeFulfillmentRatio(List<Double> input) {
        double result;
        Double upperThreshold;
        Double softUpperThreshold = null;
        Double lowerThreshold;
        Double softLowerThreshold = null;
        Unit<Quantity> unit = ((Unit<Quantity>) this.slo.getUpperThreshold().getThresholdLimit().getUnit());
        // set thresholds
        if (this.slo.getUpperThreshold() instanceof LinearFuzzyThreshold) {
            upperThreshold = ((Measure<?, Quantity>) this.slo.getUpperThreshold().getThresholdLimit())
                    .doubleValue(unit);
            softUpperThreshold = ((Measure<?, Quantity>) ((LinearFuzzyThreshold) this.slo.getUpperThreshold())
                    .getSoftLimit()).doubleValue(unit);
        } else {
            upperThreshold = ((Measure<?, Quantity>) this.slo.getUpperThreshold().getThresholdLimit())
                    .doubleValue(unit);
        }

        if (this.slo.getLowerThreshold() instanceof LinearFuzzyThreshold) {
            lowerThreshold = ((Measure<?, Quantity>) this.slo.getLowerThreshold().getThresholdLimit())
                    .doubleValue(unit);
            softLowerThreshold = ((Measure<?, Quantity>) ((LinearFuzzyThreshold) this.slo.getLowerThreshold())
                    .getSoftLimit()).doubleValue(unit);
        } else {
            lowerThreshold = ((Measure<?, Quantity>) this.slo.getLowerThreshold().getThresholdLimit())
                    .doubleValue(unit);
        }

        // compute fulfillment ratios
        if (this.slo.getUpperThreshold() instanceof LinearFuzzyThreshold
                && this.slo.getLowerThreshold() instanceof LinearFuzzyThreshold) {
            result = this.computeData(upperThreshold, softUpperThreshold, lowerThreshold, softLowerThreshold, input);
        } else if (this.slo.getUpperThreshold() instanceof LinearFuzzyThreshold) {
            result = this.computeData(upperThreshold, softUpperThreshold, lowerThreshold, null, input);
        } else if (this.slo.getLowerThreshold() instanceof LinearFuzzyThreshold) {
            result = this.computeData(upperThreshold, null, lowerThreshold, softLowerThreshold, input);
        } else {
            result = this.computeData(upperThreshold, null, lowerThreshold, null, input);
        }
        return result;
    }

    private double computeData(Double upper, Double softupper, Double lower, Double softLower, List<Double> input) {
        double result;
        DescriptiveStatistics stats = new DescriptiveStatistics();
        List<Double> intermediateResults = new ArrayList<Double>();

        for (Double currentInput : input) {
            Double intermediateRatio = 1.;
            if (currentInput >= upper || currentInput <= lower) {
                intermediateRatio = 0.;
            } else if (softupper == null && softLower == null) {
                intermediateRatio = 1.;

            } else if (softupper != null && currentInput > softupper) {
                intermediateRatio = 1 - ((currentInput - softupper) / (upper - softupper));
            } else if (softLower != null && currentInput < softLower) {
                intermediateRatio = 1 - ((softLower - currentInput) / (softLower - lower));
            }
            intermediateResults.add(intermediateRatio);
        }

        for (Double currentDouble : intermediateResults) {
            stats.addValue(currentDouble);
        }
        result = stats.getMean();
        stats.clear();
        return result;
    }

    /**
     * Generates a {@link XYPlot}. The plot shows the mean fulfillment ratios in timestep intervals.
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
        // FIXME: used to avoid redraw after new start of Eclipse instance, find
        // better solution
        if (this.slo == null) {
            return null;
        }
        double[][] data;
        double time;
        int numberOfSteps;
        List<Double> inputList = new ArrayList<Double>();

        if (aggregatedData == null) {
            JFreeChartVisualizationSingleDatastreamInput childInput = this.getInputs().get(0);
            data = getXYData(childInput.getDataSource());
            measuringPointLabel = this.getInputs().get(0).getInputName();
        } else {
            data = this.aggregatedData;
        }

        // compute max simulation time of xyArrays
        int maxSimulationTime;
        maxSimulationTime = (int) data[0][data[0].length - 1];

        double[][] outputData = new double[2][(int) Math.ceil(maxSimulationTime / timestep)];

        time = timestep;
        numberOfSteps = 0;
        int index = 0;
        int i;

        while (time <= maxSimulationTime) {
            i = 0;
            // add all entries between time-TIMESTEP and time to the
            // stats inputArray, begin search at running index
            while ((index + i) < data[0].length && data[0][index + i] <= time) {
                if (data[0][index + i] > time - timestep) {
                    inputList.add(data[1][index + i]);
                }
                i++;
            }
            index += i;
            outputData[0][numberOfSteps] = time;
            outputData[1][numberOfSteps] = this.computeFulfillmentRatio(inputList);
            inputList.clear();
            numberOfSteps++;
            if (time + timestep > maxSimulationTime && time != maxSimulationTime) {
                time = maxSimulationTime;
            } else {
                time += timestep;
            }
        }

        // count NaN entries
        int counter = 0;
        for (int x = 0; x < outputData[0].length; x++) {
            if (Double.isNaN(outputData[1][x])) {
                counter++;
            }
        }

        // remove all NaN entries from outputData
        if (counter > 0) {
            counter = outputData[0].length - counter;
            double[][] resultData = new double[2][counter];
            int x = 0;
            for (int j = 0; j < outputData[0].length; j++) {
                if (!Double.isNaN(outputData[1][j])) {
                    resultData[0][x] = outputData[0][j];
                    resultData[1][x] = outputData[1][j];
                    x++;
                }
            }
            outputData = resultData;
        }

        SLOQualitativePlotInputConfiguration configuration = (SLOQualitativePlotInputConfiguration) config;
        XYPlot plot = new XYPlot();

        ValueAxis domainAxis = new NumberAxis(
                configuration.isShowDomainAxisLabel() ? configuration.getDomainAxisLabel() : null);
        ValueAxis rangeAxis = new NumberAxis("Service Level Objective Fulfillment Ratio");

        plot.setRangeAxis(rangeAxis);
        plot.setDomainAxis(domainAxis);
        DefaultXYDataset xyDataset = new DefaultXYDataset();
        Unit<Quantity> unit = ((Unit<Quantity>) this.slo.getUpperThreshold().getThresholdLimit().getUnit());
        // add label
        StringBuffer label = new StringBuffer();
        label.append("UT= "
                + ((Measure<?, Quantity>) this.slo.getUpperThreshold().getThresholdLimit()).doubleValue(unit) + "; ");
        if (this.slo.getUpperThreshold() instanceof LinearFuzzyThreshold) {
            label.append("SUT= "
                    + ((Measure<?, Quantity>) ((LinearFuzzyThreshold) this.slo.getUpperThreshold()).getSoftLimit())
                            .doubleValue(unit) + "; ");
        }
        label.append("LT= "
                + ((Measure<?, Quantity>) this.slo.getLowerThreshold().getThresholdLimit()).doubleValue(unit) + ";");
        if (this.slo.getLowerThreshold() instanceof LinearFuzzyThreshold) {
            label.append(" SLT= "
                    + ((Measure<?, Quantity>) ((LinearFuzzyThreshold) this.slo.getLowerThreshold()).getSoftLimit())
                            .doubleValue(unit) + ";");
        }

        xyDataset.addSeries("Service Level Objective \"" + this.slo.getName() + "\". " + label
                + ". Measuring point(s): " + measuringPointLabel, outputData);

        plot.setDataset(xyDataset);

        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        renderer.setSeriesLinesVisible(0, configuration.isShowSeriesLine());
        renderer.setSeriesShapesVisible(0, configuration.isShowSeriesShapes());
        renderer.setSeriesPaint(0, Color.BLACK);
        renderer.setSeriesStroke(0, new BasicStroke(4.f));
        plot.setRenderer(renderer);

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

    public void setTimestep(double timestep) {
        this.timestep = timestep;
    }

    public void setMeasuringPointLabel(String measuringPointLabel) {
        this.measuringPointLabel = measuringPointLabel;
    }
}
