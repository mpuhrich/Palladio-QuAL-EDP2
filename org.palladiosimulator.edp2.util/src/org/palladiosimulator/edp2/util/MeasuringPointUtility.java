package org.palladiosimulator.edp2.util;

import java.util.List;

import org.eclipse.emf.ecore.util.Switch;
import org.palladiosimulator.commons.eclipseutils.ExtensionHelper;
import org.palladiosimulator.edp2.models.measuringpoint.MeasuringPoint;

/**
 * Utility methods for Measuring Points.
 * 
 * @author Sebastian Lehrig
 */
public class MeasuringPointUtility {

    public static String measuringPointToString(final MeasuringPoint measuringPoint) {
        if (measuringPoint == null) {
            return "Measure";
        }

        final List<Switch<String>> formaters = ExtensionHelper.getExecutableExtensions(
                "org.palladiosimulator.edp2.util.formater", "class");
        for (Switch<String> formater : formaters) {
            final String result = formater.doSwitch(measuringPoint);
            if (result != null) {
                return result;
            }
        }

        return "<Unknown Measuring Point>";
    }
}
