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
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataFactory;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage;
import org.palladiosimulator.edp2.models.ExperimentData.FixedWidthAggregatedMeasurements;

/**
 * This is the item provider adapter for a
 * {@link org.palladiosimulator.edp2.models.ExperimentData.FixedWidthAggregatedMeasurements} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 *
 * @generated
 */
public class FixedWidthAggregatedMeasurementsItemProvider extends AggregatedMeasurementsItemProvider {

    /**
     * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public FixedWidthAggregatedMeasurementsItemProvider(final AdapterFactory adapterFactory) {
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
        if (this.itemPropertyDescriptors == null) {
            super.getPropertyDescriptors(object);

        }
        return this.itemPropertyDescriptors;
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
        if (this.childrenFeatures == null) {
            super.getChildrenFeatures(object);
            this.childrenFeatures.add(ExperimentDataPackage.Literals.FIXED_WIDTH_AGGREGATED_MEASUREMENTS__INTERVALS);
            this.childrenFeatures.add(ExperimentDataPackage.Literals.FIXED_WIDTH_AGGREGATED_MEASUREMENTS__DATA_SERIES);
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
     * This returns FixedWidthAggregatedMeasurements.gif. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     */
    @Override
    public Object getImage(final Object object) {
        return this.overlayImage(object,
                this.getResourceLocator().getImage("full/obj16/FixedWidthAggregatedMeasurements"));
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     */
    @Override
    public String getText(final Object object) {
        final String label = ((FixedWidthAggregatedMeasurements) object).getId();
        return label == null || label.length() == 0 ? this.getString("_UI_FixedWidthAggregatedMeasurements_type")
                : this.getString("_UI_FixedWidthAggregatedMeasurements_type") + " " + label;
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

        switch (notification.getFeatureID(FixedWidthAggregatedMeasurements.class)) {
        case ExperimentDataPackage.FIXED_WIDTH_AGGREGATED_MEASUREMENTS__INTERVALS:
        case ExperimentDataPackage.FIXED_WIDTH_AGGREGATED_MEASUREMENTS__DATA_SERIES:
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

        newChildDescriptors.add(this.createChildParameter(
                ExperimentDataPackage.Literals.FIXED_WIDTH_AGGREGATED_MEASUREMENTS__INTERVALS,
                ExperimentDataFactory.eINSTANCE.createFixedIntervals()));

        newChildDescriptors.add(this.createChildParameter(
                ExperimentDataPackage.Literals.FIXED_WIDTH_AGGREGATED_MEASUREMENTS__DATA_SERIES,
                ExperimentDataFactory.eINSTANCE.createDoubleBinaryMeasurements()));

        newChildDescriptors.add(this.createChildParameter(
                ExperimentDataPackage.Literals.FIXED_WIDTH_AGGREGATED_MEASUREMENTS__DATA_SERIES,
                ExperimentDataFactory.eINSTANCE.createJSXmlMeasurements()));

        newChildDescriptors.add(this.createChildParameter(
                ExperimentDataPackage.Literals.FIXED_WIDTH_AGGREGATED_MEASUREMENTS__DATA_SERIES,
                ExperimentDataFactory.eINSTANCE.createLongBinaryMeasurements()));

        newChildDescriptors.add(this.createChildParameter(
                ExperimentDataPackage.Literals.FIXED_WIDTH_AGGREGATED_MEASUREMENTS__DATA_SERIES,
                ExperimentDataFactory.eINSTANCE.createIdentifierBasedMeasurements()));

        newChildDescriptors.add(this.createChildParameter(
                ExperimentDataPackage.Literals.FIXED_WIDTH_AGGREGATED_MEASUREMENTS__DATA_SERIES,
                ExperimentDataFactory.eINSTANCE.createSensorFrameworkV1DoubleBinaryMeasurements()));

        newChildDescriptors.add(this.createChildParameter(
                ExperimentDataPackage.Literals.FIXED_WIDTH_AGGREGATED_MEASUREMENTS__DATA_SERIES,
                ExperimentDataFactory.eINSTANCE.createSensorFrameworkV1IdentifierBasedMeasurements()));
    }

}
