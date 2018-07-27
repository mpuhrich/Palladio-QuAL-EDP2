package org.palladiosimulator.edp2.distancemetrics.ui.extensions.properties;

import org.eclipse.swt.widgets.Composite;

/**
 * This interface must be implemented by a DistanceMetricExtension,
 * if properties of the distance metric algorithm should be displayed
 * by the UI.
 * 
 * @author Christian Schaf
 */
public interface PropertyAccess {
  /** Must return a self-implemented PropertiesWidget, which can set the properties
  * of its distance metric.
  * @return A self-implemented PropertiesWidget to be displayed in the UI.
  * @param parent Composite, the properties should be drawn on.
  * @param style Style of the DynamicTimeWarpingProperties which
  * inherits ScrolledComposite widget.
  */
  PropertiesWidget getPropertiesWidget(final Composite parent, final int style);
}