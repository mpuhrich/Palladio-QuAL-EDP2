package org.palladiosimulator.edp2.visualization.wizards;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
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
import org.palladiosimulator.edp2.datastream.IDataSource;
import org.palladiosimulator.edp2.datastream.chaindescription.ChainDescription;
import org.palladiosimulator.edp2.datastream.configurable.IPropertyConfigurable;
import org.palladiosimulator.edp2.datastream.filter.AbstractAdapter;
import org.palladiosimulator.edp2.datastream.filter.AbstractFilter;
import org.palladiosimulator.edp2.visualization.AbstractVisualizationInput;

/**
 * Implementation of a {@link WizardPage} that contains a list of visualizations
 * which are able to display the selected data. The list contains both the basic
 * defaults, i.e. registered visualizations only, and defaults as described by
 * extensions to the extension point
 * <code>org.palladiosimulator.edp2.visualization.defaultSequences</code>.
 *
 * @author Dominik Ernst, adapted by Florian Rosenthal, Andreas Flohre
 */

public class SLOSelectDefaultCombinationsPage extends WizardPage implements
		ISelectionChangedListener {

	private ChainDescription selectedDescription;

	/**
	 * Logger for this class.
	 */
	private static final Logger LOGGER = Logger
			.getLogger(SelectDefaultCombinationsPage.class.getCanonicalName());

	/**
	 * Extension points for registered {@link AbstractFilter},
	 * {@link AbstractAdapter} and
	 * {@link JFreeChartVisualizationSingleDatastreamInput}-elements
	 */
	private static final String DATASINK_EXTENSION_POINT_ID = "org.palladiosimulator.edp2.visualization.datasink";
	private static final String CHAIN_DESCRIPTION_EXTENSION_POINT_ID = "org.palladiosimulator.edp2.datastream.chainDescription";

	/**
	 * Attribute names and element IDs as used in extension points.
	 */
	private static final String ELEMENT_ID_DATASINK = "datasink";
	private static final String ELEMENT_ID_FILTER = "filter";
	private static final String ELEMENT_ID_PROPERTY = "property";
	private static final String PROPERTY_KEY_ATTRIBUTE = "key";
	private static final String PROPERTY_VALUE_ATTRIBUTE = "value";
	private static final String DATASINK_ID_ATTRIBUTE = "sinkID";
	private static final String FILTER_CLASS_ATTRIBUTE = "filterClass";

	private static final String CLASS_ATTRIBUTE = "class";
	private static final String ID_ATTRIBUTE = "id";
	private static final String NAME_ATTRIBUTE = "name";

	/**
	 * Identifiers for service level objective visualizations.
	 */
	private static final String SLO_VISUALIZATION_QUANTITATVE = "SLOQuantitative";
	private static final String SLO_VISUALIZATION_QUALITATIVE = "SLOQualitative";

	/**
	 * The source which was selected when the wizard was started.
	 */
	private IDataSource selectedSource;

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
	 * Variable determining whether only Service Level Objective visualizations
	 * should be presented for selection by the user.
	 */
	private boolean showSLOonly;

	private List<ChainDescription> applicableSequences;

	/**
	 * Constructor. Used if this page is invoked without assigning a source.
	 * 
	 * @param pageName
	 *            the name of this {@link WizardPage}.
	 */
	protected SLOSelectDefaultCombinationsPage(final String pageName) {
		super(pageName);
		setDescription("Choose a combination of Filters/Adapters + Editor to display"
				+ " the selected Data.");
		statusOK = new Status(IStatus.OK, "not_used", 0, "", null);
		selectionStatus = new Status(IStatus.INFO, "not_used", 0,
				"Please select a Visualization to proceed.", null);
	}

	/**
	 * Constructor
	 *
	 * @param pageName
	 *            the name of this {@link WizardPage}
	 * @param selectedSource
	 *            the source which was selected to invoke the wizard.
	 */
	protected SLOSelectDefaultCombinationsPage(final String pageName,
			IDataSource selectedSource) {
		super(pageName);
		this.selectedSource = selectedSource;
		this.applicableSequences = getApplicableSequences();
		setDescription("Choose a combination of Filters/Adapters + Editor to display"
				+ " the selected Data.");
		statusOK = new Status(IStatus.OK, "not_used", 0, "", null);
		selectionStatus = new Status(IStatus.INFO, "not_used", 0,
				"Please select a Visualization to proceed.", null);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.wizard.WizardPage#canFlipToNextPage()
	 */
	@Override
	public boolean canFlipToNextPage() {
		if (((SLOViewsWizard) getWizard()).isStartedFromExperimentRun()) {
			// page was invoked from a double click on an experiment run, i.e.
			// it is the last page in the dialog
			return false;
		} else {
			if (selectedDescription != null) {
				if (selectedDescription.getChainID().contains(
						SLO_VISUALIZATION_QUALITATIVE)
						|| selectedDescription.getChainID().contains(
								SLO_VISUALIZATION_QUANTITATVE)) {
					// page was invoked from double clicking a measurement and a
					// SLO visualization was chosen. The visualization
					// parameters need to be set in the following pages
					return true;
				}
			} else {
				return (selectionStatus.isOK());
			}
		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets
	 * .Composite)
	 */
	@Override
	public void createControl(final Composite parent) {
		// create the composite to hold the widgets
		Composite composite = new Composite(parent, SWT.NONE);

		// create the desired layout for this wizard page
		GridLayout gl = new GridLayout();
		composite.setLayout(gl);

		Label label = new Label(composite, SWT.NONE);
		label.setText("Available Choices:");

		SashForm sashForm = new SashForm(composite, SWT.HORIZONTAL);
		GridData gd = new GridData(GridData.FILL_BOTH);
		gd.widthHint = 200;
		sashForm.setLayoutData(gd);

		this.choiceViewer = new TableViewer(sashForm, SWT.BORDER);
		initializeChoiceViewer();

		// set the composite as the control for this page
		setControl(composite);
		// updatePageStatus();
	}

	private void initializeChoiceViewer() {
		this.choiceViewer.setContentProvider(new IStructuredContentProvider() {
			@Override
			public void dispose() {
				// do nothing here
			}

			@Override
			public Object[] getElements(final Object inputElement) {
				return SLOSelectDefaultCombinationsPage.this.applicableSequences
						.toArray();
			}

			@Override
			public void inputChanged(final Viewer viewer,
					final Object oldInput, final Object newInput) {
				// do nothing here
			}
		});
		this.choiceViewer.setLabelProvider(new ILabelProvider() {

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
				return null;
			}

			@Override
			public String getText(final Object element) {
				if (element != null) {
					// the elements in the list are of type ChainDescription
					ChainDescription sequenceElement = (ChainDescription) element;
					return sequenceElement.getChainName();
				}
				return null;
			}

			@Override
			public boolean isLabelProperty(final Object element,
					final String property) {
				// not used
				return false;
			}

			@Override
			public void removeListener(final ILabelProviderListener listener) {
				// not used
			}
		});

		this.choiceViewer.setInput(this.applicableSequences);
		this.choiceViewer.addSelectionChangedListener(this);
	}

	/**
	 * Method that checks if a the currently selected data source can be
	 * processed by any registered {@link ChainDescription}-objects and returns
	 * the possibilities in a list.
	 *
	 * @return list of {@link ChainDescription}-objects that can process the
	 *         current data source.
	 */
	private List<ChainDescription> getApplicableSequences() {
		List<ChainDescription> chainDescriptions = getApplicableChainDescriptionsFromExtensions();
		if (this.showSLOonly) {
			// show only slo visualizations, remove other
			Iterator<ChainDescription> iter = chainDescriptions.iterator();
			List<ChainDescription> chainDescriptionsToRemove = new ArrayList<ChainDescription>();
			while (iter.hasNext()) {
				ChainDescription currentChainDescription = iter.next();
				if (!currentChainDescription.getChainID().contains(
						SLO_VISUALIZATION_QUALITATIVE)
						&& !currentChainDescription.getChainID().contains(
								SLO_VISUALIZATION_QUANTITATVE)) {
					chainDescriptionsToRemove.add(currentChainDescription);
				}
			}
			for (ChainDescription currentDescription : chainDescriptionsToRemove) {
				chainDescriptions.remove(currentDescription);
			}
		}
		return chainDescriptions;
	}

	private List<ChainDescription> getApplicableChainDescriptionsFromExtensions() {
		List<ChainDescription> result = new ArrayList<ChainDescription>();

		Map<String, AbstractVisualizationInput<?>> charts = getRegisteredVisualizations();
		IConfigurationElement[] chainDescriptionExtensions = Platform
				.getExtensionRegistry().getConfigurationElementsFor(
						CHAIN_DESCRIPTION_EXTENSION_POINT_ID);

		for (IConfigurationElement e : chainDescriptionExtensions) {

			IPropertyConfigurable visualization = null;
			IDataSource lastDataSource = null;
			boolean isApplicable = true;
			for (IConfigurationElement child : e.getChildren()) {
				IPropertyConfigurable configurable = createAndConfigureChainElement(
						charts, child);
				if (child.getName().equals(ELEMENT_ID_DATASINK)) {
					visualization = configurable;
				} else if (configurable instanceof AbstractAdapter) { // at
																		// least
																		// one
																		// filter
																		// in
																		// chain
					AbstractAdapter adapter = (AbstractAdapter) configurable;

					if (!this.selectedSource.isCompatibleWith(adapter
							.getMetricDesciption())) {
						isApplicable = false; // filter is not applicable to
												// selected data source
						break;
					}
					if (lastDataSource != null) {
						adapter.setDataSource(lastDataSource);
					}
					lastDataSource = adapter;
				}
			}
			if (isApplicable) { // only if (optional) filters are applicable to
								// data source
				final ChainDescription newChainDescription = new ChainDescription(
						e.getAttribute(ID_ATTRIBUTE),
						e.getAttribute(NAME_ATTRIBUTE), lastDataSource,
						visualization);
				result.add(newChainDescription);
			}
		}
		return result;
	}

	private IPropertyConfigurable createAndConfigureChainElement(
			final Map<String, AbstractVisualizationInput<?>> charts,
			final IConfigurationElement element) {
		final IPropertyConfigurable configurable = createChainElement(charts,
				element);
		final Map<String, Object> elementProperties = new HashMap<String, Object>(
				configurable.getProperties());
		for (final IConfigurationElement property : element
				.getChildren(ELEMENT_ID_PROPERTY)) {
			elementProperties.put(
					property.getAttribute(PROPERTY_KEY_ATTRIBUTE),
					property.getAttribute(PROPERTY_VALUE_ATTRIBUTE));
		}
		configurable.setProperties(elementProperties);
		return configurable;
	}

	private IPropertyConfigurable createChainElement(
			final Map<String, AbstractVisualizationInput<?>> charts,
			final IConfigurationElement element) {
		try {
			if (element.getName().equals(ELEMENT_ID_DATASINK)) {
				return charts.get(element.getAttribute(DATASINK_ID_ATTRIBUTE));
			} else if (element.getName().equals(ELEMENT_ID_FILTER)) {
				return (IPropertyConfigurable) element
						.createExecutableExtension(FILTER_CLASS_ATTRIBUTE);
			}
		} catch (final CoreException e1) {
			LOGGER.log(Level.SEVERE,
					"Error in creating an Object referenced in an extension.");
			LOGGER.log(Level.SEVERE, e1.getMessage());
			throw new RuntimeException(e1.getMessage());
		}
		throw new IllegalArgumentException(
				"Configuration element found which is not supported");
	}

	private Map<String, AbstractVisualizationInput<?>> getRegisteredVisualizations() {
		Map<String, AbstractVisualizationInput<?>> result = new HashMap<String, AbstractVisualizationInput<?>>();
		IConfigurationElement[] visualizationExtensions = Platform
				.getExtensionRegistry().getConfigurationElementsFor(
						DATASINK_EXTENSION_POINT_ID);
		for (IConfigurationElement e : visualizationExtensions) {
			try {

				String id = e.getAttribute(ID_ATTRIBUTE);
				AbstractVisualizationInput<?> visualization = (AbstractVisualizationInput<?>) e
						.createExecutableExtension(CLASS_ATTRIBUTE);
				result.put(id, visualization);
			} catch (CoreException e1) {
				LOGGER.log(
						Level.SEVERE,
						"Error in creating a Visualization referenced in an extension: Respective Id is "
								+ e.getAttribute(ID_ATTRIBUTE) + ".");
				LOGGER.log(Level.SEVERE, e1.getMessage());
				throw new RuntimeException();
			}
		}
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(
	 * org.eclipse.jface.viewers.SelectionChangedEvent)
	 */
	@Override
	public void selectionChanged(final SelectionChangedEvent event) {
		selectionStatus = statusOK;
		final IStructuredSelection selection = (IStructuredSelection) event
				.getSelection();
		if (selection.isEmpty()) {
			selectionStatus = new Status(IStatus.ERROR, "not_used", 0,
					"Please select a Visualization to proceed.", null);
		} else {
			final int index = choiceViewer.getTable().getSelectionIndex();
			this.selectedDescription = this.applicableSequences.get(index);
			setSelectedDefault(selectedDescription);
			selectionStatus = statusOK;
		}
		updatePageStatus();
	}

	/**
	 * Method which handles the status of the whole {@link WizardPage} based on
	 * the different states resulting from inputs.
	 *
	 * @return the page Status
	 */
	public IStatus updatePageStatus() {
		IStatus pageStatus = statusOK;
		((SLOViewsWizard) getWizard()).setFinishable(false);
		switch (selectionStatus.getSeverity()) {
		case IStatus.OK:
			setErrorMessage(null);
			setMessage(selectionStatus.getMessage());
			pageStatus = statusOK;
			if ((!selectedDescription.getChainID().contains(
					SLO_VISUALIZATION_QUALITATIVE))
					&& (!selectedDescription.getChainID().contains(
							SLO_VISUALIZATION_QUANTITATVE))) {
				// page was invoked by double clicking on a measurement and no
				// SLO visualization was selected, dialog can be finished
				((SLOViewsWizard) getWizard()).setFinishable(true);
			} else {
				if (((SLOViewsWizard) getWizard()).isStartedFromExperimentRun()) {
					// page was invoked by double clicking on an experiment run,
					// i.e. this page is the last one in the dialog, and a SLO
					// visualization was selected
					((SLOViewsWizard) getWizard()).setFinishable(true);
				} else {
					// page was invoked by double clicking on a measurement,
					// i.e. it is the first page in the dialog, and a SLO
					// visualization was selected
					this.setPageComplete(true);
					((SLOViewsWizard) getWizard()).setFinishable(false);
				}
			}
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
		((SLOViewsWizard) getWizard()).setSelectedDefault(selection);
	}

	/**
	 * Initializes the page with a new {@link IDataSource} and a new showSLOonly
	 * value.
	 * 
	 * @param selectedSource
	 *            the new source
	 * @param showSLOonly
	 *            the new value for this.showSLOonly
	 */
	public void initializePage(IDataSource selectedSource, boolean showSLOonly) {
		this.selectedSource = selectedSource;
		this.showSLOonly = showSLOonly;
		this.applicableSequences = getApplicableSequences();
		initializeChoiceViewer();
	}

	public void setShowSLOonly(boolean showSLOonly) {
		this.showSLOonly = showSLOonly;
		initializeChoiceViewer();
	}
}
