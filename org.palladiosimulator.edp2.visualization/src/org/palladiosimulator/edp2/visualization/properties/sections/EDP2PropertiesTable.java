package org.palladiosimulator.edp2.visualization.properties.sections;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.ClassUtils;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.viewers.ColumnWeightData;
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
import org.eclipse.swt.widgets.ColorDialog;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.palladiosimulator.commons.emfutils.EMFAdapterFactoryHelper;
import org.palladiosimulator.edp2.datastream.configurable.IPropertyConfigurable;

import de.uka.ipd.sdq.dialogs.selection.SelectEObjectDialog;

class EDP2PropertiesTable {

    /**
     * Index of the column in the {@link #visualPropertiesTable} containing the properties' editable
     * values.
     */
    private static int editColumn = 1;

    /**
     * Index of the column in the {@link #visualPropertiesTable} containing the properties' labels.
     */
    private static int labelColumn = 0;

    private final Table myTable;

    /**
     * The last selected input, the properties of which are displayed in the table.
     */
    private IPropertyConfigurable lastSelectedInput;

    public EDP2PropertiesTable(final Composite parent) {
        myTable = new Table(parent, SWT.SINGLE | SWT.BORDER | SWT.V_SCROLL | SWT.FULL_SELECTION);

        myTable.setLinesVisible(true);
        myTable.setHeaderVisible(true);

        // set the table layout
        final GridData gridData = new GridData(SWT.FILL, SWT.FILL, false, true, 1, 1);
        gridData.heightHint = 250;
        gridData.widthHint = 250;
        myTable.setLayoutData(gridData);

        final TableLayout tableLayout = new TableLayout();
        tableLayout.addColumnData(new ColumnWeightData(1));
        tableLayout.addColumnData(new ColumnWeightData(2));
        myTable.setLayout(tableLayout);

        final TableViewer commonPropertiesTableViewer = new TableViewer(myTable);
        final TableViewerColumn keyColumn = new TableViewerColumn(commonPropertiesTableViewer, SWT.NONE);
        keyColumn.getColumn().setText("Property");

        final TableViewerColumn valueColumn = new TableViewerColumn(commonPropertiesTableViewer, SWT.NONE);
        valueColumn.getColumn().setText("Value");

        // the editor for the cells
        myTable.addListener(SWT.MouseDown, new Listener() {
            @Override
            public void handleEvent(final Event event) {
                final Rectangle clientArea = myTable.getClientArea();
                final Point pt = new Point(event.x, event.y);
                int index = myTable.getTopIndex();
                while (index < myTable.getItemCount()) {
                    boolean visible = false;
                    final TableItem item = myTable.getItem(index);
                    // look if the mouse event is in the editable column
                    final Rectangle rect = item.getBounds(editColumn);
                    if (rect.contains(pt)) {
                        final Class<?> propertyType = lastSelectedInput.getPropertyType(
                                item.getText(labelColumn));
                        if (ClassUtils.isAssignable(Boolean.class, propertyType, true)) {
                            openBooleanDialog(index, myTable);
                        } else if (ClassUtils.isAssignable(String.class, propertyType, true)) {
                            openTextDialog(index, myTable);
                        } else if (ClassUtils.isAssignable(Color.class, propertyType, true)) {
                            openColorAndTransparencyDialog(item, myTable);
                        } else if (ClassUtils.isAssignable(propertyType, EObject.class, true)) {
                            openEObjectDialog(item, myTable);
                        } else {
                            throw new RuntimeException("Unsupported property type found!");
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
            final Color newColor = new Color(rgbColor.red, rgbColor.green, rgbColor.blue);
            updateColorCell(item, newColor);
            updateProperties(item.getText(labelColumn), newColor, table);
        }

    }

    /**
     * Opens an {@link EObjectDialog} to change the EObject of the last selected
     * {@link JFreeChartVisualizationSingleDatastreamInput}.
     *
     * @param item
     *            index the row-index of the cell to be edited
     * @param shell
     *            the Shell in which the dialog is displayed.
     */
    protected void openEObjectDialog(final TableItem item, final Table table) {
        final SelectEObjectDialog selectEObjectDialog = new SelectEObjectDialog(table.getShell(), "EObject",
                new ResourceSetImpl(), EMFAdapterFactoryHelper.ADPATER_FACTORY_CONTENT_PROVIDER,
                EMFAdapterFactoryHelper.ADAPTER_FACTORY_LABEL_PROVIDER);

        selectEObjectDialog.setProvidedService(EObject.class);
        selectEObjectDialog.open();
        if (selectEObjectDialog.getResult() != null) {
            final EObject eObject = selectEObjectDialog.getResult();
            updateProperties(item.getText(labelColumn), eObject, table);
        }
    }

    /**
     * @param item
     * @param col
     */
    private void updateColorCell(final TableItem item, final Color col) {
        if (col.getAlpha() == 0) {
            item.setText(1, "(default Color)");
        } else {
            item.setText(1, "");
            item.setBackground(1, new org.eclipse.swt.graphics.Color(myTable.getDisplay(),
                    col.getRed(), col.getGreen(), col.getBlue()));
        }
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
                        refreshTable();
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
        comboBox.setItems(new String[] {
                "true", "false"
        });
        // set the currently selected item to the value stored in the cell
        comboBox.select(table.getItem(index).getText(editColumn).equals("true") ? 0 : 1);

        final String key = table.getItem(index).getText(labelColumn);
        comboBox.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(final SelectionEvent e) {
                table.getItem(index).setText(editColumn, comboBox.getItem(comboBox.getSelectionIndex()));
                updateProperties(key, "true".equals(comboBox.getItem(comboBox.getSelectionIndex())), table);
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
     * Update the properties of the selected input. Uses
     * {@link AbstractTransformation#setProperties(HashMap)} to update the properties.
     *
     * @param key
     *            the key of the updated value as a String.
     * @param value
     *            the value as an Object.
     */
    private void updateProperties(final String key, final Object value, final Table table) {
        final Map<String, Object> newProperties = new HashMap<String, Object>(lastSelectedInput.getProperties());
        newProperties.put(key, value);
        lastSelectedInput.setProperties(newProperties);
    }

    /**
     * Update the table containing the properties of the {@link #lastSelectedInput}.
     */
    public void refreshTable() {
        myTable.clearAll();
        myTable.setItemCount(0);

        if (lastSelectedInput != null) {
            final Map<String, Object> properties = lastSelectedInput.getProperties();

            for (final String key : properties.keySet()) {
                final TableItem item = new TableItem(myTable, SWT.NONE);
                item.setText(0, String.valueOf(key));

                if (lastSelectedInput.isPropertyNotSet(key)) {
                    item.setText(1, "<not set>");
                } else {
                    final Class<?> propertyType = lastSelectedInput.getPropertyType(key);
                    if (ClassUtils.isAssignable(propertyType, Color.class)) {
                        final Color col = (Color) properties.get(key);
                        updateColorCell(item, col);
                    } else if (ClassUtils.isAssignable(EObject.class, propertyType)) {
                        final String displayString = EMFAdapterFactoryHelper.ADAPTER_FACTORY_LABEL_PROVIDER.getText(properties.get(key));
                        item.setText(1, displayString);
                    } else {
                        item.setText(1, String.valueOf(properties.get(key)));
                    }
                }
            }
        }

    }

    public void setLastSelection(final IPropertyConfigurable iPropertyConfigurable) {
        this.lastSelectedInput = iPropertyConfigurable;
        refreshTable();
    }
}
