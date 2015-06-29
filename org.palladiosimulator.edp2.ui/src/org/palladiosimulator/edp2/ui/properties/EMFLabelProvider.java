package org.palladiosimulator.edp2.ui.properties;

import java.util.Iterator;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.graphics.Image;
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

    /**
     * @see org.eclipse.jface.viewers.ILabelProvider#getImage(java.lang.Object)
     */
    @Override
    public Image getImage(Object element) {
        if (element == null || element.equals(StructuredSelection.EMPTY)) {
            return null;
        }
        if (element instanceof IStructuredSelection) {
            final IStructuredSelection structuredSelection = (IStructuredSelection) element;
            if (areDifferentTypes(structuredSelection)) {
                return null;
            }
            element = structuredSelection.getFirstElement();
        }
        if (element instanceof EObject || element instanceof Resource) {
            return super.getImage(element);
        }
        return null;
    }

    /**
     * @see org.eclipse.jface.viewers.ILabelProvider#getText(java.lang.Object)
     */
    @Override
    public String getText(Object element) {
        if (element == null || element.equals(StructuredSelection.EMPTY)) {
            return null;
        }
        int size = 1;
        if (element instanceof IStructuredSelection) {
            final IStructuredSelection structuredSelection = (IStructuredSelection) element;
            if (areDifferentTypes(structuredSelection)) {
                return structuredSelection.size() + " items selected";//$NON-NLS-1$
            }
            element = structuredSelection.getFirstElement();
            size = structuredSelection.size();
        }
        if (element instanceof EObject) {
            return super.getText(element);
        } else if (element instanceof Resource) {
            return "\u00ABResource\u00BB";//$NON-NLS-1$
        }
        return null;
    }

    /**
     * Determine there are objects in the structured selection of different
     * types.
     *
     * @param structuredSelection
     *            the structured selection.
     * @return true if there are objects of different types in the selection.
     */
    private boolean areDifferentTypes(final IStructuredSelection structuredSelection) {
        if (structuredSelection.size() == 1) {
            return false;
        }
        final Iterator i = structuredSelection.iterator();
        final Object element = i.next();
        for (; i.hasNext();) {
            if (i.next().getClass() != element.getClass()) {
                return true;
            }
        }

        return false;
    }

}
