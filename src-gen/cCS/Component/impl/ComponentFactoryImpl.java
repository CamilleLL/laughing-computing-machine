/**
 */
package cCS.Component.impl;

import cCS.Component.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentFactoryImpl extends EFactoryImpl implements ComponentFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ComponentFactory init() {
		try {
			ComponentFactory theComponentFactory = (ComponentFactory) EPackage.Registry.INSTANCE
					.getEFactory(ComponentPackage.eNS_URI);
			if (theComponentFactory != null) {
				return theComponentFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ComponentFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case ComponentPackage.PCOMP_PROVIDED:
			return createPComp_Provided();
		case ComponentPackage.SCOMP_PROVIDED:
			return createSComp_Provided();
		case ComponentPackage.SERVICE_COMPONENT:
			return createServiceComponent();
		case ComponentPackage.COMPONENT:
			return createComponent();
		case ComponentPackage.CONSTRAINT:
			return createConstraint();
		case ComponentPackage.PROPERTY:
			return createProperty();
		case ComponentPackage.SCOMP_REQUIRED:
			return createSComp_Required();
		case ComponentPackage.PCOMP_REQUIRED:
			return createPComp_Required();
		case ComponentPackage.PORT_COMPONENT:
			return createPortComponent();
		case ComponentPackage.INTERFACE_COMPONENT:
			return createInterfaceComponent();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PComp_Provided createPComp_Provided() {
		PComp_ProvidedImpl pComp_Provided = new PComp_ProvidedImpl();
		return pComp_Provided;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SComp_Provided createSComp_Provided() {
		SComp_ProvidedImpl sComp_Provided = new SComp_ProvidedImpl();
		return sComp_Provided;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceComponent createServiceComponent() {
		ServiceComponentImpl serviceComponent = new ServiceComponentImpl();
		return serviceComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createConstraint() {
		ConstraintImpl constraint = new ConstraintImpl();
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SComp_Required createSComp_Required() {
		SComp_RequiredImpl sComp_Required = new SComp_RequiredImpl();
		return sComp_Required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PComp_Required createPComp_Required() {
		PComp_RequiredImpl pComp_Required = new PComp_RequiredImpl();
		return pComp_Required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortComponent createPortComponent() {
		PortComponentImpl portComponent = new PortComponentImpl();
		return portComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceComponent createInterfaceComponent() {
		InterfaceComponentImpl interfaceComponent = new InterfaceComponentImpl();
		return interfaceComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentPackage getComponentPackage() {
		return (ComponentPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ComponentPackage getPackage() {
		return ComponentPackage.eINSTANCE;
	}

} //ComponentFactoryImpl
