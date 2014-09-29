/**
 * 
 */
package org.palladiosimulator.edp2.visualization.wizards;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.palladiosimulator.edp2.datastream.AbstractDataSource;
import org.palladiosimulator.edp2.datastream.filter.AbstractAdapter;

/**
 * {@link WizardPage}, which provides a list of all available adapters {@link AbstractAdapter}, that
 * are registered as extensions.
 * 
 * @author Dominik Ernst, Florian Rosenthal
 */
public class SelectAdapterPage extends WizardPage implements ISelectionChangedListener {

    private static final Logger LOGGER = Logger.getLogger(SelectAdapterPage.class.getCanonicalName());

    private static final String ADAPTER_EXTENSION_POINT_ID = "org.palladiosimulator.edp2.visualization.adapter";

    private static final String ADAPTER_CLASS_ATTRIBUTE = "class";
    private static final String ADAPTER_WIZARD_ATTRIBUTE = "wizard";

    private AbstractDataSource selectedSource;

    private IStatus selectionStatus;
    private final Status statusOK;
    private IAdapterWizard selectedAdapterWizard;

    protected SelectAdapterPage(final String pageName, final AbstractDataSource selectedSource) {
        super(pageName);
        this.selectedSource = selectedSource;
        setDescription("Select the Adapter you wish to add.");
        this.statusOK = new Status(IStatus.OK, "not_used", 0, "", null);
        this.selectionStatus = statusOK;
    }

    @Override
    public boolean canFlipToNextPage() {
     // we can only proceed if an adapter is available and has been chosen
        return updatePageStatus().isOK() && this.selectedAdapterWizard != null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets .Composite)
     */
    @Override
    public void createControl(final Composite parent) {
        // create the composite to hold the widgets
        final Composite composite = new Composite(parent, SWT.NONE);

        // create the desired layout for this wizard page
        final GridLayout gl = new GridLayout();
        composite.setLayout(gl);

        final Label label = new Label(composite, SWT.NONE);
        label.setText("Available Adapters:");

        final SashForm sashForm = new SashForm(composite, SWT.HORIZONTAL);
        GridData gd = new GridData(GridData.FILL_BOTH);
        gd.widthHint = 200;
        sashForm.setLayoutData(gd);

        initializeAdapterTableViewer(sashForm);

        // set the composite as the control for this page
        setControl(composite);
        updatePageStatus();
    }

    private void initializeAdapterTableViewer(SashForm sashForm) {
        TableViewer adapterViewer = new TableViewer(sashForm, SWT.BORDER);
        adapterViewer.setContentProvider(new IStructuredContentProvider() {

            @Override
            public void dispose() {
                // TODO Auto-generated method stub

            }

            @Override
            public Object[] getElements(final Object inputElement) {
                return getApplicableAdapters(SelectAdapterPage.this.selectedSource).toArray();
            }

            @Override
            public void inputChanged(final Viewer viewer, final Object oldInput, final Object newInput) {
                // TODO Auto-generated method stub

            }
        });
        adapterViewer.setLabelProvider(new ILabelProvider() {

            @Override
            public void addListener(final ILabelProviderListener listener) {
                // TODO Auto-generated method stub

            }

            @Override
            public void dispose() {
                // TODO Auto-generated method stub

            }

            @Override
            public Image getImage(final Object element) {
                // TODO Auto-generated method stub
                return null;
            }

            @Override
            public String getText(final Object element) {
                if (element != null) {
                    return ((IWizard) element).getWindowTitle();
                }
                return null;
            }

            @Override
            public boolean isLabelProperty(final Object element, final String property) {
                // TODO Auto-generated method stub
                return false;
            }

            @Override
            public void removeListener(final ILabelProviderListener listener) {
                // TODO Auto-generated method stub

            }
        });

        adapterViewer.setInput(getApplicableAdapters(this.selectedSource));
        adapterViewer.addSelectionChangedListener(this);
    }

    protected List<IAdapterWizard> getApplicableAdapters(final AbstractDataSource forSource) {
        List<IAdapterWizard> availableAdapters = new ArrayList<IAdapterWizard>();
        // checks the extension registry for all registered adapters and adds
        // them to the list
        final IConfigurationElement[] adapterExtensions = Platform.getExtensionRegistry().getConfigurationElementsFor(
                ADAPTER_EXTENSION_POINT_ID);
        for (final IConfigurationElement e : adapterExtensions) {
            Object w, o = null;
            try {
                w = e.createExecutableExtension(ADAPTER_WIZARD_ATTRIBUTE);
                o = e.createExecutableExtension(ADAPTER_CLASS_ATTRIBUTE);
                if (((AbstractAdapter) o).getDataSource().isCompatibleWith(forSource.getMetricDesciption())) {
                    availableAdapters.add((IAdapterWizard) w);
                }
            } catch (final CoreException ex) {
                LOGGER.log(Level.SEVERE, "Error in creating an Object referenced in an extension.");
                throw new RuntimeException();
            }
            LOGGER.log(Level.INFO, o.toString());
        }
        return availableAdapters;
    }

    /**
     * Method which is called when the "Next" Button in the Wizard is clicked. Must call
     * {@link IAdapterWizard#setSourceFromCaller(AbstractDataSource, SelectAdapterPage)} , where the
     * {@link AbstractDataSource} is the source handed from the RawMeasurements object, which was
     * selected in the first place and <code>this</code> a reference on this
     * {@link SelectAdapterPage}.
     */
    @Override
    public IWizardPage getNextPage() {
        IWizardPage nextPage = null;
        if (this.selectedAdapterWizard != null) {
            this.selectedAdapterWizard.setSourceFromCaller(this.selectedSource, this);
            this.selectedAdapterWizard.addPages();
            nextPage = this.selectedAdapterWizard.getStartingPage();
        }
        return nextPage;
    }

    @Override
    public void selectionChanged(final SelectionChangedEvent event) {
        this.selectionStatus = this.statusOK;
        final IStructuredSelection selection = (IStructuredSelection) event.getSelection();
        this.selectedAdapterWizard = null;
        if (selection == null) {
            this.selectionStatus = new Status(IStatus.ERROR, "", 0, "Must select an adapter to proceed.", null);
        } else {
            selectedAdapterWizard = (IAdapterWizard) selection.getFirstElement();
            LOGGER.log(Level.INFO, this.selectedAdapterWizard.getWindowTitle());
        }

        updatePageStatus();
        getContainer().updateButtons();

    }

    public IStatus updatePageStatus() {
        IStatus pageStatus = this.statusOK;
        switch (this.selectionStatus.getSeverity()) {
        case IStatus.OK:
            setErrorMessage(null);
            setMessage(this.selectionStatus.getMessage());
            pageStatus = this.statusOK;
            break;
        case IStatus.WARNING:
            setErrorMessage(null);
            setMessage(this.selectionStatus.getMessage(), WizardPage.WARNING);
            pageStatus = this.selectionStatus;
            break;
        case IStatus.INFO:
            setErrorMessage(null);
            setMessage(this.selectionStatus.getMessage(), WizardPage.INFORMATION);
            pageStatus = this.selectionStatus;
            break;
        default:
            setErrorMessage(this.selectionStatus.getMessage());
            setMessage(null);
            pageStatus = this.selectionStatus;
            break;
        }
        return pageStatus;
    }

    public void setAdapter(final AbstractAdapter adapter) {
        LOGGER.log(Level.INFO, "adapter of AdapterWizard set");
        AdapterWizard wizard = (AdapterWizard) getWizard();
        wizard.setAdapter(adapter);
    }

}
