package org.palladiosimulator.edp2.distancemetrics.ui;

import java.util.List;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.palladiosimulator.edp2.distancemetrics.ui.extensions.DistanceMetricExtension;

/**
 * This class is for little jobs only, where no other class seems to be responsible.
 * 
 * @author Christian Schaf
 *
 */
public final class Helper {

	/**
	 * Helper class only contains static methods and should not be instantiated.
	 */
	private Helper() {
	}

	/**
	 * Since SWT doesn't allow subclassing of Combo, static method is used for that
	 * @param composite The Composite the Combo should be created at.
	 * @param dmeHandler DistanceMetricExtensionHandler the data should be loaded from.
	 * @return Returns a Combo that contains all distance metrics
	 */
	public static Combo createCombo(Composite composite, DistanceMetricExtensionHandler dmeHandler) {
    	Combo comboDropDown = new Combo(composite, SWT.DROP_DOWN | SWT.BORDER | SWT.READ_ONLY | SWT.TOP);
        List<DistanceMetricExtension> dmeList = dmeHandler.getDistanceMetricExtensionList();
        for (DistanceMetricExtension dme : dmeList) {
        	comboDropDown.add(dme.getDistanceMetricName());
        }
		return comboDropDown;
	}
}
