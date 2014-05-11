package org.palladiosimulator.edp2.visualization.properties.sections;

import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.palladiosimulator.edp2.visualization.AbstractVisualizationInput;
import org.palladiosimulator.edp2.visualization.AbstractVisualizationSingleDatastreamInput;
import org.palladiosimulator.edp2.visualization.editors.JFreeChartVisualizationSingleDatastreamInput;

public class InputSelectionComposite extends Composite {

    private ComboViewer comboViewer;
    private Combo combo_1;
    private final FormToolkit toolkit = new FormToolkit(Display.getCurrent());

    /**
     * Create the composite.
     * 
     * @param parent
     * @param style
     */
    public InputSelectionComposite(final Composite parent, final int style,
            final AbstractVisualizationInput<JFreeChartVisualizationSingleDatastreamInput> inputHandle) {
        super(parent, SWT.EMBEDDED);
        addDisposeListener(new DisposeListener() {
            @Override
            public void widgetDisposed(final DisposeEvent e) {
                toolkit.dispose();
            }
        });
        toolkit.adapt(this);
        toolkit.paintBordersFor(this);
        setLayout(null);

        comboViewer = new ComboViewer(this, SWT.NONE);

        comboViewer.setLabelProvider(new ILabelProvider() {

            @Override
            public void removeListener(final ILabelProviderListener listener) {
                // TODO Auto-generated method stub

            }

            @Override
            public boolean isLabelProperty(final Object element, final String property) {
                // TODO Auto-generated method stub
                return false;
            }

            @Override
            public void dispose() {
                // TODO Auto-generated method stub

            }

            @Override
            public void addListener(final ILabelProviderListener listener) {
                // TODO Auto-generated method stub

            }

            @Override
            public String getText(final Object element) {
                return ((AbstractVisualizationSingleDatastreamInput) element).getInputName();
            }

            @Override
            public Image getImage(final Object element) {
                // TODO Auto-generated method stub
                return null;
            }
        });
        comboViewer.setContentProvider(new IStructuredContentProvider() {
            @Override
            public Object[] getElements(final Object inputElement) {
                return inputHandle.getInputs().toArray();
            }

            @Override
            public void dispose() {
            }

            @Override
            public void inputChanged(final Viewer viewer, final Object oldInput,
                    final Object newInput) {
            }
        });
        comboViewer.setInput(inputHandle);
        combo_1 = comboViewer.getCombo();
        combo_1.setBounds(0, 0, 177, 23);
        toolkit.paintBordersFor(combo_1);

    }

    public AbstractVisualizationSingleDatastreamInput getInputSelection() {
        final IStructuredSelection selection = (IStructuredSelection) comboViewer
                .getSelection();
        return (AbstractVisualizationSingleDatastreamInput) selection.getFirstElement();
    }

    /**
     * @return the combo_1
     */
    public Combo getComboBox() {
        return combo_1;
    }
}
