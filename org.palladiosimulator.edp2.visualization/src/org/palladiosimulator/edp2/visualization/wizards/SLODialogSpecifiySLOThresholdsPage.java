package org.palladiosimulator.edp2.visualization.wizards;

import javax.measure.Measure;
import javax.measure.quantity.Quantity;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.fieldassist.ControlDecoration;
import org.eclipse.jface.fieldassist.FieldDecorationRegistry;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Scale;
import org.eclipse.swt.widgets.Text;
import org.palladiosimulator.servicelevelobjective.LinearFuzzyThreshold;
import org.palladiosimulator.servicelevelobjective.ServiceLevelObjective;
import org.palladiosimulator.servicelevelobjective.Threshold;

/**
 * A {@link WizardPage} prompting the user to enter upper, lower and if
 * necessary, soft upper and soft lower thresholds for a selected
 * {@link ServiceLevelObjective}. All inputs are checked for correctness.
 * 
 * @author Andreas Flohre
 *
 */
@SuppressWarnings(value = { "unchecked" })
public class SLODialogSpecifiySLOThresholdsPage extends WizardPage implements
		SelectionListener {

	/**
	 * Time interval for qualitative SLO visualization, i.e. for calculating
	 * fulfillment ratio.
	 */
	private double selectedTimestepInterval = 10;

	/**
	 * Scale defining timestep.
	 */
	private Scale scale;

	/**
	 * The selected {@link ServiceLevelObjective} from the
	 * {@link SLODialogChooseSLOPage}
	 */
	private ServiceLevelObjective selectedSLO;

	/**
	 * Thresholds
	 */
	private Measure<?, Quantity> hardLowerThreshold;
	private Measure<?, Quantity> hardUpperThreshold;
	private Measure<?, Quantity> softLowerThreshold;
	private Measure<?, Quantity> softUpperThreshold;

	/**
	 * Booleans specifying whether a threshold limit is set or not.
	 */
	private boolean hardLowerThresholdSet = false;
	private boolean hardUpperThresholdSet = false;
	private boolean softLowerThresholdSet = false;
	private boolean softUpperThresholdSet = false;

	/**
	 * UI widget elements.
	 */
	Label labelUpperThreshold;
	Text textUpperThreshold;
	Label labelLowerThreshold;
	Text textLowerThreshold;
	Label labelSoftUpperThreshold;
	Text textSoftUpperThreshold;
	Label labelSoftLowerThreshold;
	Text textSoftLowerThreshold;

	/**
	 * The current {@link IStatus} based on the selection in the <choiceViewer>
	 */
	private IStatus inputStatus;

	/**
	 * The 'OK'-Status, which signalizes everything is fine.
	 */
	private final Status statusOK;

	/**
	 * Constructor.
	 * 
	 * @param pageName
	 */
	protected SLODialogSpecifiySLOThresholdsPage(String pageName) {
		super(pageName);
		this.setPageComplete(false);
		setDescription("Please specify the lower and upper thresholds of the Service Level Objective.");
		inputStatus = new Status(
				IStatus.INFO,
				"not_used",
				0,
				"Please specify the lower and upper thresholds of the Service Level Objective.",
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

		// create labels and input text fields
		labelLowerThreshold = new Label(composite, SWT.NULL);
		labelLowerThreshold.setText("Lower threshold: [" + "]: ");

		textLowerThreshold = new Text(composite, SWT.SINGLE | SWT.BORDER);

		final ControlDecoration decorLower = new ControlDecoration(
				textLowerThreshold, SWT.CENTER);

		textLowerThreshold.addListener(SWT.Modify, new InputListener(
				textLowerThreshold, decorLower, "hardLowerThresholdSet"));

		labelUpperThreshold = new Label(composite, SWT.NULL);
		labelUpperThreshold.setText("Upper threshold: [" + "]: ");

		textUpperThreshold = new Text(composite, SWT.SINGLE | SWT.BORDER);
		final ControlDecoration decorUpper = new ControlDecoration(
				textUpperThreshold, SWT.CENTER);

		textUpperThreshold.addListener(SWT.Modify, new InputListener(
				textUpperThreshold, decorUpper, "hardUpperThresholdSet"));

		labelSoftUpperThreshold = new Label(composite, SWT.NULL);
		labelSoftUpperThreshold.setVisible(false);
		labelSoftUpperThreshold.setText("Soft upper threshold: [" + "]: ");
		textSoftUpperThreshold = new Text(composite, SWT.SINGLE | SWT.BORDER);
		textSoftUpperThreshold.setVisible(false);
		final ControlDecoration decorSoftUpper = new ControlDecoration(
				textSoftUpperThreshold, SWT.CENTER);

		textSoftUpperThreshold.addListener(SWT.Modify,
				new InputListener(textSoftUpperThreshold, decorSoftUpper,
						"softUpperThresholdSet"));

		labelSoftLowerThreshold = new Label(composite, SWT.NULL);
		labelSoftLowerThreshold.setVisible(false);
		labelSoftLowerThreshold.setText("Soft lower threshold: [" + "]: ");

		textSoftLowerThreshold = new Text(composite, SWT.SINGLE | SWT.BORDER);
		textSoftLowerThreshold.setVisible(false);
		final ControlDecoration decorSoftLower = new ControlDecoration(
				textSoftLowerThreshold, SWT.CENTER);

		textSoftLowerThreshold.addListener(SWT.Modify,
				new InputListener(textSoftLowerThreshold, decorSoftLower,
						"softLowerThresholdSet"));
		Label scaleLabel = new Label(composite, SWT.NULL);
		scaleLabel
				.setText("Specify the time interval for qualitative Service Level Objective fulfillment calculation [s]:");
		scale = new Scale(composite, 0);
		scale.setSelection(10);
		scale.setMinimum(1);
		scale.setToolTipText("" + scale.getSelection());
		scale.addSelectionListener(this);
		// set the composite as the control for this page
		setControl(composite);
	}

	/**
	 * Inner class handling user input. Checks input for correctness and sets
	 * the threshold values accordingly.
	 *
	 */
	private class InputListener implements Listener {
		private Text textInput;
		private ControlDecoration controlDecoration;
		private String thresholdReference;

		/**
		 * Constructor.
		 * 
		 * @param text
		 *            The text field listened to.
		 * @param controlDecoration
		 *            The control decoration applied to the text field.
		 * @param thresholdReference
		 *            String specifying which threshold the text field is
		 *            assigned to.
		 */
		public InputListener(Text text, ControlDecoration controlDecoration,
				String thresholdReference) {
			this.textInput = text;
			this.controlDecoration = controlDecoration;
			this.thresholdReference = thresholdReference;
		}

		public void handleEvent(Event event) {
			try {
				String text = textInput.getText();
				double value = Double.valueOf(text);
				controlDecoration.hide();
				if (this.thresholdReference.equals("hardLowerThresholdSet")) {
					hardLowerThresholdSet = true;
					hardLowerThreshold = Measure.valueOf(value,
							hardLowerThreshold.getUnit());
					selectedSLO.getLowerThreshold().setThresholdLimit(
							hardLowerThreshold);

					checkInputForCorrectness();
				}
				if (this.thresholdReference.equals("hardUpperThresholdSet")) {
					hardUpperThresholdSet = true;
					hardUpperThreshold = Measure.valueOf(value,
							hardUpperThreshold.getUnit());
					selectedSLO.getUpperThreshold().setThresholdLimit(
							hardUpperThreshold);
					checkInputForCorrectness();
				}
				if (this.thresholdReference.equals("softUpperThresholdSet")) {
					softUpperThresholdSet = true;
					softUpperThreshold = Measure.valueOf(value,
							softUpperThreshold.getUnit());
					if (selectedSLO.getUpperThreshold() instanceof LinearFuzzyThreshold) {
						((LinearFuzzyThreshold) selectedSLO.getUpperThreshold())
								.setSoftLimit(softUpperThreshold);
					}
					checkInputForCorrectness();

				}
				if (this.thresholdReference.equals("softLowerThresholdSet")) {
					softLowerThresholdSet = true;
					softLowerThreshold = Measure.valueOf(value,
							softLowerThreshold.getUnit());
					if (selectedSLO.getLowerThreshold() instanceof LinearFuzzyThreshold) {
						((LinearFuzzyThreshold) selectedSLO.getLowerThreshold())
								.setSoftLimit(softLowerThreshold);
					}
					checkInputForCorrectness();
				}

				// set page complete only if all thresholds are set
				if ((hardLowerThresholdSet && hardUpperThresholdSet
						&& softLowerThreshold == null && softUpperThreshold == null)
						|| (hardLowerThresholdSet && hardUpperThresholdSet
								&& softLowerThresholdSet && softUpperThreshold == null)
						|| (hardLowerThresholdSet && hardUpperThresholdSet
								&& softLowerThreshold == null && softUpperThresholdSet)
						|| (hardLowerThresholdSet && hardUpperThresholdSet
								&& softLowerThresholdSet && softUpperThresholdSet)) {
					setPageComplete(true);
					inputStatus = statusOK;
					updatePageStatus();
				} else {
					inputStatus = new Status(INFORMATION, "not used",
							"Please specify all thresholds.");
					updatePageStatus();
				}

			} catch (NumberFormatException e) {
				// input was not numerical
				if (this.thresholdReference.equals("hardLowerThresholdSet")) {
					hardLowerThresholdSet = false;
				}
				if (this.thresholdReference.equals("softLowerThresholdSet")) {
					softLowerThresholdSet = false;
				}
				if (this.thresholdReference.equals("hardUpperThresholdSet")) {
					hardUpperThresholdSet = false;
				}
				if (this.thresholdReference.equals("softUpperThresholdSet")) {
					softUpperThresholdSet = false;
				}
				inputStatus = new Status(IStatus.ERROR, "not_used", 0,
						"Non empty values of type double required.", null);
				setPageComplete(false);

				controlDecoration.setDescriptionText("Not a valid input");
				Image image = FieldDecorationRegistry.getDefault()
						.getFieldDecoration(FieldDecorationRegistry.DEC_ERROR)
						.getImage();
				controlDecoration.setImage(image);
				controlDecoration.setShowOnlyOnFocus(false);
				controlDecoration.show();
				controlDecoration.showHoverText("Not a valid input");
				updatePageStatus();

			} catch (IncorrectThresholdInputException e) {
				// input was not correct according to checkInputForCorrectness
				hardLowerThresholdSet = false;
				hardUpperThresholdSet = false;
				softLowerThresholdSet = false;
				softUpperThresholdSet = false;
				inputStatus = new Status(IStatus.ERROR, "not_used", 0,
						"Non empty values of type double required.", null);
				setPageComplete(false);

				controlDecoration.setDescriptionText(e.getMessage());
				Image image = FieldDecorationRegistry.getDefault()
						.getFieldDecoration(FieldDecorationRegistry.DEC_ERROR)
						.getImage();
				controlDecoration.setImage(image);
				controlDecoration.setShowOnlyOnFocus(false);
				controlDecoration.show();
				controlDecoration.showHoverText(e.getMessage());
				updatePageStatus();
			}
		}
	}

	/**
	 * Checks whether the input for thresholds is correct, i.e. if the hard
	 * upper threshold is the largest value, the softUpperThreshold the second
	 * largest, softLowerThreshold the third largest and hardLowerThreshold the
	 * smallest value. If not, a {@link IncorrectThresholdInputException} is
	 * thrown.
	 * 
	 * @throws IncorrectThresholdInputException
	 */
	private void checkInputForCorrectness()
			throws IncorrectThresholdInputException {
		if (hardLowerThreshold != null && hardUpperThreshold != null) {
			if (hardLowerThreshold.compareTo(hardUpperThreshold) > 0) {
				throw new IncorrectThresholdInputException(
						"Hard lower threshold higher than hard upper threshold");
			}
		}

		if (softLowerThreshold != null && hardLowerThreshold != null
				&& hardUpperThreshold != null && softUpperThreshold != null) {
			if (softUpperThreshold.compareTo(hardUpperThreshold) > 0) {
				throw new IncorrectThresholdInputException(
						"Soft upper threshold higher than hard upper threshold");
			}
			if (hardLowerThreshold.compareTo(softLowerThreshold) > 0) {
				throw new IncorrectThresholdInputException(
						"Hard lower threshold higher than soft lower threshold");
			}
			if (softUpperThreshold.compareTo(softLowerThreshold) < 0) {
				throw new IncorrectThresholdInputException(
						"Soft lower threshold higher than soft upper threshold");
			}

			if (softUpperThreshold.compareTo(hardLowerThreshold) < 0) {
				throw new IncorrectThresholdInputException(
						"Hard lower threshold higher than soft upper threshold");
			}

			if (softLowerThreshold.compareTo(hardUpperThreshold) > 0) {
				throw new IncorrectThresholdInputException(
						"Soft lower threshold higher than hard upper threshold");
			}
			softLowerThresholdSet = true;
			softUpperThresholdSet = true;
		}
		hardLowerThresholdSet = true;
		hardUpperThresholdSet = true;

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
		switch (inputStatus.getSeverity()) {
		case IStatus.OK:
			setErrorMessage(null);
			setMessage(inputStatus.getMessage());
			pageStatus = statusOK;
			this.setPageComplete(true);
			break;
		case IStatus.WARNING:
			setErrorMessage(null);
			setMessage(inputStatus.getMessage(), WizardPage.WARNING);
			pageStatus = inputStatus;
			break;
		case IStatus.INFO:
			setErrorMessage(null);
			setMessage(inputStatus.getMessage(), WizardPage.INFORMATION);
			pageStatus = inputStatus;
			break;
		default:
			setErrorMessage(inputStatus.getMessage());
			setMessage(null);
			pageStatus = inputStatus;
			break;
		}
		getContainer().updateButtons();
		return pageStatus;
	}

	/**
	 * Sets the selectedSLO and updates the UI accordingly, i.e. sets threshold
	 * input fields visible or invisible and inserts default values.
	 * 
	 * @param selectedSLO
	 */
	public void setSelectedSLO(ServiceLevelObjective selectedSLO) {
		this.selectedSLO = selectedSLO;
		Threshold upperThreshold;
		Threshold lowerThreshold;
		lowerThreshold = selectedSLO.getLowerThreshold();
		upperThreshold = selectedSLO.getUpperThreshold();
		if (lowerThreshold instanceof LinearFuzzyThreshold) {
			softLowerThreshold = (Measure<?, Quantity>) ((LinearFuzzyThreshold) lowerThreshold)
					.getSoftLimit();
			labelSoftLowerThreshold.setText("Soft lower threshold: ["
					+ softLowerThreshold.getUnit().toString() + "]: ");
			labelSoftLowerThreshold.setVisible(true);
			Double softLowerThresholdDouble = softLowerThreshold
					.doubleValue(softLowerThreshold.getUnit());
			if (!textSoftLowerThreshold.getText().equalsIgnoreCase(
					softLowerThresholdDouble.toString())) {
				textSoftLowerThreshold.setText(softLowerThresholdDouble
						.toString());
				softLowerThresholdSet = true;
			}
			if (!textSoftLowerThreshold.getText().equalsIgnoreCase("")) {
				softLowerThresholdSet = true;
			}
			textSoftLowerThreshold.setVisible(true);
		} else {
			softLowerThreshold = null;
			softLowerThresholdSet = false;
			labelSoftLowerThreshold.setVisible(false);
			textSoftLowerThreshold.setVisible(false);
		}
		if (upperThreshold instanceof LinearFuzzyThreshold) {
			softUpperThreshold = (Measure<?, Quantity>) ((LinearFuzzyThreshold) upperThreshold)
					.getSoftLimit();
			labelSoftUpperThreshold.setText("Soft upper threshold: ["
					+ softUpperThreshold.getUnit().toString() + "]: ");
			Double softUpperThresholdDouble = softUpperThreshold
					.doubleValue(softUpperThreshold.getUnit());
			if (!textSoftUpperThreshold.getText().equalsIgnoreCase(
					softUpperThresholdDouble.toString())) {
				textSoftUpperThreshold.setText(softUpperThresholdDouble
						.toString());
				softUpperThresholdSet = true;
			}
			if (!textSoftUpperThreshold.getText().equalsIgnoreCase("")) {
				softUpperThresholdSet = true;
			}
			labelSoftUpperThreshold.setVisible(true);
			textSoftUpperThreshold.setVisible(true);
		} else {
			softUpperThreshold = null;
			softUpperThresholdSet = false;
			labelSoftUpperThreshold.setVisible(false);
			textSoftUpperThreshold.setVisible(false);
		}
		hardLowerThreshold = (Measure<?, Quantity>) lowerThreshold
				.getThresholdLimit();
		hardUpperThreshold = (Measure<?, Quantity>) upperThreshold
				.getThresholdLimit();

		labelUpperThreshold.setText("Upper threshold: ["
				+ hardUpperThreshold.getUnit().toString() + "]: ");
		labelUpperThreshold.setVisible(true);

		Double hardUpperThresholdDouble = hardUpperThreshold
				.doubleValue(hardUpperThreshold.getUnit());
		if (!textUpperThreshold.getText().equalsIgnoreCase(
				hardUpperThresholdDouble.toString())) {
			textUpperThreshold.setText(hardUpperThresholdDouble.toString());
			hardUpperThresholdSet = true;
		}

		textUpperThreshold.setVisible(true);
		labelLowerThreshold.setText("Lower threshold: ["
				+ hardLowerThreshold.getUnit().toString() + "]: ");
		labelLowerThreshold.setVisible(true);

		Double hardLowerThresholdDouble = hardLowerThreshold
				.doubleValue(hardLowerThreshold.getUnit());
		if (!textLowerThreshold.getText().equalsIgnoreCase(
				hardLowerThresholdDouble.toString())) {
			textLowerThreshold.setText(hardLowerThresholdDouble.toString());
			hardLowerThresholdSet = true;
		}

		textLowerThreshold.setVisible(true);

		if ((lowerThreshold instanceof LinearFuzzyThreshold)
				&& upperThreshold instanceof LinearFuzzyThreshold) {
			if (hardUpperThresholdSet && hardLowerThresholdSet
					&& softUpperThresholdSet && softLowerThresholdSet) {
				try {
					this.checkInputForCorrectness();
					this.setPageComplete(true);
					if (!((SLOViewsWizard) this.getWizard())
							.isStartedFromExperimentRun()) {
						((SLOViewsWizard) this.getWizard()).setFinishable(true);
					}
				} catch (IncorrectThresholdInputException e) {
					inputStatus = new Status(IStatus.ERROR, "not_used", 0,
							"Thresholds loaded from model are incorrect.", null);
				}
			} else {
				this.setPageComplete(false);
				if (!((SLOViewsWizard) this.getWizard())
						.isStartedFromExperimentRun()) {
					((SLOViewsWizard) this.getWizard()).setFinishable(false);
				}
			}
		}

		if ((lowerThreshold instanceof LinearFuzzyThreshold)
				&& !(upperThreshold instanceof LinearFuzzyThreshold)) {
			softUpperThresholdSet = false;
			if (hardUpperThresholdSet && hardLowerThresholdSet
					&& softLowerThresholdSet) {
				try {
					this.checkInputForCorrectness();
					this.setPageComplete(true);
					if (!((SLOViewsWizard) this.getWizard())
							.isStartedFromExperimentRun()) {
						((SLOViewsWizard) this.getWizard()).setFinishable(true);
					}
				} catch (IncorrectThresholdInputException e) {
					inputStatus = new Status(IStatus.ERROR, "not_used", 0,
							"Thresholds loaded from model are incorrect.", null);
				}
			} else {
				this.setPageComplete(false);
				if (!((SLOViewsWizard) this.getWizard())
						.isStartedFromExperimentRun()) {
					((SLOViewsWizard) this.getWizard()).setFinishable(false);
				}
			}
		}

		if ((upperThreshold instanceof LinearFuzzyThreshold)
				&& !(lowerThreshold instanceof LinearFuzzyThreshold)) {
			softLowerThresholdSet = false;
			if (hardUpperThresholdSet && hardLowerThresholdSet
					&& softUpperThresholdSet) {
				try {
					this.checkInputForCorrectness();
					this.setPageComplete(true);
					if (!((SLOViewsWizard) this.getWizard())
							.isStartedFromExperimentRun()) {
						((SLOViewsWizard) this.getWizard()).setFinishable(true);
					}
				} catch (IncorrectThresholdInputException e) {
					inputStatus = new Status(IStatus.ERROR, "not_used", 0,
							"Thresholds loaded from model are incorrect.", null);
				}
			} else {
				this.setPageComplete(false);
				if (!((SLOViewsWizard) this.getWizard())
						.isStartedFromExperimentRun()) {
					((SLOViewsWizard) this.getWizard()).setFinishable(false);
				}
			}
		}

		if (!(upperThreshold instanceof LinearFuzzyThreshold)
				&& !(lowerThreshold instanceof LinearFuzzyThreshold)) {
			softLowerThresholdSet = false;
			softUpperThresholdSet = false;
			if (hardUpperThresholdSet && hardLowerThresholdSet) {
				try {
					this.checkInputForCorrectness();
					this.setPageComplete(true);
					if (!((SLOViewsWizard) this.getWizard())
							.isStartedFromExperimentRun()) {
						((SLOViewsWizard) this.getWizard()).setFinishable(true);
					}
				} catch (IncorrectThresholdInputException e) {
					inputStatus = new Status(IStatus.ERROR, "not_used", 0,
							"Thresholds loaded from model are incorrect.", null);
				}
			} else {
				this.setPageComplete(false);
				if (!((SLOViewsWizard) this.getWizard())
						.isStartedFromExperimentRun()) {
					((SLOViewsWizard) this.getWizard()).setFinishable(false);
				}
			}
		}

	}

	protected void setMaxSimulationTime(double max) {
		scale.setMaximum((int) max);
	}

	@Override
	public void widgetSelected(SelectionEvent e) {
		selectedTimestepInterval = scale.getSelection();
		scale.setToolTipText("" + scale.getSelection());
		((SLOViewsWizard) this.getWizard())
				.setSelectedTimestepInterval(selectedTimestepInterval);
	}

	@Override
	public void widgetDefaultSelected(SelectionEvent e) {
		// do nothing

	}

}
