package org.palladiosimulator.edp2.visualization.util;

import java.util.ArrayList;
import java.util.List;

import javax.measure.Measure;
import javax.measure.quantity.Quantity;
import javax.measure.unit.Unit;

import org.apache.commons.math.stat.descriptive.DescriptiveStatistics;
import org.palladiosimulator.edp2.datastream.IDataSource;
import org.palladiosimulator.edp2.datastream.IDataStream;
import org.palladiosimulator.edp2.datastream.edp2source.Edp2DataTupleDataSource;
import org.palladiosimulator.edp2.models.ExperimentData.Measurement;
import org.palladiosimulator.edp2.models.ExperimentData.RawMeasurements;
import org.palladiosimulator.edp2.util.MetricDescriptionUtility;
import org.palladiosimulator.measurementframework.TupleMeasurement;
import org.palladiosimulator.metricspec.BaseMetricDescription;
import org.palladiosimulator.metricspec.MetricDescription;
import org.palladiosimulator.metricspec.MetricSetDescription;
import org.palladiosimulator.metricspec.NumericalBaseMetricDescription;
import org.palladiosimulator.metricspec.constants.MetricDescriptionConstants;

/**
 * Class handling the aggregation of data from several {@link Measurements} into a double[][] array.
 * Aggregation type is determined by the {@link DataAggregationModeTypes} type.
 * 
 * @author Andreas Flohre
 *
 */
public class SLODataAggregationMode {
    /**
     * Determines the time steps for aggregation, i.e. if TIMESTEP has value 10, data from 10
     * seconds is aggregated into one output value.
     */
    private double timestep = 10.;

    /**
     * The {@link DataAggregationModeTypes} type to be used for data aggregation.
     */
    private final DataAggregationModeTypes type;

    /**
     * Constructor.
     * 
     * @param type
     *            The {@link DataAggregationModeTypes} type to be used for aggregation of data.
     */
    public SLODataAggregationMode(DataAggregationModeTypes type) {
        this.type = type;
    }

    /**
     * Computes aggregated data from a list of {@link Measurements}. Aggregation type is determined
     * by the {@link DataAggregationModeTypes} type.
     * 
     * @param measurements
     *            The {@link Measurements} to aggregate.
     * @return a double[][] array containing the aggregated data.
     */
    public double[][] computeAggregateddata(List<Measurement> measurements) {
        int i;
        double time;
        int numberOfSteps;
        DescriptiveStatistics stats = new DescriptiveStatistics();
        // inputList for descriptiveStatistics
        List<Double> inputList = new ArrayList<Double>();
        // List with double[][] array containing the xy data from measurements
        List<double[][]> xyDataList = new ArrayList<double[][]>();
        for (Measurement currentMeasurement : measurements) {
            xyDataList.add(getXYData(returnDataTupleFromMeasurement(currentMeasurement)));
        }

        // List storing running indices
        List<Integer> indexList = new ArrayList<Integer>();
        for (int l = 0; l < xyDataList.size(); l++) {
            indexList.add(new Integer(0));
        }

        // TODO
        // compute max simulation time of xyArrays. Needs to be int because the
        // scales specifying time intervals (timestep) return int only. Maybe
        // find better solution than scales.
        int maxSimulationTime;
        for (double[][] currentXY : xyDataList) {
            inputList.add(currentXY[0][currentXY[0].length - 1]);
        }
        for (Double currentDouble : inputList) {
            stats.addValue(currentDouble);
        }
        maxSimulationTime = (int) stats.getMax();
        stats.clear();
        inputList.clear();
        // output data
        double[][] outputData = new double[2][(int) Math.ceil((maxSimulationTime / timestep))];

        switch (type) {
        case MAX:
            time = timestep;
            numberOfSteps = 0;
            // make sure running indices are set to zero
            for (Integer currentInt : indexList) {
                indexList.set(indexList.indexOf(currentInt), new Integer(0));
            }

            while (time <= maxSimulationTime) {
                for (double[][] currentXY : xyDataList) {
                    i = 0;
                    // add all entries between time-TIMESTEP and time to the
                    // stats inputArray, begin search at running index
                    while (currentXY[0][indexList.get(xyDataList.indexOf(currentXY)) + i] <= time) {
                        if (currentXY[0][indexList.get(xyDataList.indexOf(currentXY)) + i] > time - timestep) {
                            inputList.add(currentXY[1][indexList.get(xyDataList.indexOf(currentXY)) + i]);
                        }
                        i++;
                    }
                    Integer newIndex = indexList.get(xyDataList.indexOf(currentXY));
                    newIndex += i;
                    indexList.set(xyDataList.indexOf(currentXY), newIndex);
                }

                for (Double currentDouble : inputList) {
                    stats.addValue(currentDouble);
                }
                inputList.clear();
                outputData[0][numberOfSteps] = time;
                outputData[1][numberOfSteps] = stats.getMax();
                numberOfSteps++;
                stats.clear();
                if (time + timestep > maxSimulationTime && time != maxSimulationTime) {
                    time = maxSimulationTime;
                } else {
                    time += timestep;
                }
            }
            numberOfSteps = 0;
            time = timestep;
            break;
        case MIN:
            time = timestep;
            numberOfSteps = 0;
            // make sure running indices are set to zero
            for (Integer currentInt : indexList) {
                indexList.set(indexList.indexOf(currentInt), new Integer(0));
            }
            while (time <= maxSimulationTime) {
                for (double[][] currentXY : xyDataList) {
                    i = 0;
                    // add all entries between time-TIMESTEP and time to the
                    // stats inputArray, begin search at running index
                    while (currentXY[0][indexList.get(xyDataList.indexOf(currentXY)) + i] <= time) {
                        if (currentXY[0][indexList.get(xyDataList.indexOf(currentXY)) + i] > time - timestep) {
                            inputList.add(currentXY[1][indexList.get(xyDataList.indexOf(currentXY)) + i]);
                        }
                        i++;
                    }
                    Integer newIndex = indexList.get(xyDataList.indexOf(currentXY));
                    newIndex += i;
                    indexList.set(xyDataList.indexOf(currentXY), newIndex);
                }

                for (Double currentDouble : inputList) {
                    stats.addValue(currentDouble);
                }
                inputList.clear();
                outputData[0][numberOfSteps] = time;
                outputData[1][numberOfSteps] = stats.getMin();
                numberOfSteps++;
                stats.clear();
                if (time + timestep > maxSimulationTime && time != maxSimulationTime) {
                    time = maxSimulationTime;
                } else {
                    time += timestep;
                }
            }
            numberOfSteps = 0;
            time = timestep;
            break;
        case MEAN:
            time = timestep;
            numberOfSteps = 0;
            // make sure running indices are set to zero
            for (Integer currentInt : indexList) {
                indexList.set(indexList.indexOf(currentInt), new Integer(0));
            }
            while (time <= maxSimulationTime) {
                for (double[][] currentXY : xyDataList) {
                    i = 0;
                    // add all entries between time-TIMESTEP and time to the
                    // stats inputArray, begin search at running index
                    while ((indexList.get(xyDataList.indexOf(currentXY)) + i) < currentXY[0].length
                            && currentXY[0][indexList.get(xyDataList.indexOf(currentXY)) + i] <= time) {
                        if (currentXY[0][indexList.get(xyDataList.indexOf(currentXY)) + i] > time - timestep) {
                            inputList.add(currentXY[1][indexList.get(xyDataList.indexOf(currentXY)) + i]);
                        }
                        i++;
                    }
                    Integer newIndex = indexList.get(xyDataList.indexOf(currentXY));
                    newIndex += i;
                    indexList.set(xyDataList.indexOf(currentXY), newIndex);
                }

                for (Double currentDouble : inputList) {
                    stats.addValue(currentDouble);
                }
                inputList.clear();
                outputData[0][numberOfSteps] = time;
                outputData[1][numberOfSteps] = stats.getMean();
                numberOfSteps++;
                stats.clear();
                if (time + timestep > maxSimulationTime && time != maxSimulationTime) {
                    time = maxSimulationTime;
                } else {
                    time += timestep;
                }
            }
            numberOfSteps = 0;
            time = timestep;
            break;
        case MEDIAN:
            time = timestep;
            numberOfSteps = 0;
            // make sure running indices are set to zero
            for (Integer currentInt : indexList) {
                indexList.set(indexList.indexOf(currentInt), new Integer(0));
            }
            while (time <= maxSimulationTime) {
                for (double[][] currentXY : xyDataList) {
                    i = 0;
                    // add all entries between time-TIMESTEP and time to the
                    // stats inputArray, begin search at running index
                    while (currentXY[0][indexList.get(xyDataList.indexOf(currentXY)) + i] <= time) {
                        if (currentXY[0][indexList.get(xyDataList.indexOf(currentXY)) + i] > time - timestep) {
                            inputList.add(currentXY[1][indexList.get(xyDataList.indexOf(currentXY)) + i]);
                        }
                        i++;
                    }
                    Integer newIndex = indexList.get(xyDataList.indexOf(currentXY));
                    newIndex += i;
                    indexList.set(xyDataList.indexOf(currentXY), newIndex);
                }

                for (Double currentDouble : inputList) {
                    stats.addValue(currentDouble);
                }
                inputList.clear();
                outputData[0][numberOfSteps] = time;
                outputData[1][numberOfSteps] = stats.getPercentile(50);
                numberOfSteps++;
                stats.clear();
                if (time + timestep > maxSimulationTime && time != maxSimulationTime) {
                    time = maxSimulationTime;
                } else {
                    time += timestep;
                }
            }
            numberOfSteps = 0;
            time = timestep;
            break;
        }
        return outputData;
    }

    /**
     * Returns the data contained in a {@link IDataSource} as a double[][] array. Checks for
     * appropriate positioning of domain and range data. If the data is not two dimensional and has
     * a metric using integer or real values, a {@link IllegalArgumentException} is thrown.
     * 
     * @param dataSource
     *            The data.
     * @return a double[][] array containing the resulting data.
     */
    private double[][] getXYData(final IDataSource dataSource) {
        int xPos;
        int yPos;
        if (!canAccept(dataSource)) {
            throw new IllegalArgumentException("XYData has to be a two-dimensional metric set description.");
        }
        IDataStream<TupleMeasurement> inputStream = dataSource.getDataStream();
        List<MetricDescription> subsumedMetrics = ((MetricSetDescription) inputStream.getMetricDesciption())
                .getSubsumedMetrics();
        xPos = 0;
        // check position of domain data
        if (subsumedMetrics.get(1).getId().equals(MetricDescriptionConstants.POINT_IN_TIME_METRIC.getId())) {
            xPos = 1;
        }
        yPos = 1 - xPos;
        Unit<Quantity> domainUnit = ((NumericalBaseMetricDescription) subsumedMetrics.get(xPos)).getDefaultUnit();
        Unit<Quantity> rangeUnit = ((NumericalBaseMetricDescription) subsumedMetrics.get(yPos)).getDefaultUnit();
        try {
            double[][] result = new double[2][inputStream.size()];
            int i = 0;
            for (TupleMeasurement tuple : inputStream) {
                @SuppressWarnings("unchecked")
                Measure<?, Quantity>[] measurement = (Measure<?, Quantity>[]) tuple.asArray();
                result[0][i] = measurement[xPos].doubleValue(domainUnit); // x
                                                                          // (domain)
                result[1][i] = measurement[yPos].doubleValue(rangeUnit); // y
                                                                         // (range)
                i++;
            }
            return result;
        } finally {
            inputStream.close();
        }
    }

    /**
     * Returns the {@link RawMeasurements} from a measurement as a {@link IDataSource}.
     * 
     * @param source
     *            The measurement.
     * @return a {@link IDataSource}.
     */
    private IDataSource returnDataTupleFromMeasurement(Measurement source) {
        Measurement measurements = source;
        final RawMeasurements rawMeasurements = measurements.getMeasurementRanges().get(0).getRawMeasurements();
        if (rawMeasurements != null && !rawMeasurements.getDataSeries().isEmpty()) {
            final IDataSource edp2Source = new Edp2DataTupleDataSource(rawMeasurements);
            final int dataStreamSize = edp2Source.getDataStream().size();
            edp2Source.getDataStream().close();

            if (dataStreamSize > 0) {
                return edp2Source;
            }
        } else {
            throw new RuntimeException("Empty Measurements!");
        }
        return null;
    }

    /**
     * Method checking whether a source is a two dimensional data source with a metric using real or
     * integer values. If not, false is returned.
     *
     * @param source
     *            The source to check.
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
                              // can be computed
            }
        }
        return true;
    }

    public String getDescription() {
        return this.type.name();
    }

    public void setTimestep(double timestep) {
        this.timestep = timestep;
    }

}
