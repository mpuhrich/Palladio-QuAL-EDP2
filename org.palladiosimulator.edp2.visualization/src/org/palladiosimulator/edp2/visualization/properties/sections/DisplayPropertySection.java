package org.palladiosimulator.edp2.visualization.properties.sections;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableLayout;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.TableEditor;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.ColorDialog;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.views.properties.tabbed.ISection;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;
import org.palladiosimulator.edp2.visualization.AbstractInput;
import org.palladiosimulator.edp2.visualization.AbstractVisualizationSingleDatastreamInput;
import org.palladiosimulator.edp2.visualization.Activator;
import org.palladiosimulator.edp2.visualization.editors.JFreeChartEditor;
import org.palladiosimulator.edp2.visualization.editors.JFreeChartVisualizationConfiguration;
import org.palladiosimulator.edp2.visualization.editors.JFreeChartVisualizationSingleDatastreamConfiguration;
import org.palladiosimulator.edp2.visualization.editors.JFreeChartVisualizationSingleDatastreamInput;

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
    private JFreeChartEditor editor;

    /**
     * A tree, which contains the editor's inputs and their transformations (as children)
     */
    private ListViewer listViewer;

    /**
     * The basic composite in this section.
     */
    private Composite composite;

    /**
     * The last selected input, the properties of which are displayed in the table.
     */
    private AbstractVisualizationSingleDatastreamInput lastSelectedInput;

    /**
     * The table for displaying visual properties of the selected transformation.
     */
    private Table specificPropertiesTable;

    /**
     * The table for displaying visual properties all current inputs.
     */
    private Table commonPropertiesTable;

    /**
     * Index of the column in the {@link #visualPropertiesTable} containing the properties' labels.
     */
    private static int labelColumn = 0;

    /**
     * Index of the column in the {@link #visualPropertiesTable} containing the properties' editable
     * values.
     */
    private static int editColumn = 1;

    /**
     * Viewer for the table containing the visual properties of the selected transformation.
     */
    private TableViewer specificPropertiesTableViewer;

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
    private void createCommonPropertiesTable(final Composite composite) {
        commonPropertiesTable = new Table(composite, SWT.SINGLE | SWT.BORDER | SWT.V_SCROLL | SWT.FULL_SELECTION);

        commonPropertiesTable.setLinesVisible(true);
        commonPropertiesTable.setHeaderVisible(true);

        // set the table layout
        final GridData gridData = new GridData(SWT.FILL, SWT.FILL, false, true, 1, 1);
        gridData.heightHint = 250;
        gridData.widthHint = 250;
        commonPropertiesTable.setLayoutData(gridData);

        final TableLayout tableLayout = new TableLayout();
        tableLayout.addColumnData(new ColumnWeightData(2));
        tableLayout.addColumnData(new ColumnWeightData(1));
        commonPropertiesTable.setLayout(tableLayout);

        final TableViewer commonPropertiesTableViewer = new TableViewer(commonPropertiesTable);
        final TableViewerColumn keyColumn = new TableViewerColumn(commonPropertiesTableViewer, SWT.NONE);
        keyColumn.getColumn().setText("Property");

        final TableViewerColumn valueColumn = new TableViewerColumn(commonPropertiesTableViewer, SWT.NONE);
        valueColumn.getColumn().setText("Value");

        // the editor for the cells
        commonPropertiesTable.addListener(SWT.MouseDown, new Listener() {
            @Override
            public void handleEvent(final Event event) {
                final Rectangle clientArea = commonPropertiesTable.getClientArea();
                final Point pt = new Point(event.x, event.y);
                int index = commonPropertiesTable.getTopIndex();
                while (index < commonPropertiesTable.getItemCount()) {
                    boolean visible = false;
                    final TableItem item = commonPropertiesTable.getItem(index);
                    // look if the mouse event is in the editable column
                    final Rectangle rect = item.getBounds(editColumn);
                    if (rect.contains(pt)) {
                        // boolean properties
                        if (item.getText(labelColumn).equals(JFreeChartVisualizationConfiguration.SHOW_LEGEND_KEY)
                                || (item.getText(labelColumn)
                                        .equals(JFreeChartVisualizationConfiguration.SHOW_TITLE_KEY))) {
                            openBooleanDialog(index, commonPropertiesTable);
                        }
                        // textual properties
                        else {
                            openTextDialog(index, commonPropertiesTable);
                        }
                        return;
                    }
                    if (!visible && rect.intersects(clientArea)) {
                        visible = true;
                    }
                    if (!visible) {
                        return;
                    }
                    index++;
                }
            }
        });

    }

    /**
     * Creates the table for input-specific properties.
     * 
     * @param parent
     *            the composite in which the table is created
     */
    private void createSpecificPropertiesTable(final Composite parent) {

        // initialize the table, which shows the properties of transformations
        specificPropertiesTable = new Table(parent, SWT.SINGLE | SWT.BORDER | SWT.V_SCROLL | SWT.FULL_SELECTION);

        specificPropertiesTable.setLinesVisible(true);
        specificPropertiesTable.setHeaderVisible(true);

        // set the table layout
        final GridData gridData = new GridData(SWT.FILL, SWT.FILL, false, true, 1, 1);
        gridData.heightHint = 250;
        gridData.widthHint = 400;
        specificPropertiesTable.setLayoutData(gridData);

        final TableLayout tableLayout = new TableLayout();
        tableLayout.addColumnData(new ColumnWeightData(2));
        tableLayout.addColumnData(new ColumnWeightData(1));
        specificPropertiesTable.setLayout(tableLayout);

        specificPropertiesTableViewer = new TableViewer(specificPropertiesTable);
        final TableViewerColumn keyColumn = new TableViewerColumn(specificPropertiesTableViewer, SWT.NONE);
        keyColumn.getColumn().setText("Property");

        final TableViewerColumn valueColumn = new TableViewerColumn(specificPropertiesTableViewer, SWT.NONE);
        valueColumn.getColumn().setText("Value");

        // the editor for the cells

        specificPropertiesTable.addListener(SWT.MouseDown, new Listener() {
            @Override
            public void handleEvent(final Event event) {
                final Rectangle clientArea = specificPropertiesTable.getClientArea();
                final Point pt = new Point(event.x, event.y);
                int index = specificPropertiesTable.getTopIndex();
                while (index < specificPropertiesTable.getItemCount()) {
                    boolean visible = false;
                    final TableItem item = specificPropertiesTable.getItem(index);
                    // look if the mouse event is in the editable column
                    final Rectangle rect = item.getBounds(editColumn);
                    if (rect.contains(pt)) {
                        // color properties
                        if (item.getText(labelColumn).equals(
                                JFreeChartVisualizationSingleDatastreamConfiguration.COLOR_KEY)) {
                            openColorAndTransparencyDialog(item, specificPropertiesTable);
                            // boolean properties
                        }
                        // FIXME
                        // else if (item.getText(labelColumn).equals(
                        // HistogramEditorInput.ABSOLUTE_FREQUENCY_KEY)
                        // || (item.getText(labelColumn)
                        // .equals(HistogramEditorInput.SHOW_ITEM_VALUES_KEY))
                        // || (item.getText(labelColumn)
                        // .equals(HistogramEditorInput.SHOW_DOMAIN_AXIS_LABEL_KEY))
                        // || (item.getText(labelColumn)
                        // .equals(HistogramEditorInput.SHOW_RANGE_AXIS_LABEL_KEY))
                        // || (item.getText(labelColumn)
                        // .equals(HistogramEditorInput.INCLUDE_ZERO_KEY))) {
                        // openBooleanDialog(index, specificPropertiesTable);
                        // }
                        // textual properties
                        else {
                            openTextDialog(index, specificPropertiesTable);
                        }
                        return;
                    }
                    if (!visible && rect.intersects(clientArea)) {
                        visible = true;
                    }
                    if (!visible) {
                        return;
                    }
                    index++;
                }
            }
        });

    }

    /**
     * Opens a text dialog for editing cells in the {@link #visualPropertiesTable} by entering text.
     * 
     * @param index
     *            the row-index of the cell to be edited
     */
    protected void openTextDialog(final int index, final Table table) {
        final TableEditor editor = new TableEditor(table);
        editor.horizontalAlignment = SWT.LEFT;
        editor.grabHorizontal = true;

        final Text text = new Text(table, SWT.NONE);
        final Listener textListener = new Listener() {
            @Override
            public void handleEvent(final Event e) {
                switch (e.type) {
                case SWT.FocusOut:
                    text.dispose();
                    e.doit = false;
                    break;
                case SWT.Traverse:
                    switch (e.detail) {
                    case SWT.TRAVERSE_RETURN:
                        table.getItem(index).setText(editColumn, text.getText());
                        updateProperties(table.getItem(index).getText(labelColumn), text.getText(), table);
                        refreshSpecificPropertiesTable();
                        refreshCommonPropertiesTable();
                    case SWT.TRAVERSE_ESCAPE:
                        text.dispose();
                        e.doit = false;
                    }
                    break;
                }
            }
        };
        text.addListener(SWT.FocusOut, textListener);
        text.addListener(SWT.Traverse, textListener);
        editor.setEditor(text, table.getItem(index), editColumn);
        text.setText(table.getItem(index).getText(editColumn));
        text.selectAll();
        text.setFocus();
    }

    /**
     * Opens a dropdown ({@link Combo}) for editing cells in the {@link #visualPropertiesTable},
     * which can only have boolean values.
     * 
     * @param index
     *            the row-index of the cell to be edited
     */
    protected void openBooleanDialog(final int index, final Table table) {
        final TableEditor editor = new TableEditor(table);
        editor.horizontalAlignment = SWT.LEFT;
        editor.grabHorizontal = true;
        final Combo comboBox = new Combo(table, SWT.DROP_DOWN);
        comboBox.setItems(new String[] { "true", "false" });
        // set the currently selected item to the value stored in the cell
        comboBox.select(table.getItem(index).getText(editColumn).equals("true") ? 0 : 1);

        final String key = table.getItem(index).getText(labelColumn);
        comboBox.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(final SelectionEvent e) {
                table.getItem(index).setText(editColumn, comboBox.getItem(comboBox.getSelectionIndex()));
                updateProperties(key, comboBox.getItem(comboBox.getSelectionIndex()), table);
                // if the changed field was the frequency, reset the label of
                // the range
                // axis to default
                // FIXME
                // if (table.getItem(index).getText(labelColumn)
                // .equals(HistogramEditorInput.ABSOLUTE_FREQUENCY_KEY)) {
                // final HistogramEditorInput firstInput = ((HistogramEditorInput)
                // ((AbstractVisualizationInput<JFreeChartVisualisationSingleDatastreamInput<T>>)
                // getInput())
                // .getInputs().get(0));
                // firstInput.setRangeAxisLabel(firstInput
                // .getDefaultRangeAxisLabel());
                // }
                comboBox.dispose();
            }

            @Override
            public void widgetDefaultSelected(final SelectionEvent e) {
                comboBox.dispose();
            }
        });
        comboBox.addListener(SWT.FocusOut, new Listener() {
            @Override
            public void handleEvent(final Event event) {
                comboBox.dispose();
                event.doit = false;
                return;
            }
        });
        editor.setEditor(comboBox, table.getItem(index), editColumn);
    }

    /**
     * Opens a {@link ColorDialog} to change the color of the last selected
     * {@link JFreeChartVisualizationSingleDatastreamInput}.
     * 
     * @param item
     *            index the row-index of the cell to be edited
     * @param shell
     *            the Shell in which the dialog is displayed.
     */
    protected void openColorAndTransparencyDialog(final TableItem item, final Table table) {
        final ColorDialog colorPicker = new ColorDialog(table.getShell());
        colorPicker.setRGB(item.getBackground().getRGB());
        final RGB rgbColor = colorPicker.open();
        if (rgbColor != null) {
            item.setBackground(editColumn, new org.eclipse.swt.graphics.Color(table.getDisplay(), rgbColor));
            updateProperties(item.getText(labelColumn),
                    "#"
                            + Integer.toHexString(new Color(rgbColor.red, rgbColor.green, rgbColor.blue).getRGB())
                            .substring(2), table);
        }

    }

    /**
     * Update the table containing the properties of the {@link #lastSelectedInput}.
     */
    private void refreshSpecificPropertiesTable() {

        specificPropertiesTable.clearAll();
        specificPropertiesTable.setItemCount(0);

        final Map<String, Object> properties = lastSelectedInput.getProperties();

        for (final String key : properties.keySet()) {
            final TableItem item = new TableItem(specificPropertiesTable, SWT.NONE);
            item.setText(0, String.valueOf(key));
            item.setText(1, String.valueOf(properties.get(key)));
            if (String.valueOf(key).equals(JFreeChartVisualizationSingleDatastreamConfiguration.COLOR_KEY)) {
                final String hexColor = String.valueOf(properties.get(key));
                if (hexColor.equals(JFreeChartVisualizationSingleDatastreamConfiguration.NO_COLOR)) {
                    item.setText(1, "(default Color)");
                } else {
                    item.setText(1, "");
                    final Color col = Color.decode(hexColor);
                    item.setBackground(
                            1,
                            new org.eclipse.swt.graphics.Color(specificPropertiesTable.getDisplay(), col.getRed(), col
                                    .getGreen(), col.getBlue()));
                }
            }
        }

    }

    /**
     * Update the table containing the properties of the {@link #lastSelectedInput}.
     */
    private void refreshCommonPropertiesTable() {
        commonPropertiesTable.clearAll();
        commonPropertiesTable.setItemCount(0);

        final Map<String, Object> commonProperties = getInput().getConfiguration().getProperties();

        for (final Object key : commonProperties.keySet()) {
            final TableItem item = new TableItem(commonPropertiesTable, SWT.NONE);
            item.setText(0, String.valueOf(key));
            item.setText(1, String.valueOf(commonProperties.get(key)));
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.views.properties.tabbed.AbstractPropertySection#setInput
     * (org.eclipse.ui.IWorkbenchPart, org.eclipse.jface.viewers.ISelection)
     */
    @Override
    public void setInput(final IWorkbenchPart part, final ISelection selection) {
        // this.part = part;
        // this.selection = selection;
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
            listViewer.setInput(getInput());
            listViewer.addSelectionChangedListener(this);
        }
        listViewer.refresh();
        if (getInput() != null) {
            refreshCommonPropertiesTable();
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
        lastSelectedInput = (AbstractVisualizationSingleDatastreamInput) selection.getFirstElement();
        if (lastSelectedInput != null) {
            refreshSpecificPropertiesTable();
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
            editor = (JFreeChartEditor) window.getActivePage().getActiveEditor();
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

    /**
     * Update the properties of the selected input. Uses
     * {@link AbstractTransformation#setProperties(HashMap)} to update the properties.
     * 
     * @param key
     *            the key of the updated value as a String.
     * @param value
     *            the value as an Object.
     */
    private void updateProperties(final String key, final Object value, final Table table) {
        // get properties for keys and old values
        if (table == specificPropertiesTable) {
            final Map<String, Object> newProperties = new HashMap<String, Object>(lastSelectedInput.getProperties());
            newProperties.put(key, value);
            lastSelectedInput.getConfiguration().setProperties(newProperties);
        } else {
            final Map<String, Object> newProperties = new HashMap<String, Object>(getInput().getConfiguration()
                    .getProperties());
            newProperties.put(key, value);
            getInput().getConfiguration().setProperties(newProperties);
        }

    }

}
