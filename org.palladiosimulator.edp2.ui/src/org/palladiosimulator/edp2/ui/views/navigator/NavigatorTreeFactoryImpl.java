package org.palladiosimulator.edp2.ui.views.navigator;

import org.eclipse.core.databinding.observable.IObservable;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.masterdetail.IObservableFactory;
import org.eclipse.emf.databinding.EMFProperties;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentGroup;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentRun;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentSetting;
import org.palladiosimulator.edp2.models.Repository.Repository;
import org.palladiosimulator.edp2.models.Repository.RepositoryPackage;

/**
 * Determines the elements and the hierarchy of these elements shown in the navigator tree.
 * 
 * @author Sebastian Lehrig
 */
public class NavigatorTreeFactoryImpl implements IObservableFactory {

    @Override
    public IObservable createObservable(final Object target) {
        if (target instanceof IObservableList) {
            return (IObservable) target;
        } else if (target instanceof Repository) {
            return EMFProperties.list(RepositoryPackage.Literals.REPOSITORY__EXPERIMENT_GROUPS).observe(target);
        } else if (target instanceof ExperimentGroup) {
            return EMFProperties.list(ExperimentDataPackage.Literals.EXPERIMENT_GROUP__EXPERIMENT_SETTINGS).observe(
                    target);
        } else if (target instanceof ExperimentSetting) {
            return EMFProperties.list(ExperimentDataPackage.Literals.EXPERIMENT_SETTING__EXPERIMENT_RUNS).observe(
                    target);
        } else if (target instanceof ExperimentRun) {
            return EMFProperties.list(ExperimentDataPackage.Literals.RUN__MEASUREMENTS).observe(target);
        }
        return null;
    }

}
