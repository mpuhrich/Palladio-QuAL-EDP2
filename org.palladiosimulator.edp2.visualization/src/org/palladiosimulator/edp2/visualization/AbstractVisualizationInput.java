/**
 * 
 */
package org.palladiosimulator.edp2.visualization;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.jface.viewers.ISelection;
import org.palladiosimulator.edp2.visualization.editors.AbstractEditor;

/**
 * Interface for classes that are being displayed by implementations of {@link AbstractEditor}.
 * Possibly manages multiple inputs as indicated by {@link #supportsMultipleInputs()}
 * @author Dominik Ernst
 *
 */
public abstract class AbstractVisualizationInput<T extends AbstractVisualizationSingleDatastreamInput>
extends AbstractInput
implements ISelection, IVisualisationInput<T> {

    /**
     * The list of inputs managed by this handle.
     */
    protected final List<T> inputs = new ArrayList<T>();

    public AbstractVisualizationInput(){
        super();
    }

    @Override
    public final void addInput(final T newChildInput) {
        inputs.add(newChildInput);
        newChildInput.setParentInput(this);
        if (inputs.size() == 1) {
            firstChildInputAdded(newChildInput);
        }
        this.getEventDispatcher().visualisationInputChanged(true);
    }

    protected void firstChildInputAdded(final T newChildInput) {
    }

    @Override
    public final List<T> getInputs() {
        return Collections.unmodifiableList(inputs);
    }

    @Override
    public final void removeInput(final T newChildInput) {
        inputs.remove(newChildInput);
        newChildInput.setParentInput(null);
        this.getEventDispatcher().visualisationInputChanged(true);
    }
}
