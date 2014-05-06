package org.palladiosimulator.edp2.ui.properties;

import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.PropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.AbstractPropertySection;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.palladiosimulator.edp2.models.ExperimentData.provider.ExperimentDataItemProviderAdapterFactory;
import org.palladiosimulator.edp2.models.Repository.provider.RepositoryItemProviderAdapterFactory;
import org.palladiosimulator.metricspec.provider.MetricSpecItemProviderAdapterFactory;

import de.uka.ipd.sdq.identifier.provider.IdentifierItemProviderAdapterFactory;

public class EMFPropertySection extends AbstractPropertySection {
    protected PropertySheetPage page;

    @Override
    public void createControls(final Composite parent, final TabbedPropertySheetPage tabbedPropertySheetPage) {
        super.createControls(parent, tabbedPropertySheetPage);
        final Composite composite = getWidgetFactory().createFlatFormComposite(parent);
        page = new PropertySheetPage();

        final ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

        adapterFactory.addAdapterFactory(new ResourceItemProviderAdapterFactory());
        adapterFactory.addAdapterFactory(new ExperimentDataItemProviderAdapterFactory());
        adapterFactory.addAdapterFactory(new RepositoryItemProviderAdapterFactory());
        adapterFactory.addAdapterFactory(new IdentifierItemProviderAdapterFactory());
        adapterFactory.addAdapterFactory(new MetricSpecItemProviderAdapterFactory());
        adapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());

        page.setPropertySourceProvider(new AdapterFactoryContentProvider(adapterFactory));

        page.createControl(composite);
        final FormData data = new FormData();
        data.left = new FormAttachment(0, 0);
        data.right = new FormAttachment(100, 0);
        data.top = new FormAttachment(0, 0);
        data.bottom = new FormAttachment(100, 0);
        page.getControl().setLayoutData(data);
    }

    @Override
    public void setInput(final IWorkbenchPart part, final ISelection selection) {
        super.setInput(part, selection);
        page.selectionChanged(part, selection);
    }

    @Override
    public void dispose() {
        super.dispose();

        if (page != null) {
            page.dispose();
            page = null;
        }

    }

    @Override
    public void refresh() {
        page.refresh();
    }

    @Override
    public boolean shouldUseExtraSpace() {
        return true;
    }
}