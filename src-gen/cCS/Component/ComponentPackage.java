/**
 */
package cCS.Component;

import cCS.CCSPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see cCS.Component.ComponentFactory
 * @model kind="package"
 * @generated
 */
public interface ComponentPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Component";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/cCS/Component";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Component";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComponentPackage eINSTANCE = cCS.Component.impl.ComponentPackageImpl.init();

	/**
	 * The meta object id for the '{@link cCS.Component.impl.PortComponentImpl <em>Port Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.Component.impl.PortComponentImpl
	 * @see cCS.Component.impl.ComponentPackageImpl#getPortComponent()
	 * @generated
	 */
	int PORT_COMPONENT = 8;

	/**
	 * The number of structural features of the '<em>Port Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_COMPONENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Port Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cCS.Component.impl.PComp_ProvidedImpl <em>PComp Provided</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.Component.impl.PComp_ProvidedImpl
	 * @see cCS.Component.impl.ComponentPackageImpl#getPComp_Provided()
	 * @generated
	 */
	int PCOMP_PROVIDED = 0;

	/**
	 * The number of structural features of the '<em>PComp Provided</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCOMP_PROVIDED_FEATURE_COUNT = PORT_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PComp Provided</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCOMP_PROVIDED_OPERATION_COUNT = PORT_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.Component.impl.ServiceComponentImpl <em>Service Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.Component.impl.ServiceComponentImpl
	 * @see cCS.Component.impl.ComponentPackageImpl#getServiceComponent()
	 * @generated
	 */
	int SERVICE_COMPONENT = 2;

	/**
	 * The number of structural features of the '<em>Service Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_COMPONENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Service Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cCS.Component.impl.SComp_ProvidedImpl <em>SComp Provided</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.Component.impl.SComp_ProvidedImpl
	 * @see cCS.Component.impl.ComponentPackageImpl#getSComp_Provided()
	 * @generated
	 */
	int SCOMP_PROVIDED = 1;

	/**
	 * The number of structural features of the '<em>SComp Provided</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOMP_PROVIDED_FEATURE_COUNT = SERVICE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>SComp Provided</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOMP_PROVIDED_OPERATION_COUNT = SERVICE_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.Component.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.Component.impl.ComponentImpl
	 * @see cCS.Component.impl.ComponentPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 3;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PROPERTY = CCSPackage.ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interfacecomponent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__INTERFACECOMPONENT = CCSPackage.ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__CONSTRAINT = CCSPackage.ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = CCSPackage.ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = CCSPackage.ARCHITECTURAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.Component.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.Component.impl.ConstraintImpl
	 * @see cCS.Component.impl.ComponentPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 4;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cCS.Component.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.Component.impl.PropertyImpl
	 * @see cCS.Component.impl.ComponentPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 5;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cCS.Component.impl.SComp_RequiredImpl <em>SComp Required</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.Component.impl.SComp_RequiredImpl
	 * @see cCS.Component.impl.ComponentPackageImpl#getSComp_Required()
	 * @generated
	 */
	int SCOMP_REQUIRED = 6;

	/**
	 * The number of structural features of the '<em>SComp Required</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOMP_REQUIRED_FEATURE_COUNT = SERVICE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>SComp Required</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOMP_REQUIRED_OPERATION_COUNT = SERVICE_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.Component.impl.PComp_RequiredImpl <em>PComp Required</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.Component.impl.PComp_RequiredImpl
	 * @see cCS.Component.impl.ComponentPackageImpl#getPComp_Required()
	 * @generated
	 */
	int PCOMP_REQUIRED = 7;

	/**
	 * The number of structural features of the '<em>PComp Required</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCOMP_REQUIRED_FEATURE_COUNT = PORT_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PComp Required</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCOMP_REQUIRED_OPERATION_COUNT = PORT_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.Component.impl.InterfaceComponentImpl <em>Interface Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.Component.impl.InterfaceComponentImpl
	 * @see cCS.Component.impl.ComponentPackageImpl#getInterfaceComponent()
	 * @generated
	 */
	int INTERFACE_COMPONENT = 9;

	/**
	 * The feature id for the '<em><b>Portcomponent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_COMPONENT__PORTCOMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Servicecomponent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_COMPONENT__SERVICECOMPONENT = 1;

	/**
	 * The number of structural features of the '<em>Interface Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_COMPONENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Interface Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_COMPONENT_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link cCS.Component.PComp_Provided <em>PComp Provided</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PComp Provided</em>'.
	 * @see cCS.Component.PComp_Provided
	 * @generated
	 */
	EClass getPComp_Provided();

	/**
	 * Returns the meta object for class '{@link cCS.Component.SComp_Provided <em>SComp Provided</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SComp Provided</em>'.
	 * @see cCS.Component.SComp_Provided
	 * @generated
	 */
	EClass getSComp_Provided();

	/**
	 * Returns the meta object for class '{@link cCS.Component.ServiceComponent <em>Service Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Component</em>'.
	 * @see cCS.Component.ServiceComponent
	 * @generated
	 */
	EClass getServiceComponent();

	/**
	 * Returns the meta object for class '{@link cCS.Component.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see cCS.Component.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link cCS.Component.Component#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see cCS.Component.Component#getProperty()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Property();

	/**
	 * Returns the meta object for the containment reference list '{@link cCS.Component.Component#getInterfacecomponent <em>Interfacecomponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interfacecomponent</em>'.
	 * @see cCS.Component.Component#getInterfacecomponent()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Interfacecomponent();

	/**
	 * Returns the meta object for the containment reference list '{@link cCS.Component.Component#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraint</em>'.
	 * @see cCS.Component.Component#getConstraint()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Constraint();

	/**
	 * Returns the meta object for class '{@link cCS.Component.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see cCS.Component.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for class '{@link cCS.Component.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see cCS.Component.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for class '{@link cCS.Component.SComp_Required <em>SComp Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SComp Required</em>'.
	 * @see cCS.Component.SComp_Required
	 * @generated
	 */
	EClass getSComp_Required();

	/**
	 * Returns the meta object for class '{@link cCS.Component.PComp_Required <em>PComp Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PComp Required</em>'.
	 * @see cCS.Component.PComp_Required
	 * @generated
	 */
	EClass getPComp_Required();

	/**
	 * Returns the meta object for class '{@link cCS.Component.PortComponent <em>Port Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Component</em>'.
	 * @see cCS.Component.PortComponent
	 * @generated
	 */
	EClass getPortComponent();

	/**
	 * Returns the meta object for class '{@link cCS.Component.InterfaceComponent <em>Interface Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Component</em>'.
	 * @see cCS.Component.InterfaceComponent
	 * @generated
	 */
	EClass getInterfaceComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link cCS.Component.InterfaceComponent#getPortcomponent <em>Portcomponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Portcomponent</em>'.
	 * @see cCS.Component.InterfaceComponent#getPortcomponent()
	 * @see #getInterfaceComponent()
	 * @generated
	 */
	EReference getInterfaceComponent_Portcomponent();

	/**
	 * Returns the meta object for the containment reference list '{@link cCS.Component.InterfaceComponent#getServicecomponent <em>Servicecomponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Servicecomponent</em>'.
	 * @see cCS.Component.InterfaceComponent#getServicecomponent()
	 * @see #getInterfaceComponent()
	 * @generated
	 */
	EReference getInterfaceComponent_Servicecomponent();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ComponentFactory getComponentFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link cCS.Component.impl.PComp_ProvidedImpl <em>PComp Provided</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.Component.impl.PComp_ProvidedImpl
		 * @see cCS.Component.impl.ComponentPackageImpl#getPComp_Provided()
		 * @generated
		 */
		EClass PCOMP_PROVIDED = eINSTANCE.getPComp_Provided();

		/**
		 * The meta object literal for the '{@link cCS.Component.impl.SComp_ProvidedImpl <em>SComp Provided</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.Component.impl.SComp_ProvidedImpl
		 * @see cCS.Component.impl.ComponentPackageImpl#getSComp_Provided()
		 * @generated
		 */
		EClass SCOMP_PROVIDED = eINSTANCE.getSComp_Provided();

		/**
		 * The meta object literal for the '{@link cCS.Component.impl.ServiceComponentImpl <em>Service Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.Component.impl.ServiceComponentImpl
		 * @see cCS.Component.impl.ComponentPackageImpl#getServiceComponent()
		 * @generated
		 */
		EClass SERVICE_COMPONENT = eINSTANCE.getServiceComponent();

		/**
		 * The meta object literal for the '{@link cCS.Component.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.Component.impl.ComponentImpl
		 * @see cCS.Component.impl.ComponentPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__PROPERTY = eINSTANCE.getComponent_Property();

		/**
		 * The meta object literal for the '<em><b>Interfacecomponent</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__INTERFACECOMPONENT = eINSTANCE.getComponent_Interfacecomponent();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__CONSTRAINT = eINSTANCE.getComponent_Constraint();

		/**
		 * The meta object literal for the '{@link cCS.Component.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.Component.impl.ConstraintImpl
		 * @see cCS.Component.impl.ComponentPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '{@link cCS.Component.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.Component.impl.PropertyImpl
		 * @see cCS.Component.impl.ComponentPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '{@link cCS.Component.impl.SComp_RequiredImpl <em>SComp Required</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.Component.impl.SComp_RequiredImpl
		 * @see cCS.Component.impl.ComponentPackageImpl#getSComp_Required()
		 * @generated
		 */
		EClass SCOMP_REQUIRED = eINSTANCE.getSComp_Required();

		/**
		 * The meta object literal for the '{@link cCS.Component.impl.PComp_RequiredImpl <em>PComp Required</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.Component.impl.PComp_RequiredImpl
		 * @see cCS.Component.impl.ComponentPackageImpl#getPComp_Required()
		 * @generated
		 */
		EClass PCOMP_REQUIRED = eINSTANCE.getPComp_Required();

		/**
		 * The meta object literal for the '{@link cCS.Component.impl.PortComponentImpl <em>Port Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.Component.impl.PortComponentImpl
		 * @see cCS.Component.impl.ComponentPackageImpl#getPortComponent()
		 * @generated
		 */
		EClass PORT_COMPONENT = eINSTANCE.getPortComponent();

		/**
		 * The meta object literal for the '{@link cCS.Component.impl.InterfaceComponentImpl <em>Interface Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.Component.impl.InterfaceComponentImpl
		 * @see cCS.Component.impl.ComponentPackageImpl#getInterfaceComponent()
		 * @generated
		 */
		EClass INTERFACE_COMPONENT = eINSTANCE.getInterfaceComponent();

		/**
		 * The meta object literal for the '<em><b>Portcomponent</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_COMPONENT__PORTCOMPONENT = eINSTANCE.getInterfaceComponent_Portcomponent();

		/**
		 * The meta object literal for the '<em><b>Servicecomponent</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_COMPONENT__SERVICECOMPONENT = eINSTANCE.getInterfaceComponent_Servicecomponent();

	}

} //ComponentPackage
