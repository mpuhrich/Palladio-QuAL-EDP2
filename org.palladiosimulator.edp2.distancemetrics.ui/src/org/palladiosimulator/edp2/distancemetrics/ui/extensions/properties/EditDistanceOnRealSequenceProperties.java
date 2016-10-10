package org.palladiosimulator.edp2.distancemetrics.ui.extensions.properties;

import java.util.logging.Logger;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.nebula.widgets.formattedtext.NumberFormatter;
import org.eclipse.nebula.widgets.formattedtext.FormattedText;

import org.palladiosimulator.edp2.distancemetrics.EditDistanceOnRealSequence;

/**
 * Contains the properties to be shown in the GUI which are based on a Composite.
 * The user input for the properties is being passed here to the associated distance metric algorithm.
 * 
 * @author Christian Schaf
 */
public class EditDistanceOnRealSequenceProperties extends PropertiesWidget {
	private Label epsilonLabel;
	private Text epsilonText;


private static final Logger LOGGER
	= Logger.getLogger(EditDistanceOnRealSequenceProperties.class.getCanonicalName());

/**
 * 
 * @param parent Composite, the properties should be drawn on.
 * @param style Style of the DynamicTimeWarpingProperties which
 * inherits ScrolledComposite widget.
 * @param edr The distance metric of the distance metric extension to set
 * the parameters of the algorithm.
 */
public EditDistanceOnRealSequenceProperties(final Composite parent, final int style, 
        final EditDistanceOnRealSequence edr) {
	super(parent, style);
    Composite composite = new Composite(parent, SWT.NONE);
    composite.setLayout(new GridLayout(1, false));
    Composite composite2 = new Composite(composite, SWT.NONE);
    composite2.setLayout(new GridLayout(2, false));
    epsilonLabel = new Label(composite2, 0);
    epsilonLabel.setText("Epsilon");
    epsilonText = new Text(composite2, SWT.SINGLE | SWT.BORDER);
    epsilonText.setText("25");
    epsilonText.setSize(50, 10);
    final FormattedText text = new FormattedText(epsilonText);
    text.setFormatter(new NumberFormatter(Format.EDIT_MASK, Format.DISPLAY_MASK));
    GridData data = new GridData();
    data.widthHint = 50;
    text.getControl().setLayoutData(data);
    
    ModifyListener mlistener = new ModifyListener() {
        /** {@inheritDoc} */
    	@Override
        public void modifyText(final ModifyEvent event) {
			Object value = text.getValue();
			edr.setEpsilon(value != null ? Double.parseDouble(value.toString()) : 25.0);
        }

    };
    
    // Create description text with a multi line text field
    Text descriptionText = new Text(composite, SWT.MULTI | SWT.WRAP | SWT.V_SCROLL);
    descriptionText.setEditable(false);
    descriptionText.setLayoutData(new GridData(Format.PROPERTIES_TEXT_WIDTH, Format.PROPERTIES_TEXT_HEIGHT));
    descriptionText.setText("The epsilon value is used to"
				+ " decide, whether two elements are considered equal or not."
				+ " If the difference of the two considered elements is less"
				+ " than the epsilon value, they are treated equally and their"
				+ " cost is 0. Otherwise the cost is 1. ");
    
    epsilonText.addModifyListener(mlistener);
	LOGGER.info("EditDistanceOnRealSequenceProperties created");
}
}
