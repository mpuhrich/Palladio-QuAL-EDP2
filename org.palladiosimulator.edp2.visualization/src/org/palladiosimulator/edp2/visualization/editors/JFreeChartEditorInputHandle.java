/**
 * 
 */
package org.palladiosimulator.edp2.visualization.editors;

import java.util.ArrayList;
import java.util.Map;
import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.IPersistableElement;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.Dataset;
import org.palladiosimulator.edp2.visualization.IVisualizationInputHandle;

/**
 * Implementation of an {@link IVisualizationInputHandle} for
 * {@link JFreeChartEditorInput}s.
 * 
 * @author Dominik Ernst
 * 
 */
public class JFreeChartEditorInputHandle<T extends Dataset> extends
IVisualizationInputHandle<JFreeChartEditorInput<T>> {

    Logger logger = Logger.getLogger(JFreeChartEditorInputHandle.class
            .getCanonicalName());

    /**
     * Constants used in property-persistence.
     */
    public static final String TITLE_KEY = "title";
    public static final String SHOW_TITLE_KEY = "showTitle";
    public static final String SHOW_LEGEND_KEY = "showLegend";

    /**
     * The title for the chart. Only used if the input is the main input, i.e.
     * the first input in case multiple inputs are supported by the editor.
     */
    private String title;
    private boolean showTitle;
    private boolean showLegend;

    /**
     * The list of inputs managed by this handle.
     */
    private final ArrayList<JFreeChartEditorInput<T>> inputs;

    /**
     * The chart, which ultimately displays the data from this handle.
     */
    private JFreeChart chart;

    /**
     * Empty constructor.
     */
    public JFreeChartEditorInputHandle() {
        super();
        inputs = new ArrayList<JFreeChartEditorInput<T>>();
        setShowLegend(true);
        setShowTitle(true);
    }

    /**
     * Constructor with a first input.
     */
    public JFreeChartEditorInputHandle(final JFreeChartEditorInput<T> firstInput) {
        inputs = new ArrayList<JFreeChartEditorInput<T>>();
        addInput(firstInput);
        setShowLegend(true);
        setShowTitle(true);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.palladiosimulator.edp2.visualization.IEditorInputHandler#addInput(de.uka
     * .ipd.sdq.edp2.visualization.IDataSink)
     */
    @Override
    public boolean addInput(final JFreeChartEditorInput<T> newInput) {
        inputs.add(newInput);
        // newInput.addObserver(this);
        newInput.setHandle(this);
        setChanged();
        notifyObservers();
        return true;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.palladiosimulator.edp2.visualization.IEditorInputHandler#getInputs()
     */
    @Override
    public ArrayList<JFreeChartEditorInput<T>> getInputs() {
        return inputs;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.palladiosimulator.edp2.visualization.IEditorInputHandler#removeInput(de.
     * uka.ipd.sdq.edp2.visualization.IDataSink)
     */
    @Override
    public boolean removeInput(final JFreeChartEditorInput<T> removedInput) {
        throw new RuntimeException("Not implemented.");
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.IEditorInput#exists()
     */
    @Override
    public boolean exists() {
        return !inputs.isEmpty();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.IEditorInput#getImageDescriptor()
     */
    @Override
    public ImageDescriptor getImageDescriptor() {
        throw new RuntimeException("Not implemented.");
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.IEditorInput#getName()
     */
    @Override
    public String getName() {
        return "someName";
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.IEditorInput#getPersistable()
     */
    @Override
    public IPersistableElement getPersistable() {
        return this;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.IEditorInput#getToolTipText()
     */
    @Override
    public String getToolTipText() {
        // TODO Auto-generated method stub
        return "someTT";
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.core.runtime.IAdaptable#getAdapter(java.lang.Class)
     */
    @SuppressWarnings("rawtypes")
    @Override
    public Object getAdapter(final Class adapter) {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
     */
    @Override
    public void update(final Observable o, final Object arg) {
        logger.log(Level.INFO, "update invoked");
        createChart();
        setChanged();
        notifyObservers();
    }

    /**
     * Creates a new {@link JFreeChart}. Charts are specific for each
     * EditorInput. Typically an update of the current DataSet is recommended,
     * before the chart itself is updated.
     */
    public JFreeChart createChart() {
        chart = getInputs().get(0).getChart();
        return chart;
    }

    @Override
    public boolean isEmpty() {
        return getInputsSize() == 0;
    }

    @Override
    public String getFactoryId() {
        return JFreeChartEditorInputHandleFactory.getFactoryId();
    }

    @Override
    public void saveState(final IMemento memento) {
        JFreeChartEditorInputHandleFactory.saveState(memento, this);
    }

    @Override
    public Map<String, Object> getProperties() {
        properties.put(TITLE_KEY, getTitle());
        properties.put(SHOW_LEGEND_KEY, String.valueOf(isShowLegend()));
        properties.put(SHOW_TITLE_KEY, String.valueOf(isShowTitle()));
        return properties;
    }

    @Override
    public void setProperties(final Map<String, Object> newProperties) {
        if (properties.get(TITLE_KEY) != null
                && newProperties.get(TITLE_KEY) != null) {
            setTitle(newProperties.get(TITLE_KEY).toString());
        }
        if (properties.get(SHOW_LEGEND_KEY) != null
                && newProperties.get(SHOW_LEGEND_KEY) != null) {
            setShowLegend(newProperties.get(SHOW_LEGEND_KEY).toString()
                    .equals("true") ? true : false);
        }
        if (properties.get(SHOW_TITLE_KEY) != null
                && newProperties.get(SHOW_TITLE_KEY) != null) {
            setShowTitle(newProperties.get(SHOW_TITLE_KEY).toString()
                    .equals("true") ? true : false);
        }

    }

    public String getTitle() {
        if (title == null) {
            return getInputs().get(0).getDefaultTitle();
        }
        return title;
    }

    public void setTitle(final String title) {
        this.title = title;
        setChanged();
        notifyObservers();
    }

    public boolean isShowTitle() {
        return showTitle;
    }

    public void setShowTitle(final boolean showTitle) {
        this.showTitle = showTitle;
        setChanged();
        notifyObservers();
    }

    public boolean isShowLegend() {
        return showLegend;
    }

    public void setShowLegend(final boolean showLegend) {
        this.showLegend = showLegend;
        setChanged();
        notifyObservers();
    }

    public Map<String, Object>[] getInputProperties() {
        @SuppressWarnings("unchecked")
        final Map<String, Object>[] allProperties = new Map[getInputsSize()];
        for (int i = 0; i < getInputsSize(); i++) {
            allProperties[i] = getInputs().get(i).getProperties();
        }
        return allProperties;
    }

}
