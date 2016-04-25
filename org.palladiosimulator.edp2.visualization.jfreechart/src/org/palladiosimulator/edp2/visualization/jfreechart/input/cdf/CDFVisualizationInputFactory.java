package org.palladiosimulator.edp2.visualization.jfreechart.input.cdf;

import org.eclipse.ui.IMemento;
import org.palladiosimulator.edp2.datastream.configurable.IPropertyConfigurable;
import org.palladiosimulator.edp2.visualization.jfreechart.input.JFreeChartVisualizationInputFactory;

/**
 * Factory for creating the visualization for Cumulative Distribution Functions (CDFs).
 * 
 * @author Sebastian Lehrig
 */
public class CDFVisualizationInputFactory extends JFreeChartVisualizationInputFactory {

    public static final String FACTORY_ID = CDFVisualizationInputFactory.class.getCanonicalName();

    @Override
    protected IPropertyConfigurable createElementInternal(final IMemento memento) {
        return new CDFVisualizationInput();
    }

}
