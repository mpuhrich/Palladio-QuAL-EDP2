package org.palladiosimulator.edp2.visualization.properties.sections;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.views.properties.tabbed.ISection;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;
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
 * @author Roland Richter, Dominik Ernst
 *
 */
public class DisplayPropertySection implements ISelectionChangedListener, ISection {

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

    /**
     * The property sheet page containing this section.
     */
    private TabbedPropertySheetPage tabbedPropertySheetPage;

    /*
     * (non-Javadoc)
     *
     * @see org.eclipse.ui.views.properties.tabbed.AbstractPropertySection#createControls
     * (org.eclipse.swt.widgets.Composite,
     * org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage)
     */
    @Override
    public void createControls(final Composite parent, final TabbedPropertySheetPage aTabbedPropertySheetPage) {
        this.tabbedPropertySheetPage = aTabbedPropertySheetPage;
        composite = getWidgetFactory().createFlatFormComposite(parent);
        composite.setBackground(parent.getDisplay().getSystemColor(SWT.COLOR_WIDGET_BACKGROUND));
        composite.setSize(800, 275);
        createLayout(composite);

        final Group groupCommon = new Group(composite, SWT.NONE);
        groupCommon.setText("Common Options");
        groupCommon.setLayout(new GridLayout(1, false));

        final Group groupSpecific = new Group(composite, SWT.NONE);
        groupSpecific.setText("Input-specific Options");
        groupSpecific.setLayout(new GridLayout(2, false));

        // create empty input list
        listViewer = new InputElementList(groupSpecific, SWT.EMBEDDED, null).getListViewer();
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
        commonPropertiesTable = new EDP2PropertiesTable(parent);
    }

    /**
     * Creates the table for input-specific properties.
     *
     * @param parent
     *            the composite in which the table is created
     */
    private void createSpecificPropertiesTable(final Composite parent) {
        specificPropertiesTable = new EDP2PropertiesTable(parent);
    }

    /*
     * (non-Javadoc)
     *
     * @see org.eclipse.ui.views.properties.tabbed.AbstractPropertySection#setInput
     * (org.eclipse.ui.IWorkbenchPart, org.eclipse.jface.viewers.ISelection)
     */
    @Override
    public void setInput(final IWorkbenchPart part, final ISelection selection) {
    }

    /**
     * Retrieves the input of the last active editor. <code>null</code> if no editor was active
     * during the current session.
     *
     * @return
     */
    private AbstractInput getInput() {
        return (AbstractInput) editor.getEditorInput();
    }

    /*
     * (non-Javadoc)
     *
     * @see org.eclipse.ui.views.properties.tabbed.ISection#refresh()
     */
    @Override
    public void refresh() {
        if (editorExists() && listViewer.getInput() == null) {
            commonPropertiesTable.setLastSelection(((AbstractVisualizationInput<?>)getInput()).getConfiguration());
            listViewer.setInput(getInput());
            listViewer.addSelectionChangedListener(this);
        }
        listViewer.refresh();
        if (getInput() != null) {
            commonPropertiesTable.refreshTable();
        }
        composite.layout();
    }

    private void createLayout(final Composite composite) {
        final GridLayout layout = new GridLayout(2, false);
        composite.setLayout(layout);
    }

    @Override
    public void selectionChanged(final SelectionChangedEvent event) {
        final IStructuredSelection selection = (IStructuredSelection) listViewer.getSelection();
        final AbstractVisualizationSingleDatastreamInput lastSelectedInput = (AbstractVisualizationSingleDatastreamInput) selection.getFirstElement();
        if (lastSelectedInput != null) {
            specificPropertiesTable.setLastSelection(lastSelectedInput.getConfiguration());
        }
        refresh();
    }

    @Override
    public void aboutToBeHidden() {
        // TODO Auto-generated method stub

    }

    @Override
    public void aboutToBeShown() {
        // TODO Auto-generated method stub

    }

    @Override
    public void dispose() {
        // TODO Auto-generated method stub

    }

    @Override
    public int getMinimumHeight() {
        return SWT.DEFAULT;
    }

    private boolean editorExists() {
        final IWorkbenchWindow window = Activator.getDefault().getWorkbench().getActiveWorkbenchWindow();
        if (window == null) {
            editor = null;
            return false;
        } else if (window.getActivePage() == null) {
            editor = null;
            return false;
        } else if (window.getActivePage().getActiveEditor() == null) {
            editor = null;
            return false;
        } else {
            editor = (AbstractEditor<AbstractVisualizationSingleDatastreamInput>) window.getActivePage()
                    .getActiveEditor();
            return true;
        }
    }

    @Override
    public boolean shouldUseExtraSpace() {
        return false;
    }

    /**
     * Get the widget factory for the property sheet page.
     *
     * @return the widget factory.
     */
    public TabbedPropertySheetWidgetFactory getWidgetFactory() {
        return tabbedPropertySheetPage.getWidgetFactory();
    }
}
