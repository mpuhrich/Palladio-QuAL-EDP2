package org.palladiosimulator.edp2.ui.views.navigator;

import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.palladiosimulator.edp2.datastream.IDataSource;
import org.palladiosimulator.edp2.datastream.edp2source.Edp2DataTupleDataSource;
import org.palladiosimulator.edp2.models.ExperimentData.RawMeasurements;
import org.palladiosimulator.edp2.ui.EDP2UIPlugin;
import org.palladiosimulator.edp2.visualization.IVisualisationInput;
import org.palladiosimulator.edp2.visualization.wizards.DefaultSequence;
import org.palladiosimulator.edp2.visualization.wizards.DefaultViewsWizard;


/**
 * Listener for selections in the {@link Navigator}.
 * Creates a new {@link EDP2Source}, which is associated with the selected
 * {@link RawMeasurements}. Upon Double-click on a {@link RawMeasurements}
 * -object, it opens a Dialog and offers possible combinations of visualizations
 * and transformations to display the data encapsulated by the object. All
 * combinations are objects of the Type {@link DefaultSequence} and displayed in
 * the {@link DefaultViewsWizard}.
 *
 * TODO This is a copied version of /org.palladiosimulator.edp2.editor/src-man/de/uka
 *      /ipd/sdq/edp2/models/ExperimentData/presentation/NavigatorDoubleClickListener.java.
 *      Get rid of redundancies.
 *
 * @author Sebastian Lehrig
 *
 */
public class NavigatorDoubleClickListener implements IDoubleClickListener {

    @Override
    public void doubleClick(final DoubleClickEvent event) {
        Object selectedObject = null;
        if (event.getSelection() instanceof IStructuredSelection) {
            final IStructuredSelection selection = (IStructuredSelection) event
                    .getSelection();
            selectedObject = selection.getFirstElement();
        }
        RawMeasurements measurement = null;
        // check for the object to contain actual data
        if (selectedObject instanceof RawMeasurements) {
            measurement = (RawMeasurements) selectedObject;

            if (measurement != null && !measurement.getDataSeries().isEmpty()) {

                final IDataSource edp2Source = new Edp2DataTupleDataSource(measurement);

                // open the wizard with reference to the selected source
                // it shows possible visualizations, which are instances of
                // DefaultSequence
                final DefaultViewsWizard wizard = new DefaultViewsWizard(edp2Source);
                final WizardDialog wdialog = new WizardDialog(
                        EDP2UIPlugin.INSTANCE.getWorkbench().getActiveWorkbenchWindow().getShell(), wizard);
                wdialog.open();

                if (wdialog.getReturnCode() == Window.OK) {
                    final DefaultSequence selection = wizard.getSelectedDefault();
                    final IVisualisationInput input = selection.getVisualizationInput();
                    input.addInput(input.createNewInput(edp2Source));
                    try {
                        final IWorkbenchPage page = EDP2UIPlugin.INSTANCE.getWorkbench().getActiveWorkbenchWindow()
                                .getActivePage();
                        page.openEditor(input,
                                "org.palladiosimulator.edp2.visualization.editors.JFreeChartEditor");
                    } catch (final PartInitException e) {
                        throw new RuntimeException(e);
                    }
                }
            } else {
                throw new RuntimeException("Empty Measurements!");
            }
        }

    }

}
