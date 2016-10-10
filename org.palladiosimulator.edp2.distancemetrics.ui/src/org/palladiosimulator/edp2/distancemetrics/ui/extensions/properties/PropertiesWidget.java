package org.palladiosimulator.edp2.distancemetrics.ui.extensions.properties;

import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.widgets.Composite;

/**
 * This class is necessary if the distance metric which extends
 * the extension point depends on properties that are set by the user.
 * A new class must be written, which inherits this class and draws
 * all the necessary properties and passes them to the distance metric
 * algorithm on its own.
 * 
 * @author Christian Schaf
 */
public class PropertiesWidget extends ScrolledComposite {
	/**
	 * Composite and style are passed to the inherited
	 * ScrolledComposite.
	 * @param parent Composite, the properties widget should
	 * be drawn on.
	 * @param style Style of the ScrolledComposite.
	 */
	public PropertiesWidget(final Composite parent, final int style) {
		super(parent, style);
	}
}