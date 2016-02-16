package org.palladiosimulator.edp2;

import org.palladiosimulator.edp2.models.ExperimentData.MeasuringType;
import org.palladiosimulator.edp2.models.measuringpoint.MeasuringPoint;
import org.palladiosimulator.metricspec.MetricDescription;

public class MeasuringTypeEquivalenceHelper {
	
	private static boolean isEquivalent(MeasuringPoint measuringPoint1, MeasuringPoint measuringPoint2){
		return measuringPoint1.getResourceURIRepresentation().equals(measuringPoint2.getResourceURIRepresentation())
                && measuringPoint1.getStringRepresentation().equals(measuringPoint2.getStringRepresentation());
	}
			
			
	public static boolean isEquivalent(MeasuringType measuringType1, MeasuringType measuringType2){
		return measuringType1.getMetric().equals(measuringType2.getMetric())
                && isEquivalent(measuringType1.getMeasuringPoint(), measuringType2.getMeasuringPoint());
	}
	
	public static boolean isEquivalent(MeasuringType measuringType, MetricDescription metricDescription, MeasuringPoint measuringPoint){
		return measuringType.getMetric().equals(metricDescription)
                && isEquivalent(measuringType.getMeasuringPoint(), measuringPoint);
	}

}
