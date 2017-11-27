/**
 */
package cCS.Configuration.impl;

import cCS.Configuration.*;

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
public class ConfigurationFactoryImpl extends EFactoryImpl implements ConfigurationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConfigurationFactory init() {
		try {
			ConfigurationFactory theConfigurationFactory = (ConfigurationFactory) EPackage.Registry.INSTANCE
					.getEFactory(ConfigurationPackage.eNS_URI);
			if (theConfigurationFactory != null) {
				return theConfigurationFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ConfigurationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationFactoryImpl() {
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
		case ConfigurationPackage.ACOMPONENT_TO_CONNECTOR:
			return createA_ComponentToConnector();
		case ConfigurationPackage.BINDING:
			return createBinding();
		case ConfigurationPackage.BINDING_PROVIDED:
			return createBindingProvided();
		case ConfigurationPackage.BINDING_REQUIRED:
			return createBindingRequired();
		case ConfigurationPackage.ATTACHMENT:
			return createAttachment();
		case ConfigurationPackage.LIEN:
			return createLien();
		case ConfigurationPackage.PCONF_PROVIDED:
			return createPConf_Provided();
		case ConfigurationPackage.ACONNECTOR_TO_COMPONENT:
			return createA_ConnectorToComponent();
		case ConfigurationPackage.CONFIGURATION:
			return createConfiguration();
		case ConfigurationPackage.PCONF_REQUIRED:
			return createPConf_Required();
		case ConfigurationPackage.PORT_CONFIGURATION:
			return createPortConfiguration();
		case ConfigurationPackage.INTERFACE_CONFIGURATION:
			return createInterfaceConfiguration();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public A_ComponentToConnector createA_ComponentToConnector() {
		A_ComponentToConnectorImpl a_ComponentToConnector = new A_ComponentToConnectorImpl();
		return a_ComponentToConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binding createBinding() {
		BindingImpl binding = new BindingImpl();
		return binding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingProvided createBindingProvided() {
		BindingProvidedImpl bindingProvided = new BindingProvidedImpl();
		return bindingProvided;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingRequired createBindingRequired() {
		BindingRequiredImpl bindingRequired = new BindingRequiredImpl();
		return bindingRequired;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment createAttachment() {
		AttachmentImpl attachment = new AttachmentImpl();
		return attachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lien createLien() {
		LienImpl lien = new LienImpl();
		return lien;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PConf_Provided createPConf_Provided() {
		PConf_ProvidedImpl pConf_Provided = new PConf_ProvidedImpl();
		return pConf_Provided;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public A_ConnectorToComponent createA_ConnectorToComponent() {
		A_ConnectorToComponentImpl a_ConnectorToComponent = new A_ConnectorToComponentImpl();
		return a_ConnectorToComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration createConfiguration() {
		ConfigurationImpl configuration = new ConfigurationImpl();
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PConf_Required createPConf_Required() {
		PConf_RequiredImpl pConf_Required = new PConf_RequiredImpl();
		return pConf_Required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortConfiguration createPortConfiguration() {
		PortConfigurationImpl portConfiguration = new PortConfigurationImpl();
		return portConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceConfiguration createInterfaceConfiguration() {
		InterfaceConfigurationImpl interfaceConfiguration = new InterfaceConfigurationImpl();
		return interfaceConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationPackage getConfigurationPackage() {
		return (ConfigurationPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ConfigurationPackage getPackage() {
		return ConfigurationPackage.eINSTANCE;
	}

} //ConfigurationFactoryImpl
