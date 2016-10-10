package org.palladiosimulator.edp2.distancemetrics.ui;

import org.eclipse.core.runtime.Platform;
 
import java.util.logging.Logger;

import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.views.properties.tabbed.AbstractPropertySection;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.palladiosimulator.edp2.datastream.edp2source.Edp2DataTupleDataSource;
import org.palladiosimulator.edp2.distancemetrics.ui.extensions.DistanceMetricExtension;
import org.palladiosimulator.edp2.distancemetrics.ui.extensions.properties.Format;
import org.palladiosimulator.edp2.util.MetricDescriptionUtility;
import org.palladiosimulator.edp2.visualization.AbstractInput;
import org.palladiosimulator.edp2.visualization.AbstractVisualizationSingleDatastreamInput;
import org.palladiosimulator.edp2.visualization.Activator;
import org.palladiosimulator.edp2.visualization.editors.AbstractEditor;


/**
 * This class creates the UI interface for the distance metric section in a tab.
 * 
 * @author Christian Schaf
 */
public class DistanceMetricsSection extends AbstractPropertySection implements ISelectionChangedListener {
	
    private static final Logger LOGGER = Logger.getLogger(DistanceMetricsSection.class.getCanonicalName());
    
    /**
     * The last active editor;
     */
    private AbstractEditor<AbstractVisualizationSingleDatastreamInput> editor;
    
    /**
     * The basic composite in this section.
     */
    private Composite composite;
    private Combo comboDropDown;
    private Text resultText;
    private Text descriptionText;
    private Button buttonCalculateDistance;

    private DistanceMetricExtensionHandler dmeHandler;

    private DistanceMetricViewer dmViewer1;
    private DistanceMetricViewer dmViewer2;
    
    private TabbedPropertySheetPage aTabbedPropertySheetPage;
    
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
        
        // Initializes everything necessary to distance metric extensions
        initializeDME();
        // This reference is needed for resizing horizontal scroll pane
        this.aTabbedPropertySheetPage = aTabbedPropertySheetPage;
        // Create layout
        createLayout(this.composite);
        // Initialize listeners
        initializeListeners();
        // Initialize selection with first distance metric in the list.
        initializeDistanceMetricSelection();
    }
    
    /**
     * Creates combo menu for distance metrics.
     * @param composite The Composite which will be the parent of this Combo.
     */
    private void createCombo(Composite composite) {
        comboDropDown = Helper.createCombo(composite, dmeHandler);
    }
    
    /**
     * Pick initial Distance Metric algorithm (first item in Combo) and set description label
     */
    private void initializeDistanceMetricSelection() {
        if (dmeHandler.getDistanceMetricExtensionList().size() != 0) {
            comboDropDown.select(0);
            DistanceMetricExtension dme = dmeHandler.getDistanceMetricExtensionList().get(0);
            descriptionText.setText(dme.getDistanceMetricDescription());
        }
    }
    
    /**
     * Loads all available working DistanceMetricExtensions.
     */
    private void initializeDME() {
		// Load extensions
        dmeHandler = DistanceMetricExtensionHandler.getInstance();
        dmeHandler.execute();
        LOGGER.info("Platform running: " + Platform.isRunning());
        LOGGER.info("Extensions loaded.");
    }
    
    /**
     * Initializes all listeners.
     */
    private void initializeListeners() {
        initializeButtonListeners(buttonCalculateDistance);
        initializeComboListeners(comboDropDown);
    }
    
    /**
     * Initialized the combo drop down with a listener, which
     * is responsible for what happens, when selection is changed.
     * 
     * @param comboDropDown The combo item which contains the distance metrics.
     */
    private void initializeComboListeners(Combo comboDropDown) {
    	SelectionListener comboListener
    		= new ComboListener(comboDropDown, dmeHandler, composite, aTabbedPropertySheetPage, descriptionText);
    	comboDropDown.addSelectionListener(comboListener);
	}

	/**
	 * Adds a listener to the calculate distance button and checks
	 * if two valid list entries have been selected.
	 * 
	 * @param buttonCalculateDistance The button, which is responsible for
	 * arranging the calculation.
	 */
	private void initializeButtonListeners(final Button buttonCalculateDistance) {
		CalculateButtonListener btnListener
		= new CalculateButtonListener(dmViewer1, dmViewer2, buttonCalculateDistance, comboDropDown, resultText, dmeHandler);
		buttonCalculateDistance.addListener(SWT.Selection, btnListener);
		
    }

     /**
     * Retrieves the input of the last active editor.
     *
     * @return Returns <code>null</code> if no editor was active
     * during the current session. Otherwise retrieves the input of the last active editor.
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
    	refreshViewer(dmViewer1);
    	refreshViewer(dmViewer2);        
        this.composite.layout();
    }
    
    /**
     * Refreshs the view of a DistanceMetricViewer.
     * @param dmViewer The DistanceMetricViewer to refresh.
     */
    private void refreshViewer(DistanceMetricViewer dmViewer) {
        if (editorExists() && dmViewer.getViewer().getInput() == null) {
            dmViewer.getViewer().setInput(getInput());
            dmViewer.getViewer().addSelectionChangedListener(this);
        }
        dmViewer.getViewer().refresh();
    }

    /**
     * Creates a GridLayout based on a Composite.
     * @param composite The Composite, the layout should
     * be created for.
     */
    private void createLayout(final Composite composite) {
    	final String groupDescription = "Distance Metrics";
    	final String calculateButtonDescription = "Calculate distance";
    	final GridLayout layout = new GridLayout(2, false);
        composite.setLayout(layout);

        Group groupDistanceMetrics = new Group(this.composite, SWT.NONE);
        groupDistanceMetrics.setText(groupDescription);
        groupDistanceMetrics.setLayout(new GridLayout(2, false));

        Composite left = new Composite(groupDistanceMetrics, SWT.NONE);
        left.setLayout(new GridLayout(1, false));
        Composite right = new Composite(groupDistanceMetrics, SWT.NONE);
        right.setLayout(new GridLayout(1, false));

        Composite inputElementComp = new Composite(left, SWT.NONE);
        inputElementComp.setLayout(new GridLayout(2, false));

		dmViewer1 = new DistanceMetricViewer(inputElementComp);
		dmViewer2 = new DistanceMetricViewer(inputElementComp);
        
        createCombo(right);
        
        GridData gridDataCombo = new GridData();
        gridDataCombo.verticalIndent = 12;
        gridDataCombo.verticalAlignment = SWT.BEGINNING;
        gridDataCombo.horizontalAlignment = GridData.FILL;
        gridDataCombo.grabExcessHorizontalSpace = true;
        comboDropDown.setLayoutData(gridDataCombo);
        
        // Create description text with a multi line text field
        descriptionText = new Text(right, SWT.MULTI | SWT.WRAP | SWT.V_SCROLL);
        descriptionText.setEditable(false);
        
        descriptionText.setLayoutData(new GridData(Format.PROPERTIES_TEXT_WIDTH, Format.PROPERTIES_TEXT_HEIGHT));
        descriptionText.setText("");

        // Push button
        buttonCalculateDistance = new Button(left, SWT.PUSH);
        buttonCalculateDistance.setAlignment(SWT.WRAP | SWT.CENTER);
        buttonCalculateDistance.setText(calculateButtonDescription);
        
        GridData gridDataCalcDist = new GridData();
        gridDataCalcDist.horizontalAlignment = GridData.CENTER;
        gridDataCalcDist.grabExcessHorizontalSpace = true;
        buttonCalculateDistance.setLayoutData(gridDataCalcDist);
        
        // Display result as text
        resultText = new Text(groupDistanceMetrics, SWT.SINGLE | SWT.BORDER | SWT.READ_ONLY);
        resultText.setText("No result");
        resultText.setSize(100, 12);
        
        GridData gridDataResult = new GridData();
        gridDataResult.horizontalAlignment = GridData.FILL;
        gridDataResult.grabExcessHorizontalSpace = true;
        resultText.setLayoutData(gridDataResult);
    }

    /**
     * Checks, if selection of distance metric viewers have changed.
     * Also checks if item entries with same metrics are selected and
     * depending on that activate or deactive the calculate button, since
     * two different metrics can't be compared.
     */
    @Override
    public void selectionChanged(final SelectionChangedEvent event) {
    	// Get selections
    	final AbstractVisualizationSingleDatastreamInput lastSelectedInput1 = this.dmViewer1.getLastSelectedInput();
    	final AbstractVisualizationSingleDatastreamInput lastSelectedInput2 = this.dmViewer2.getLastSelectedInput();

    	if (lastSelectedInput1 != null && lastSelectedInput2 != null) {
    		final Edp2DataTupleDataSource dataSource1 = dmViewer1.getDataSource();
    		final Edp2DataTupleDataSource dataSource2 = dmViewer2.getDataSource();
	      	if (dataSource1 != null && dataSource2 != null) {
		      	// Activate or deactivate button
		      	final boolean isEnabled = MetricDescriptionUtility
		      			.metricDescriptionIdsEqual(dataSource1.getMetricDesciption(), dataSource2.getMetricDesciption());
		      	buttonCalculateDistance.setEnabled(isEnabled);
	      	}
    	}
    	refresh();
    }

    /**
     * Checks if an editor exists in the active workbench window.
     * @return True, if a editor exists. False otherwise.
     */
    private boolean editorExists() {
    	IWorkbenchWindow window = Activator.getDefault().getWorkbench().getActiveWorkbenchWindow();
        this.editor = null;

        if (window != null && window.getActivePage() != null) {
            IEditorPart activeEditor = window.getActivePage().getActiveEditor();
            if (activeEditor != null) {
                @SuppressWarnings("unchecked")
                AbstractEditor<AbstractVisualizationSingleDatastreamInput> activeAbstractEditor
                	= (AbstractEditor<AbstractVisualizationSingleDatastreamInput>) activeEditor;
                this.editor = activeAbstractEditor;
            }
        }
        return this.editor != null;
    }
}
