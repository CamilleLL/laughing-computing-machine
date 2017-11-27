/**
 */
package cCS.impl;

import cCS.ArchitecturalElement;
import cCS.CCSFactory;
import cCS.CCSPackage;

import cCS.Component.ComponentPackage;

import cCS.Component.impl.ComponentPackageImpl;

import cCS.Configuration.ConfigurationPackage;

import cCS.Configuration.impl.ConfigurationPackageImpl;

import cCS.Connector.ConnectorPackage;

import cCS.Connector.impl.ConnectorPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CCSPackageImpl extends EPackageImpl implements CCSPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass architecturalElementEClass = null;

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
	 * @see cCS.CCSPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CCSPackageImpl() {
		super(eNS_URI, CCSFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CCSPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CCSPackage init() {
		if (isInited)
			return (CCSPackage) EPackage.Registry.INSTANCE.getEPackage(CCSPackage.eNS_URI);

		// Obtain or create and register package
		CCSPackageImpl theCCSPackage = (CCSPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof CCSPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new CCSPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ComponentPackageImpl theComponentPackage = (ComponentPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(ComponentPackage.eNS_URI) instanceof ComponentPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(ComponentPackage.eNS_URI)
						: ComponentPackage.eINSTANCE);
		ConfigurationPackageImpl theConfigurationPackage = (ConfigurationPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(ConfigurationPackage.eNS_URI) instanceof ConfigurationPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(ConfigurationPackage.eNS_URI)
						: ConfigurationPackage.eINSTANCE);
		ConnectorPackageImpl theConnectorPackage = (ConnectorPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(ConnectorPackage.eNS_URI) instanceof ConnectorPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(ConnectorPackage.eNS_URI)
						: ConnectorPackage.eINSTANCE);

		// Create package meta-data objects
		theCCSPackage.createPackageContents();
		theComponentPackage.createPackageContents();
		theConfigurationPackage.createPackageContents();
		theConnectorPackage.createPackageContents();

		// Initialize created meta-data
		theCCSPackage.initializePackageContents();
		theComponentPackage.initializePackageContents();
		theConfigurationPackage.initializePackageContents();
		theConnectorPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCCSPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CCSPackage.eNS_URI, theCCSPackage);
		return theCCSPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArchitecturalElement() {
		return architecturalElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CCSFactory getCCSFactory() {
		return (CCSFactory) getEFactoryInstance();
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
		architecturalElementEClass = createEClass(ARCHITECTURAL_ELEMENT);
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
		ConfigurationPackage theConfigurationPackage = (ConfigurationPackage) EPackage.Registry.INSTANCE
				.getEPackage(ConfigurationPackage.eNS_URI);
		ConnectorPackage theConnectorPackage = (ConnectorPackage) EPackage.Registry.INSTANCE
				.getEPackage(ConnectorPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theComponentPackage);
		getESubpackages().add(theConfigurationPackage);
		getESubpackages().add(theConnectorPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(architecturalElementEClass, ArchitecturalElement.class, "ArchitecturalElement", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //CCSPackageImpl
