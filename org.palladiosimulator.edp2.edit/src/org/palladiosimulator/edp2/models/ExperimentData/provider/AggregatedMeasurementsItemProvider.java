/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.palladiosimulator.edp2.models.ExperimentData.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.palladiosimulator.edp2.models.ExperimentData.AggregatedMeasurements;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataFactory;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage;

import de.uka.ipd.sdq.identifier.provider.IdentifierItemProvider;

/**
 * This is the item provider adapter for a
 * {@link org.palladiosimulator.edp2.models.ExperimentData.AggregatedMeasurements} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 *
 * @generated
 */
public class AggregatedMeasurementsItemProvider extends IdentifierItemProvider {

    /**
     * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public AggregatedMeasurementsItemProvider(final AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    /**
     * This returns the property descriptors for the adapted class. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    @Override
    public List<IItemPropertyDescriptor> getPropertyDescriptors(final Object object) {
        if (this.itemPropertyDescriptors == null)
        {
            super.getPropertyDescriptors(object);

            this.addValidPropertyDescriptor(object);
            this.addFunctionPropertyDescriptor(object);
            this.addAggregationOnPropertyDescriptor(object);
            this.addMetricPropertyDescriptor(object);
        }
        return this.itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Valid feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addValidPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add
                (this.createItemPropertyDescriptor
                (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                        this.getResourceLocator(),
                        this.getString("_UI_AggregatedMeasurements_valid_feature"),
                        this.getString("_UI_PropertyDescriptor_description",
                                "_UI_AggregatedMeasurements_valid_feature",
                                "_UI_AggregatedMeasurements_type"),
                                ExperimentDataPackage.Literals.AGGREGATED_MEASUREMENTS__VALID,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the Function feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addFunctionPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add
                (this.createItemPropertyDescriptor
                (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                        this.getResourceLocator(),
                        this.getString("_UI_AggregatedMeasurements_function_feature"),
                        this.getString("_UI_PropertyDescriptor_description",
                                "_UI_AggregatedMeasurements_function_feature",
                                "_UI_AggregatedMeasurements_type"),
                                ExperimentDataPackage.Literals.AGGREGATED_MEASUREMENTS__FUNCTION,
                                true,
                                false,
                                true,
                                null,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the Aggregation On feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addAggregationOnPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add
                (this.createItemPropertyDescriptor
                (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                        this.getResourceLocator(),
                        this.getString("_UI_AggregatedMeasurements_aggregationOn_feature"),
                        this.getString("_UI_PropertyDescriptor_description",
                                "_UI_AggregatedMeasurements_aggregationOn_feature",
                                "_UI_AggregatedMeasurements_type"),
                                ExperimentDataPackage.Literals.AGGREGATED_MEASUREMENTS__AGGREGATION_ON,
                                true,
                                false,
                                true,
                                null,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the Metric feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addMetricPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add
                (this.createItemPropertyDescriptor
                (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                        this.getResourceLocator(),
                        this.getString("_UI_AggregatedMeasurements_metric_feature"),
                        this.getString("_UI_PropertyDescriptor_description",
                                "_UI_AggregatedMeasurements_metric_feature",
                                "_UI_AggregatedMeasurements_type"),
                                ExperimentDataPackage.Literals.AGGREGATED_MEASUREMENTS__METRIC,
                                true,
                                false,
                                true,
                                null,
                                null,
                                null));
    }

    /**
     * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate
     * feature for an {@link org.eclipse.emf.edit.command.AddCommand},
     * {@link org.eclipse.emf.edit.command.RemoveCommand} or
     * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Collection<? extends EStructuralFeature> getChildrenFeatures(final Object object) {
        if (this.childrenFeatures == null)
        {
            super.getChildrenFeatures(object);
            this.childrenFeatures.add(ExperimentDataPackage.Literals.AGGREGATED_MEASUREMENTS__AGGREGATION_STATISTICS);
        }
        return this.childrenFeatures;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EStructuralFeature getChildFeature(final Object object, final Object child) {
        // Check the type of the specified child object and return the proper feature to use for
        // adding (see {@link AddCommand}) it as a child.

        return super.getChildFeature(object, child);
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     */
    @Override
    public String getText(final Object object) {
        final String label = ((AggregatedMeasurements) object).getId();
        return label == null || label.length() == 0 ?
                this.getString("_UI_AggregatedMeasurements_type") :
                this.getString("_UI_AggregatedMeasurements_type") + " " + label;
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}
     * . <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void notifyChanged(final Notification notification) {
        this.updateChildren(notification);

        switch (notification.getFeatureID(AggregatedMeasurements.class))
        {
        case ExperimentDataPackage.AGGREGATED_MEASUREMENTS__VALID:
            this.fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
            return;
        case ExperimentDataPackage.AGGREGATED_MEASUREMENTS__AGGREGATION_STATISTICS:
            this.fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
            return;
        }
        super.notifyChanged(notification);
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children that
     * can be created under this object. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors(final Collection<Object> newChildDescriptors, final Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);

        newChildDescriptors.add
                (this.createChildParameter
                (ExperimentDataPackage.Literals.AGGREGATED_MEASUREMENTS__AGGREGATION_STATISTICS,
                        ExperimentDataFactory.eINSTANCE.createAggregationStatistics()));
    }

    /**
     * Return the resource locator for this item provider's resources. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator() {
        return ((IChildCreationExtender) this.adapterFactory).getResourceLocator();
    }

}
