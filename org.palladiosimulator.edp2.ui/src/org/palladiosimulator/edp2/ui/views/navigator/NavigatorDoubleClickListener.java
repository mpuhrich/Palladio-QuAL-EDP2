package org.palladiosimulator.edp2.ui.views.navigator;

import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.palladiosimulator.edp2.datastream.IDataSource;
import org.palladiosimulator.edp2.datastream.chaindescription.ChainDescription;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentRun;
import org.palladiosimulator.edp2.models.ExperimentData.Measurement;
import org.palladiosimulator.edp2.models.ExperimentData.RawMeasurements;
import org.palladiosimulator.edp2.ui.EDP2UIPlugin;
import org.palladiosimulator.edp2.visualization.IVisualisationInput;
import org.palladiosimulator.edp2.visualization.jfreechart.input.serviceLevelObjective.SLOQualitativePlotInput;
import org.palladiosimulator.edp2.visualization.jfreechart.input.serviceLevelObjective.SLOQuantitativePlotInput;
import org.palladiosimulator.edp2.visualization.wizards.DefaultViewsWizard;
import org.palladiosimulator.edp2.visualization.wizards.SLOViewsWizard;

/**
 * Listener for selections in the {@link Navigator}. Creates a new {@link EDP2Source}, which is
 * associated with the selected {@link RawMeasurements}. Upon Double-click on a
 * {@link RawMeasurements} -object, it opens a Dialog and offers possible combinations of
 * visualizations and transformations to display the data encapsulated by the object. All
 * combinations are objects of the Type {@link ChainDescription} and displayed in the
 * {@link DefaultViewsWizard}.
 *
 * TODO This is a copied and adapted version of /org.palladiosimulator.edp2.editor/src-man/de/uka
 * /ipd/sdq/edp2/models/ExperimentData /presentation/NavigatorDoubleClickListener.java. Get rid of
 * redundancies.
 *
 * @author Sebastian Lehrig, Andreas Flohre
 *
 */
public class NavigatorDoubleClickListener implements IDoubleClickListener {

    @Override
    public void doubleClick(final DoubleClickEvent event) {
        Object selectedObject = null;
        if (event.getSelection() instanceof IStructuredSelection) {
            final IStructuredSelection selection = (IStructuredSelection) event.getSelection();
            selectedObject = selection.getFirstElement();
        }
        if (selectedObject instanceof Measurement) {
            openSLOWizard(selectedObject, false);
            // openChainSelectionDialog(selectedObject);
        }
        if (selectedObject instanceof ExperimentRun) {
            openSLOWizard(selectedObject, true);
        }
    }

    private void openSLOWizard(Object selectedObject, boolean startedFromExperimentRun) {
        SLOViewsWizard wizard;
        if (startedFromExperimentRun) {
            final ExperimentRun experimentRun = (ExperimentRun) selectedObject;
            wizard = new SLOViewsWizard(experimentRun);
        } else {
            final Measurement measurements = (Measurement) selectedObject;

            wizard = new SLOViewsWizard(measurements);
        }

        final WizardDialog wdialog = new WizardDialog(EDP2UIPlugin.INSTANCE.getWorkbench().getActiveWorkbenchWindow()
                .getShell(), wizard);
        wdialog.open();

        if (wdialog.getReturnCode() == Window.OK) {
            openEditor(wizard.returnDataTupleFromMeasurement(), wizard);
        }
    }

    /**
     * @param edp2Source
     * @param wizard
     */
    private void openEditor(final IDataSource edp2Source, final SLOViewsWizard wizard) {
        final ChainDescription chainDescription = wizard.getSelectedDefault();
        final IVisualisationInput input = (IVisualisationInput) chainDescription.getVisualizationInput();
        if (input instanceof SLOQualitativePlotInput) {
            if (wizard.getAggregatedData() != null) {
                ((SLOQualitativePlotInput) input).setAggregatedData(wizard.getAggregatedData());
                ((SLOQualitativePlotInput) input).setMeasuringPointLabel(wizard.getMeasuringPointLabel());
            }
            ((SLOQualitativePlotInput) input).setSlo(wizard.getSelectedSLO());
            ((SLOQualitativePlotInput) input).setTimestep(wizard.getSelectedTimestepInterval());
        }

        if (input instanceof SLOQuantitativePlotInput) {
            if (wizard.getAggregatedData() != null) {
                ((SLOQuantitativePlotInput) input).setAggregatedData(wizard.getAggregatedData());
                ((SLOQuantitativePlotInput) input).setMeasuringPointLabel(wizard.getMeasuringPointLabel());
            }
            ((SLOQuantitativePlotInput) input).setSlo(wizard.getSelectedSLO());
        }
        input.addInput(input.createNewInput(chainDescription.attachRootDataSource(edp2Source)));
        try {
            final IWorkbenchPage page = EDP2UIPlugin.INSTANCE.getWorkbench().getActiveWorkbenchWindow().getActivePage();
            page.openEditor(input, "org.palladiosimulator.edp2.visualization.editors.JFreeChartEditor");
        } catch (final PartInitException e) {
            throw new RuntimeException(e);
        }
    }

}
