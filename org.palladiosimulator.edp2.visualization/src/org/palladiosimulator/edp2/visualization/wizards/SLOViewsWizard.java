package org.palladiosimulator.edp2.visualization.wizards;

import java.util.ArrayList;
import java.util.List;

import javax.measure.Measure;
import javax.measure.quantity.Quantity;
import javax.measure.unit.Unit;

import org.apache.commons.math.stat.descriptive.DescriptiveStatistics;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.palladiosimulator.edp2.datastream.IDataSource;
import org.palladiosimulator.edp2.datastream.IDataStream;
import org.palladiosimulator.edp2.datastream.chaindescription.ChainDescription;
import org.palladiosimulator.edp2.datastream.edp2source.Edp2DataTupleDataSource;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentRun;
import org.palladiosimulator.edp2.models.ExperimentData.Measurement;
import org.palladiosimulator.edp2.models.ExperimentData.RawMeasurements;
import org.palladiosimulator.edp2.util.MetricDescriptionUtility;
import org.palladiosimulator.measurementframework.TupleMeasurement;
import org.palladiosimulator.metricspec.BaseMetricDescription;
import org.palladiosimulator.metricspec.MetricDescription;
import org.palladiosimulator.metricspec.MetricSetDescription;
import org.palladiosimulator.metricspec.NumericalBaseMetricDescription;
import org.palladiosimulator.metricspec.constants.MetricDescriptionConstants;
import org.palladiosimulator.servicelevelobjective.ServiceLevelObjective;
import org.palladiosimulator.servicelevelobjective.ServiceLevelObjectiveRepository;

/**
 * A wizard which is opened upon double clicking an experiment run or a measurement.
 * 
 * If the wizard is started by double clicking a measurement, the user is prompted to select either
 * a visualization for the raw data or a corresponding service level objective (SLO) fulfillment
 * report visualization. If the user selects a SLO visualization, a repository containing available
 * SLO has to be imported and an SLO applicable to the metric description of the selected
 * measurements has to be chosen. Next the thresholds of the SLO need to be specified. Then the
 * chosen SLO fulfillment report is generated.
 * 
 * If the wizard is started by double clicking an experiment run, the user can select an arbitrary
 * number of measurements, though all selected measurements need to have the same metric type. Next
 * a repository containing available SLO has to be imported and an SLO applicable to the metric
 * description of the selected measurements has to be chosen. If more than one measurement was
 * selected, the user needs to specify how the data are to be aggregated. After the thresholds of
 * the selected SLO are set the user can chose between available SLO fulfillment report
 * visualizations. The chosen report is then generated.
 * 
 * @author Andreas Flohre
 *
 */
public class SLOViewsWizard extends Wizard implements INewWizard {

    /**
     * List holding all measuring points within the experiment run used to start the wizard.
     */
    private List<Measurement> measurementsList;

    /**
     * List holding all measuring points selected by the user on the
     * {@link SLODialogChooseMeasuringPointsPage}. If the user selected more than one measuring
     * point the aggregated data from the {@link SLODialogAggDataPage} will be stored in the
     * aggegatedData variable.
     */
    private List<Measurement> selectedMeasurements;

    /**
     * The {@link ServiceLevelObjective} selected by the user on the {@link SLODialogChooseSLOPage}.
     */
    private ServiceLevelObjective selectedSLO;

    /**
     * Variable indicating whether the wizard was started from a double click on an experiment run
     * or a double click on a measuring point.
     */
    private final boolean startedFromExperimentRun;

    /**
     * The Visualization selected on the {@link SLOSelectDefaultCombinationsPage}.
     */
    private ChainDescription selectedDefault;

    /**
     * List holding all {@link ServiceLevelObjective} objects contained in the selected
     * {@link ServiceLevelObjectiveRepository} applicable to the measurement(s) selected by the user
     * on the {@link SLODialogChooseMeasuringPointsPage}.
     */
    private List<ServiceLevelObjective> availableSLOs;

    /**
     * Value for time interval used to calculate relative service level objective fulfillment ratio
     * (qualitative visualization only).
     */
    private double selectedTimestepIntervalForVisualization = 10.;

    /**
     * Label for visualizations. Is only used for aggregated data from multiple measuring points.
     */
    private String measuringPointLabel = "";

    /**
     * Array holding the aggregated data from multiple measurements. Aggregation is selected by the
     * user on the {@link SLODialogAggDataPage}.
     */
    private double[][] aggregatedData;

    /**
     * Variable to indicate whether the user is allowed to finish the Wizard.
     */
    private boolean finishable;

    /**
     * The wizard´s pages.
     */
    SLODialogChooseMeasuringPointsPage chooseMeasuringPointsPage;
    SLODialogChooseSLOPage chooseSLOPage;
    SLODialogSpecifiySLOThresholdsPage specifySLOPage;
    SLOSelectDefaultCombinationsPage selectDefaultCombinationsPage_SLO;
    SLODialogAggDataPage aggDataPage;
    SLODialogChooseRepositoryPage chooseRepoPage;

    /**
     * Constructor. Used if the wizard is started from double clicking on an experiment run.
     * 
     * @param experimentRun
     *            The double clicked experiment run containing the measuring points.
     */
    public SLOViewsWizard(final ExperimentRun experimentRun) {
        this.measurementsList = experimentRun.getMeasurement();
        setWindowTitle("Service Level Objective Fulfillment Report Wizard");
        this.finishable = false;
        this.startedFromExperimentRun = true;
    }

    /**
     * Constructor. Used if the wizard is started from double clicking on a measurement.
     * 
     * @param source
     *            The measurement double clicked by the user.
     */
    public SLOViewsWizard(final Measurement source) {
        setWindowTitle("Service Level Objective Fulfillment Report Wizard");
        this.finishable = false;
        this.startedFromExperimentRun = false;
        this.selectedMeasurements = new ArrayList<Measurement>();
        this.selectedMeasurements.add(source);
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
     * Returns the {@link RawMeasurements} from the user selected measurements as a
     * {@link IDataSource}. The first element from the selectedMeasurements is used.
     * 
     * @return a {@link IDataSource}.
     */
    public IDataSource returnDataTupleFromMeasurement() {
        if (!this.selectedMeasurements.isEmpty()) {
            Measurement measurements = this.selectedMeasurements.get(0);
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
        }
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.IWorkbenchWizard#init(org.eclipse.ui.IWorkbench,
     * org.eclipse.jface.viewers.IStructuredSelection)
     */
    @Override
    public void init(final IWorkbench workbench, final IStructuredSelection selection) {
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jface.wizard.Wizard#performFinish()
     */
    @Override
    public boolean performFinish() {
        if (canFinish()) {
            return true;
        }
        return false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jface.wizard.Wizard#addPages()
     */
    @Override
    public void addPages() {
        chooseMeasuringPointsPage = new SLODialogChooseMeasuringPointsPage("choose measuring points", measurementsList);
        selectDefaultCombinationsPage_SLO = new SLOSelectDefaultCombinationsPage("Select a visualization");

        if (startedFromExperimentRun) {
            addPage(chooseMeasuringPointsPage);
            this.setForcePreviousAndNextButtons(true);
        } else {
            selectDefaultCombinationsPage_SLO = new SLOSelectDefaultCombinationsPage("Select a visualization",
                    returnDataTupleFromMeasurement(this.selectedMeasurements.get(0)));
            addPage(selectDefaultCombinationsPage_SLO);
            this.setForcePreviousAndNextButtons(true);
        }
        if (startedFromExperimentRun) {
            addPage(selectDefaultCombinationsPage_SLO);
        }
        chooseRepoPage = new SLODialogChooseRepositoryPage("choose repo");
        addPage(chooseRepoPage);
        chooseSLOPage = new SLODialogChooseSLOPage("choose SLO");
        addPage(chooseSLOPage);
        aggDataPage = new SLODialogAggDataPage("aggregate data");
        addPage(aggDataPage);
        specifySLOPage = new SLODialogSpecifiySLOThresholdsPage("specify");
        addPage(specifySLOPage);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jface.wizard.Wizard#getNextPage(org.eclipse.jface.wizard. IWizardPage)
     */

    @Override
    public IWizardPage getNextPage(IWizardPage currentPage) {
        // specifies the page ordering
        if (currentPage == chooseMeasuringPointsPage && selectedMeasurements != null) {
            chooseRepoPage.setSelectedMeasurements(selectedMeasurements);
            return chooseRepoPage;
        }

        if (currentPage == chooseRepoPage && availableSLOs != null) {
            chooseSLOPage.setAvailableSLOs(availableSLOs);
            return chooseSLOPage;
        }

        if (currentPage == chooseSLOPage && selectedSLO != null) {
            specifySLOPage.setSelectedSLO(selectedSLO);
            double maxSimTime;
            if (aggregatedData != null) {
                maxSimTime = aggregatedData[0][aggregatedData[0].length - 1];
            } else {
                maxSimTime = this.calculateMaxSimulationTime(selectedMeasurements);
            }
            specifySLOPage.setMaxSimulationTime(maxSimTime);
            return specifySLOPage;
        }

        if ((currentPage == specifySLOPage && this.startedFromExperimentRun && selectedMeasurements.size() == 1)
                || (currentPage == aggDataPage && aggregatedData != null)) {
            selectDefaultCombinationsPage_SLO.initializePage(
                    returnDataTupleFromMeasurement(this.selectedMeasurements.get(0)), true);
            return selectDefaultCombinationsPage_SLO;
        }

        if (currentPage == specifySLOPage && selectedMeasurements.size() > 1) {
            aggDataPage.setMeasurementsListAndLabel(selectedMeasurements);
            aggDataPage.setMaxSimulationTime(this.calculateMaxSimulationTime(selectedMeasurements));
            return aggDataPage;
        }

        if (currentPage == specifySLOPage && !this.startedFromExperimentRun) {
            this.setFinishable(true);
        }

        if (currentPage == selectDefaultCombinationsPage_SLO && selectedDefault.getChainID().contains("SLO")
                && !this.startedFromExperimentRun) {
            chooseRepoPage.setSelectedMeasurements(selectedMeasurements);
            return chooseRepoPage;
        }
        return null;
    }

    /**
     * Calculates maximum simulation time of a set of measurements.
     * 
     * @param measurements
     * @return
     */
    private double calculateMaxSimulationTime(List<Measurement> measurements) {
        List<double[][]> xyDataList = new ArrayList<double[][]>();
        DescriptiveStatistics stats = new DescriptiveStatistics();
        // inputList for descriptiveStatistics
        List<Double> inputList = new ArrayList<Double>();
        for (Measurement currentMeasurement : measurements) {
            xyDataList.add(getXYData(returnDataTupleFromMeasurement(currentMeasurement)));
        }
        Double maxSimulationTime;
        for (double[][] currentXY : xyDataList) {
            inputList.add(currentXY[0][currentXY[0].length - 1]);
        }
        for (Double currentDouble : inputList) {
            stats.addValue(currentDouble);
        }
        maxSimulationTime = stats.getMax();
        return maxSimulationTime;
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

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jface.wizard.Wizard#canFinish()
     */
    @Override
    public boolean canFinish() {
        return finishable;
    }

    public void setFinishable(boolean finishable) {
        this.finishable = finishable;
    }

    public List<Measurement> getSelectedMeasurements() {
        return selectedMeasurements;
    }

    public void setSelectedMeasurements(List<Measurement> selectedMeasurements) {
        if (selectedMeasurements == null) {
            selectedMeasurements = new ArrayList<Measurement>();
            this.selectedMeasurements = selectedMeasurements;
        } else {
            this.selectedMeasurements = selectedMeasurements;
        }
    }

    public ServiceLevelObjective getSelectedSLO() {
        return selectedSLO;
    }

    public void setSelectedSLO(ServiceLevelObjective selectedSLO) {
        this.selectedSLO = selectedSLO;
    }

    public ChainDescription getSelectedDefault() {
        return selectedDefault;
    }

    public void setSelectedDefault(ChainDescription selectedDefault) {
        this.selectedDefault = selectedDefault;
    }

    public List<ServiceLevelObjective> getAvailableSLOs() {
        return availableSLOs;
    }

    public void setAvailableSLOs(List<ServiceLevelObjective> availableSLOs) {
        this.availableSLOs = availableSLOs;
    }

    public void setAggregatedData(double[][] aggregatedData) {
        this.aggregatedData = aggregatedData;
    }

    public double[][] getAggregatedData() {
        if (this.aggregatedData != null) {
            return this.aggregatedData;
        }
        return null;
    }

    public boolean isStartedFromExperimentRun() {
        return startedFromExperimentRun;
    }

    public double getSelectedTimestepInterval() {
        return selectedTimestepIntervalForVisualization;
    }

    public void setSelectedTimestepInterval(double selectedTimestepInterval) {
        this.selectedTimestepIntervalForVisualization = selectedTimestepInterval;
    }

    public void setMeasuringPointLabel(String label) {
        this.measuringPointLabel = label;
    }

    public String getMeasuringPointLabel() {
        return this.measuringPointLabel;
    }

}
