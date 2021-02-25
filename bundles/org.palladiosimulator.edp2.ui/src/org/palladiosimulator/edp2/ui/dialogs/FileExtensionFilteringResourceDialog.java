package org.palladiosimulator.edp2.ui.dialogs;

import java.io.File;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.ui.dialogs.ResourceDialog;
import org.eclipse.emf.common.ui.dialogs.WorkspaceResourceDialog;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;

public class FileExtensionFilteringResourceDialog extends ResourceDialog {
    private final String fileExtension;

    public FileExtensionFilteringResourceDialog(Shell parent, String title, int style, String fileExtension) {
        super(parent, title, style);
        this.fileExtension = fileExtension;
    }
    
    /**
     * Unfortunately, the Eclipse provided implementation does not expose the it's configuration
     * potental through ResourceDialog. We therefore have to copy a large amount of code from {@link ResourceDialog}
     */
    @Override
    protected void prepareBrowseFileSystemButton(Button browseFileSystemButton) {
        browseFileSystemButton.addSelectionListener
        (new SelectionAdapter()
         {
           @Override
          public void widgetSelected(SelectionEvent event)
           {
             FileDialog fileDialog = new FileDialog(getShell(), style);
             fileDialog.setFilterExtensions(new String[] {"*." + fileExtension});
             fileDialog.open();

             String filterPath = fileDialog.getFilterPath();
             if (isMulti())
             {
               String[] fileNames = fileDialog.getFileNames();
               StringBuffer uris = new StringBuffer();
               
               for (int i = 0, len = fileNames.length; i < len; i++)
               {
                 uris.append(URI.createFileURI(filterPath + File.separator + fileNames[i]).toString());
                 uris.append("  ");
               }             
               uriField.setText((uriField.getText() + "  " + uris.toString()).trim());
             }
             else
             {
               String fileName = fileDialog.getFileName();
               if (fileName != null)
               {
                 uriField.setText(URI.createFileURI(filterPath + File.separator + fileName).toString());
               }
             }
           }
         });
    }

    /**
     * Unfortunately, the Eclipse provided implementation does not expose the it's configuration
     * potental through ResourceDialog. We therefore have to copy a large amount of code from {@link ResourceDialog}
     */
    @Override
    protected void prepareBrowseWorkspaceButton(Button browseWorkspaceButton) {
        browseWorkspaceButton.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent event) {
                if (isMulti()) {
                    StringBuffer uris = new StringBuffer();

                    IFile[] files = WorkspaceResourceDialog.openFileSelection(getShell(), null, null, true,
                            getContextSelection(), getViewerFilters());
                    for (int i = 0, len = files.length; i < len; i++) {
                        uris.append(URI.createPlatformResourceURI(files[i].getFullPath()
                            .toString(), true));
                        uris.append("  ");
                    }
                    uriField.setText((uriField.getText() + "  " + uris.toString()).trim());
                } else {
                    IFile file = null;

                    if (isSave()) {
                        String path = getContextPath();
                        file = WorkspaceResourceDialog.openNewFile(getShell(), null, null,
                                path != null ? new Path(path) : null, getViewerFilters());
                    } else {
                        IFile[] files = WorkspaceResourceDialog.openFileSelection(getShell(), null, null, false,
                                getContextSelection(), getViewerFilters());
                        if (files.length != 0) {
                            file = files[0];
                        }
                    }

                    if (file != null) {
                        uriField.setText(URI.createPlatformResourceURI(file.getFullPath()
                            .toString(), true)
                            .toString());
                    }
                }
            }

            private String getContextPath() {
                return context != null && context.isPlatformResource() ? URI.createURI(".")
                    .resolve(context)
                    .path()
                    .substring(9) : null;
            }

            private Object[] getContextSelection() {
                String path = getContextPath();
                if (path != null) {
                    IWorkspaceRoot root = ResourcesPlugin.getWorkspace()
                        .getRoot();
                    IResource resource = root.findMember(path);
                    if (resource != null && resource.isAccessible()) {
                        return new Object[] { resource };
                    }
                }
                return null;
            }
        });
    }
    
    protected List<ViewerFilter> getViewerFilters() {
        return Collections.singletonList(filterByExtension(fileExtension));
    }
    
    public static ViewerFilter filterByExtension(String fileExtension) {
        return new FileBasedViewerFilter(f -> fileExtension.equals(f.getFileExtension()));
    }

    public static class FileBasedViewerFilter extends ViewerFilter {
        private Predicate<IFile> predicate;

        public FileBasedViewerFilter(Predicate<IFile> predicate) {
            this.predicate = predicate;
        }

        @Override
        public boolean select(Viewer viewer, Object parentElement, Object element) {
            if (element instanceof IFile) {
                return predicate.test((IFile) element);
            }

            if (element instanceof IProject && !((IProject) element).isOpen())
                return false;

            if (element instanceof IContainer) { // i.e. IProject, IFolder
                try {
                    IResource[] resources = ((IContainer) element).members();
                    for (IResource resource : resources) {
                        if (select(viewer, parentElement, resource))
                            return true;
                    }
                } catch (CoreException e) {
                }
            }
            return false;
        }

    }

}
