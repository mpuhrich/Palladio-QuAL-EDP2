package org.palladiosimulator.edp2.batchexport;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import javax.measure.Measure;
import javax.measure.quantity.Duration;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.emf.common.util.URI;
import org.palladiosimulator.edp2.dao.BinaryMeasurementsDao;
import org.palladiosimulator.edp2.dao.MeasurementsDao;
import org.palladiosimulator.edp2.models.ExperimentData.DataSeries;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentGroup;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentRun;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentSetting;
import org.palladiosimulator.edp2.models.ExperimentData.Measurement;
import org.palladiosimulator.edp2.models.Repository.Repository;
import org.palladiosimulator.edp2.util.MeasurementsUtility;
import org.palladiosimulator.edp2.util.MetricDescriptionUtility;
import org.palladiosimulator.metricspec.BaseMetricDescription;
import org.palladiosimulator.metricspec.constants.MetricDescriptionConstants;

/**
 * Utility class for batch exporting EDP2 repositories.
 * 
 * @author stier
 *
 */
public class BatchExporter {

    private static final char COMMA = ',';
    private static final String NEW_LINE = "\n";

    /**
     * Exports an EDP2 repository to a target directory. Directory must be an absolute file system
     * path.
     * 
     * @param repo
     *            The exported repository.
     * @param targetDirectory
     *            The target directory.
     */
    public static void batchExport(final Repository repo, final URI targetDirectory) {
        for (ExperimentGroup group : repo.getExperimentGroups()) {
            final URI groupDirectory = targetDirectory.appendSegment(
            		removeIllegalChars(group.getPurpose() + " " + group.getId()));
            for (ExperimentSetting setting : group.getExperimentSettings()) {
                final URI settingDirectory = groupDirectory.appendSegment(removeIllegalChars(setting.getDescription() + setting.getId()));
                for (ExperimentRun run : setting.getExperimentRuns()) {
                    final URI runDirectory = settingDirectory.appendSegment(removeIllegalChars(run.getStartTime().toString() + " " + run.getId()));
                    for (Measurement measurement : run.getMeasurement()) {
                        measurementToCsv(runDirectory, measurement);
                    }
                }
            }
        }
    }

    /**
     * Writes a measurement to a CSV file.
     * 
     * @param directory
     *            Parent directory where file is created.
     * @param measurement
     *            The measurement written to CSV.
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    private static void measurementToCsv(final URI directory, Measurement measurement) {
        final BaseMetricDescription[] mds = MetricDescriptionUtility
                .toBaseMetricDescriptions(measurement.getMeasuringType().getMetric());
        int timeIdx = 0;
        boolean timeFound = false;
        while (!timeFound && timeIdx < mds.length) {
            if (mds[timeIdx].getId().equals(MetricDescriptionConstants.POINT_IN_TIME_METRIC.getId())) {
                timeFound = true;
            } else {
                timeIdx++;
            }
        }
        BaseMetricDescription tmp = mds[mds.length - 1];
        mds[mds.length - 1] = MetricDescriptionConstants.POINT_IN_TIME_METRIC;
        mds[timeIdx] = tmp;
        List<DataSeries> dataSeriesList = measurement.getMeasurementRanges().get(0).getRawMeasurements()
                .getDataSeries();
        dataSeriesList = new ArrayList<DataSeries>(dataSeriesList);
        dataSeriesList.add(dataSeriesList.remove(timeIdx));
        try {
        	var fileUri = directory.appendSegment(removeIllegalChars(measurement.getMeasuringType().getMeasuringPoint().getStringRepresentation()
                            + " " + measurement.getMeasuringType().getMetric().getName())).appendFileExtension("csv");
            var file = urlToFile(FileLocator.toFileURL(new URL(fileUri.toString())));
            file.getParentFile().mkdirs();
            FileWriter writer = new FileWriter(file);
            String cols = "";
            List<BaseMetricDescription> metricsList = Arrays.asList(mds);
            Iterator<BaseMetricDescription> metricsIt = metricsList.iterator();

            List<MeasurementsDao> daos = new ArrayList<MeasurementsDao>();
            for (DataSeries series : dataSeriesList) {
                daos.add(MeasurementsUtility.getMeasurementsDao(series));
            }

            for (MeasurementsDao<?, ?> curDao : daos) {
                BaseMetricDescription curMetricDesc = metricsIt.next();
                cols = curMetricDesc.getName() + "[" + ((BinaryMeasurementsDao<?, ?>) curDao).getUnit().toString() + "]"
                        + COMMA + cols;
            }
            cols = cols.substring(0, cols.length() - 1) + NEW_LINE;
            writer.append(cols);
            final long numberOfMsmnts = MeasurementsUtility.<Duration> getMeasurementsDao(dataSeriesList.get(0))
                    .getMeasurements().size();

            List<Iterator<Measure>> measureIts = new ArrayList<Iterator<Measure>>();
            for (MeasurementsDao dao : daos) {
                measureIts.add(dao.getMeasurements().iterator());
            }

            for (int pos = 0; pos < numberOfMsmnts; pos++) {
                String line = "";
                for (Iterator<Measure> measureIt : measureIts) {
                    Measure<?, ?> cur = measureIt.next();
                    line = cur.getValue().toString() + COMMA + line;
                }
                line = line.substring(0, line.length() - 1);
                writer.append(line + NEW_LINE);
            }
            writer.flush();
            writer.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * Removes all illegal chars from String.
     * @param input The input string.
     * @return Cleaned up string.
     */
    private static String removeIllegalChars(String input) {
        return input.replaceAll("[^a-zA-Z0-9\\._]+", "_");
    }
    
    private static File urlToFile(URL url) {
        File file = null;
        try {
          file = new File(url.toURI());
        } catch(URISyntaxException e) {
          file = new File(url.getPath());
        }
        return file;
    } 
}
