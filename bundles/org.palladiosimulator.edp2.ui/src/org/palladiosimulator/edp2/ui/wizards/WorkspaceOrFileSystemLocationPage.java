package org.palladiosimulator.edp2.ui.wizards;

import org.eclipse.core.databinding.AggregateValidationStatus;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.beans.typed.PojoProperties;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.databinding.swt.typed.WidgetProperties;
import org.eclipse.jface.databinding.wizard.WizardPageSupport;
import org.eclipse.jface.fieldassist.ControlDecoration;
import org.eclipse.jface.fieldassist.FieldDecoration;
import org.eclipse.jface.fieldassist.FieldDecorationRegistry;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.palladiosimulator.edp2.ui.wizards.binding.NotEmptyValidator;
import org.palladiosimulator.edp2.ui.wizards.binding.StringToUriConverter;
import org.palladiosimulator.edp2.ui.wizards.binding.UriPointsToLocalDirectoryValidator;
import org.palladiosimulator.edp2.ui.wizards.datasource.FileSystemButtonSelectionAdater;
import org.palladiosimulator.edp2.ui.wizards.datasource.WorkspaceButtonSelectionAdapter;

/**
 * Wizard page to discover and select a local directory based repository.
 *
 * @author groenda, Sebastian Lehrig
 */
public class WorkspaceOrFileSystemLocationPage extends WizardPage {
	private URI path;

	public WorkspaceOrFileSystemLocationPage() {
		super("wizardPage");
		
		setPageComplete(false);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets.
	 * Composite)
	 */
	@Override
	public void createControl(final Composite parent) {
		final Composite container = new Composite(parent, SWT.NULL);
		setControl(container);

		final Text locationText = new Text(container, SWT.BORDER);
		createDirectoryInputSection(container, "Location: ", locationText);
		var textObservable = WidgetProperties.text(SWT.Modify).observe(locationText);
		var locationDecoration = createControlDecoration(locationText);

		// The additional spacing (default is 5,5) is for the decorations
		GridLayoutFactory.swtDefaults().numColumns(2).spacing(10, 5).generateLayout(container);
		final DataBindingContext dbc = new DataBindingContext();

		// create this before binding the observables to enable displaying an
		// error when the wizard page is shown:
		WizardPageSupport.create(this, dbc);
		
		var uriObservable = PojoProperties.value("path", URI.class).observe(this);
		
		dbc.bindValue(textObservable, uriObservable,
				UpdateValueStrategy.create(new StringToUriConverter())
						.setAfterGetValidator(new NotEmptyValidator("location"))
						.setAfterConvertValidator(new UriPointsToLocalDirectoryValidator("location")),
				null).getValidationStatus().addValueChangeListener(vce -> {
					if (vce.diff.getNewValue().isOK()) {
						locationDecoration.hide();
					} else {
						locationDecoration.setDescriptionText(vce.getObservableValue().getValue().getMessage());
						locationDecoration.show();
					}
				});

		final AggregateValidationStatus aggregateValidationStatus = new AggregateValidationStatus(
				dbc.getValidationStatusProviders(), AggregateValidationStatus.MAX_SEVERITY);

		aggregateValidationStatus.addValueChangeListener(vce -> {
			setPageComplete(aggregateValidationStatus.getValue().isOK());			
		});
	}

	/**
	 * Creates a decoration for a control to show validation errors.
	 *
	 * @param control The control which should be decorated.
	 */
	private ControlDecoration createControlDecoration(final Control control) {
		final ControlDecoration controlDecoration = new ControlDecoration(control, SWT.LEFT | SWT.TOP);
		final FieldDecoration fieldDecoration = FieldDecorationRegistry.getDefault()
				.getFieldDecoration(FieldDecorationRegistry.DEC_ERROR);
		controlDecoration.setImage(fieldDecoration.getImage());
		controlDecoration.hide();
		return controlDecoration;
	}

	/**
	 * Creates a section in the parent container for selection files. Creates a
	 * {@link Group} with a label. Inside the group, a text field for the file with
	 * the given extension, a button to load from the workspace and a button to load
	 * from the file system are displayed.
	 *
	 * @param container          The parent container
	 * @param modelFileLabel     The label of the section around the file input text
	 *                           field
	 * @param textFileNameToLoad The text field that contains the filename. Its
	 *                           parent will be reset to the appropriate group
	 *                           within this method.
	 *
	 * @author Palladio.Workflow::FileNamesInputTab
	 */
	public void createDirectoryInputSection(final Composite container, final String modelFileLabel,
			final Text textFileNameToLoad) {

		final Group fileInputGroup = new Group(container, SWT.NONE);
		final GridLayout glFileInputGroup = new GridLayout();
		glFileInputGroup.numColumns = 3;
		fileInputGroup.setLayout(glFileInputGroup);
		fileInputGroup.setText(modelFileLabel); // The group name
		fileInputGroup.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));

		textFileNameToLoad.setParent(fileInputGroup);
		final GridData gd_textFileName = new GridData(SWT.FILL, SWT.CENTER, true, false);
		gd_textFileName.widthHint = 200;
		textFileNameToLoad.setLayoutData(gd_textFileName);

		final Button workspaceButton = new Button(fileInputGroup, SWT.NONE);
		workspaceButton.setText("Workspace...");
		workspaceButton.addSelectionListener(new WorkspaceButtonSelectionAdapter(getShell(), textFileNameToLoad));

		final Button buttonUsage = new Button(fileInputGroup, SWT.NONE);
		buttonUsage.setText("File System...");
		buttonUsage.addSelectionListener(new FileSystemButtonSelectionAdater(getShell(), textFileNameToLoad));
	}

	public URI getPath() {
		return path;
	}

	public void setPath(URI path) {
		this.path = path;
	}
}
