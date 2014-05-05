/**
 * 
 */
package org.palladiosimulator.edp2.visualization.properties.sections;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.palladiosimulator.edp2.visualization.IVisualisationInput;

/**
 * @author Dominik Ernst
 * 
 */
public class InputElementContentProvider implements ITreeContentProvider {

	@Override
	public Object[] getChildren(Object parentElement) {
		return null;
	}

	@Override
	public Object getParent(Object element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		return false;
	}

	@Override
	public Object[] getElements(Object inputElement) {
		return ((IVisualisationInput)inputElement).getInputs().toArray();
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		// TODO Auto-generated method stub

	}

}
