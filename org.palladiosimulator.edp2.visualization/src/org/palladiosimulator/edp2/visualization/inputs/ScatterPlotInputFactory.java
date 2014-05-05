package org.palladiosimulator.edp2.visualization.inputs;

import java.util.Map;
import java.util.logging.Logger;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.ui.IElementFactory;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.IPersistableEditor;
import org.palladiosimulator.edp2.datastream.AbstractDataSource;
import org.palladiosimulator.edp2.visualization.datasource.ElementFactory;

/**
 * Factory for {@link ScatterPlotInput}. Also manages persistence of instances
 * of {@link ScatterPlotInput}.
 * 
 * @author Dominik Ernst
 * 
 */
public class ScatterPlotInputFactory extends ElementFactory {

    private static Logger logger = Logger
            .getLogger(ScatterPlotInputFactory.class.getCanonicalName());
    /**
     * The factory's ID. Must match the ID specified in the extension point
     * "org.eclipse.ui.elementFactories".
     */
    private static final String FACTORY_ID = "org.palladiosimulator.edp2.visualization.inputs.ScatterPlotInputFactory";

    /**
     * Method for restoring {@link ScatterPlotInput} elements. Should call
     * {@link AbstractDataSource#saveState(IMemento)} of the associated source.
     * 
     * @param memento the {@link IMemento} passed on
     *            by {@link IPersistableEditor#restoreState(IMemento)}
     * @return Restored {@link ScatterPlotInput} with non-null reference to the
     *         {@link AbstractDataSource}
     */
    @Override
    public IAdaptable createElement(IMemento memento) {
        final ScatterPlotInput scatterPlotInput = new ScatterPlotInput();

        final Map<String, Object> restoredProperties = scatterPlotInput.getProperties();
        memento = memento.getChild(restoredProperties.get(ELEMENT_KEY)
                .toString());
        //default properties are overridden with persisted properties from the memento
        overrideFromMemento(memento, restoredProperties);
        //properties are set for the restored element
        scatterPlotInput.setProperties(restoredProperties);

        final Object sourceFactory = FactoryConnector.instance.getAdapter(memento.getString(SOURCE_KEY),
                IElementFactory.class);

        final AbstractDataSource createdSource = (AbstractDataSource) ((IElementFactory) sourceFactory)
                .createElement(memento);

        scatterPlotInput.setSource(createdSource);

        return scatterPlotInput;
    }
    /**
     * @return this factory's ID.
     */
    public static String getFactoryId() {
        return FACTORY_ID;
    }
}
