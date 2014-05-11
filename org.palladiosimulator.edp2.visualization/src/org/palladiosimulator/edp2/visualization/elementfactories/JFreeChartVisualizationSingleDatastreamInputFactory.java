package org.palladiosimulator.edp2.visualization.elementfactories;

import java.util.Arrays;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.IPersistableElement;
import org.palladiosimulator.edp2.datastream.IDataSource;
import org.palladiosimulator.edp2.datastream.configurable.IPropertyConfigurable;
import org.palladiosimulator.edp2.datastream.elementfactories.PropertyConfigurableElementFactory;
import org.palladiosimulator.edp2.visualization.AbstractVisualizationSingleDatastreamInput;
import org.palladiosimulator.edp2.visualization.editors.JFreeChartVisualizationSingleDatastreamInput;

public class JFreeChartVisualizationSingleDatastreamInputFactory extends PropertyConfigurableElementFactory {

    public static final String FACTORY_ID = JFreeChartVisualizationSingleDatastreamInputFactory.class.getCanonicalName();

    /* (non-Javadoc)
     * @see org.palladiosimulator.edp2.visualization.elementfactories.PropertyConfigurableElementFactory#createElement(org.eclipse.ui.IMemento)
     */
    @Override
    public IAdaptable createElement(final IMemento memento) {
        final IAdaptable result = super.createElement(memento);
        final AbstractVisualizationSingleDatastreamInput input = (AbstractVisualizationSingleDatastreamInput) result.getAdapter(AbstractVisualizationSingleDatastreamInput.class);
        final List<IPersistableElement> children = PropertyConfigurableElementFactory.loadChildren(memento);
        input.setDataSource((IDataSource)children.get(0));
        return result;
    }

    @Override
    protected IPropertyConfigurable createElementInternal(final IMemento memento) {
        return new JFreeChartVisualizationSingleDatastreamInput();
    }

    public static void saveState(final IMemento memento, final AbstractVisualizationSingleDatastreamInput childInput) {
        PropertyConfigurableElementFactory.saveConfigurationState(memento, childInput);
        PropertyConfigurableElementFactory.persistChildren(memento, Arrays.asList(childInput.getDataSource()));
    }

}
