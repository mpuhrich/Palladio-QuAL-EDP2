package org.palladiosimulator.edp2.visualization.editors;

import java.util.Map;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.ui.IElementFactory;
import org.eclipse.ui.IMemento;
import org.palladiosimulator.edp2.datastream.IDataSink;
import org.palladiosimulator.edp2.visualization.datasource.ElementFactory;

/**
 * Factory class for {@link JFreeChartVisualizationInput}. Invokes persistence of
 * all {@link IDataSink} elements managed by this handle.
 * 
 * @author Dominik Ernst
 * 
 */
public abstract class JFreeChartVisualisationInputFactory
extends ElementFactory implements IElementFactory
{
    /**
     * The factory's ID. Must match the ID specified in the extension point
     * "org.eclipse.ui.elementFactories".
     */
    private static final String FACTORY_ID = "org.palladiosimulator.edp2.visualization.JFreeChartEditorInputHandleFactory";

    /**
     * The attribute under which this input's child inputs names are stored.
     */
    protected final static String INPUT_NAME_KEY = "inputName";

    /**
     * The attribute under which the different inputs names are stored.
     */
    protected final static String INPUT_ELEMENT_KEY = "InputElement";

    /**
     * The handle's name as a persisted element in the XML.
     */
    protected final static String ELEMENT_NAME = "JFreeChartVisualisationInput";

    /**
     * Key for retrieving an element's name from its properties.
     */
    protected final static String ELEMENT_KEY = "elementName";

    /**
     * @return this factory's ID.
     */
    public static String getFactoryId() {
        return FACTORY_ID;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.eclipse.ui.IElementFactory#createElement(org.eclipse.ui.IMemento)
     */
    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Override
    public IAdaptable createElement(final IMemento memento) {
        final JFreeChartVisualizationInput visualisationInput = createElement();
        final IMemento childMemento = memento.getChild(ELEMENT_NAME);

        // first restore the inputs managed by this handle (required that way
        // because of default values!)
        final IMemento[] inputMementos = childMemento.getChildren(INPUT_ELEMENT_KEY);
        for (final IMemento subMemento : inputMementos) {
            final String elementName = subMemento.getString(INPUT_NAME_KEY);
            final IElementFactory inputFactory = null; //TODO FactoryConnector.instance.getAdapter(
            //elementName, IElementFactory.class);
            final JFreeChartVisualisationSingleDatastreamInput createdInput = (JFreeChartVisualisationSingleDatastreamInput) inputFactory
                    .createElement(subMemento);
            visualisationInput.addInput(createdInput);
        }

        // then restore the handle's properties
        final Map<String, Object> newProperties = getPropertiesFromMemento(
                childMemento,visualisationInput.getConfiguration().getKeys());
        visualisationInput.getConfiguration().setProperties(newProperties);
        return visualisationInput;
    }

    protected abstract JFreeChartVisualizationInput createElement();

    public static void saveState(final IMemento memento,
            final JFreeChartVisualizationInput inputHandle) {
        final Map<String, Object> props = inputHandle.getConfiguration().getProperties();
        memento.createChild(ELEMENT_NAME);
        final IMemento childIMemento = memento.getChild(ELEMENT_NAME);
        props.remove(ELEMENT_KEY);
        // save all properties
        for (final String key : props.keySet()) {
            childIMemento.putString(key, props.get(key).toString());
        }
        for (final JFreeChartVisualisationSingleDatastreamInput childInput : inputHandle.getInputs()) {
            final IMemento subMemento = childIMemento.createChild(INPUT_ELEMENT_KEY);
            subMemento.putString(INPUT_NAME_KEY, childInput.getClass().getCanonicalName());
            //TODO: input.saveState(subMemento);
        }
    }

}
