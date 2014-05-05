/**
 * 
 */
package org.palladiosimulator.edp2.visualization.editors;

import java.util.Map;
import java.util.logging.Logger;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.ui.IElementFactory;
import org.eclipse.ui.IMemento;
import org.palladiosimulator.edp2.datastream.IDataSink;
import org.palladiosimulator.edp2.visualization.AbstractVisualizationInput;
import org.palladiosimulator.edp2.visualization.AbstractVisualizationSingleDatastreamInput;
import org.palladiosimulator.edp2.visualization.datasource.ElementFactory;

/**
 * Factory class for {@link JFreeChartVisualisationInput}. Invokes persistence of
 * all {@link IDataSink} elements managed by this handle.
 * 
 * @author Dominik Ernst
 * 
 */
public class JFreeChartEditorInputHandleFactory
extends ElementFactory
implements IElementFactory {

    /**
     * Logger for this class.
     */
    private static Logger logger = Logger.getLogger(JFreeChartEditorInputHandleFactory.class
            .getCanonicalName());
    /**
     * The factory's ID. Must match the ID specified in the extension point
     * "org.eclipse.ui.elementFactories".
     */
    private static final String FACTORY_ID = "org.palladiosimulator.edp2.visualization.JFreeChartEditorInputHandleFactory";
    /**
     * The attribute under which the different inputs names are stored.
     */
    protected final static String INPUT_NAME_KEY = "inputName";
    /**
     * The attribute under which the different inputs names are stored.
     */
    protected final static String INPUT_ELEMENT_KEY = "InputElement";
    /**
     * The handle's name as a persisted element in the XML.
     */
    protected final static String ELEMENT_NAME = "JFreeChartEditorInputHandle";
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
    @Override
    public IAdaptable createElement(IMemento memento) {
        final AbstractVisualizationInput<JFreeChartVisualisationSingleDatastreamInput<T>> handle = new JFreeChartVisualisationInput();
        memento = memento.getChild(ELEMENT_NAME);

        // first restore the inputs managed by this handle (required that way
        // because of default values!)
        final IMemento[] inputMementos = memento.getChildren(INPUT_ELEMENT_KEY);
        final boolean firstInput = true;
        for (final IMemento subMemento : inputMementos) {
            final String elementName = subMemento.getString(INPUT_NAME_KEY);
            final Object inputFactory = FactoryConnector.instance.getAdapter(
                    elementName, IElementFactory.class);
            final AbstractVisualizationSingleDatastreamInput createdInput = (AbstractVisualizationSingleDatastreamInput) ((IElementFactory) inputFactory)
                    .createElement(subMemento);
            handle.addInput(createdInput);
        }

        // then restore the handle's properties
        final Map<String, Object> oldProperties = handle.getProperties();
        final Map<String, Object> newProperties = getPropertiesFromMemento(memento, oldProperties.keySet());
        handle.setProperties(newProperties);
        return handle;
    }

    public static void saveState(IMemento memento,
            final AbstractVisualizationInput<JFreeChartVisualisationSingleDatastreamInput<T>> inputHandle) {
        // get name of element to be persisted from its properties
        final Map<String, Object> props = inputHandle.getProperties();
        // create a new node in the memento named after the element
        memento.createChild(ELEMENT_NAME);
        memento = memento.getChild(ELEMENT_NAME);
        props.remove(ELEMENT_KEY);
        // save all properties
        for (final String key : props.keySet()) {
            memento.putString(key, props.get(key).toString());
        }
        /*      TODO:  for (final IDataSink input : inputHandle.getInputs()) {
            final IMemento subMemento = memento.createChild(INPUT_ELEMENT_KEY);
            subMemento.putString(INPUT_NAME_KEY, input.getClass()
                    .getCanonicalName());
            input.saveState(subMemento);
        }*/
    }

}
