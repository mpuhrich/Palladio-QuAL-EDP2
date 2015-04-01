package org.palladiosimulator.edp2.visualization.util;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

/**
 * Filter which filters files according to their extensions. Only files with
 * extensions matching an extension in the allowedExtensions array are selected.
 * 
 * @author Andreas Flohre
 *
 */
public class ExtensionsFilter extends ViewerFilter {
	private String[] allowedExtensions;

	public ExtensionsFilter(String[] extensions) {
		this.allowedExtensions = extensions;
	}

	@Override
	public boolean select(Viewer viewer, Object parentElement, Object element) {

		if (element instanceof IFile) {
			IFile file = (IFile) element;

			String fileextension = file.getFileExtension();

			for (String currentExtension : allowedExtensions) {
				if (currentExtension.equals(fileextension)) {
					return true;
				}
			}
		} else {
			return true;
		}
		return false;
	}

}
