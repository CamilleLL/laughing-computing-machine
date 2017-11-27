/**
 */
package cCS.Component.impl;

import cCS.CCSPackage;

import cCS.Component.Component;
import cCS.Component.ComponentFactory;
import cCS.Component.ComponentPackage;
import cCS.Component.Constraint;
import cCS.Component.InterfaceComponent;
import cCS.Component.PComp_Provided;
import cCS.Component.PComp_Required;
import cCS.Component.PortComponent;
import cCS.Component.Property;
import cCS.Component.SComp_Provided;
import cCS.Component.SComp_Required;
import cCS.Component.ServiceComponent;

import cCS.Configuration.ConfigurationPackage;

import cCS.Configuration.impl.ConfigurationPackageImpl;

import cCS.Connector.ConnectorPackage;

import cCS.Connector.impl.ConnectorPackageImpl;

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
public class ComponentPackageImpl extends EPackageImpl implements ComponentPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pComp_ProvidedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sComp_ProvidedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sComp_RequiredEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pComp_RequiredEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceComponentEClass = null;

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
	 * @see cCS.Component.ComponentPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ComponentPackageImpl() {
		super(eNS_URI, ComponentFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ComponentPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ComponentPackage init() {
		if (isInited)
			return (ComponentPackage) EPackage.Registry.INSTANCE.getEPackage(ComponentPackage.eNS_URI);

		// Obtain or create and register package
		ComponentPackageImpl theComponentPackage = (ComponentPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof ComponentPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new ComponentPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CCSPackageImpl theCCSPackage = (CCSPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(CCSPackage.eNS_URI) instanceof CCSPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(CCSPackage.eNS_URI)
						: CCSPackage.eINSTANCE);
		ConfigurationPackageImpl theConfigurationPackage = (ConfigurationPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(ConfigurationPackage.eNS_URI) instanceof ConfigurationPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(ConfigurationPackage.eNS_URI)
						: ConfigurationPackage.eINSTANCE);
		ConnectorPackageImpl theConnectorPackage = (ConnectorPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(ConnectorPackage.eNS_URI) instanceof ConnectorPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(ConnectorPackage.eNS_URI)
						: ConnectorPackage.eINSTANCE);

		// Create package meta-data objects
		theComponentPackage.createPackageContents();
		theCCSPackage.createPackageContents();
		theConfigurationPackage.createPackageContents();
		theConnectorPackage.createPackageContents();

		// Initialize created meta-data
		theComponentPackage.initializePackageContents();
		theCCSPackage.initializePackageContents();
		theConfigurationPackage.initializePackageContents();
		theConnectorPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theComponentPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ComponentPackage.eNS_URI, theComponentPackage);
		return theComponentPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPComp_Provided() {
		return pComp_ProvidedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSComp_Provided() {
		return sComp_ProvidedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceComponent() {
		return serviceComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Property() {
		return (EReference) componentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Interfacecomponent() {
		return (EReference) componentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Constraint() {
		return (EReference) componentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraint() {
		return constraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSComp_Required() {
		return sComp_RequiredEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPComp_Required() {
		return pComp_RequiredEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortComponent() {
		return portComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceComponent() {
		return interfaceComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceComponent_Portcomponent() {
		return (EReference) interfaceComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceComponent_Servicecomponent() {
		return (EReference) interfaceComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentFactory getComponentFactory() {
		return (ComponentFactory) getEFactoryInstance();
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
		pComp_ProvidedEClass = createEClass(PCOMP_PROVIDED);

		sComp_ProvidedEClass = createEClass(SCOMP_PROVIDED);

		serviceComponentEClass = createEClass(SERVICE_COMPONENT);

		componentEClass = createEClass(COMPONENT);
		createEReference(componentEClass, COMPONENT__PROPERTY);
		createEReference(componentEClass, COMPONENT__INTERFACECOMPONENT);
		createEReference(componentEClass, COMPONENT__CONSTRAINT);

		constraintEClass = createEClass(CONSTRAINT);

		propertyEClass = createEClass(PROPERTY);

		sComp_RequiredEClass = createEClass(SCOMP_REQUIRED);

		pComp_RequiredEClass = createEClass(PCOMP_REQUIRED);

		portComponentEClass = createEClass(PORT_COMPONENT);

		interfaceComponentEClass = createEClass(INTERFACE_COMPONENT);
		createEReference(interfaceComponentEClass, INTERFACE_COMPONENT__PORTCOMPONENT);
		createEReference(interfaceComponentEClass, INTERFACE_COMPONENT__SERVICECOMPONENT);
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
		pComp_ProvidedEClass.getESuperTypes().add(this.getPortComponent());
		sComp_ProvidedEClass.getESuperTypes().add(this.getServiceComponent());
		componentEClass.getESuperTypes().add(theCCSPackage.getArchitecturalElement());
		sComp_RequiredEClass.getESuperTypes().add(this.getServiceComponent());
		pComp_RequiredEClass.getESuperTypes().add(this.getPortComponent());

		// Initialize classes, features, and operations; add parameters
		initEClass(pComp_ProvidedEClass, PComp_Provided.class, "PComp_Provided", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(sComp_ProvidedEClass, SComp_Provided.class, "SComp_Provided", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(serviceComponentEClass, ServiceComponent.class, "ServiceComponent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponent_Property(), this.getProperty(), null, "property", null, 0, -1, Component.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_Interfacecomponent(), this.getInterfaceComponent(), null, "interfacecomponent",
				null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_Constraint(), this.getConstraint(), null, "constraint", null, 0, -1,
				Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constraintEClass, Constraint.class, "Constraint", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(sComp_RequiredEClass, SComp_Required.class, "SComp_Required", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(pComp_RequiredEClass, PComp_Required.class, "PComp_Required", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(portComponentEClass, PortComponent.class, "PortComponent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(interfaceComponentEClass, InterfaceComponent.class, "InterfaceComponent", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterfaceComponent_Portcomponent(), this.getPortComponent(), null, "portcomponent", null, 0,
				-1, InterfaceComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterfaceComponent_Servicecomponent(), this.getServiceComponent(), null, "servicecomponent",
				null, 0, -1, InterfaceComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //ComponentPackageImpl
