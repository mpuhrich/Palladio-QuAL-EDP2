/**
 */
package org.palladiosimulator.edp2.models.measuringpoint;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

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
    String eNS_URI = "http://palladiosimulator.org/EDP2/MeasuringPoint/1.0";

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
     * The feature id for the '<em><b>Measuring Point Repository</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int MEASURING_POINT__MEASURING_POINT_REPOSITORY = 0;

    /**
     * The feature id for the '<em><b>String Representation</b></em>' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int MEASURING_POINT__STRING_REPRESENTATION = 1;

    /**
     * The feature id for the '<em><b>Resource URI Representation</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int MEASURING_POINT__RESOURCE_URI_REPRESENTATION = 2;

    /**
     * The number of structural features of the '<em>Measuring Point</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int MEASURING_POINT_FEATURE_COUNT = 3;

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
     * The feature id for the '<em><b>Measuring Point Repository</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int STRING_MEASURING_POINT__MEASURING_POINT_REPOSITORY = MEASURING_POINT__MEASURING_POINT_REPOSITORY;

    /**
     * The feature id for the '<em><b>String Representation</b></em>' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int STRING_MEASURING_POINT__STRING_REPRESENTATION = MEASURING_POINT__STRING_REPRESENTATION;

    /**
     * The feature id for the '<em><b>Resource URI Representation</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int STRING_MEASURING_POINT__RESOURCE_URI_REPRESENTATION = MEASURING_POINT__RESOURCE_URI_REPRESENTATION;

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
     * The feature id for the '<em><b>Measuring Point Repository</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int RESOURCE_URI_MEASURING_POINT__MEASURING_POINT_REPOSITORY = STRING_MEASURING_POINT__MEASURING_POINT_REPOSITORY;

    /**
     * The feature id for the '<em><b>String Representation</b></em>' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int RESOURCE_URI_MEASURING_POINT__STRING_REPRESENTATION = STRING_MEASURING_POINT__STRING_REPRESENTATION;

    /**
     * The feature id for the '<em><b>Resource URI Representation</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int RESOURCE_URI_MEASURING_POINT__RESOURCE_URI_REPRESENTATION = STRING_MEASURING_POINT__RESOURCE_URI_REPRESENTATION;

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
     * The meta object id for the '
     * {@link org.palladiosimulator.edp2.models.measuringpoint.impl.MeasuringPointRepositoryImpl
     * <em>Measuring Point Repository</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.edp2.models.measuringpoint.impl.MeasuringPointRepositoryImpl
     * @see org.palladiosimulator.edp2.models.measuringpoint.impl.MeasuringpointPackageImpl#getMeasuringPointRepository()
     * @generated
     */
    int MEASURING_POINT_REPOSITORY = 3;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int MEASURING_POINT_REPOSITORY__ID = IdentifierPackage.IDENTIFIER__ID;

    /**
     * The feature id for the '<em><b>Measuring Points</b></em>' containment reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int MEASURING_POINT_REPOSITORY__MEASURING_POINTS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Measuring Point Repository</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int MEASURING_POINT_REPOSITORY_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

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
     * Returns the meta object for the container reference '
     * {@link org.palladiosimulator.edp2.models.measuringpoint.MeasuringPoint#getMeasuringPointRepository
     * <em>Measuring Point Repository</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the container reference '<em>Measuring Point Repository</em>'.
     * @see org.palladiosimulator.edp2.models.measuringpoint.MeasuringPoint#getMeasuringPointRepository()
     * @see #getMeasuringPoint()
     * @generated
     */
    EReference getMeasuringPoint_MeasuringPointRepository();

    /**
     * Returns the meta object for the attribute '
     * {@link org.palladiosimulator.edp2.models.measuringpoint.MeasuringPoint#getStringRepresentation
     * <em>String Representation</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>String Representation</em>'.
     * @see org.palladiosimulator.edp2.models.measuringpoint.MeasuringPoint#getStringRepresentation()
     * @see #getMeasuringPoint()
     * @generated
     */
    EAttribute getMeasuringPoint_StringRepresentation();

    /**
     * Returns the meta object for the attribute '
     * {@link org.palladiosimulator.edp2.models.measuringpoint.MeasuringPoint#getResourceURIRepresentation
     * <em>Resource URI Representation</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Resource URI Representation</em>'.
     * @see org.palladiosimulator.edp2.models.measuringpoint.MeasuringPoint#getResourceURIRepresentation()
     * @see #getMeasuringPoint()
     * @generated
     */
    EAttribute getMeasuringPoint_ResourceURIRepresentation();

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
     * Returns the meta object for class '
     * {@link org.palladiosimulator.edp2.models.measuringpoint.MeasuringPointRepository
     * <em>Measuring Point Repository</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Measuring Point Repository</em>'.
     * @see org.palladiosimulator.edp2.models.measuringpoint.MeasuringPointRepository
     * @generated
     */
    EClass getMeasuringPointRepository();

    /**
     * Returns the meta object for the containment reference list '
     * {@link org.palladiosimulator.edp2.models.measuringpoint.MeasuringPointRepository#getMeasuringPoints
     * <em>Measuring Points</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>Measuring Points</em>'.
     * @see org.palladiosimulator.edp2.models.measuringpoint.MeasuringPointRepository#getMeasuringPoints()
     * @see #getMeasuringPointRepository()
     * @generated
     */
    EReference getMeasuringPointRepository_MeasuringPoints();

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
         * The meta object literal for the '<em><b>Measuring Point Repository</b></em>' container
         * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EReference MEASURING_POINT__MEASURING_POINT_REPOSITORY = eINSTANCE.getMeasuringPoint_MeasuringPointRepository();

        /**
         * The meta object literal for the '<em><b>String Representation</b></em>' attribute
         * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute MEASURING_POINT__STRING_REPRESENTATION = eINSTANCE.getMeasuringPoint_StringRepresentation();

        /**
         * The meta object literal for the '<em><b>Resource URI Representation</b></em>' attribute
         * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute MEASURING_POINT__RESOURCE_URI_REPRESENTATION = eINSTANCE
                .getMeasuringPoint_ResourceURIRepresentation();

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

        /**
         * The meta object literal for the '
         * {@link org.palladiosimulator.edp2.models.measuringpoint.impl.MeasuringPointRepositoryImpl
         * <em>Measuring Point Repository</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
         * -->
         *
         * @see org.palladiosimulator.edp2.models.measuringpoint.impl.MeasuringPointRepositoryImpl
         * @see org.palladiosimulator.edp2.models.measuringpoint.impl.MeasuringpointPackageImpl#getMeasuringPointRepository()
         * @generated
         */
        EClass MEASURING_POINT_REPOSITORY = eINSTANCE.getMeasuringPointRepository();

        /**
         * The meta object literal for the '<em><b>Measuring Points</b></em>' containment reference
         * list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EReference MEASURING_POINT_REPOSITORY__MEASURING_POINTS = eINSTANCE
                .getMeasuringPointRepository_MeasuringPoints();

    }

} // MeasuringpointPackage
