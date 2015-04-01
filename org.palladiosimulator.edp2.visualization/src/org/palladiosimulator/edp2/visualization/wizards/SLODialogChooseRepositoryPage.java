package org.palladiosimulator.edp2.visualization.wizards;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.ui.dialogs.WorkspaceResourceDialog;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.palladiosimulator.edp2.models.ExperimentData.Measurement;
import org.palladiosimulator.edp2.visualization.util.ExtensionsFilter;
import org.palladiosimulator.metricspec.MetricDescription;
import org.palladiosimulator.servicelevelobjective.ServiceLevelObjective;
import org.palladiosimulator.servicelevelobjective.ServiceLevelObjectiveRepository;

/**
 * A {@link WizardPage} prompting the user to import a file containing a
 * {@link ServiceLevelObjectiveRepository}. The chosen {@link ServiceLevelObjectiveRepository} is
 * forwarded to the {@link SLOViewsWizard} controlling this page.
 * 
 * @author Andreas Flohre
 *
 */
public class SLODialogChooseRepositoryPage extends WizardPage implements ModifyListener {

    /**
     * {@link ServiceLevelObjectiveRepository} uploaded by the user.
     */
    private ServiceLevelObjectiveRepository selectedSLORepo;

    /**
     * The current {@link IStatus} based on the selection in the <choiceViewer>
     */
    private IStatus selectionStatus;

    /**
     * List of {@link ServiceLevelObjective} derived from the selected
     * {@link ServiceLevelObjectiveRepository} which are applicable to a specific metric
     * description.
     */
    private final List<ServiceLevelObjective> availableSLOs = new ArrayList<ServiceLevelObjective>();

    /**
     * Selected {@link Measurements} from the {@link SLODialogChooseMeasuringPointsPage}.
     */
    private List<Measurement> selectedMeasurements;

    /**
     * The 'OK'-Status, which signalizes everything is fine.
     */
    private final Status statusOK;

    /**
     * Text are displaying the selected file to be uploaded.
     */
    Text textFileNameToLoad;

    /**
     * Constructor.
     * 
     * @param name
     */
    public SLODialogChooseRepositoryPage(String name) {
        super(name);
        setDescription("Please select a file containing a service level objective repository.");
        selectionStatus = new Status(IStatus.INFO, "not_used", 0,
                "Please select a file containing a service level objective repository.", null);
        statusOK = new Status(IStatus.OK, "not_used", 0, "", null);
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
        GridLayout gl = new GridLayout();
        composite.setLayout(gl);

        final Group fileInputGroup = new Group(composite, SWT.NONE);
        textFileNameToLoad = new Text(fileInputGroup, SWT.NONE);
        // textFileNameToLoad.setEditable(false);
        textFileNameToLoad.addModifyListener(this);
        final GridLayout glFileInputGroup = new GridLayout();
        int numColumns = 3;

        glFileInputGroup.numColumns = numColumns;
        fileInputGroup.setLayout(glFileInputGroup);
        fileInputGroup.setText("Import Service Level Objective Repository"); // The
                                                                             // group
                                                                             // name
        fileInputGroup.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));

        textFileNameToLoad.setParent(fileInputGroup);
        final GridData gridDataTextFileName = new GridData(SWT.FILL, SWT.CENTER, true, false);
        gridDataTextFileName.widthHint = 200;
        textFileNameToLoad.setLayoutData(gridDataTextFileName);

        final Button workspaceButton = new Button(fileInputGroup, SWT.NONE);
        workspaceButton.setText("Workspace...");
        workspaceButton.addSelectionListener(new WorkspaceButtonSelectionListener(textFileNameToLoad,
                new String[] { "slo" }, "workspace", getShell()));

        final Button localFileSystemButton = new Button(fileInputGroup, SWT.NONE);
        localFileSystemButton.setText("File System...");
        localFileSystemButton.addSelectionListener(new LocalFileSystemButtonSelectionAdapter(textFileNameToLoad,
                new String[] { "*.slo" }, "filesystem"));

        // Button importButton = new Button(composite, SWT.PUSH);
        // importButton.setText("Import File");
        // importButton.addSelectionListener(this);

        // set the composite as the control for this page
        setControl(composite);
    }

    /**
     * Inner class handling user input from workspace.
     *
     */
    private class WorkspaceButtonSelectionListener implements SelectionListener {

        /** Text field containing the path of the selected file. */
        private final Text field;
        /** Restrictions on file extensions within selection dialog. */
        private final String[] extensions;
        /** Title/message of the dialog. */
        private final String dialogTitle;

        public WorkspaceButtonSelectionListener(Text field, String[] fileExtension, String dialogTitle, Shell shell) {
            this.field = field;
            this.extensions = fileExtension;
            this.dialogTitle = dialogTitle;
        }

        public String openFileDialog(String[] fileExtension) {

            /** Filter from the redundant files. */
            List<ViewerFilter> filters = new ArrayList<ViewerFilter>();
            if (fileExtension != null) {
                ExtensionsFilter filter = new ExtensionsFilter(fileExtension);
                filters.add(filter);
            }

            IFile[] files = WorkspaceResourceDialog.openFileSelection(getShell(), null, dialogTitle, false, null,
                    filters);

            if (files.length != 0 && files[0] != null) {
                System.out.println(files[0].getFullPath());
                String portableString = files[0].getFullPath().toPortableString();

                // get object which represents the workspace
                IWorkspace workspace = ResourcesPlugin.getWorkspace();

                // get location of workspace
                String workspaceDirectory = workspace.getRoot().getLocation().toFile().getPath().replace('\\', '/');
                String target = workspaceDirectory + portableString;
                return target;
            } else {
                return null;
            }
        }

        @Override
        public void widgetSelected(SelectionEvent e) {
            String selectedFile = null;
            selectedFile = openFileDialog(extensions);
            if (selectedFile != null) {
                field.setText(selectedFile);
            }
        }

        @Override
        public void widgetDefaultSelected(SelectionEvent e) {
            // do nothing
        }

    }

    /**
     * Inner class handling user input from the file system.
     *
     */
    private class LocalFileSystemButtonSelectionAdapter implements SelectionListener {

        /** Text field containing the path of the selected file. */
        private final Text field;
        /** Restrictions on file extensions within selection dialog. */
        private final String[] extensions;
        /** Title/message of the dialog. */
        private final String dialogTitle;

        public LocalFileSystemButtonSelectionAdapter(Text field, String[] allowedExtensions, String dialogTitle) {
            this.dialogTitle = dialogTitle;
            this.field = field;
            this.extensions = allowedExtensions;
        }

        public String openFileDialog(String[] fileExtension) {
            FileDialog dialog = new FileDialog(getShell(), SWT.OPEN);
            dialog.setFilterExtensions(fileExtension);
            dialog.setText(dialogTitle);
            String filename = null;
            dialog.setFileName(field.getText());

            if (dialog.open() != null) {
                String root = dialog.getFilterPath() + File.separatorChar;
                filename = root + dialog.getFileName();
            }

            return filename;
        }

        @Override
        public void widgetSelected(SelectionEvent e) {
            String selectedFile = null;
            selectedFile = openFileDialog(extensions);
            if (selectedFile != null) {
                field.setText(selectedFile);
            }
        }

        @Override
        public void widgetDefaultSelected(SelectionEvent e) {
            // do nothing
        }

    }

    /**
     * Loads a {@link ServiceLevelObjectiveRepository} from a resource set by the uri and forwards
     * the {@link ServiceLevelObjectiveRepository} to the {@link SLOViewsWizard} controlling this
     * page.
     * 
     * @param uri
     *            Uri defining the location of the resource to load.
     */
    private void loadSLORepository(String uri) {
        org.palladiosimulator.metricspec.MetricSpecPackage.eINSTANCE.eClass();
        org.palladiosimulator.servicelevelobjective.ServicelevelObjectivePackage.eINSTANCE.eClass();
        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION,
                new XMIResourceFactoryImpl());
        ResourceSet rs = new ResourceSetImpl();
        Resource resource = rs.createResource(URI.createFileURI(uri));
        try {
            resource.load(null);
            EcoreUtil.resolveAll(rs);
            selectedSLORepo = (ServiceLevelObjectiveRepository) resource.getContents().get(0);
            selectionStatus = statusOK;
            this.loadSLOs(selectedMeasurements.get(0).getMeasuringType().getMetric());
            updatePageStatus();
        } catch (IOException e) {
            selectionStatus = new Status(IStatus.ERROR, "not_used", 0, "File not found.", null);
            updatePageStatus();
        } catch (ClassCastException e) {
            selectionStatus = new Status(IStatus.ERROR, "not_used", 0,
                    "Model does not contain service level repository, please select another repository.", null);
            updatePageStatus();
        }

    }

    /**
     * Loads the available {@link ServiceLevelObjective}s from a chosen
     * {@link ServiceLevelObjectiveRepository} and forwards them to the wizard controlling this
     * page. Available {@link ServiceLevelObjective}s are {@link ServiceLevelObjective} which are
     * applicable to the metric description parameter.
     * 
     * @param metricDescription
     *            The metric description the {@link ServiceLevelObjective}s need to be applicable
     *            to.
     */
    private void loadSLOs(MetricDescription metricDescription) {
        List<ServiceLevelObjective> allSLOs = selectedSLORepo.getServicelevelobjectives();
        // FIXME: commonMetrics.metricspec and metric spec names used in
        // measurements are not in sync
        availableSLOs.clear();
        for (ServiceLevelObjective element : allSLOs) {
            if ((metricDescription.getName().contains(element.getMeasurementSpecification().getMetricDescription()
                    .getName()))
                    || (element.getMeasurementSpecification().getMetricDescription().getName()
                            .contains(metricDescription.getName()))) {
                if (!availableSLOs.contains(element)) {
                    availableSLOs.add(element);
                }
            }
        }
        if (availableSLOs.isEmpty()) {
            selectionStatus = new Status(IStatus.ERROR, "not_used", 0,
                    "No applicable service level objective in repository.", null);
            updatePageStatus();
        } else {
            this.setAvailableSLOsInWizard();
        }
    }

    /**
     * Method which handles the status of the whole {@link WizardPage} based on the different states
     * resulting from inputs.
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
     * Forwards the available, i.e. {@link ServiceLevelObjective}s applicable to the selected
     * metric, to the wizard.
     */
    private void setAvailableSLOsInWizard() {
        ((SLOViewsWizard) this.getWizard()).setAvailableSLOs(availableSLOs);
    }

    // /*
    // * (non-Javadoc)
    // *
    // * @see
    // * org.eclipse.swt.events.SelectionListener#widgetSelected(org.eclipse.swt
    // * .events.SelectionEvent)
    // */
    // @Override
    // public void widgetSelected(SelectionEvent e) {
    // String uri = textFileNameToLoad.getText();
    // uri.trim();
    // if (uri.length() > 0) {
    // loadSLORepository(uri);
    // }
    // }
    //
    // /*
    // * (non-Javadoc)
    // *
    // * @see
    // *
    // org.eclipse.swt.events.SelectionListener#widgetDefaultSelected(org.eclipse
    // * .swt.events.SelectionEvent)
    // */
    // @Override
    // public void widgetDefaultSelected(SelectionEvent e) {
    // // do nothing
    // }

    public void setSelectedMeasurements(List<Measurement> selectedMeasurements) {
        this.selectedMeasurements = selectedMeasurements;
    }

    @Override
    public void modifyText(ModifyEvent e) {
        String uri = textFileNameToLoad.getText();
        uri.trim();
        if (uri.length() > 0) {
            loadSLORepository(uri);
        }

    }

}
