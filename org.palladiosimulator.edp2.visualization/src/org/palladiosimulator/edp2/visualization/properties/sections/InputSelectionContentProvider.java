/**
 * 
 */
package org.palladiosimulator.edp2.visualization.properties.sections;

import java.util.ArrayList;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.palladiosimulator.edp2.datastream.IDataSink;
import org.palladiosimulator.edp2.datastream.filter.AbstractAdapter;
import org.palladiosimulator.edp2.visualization.IVisualisationInput;

/**
 * @author Dominik Ernst
 * 
 */
public class InputSelectionContentProvider implements ITreeContentProvider {

    @Override
    public Object[] getChildren(final Object parentElement) {
        final ArrayList<Object> transformations = new ArrayList<Object>();
        IDataSink sinkParent = (IDataSink) parentElement;
        while (sinkParent.getDataSource() instanceof AbstractAdapter) {
            sinkParent = (AbstractAdapter) sinkParent.getDataSource();
            transformations.add(sinkParent);
        }
        return transformations.toArray();
    }

    @Override
    public Object getParent(final Object element) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean hasChildren(final Object element) {
        if (element instanceof AbstractAdapter) {
            return false;
        }
        return true;
    }

    @Override
    public Object[] getElements(final Object inputElement) {
        return ((IVisualisationInput)inputElement).getInputs().toArray();
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
