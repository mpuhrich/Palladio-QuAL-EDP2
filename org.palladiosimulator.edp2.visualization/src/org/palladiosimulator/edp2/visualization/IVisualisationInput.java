package org.palladiosimulator.edp2.visualization;

import java.util.List;

import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IPersistableElement;
import org.palladiosimulator.commons.designpatterns.IAbstractObservable;
import org.palladiosimulator.edp2.datastream.IDataSink;
import org.palladiosimulator.edp2.datastream.IDataSource;
import org.palladiosimulator.edp2.datastream.configurable.IPropertyConfigurable;

public interface IVisualisationInput<T extends IVisualisationSingleDatastreamInput> extends IEditorInput,
        IPersistableElement, IAbstractObservable<IVisualisationInputListener> {

    /**
     * Method to retrieve all contained {@link IDataSink}s. These are intended to be displayed by
     * the same {@link IVisualization}.
     * 
     * @return the contained {@link IDataSink}s
     */
    public List<T> getInputs();

    /**
     * Adds an {@link IDataSink} to this {@link AbstractVisualizationInput}'s list of inputs.
     * 
     * @param newInput
     *            the {@link IDataSink} to add.
     */
    public void addInput(T newInput);

    /**
     * Removes an {@link IDataSink} from this {@link AbstractVisualizationInput}'s list of inputs.
     * 
     * @param removedInput
     *            the {@link IDataSink} to add.
     */
    public void removeInput(T removedInput);

    public <G extends IPropertyConfigurable> G getConfiguration();

    public void reloadData();

    public T createNewInput(IDataSource source);
}