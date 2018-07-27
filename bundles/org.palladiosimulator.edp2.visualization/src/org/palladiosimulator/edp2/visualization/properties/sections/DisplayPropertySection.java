package org.palladiosimulator.edp2.visualization.properties.sections;

import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.views.properties.tabbed.AbstractPropertySection;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.palladiosimulator.edp2.visualization.AbstractInput;
import org.palladiosimulator.edp2.visualization.AbstractVisualizationInput;
import org.palladiosimulator.edp2.visualization.AbstractVisualizationSingleDatastreamInput;
import org.palladiosimulator.edp2.visualization.Activator;
import org.palladiosimulator.edp2.visualization.editors.AbstractEditor;

/**
 * GUI controls for displaying options of {@link JFreeChartEditor}s. Shows and allows to edit visual
 * settings of the current Editor in the Eclipse Properties View if an {@link JFreeChartEditor} is
 * the currently active editor.
 *
 * @author Roland Richter, Dominik Ernst, Florian Rosenthal
 *
 */
public class DisplayPropertySection extends AbstractPropertySection implements ISelectionChangedListener {

    /**
     * The last active editor;
     */
    private AbstractEditor<AbstractVisualizationSingleDatastreamInput> editor;

    /**
     * A tree, which contains the editor's inputs and their transformations (as children)
     */
    private ListViewer listViewer;

    /**
     * The basic composite in this section.
     */
    private Composite composite;

    /**
     * The table for displaying visual properties of the selected transformation.
     */
    private EDP2PropertiesTable specificPropertiesTable;

    /**
     * The table for displaying visual properties all current inputs.
     */
    private EDP2PropertiesTable commonPropertiesTable;

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.views.properties.tabbed.AbstractPropertySection#createControls
     * (org.eclipse.swt.widgets.Composite,
     * org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage)
     */
    @Override
    public void createControls(final Composite parent, final TabbedPropertySheetPage aTabbedPropertySheetPage) {
        super.createControls(parent, aTabbedPropertySheetPage);
        this.composite = getWidgetFactory().createFlatFormComposite(parent);
        this.composite.setBackground(parent.getDisplay().getSystemColor(SWT.COLOR_WIDGET_BACKGROUND));
        this.composite.setSize(800, 275);
        createLayout(this.composite);

        Group groupCommon = new Group(this.composite, SWT.NONE);
        groupCommon.setText("Common Options");
        groupCommon.setLayout(new GridLayout(1, false));

        Group groupSpecific = new Group(this.composite, SWT.NONE);
        groupSpecific.setText("Input-specific Options");
        groupSpecific.setLayout(new GridLayout(2, false));

        // create empty input list
        this.listViewer = new InputElementList(groupSpecific, SWT.EMBEDDED, null).getListViewer();
        createCommonPropertiesTable(groupCommon);
        createSpecificPropertiesTable(groupSpecific);
    }

    /**
     * Creates the table for properties, which are common for all inputs.
     *
     * @param composite
     *            the composite in which the table is created
     */
    private void createCommonPropertiesTable(final Composite parent) {
        this.commonPropertiesTable = new EDP2PropertiesTable(parent);
    }

    /**
     * Creates the table for input-specific properties.
     *
     * @param parent
     *            the composite in which the table is created
     */
    private void createSpecificPropertiesTable(final Composite parent) {
        this.specificPropertiesTable = new EDP2PropertiesTable(parent);
    }

     /**
     * Retrieves the input of the last active editor. <code>null</code> if no editor was active
     * during the current session.
     *
     * @return
     */
    private AbstractInput getInput() {
        AbstractInput result = null;
        if (editorExists()) {
            result = (AbstractInput) this.editor.getEditorInput();
        }
        return result;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.views.properties.tabbed.ISection#refresh()
     */
    @Override
    public void refresh() {
        if (editorExists() && this.listViewer.getInput() == null) {
            this.commonPropertiesTable
                    .setLastSelection(((AbstractVisualizationInput<?>) getInput()).getConfiguration());
            this.listViewer.setInput(getInput());
            this.listViewer.addSelectionChangedListener(this);
        }
        this.listViewer.refresh();
        if (getInput() != null) {
            this.commonPropertiesTable.refreshTable();
        }
        this.composite.layout();
    }

    private void createLayout(final Composite composite) {
        final GridLayout layout = new GridLayout(2, false);
        composite.setLayout(layout);
    }

    @Override
    public void selectionChanged(final SelectionChangedEvent event) {
        final IStructuredSelection selection = (IStructuredSelection) this.listViewer.getSelection();
        final AbstractVisualizationSingleDatastreamInput lastSelectedInput = (AbstractVisualizationSingleDatastreamInput) selection
                .getFirstElement();
        if (lastSelectedInput != null) {
            this.specificPropertiesTable.setLastSelection(lastSelectedInput.getConfiguration());
        }
        refresh();
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
}
