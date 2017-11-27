/**
 */
package cCS.Connector.impl;

import cCS.Connector.*;

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
public class ConnectorFactoryImpl extends EFactoryImpl implements ConnectorFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConnectorFactory init() {
		try {
			ConnectorFactory theConnectorFactory = (ConnectorFactory) EPackage.Registry.INSTANCE
					.getEFactory(ConnectorPackage.eNS_URI);
			if (theConnectorFactory != null) {
				return theConnectorFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ConnectorFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorFactoryImpl() {
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
		case ConnectorPackage.ROLE:
			return createRole();
		case ConnectorPackage.ROLE_PROVIDED:
			return createRoleProvided();
		case ConnectorPackage.CONNECTOR:
			return createConnector();
		case ConnectorPackage.GLUE:
			return createGlue();
		case ConnectorPackage.ROLE_REQUIRED:
			return createRoleRequired();
		case ConnectorPackage.INTERFACE_CONNECTOR:
			return createInterfaceConnector();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role createRole() {
		RoleImpl role = new RoleImpl();
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleProvided createRoleProvided() {
		RoleProvidedImpl roleProvided = new RoleProvidedImpl();
		return roleProvided;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector createConnector() {
		ConnectorImpl connector = new ConnectorImpl();
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Glue createGlue() {
		GlueImpl glue = new GlueImpl();
		return glue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequired createRoleRequired() {
		RoleRequiredImpl roleRequired = new RoleRequiredImpl();
		return roleRequired;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceConnector createInterfaceConnector() {
		InterfaceConnectorImpl interfaceConnector = new InterfaceConnectorImpl();
		return interfaceConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorPackage getConnectorPackage() {
		return (ConnectorPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ConnectorPackage getPackage() {
		return ConnectorPackage.eINSTANCE;
	}

} //ConnectorFactoryImpl
