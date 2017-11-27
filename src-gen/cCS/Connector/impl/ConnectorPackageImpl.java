/**
 */
package cCS.Connector.impl;

import cCS.CCSPackage;

import cCS.Component.ComponentPackage;

import cCS.Component.impl.ComponentPackageImpl;

import cCS.Configuration.ConfigurationPackage;

import cCS.Configuration.impl.ConfigurationPackageImpl;

import cCS.Connector.Connector;
import cCS.Connector.ConnectorFactory;
import cCS.Connector.ConnectorPackage;
import cCS.Connector.Glue;
import cCS.Connector.InterfaceConnector;
import cCS.Connector.Role;
import cCS.Connector.RoleProvided;
import cCS.Connector.RoleRequired;

import cCS.impl.CCSPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConnectorPackageImpl extends EPackageImpl implements ConnectorPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleProvidedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleRequiredEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceConnectorEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see cCS.Connector.ConnectorPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ConnectorPackageImpl() {
		super(eNS_URI, ConnectorFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ConnectorPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ConnectorPackage init() {
		if (isInited)
			return (ConnectorPackage) EPackage.Registry.INSTANCE.getEPackage(ConnectorPackage.eNS_URI);

		// Obtain or create and register package
		ConnectorPackageImpl theConnectorPackage = (ConnectorPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof ConnectorPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new ConnectorPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CCSPackageImpl theCCSPackage = (CCSPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(CCSPackage.eNS_URI) instanceof CCSPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(CCSPackage.eNS_URI)
						: CCSPackage.eINSTANCE);
		ComponentPackageImpl theComponentPackage = (ComponentPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(ComponentPackage.eNS_URI) instanceof ComponentPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(ComponentPackage.eNS_URI)
						: ComponentPackage.eINSTANCE);
		ConfigurationPackageImpl theConfigurationPackage = (ConfigurationPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(ConfigurationPackage.eNS_URI) instanceof ConfigurationPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(ConfigurationPackage.eNS_URI)
						: ConfigurationPackage.eINSTANCE);

		// Create package meta-data objects
		theConnectorPackage.createPackageContents();
		theCCSPackage.createPackageContents();
		theComponentPackage.createPackageContents();
		theConfigurationPackage.createPackageContents();

		// Initialize created meta-data
		theConnectorPackage.initializePackageContents();
		theCCSPackage.initializePackageContents();
		theComponentPackage.initializePackageContents();
		theConfigurationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theConnectorPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ConnectorPackage.eNS_URI, theConnectorPackage);
		return theConnectorPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRole() {
		return roleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleProvided() {
		return roleProvidedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnector() {
		return connectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnector_Glue() {
		return (EReference) connectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnector_Interfaceconnector() {
		return (EReference) connectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlue() {
		return glueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlue_Role() {
		return (EReference) glueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleRequired() {
		return roleRequiredEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceConnector() {
		return interfaceConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceConnector_Role() {
		return (EReference) interfaceConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorFactory getConnectorFactory() {
		return (ConnectorFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		roleEClass = createEClass(ROLE);

		roleProvidedEClass = createEClass(ROLE_PROVIDED);

		connectorEClass = createEClass(CONNECTOR);
		createEReference(connectorEClass, CONNECTOR__GLUE);
		createEReference(connectorEClass, CONNECTOR__INTERFACECONNECTOR);

		glueEClass = createEClass(GLUE);
		createEReference(glueEClass, GLUE__ROLE);

		roleRequiredEClass = createEClass(ROLE_REQUIRED);

		interfaceConnectorEClass = createEClass(INTERFACE_CONNECTOR);
		createEReference(interfaceConnectorEClass, INTERFACE_CONNECTOR__ROLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CCSPackage theCCSPackage = (CCSPackage) EPackage.Registry.INSTANCE.getEPackage(CCSPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		roleProvidedEClass.getESuperTypes().add(this.getRole());
		connectorEClass.getESuperTypes().add(theCCSPackage.getArchitecturalElement());
		roleRequiredEClass.getESuperTypes().add(this.getRole());

		// Initialize classes, features, and operations; add parameters
		initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(roleProvidedEClass, RoleProvided.class, "RoleProvided", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(connectorEClass, Connector.class, "Connector", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnector_Glue(), this.getGlue(), null, "glue", null, 0, -1, Connector.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getConnector_Interfaceconnector(), this.getInterfaceConnector(), null, "interfaceconnector",
				null, 0, -1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(glueEClass, Glue.class, "Glue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGlue_Role(), this.getRole(), null, "role", null, 0, 1, Glue.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(roleRequiredEClass, RoleRequired.class, "RoleRequired", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(interfaceConnectorEClass, InterfaceConnector.class, "InterfaceConnector", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterfaceConnector_Role(), this.getRole(), null, "role", null, 0, -1,
				InterfaceConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //ConnectorPackageImpl
