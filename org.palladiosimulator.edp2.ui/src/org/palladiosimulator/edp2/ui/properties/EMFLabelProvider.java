package org.palladiosimulator.edp2.ui.properties;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.palladiosimulator.edp2.models.ExperimentData.provider.ExperimentDataItemProviderAdapterFactory;
import org.palladiosimulator.edp2.models.Repository.provider.RepositoryItemProviderAdapterFactory;
import org.palladiosimulator.metricspec.provider.MetricSpecItemProviderAdapterFactory;

import de.uka.ipd.sdq.identifier.provider.IdentifierItemProviderAdapterFactory;

public class EMFLabelProvider extends AdapterFactoryLabelProvider implements ILabelProvider {

    public EMFLabelProvider() {
        super(createAdapterFactory());
    }

    private static AdapterFactory createAdapterFactory() {
        final ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(
                ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

        adapterFactory.addAdapterFactory(new ResourceItemProviderAdapterFactory());
        adapterFactory.addAdapterFactory(new ExperimentDataItemProviderAdapterFactory());
        adapterFactory.addAdapterFactory(new RepositoryItemProviderAdapterFactory());
        adapterFactory.addAdapterFactory(new IdentifierItemProviderAdapterFactory());
        adapterFactory.addAdapterFactory(new MetricSpecItemProviderAdapterFactory());
        adapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());

        return adapterFactory;
    }

}
