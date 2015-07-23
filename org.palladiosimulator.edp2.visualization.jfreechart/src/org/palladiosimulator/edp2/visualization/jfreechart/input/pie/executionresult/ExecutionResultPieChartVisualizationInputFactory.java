package org.palladiosimulator.edp2.visualization.jfreechart.input.pie.executionresult;

import org.eclipse.ui.IMemento;
import org.palladiosimulator.edp2.datastream.configurable.IPropertyConfigurable;
import org.palladiosimulator.edp2.visualization.jfreechart.input.JFreeChartVisualizationInputFactory;

public class ExecutionResultPieChartVisualizationInputFactory extends JFreeChartVisualizationInputFactory {

    public static final String FACTORY_ID = ExecutionResultPieChartVisualizationInputFactory.class.getCanonicalName();

    @Override
    protected IPropertyConfigurable createElementInternal(final IMemento memento) {
        return new ExecutionResultPieChartVisualizationInput();
    }

}
