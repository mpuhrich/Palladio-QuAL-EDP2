/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.palladiosimulator.edp2.models.ExperimentData.provider;

import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.provider.EcoreEditPlugin;
import org.modelversioning.emfprofile.provider.EMFProfileEditPlugin;
import org.modelversioning.emfprofileapplication.provider.EMFProfileApplicationEditPlugin;
import org.palladiosimulator.mdsdprofiles.provider.MdsdprofilesEditPlugin;
import org.palladiosimulator.metricspec.provider.MetricSpecEditPlugin;

import de.uka.ipd.sdq.identifier.provider.IdentifierEditPlugin;

/**
 * This is the central singleton for the EDP2 edit plugin. <!-- begin-user-doc --> <!-- end-user-doc
 * -->
 *
 * @generated
 */
public final class EDP2EditPlugin extends EMFPlugin {

    /**
     * Keep track of the singleton. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static final EDP2EditPlugin INSTANCE = new EDP2EditPlugin();

    /**
     * Keep track of the singleton. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private static Implementation plugin;

    /**
     * Create the instance. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public EDP2EditPlugin() {
        super(new ResourceLocator[] { IdentifierEditPlugin.INSTANCE, MetricSpecEditPlugin.INSTANCE,
                MdsdprofilesEditPlugin.INSTANCE, EMFProfileEditPlugin.INSTANCE,
                EMFProfileApplicationEditPlugin.INSTANCE, EcoreEditPlugin.INSTANCE, });
    }

    /**
     * Returns the singleton instance of the Eclipse plugin. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return the singleton instance.
     * @generated
     */
    @Override
    public ResourceLocator getPluginResourceLocator() {
        return plugin;
    }

    /**
     * Returns the singleton instance of the Eclipse plugin. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return the singleton instance.
     * @generated
     */
    public static Implementation getPlugin() {
        return plugin;
    }

    /**
     * The actual implementation of the Eclipse <b>Plugin</b>. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public static class Implementation extends EclipsePlugin {

        /**
         * Creates an instance. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        public Implementation() {
            super();

            // Remember the static instance.
            //
            plugin = this;
        }
    }

}
