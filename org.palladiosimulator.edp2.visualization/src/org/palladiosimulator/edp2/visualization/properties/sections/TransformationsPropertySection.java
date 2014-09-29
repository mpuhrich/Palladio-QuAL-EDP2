package org.palladiosimulator.edp2.visualization.properties.sections;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.views.properties.tabbed.AbstractPropertySection;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertySheetPageContributor;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.palladiosimulator.edp2.datastream.AbstractDataSource;
import org.palladiosimulator.edp2.datastream.IDataSource;
import org.palladiosimulator.edp2.datastream.filter.AbstractAdapter;
import org.palladiosimulator.edp2.datastream.filter.AbstractFilter;
import org.palladiosimulator.edp2.visualization.AbstractVisualizationSingleDatastreamInput;
import org.palladiosimulator.edp2.visualization.Activator;
import org.palladiosimulator.edp2.visualization.IVisualisationSingleDatastreamInput;
import org.palladiosimulator.edp2.visualization.editors.AbstractEditor;
import org.palladiosimulator.edp2.visualization.wizards.AdapterWizard;
import org.palladiosimulator.edp2.visualization.wizards.FilterWizard;

/**
 * GUI controls for {@link AbstractTransformation}s. Used to display and edit properties of applied
 * data transformations in the Eclipse Properties View if an {@link AbstractEditor} is the currently
 * active editor.
 *
 * @author Roland Richter, Dominik Ernst, Florian Rosenthal
 *
 */
public class TransformationsPropertySection extends AbstractPropertySection implements ISelectionChangedListener {
    /**
     * A tree, which contains the editor's inputs and their transformations (as children)
     */
    private TreeViewer treeViewer;
    /**
     * The table for displaying attributes of a selected transformation.
     */
    private EDP2PropertiesTable transformationTable;

    /**
     * The current editor which is an {@link ITabbedPropertySheetPageContributor}.
     */
    private AbstractEditor<AbstractVisualizationSingleDatastreamInput> editor;

    /**
     * Last, by the user selected {@link AbstractTransformation} in the {@link #treeViewer}.
     */
    private IDataSource selectedAdapter;

    /**
     * The last selected {@link AbstractVisualizationSingleDatastreamInput} in the
     * {@link #treeViewer}.
     */
    private IVisualisationSingleDatastreamInput selectedInput;

    /**
     * Create the look and items of the properties. It is called, if one of the editors in the
     * package visualization.editors is selected.
     */
    @Override
    public void createControls(final Composite parent, final TabbedPropertySheetPage aTabbedPropertySheetPage) {

        super.createControls(parent, aTabbedPropertySheetPage);

        Composite container = getWidgetFactory().createFlatFormComposite(parent);
        container.setBackground(parent.getDisplay().getSystemColor(SWT.COLOR_WIDGET_BACKGROUND));
        final GridLayout layout = new GridLayout(1, false);
        layout.marginWidth = 2;
        layout.marginHeight = 2;
        container.setLayout(layout);
        // initialize the layout
        final Group group = new Group(container, SWT.NONE);
        group.setText("Editor Inputs");
        group.setLayout(new GridLayout(3, false));
        // create the tree viewer with empty input
        final InputSelectionTree tree = new InputSelectionTree(group, SWT.EMBEDDED, null);
        GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1);
        tree.setLayoutData(gridData);
        treeViewer = tree.getTreeViewer();

        initTransformationTable(group);

        Button buttonAdapter = new Button(group, SWT.PUSH);
        buttonAdapter.setText("Add new Adapter..");
        gridData = new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1);
        gridData.widthHint = 120;
        buttonAdapter.setLayoutData(gridData);
        Button buttonFilter = new Button(group, SWT.PUSH);
        buttonFilter.setText("Add new Filter..");
        buttonFilter.setLayoutData(gridData);

        initializeButtonListeners(buttonAdapter, buttonFilter);

    }

    private void initializeButtonListeners(final Button buttonAdapter, final Button buttonFilter) {
        Listener btnListener = new Listener() {

            // TODO fix references on previous transformations etc.
            @Override
            public void handleEvent(final Event event) {
                if (selectedInput == null) {
                    MessageDialog.openError(
                            Activator.getDefault().getWorkbench().getActiveWorkbenchWindow().getShell(),
                            "No data series selected",
                            "To add a transformation, a data series, to which the transformation should "
                                    + "be added, must be selected first");
                } else {
                    boolean updateEditorContents = false;
                    if (event.widget == buttonAdapter) {
                        final AdapterWizard wizard = new AdapterWizard(
                                (AbstractDataSource) selectedInput.getDataSource());
                        final WizardDialog wdialog = new WizardDialog(Activator.getDefault().getWorkbench()
                                .getActiveWorkbenchWindow().getShell(), wizard);
                        wdialog.open();
                        if (wdialog.getReturnCode() == Window.OK) {
                            AbstractAdapter adapter = wizard.getAdapter();
                            if (adapter != null) {
                                handleSemanticChange(adapter);
                                updateEditorContents = true;
                            }
                        }
                    } else if (event.widget == buttonFilter) {
                        final FilterWizard wizard = new FilterWizard((AbstractDataSource) selectedInput.getDataSource());
                        final WizardDialog wdialog = new WizardDialog(Activator.getDefault().getWorkbench()
                                .getActiveWorkbenchWindow().getShell(), wizard);
                        wdialog.open();
                        if (wdialog.getReturnCode() == Window.OK) {
                            AbstractFilter filter = wizard.getFilter();
                            if (filter != null) {
                                // TODO selectedInput.setSource(filter);
                                refresh();
                                updateEditorContents = true;
                            }
                        }
                    }
                    if (updateEditorContents && editor != null) {
                        editor.updateEditorContents();
                    }
                }
            }
        };
        buttonAdapter.addListener(SWT.Selection, btnListener);
        buttonFilter.addListener(SWT.Selection, btnListener);
    }

    private void handleSemanticChange(final AbstractAdapter adapter) {
        // // TODO perform actual check on compatible editors for new input.
        // boolean adapterExistsAlready = false;
        // for (final AbstractTransformation trafo : selectedInput
        // .getListOfTransformations()) {
        // if (trafo.getFactoryId().equals(adapter.getFactoryId())) {
        // MessageDialog
        // .openInformation(
        // Activator.getDefault().getWorkbench()
        // .getActiveWorkbenchWindow().getShell(),
        // "Adapter already exists",
        // "You tried to add an adapter, which already exists in the list"
        // + "of transformations for the selected data series. "
        // + "Please select a different series or change the settings of the existing adapter "
        // + "in the properties view.");
        // adapterExistsAlready = true;
        // }
        // }
        //
        // if (!adapterExistsAlready) {
        // final boolean result = MessageDialog
        // .openQuestion(
        // Activator.getDefault().getWorkbench()
        // .getActiveWorkbenchWindow().getShell(),
        // "Semantics of Data Changed",
        // "The applied data transformation cannot be displayed in the current dataset."
        // + "A new dataset in a new editor must be opened. Do you want to proceed?");
        // if (result) {
        //
        // final DefaultViewsWizard wizard = new DefaultViewsWizard(adapter);
        // final WizardDialog wdialog = new WizardDialog(Activator.getDefault()
        // .getWorkbench().getActiveWorkbenchWindow().getShell(),
        // wizard);
        // wdialog.open();
        //
        // if (wdialog.getReturnCode() == Window.OK) {
        // final DefaultSequence selection = wizard.getSelectedDefault();
        //
        // if (selection.getSize() > 0) {
        // if (selection.getSequenceProperties().size() > 0) {
        // selection.getFirstSequenceElement().setProperties(
        // selection.getSequenceProperties().get(0));
        // }
        // selection.getFirstSequenceElement().setSource(adapter);
        // }
        // for (int i = 1; i < selection.getSize(); i++) {
        // selection
        // .getSequenceElements()
        // .get(i)
        // .setProperties(
        // selection.getSequenceProperties()
        // .get(i));
        // selection
        // .getSequenceElements()
        // .get(i)
        // .setSource(
        // selection.getSequenceElements().get(
        // i - 1));
        // }
        //
        // final IVisualisationSingleDatastreamInput visualization = selection
        // .getVisualization();
        // visualization.setProperties(selection
        // .getVisualizationProperties());
        // if (selection.getSize() > 0) {
        // visualization.setSource(selection
        // .getLastSequenceElement());
        // } else {
        // visualization.setSource(adapter);
        // }
        // final AbstractVisualizationInput<JFreeChartVisualisationSingleDatastreamInput<T>> input =
        // new JFreeChartVisualisationInput(
        // (AbstractVisualizationSingleDatastreamInput) visualization);
        //
        // try {
        // final IWorkbenchPage page = Activator.getDefault()
        // .getWorkbench().getActiveWorkbenchWindow()
        // .getActivePage();
        // page.openEditor(input,
        // "org.palladiosimulator.edp2.visualization.editors.JFreeChartEditor");
        // } catch (final PartInitException e) {
        // }
        //
        // }
        // }
        // }
        // refresh();
    }

    /**
     * Creates and initializes the list of the applied filters and the properties table. A selection
     * listener looks if one entry in the filter list is selected and if one is selected the
     * {@link TransformationsPropertySection#refreshPropertiesTable()} is called. A listener look
     * for the properties table and call
     * {@link TransformationsPropertySection#updateProperties(String, Object)} of the value field is
     * let out by pressing ENTER.
     *
     * @param parentGroup
     *            the parent GUI Object
     */
    private void initTransformationTable(final Composite parent) {
        transformationTable = new EDP2PropertiesTable(parent);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.views.properties.tabbed.AbstractPropertySection#setInput
     * (org.eclipse.ui.IWorkbenchPart, org.eclipse.jface.viewers.ISelection)
     */
    @Override
    public void setInput(final IWorkbenchPart part, final ISelection selection) {
        super.setInput(part, selection);
    }

    private boolean editorExists() {
        IWorkbenchWindow window = Activator.getDefault().getWorkbench().getActiveWorkbenchWindow();
        this.editor = null;

        if (window != null && window.getActivePage() != null) {
            IEditorPart activeEditor = window.getActivePage().getActiveEditor();
            if (activeEditor != null) {
                @SuppressWarnings("unchecked")
                AbstractEditor<AbstractVisualizationSingleDatastreamInput> activeAbstractEditor = (AbstractEditor<AbstractVisualizationSingleDatastreamInput>) activeEditor;
                this.editor = activeAbstractEditor;
            }
        }
        return this.editor != null;
    }

    /**
     * Refresh the items in the filters properties table. It shows the properties of the selected
     * filter in the list.
     *
     * @param abstractTransformation
     */
    private void refreshPropertiesTable() {
        transformationTable.refreshTable();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.views.properties.tabbed.AbstractPropertySection#refresh()
     */
    @Override
    public void refresh() {
        if (editorExists()) {
            treeViewer.setInput(editor.getEditorInput());
            treeViewer.refresh();
            treeViewer.addSelectionChangedListener(this);
        }
    }

    @Override
    public void selectionChanged(final SelectionChangedEvent event) {
        final ITreeSelection selection = (ITreeSelection) event.getSelectionProvider().getSelection();
        if (selection.getFirstElement() instanceof IDataSource) {
            selectedAdapter = (IDataSource) selection.getFirstElement();
            this.transformationTable.setLastSelection(selectedAdapter.getConfiguration());
            refreshPropertiesTable();
        } else {
            selectedInput = (IVisualisationSingleDatastreamInput) selection.getFirstElement();
            this.transformationTable.setLastSelection(null);
        }
    }

}
