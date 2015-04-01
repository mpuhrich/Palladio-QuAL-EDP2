package org.palladiosimulator.edp2.visualization.wizards;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.palladiosimulator.servicelevelobjective.ServiceLevelObjective;

/**
 * A {@link WizardPage} prompting the user to select a
 * {@link ServiceLevelObjective} from a list of available
 * {@link ServiceLevelObjective}. The selected {@link ServiceLevelObjective} is
 * forwarded to the {@link Wizard} controlling this page. The list of available
 * {@link ServiceLevelObjective} has to be added to the page via the
 * setAvailableSLOs method.
 * 
 * @author Andreas Flohre
 *
 */
public class SLODialogChooseSLOPage extends WizardPage implements
		ISelectionChangedListener {

	/**
	 * {@link TableViewer} for the possible choices of
	 * {@link ServiceLevelObjective}
	 */
	private TableViewer choiceViewer;

	/**
	 * A list of available {@link ServiceLevelObjective}
	 */
	private List<ServiceLevelObjective> availableSLOs = new ArrayList<ServiceLevelObjective>();

	/**
	 * The current {@link IStatus} based on the selection in the <choiceViewer>
	 */
	private IStatus selectionStatus;

	/**
	 * The 'OK'-Status, which signalizes everything is fine.
	 */
	private final Status statusOK;

	/**
	 * Constructor.
	 * 
	 * @param pageName
	 */
	protected SLODialogChooseSLOPage(String pageName) {
		super(pageName);
		this.setPageComplete(false);
		setDescription("Please select one Service Level Objective for visualization.");
		selectionStatus = new Status(IStatus.INFO, "not_used", 0,
				"Please select one Service Level Objective for visualization.",
				null);
		statusOK = new Status(IStatus.OK, "not_used", 0, "", null);
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
	}

	private void initializeChoiceViewer() {
		this.choiceViewer.setContentProvider(new IStructuredContentProvider() {
			@Override
			public void dispose() {
				// do nothing here
			}

			@Override
			public Object[] getElements(final Object inputElement) {
				return SLODialogChooseSLOPage.this.availableSLOs.toArray();
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
					// the elements in the list are of type
					// ServiceLevelObjective
					ServiceLevelObjective sequenceElement = (ServiceLevelObjective) element;
					final StringBuffer result = new StringBuffer();
					result.append("Service Level Objective: "
							+ sequenceElement.getName());
					return result.toString();
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

		this.choiceViewer.setInput(this.availableSLOs);
		this.choiceViewer.addSelectionChangedListener(this);
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
			ServiceLevelObjective slo = (ServiceLevelObjective) selection
					.getFirstElement();
			this.setSelectedSLOInWizard(slo);
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
			this.setPageComplete(true);
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
	 * Forwards the {@link ServiceLevelObjective} parameter to the
	 * {@link Wizard} controlling this page
	 * 
	 * @param slo
	 */
	private void setSelectedSLOInWizard(ServiceLevelObjective slo) {
		((SLOViewsWizard) this.getWizard()).setSelectedSLO(slo);

	}

	/**
	 * Sets the available {@link ServiceLevelObjective} list and initializes the
	 * choiceViewer.
	 * 
	 * @param availableSLOs
	 */
	public void setAvailableSLOs(List<ServiceLevelObjective> availableSLOs) {
		this.availableSLOs = availableSLOs;
		initializeChoiceViewer();
	}

}
