package org.palladiosimulator.edp2.visualization.datasource;

import java.util.Map;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.ui.IMemento;

/**
 * Factory, which persists and creates {@link EDP2Source} elements.
 * 
 * @author Dominik Ernst
 * 
 */
public class EDP2SourceFactory extends ElementFactory {

    /**
     * The factory's ID. Must match the ID specified in the extension point
     * "org.eclipse.ui.elementFactories".
     */
    private static final String FACTORY_ID = "org.palladiosimulator.edp2.editor.EDP2SourceFactory";

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.eclipse.ui.IElementFactory#createElement(org.eclipse.ui.IMemento)
     */
    @Override
    public IAdaptable createElement(final IMemento memento) {
        // specific element is created and default properties are retrieved
        final EDP2Source source = new EDP2Source();
        final IMemento myMemento = memento.getChild(EDP2Source.ELEMENT_NAME);
        final Map<String,Object> restoredProperties = getPropertiesFromMemento(memento,source.getPropertiesKeySet());
        //properties are set for the restored element
        source.setProperties(restoredProperties);
        return source;
    }

    /**
     * @return this factory's ID.
     */
    public static String getFactoryId() {
        return FACTORY_ID;
    }
}
