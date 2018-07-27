package org.palladiosimulator.edp2.distancemetrics.ui;

import org.eclipse.e4.core.di.annotations.Execute;

import java.util.List;

import org.palladiosimulator.commons.eclipseutils.ExtensionHelper;
import org.palladiosimulator.edp2.distancemetrics.ui.extensions.DistanceMetricExtension;

/**
 * This class is loaded during startup of an Eclipse instance and
 * loads all extensions which are connected to the extension point
 * org.palladiosimulator.edp2.distancemetrics.ui
 * If there is an issue with the extension (e.g. wrong implementation)
 * it won't be loaded.
 * 
 * @author Christian Schaf
 */
public final class DistanceMetricExtensionHandler {
  private static final String DISTANCE_METRIC_ALGORITHMS_EXTENSION_ID = 
	      "org.palladiosimulator.edp2.distancemetrics.ui";
  private List<DistanceMetricExtension> dmeList;
  private String attributeName = "DistanceMetricExtensionClass";
  private static DistanceMetricExtensionHandler instance = null;
  
  /** DistanceMetricExtensionHandler class shall not be instantiated. */
  private DistanceMetricExtensionHandler() {

  }

  /** This method is executed during startup. */
  @Execute
  public void execute() {
	  dmeList = ExtensionHelper.getExecutableExtensions(DISTANCE_METRIC_ALGORITHMS_EXTENSION_ID, attributeName);
  }
  /**
   * Returns the initialized distance metric extensions.
   * @return Empty, if no distance metric extensions have been initialized. Otherwise contains the
   * initialized distance metric extensions.
   */
  public List<DistanceMetricExtension> getDistanceMetricExtensionList() {
	  return dmeList;
  }
  
  /**
   * @return Returns a singleton object of DistanceMetricExtensionHandler class.
   */
  public static DistanceMetricExtensionHandler getInstance() {
	  if (DistanceMetricExtensionHandler.instance == null) {
		  DistanceMetricExtensionHandler.instance = new DistanceMetricExtensionHandler();
	  }
	  return DistanceMetricExtensionHandler.instance;
  }
}