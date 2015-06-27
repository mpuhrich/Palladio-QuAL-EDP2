/**
 */
package org.palladiosimulator.edp2.models.ExperimentData.provider;

import java.util.Collection;
import java.util.List;

import javax.measure.Measure;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataFactory;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage;
import org.palladiosimulator.edp2.models.ExperimentData.MeasurementRange;

/**
 * This is the item provider adapter for a
 * {@link org.palladiosimulator.edp2.models.ExperimentData.MeasurementRange} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 *
 * @generated
 */
public class MeasurementRangeItemProvider extends PropertyableItemProvider {

    /**
     * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    public MeasurementRangeItemProvider(final AdapterFactory adapterFactory) {
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

            this.addEndTimePropertyDescriptor(object);
            this.addStartTimePropertyDescriptor(object);
        }
        return this.itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the End Time feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    protected void addEndTimePropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add
        (this.createItemPropertyDescriptor
                        (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                                this.getResourceLocator(),
                                this.getString("_UI_MeasurementRange_endTime_feature"),
                                this.getString("_UI_PropertyDescriptor_description",
                                        "_UI_MeasurementRange_endTime_feature",
                                        "_UI_MeasurementRange_type"),
                                ExperimentDataPackage.Literals.MEASUREMENT_RANGE__END_TIME,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the Start Time feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    protected void addStartTimePropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add
        (this.createItemPropertyDescriptor
                        (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                                this.getResourceLocator(),
                                this.getString("_UI_MeasurementRange_startTime_feature"),
                                this.getString("_UI_PropertyDescriptor_description",
                                        "_UI_MeasurementRange_startTime_feature",
                                        "_UI_MeasurementRange_type"),
                                ExperimentDataPackage.Literals.MEASUREMENT_RANGE__START_TIME,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
            this.childrenFeatures.add(ExperimentDataPackage.Literals.MEASUREMENT_RANGE__RAW_MEASUREMENTS);
            this.childrenFeatures.add(ExperimentDataPackage.Literals.MEASUREMENT_RANGE__AGGREGATED_MEASUREMENTS);
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
     * This returns MeasurementRange.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object getImage(final Object object) {
        return this.overlayImage(object, this.getResourceLocator().getImage("full/obj16/MeasurementRange"));
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     */
    @Override
    public String getText(final Object object) {
        final Measure labelValue = ((MeasurementRange) object).getEndTime();
        final String label = labelValue == null ? null : labelValue.toString();
        return label == null || label.length() == 0 ?
                this.getString("_UI_MeasurementRange_type") :
                    this.getString("_UI_MeasurementRange_type") + " " + label;
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

        switch (notification.getFeatureID(MeasurementRange.class))
        {
        case ExperimentDataPackage.MEASUREMENT_RANGE__END_TIME:
        case ExperimentDataPackage.MEASUREMENT_RANGE__START_TIME:
            this.fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
            return;
        case ExperimentDataPackage.MEASUREMENT_RANGE__RAW_MEASUREMENTS:
        case ExperimentDataPackage.MEASUREMENT_RANGE__AGGREGATED_MEASUREMENTS:
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
                        (ExperimentDataPackage.Literals.MEASUREMENT_RANGE__RAW_MEASUREMENTS,
                                ExperimentDataFactory.eINSTANCE.createRawMeasurements()));

        newChildDescriptors.add
        (this.createChildParameter
                        (ExperimentDataPackage.Literals.MEASUREMENT_RANGE__AGGREGATED_MEASUREMENTS,
                                ExperimentDataFactory.eINSTANCE.createFixedWidthAggregatedMeasurements()));
    }

}
