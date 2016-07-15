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
import org.palladiosimulator.edp2.datastream.filter.AbstractFilter;
import org.palladiosimulator.edp2.datastream.filter.IFilter;

/**
 * @author Dominik Ernst, Florian Rosenthal
 */
public class SelectFilterPage extends WizardPage implements ISelectionChangedListener {

    private static final Logger LOGGER = Logger.getLogger(SelectFilterPage.class.getCanonicalName());

    private static final String FILTER_EXTENSION_POINT_ID = "org.palladiosimulator.edp2.visualization.filter";

    private static final String FILTER_CLASS_ATTRIBUTE = "class";
    private static final String FILTER_WIZARD_ATTRIBUTE = "wizard";

    private static final String FILTER_NAME = "name";

    private final AbstractDataSource selectedSource;
    private IStatus selectionStatus;
    private final Status statusOK;
    private IFilterWizard selectedFilterWizard;
    
    protected SelectFilterPage(final String pageName, final AbstractDataSource selectedSource) {
        super(pageName);
        this.selectedSource = selectedSource;
        setDescription("Select the Filter you wish to add.");
        this.statusOK = new Status(IStatus.OK, "not_used", 0, "", null);
        this.selectionStatus = this.statusOK;
    }

    @Override
    public boolean canFlipToNextPage() {
        // we can only proceed if a filter is available and has been chosen
        return updatePageStatus().isOK() && this.selectedFilterWizard != null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets .Composite)
     */
    @Override
    public void createControl(final Composite parent) {
        // create the composite to hold the widgets
        Composite composite = new Composite(parent, SWT.NONE);

        // create the desired layout for this wizard page
        GridLayout gl = new GridLayout();
        composite.setLayout(gl);

        Label label = new Label(composite, SWT.NONE);
        label.setText("Available Filters:");

        SashForm sashForm = new SashForm(composite, SWT.HORIZONTAL);
        GridData gd = new GridData(GridData.FILL_BOTH);
        gd.widthHint = 200;
        sashForm.setLayoutData(gd);

        initializeFilterTableViewer(sashForm);

        // set the composite as the control for this page
        setControl(composite);
        updatePageStatus();
    }

    private void initializeFilterTableViewer(SashForm sashForm) {
        TableViewer filterViewer = new TableViewer(sashForm, SWT.BORDER);
        filterViewer.setContentProvider(new IStructuredContentProvider() {

            @Override
            public void dispose() {
                // TODO Auto-generated method stub

            }

            @Override
            public Object[] getElements(final Object inputElement) {
                return getApplicableFilters(SelectFilterPage.this.selectedSource).toArray();
            }

            @Override
            public void inputChanged(final Viewer viewer, final Object oldInput, final Object newInput) {
                // TODO Auto-generated method stub

            }
        });
        filterViewer.setLabelProvider(new ILabelProvider() {

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

        filterViewer.setInput(getApplicableFilters(this.selectedSource));
        filterViewer.addSelectionChangedListener(this);
    }

    protected List<IFilterWizard> getApplicableFilters(final AbstractDataSource forSource) {
        List<IFilterWizard> availableFilters = new ArrayList<IFilterWizard>();
        // checks the extension registry for all registered filters and adds
        // them to the list
        final IConfigurationElement[] filterExtensions = Platform.getExtensionRegistry().getConfigurationElementsFor(
                FILTER_EXTENSION_POINT_ID);
        for (final IConfigurationElement e : filterExtensions) {
            Object w, o = null;
            try {
                w = e.createExecutableExtension(FILTER_WIZARD_ATTRIBUTE);
                o = e.createExecutableExtension(FILTER_CLASS_ATTRIBUTE);
                if (((IFilter) o).canAccept(forSource)) {
                	IFilterWizard wizard = (IFilterWizard) w;
                	wizard.setFilterFromCaller((IFilter) o);
                	if(e.getAttribute(FILTER_NAME) != null) {
                	    wizard.setName(e.getAttribute(FILTER_NAME));
                	}
                    availableFilters.add(wizard);
                }
            } catch (final CoreException e1) {
                LOGGER.log(Level.SEVERE, "Error in creating an Object referenced in an extension.");
                throw new RuntimeException();
            }
            LOGGER.log(Level.INFO, o.toString());
        }
        return availableFilters;
    }

    /**
     * Method which is called when the "Next" Button in the Wizard is clicked. Must call
     * {@link IFilterWizard#setSourceFromCaller(AbstractDataSource, SelectFilterPage)}, where the
     * {@link AbstractDataSource} is the source handed from the RawMeasurements object, which was
     * selected in the first place and SelectFilterPage is a reference to {@link this} page.
     */
    @Override
    public IWizardPage getNextPage() {
        IWizardPage nextPage = null;
        if (this.selectedFilterWizard != null) {
            this.selectedFilterWizard.setSourceFromCaller(selectedSource, this);
            this.selectedFilterWizard.addPages();
            nextPage = this.selectedFilterWizard.getStartingPage();
        }
        return nextPage;
    }

    @Override
    public void selectionChanged(final SelectionChangedEvent event) {
        this.selectionStatus = this.statusOK;
        final IStructuredSelection selection = (IStructuredSelection) event.getSelection();
        this.selectedFilterWizard = null;
        if (selection == null) {
            this.selectionStatus = new Status(IStatus.ERROR, "", 0, "Must select a Filter to proceed.", null);
        } else {
            this.selectedFilterWizard = (IFilterWizard) selection.getFirstElement();
            LOGGER.log(Level.INFO, this.selectedFilterWizard.getWindowTitle());
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

    public void setFilter(IFilter filter) {
        LOGGER.log(Level.INFO, "Filter of FilterWizard set");
        FilterWizard wizard = (FilterWizard) getWizard();
        wizard.setFilter(filter);
    }

}
