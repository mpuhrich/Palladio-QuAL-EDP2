package org.palladiosimulator.edp2.visualization.jfreechart.editor;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.EditorPart;
import org.jfree.chart.JFreeChart;
import org.jfree.experimental.chart.swt.ChartComposite;
import org.palladiosimulator.edp2.visualization.editors.AbstractEditor;
import org.palladiosimulator.edp2.visualization.jfreechart.input.JFreeChartVisualizationInput;
import org.palladiosimulator.edp2.visualization.jfreechart.input.JFreeChartVisualizationSingleDatastreamInput;

/**
 * Implementation of an {@link EditorPart}, which is responsible for showing different subclasses of
 * {@link JFreeChart}.
 * 
 * @author Dominik Ernst
 */
public class JFreeChartEditor extends AbstractEditor<JFreeChartVisualizationSingleDatastreamInput> {

    /** This editor's ID, e.g. for Referencing in extension points. */
    public static final String EDITOR_ID = "org.palladiosimulator.edp2.visualization.editors.JFreeChartEditor";

    /** The container in which a {@link JFreeChart} is contained. */
    protected ChartComposite chartContainer;

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.part.WorkbenchPart#createPartControl(org.eclipse.swt.widgets.Composite)
     */
    @Override
    public void createPartControl(final Composite parent) {
        super.createPartControl(parent);
        chartContainer = new CustomJFreeChartComposite(parent, SWT.NONE);
        updateEditorContents();
        addDropSupport(chartContainer);
    }

    /**
     * Method, which describes the default updating process of the current chart.
     */
    @Override
    public void updateEditorContents() {
        final JFreeChart chart = ((JFreeChartVisualizationInput) getVisualisationInput()).createChart();
        chartContainer.setChart(chart);
        chartContainer.forceRedraw();
    }

    @Override
    protected String getEditorName() {
        return "JFreeChartEditor";
    }
}
