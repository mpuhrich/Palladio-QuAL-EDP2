package org.palladiosimulator.edp2.visualization.wizards;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Scale;
import org.palladiosimulator.edp2.models.ExperimentData.Measurement;
import org.palladiosimulator.edp2.models.measuringpoint.impl.StringMeasuringPointImpl;
import org.palladiosimulator.edp2.visualization.util.DataAggregationModeTypes;
import org.palladiosimulator.edp2.visualization.util.SLODataAggregationMode;

/**
 * A {@link WizardPage} used to present the user a view of available aggregation modes for data.
 * After selection of a modus, the data is recomputed accordingly and forwarded to the
 * {@link SLOViewsWizard}.
 * 
 * @author Andreas Flohre
 *
 */
public class SLODialogAggDataPage extends WizardPage implements ISelectionChangedListener, SelectionListener {

    /**
     * Interval size for calculating aggregated data.
     */
    private double timestep = 10.;

    /**
     * Scale defining timestep.
     */
    private Scale scale;

    /**
     * Label for visualizations.
     */
    private String measuringPointsLabel;

    /**
     * A list of user selected measurements from {@link SLODialogChooseMeasuringPointsPage}.
     */
    private List<Measurement> measurementsList;

    /**
     * A list of all {@link SLODataAggregationMode}. Data aggregation modes are derived from
     * {@link DataAggregationModeTypes}.
     */
    private final List<SLODataAggregationMode> dataAggregationModes;

    /**
     * Viewer for possible data aggregation modes.
     */
    private TableViewer choiceViewer;

    /**
     * The user selected data aggregation mode.
     */
    private SLODataAggregationMode selectedMode;

    /**
     * The current {@link IStatus} based on the selection in the <choiceViewer>
     */
    private IStatus selectionStatus;

    /**
     * The 'OK'-Status, which signalizes everything is fine.
     */
    private final Status statusOK;

    /**
     * Constructor.
     * 
     * @param pageName
     * @param measurementsList
     *            A list containing all selected measurements from
     *            {@link SLODialogChooseMeasuringPointsPage}.
     */
    protected SLODialogAggDataPage(String pageName) {
        super(pageName);
        this.setPageComplete(false);
        dataAggregationModes = new ArrayList<SLODataAggregationMode>();
        // initialize all available SLODataAggregationModus instances.
        for (DataAggregationModeTypes modus : DataAggregationModeTypes.values()) {
            SLODataAggregationMode aggModus = new SLODataAggregationMode(modus);
            dataAggregationModes.add(aggModus);
        }
        setDescription("Please select one aggregation mode to proceed.");
        setErrorMessage("Aggregation modus not applicable.");
        selectionStatus = new Status(IStatus.INFO, "not_used", 0, "Please select one aggregation mode to proceed.",
                null);
        statusOK = new Status(IStatus.OK, "not_used", 0, "", null);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets .Composite)
     */
    @Override
    public void createControl(final Composite parent) {
        // create the composite to hold the widgets
        Composite composite = new Composite(parent, SWT.NONE);

        // create the desired layout for this wizard page
        GridLayout gl = new GridLayout();
        composite.setLayout(gl);

        Label label = new Label(composite, SWT.NONE);
        label.setText("Available Choices:");

        SashForm sashForm = new SashForm(composite, SWT.HORIZONTAL);
        GridData gd = new GridData(GridData.FILL_BOTH);
        gd.widthHint = 200;
        sashForm.setLayoutData(gd);

        this.choiceViewer = new TableViewer(sashForm, SWT.BORDER);
        initializeChoiceViewer();

        Label scaleLabel = new Label(composite, SWT.NULL);
        scaleLabel.setText("Specify the time intervall for data aggregation [s]:");
        scale = new Scale(composite, 0);
        scale.setSelection(10);
        scale.setMinimum(1);
        scale.setToolTipText("" + scale.getSelection());
        scale.addSelectionListener(this);
        // set the composite as the control for this page
        setControl(composite);
        updatePageStatus();
    }

    /**
     * Initializes the choice viewer with dataAggregationModes as content.
     */
    private void initializeChoiceViewer() {
        this.choiceViewer.setContentProvider(new IStructuredContentProvider() {
            @Override
            public void dispose() {
                // do nothing here
            }

            @Override
            public Object[] getElements(final Object inputElement) {
                return SLODialogAggDataPage.this.dataAggregationModes.toArray();
            }

            @Override
            public void inputChanged(final Viewer viewer, final Object oldInput, final Object newInput) {
                // do nothing here
            }
        });
        this.choiceViewer.setLabelProvider(new ILabelProvider() {

            @Override
            public void addListener(final ILabelProviderListener listener) {
                // do nothing here
            }

            @Override
            public void dispose() {
                // do nothing here
            }

            @Override
            public Image getImage(final Object element) {
                return null;
            }

            @Override
            public String getText(final Object element) {
                if (element != null) {
                    // the elements in the list are of type
                    // SLODataAggregationModus
                    SLODataAggregationMode sequenceElement = (SLODataAggregationMode) element;
                    final StringBuffer result = new StringBuffer();
                    result.append("Aggregation mode: " + sequenceElement.getDescription());
                    return result.toString();
                }
                return null;
            }

            @Override
            public boolean isLabelProperty(final Object element, final String property) {
                // not used
                return false;
            }

            @Override
            public void removeListener(final ILabelProviderListener listener) {
                // not used
            }
        });

        this.choiceViewer.setInput(this.dataAggregationModes);
        this.choiceViewer.addSelectionChangedListener(this);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(
     * org.eclipse.jface.viewers.SelectionChangedEvent)
     */
    @Override
    public void selectionChanged(final SelectionChangedEvent event) {
        selectionStatus = statusOK;
        final IStructuredSelection selection = (IStructuredSelection) event.getSelection();
        if (selection.isEmpty()) {
            selectionStatus = new Status(IStatus.ERROR, "not_used", 0, "Please select an aggregation mode to proceed.",
                    null);
        } else {
            @SuppressWarnings("unchecked")
            List<SLODataAggregationMode> list = selection.toList();
            this.selectedMode = list.get(0);
            this.selectedMode.setTimestep(timestep);
            double[][] aggregatedData = computeAggregatedData();
            this.setAggregatedDataInWizard(aggregatedData);
            ((SLOViewsWizard) this.getWizard()).setMeasuringPointLabel(measuringPointsLabel);
            selectionStatus = statusOK;
        }
        updatePageStatus();
    }

    /**
     * Computes the aggregated data and stores them in measurementsList.
     */
    private double[][] computeAggregatedData() {
        return this.selectedMode.computeAggregateddata(measurementsList);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jface.wizard.WizardPage#getNextPage()
     */
    @Override
    public IWizardPage getNextPage() {
        IWizardPage nextPage = super.getNextPage();
        // recompute Data just in case; user might have changed the timestep
        // after selecting an aggregation mode
        if (this.selectedMode != null) {
            this.selectedMode.setTimestep(timestep);
            double[][] aggregatedData = computeAggregatedData();
            this.setAggregatedDataInWizard(aggregatedData);
            ((SLOViewsWizard) this.getWizard()).setMeasuringPointLabel(measuringPointsLabel
                    + " Aggregation time interval: " + timestep + " s. Aggregation mode: "
                    + selectedMode.getDescription());

        }
        return nextPage;
    }

    /**
     * Method which handles the status of the whole {@link WizardPage} based on the different states
     * resulting from inputs.
     *
     * @return the page Status
     */
    public IStatus updatePageStatus() {
        IStatus pageStatus = statusOK;
        ((SLOViewsWizard) getWizard()).setFinishable(false);
        switch (selectionStatus.getSeverity()) {
        case IStatus.OK:
            setErrorMessage(null);
            setMessage(selectionStatus.getMessage());
            pageStatus = statusOK;
            this.setPageComplete(true);
            break;
        case IStatus.WARNING:
            setErrorMessage(null);
            setMessage(selectionStatus.getMessage(), WizardPage.WARNING);
            pageStatus = selectionStatus;
            break;
        case IStatus.INFO:
            setErrorMessage(null);
            setMessage(selectionStatus.getMessage(), WizardPage.INFORMATION);
            pageStatus = selectionStatus;
            break;
        default:
            setErrorMessage(selectionStatus.getMessage());
            setMessage(null);
            pageStatus = selectionStatus;
            break;
        }
        return pageStatus;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.swt.events.SelectionListener#widgetSelected(org.eclipse.swt
     * .events.SelectionEvent)
     */
    @Override
    public void widgetSelected(SelectionEvent e) {
        timestep = scale.getSelection();
        scale.setToolTipText("" + scale.getSelection());
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.swt.events.SelectionListener#widgetDefaultSelected(org.eclipse
     * .swt.events.SelectionEvent)
     */
    @Override
    public void widgetDefaultSelected(SelectionEvent e) {
        // do nothing

    }

    /**
     * Forwards the aggregated data to the {@link SLOViewsWizard}.
     * 
     */
    private void setAggregatedDataInWizard(double[][] aggregatedData) {
        ((SLOViewsWizard) this.getWizard()).setAggregatedData(aggregatedData);

    }

    /**
     * Sets a list of measurements and infers a label for aggregated data from these measurements.
     * 
     * @param measurementsList
     */
    public void setMeasurementsListAndLabel(List<Measurement> measurementsList) {
        this.measurementsList = measurementsList;
        StringBuffer label = new StringBuffer();
        for (Measurement currentMeasure : measurementsList) {
            // FIXME can throw ClassCastException because base
            // MeasuringPointImpl does not have a measuringPoint, i.e.
            // all measuring points need to be cast to
            // StringMeasuringPointImpl
            StringMeasuringPointImpl measuringPoint = (StringMeasuringPointImpl) currentMeasure.getMeasuringType()
                    .getMeasuringPoint();
            label.append(measuringPoint.getMeasuringPoint() + "; ");
        }
        measuringPointsLabel = label.toString();
    }

    public void setTimestep(double timestep) {
        this.timestep = timestep;
    }

    public void setMaxSimulationTime(double max) {
        scale.setMaximum((int) max);
    }

}
