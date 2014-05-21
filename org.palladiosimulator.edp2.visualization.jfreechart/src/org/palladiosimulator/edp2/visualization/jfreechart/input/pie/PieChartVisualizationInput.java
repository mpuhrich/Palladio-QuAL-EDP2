package org.palladiosimulator.edp2.visualization.jfreechart.input.pie;

import java.util.Collections;
import java.util.Set;

import org.apache.commons.collections15.Bag;
import org.apache.commons.collections15.bag.HashBag;
import org.eclipse.ui.IMemento;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.plot.Plot;
import org.jfree.data.general.AbstractDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.palladiosimulator.edp2.datastream.AbstractDataSource;
import org.palladiosimulator.edp2.datastream.IDataSource;
import org.palladiosimulator.edp2.datastream.IDataStream;
import org.palladiosimulator.edp2.datastream.configurable.PropertyConfigurable;
import org.palladiosimulator.edp2.visualization.jfreechart.input.JFreeChartVisualizationInput;
import org.palladiosimulator.measurementframework.TupleMeasurement;

public class PieChartVisualizationInput
extends JFreeChartVisualizationInput {


    public PieChartVisualizationInput() {
        this(null);
    }

    public PieChartVisualizationInput(final AbstractDataSource source) {
        super();
    }

    /*
     * (non-Javadoc)
     *
     * @see org.eclipse.ui.IPersistable#saveState(org.eclipse.ui.IMemento)
     */
    @Override
    public void saveState(final IMemento memento) {
        PieChartVisualizationInputFactory.saveState(memento, this);
    }

    /* (non-Javadoc)
     * @see org.eclipse.ui.IPersistableElement#getFactoryId()
     */
    @Override
    public String getFactoryId() {
        return PieChartVisualizationInputFactory.FACTORY_ID;
    }

    /* (non-Javadoc)
     * @see org.palladiosimulator.edp2.visualization.editors.JFreeChartVisualizationInput#generatePlot(org.palladiosimulator.edp2.datastream.configurable.PropertyConfigurable, org.jfree.data.general.AbstractDataset)
     */
    @Override
    protected Plot generatePlot(final PropertyConfigurable config, final AbstractDataset dataset) {
        final PieChartVisualizationConfiguration configuration = (PieChartVisualizationConfiguration) config;
        final PiePlot3D plot = new PiePlot3D((PieDataset) dataset);
        plot.setNoDataMessage("No data available.");
        plot.setIgnoreNullValues(true);
        plot.setLabelGenerator(new StandardPieSectionLabelGenerator(configuration.isShowRelativeAmount() ? "{0} ({2})" : "{0} ({1})"));

        return plot;
    }

    /* (non-Javadoc)
     * @see org.palladiosimulator.edp2.visualization.editors.JFreeChartVisualizationInput#generateDataset()
     */
    @Override
    protected AbstractDataset generateDataset() {
        final DefaultPieDataset dataset = new DefaultPieDataset();
        final Bag<Comparable<?>> bins = new HashBag<Comparable<?>>();
        final IDataSource datasource = getInputs().get(0).getDataSource();
        final IDataStream<TupleMeasurement> datastream = datasource.getDataStream();

        for (final TupleMeasurement tuple : datastream) {
            bins.add((Comparable<?>) tuple.asArray()[1].getValue());
        }

        for (final Comparable<?> o : bins) {
            dataset.setValue(o, bins.getCount(o));
        }

        return dataset;
    }

    /* (non-Javadoc)
     * @see org.palladiosimulator.edp2.visualization.AbstractInput#getPropertyKeysTriggeringUpdate()
     */
    @Override
    protected Set<String> getPropertyKeysTriggeringUpdate() {
        return Collections.emptySet();
    }

    /* (non-Javadoc)
     * @see org.palladiosimulator.edp2.visualization.editors.JFreeChartVisualizationInput#createConfiguration()
     */
    @Override
    protected PropertyConfigurable createConfiguration() {
        return new PieChartVisualizationConfiguration();
    }


}
