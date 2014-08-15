package org.palladiosimulator.edp2.visualization.wizards;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
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
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.palladiosimulator.edp2.datastream.AbstractDataSource;
import org.palladiosimulator.edp2.datastream.IDataSource;
import org.palladiosimulator.edp2.datastream.chaindescription.ChainDescription;
import org.palladiosimulator.edp2.datastream.configurable.IPropertyConfigurable;
import org.palladiosimulator.edp2.datastream.filter.AbstractAdapter;
import org.palladiosimulator.edp2.datastream.filter.AbstractFilter;
import org.palladiosimulator.edp2.visualization.AbstractVisualizationInput;

/**
 * Implementation of a {@link WizardPage} that contains a list of visualizations which are able to
 * display the selected data. The list contains both the basic defaults, i.e. registered
 * visualizations only, and defaults as described by extensions to the extension point
 * <code>org.palladiosimulator.edp2.visualization.defaultSequences</code>.
 *
 * @author Dominik Ernst
 */
public class SelectDefaultCombinationsPage extends WizardPage implements ISelectionChangedListener {

    /**
     * Logger for this class.
     */
    private static final Logger LOGGER = Logger.getLogger(SelectDefaultCombinationsPage.class.getCanonicalName());

    /**
     * Extension points for registered {@link AbstractFilter}, {@link AbstractAdapter} and
     * {@link JFreeChartVisualizationSingleDatastreamInput}-elements
     */
    private static final String DATASINK_EXTENSION_POINT_ID = "org.palladiosimulator.edp2.visualization.datasink";
    private static final String CHAIN_DESCRIPTION_EXTENSION_POINT_ID = "org.palladiosimulator.edp2.datastream.chainDescription";

    /**
     * Attribute names and element IDs as used in extension points.
     */
    private static final String ELEMENT_ID_DATASINK = "datasink";
    private static final String ELEMENT_ID_PROPERTY = "property";
    private static final String PROPERTY_KEY_ATTRIBUTE = "key";
    private static final String PROPERTY_VALUE_ATTRIBUTE = "value";
    private static final String DATASINK_ID_ATTRIBUTE = "sinkID";

    private static final String CLASS_ATTRIBUTE = "class";
    private static final String ID_ATTRIBUTE = "id";
    private static final String NAME_ATTRIBUTE = "name";

    /**
     * The source which was selected when the wizard was started.
     */
    private final IDataSource selectedSource;

    /**
     * The current {@link IStatus} based on the selection in the <choiceViewer>
     */
    private IStatus selectionStatus;

    /**
     * The 'OK'-Status, which signalizes everything is fine.
     */
    private final Status statusOK;

    /**
     * Viewer for the possible choices of Filter/Adapter/Chart combinations.
     */
    private TableViewer choiceViewer;

    /**
     * Constructor
     *
     * @param pageName
     *            the name of this {@link WizardPage}
     * @param selectedSource
     *            the source which was selected to invoke the wizard.
     */
    protected SelectDefaultCombinationsPage(final String pageName, final IDataSource selectedSource) {
        super(pageName);
        this.selectedSource = selectedSource;
        setDescription("Choose a combination of Filters/Adapters + Editor to display" + "the selected Data.");
        statusOK = new Status(IStatus.OK, "not_used", 0, "", null);
        selectionStatus = new Status(IStatus.INFO, "not_used", 0, "Please select a Visualization to proceed.", null);
    }

    private List<ChainDescription> getChainDescriptionsFromExtensions() {
        final Map<String, AbstractVisualizationInput<?>> charts = getRegisteredVisualizations();
        final LinkedList<ChainDescription> result = new LinkedList<ChainDescription>();

        final IConfigurationElement[] defaultSequencesExtensions = Platform.getExtensionRegistry()
                .getConfigurationElementsFor(CHAIN_DESCRIPTION_EXTENSION_POINT_ID);

        for (final IConfigurationElement e : defaultSequencesExtensions) {
            final IConfigurationElement[] sequence = e.getChildren();

            IPropertyConfigurable visualization = null;
            IDataSource lastDataSource = null;
            for (final IConfigurationElement element : sequence) {
                final IPropertyConfigurable configurable = createAndConfigureChainElement(charts, element);
                if (element.getName().equals(ELEMENT_ID_DATASINK)) {
                    visualization = configurable;
                } else if (configurable instanceof AbstractAdapter) {
                    final AbstractAdapter adapter = (AbstractAdapter) configurable;
                    if (lastDataSource != null) {
                        adapter.setDataSource(lastDataSource);
                    }
                    lastDataSource = adapter;
                }
            }

            final ChainDescription newChainDescription = new ChainDescription(
                    e.getAttribute(ID_ATTRIBUTE),
                    e.getAttribute(NAME_ATTRIBUTE),
                    lastDataSource,
                    visualization);
            result.add(newChainDescription);
        }
        return result;
    }

    /**
     * @param charts
     * @param element
     * @return
     */
    private IPropertyConfigurable createAndConfigureChainElement(
            final Map<String, AbstractVisualizationInput<?>> charts, final IConfigurationElement element) {
        final IPropertyConfigurable configurable = createChainElement(charts, element);
        final Map<String, Object> elementProperties = new HashMap<String, Object>(configurable.getProperties());
        for (final IConfigurationElement property : element.getChildren(ELEMENT_ID_PROPERTY)) {
            elementProperties.put(property.getAttribute(PROPERTY_KEY_ATTRIBUTE),
                    property.getAttribute(PROPERTY_VALUE_ATTRIBUTE));
        }
        configurable.setProperties(elementProperties);
        return configurable;
    }

    /**
     * @param charts
     * @param element
     * @return
     */
    private IPropertyConfigurable createChainElement(final Map<String, AbstractVisualizationInput<?>> charts,
            final IConfigurationElement element) {
        try {
            if (element.getName().equals(ELEMENT_ID_DATASINK)) {
                return charts.get(element.getAttribute(DATASINK_ID_ATTRIBUTE));
            } else if (element.getName().equals("filter")) {
                return (IPropertyConfigurable) element.createExecutableExtension("filterClass");
            }
        } catch (final CoreException e1) {
            LOGGER.log(Level.SEVERE, "Error in creating an Object referenced in an extension.");
            LOGGER.log(Level.SEVERE, e1.getMessage());
            throw new RuntimeException(e1.getMessage());
        }
        throw new IllegalArgumentException("Configuration element found which is not supported");
    }

    private Map<String, AbstractVisualizationInput<?>> getRegisteredVisualizations() {
        final Map<String, AbstractVisualizationInput<?>> result = new HashMap<String, AbstractVisualizationInput<?>>();
        final IConfigurationElement[] visualizationExtensions = Platform.getExtensionRegistry()
                .getConfigurationElementsFor(DATASINK_EXTENSION_POINT_ID);
        for (final IConfigurationElement e : visualizationExtensions) {
            try {
                final String id = e.getAttribute(ID_ATTRIBUTE);
                final Object o = e.createExecutableExtension(CLASS_ATTRIBUTE);
                result.put(id, (AbstractVisualizationInput<?>) o);
            } catch (final CoreException e1) {
                LOGGER.log(Level.SEVERE, "Error in creating an Object referenced in an extension.");
                LOGGER.log(Level.SEVERE, e1.getMessage());
                throw new RuntimeException();
            }
        }
        return result;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.eclipse.jface.wizard.WizardPage#canFlipToNextPage()
     */
    @Override
    public boolean canFlipToNextPage() {
        ((DefaultViewsWizard) getWizard()).setFinishable(updatePageStatus().isOK());
        return updatePageStatus().isOK();
    }

    /*
     * (non-Javadoc)
     *
     * @see org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets .Composite)
     */
    @Override
    public void createControl(final Composite parent) {
        // create the composite to hold the widgets
        GridData gd;
        final Composite composite = new Composite(parent, SWT.NONE);

        // create the desired layout for this wizard page
        final GridLayout gl = new GridLayout();
        composite.setLayout(gl);

        final Label label = new Label(composite, SWT.NONE);
        label.setText("Available Choices:");

        final SashForm sashForm = new SashForm(composite, SWT.HORIZONTAL);
        gd = new GridData(GridData.FILL_BOTH);
        gd.widthHint = 200;
        sashForm.setLayoutData(gd);

        choiceViewer = new TableViewer(sashForm, SWT.BORDER);
        choiceViewer.setContentProvider(new IStructuredContentProvider() {
            @Override
            public void dispose() {
                // do nothing here
            }

            @Override
            public Object[] getElements(final Object inputElement) {
                return getApplicableSequences(selectedSource).toArray();
            }

            @Override
            public void inputChanged(final Viewer viewer, final Object oldInput, final Object newInput) {
                // do nothing here
            }
        });
        choiceViewer.setLabelProvider(new ILabelProvider() {

            @Override
            public void addListener(final ILabelProviderListener listener) {
                // do nothing here
            }

            @Override
            public void dispose() {
                // do nothing here
            }

            @Override
            public Image getImage(final Object element) {
                // do nothing here
                return null;
            }

            @Override
            public String getText(final Object element) {
                if (element != null) {
                    // the elements in the list are of type DefaultSequence
                    final ChainDescription sequenceElement = (ChainDescription) element;
                    final StringBuilder shownString = new StringBuilder(sequenceElement.getSequenceName());
                    // return the sequenceName as labels
                    return shownString.toString();
                }
                return null;
            }

            @Override
            public boolean isLabelProperty(final Object element, final String property) {
                // not used
                return false;
            }

            @Override
            public void removeListener(final ILabelProviderListener listener) {
                // not used
            }
        });

        choiceViewer.setInput(getApplicableSequences(selectedSource));
        choiceViewer.addSelectionChangedListener(this);

        // set the composite as the control for this page
        setControl(composite);
        updatePageStatus();
    }

    /**
     * Method that checks if a given {@link AbstractDataSource} can be processed by any registered
     * {@link ChainDescription}-objects and returns the possible results as a list.
     *
     * @param forSource
     *            the {@link AbstractDataSource} for which sequences are returned
     * @return list of {@link ChainDescription}-objects that can process the given source.
     */
    private ArrayList<ChainDescription> getApplicableSequences(final IDataSource forSource) {
        final ArrayList<ChainDescription> applicableSequences = new ArrayList<ChainDescription>();

        for (final ChainDescription seq : getChainDescriptionsFromExtensions()) {
            // TODO FIXME
            // if (seq.getSize() > 0) {
            // if (seq.getFirstSequenceElement().canAccept(forSource)) {
            // applicableSequences.add(seq);
            // }
            // } else {
            // if (seq.getVisualization().canAccept(forSource)) {
            // applicableSequences.add(seq);
            // }
            // }
            applicableSequences.add(seq);
        }

        return applicableSequences;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(
     * org.eclipse.jface.viewers.SelectionChangedEvent)
     */
    @Override
    public void selectionChanged(final SelectionChangedEvent event) {
        selectionStatus = statusOK;
        final IStructuredSelection selection = (IStructuredSelection) event.getSelection();
        if (selection.isEmpty()) {
            selectionStatus = new Status(IStatus.ERROR, "not_used", 0, "Please select a Visualization to proceed.",
                    null);
        } else {
            final int index = choiceViewer.getTable().getSelectionIndex();
            setSelectedDefault(getApplicableSequences(selectedSource).get(index));
        }

        updatePageStatus();
    }

    /**
     * Method which handles the status of the whole {@link WizardPage} based on the different states
     * resulting from inputs.
     *
     * @return the page Status
     */
    public IStatus updatePageStatus() {
        IStatus pageStatus = statusOK;
        ((DefaultViewsWizard) getWizard()).setFinishable(false);
        switch (selectionStatus.getSeverity()) {
        case IStatus.OK:
            setErrorMessage(null);
            setMessage(selectionStatus.getMessage());
            pageStatus = statusOK;
            ((DefaultViewsWizard) getWizard()).setFinishable(true);
            break;
        case IStatus.WARNING:
            setErrorMessage(null);
            setMessage(selectionStatus.getMessage(), WizardPage.WARNING);
            pageStatus = selectionStatus;
            break;
        case IStatus.INFO:
            setErrorMessage(null);
            setMessage(selectionStatus.getMessage(), WizardPage.INFORMATION);
            pageStatus = selectionStatus;
            break;
        default:
            setErrorMessage(selectionStatus.getMessage());
            setMessage(null);
            pageStatus = selectionStatus;
            break;
        }
        getContainer().updateButtons();
        return pageStatus;
    }

    /**
     * Forwards the chosen variant to the wizard.
     *
     * @param selection
     */
    public void setSelectedDefault(final ChainDescription selection) {
        ((DefaultViewsWizard) getWizard()).setSelectedDefault(selection);
    }

}
