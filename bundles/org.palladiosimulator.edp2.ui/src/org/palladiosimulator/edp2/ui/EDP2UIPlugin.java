package org.palladiosimulator.edp2.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;

/**
 * The EDP2 UI plugin.
 * 
 * @author Sebastian Lehrig
 */
public class EDP2UIPlugin extends AbstractUIPlugin {
    /** The plug-in ID. */
    public static final String PLUGIN_ID = "org.palladiosimulator.edp2.ui";
    
    public static final String CREATE_DATASOURCE_WIZARD_EXTENSIONPOINT_ID = 
    		"org.palladiosimulator.edp2.ui.createdatasourcewizard";
    
    public static final String CREATE_DATASOURCE_WIZARD_EXTENSION_ELEMENT = "datasourcefactory";
    
    public static final String CREATE_DATASOURCE_WIZARD_CLASS_ATTRIBUTE = "class";
    
    public static final String CREATE_DATASOURCE_WIZARD_NAME_ATTRIBUTE = "name";

    /** Instance of this plugin. */
    public static EDP2UIPlugin INSTANCE;

    /**
     * Constructor.
     */
    public EDP2UIPlugin() {
        super();

        // initialize
        INSTANCE = this;
    }
}
