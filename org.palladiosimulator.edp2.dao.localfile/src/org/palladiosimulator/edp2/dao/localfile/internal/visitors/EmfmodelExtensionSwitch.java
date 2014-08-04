/**
 * 
 */
package org.palladiosimulator.edp2.dao.localfile.internal.visitors;

import org.palladiosimulator.edp2.impl.resource.EmfModelXMIResourceFactoryImpl;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentGroup;
import org.palladiosimulator.edp2.models.ExperimentData.util.ExperimentDataSwitch;

/**
 * EMF switch class to return the file extension required by EDP2. Return <code>null</code> if the
 * element is not mapped to an EDP2 file extension.
 * 
 * @author groenda
 */
public class EmfmodelExtensionSwitch extends ExperimentDataSwitch<String> {
    @Override
    public String caseExperimentGroup(final ExperimentGroup object) {
        return EmfModelXMIResourceFactoryImpl.EDP2_EXPERIMENT_GROUP_EXTENSION;
    }
}
