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
