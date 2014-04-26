package org.palladiosimulator.edp2.visualization.datasource;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.ui.IElementFactory;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.IPersistableElement;

/**
 * A factory for persistence of {@link IDataFlow} elements.
 * 
 * @author Dominik Ernst
 * 
 */
public abstract class ElementFactory implements IElementFactory {

    /**
     * The name of the source element under which an elements' source is
     * persisted in an {@link IMemento}.
     */
    public final static String SOURCE_KEY = "source";
    /**
     * Key for retrieving an element's name from its properties.
     */
    public final static String ELEMENT_KEY = "elementName";
    /**
     * This factory's ID as it must be used when referenced in an extension.
     */
    private final static String FACTORY_ID = "org.palladiosimulator.edp2.visualization.datasource.ElementFactory";

    /**
     * @return this factory's ID.
     */
    public static String getFactoryId() {
        return FACTORY_ID;
    }

    /**
     * Method for persisting any kind of data-related elements, i.e.
     * implementations of {@link IDataFlow}.
     * 
     * @param memento
     *            Reference to the memento, passed as a parameter by the
     *            {@link IPersistableElement#saveState(IMemento)} method.
     * @param input
     *            Reference to the calling instance of {@link IDataFlow}.
     * 
     */
    public static void saveState(IMemento memento, final EDP2Source input) {
        // get name of element to be persisted from its properties
        final Map<String, Object> props = input.getProperties();
        final String elementName = input.getElementKey();
        // create a new node in the memento named after the element
        memento.createChild(elementName);
        memento = memento.getChild(elementName);

        for (final String key : props.keySet()) {
            memento.putString(key, props.get(key).toString());
        }
    }

    /**
     * Method used during restoration of persisted elements. It is the same for
     * all implementations of {@link IDataFlow}.
     * 
     * @param memento
     *            the {@link IMemento} from which the properties are read
     * @param propertiesToOverride
     *            the properties in which the values are to be replaced
     */
    protected Map<String,Object> getPropertiesFromMemento(final IMemento memento,
            final Collection<String> collection) {
        final Map<String,Object> result = new HashMap<String, Object>();
        for (final String key : collection) {
            result.put(key, memento.getString(key));
        }
        return Collections.unmodifiableMap(result);
    }

}
