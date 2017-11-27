/**
 */
package cCS.Connector;

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
 * @see cCS.Connector.ConnectorFactory
 * @model kind="package"
 * @generated
 */
public interface ConnectorPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Connector";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/cCS/Connector";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Connector";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConnectorPackage eINSTANCE = cCS.Connector.impl.ConnectorPackageImpl.init();

	/**
	 * The meta object id for the '{@link cCS.Connector.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.Connector.impl.RoleImpl
	 * @see cCS.Connector.impl.ConnectorPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 0;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cCS.Connector.impl.RoleProvidedImpl <em>Role Provided</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.Connector.impl.RoleProvidedImpl
	 * @see cCS.Connector.impl.ConnectorPackageImpl#getRoleProvided()
	 * @generated
	 */
	int ROLE_PROVIDED = 1;

	/**
	 * The number of structural features of the '<em>Role Provided</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_PROVIDED_FEATURE_COUNT = ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Role Provided</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_PROVIDED_OPERATION_COUNT = ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.Connector.impl.ConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.Connector.impl.ConnectorImpl
	 * @see cCS.Connector.impl.ConnectorPackageImpl#getConnector()
	 * @generated
	 */
	int CONNECTOR = 2;

	/**
	 * The feature id for the '<em><b>Glue</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__GLUE = CCSPackage.ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interfaceconnector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__INTERFACECONNECTOR = CCSPackage.ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_FEATURE_COUNT = CCSPackage.ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_OPERATION_COUNT = CCSPackage.ARCHITECTURAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.Connector.impl.GlueImpl <em>Glue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.Connector.impl.GlueImpl
	 * @see cCS.Connector.impl.ConnectorPackageImpl#getGlue()
	 * @generated
	 */
	int GLUE = 3;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE__ROLE = 0;

	/**
	 * The number of structural features of the '<em>Glue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Glue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cCS.Connector.impl.RoleRequiredImpl <em>Role Required</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.Connector.impl.RoleRequiredImpl
	 * @see cCS.Connector.impl.ConnectorPackageImpl#getRoleRequired()
	 * @generated
	 */
	int ROLE_REQUIRED = 4;

	/**
	 * The number of structural features of the '<em>Role Required</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIRED_FEATURE_COUNT = ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Role Required</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIRED_OPERATION_COUNT = ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.Connector.impl.InterfaceConnectorImpl <em>Interface Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.Connector.impl.InterfaceConnectorImpl
	 * @see cCS.Connector.impl.ConnectorPackageImpl#getInterfaceConnector()
	 * @generated
	 */
	int INTERFACE_CONNECTOR = 5;

	/**
	 * The feature id for the '<em><b>Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CONNECTOR__ROLE = 0;

	/**
	 * The number of structural features of the '<em>Interface Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CONNECTOR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Interface Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CONNECTOR_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link cCS.Connector.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see cCS.Connector.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for class '{@link cCS.Connector.RoleProvided <em>Role Provided</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Provided</em>'.
	 * @see cCS.Connector.RoleProvided
	 * @generated
	 */
	EClass getRoleProvided();

	/**
	 * Returns the meta object for class '{@link cCS.Connector.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see cCS.Connector.Connector
	 * @generated
	 */
	EClass getConnector();

	/**
	 * Returns the meta object for the containment reference list '{@link cCS.Connector.Connector#getGlue <em>Glue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Glue</em>'.
	 * @see cCS.Connector.Connector#getGlue()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Glue();

	/**
	 * Returns the meta object for the containment reference list '{@link cCS.Connector.Connector#getInterfaceconnector <em>Interfaceconnector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interfaceconnector</em>'.
	 * @see cCS.Connector.Connector#getInterfaceconnector()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Interfaceconnector();

	/**
	 * Returns the meta object for class '{@link cCS.Connector.Glue <em>Glue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Glue</em>'.
	 * @see cCS.Connector.Glue
	 * @generated
	 */
	EClass getGlue();

	/**
	 * Returns the meta object for the reference '{@link cCS.Connector.Glue#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role</em>'.
	 * @see cCS.Connector.Glue#getRole()
	 * @see #getGlue()
	 * @generated
	 */
	EReference getGlue_Role();

	/**
	 * Returns the meta object for class '{@link cCS.Connector.RoleRequired <em>Role Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Required</em>'.
	 * @see cCS.Connector.RoleRequired
	 * @generated
	 */
	EClass getRoleRequired();

	/**
	 * Returns the meta object for class '{@link cCS.Connector.InterfaceConnector <em>Interface Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Connector</em>'.
	 * @see cCS.Connector.InterfaceConnector
	 * @generated
	 */
	EClass getInterfaceConnector();

	/**
	 * Returns the meta object for the containment reference list '{@link cCS.Connector.InterfaceConnector#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role</em>'.
	 * @see cCS.Connector.InterfaceConnector#getRole()
	 * @see #getInterfaceConnector()
	 * @generated
	 */
	EReference getInterfaceConnector_Role();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConnectorFactory getConnectorFactory();

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
		 * The meta object literal for the '{@link cCS.Connector.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.Connector.impl.RoleImpl
		 * @see cCS.Connector.impl.ConnectorPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '{@link cCS.Connector.impl.RoleProvidedImpl <em>Role Provided</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.Connector.impl.RoleProvidedImpl
		 * @see cCS.Connector.impl.ConnectorPackageImpl#getRoleProvided()
		 * @generated
		 */
		EClass ROLE_PROVIDED = eINSTANCE.getRoleProvided();

		/**
		 * The meta object literal for the '{@link cCS.Connector.impl.ConnectorImpl <em>Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.Connector.impl.ConnectorImpl
		 * @see cCS.Connector.impl.ConnectorPackageImpl#getConnector()
		 * @generated
		 */
		EClass CONNECTOR = eINSTANCE.getConnector();

		/**
		 * The meta object literal for the '<em><b>Glue</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__GLUE = eINSTANCE.getConnector_Glue();

		/**
		 * The meta object literal for the '<em><b>Interfaceconnector</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__INTERFACECONNECTOR = eINSTANCE.getConnector_Interfaceconnector();

		/**
		 * The meta object literal for the '{@link cCS.Connector.impl.GlueImpl <em>Glue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.Connector.impl.GlueImpl
		 * @see cCS.Connector.impl.ConnectorPackageImpl#getGlue()
		 * @generated
		 */
		EClass GLUE = eINSTANCE.getGlue();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLUE__ROLE = eINSTANCE.getGlue_Role();

		/**
		 * The meta object literal for the '{@link cCS.Connector.impl.RoleRequiredImpl <em>Role Required</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.Connector.impl.RoleRequiredImpl
		 * @see cCS.Connector.impl.ConnectorPackageImpl#getRoleRequired()
		 * @generated
		 */
		EClass ROLE_REQUIRED = eINSTANCE.getRoleRequired();

		/**
		 * The meta object literal for the '{@link cCS.Connector.impl.InterfaceConnectorImpl <em>Interface Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.Connector.impl.InterfaceConnectorImpl
		 * @see cCS.Connector.impl.ConnectorPackageImpl#getInterfaceConnector()
		 * @generated
		 */
		EClass INTERFACE_CONNECTOR = eINSTANCE.getInterfaceConnector();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_CONNECTOR__ROLE = eINSTANCE.getInterfaceConnector_Role();

	}

} //ConnectorPackage
