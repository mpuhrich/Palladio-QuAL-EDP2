package org.palladiosimulator.edp2.visualization.inputs.pie;

import org.eclipse.ui.IMemento;
import org.palladiosimulator.edp2.datastream.configurable.IPropertyConfigurable;
import org.palladiosimulator.edp2.visualization.elementfactories.JFreeChartVisualizationInputFactory;

public class PieChartVisualizationInputFactory extends JFreeChartVisualizationInputFactory {

    public static final String FACTORY_ID = PieChartVisualizationInputFactory.class.getCanonicalName();

    @Override
    protected IPropertyConfigurable createElementInternal(final IMemento memento) {
        return new PieChartVisualizationInput();
    }

}
