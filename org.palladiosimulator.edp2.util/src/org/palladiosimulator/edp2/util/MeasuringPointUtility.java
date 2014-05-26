package org.palladiosimulator.edp2.util;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.util.Switch;
import org.palladiosimulator.edp2.models.measuringpoint.MeasuringPoint;

/**
 * Utility methods for Measuring Points.
 * 
 * @author Sebastian Lehrig
 */
public class MeasuringPointUtility {

    /**
     * TODO Should be refactored into measuring point objects' toString() method. [Lehrig]
     */
    public static String measuringPointToString(final MeasuringPoint measuringPoint) {
        if (measuringPoint == null) {
            return "Measure";
        }
        String result = null;
        if (Platform.getExtensionRegistry() != null) {
            final IConfigurationElement[] adapterExtensions = Platform.getExtensionRegistry()
                    .getConfigurationElementsFor("org.palladiosimulator.edp2.util.formater");
            for (final IConfigurationElement e : adapterExtensions) {
                try {
                    @SuppressWarnings("unchecked")
                    final Switch<String> formater = (Switch<String>) e.createExecutableExtension("class");
                    result = formater.doSwitch(measuringPoint);
                    if (result != null) {
                        break;
                    }
                } catch (final CoreException e1) {
                    throw new RuntimeException();
                }
            }
        }

        if (result == null) {
            throw new IllegalArgumentException("Unknown measuring point type");
        }

        return result;
    }
}
