/**
 */
package cCS.Configuration.impl;

import cCS.CCSPackage;

import cCS.Component.ComponentPackage;

import cCS.Component.impl.ComponentPackageImpl;

import cCS.Configuration.A_ComponentToConnector;
import cCS.Configuration.A_ConnectorToComponent;
import cCS.Configuration.Attachment;
import cCS.Configuration.Binding;
import cCS.Configuration.BindingProvided;
import cCS.Configuration.BindingRequired;
import cCS.Configuration.Configuration;
import cCS.Configuration.ConfigurationFactory;
import cCS.Configuration.ConfigurationPackage;
import cCS.Configuration.InterfaceConfiguration;
import cCS.Configuration.Lien;
import cCS.Configuration.PConf_Provided;
import cCS.Configuration.PConf_Required;
import cCS.Configuration.PortConfiguration;

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
public class ConfigurationPackageImpl extends EPackageImpl implements ConfigurationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass a_ComponentToConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindingProvidedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindingRequiredEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lienEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pConf_ProvidedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass a_ConnectorToComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pConf_RequiredEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceConfigurationEClass = null;

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
	 * @see cCS.Configuration.ConfigurationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ConfigurationPackageImpl() {
		super(eNS_URI, ConfigurationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ConfigurationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ConfigurationPackage init() {
		if (isInited)
			return (ConfigurationPackage) EPackage.Registry.INSTANCE.getEPackage(ConfigurationPackage.eNS_URI);

		// Obtain or create and register package
		ConfigurationPackageImpl theConfigurationPackage = (ConfigurationPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof ConfigurationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new ConfigurationPackageImpl());

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
		ConnectorPackageImpl theConnectorPackage = (ConnectorPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(ConnectorPackage.eNS_URI) instanceof ConnectorPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(ConnectorPackage.eNS_URI)
						: ConnectorPackage.eINSTANCE);

		// Create package meta-data objects
		theConfigurationPackage.createPackageContents();
		theCCSPackage.createPackageContents();
		theComponentPackage.createPackageContents();
		theConnectorPackage.createPackageContents();

		// Initialize created meta-data
		theConfigurationPackage.initializePackageContents();
		theCCSPackage.initializePackageContents();
		theComponentPackage.initializePackageContents();
		theConnectorPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theConfigurationPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ConfigurationPackage.eNS_URI, theConfigurationPackage);
		return theConfigurationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getA_ComponentToConnector() {
		return a_ComponentToConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getA_ComponentToConnector_Pcomp_provided() {
		return (EReference) a_ComponentToConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getA_ComponentToConnector_Rolerequired() {
		return (EReference) a_ComponentToConnectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinding() {
		return bindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBindingProvided() {
		return bindingProvidedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindingProvided_Pconf_provided() {
		return (EReference) bindingProvidedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBindingRequired() {
		return bindingRequiredEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindingRequired_Pcomp_provided() {
		return (EReference) bindingRequiredEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindingRequired_Pconf_required() {
		return (EReference) bindingRequiredEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttachment() {
		return attachmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLien() {
		return lienEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPConf_Provided() {
		return pConf_ProvidedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getA_ConnectorToComponent() {
		return a_ConnectorToComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getA_ConnectorToComponent_Roleprovided() {
		return (EReference) a_ConnectorToComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getA_ConnectorToComponent_Pcomp_required() {
		return (EReference) a_ConnectorToComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfiguration() {
		return configurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_Component() {
		return (EReference) configurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_Connector() {
		return (EReference) configurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_Lien() {
		return (EReference) configurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_Interfaceconfiguration() {
		return (EReference) configurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_Architecturalelement() {
		return (EReference) configurationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPConf_Required() {
		return pConf_RequiredEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortConfiguration() {
		return portConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceConfiguration() {
		return interfaceConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceConfiguration_Portconfiguration() {
		return (EReference) interfaceConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationFactory getConfigurationFactory() {
		return (ConfigurationFactory) getEFactoryInstance();
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
		a_ComponentToConnectorEClass = createEClass(ACOMPONENT_TO_CONNECTOR);
		createEReference(a_ComponentToConnectorEClass, ACOMPONENT_TO_CONNECTOR__PCOMP_PROVIDED);
		createEReference(a_ComponentToConnectorEClass, ACOMPONENT_TO_CONNECTOR__ROLEREQUIRED);

		bindingEClass = createEClass(BINDING);

		bindingProvidedEClass = createEClass(BINDING_PROVIDED);
		createEReference(bindingProvidedEClass, BINDING_PROVIDED__PCONF_PROVIDED);

		bindingRequiredEClass = createEClass(BINDING_REQUIRED);
		createEReference(bindingRequiredEClass, BINDING_REQUIRED__PCOMP_PROVIDED);
		createEReference(bindingRequiredEClass, BINDING_REQUIRED__PCONF_REQUIRED);

		attachmentEClass = createEClass(ATTACHMENT);

		lienEClass = createEClass(LIEN);

		pConf_ProvidedEClass = createEClass(PCONF_PROVIDED);

		a_ConnectorToComponentEClass = createEClass(ACONNECTOR_TO_COMPONENT);
		createEReference(a_ConnectorToComponentEClass, ACONNECTOR_TO_COMPONENT__ROLEPROVIDED);
		createEReference(a_ConnectorToComponentEClass, ACONNECTOR_TO_COMPONENT__PCOMP_REQUIRED);

		configurationEClass = createEClass(CONFIGURATION);
		createEReference(configurationEClass, CONFIGURATION__COMPONENT);
		createEReference(configurationEClass, CONFIGURATION__CONNECTOR);
		createEReference(configurationEClass, CONFIGURATION__LIEN);
		createEReference(configurationEClass, CONFIGURATION__INTERFACECONFIGURATION);
		createEReference(configurationEClass, CONFIGURATION__ARCHITECTURALELEMENT);

		pConf_RequiredEClass = createEClass(PCONF_REQUIRED);

		portConfigurationEClass = createEClass(PORT_CONFIGURATION);

		interfaceConfigurationEClass = createEClass(INTERFACE_CONFIGURATION);
		createEReference(interfaceConfigurationEClass, INTERFACE_CONFIGURATION__PORTCONFIGURATION);
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
		ComponentPackage theComponentPackage = (ComponentPackage) EPackage.Registry.INSTANCE
				.getEPackage(ComponentPackage.eNS_URI);
		ConnectorPackage theConnectorPackage = (ConnectorPackage) EPackage.Registry.INSTANCE
				.getEPackage(ConnectorPackage.eNS_URI);
		CCSPackage theCCSPackage = (CCSPackage) EPackage.Registry.INSTANCE.getEPackage(CCSPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		a_ComponentToConnectorEClass.getESuperTypes().add(this.getAttachment());
		bindingEClass.getESuperTypes().add(this.getLien());
		bindingProvidedEClass.getESuperTypes().add(this.getBinding());
		bindingRequiredEClass.getESuperTypes().add(this.getBinding());
		attachmentEClass.getESuperTypes().add(this.getLien());
		pConf_ProvidedEClass.getESuperTypes().add(this.getPortConfiguration());
		a_ConnectorToComponentEClass.getESuperTypes().add(this.getAttachment());
		configurationEClass.getESuperTypes().add(theCCSPackage.getArchitecturalElement());
		pConf_RequiredEClass.getESuperTypes().add(this.getPortConfiguration());

		// Initialize classes, features, and operations; add parameters
		initEClass(a_ComponentToConnectorEClass, A_ComponentToConnector.class, "A_ComponentToConnector", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getA_ComponentToConnector_Pcomp_provided(), theComponentPackage.getPComp_Provided(), null,
				"pcomp_provided", null, 0, 1, A_ComponentToConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getA_ComponentToConnector_Rolerequired(), theConnectorPackage.getRoleRequired(), null,
				"rolerequired", null, 0, 1, A_ComponentToConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bindingEClass, Binding.class, "Binding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bindingProvidedEClass, BindingProvided.class, "BindingProvided", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBindingProvided_Pconf_provided(), this.getPConf_Provided(), null, "pconf_provided", null, 0,
				1, BindingProvided.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bindingRequiredEClass, BindingRequired.class, "BindingRequired", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBindingRequired_Pcomp_provided(), theComponentPackage.getPComp_Provided(), null,
				"pcomp_provided", null, 0, 1, BindingRequired.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBindingRequired_Pconf_required(), this.getPConf_Required(), null, "pconf_required", null, 0,
				1, BindingRequired.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attachmentEClass, Attachment.class, "Attachment", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(lienEClass, Lien.class, "Lien", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pConf_ProvidedEClass, PConf_Provided.class, "PConf_Provided", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(a_ConnectorToComponentEClass, A_ConnectorToComponent.class, "A_ConnectorToComponent", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getA_ConnectorToComponent_Roleprovided(), theConnectorPackage.getRoleProvided(), null,
				"roleprovided", null, 0, 1, A_ConnectorToComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getA_ConnectorToComponent_Pcomp_required(), theComponentPackage.getPComp_Required(), null,
				"pcomp_required", null, 0, 1, A_ConnectorToComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configurationEClass, Configuration.class, "Configuration", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfiguration_Component(), theComponentPackage.getComponent(), null, "component", null, 0, -1,
				Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfiguration_Connector(), theConnectorPackage.getConnector(), null, "connector", null, 0, -1,
				Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfiguration_Lien(), this.getLien(), null, "lien", null, 0, -1, Configuration.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfiguration_Interfaceconfiguration(), this.getInterfaceConfiguration(), null,
				"interfaceconfiguration", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfiguration_Architecturalelement(), theCCSPackage.getArchitecturalElement(), null,
				"architecturalelement", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pConf_RequiredEClass, PConf_Required.class, "PConf_Required", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(portConfigurationEClass, PortConfiguration.class, "PortConfiguration", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(interfaceConfigurationEClass, InterfaceConfiguration.class, "InterfaceConfiguration", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterfaceConfiguration_Portconfiguration(), this.getPortConfiguration(), null,
				"portconfiguration", null, 0, -1, InterfaceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //ConfigurationPackageImpl
