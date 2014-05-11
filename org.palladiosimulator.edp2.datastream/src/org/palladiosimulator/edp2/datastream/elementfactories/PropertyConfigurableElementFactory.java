package org.palladiosimulator.edp2.datastream.elementfactories;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.ui.IElementFactory;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.IPersistableElement;
import org.eclipse.ui.PlatformUI;
import org.palladiosimulator.edp2.datastream.configurable.IPropertyConfigurable;

/**
 * A factory for persistence of {@link IDataFlow} elements.
 * 
 * @author Dominik Ernst
 * 
 */
public abstract class PropertyConfigurableElementFactory
implements IElementFactory {

    private static final String CHILD_INPUTS_MEMENTO_TAG = PropertyConfigurableElementFactory.class.getCanonicalName() + "childInputs";

    /* (non-Javadoc)
     * @see org.eclipse.ui.IElementFactory#createElement(org.eclipse.ui.IMemento)
     */
    @Override
    public IAdaptable createElement(final IMemento memento) {
        final IPropertyConfigurable result = createElementInternal(memento);
        final Map<String, Object> newProperties = getPropertiesFromMemento(memento,result.getKeys());
        result.setProperties(newProperties);

        return result;
    }

    public static void saveConfigurationState(final IMemento memento, final IPropertyConfigurable configurable) {
        final Map<String, Object> props = configurable.getProperties();

        for (final String key : props.keySet()) {
            memento.putString(key, props.get(key).toString());
        }
    }

    /**
     * @param memento
     * @param input
     */
    @SuppressWarnings("rawtypes")
    public static void persistChildren(final IMemento memento, final Collection children) {
        for (final Object childObject : children ) {
            final IPersistableElement child = (IPersistableElement) childObject;
            final IMemento subMemento = memento.createChild(CHILD_INPUTS_MEMENTO_TAG,child.getFactoryId());
            child.saveState(subMemento);
        }
    }

    public static List<IPersistableElement> loadChildren(final IMemento memento) {
        final IMemento[] inputMementos = memento.getChildren(CHILD_INPUTS_MEMENTO_TAG);
        final List<IPersistableElement> result = new ArrayList<IPersistableElement>(inputMementos.length);
        for (final IMemento subMemento : inputMementos) {
            final String id = subMemento.getID();
            final IElementFactory inputFactory = PlatformUI.getWorkbench().getElementFactory(id);
            final IPersistableElement createdInput = (IPersistableElement) inputFactory.createElement(subMemento);
            result.add(createdInput);
        }
        return result;
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
    private Map<String,Object> getPropertiesFromMemento(final IMemento memento, final Collection<String> collection) {
        final Map<String,Object> result = new HashMap<String, Object>();
        for (final String key : collection) {
            result.put(key, memento.getString(key));
        }
        return Collections.unmodifiableMap(result);
    }

    protected abstract IPropertyConfigurable createElementInternal(IMemento memento);
}
