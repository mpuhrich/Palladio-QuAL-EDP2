package org.palladiosimulator.edp2.distancemetrics.r.ui;

import org.eclipse.jface.dialogs.MessageDialog;
import org.palladiosimulator.edp2.distancemetrics.r.ErrorState;
import org.palladiosimulator.edp2.visualization.Activator;

/**
 * This class is responsible for error handling of R distance metrics and gives UI notifications.
 * @author Christian Schaf
 *
 */
public final class ErrorHandler {

	/**
	 * Permits instantiation.
	 */
	private ErrorHandler() {
		
	}
	
	/**
	 * Call this method to execute the error handling.
	 */
	public static void handleError() {
		if (ErrorState.CONNECTION_ERROR == ErrorState.getState()) {
        	MessageDialog.openError(
                    Activator.getDefault().getWorkbench().getActiveWorkbenchWindow().getShell(),
                    "No Rserve() instance found.",
                    "Please start a Rserve instance to execute the calculation."
                    + " To do that, type in the R Console\n"
                    + "> library(Rserve)\n"
                    + "> Rserve()");
		} else if (ErrorState.ELEMENTS_NUMBER_ERROR == ErrorState.getState()) {
                	MessageDialog.openError(
                            Activator.getDefault().getWorkbench().getActiveWorkbenchWindow().getShell(),
                            "Wrong number of elements.",
                            "Please choose two measurements with same number of elements.");
		}
	}
}
