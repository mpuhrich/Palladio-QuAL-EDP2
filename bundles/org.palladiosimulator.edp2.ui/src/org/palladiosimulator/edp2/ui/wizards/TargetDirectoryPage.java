package org.palladiosimulator.edp2.ui.wizards;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.palladiosimulator.edp2.dao.exception.DataNotAccessibleException;
import org.palladiosimulator.edp2.ui.wizards.datasource.FileSystemButtonSelectionAdater;
import org.palladiosimulator.edp2.ui.wizards.datasource.WorkspaceButtonSelectionAdapter;

public class TargetDirectoryPage extends WizardPage {

    private static final Logger LOGGER = Logger.getLogger(TargetDirectoryPage.class.getCanonicalName());
    private Text locationText;

    protected TargetDirectoryPage() {
        super("wizardPage");

        setTitle("Select File Export Location");
        setDescription("Please select the location to which you want to export the selected repository.");
        setPageComplete(false);
    }

    @Override
    public void createControl(Composite parent) {
        final Composite container = new Composite(parent, SWT.NULL);
        setControl(container);
        this.locationText = new Text(container, SWT.BORDER);
        createDirectoryInputSection(container, "Location: ", locationText);
        locationText.addModifyListener(new ModifyListener() {

            @Override
            public void modifyText(ModifyEvent e) {
                if(isFolder(locationText.getText())) {
                    setPageComplete(true);
                } else {
                    setPageComplete(false);
                }
            }


            
        });
        // The additional spacing (default is 5,5) is for the decorations
        GridLayoutFactory.swtDefaults().numColumns(2).spacing(10, 5).generateLayout(container);

    }
    
    private boolean isFolder(final String uriString) {
        try {
            return convertUriStringToFileInternal(uriString).isDirectory();
        } catch (DataNotAccessibleException e) {
            return false;
        }
    }
    
    /**
     * Converts a supplied URI to a file on the local file system, if possible.
     *
     * @param uri
     *            The URI to convert.
     * @return Local file.
     * @throws DataNotAccessibleException
     *             For conversion errors. Details are provided in the message.
     * @author {@link org.palladiosimulator.edp2.local.impl.LocalDirectoryRepositoryImplconvertUriStringToFileInternal(String)}
     */
    private File convertUriStringToFileInternal(final String uriString) throws DataNotAccessibleException {
        final URI uri = URI.createURI(uriString);
        File directory;
        String fileLocation;
        if (uri.isPlatform()) {
            URL urlToFoo = null;
            try {
                urlToFoo = FileLocator.toFileURL(new URL(uri.toString()));
                fileLocation = urlToFoo.getFile();
            } catch (final MalformedURLException e) {
                throw new DataNotAccessibleException("The URI is not well-formed.", e);
            } catch (final IOException e) {
                throw new DataNotAccessibleException("The URI could not be converted.", e);
            }
        } else {
            fileLocation = uri.toFileString();
        }
        if (fileLocation == null) {
            // URI is valid but does not point to a file
            throw new DataNotAccessibleException("The URI could not be converted to a local file.", null);
        } else {
            directory = new File(fileLocation);
            if (!directory.isDirectory()) {
                // URI does not point to a directory.
                throw new DataNotAccessibleException("The URI does not point to a directory.", null);
            }
        }
        return directory;
    }

    /**
     * Creates a section in the parent container for selection files. Creates a {@link Group} with a
     * label. Inside the group, a text field for the file with the given extension, a button to load
     * from the workspace and a button to load from the file system are displayed.
     *
     * @param container
     *            The parent container
     * @param modelFileLabel
     *            The label of the section around the file input text field
     * @param textFileNameToLoad
     *            The text field that contains the filename. Its parent will be reset to the
     *            appropriate group within this method.
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

    public String getTargetDirectoryOnFinish() {
        try {
            return convertUriStringToFileInternal(locationText.getText()).getAbsolutePath();
        } catch (DataNotAccessibleException e) {
            // This should never happen.
            LOGGER.log(Level.SEVERE, "Access to specified URL failed.");
            e.printStackTrace();
        }
        return null;
    }
}
