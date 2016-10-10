package org.palladiosimulator.edp2.distancemetrics.r;


import java.util.Vector;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.rosuda.REngine.REXP;
import org.rosuda.REngine.REXPMismatchException;
import org.rosuda.REngine.REngineException;
import org.rosuda.REngine.Rserve.RConnection;
import org.rosuda.REngine.Rserve.RserveException;

/**
 * This class is a wrapper object of an RConnection which creates a connection as a singleton.
 *  
 * Note: This is a modified version of the original file RRegressionConnectionImpl.java 
 * of the package de.fzi.power.regression.r including the dependencies of RRegressionConnection
 * interface and the RDistanceMetricsConnection class.
 * Changes: 
 * - close() method added.
 * - initalizeConnection(): Fixed null pointer exception, when Rserve() is not running and stopped executing 
 * prepareEnvironment() inside of initalizeConnection() method, when connection wasn't established successfully,
 * since it also tries to access the rengine, which results into a null pointer exception.
 * - Reordered and extended logging information.
 * - getRRegressionConnection() returns null, if no connection could be established. 
 * - Adjustments for DistanceMetrics and other small changes.
 * 
 * @author Christian Schaf (Modifier)
 *
 */

public class DistanceMetricsConnectionImpl implements RRegressionConnection {
    /** The logger used by this class. */
    private static final Logger LOGGER = Logger.getLogger(DistanceMetricsConnectionImpl.class.getName());
    /** Package name to be loaded. */
    private static final String pkgTSdist = "TSdist";
    /** The R engine that is used by this class. */
    private static RConnection rengine;
    /** Global connection to the R engine. */
    private static DistanceMetricsConnectionImpl rConnection = null;
    
    /**
     * Gives you a wrapper object of an RConnection.
     * @return Returns RRegressionConnection with an established connection.
     * Returns null, if establishing a connection was not successful. 
     */
    public static RRegressionConnection getRRegressionConnection() {
    	if (rConnection == null) {
    	    rConnection = new DistanceMetricsConnectionImpl();
            boolean isEstablished = rConnection.initalizeConnection();
            if (isEstablished) {
                rConnection.execute("options(warn=-1)");
            } else {
            	rConnection = null;
            }
    	}
        return rConnection;
    }
	

	@Override
	public void assign(final String name, final int[] array) {
		try {
            rengine.assign(name, array);
        } catch (REngineException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
	}

	@Override
	public void assign(final String name, final String[] array) {
		try {
            rengine.assign(name, array);
        } catch (REngineException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }		
	}
	
    /**
     * Checks the availability of the package with the given name in R. If it is not available an
     * error message is logged and displayed.
     * 
     * @param packageName
     *            The name of the R package.
     */
	@Override
    public void checkPackageAvailability(final String packageName) {
        try {
            rengine.eval("options(warn=-1)");
            rengine.eval("library(" + packageName + ")");
        } catch (RserveException e) {
            LOGGER.error("Error while loading the library '" + packageName + "'. "
                    + "Use 'install.packages('" + packageName
                    + "');' to install the missing library.");
            throw new IllegalStateException(e);
        }
    }
	
    /**
     * Initializes the connection to a R engine.
     * @return True, if RConnection was established. Otherwise false.
     */
    protected boolean initalizeConnection() {

        checkPathValidity();

        // initialize connection

        // Disable complete shut down, if an exception within R is detected.
        // Properties prop=new Properties();
        // prop.put("jri.ignore.ule", "yes");
        // System.setProperties(prop);
        System.setProperty("jri.ignore.ule", "yes");
        
        try {
        	// This returns rengine to null, if Rserve() is NOT running!
            rengine = new RConnection();
        } catch (RserveException e) {
            LOGGER.error("Creating R engine was not successful. Reason: " + e.toString());
        }
        
        boolean isConEstablished = rengine != null && rengine.isConnected();

        if (!isConEstablished) {
            LOGGER.error(
                            "Creating R engine ** Waiting for the R engine to come up "
                                    + "failed. Please check the R-output on the console"
                                    + " for more details, as they are written to System.out and System.err");
            rengine = null;
            return isConEstablished;
        } else {
            LOGGER.info("Connection to R established successfully.");
        }

        try {
        	if (isConEstablished) {
        		LOGGER.info("Trying to prepare environment.");
        		prepareEnvironment();
        	}
        } catch (RserveException | REXPMismatchException e) {
            LOGGER.error("Error while setting up environment. Reason: " + e.toString());
        }
        if (isConEstablished) {
        	checkPackageAvailability();
        }
        return isConEstablished;
    }
    
    /**
     * Checks the availability of all necessary packages. If some are not available an error message
     * is logged.
     */
    private void checkPackageAvailability() {
		checkPackageAvailability(pkgTSdist);
    }
    
    /**
     * Checks if the java.library.path is valid for system.loadLibrary().
     */
    private void checkPathValidity() {
        String libraryPath = System.getProperty("java.library.path");
        String[] libraryPaths = libraryPath.split(";");
        Vector<String> conflictingPaths = new Vector<String>();
        for (String path : libraryPaths) {
            if (path.contains(" ") && !path.startsWith("\"") && !path.endsWith("\"")) {
                conflictingPaths.add(path);
            }
        }
        if (!conflictingPaths.isEmpty()) {
            String formattedPath = "";
            for (String conflictPath : conflictingPaths) {
                formattedPath += "'" + conflictPath + "', ";
            }
            // cut last ", "
            formattedPath = formattedPath.substring(0, formattedPath.length() - 2);
            LOGGER.warn("The environment variable java.library.path contains "
                    + " unescaped spaces. This may lead to errors loading "
                    + "the necessary dynamic link libraries of R.\n\n"
                    + "Conflicting parts of the java.library.path are: " + formattedPath + "\n\n"
                    + "A possible solution is to set the library path to"
                    + " point to the path containing jri.dll via the -D"
                    + " command line switch of the java VM of by setting"
                    + " it via the eclipse.ini file. However, this does" + " not work in all cases.");
        }
    }
    
    /**
     * This method is used to prepare the R environment. Additionally, Information about the R
     * environment is gathered and logged with level debug.
     * @throws RserveException 
     * @throws REXPMismatchException 
     */
    private void prepareEnvironment() throws RserveException, REXPMismatchException {
        rengine.eval("Sys.setlocale(\"LC_ALL\", \"German_Germany.1252\")");
        rengine.eval("Sys.setlocale(\"LC_NUMERIC\", \"C\")");
        rengine.eval("rUser <- chartr(\"\\\\\", \"/\", " + "Sys.getenv(\"R_USER\"))");
        rengine.eval("rLibs <- chartr(\"\\\\\", \"/\", " + "Sys.getenv(\"R_LIBS_USER\"))");
        rengine.eval("homedrive <- chartr(\"\\\\\", \"/\", " + "Sys.getenv(\"HOMEDRIVE\"))");
        rengine.eval("homepath <- chartr(\"\\\\\", \"/\", " + "Sys.getenv(\"HOMEPATH\"))");
        rengine.eval("usrLibPath <- substring(strsplit(rLibs, " + "rUser)[[1]][2],2)");
        rengine.eval("Sys.setenv(\"R_USER\"=paste(homedrive, homepath, " + "sep=\"\"))");
        rengine.eval("Sys.setenv(\"R_LIBS_USER\"=paste(Sys.getenv(\"R_USER\"), " + "usrLibPath, sep=\"\")[[1]])");

        REXP envContent = rengine.eval("Sys.getenv()");
        REXP envNames = rengine.eval("names(s <- Sys.getenv())");
        String[] sEnvContent = envContent.asStrings();
        String[] sEnvNames = envNames.asStrings();
        String locale = "";
        for (int number = 0; number < sEnvContent.length; number++) {
            locale += sEnvNames[number] + " = " + sEnvContent[number] + "\n";
        }
        REXP locales = rengine.eval("Sys.getlocale()");
        String[] sLocales = locales.asStrings();
        locale += "\nLocalization information:\n";
        for (int number = 0; number < sLocales.length; number++) {
            locale += sLocales[number] + "\n";
        }

        LOGGER.debug("Environmental Information:\n" + locale);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * de.uka.ipd.sdq.sensorframework.visualisation.rvisualisation.utils.IRConnection#execute(java
     * .lang.String)
     */
    @Override
    public Vector<REXP> execute(final String rCommands) {
        if (!isEngineAvailable()) {
            throw new UnsupportedOperationException("Tried to execute command in R without having a R engine"
                    + " available.");
        }

        String[] commands = rCommands.split("\n");
        String result = "";
        REXP resultExp = null;
        Vector<REXP> resultExpArray = new Vector<REXP>();

        for (String command : commands) {
            try {
                resultExp = rengine.eval(command);
            } catch (RserveException e) {
                String cause = null;
                try {
                    cause = rengine.eval("geterrmessage()").asString();
                } catch (REXPMismatchException | RserveException e2) {
                    cause = "Error while identifying cause: " + e2.getMessage();
                }
                LOGGER.error(String.format("Error for command \"%s\": %s", command, cause));
            }
            if (resultExp != null) {
                result += resultExp.toString() + "\n";
                resultExpArray.add(resultExp);
            }
        }

        return resultExpArray;
    }
    
    /**
     * checks if an R engine could be found and the connection is established.
     * 
     * @return <code>true</code> if the connection is established.
     */
    public static boolean isEngineAvailable() {
        return !(rengine == null);
    }
    
    /*
     * (non-Javadoc)
     * 
     * @see
     * de.uka.ipd.sdq.sensorframework.visualisation.rvisualisation.utils.IRConnection#assign(java
     * .lang.String, double[])
     */
    @Override
    public void assign(final String name, final double[] array) {
        try {
            rengine.assign(name, array);
        } catch (REngineException e) {
            LOGGER.error("Error while assigning " + array + " to " + "name. Cause: " + e.toString());
        }
    }
    
    /**
     * Closes the connection and nulling rengine and rConnection, to make
     * sure that isEngineAvailable() returns false after connection is closed
     * and a new connection is established, when getRRegressionConnection()
     * is called.
     * @return Returns true, if closing the connection was successful,
     * otherwise returns false.
     */
    @Override
    public boolean close() {
    	boolean isClosed = rengine.close();
    	if (isClosed) {
    		rengine = null;
    		rConnection = null;
    	}
    	return isClosed;
    }

}
