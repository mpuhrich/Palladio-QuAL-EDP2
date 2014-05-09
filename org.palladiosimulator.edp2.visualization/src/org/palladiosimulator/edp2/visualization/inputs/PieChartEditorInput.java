//package org.palladiosimulator.edp2.visualization.inputs;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//
//import javax.measure.Measure;
//
//import org.apache.commons.collections15.Bag;
//import org.apache.commons.collections15.bag.HashBag;
//import org.eclipse.ui.IMemento;
//import org.jfree.chart.JFreeChart;
//import org.jfree.chart.plot.PiePlot;
//import org.jfree.data.general.DefaultPieDataset;
//import org.palladiosimulator.edp2.MeasurementsDao;
//import org.palladiosimulator.edp2.datastream.AbstractDataSource;
//import org.palladiosimulator.edp2.datastream.IDataSink;
//import org.palladiosimulator.edp2.impl.MeasurementsUtility;
//import org.palladiosimulator.edp2.models.ExperimentData.DataSeries;
//import org.palladiosimulator.edp2.visualization.datasource.ElementFactory;
//import org.palladiosimulator.edp2.visualization.editors.JFreeChartVisualisationSingleDatastreamInput;
//import org.palladiosimulator.metricspec.MetricDescription;
//
//public class PieChartEditorInput extends JFreeChartVisualisationSingleDatastreamInput<DefaultPieDataset> {
//
//    /**
//     * Name constant, which is used to identify this class in properties and persistence.
//     */
//
//    private final static Logger logger = Logger.getLogger(PieChartEditorInput.class.getCanonicalName());
//
//    private static final String ELEMENT_NAME = "PieChartEditorInput";
//
//    /**
//     * Keys for persistence of properties.
//     */
//    public final static String SHOW_RELATIVE_AMOUNT_KEY = "showRelativeAmount";
//    public final static String SHOW_ABSOLUTE_AMOUNT_KEY = "showAbsoluteAmount";
//
//    private boolean showRelativeAmount;
//    private boolean showAbsoluteAmount;
//
//    public PieChartEditorInput() {
//        this(null);
//    }
//
//    public PieChartEditorInput(final AbstractDataSource source) {
//        super();
//        setShowAbsoluteAmount(false);
//        setShowRelativeAmount(true);
//    }
//
//    /*
//     * (non-Javadoc)
//     *
//     * @see org.palladiosimulator.edp2.visualization.IDataSink#getMetricRoles()
//     */
//    @Override
//    public ArrayList<MetricDescription> getMetricRoles() {
//        throw new RuntimeException("Not implemented!");
//    }
//
//    /*
//     * (non-Javadoc)
//     *
//     * @see org.palladiosimulator.edp2.visualization.IDataSink#canAccept(org.palladiosimulator.edp2.
//     * visualization.AbstractDataSource)
//     */
//    @Override
//    public boolean canAccept(final AbstractDataSource source) {
//        throw new RuntimeException("Not implemented!");
//    }
//
//    /*
//     * (non-Javadoc)
//     *
//     * @see
//     * org.palladiosimulator.edp2.visualization.IDataSink#createCopyForSource(org.palladiosimulator
//     * .edp2.visualization.AbstractDataSource)
//     */
//    @Override
//    public IDataSink createCopyForSource(final AbstractDataSource source) {
//        final PieChartEditorInput copy = new PieChartEditorInput(source);
//        return copy;
//    }
//
//    /*
//     * (non-Javadoc)
//     *
//     * @see org.palladiosimulator.edp2.visualization.IDataFlow#getProperties()
//     */
//    @Override
//    public HashMap<String, Object> getProperties() {
//        properties.put(ElementFactory.ELEMENT_KEY, ELEMENT_NAME);
//        properties.put(SHOW_RELATIVE_AMOUNT_KEY, isShowRelativeAmount());
//        properties.put(SHOW_ABSOLUTE_AMOUNT_KEY, isShowAbsoluteAmount());
//        properties.put(COLOR_KEY, getColor());
//        return properties;
//    }
//
//    /*
//     * (non-Javadoc)
//     *
//     * @see org.palladiosimulator.edp2.visualization.IDataFlow#setProperties(java.util.HashMap)
//     */
//    @Override
//    public void setProperties(final HashMap<String, Object> newProperties) {
//        if (newProperties.get(SHOW_RELATIVE_AMOUNT_KEY) != null) {
//            setShowRelativeAmount(Boolean.parseBoolean((newProperties.get(SHOW_RELATIVE_AMOUNT_KEY).toString())));
//        }
//        if (newProperties.get(SHOW_ABSOLUTE_AMOUNT_KEY) != null) {
//            setShowAbsoluteAmount(Boolean.parseBoolean((newProperties.get(SHOW_ABSOLUTE_AMOUNT_KEY).toString())));
//        }
//        if (newProperties.get(COLOR_KEY) != null) {
//            setColor(newProperties.get(COLOR_KEY).toString());
//        }
//    }
//
//    /*
//     * (non-Javadoc)
//     *
//     * @see org.palladiosimulator.edp2.visualization.IDataFlow#getName()
//     */
//    @Override
//    public String getName() {
//        return ELEMENT_NAME;
//    }
//
//    /*
//     * (non-Javadoc)
//     *
//     * @see org.eclipse.ui.IPersistableElement#getFactoryId()
//     */
//    @Override
//    public String getFactoryId() {
//        // not used
//        return null;
//    }
//
//    /*
//     * (non-Javadoc)
//     *
//     * @see org.eclipse.ui.IPersistable#saveState(org.eclipse.ui.IMemento)
//     */
//    @Override
//    public void saveState(final IMemento memento) {
//        PieChartEditorInputFactory.saveState(memento, this);
//    }
//
//    /*
//     * (non-Javadoc)
//     *
//     * @see org.palladiosimulator.edp2.visualization.editors.JFreeChartEditorInput#getChart()
//     */
//    @Override
//    public JFreeChart getChart() {
//        final PiePlot plot = new PiePlot(getDataset());
//        plot.setNoDataMessage("No data available.");
//        final JFreeChart chart = new JFreeChart(getHandle().isShowTitle() ? getHandle().getTitle() : null,
//                JFreeChart.DEFAULT_TITLE_FONT, plot, getHandle().isShowLegend());
//        return chart;
//    }
//
//    /*
//     * (non-Javadoc)
//     *
//     * @see org.palladiosimulator.edp2.visualization.editors.JFreeChartEditorInput#getDefaultTitle()
//     */
//    @Override
//    public String getDefaultTitle() {
//        return "Pie Chart";
//    }
//
//    /*
//     * (non-Javadoc)
//     *
//     * @see org.palladiosimulator.edp2.visualization.IVisualizationInput#getData()
//     */
//    @Override
//    public HashMap<Double, Integer> getData() {
//        return null;
//    }
//
//    /*
//     * (non-Javadoc)
//     *
//     * @see org.palladiosimulator.edp2.visualization.IVisualizationInput#updateInputData()
//     */
//    @Override
//    public void updateInputData() {
//        logger.log(Level.INFO, "Transformation : BEGIN");
//        dataset = new DefaultPieDataset();
//        final DataSeries series = getSource().getOutput().get(0);
//        final MeasurementsDao dao = MeasurementsUtility.getMeasurementsDao(series);
//        final List<Measure> dataList = dao.getMeasurements();
//        final Bag<Comparable> bins = new HashBag<Comparable>();
//
//        for (final Measure m : dataList) {
//            bins.add((Comparable) m.getValue());
//        }
//
//        //data = new HashMap<Double, Integer>();
//        for (final Comparable<?> o : bins) {
//            dataset.setValue(o, bins.getCount(o));
//        }
//
//        // logger.log(Level.INFO, data.toString());
//
//        setChanged();
//        notifyObservers();
//        logger.log(Level.INFO, "Transformation : END");
//
//    }
//
//    public boolean isShowRelativeAmount() {
//        return showRelativeAmount;
//    }
//
//    public void setShowRelativeAmount(final boolean showRelativeAmount) {
//        this.showRelativeAmount = showRelativeAmount;
//    }
//
//    public boolean isShowAbsoluteAmount() {
//        return showAbsoluteAmount;
//    }
//
//    public void setShowAbsoluteAmount(final boolean showAbsoluteAmount) {
//        this.showAbsoluteAmount = showAbsoluteAmount;
//    }
//
//    /*
//     * (non-Javadoc)
//     *
//     * @see org.palladiosimulator.edp2.visualization.IVisualizationInput#supportsMultipleInputs()
//     */
//    @Override
//    public boolean supportsMultipleInputs() {
//        return false;
//    }
//
//}
