/**
 *
 */
package org.palladiosimulator.edp2.visualization.properties.sections;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.palladiosimulator.edp2.datastream.IDataSink;
import org.palladiosimulator.edp2.datastream.IDataSource;
import org.palladiosimulator.edp2.visualization.IVisualisationInput;
import org.palladiosimulator.edp2.visualization.IVisualisationSingleDatastreamInput;

/**
 * @author Dominik Ernst
 *
 */
public class InputSelectionContentProvider implements ITreeContentProvider {

    @Override
    public Object[] getChildren(final Object parentElement) {
        final List<Object> transformations = new LinkedList<Object>();
        IDataSource source = ((IDataSink)parentElement).getDataSource();
        do {
            transformations.add(source);
            if (source instanceof IDataSink) {
                source = ((IDataSink)source).getDataSource();
            } else {
                source = null;
            }
        } while (source != null);
        return transformations.toArray();
    }

    @Override
    public Object getParent(final Object element) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean hasChildren(final Object element) {
        return element instanceof IVisualisationSingleDatastreamInput;
    }

    @Override
    public Object[] getElements(final Object inputElement) {
        return ((IVisualisationInput<?>) inputElement).getInputs().toArray();
    }

    @Override
    public void dispose() {
        // TODO Auto-generated method stub

    }

    @Override
    public void inputChanged(final Viewer viewer, final Object oldInput, final Object newInput) {
        // TODO Auto-generated method stub

    }

}
