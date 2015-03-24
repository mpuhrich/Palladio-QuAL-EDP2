package org.palladiosimulator.edp2.util;

import java.util.List;

import org.eclipse.emf.ecore.util.Switch;
import org.palladiosimulator.commons.eclipseutils.ExtensionHelper;
import org.palladiosimulator.edp2.models.measuringpoint.MeasuringPoint;
import org.palladiosimulator.edp2.models.measuringpoint.MeasuringPointRepository;
import org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointFactory;
import org.palladiosimulator.edp2.models.measuringpoint.StringMeasuringPoint;

/**
 * Utility methods for Measuring Points.
 * 
 * @author Sebastian Lehrig
 */
public class MeasuringPointUtility {

    private MeasuringPointUtility() {
        //helper class, should not be instantiated
    }
    
    /**
     * Creates a {@link StringMeasuringPoint} based on the given {@link MeasuringPoint} and an
     * optional name suffix.<br><br>
     * Note, that this method has a <b>side effect</b>: The newly created and returned {@code StringMeasuringPoint} is added to the
     * {@link MeasuringPointRepository} the given {@code measuringPoint} is associated with.
     * @param measuringPoint The {@link MeasuringPoint} on which the newly created one bases on.
     * @param nameSuffix A suffix that is appended to the name of the new measuring point.<br>
     * If no suffix is required, {@code null} or the empty string is to be passed.
     * @return A {@link StringMeasuringPoint} basing on the given {@code measuringPoint.}
     * @throws IllegalArgumentException In case the given {@code measuringPoint} is {@code null}.
     */
    public static StringMeasuringPoint createStringMeasuringPointFromMeasuringPoint(MeasuringPoint measuringPoint,
            String nameSuffix) {
        if (measuringPoint == null) {
            throw new IllegalArgumentException("Measuring point must not be null.");
        }
        StringMeasuringPoint result = MeasuringpointFactory.eINSTANCE.createStringMeasuringPoint();
        String mpName = nameSuffix != null && !nameSuffix.isEmpty() ? MeasuringPointUtility
                .measuringPointToString(measuringPoint) + nameSuffix : MeasuringPointUtility
                .measuringPointToString(measuringPoint);
        result.setMeasuringPoint(mpName);
        result.setMeasuringPointRepository(measuringPoint.getMeasuringPointRepository());
        measuringPoint.getMeasuringPointRepository().getMeasuringPoints().add(result);

        return result;
    }

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
