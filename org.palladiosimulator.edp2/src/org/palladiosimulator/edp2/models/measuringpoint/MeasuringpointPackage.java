/**
 */
package org.palladiosimulator.edp2.models.measuringpoint;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta
 * objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 *
 * @see org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointFactory
 * @model kind="package"
 * @generated
 */
public interface MeasuringpointPackage extends EPackage {
    /**
     * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    String eNAME = "measuringpoint";

    /**
     * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    String eNS_URI = "http://palladiosimulator.org/EDP2/MeasuringPoint/0.9.1";

    /**
     * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    String eNS_PREFIX = "org.palladiosimulator.edp2.models";

    /**
     * The singleton instance of the package. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    MeasuringpointPackage eINSTANCE = org.palladiosimulator.edp2.models.measuringpoint.impl.MeasuringpointPackageImpl
            .init();

    /**
     * The meta object id for the '
     * {@link org.palladiosimulator.edp2.models.measuringpoint.impl.MeasuringPointImpl
     * <em>Measuring Point</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.edp2.models.measuringpoint.impl.MeasuringPointImpl
     * @see org.palladiosimulator.edp2.models.measuringpoint.impl.MeasuringpointPackageImpl#getMeasuringPoint()
     * @generated
     */
    int MEASURING_POINT = 0;

    /**
     * The number of structural features of the '<em>Measuring Point</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int MEASURING_POINT_FEATURE_COUNT = 0;

    /**
     * The meta object id for the '
     * {@link org.palladiosimulator.edp2.models.measuringpoint.impl.StringMeasuringPointImpl
     * <em>String Measuring Point</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.edp2.models.measuringpoint.impl.StringMeasuringPointImpl
     * @see org.palladiosimulator.edp2.models.measuringpoint.impl.MeasuringpointPackageImpl#getStringMeasuringPoint()
     * @generated
     */
    int STRING_MEASURING_POINT = 1;

    /**
     * The feature id for the '<em><b>Measuring Point</b></em>' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int STRING_MEASURING_POINT__MEASURING_POINT = MEASURING_POINT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>String Measuring Point</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int STRING_MEASURING_POINT_FEATURE_COUNT = MEASURING_POINT_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '
     * {@link org.palladiosimulator.edp2.models.measuringpoint.impl.ResourceURIMeasuringPointImpl
     * <em>Resource URI Measuring Point</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.edp2.models.measuringpoint.impl.ResourceURIMeasuringPointImpl
     * @see org.palladiosimulator.edp2.models.measuringpoint.impl.MeasuringpointPackageImpl#getResourceURIMeasuringPoint()
     * @generated
     */
    int RESOURCE_URI_MEASURING_POINT = 2;

    /**
     * The feature id for the '<em><b>Measuring Point</b></em>' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int RESOURCE_URI_MEASURING_POINT__MEASURING_POINT = STRING_MEASURING_POINT__MEASURING_POINT;

    /**
     * The feature id for the '<em><b>Resource URI</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int RESOURCE_URI_MEASURING_POINT__RESOURCE_URI = STRING_MEASURING_POINT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Resource URI Measuring Point</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int RESOURCE_URI_MEASURING_POINT_FEATURE_COUNT = STRING_MEASURING_POINT_FEATURE_COUNT + 1;

    /**
     * Returns the meta object for class '
     * {@link org.palladiosimulator.edp2.models.measuringpoint.MeasuringPoint
     * <em>Measuring Point</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Measuring Point</em>'.
     * @see org.palladiosimulator.edp2.models.measuringpoint.MeasuringPoint
     * @generated
     */
    EClass getMeasuringPoint();

    /**
     * Returns the meta object for class '
     * {@link org.palladiosimulator.edp2.models.measuringpoint.StringMeasuringPoint
     * <em>String Measuring Point</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>String Measuring Point</em>'.
     * @see org.palladiosimulator.edp2.models.measuringpoint.StringMeasuringPoint
     * @generated
     */
    EClass getStringMeasuringPoint();

    /**
     * Returns the meta object for the attribute '
     * {@link org.palladiosimulator.edp2.models.measuringpoint.StringMeasuringPoint#getMeasuringPoint
     * <em>Measuring Point</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Measuring Point</em>'.
     * @see org.palladiosimulator.edp2.models.measuringpoint.StringMeasuringPoint#getMeasuringPoint()
     * @see #getStringMeasuringPoint()
     * @generated
     */
    EAttribute getStringMeasuringPoint_MeasuringPoint();

    /**
     * Returns the meta object for class '
     * {@link org.palladiosimulator.edp2.models.measuringpoint.ResourceURIMeasuringPoint
     * <em>Resource URI Measuring Point</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Resource URI Measuring Point</em>'.
     * @see org.palladiosimulator.edp2.models.measuringpoint.ResourceURIMeasuringPoint
     * @generated
     */
    EClass getResourceURIMeasuringPoint();

    /**
     * Returns the meta object for the attribute '
     * {@link org.palladiosimulator.edp2.models.measuringpoint.ResourceURIMeasuringPoint#getResourceURI
     * <em>Resource URI</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Resource URI</em>'.
     * @see org.palladiosimulator.edp2.models.measuringpoint.ResourceURIMeasuringPoint#getResourceURI()
     * @see #getResourceURIMeasuringPoint()
     * @generated
     */
    EAttribute getResourceURIMeasuringPoint_ResourceURI();

    /**
     * Returns the factory that creates the instances of the model. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return the factory that creates the instances of the model.
     * @generated
     */
    MeasuringpointFactory getMeasuringpointFactory();

    /**
     * <!-- begin-user-doc --> Defines literals for the meta objects that represent
     * <ul>
     * <li>each class,</li>
     * <li>each feature of each class,</li>
     * <li>each enum,</li>
     * <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     *
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '
         * {@link org.palladiosimulator.edp2.models.measuringpoint.impl.MeasuringPointImpl
         * <em>Measuring Point</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.edp2.models.measuringpoint.impl.MeasuringPointImpl
         * @see org.palladiosimulator.edp2.models.measuringpoint.impl.MeasuringpointPackageImpl#getMeasuringPoint()
         * @generated
         */
        EClass MEASURING_POINT = eINSTANCE.getMeasuringPoint();

        /**
         * The meta object literal for the '
         * {@link org.palladiosimulator.edp2.models.measuringpoint.impl.StringMeasuringPointImpl
         * <em>String Measuring Point</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.edp2.models.measuringpoint.impl.StringMeasuringPointImpl
         * @see org.palladiosimulator.edp2.models.measuringpoint.impl.MeasuringpointPackageImpl#getStringMeasuringPoint()
         * @generated
         */
        EClass STRING_MEASURING_POINT = eINSTANCE.getStringMeasuringPoint();

        /**
         * The meta object literal for the '<em><b>Measuring Point</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute STRING_MEASURING_POINT__MEASURING_POINT = eINSTANCE.getStringMeasuringPoint_MeasuringPoint();

        /**
         * The meta object literal for the '
         * {@link org.palladiosimulator.edp2.models.measuringpoint.impl.ResourceURIMeasuringPointImpl
         * <em>Resource URI Measuring Point</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
         * -->
         *
         * @see org.palladiosimulator.edp2.models.measuringpoint.impl.ResourceURIMeasuringPointImpl
         * @see org.palladiosimulator.edp2.models.measuringpoint.impl.MeasuringpointPackageImpl#getResourceURIMeasuringPoint()
         * @generated
         */
        EClass RESOURCE_URI_MEASURING_POINT = eINSTANCE.getResourceURIMeasuringPoint();

        /**
         * The meta object literal for the '<em><b>Resource URI</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute RESOURCE_URI_MEASURING_POINT__RESOURCE_URI = eINSTANCE.getResourceURIMeasuringPoint_ResourceURI();

    }

} // MeasuringpointPackage
