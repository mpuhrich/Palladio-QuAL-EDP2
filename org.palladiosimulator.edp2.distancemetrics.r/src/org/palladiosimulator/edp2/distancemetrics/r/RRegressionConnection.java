package org.palladiosimulator.edp2.distancemetrics.r;

/**
 * Modified version of the RRegressionConnection. Closing the connection
 * is mandatory for the Distance Metrics UI or otherwise it won't respond
 * after changing to another distance metric, since there is no thread
 * for that purpose needed or used.
 * 
 * @author Christian Schaf (Modifier)
 *
 */
public interface RRegressionConnection extends IRConnection {
	
    /**
     * Stores an array in a R variable.
     * 
     * @param name
     *            Name of the R variable in which the array is stored.
     * @param array
     *            Array to store in an R variable.
     */
    abstract void assign(final String name, final int[] array);
    
    /**
     * Stores an array in a R variable.
     * 
     * @param name
     *            Name of the R variable in which the array is stored.
     * @param array
     *            Array to store in an R variable.
     */
    abstract void assign(final String name, final String[] array);

    /**
     * Checks the availability of the package with the given name in R. If it is not available an
     * error message is logged and displayed.
     * 
     * @param packageName
     *            The name of the R package.
     */
    void checkPackageAvailability(final String packageName);
    
    /**
     * Closes the RConnection.
     * @return Returns true, if connection was closed successfully. Otherwise, returns false.
     */
    boolean close();

}
