package org.palladiosimulator.edp2.visualization.editors;

import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.EditorPart;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.Dataset;
import org.jfree.experimental.chart.swt.ChartComposite;

/**
 * Implementation of an {@link EditorPart}, which is responsible for showing
 * different subclasses of {@link JFreeChart}.
 * 
 * @author Dominik Ernst
 */
public class JFreeChartEditor<T extends Dataset> extends AbstractEditor<JFreeChartEditorInput<T>> {

    /** This editor's ID, e.g. for Referencing in extension points. */
    public static final String EDITOR_ID = "org.palladiosimulator.edp2.visualization.editors.JFreeChartEditor";

    /**
     * Title of this Editor.
     */
    private final static String EDITOR_NAME = "JFreeChartEditor";

    /** Logger for this class */
    private static Logger logger = Logger.getLogger(JFreeChartEditor.class
            .getCanonicalName());

    /** The container in which a {@link JFreeChart} is contained. */
    protected ChartComposite chartContainer;

    /**
     * The current chart.
     */
    JFreeChart chart;

    /*
     * (non-Javadoc)
     * @see org.eclipse.ui.part.WorkbenchPart#createPartControl(org.eclipse.swt.widgets.Composite)
     */
    @Override
    public void createPartControl(final Composite parent) {
        this.parent = parent;
        setPartName(EDITOR_NAME);
        setTitleToolTip(EDITOR_NAME);
        chart = getEditorInputHandle().createChart();
        chartContainer = new ChartComposite(parent, SWT.NONE, chart, false);
        getSite().setSelectionProvider(createSelectionProvider());
        addDropSupport(parent);
        getEditorInputHandle().addObserver(this);
    }

    /**
     * Method, which describes the default updating process of the current chart.
     */
    public void updateChart() {
        chart = getEditorInputHandle().createChart();
        chartContainer.setChart(chart);
        chartContainer.forceRedraw();
    }

    @Override
    public JFreeChartEditorInputHandle<T> getEditorInputHandle() {
        return (JFreeChartEditorInputHandle<T>)input;
    }

    @Override
    public void update(final Observable o, final Object arg) {
        logger.log(Level.INFO, "update invoked");
        updateChart();
    }
}
