package org.palladiosimulator.edp2.util.visitors;

import org.palladiosimulator.edp2.models.measuringpoint.StringMeasuringPoint;
import org.palladiosimulator.edp2.models.measuringpoint.util.MeasuringpointSwitch;

public class MeasuringPointStringFormaterSwitch extends MeasuringpointSwitch<String> {

    /*
     * (non-Javadoc)
     * 
     * @see org.palladiosimulator.edp2.models.measuringpoint.util.MeasuringpointSwitch#
     * caseStringMeasuringPoint
     * (org.palladiosimulator.edp2.models.measuringpoint.StringMeasuringPoint)
     */
    @Override
    public String caseStringMeasuringPoint(final StringMeasuringPoint object) {
        return object.getMeasuringPoint();
    }

}
