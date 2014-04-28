/**
 * 
 */
package org.palladiosimulator.edp2.local.file;

import org.palladiosimulator.edp2.models.ExperimentData.ExperimentGroup;
import org.palladiosimulator.edp2.models.ExperimentData.util.ExperimentDataSwitch;
import org.palladiosimulator.edp2.models.impl.EmfModelXMIResourceFactoryImpl;

/**
 * EMF switch class to return the file extension required by EDP2.
 * Return <code>null</code> if the element is not mapped to an EDP2 file extension.
 * @author groenda
 */
public class EmfmodelExtensionSwitch extends ExperimentDataSwitch<String> {
    @Override
    public String caseExperimentGroup(final ExperimentGroup object) {
        return EmfModelXMIResourceFactoryImpl.EDP2_EXPERIMENT_GROUP_EXTENSION;
    }
}
