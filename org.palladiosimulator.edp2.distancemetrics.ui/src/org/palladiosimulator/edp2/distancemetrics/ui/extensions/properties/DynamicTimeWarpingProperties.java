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

import org.palladiosimulator.edp2.distancemetrics.DynamicTimeWarping;

/**
 * Contains the properties to be shown in the GUI which are based on a Composite.
 * The user input for the properties is being passed here to the associated distance metric algorithm.
 * 
 * @author Christian Schaf
 */
public class DynamicTimeWarpingProperties extends PropertiesWidget {
    private Label windowLabel;
    private Text windowText;
    private static final Logger LOGGER = Logger.getLogger(DynamicTimeWarpingProperties.class.getCanonicalName());

    /**
     * Creates the properties of the Dynamic Time Warping extension.
     * 
     * @param parent Composite, the properties should be drawn on.
     * @param style Style of the DynamicTimeWarpingProperties which
     * inherits ScrolledComposite widget.
     * @param dtw The distance metric of the distance metric extension to set
     * the parameters of the algorithm.
     */
	public DynamicTimeWarpingProperties(Composite parent, int style, DynamicTimeWarping dtw) {
		super(parent, style);
        Composite c = new Composite(parent, SWT.NONE);
        c.setLayout(new GridLayout(1, false));
	    Composite composite2 = new Composite(c, SWT.NONE);
	    composite2.setLayout(new GridLayout(2, false));
	    windowLabel = new Label(composite2, SWT.NONE);
	    windowLabel.setText("Window");
	    windowText = new Text(composite2, SWT.SINGLE | SWT.BORDER);
	    windowText.setText("25");
	    windowText.setSize(Format.PROPERTIES_TEXT_WIDTH, 10);


	    
	    // Create description text with a multi line text field
	    Text descriptionText = new Text(c, SWT.MULTI | SWT.WRAP | SWT.V_SCROLL);
	    descriptionText.setEditable(false);
	    descriptionText.setLayoutData(new GridData(Format.PROPERTIES_TEXT_WIDTH, Format.PROPERTIES_TEXT_HEIGHT));
	    descriptionText.setText("The window sets the search space to look for"
	    		+ " best results. If the window is set too small, the optimum"
	    		+ " solution might not be found. Though, it might reduce search"
	    		+ " time on huge data series.");
	    
	    ModifyListener listener = new ModifyListener() {
	        /** {@inheritDoc} */
	    	@Override
	        public void modifyText(ModifyEvent e) {
	    		// TODO: Check for valid inputs!
	    		dtw.setWindow(Integer.parseInt(windowText.getText()));
	        }
	    };
	    
	    windowText.addModifyListener(listener);
		LOGGER.info("DynamicTimeWarpingProperties created.");
	}
}
