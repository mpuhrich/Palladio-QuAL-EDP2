package org.palladiosimulator.edp2.impl;

import org.palladiosimulator.edp2.models.measuringpoint.ActiveResourceMeasuringPoint;
import org.palladiosimulator.edp2.models.measuringpoint.AssemblyOperationMeasuringPoint;
import org.palladiosimulator.edp2.models.measuringpoint.AssemblyPassiveResourceMeasuringPoint;
import org.palladiosimulator.edp2.models.measuringpoint.MeasuringPoint;
import org.palladiosimulator.edp2.models.measuringpoint.StringMeasuringPoint;
import org.palladiosimulator.edp2.models.measuringpoint.SubSystemOperationMeasuringPoint;
import org.palladiosimulator.edp2.models.measuringpoint.SystemOperationMeasuringPoint;

import de.uka.ipd.sdq.pcm.resourceenvironment.ProcessingResourceSpecification;

/**
 * Utility methods for Measuring Points.
 * 
 * @author Sebastian Lehrig
 */
public class MeasuringPointUtility {

    /**
     * TODO Should be refactored into measuring point objects' toString() method. [Lehrig]
     */
    public static String measuringPointToString(MeasuringPoint measuringPoint) {
        final StringBuilder result = new StringBuilder();
        if(measuringPoint == null) {
            result.append("Measure");
        }
        else if(measuringPoint instanceof StringMeasuringPoint) {
            result.append(((StringMeasuringPoint) measuringPoint).getMeasuringPoint());
        }
        else if(measuringPoint instanceof ActiveResourceMeasuringPoint) {
            ProcessingResourceSpecification activeResource = ((ActiveResourceMeasuringPoint) measuringPoint).getActiveResource();
            result.append("Active Resource: ");
            result.append(activeResource.getActiveResourceType_ActiveResourceSpecification().getEntityName());
            result.append("[");
            result.append(String.valueOf(((ActiveResourceMeasuringPoint) measuringPoint).getReplicaID()));
            result.append("]");
        }
        else if(measuringPoint instanceof AssemblyOperationMeasuringPoint) {
            AssemblyOperationMeasuringPoint mP = (AssemblyOperationMeasuringPoint) measuringPoint;
            result.append("Operation: ");
            result.append(mP.getAssembly().getEntityName());
            result.append(".");
            result.append(mP.getRole().getEntityName());
            result.append(".");
            result.append(mP.getOperationSignature().getEntityName());
        }
        else if(measuringPoint instanceof AssemblyPassiveResourceMeasuringPoint) {                        
            AssemblyPassiveResourceMeasuringPoint mP = (AssemblyPassiveResourceMeasuringPoint) measuringPoint;
            result.append("Passive Resource: ");
            result.append(mP.getAssembly().getEntityName());
            result.append(".");
            result.append(mP.getPassiveResource().getEntityName());
        }
        else if(measuringPoint instanceof SubSystemOperationMeasuringPoint) {
            SubSystemOperationMeasuringPoint mP = (SubSystemOperationMeasuringPoint) measuringPoint;
            result.append("Sub System Operation: ");
            result.append(mP.getSubsystem().getEntityName());
            result.append(".");
            result.append(mP.getRole().getEntityName());
            result.append(".");
            result.append(mP.getOperationSignature().getEntityName());
        }
        else if(measuringPoint instanceof SystemOperationMeasuringPoint) {
            SystemOperationMeasuringPoint mP = (SystemOperationMeasuringPoint) measuringPoint;
            result.append(mP.getSystem().getEntityName());
            result.append(".");
            result.append(mP.getRole().getEntityName());
            result.append(".");
            result.append(mP.getOperationSignature().getEntityName());
        }
        else {
            throw new IllegalArgumentException("Unknown measuring point type");
        }
        return result.toString();
    }
}
