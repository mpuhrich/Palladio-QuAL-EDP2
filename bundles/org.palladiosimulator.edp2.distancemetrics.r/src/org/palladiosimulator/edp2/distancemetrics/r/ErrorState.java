package org.palladiosimulator.edp2.distancemetrics.r;

/**
 * Describes the error that happened when trying to execute the calculation.
 * @author Christian Schaf
 */
public final class ErrorState {
	// Connection error happened.
	public static final int CONNECTION_ERROR = 0;
	// Streams don't contain same number of elements.
	public static final int ELEMENTS_NUMBER_ERROR = 1;
	private static int state;
	
	/**
	 * Prevent instantiation.
	 */
	private ErrorState() {
		
	}
	
	/**
	 * Sets the current state of the calculation.
	 * @param currentState The current error state.
	 */
	public static void setState(final int currentState) {
		state = currentState;
	}
	/**
	 * @return Returns the current state of the calculation.
	 */
	public static int getState() {
		return state;
	}
}