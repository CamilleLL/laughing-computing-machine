/**
 */
package cCS.Configuration;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see cCS.Configuration.ConfigurationPackage
 * @generated
 */
public interface ConfigurationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConfigurationFactory eINSTANCE = cCS.Configuration.impl.ConfigurationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>AComponent To Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AComponent To Connector</em>'.
	 * @generated
	 */
	A_ComponentToConnector createA_ComponentToConnector();

	/**
	 * Returns a new object of class '<em>Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binding</em>'.
	 * @generated
	 */
	Binding createBinding();

	/**
	 * Returns a new object of class '<em>Binding Provided</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binding Provided</em>'.
	 * @generated
	 */
	BindingProvided createBindingProvided();

	/**
	 * Returns a new object of class '<em>Binding Required</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binding Required</em>'.
	 * @generated
	 */
	BindingRequired createBindingRequired();

	/**
	 * Returns a new object of class '<em>Attachment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attachment</em>'.
	 * @generated
	 */
	Attachment createAttachment();

	/**
	 * Returns a new object of class '<em>Lien</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lien</em>'.
	 * @generated
	 */
	Lien createLien();

	/**
	 * Returns a new object of class '<em>PConf Provided</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PConf Provided</em>'.
	 * @generated
	 */
	PConf_Provided createPConf_Provided();

	/**
	 * Returns a new object of class '<em>AConnector To Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AConnector To Component</em>'.
	 * @generated
	 */
	A_ConnectorToComponent createA_ConnectorToComponent();

	/**
	 * Returns a new object of class '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configuration</em>'.
	 * @generated
	 */
	Configuration createConfiguration();

	/**
	 * Returns a new object of class '<em>PConf Required</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PConf Required</em>'.
	 * @generated
	 */
	PConf_Required createPConf_Required();

	/**
	 * Returns a new object of class '<em>Port Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Configuration</em>'.
	 * @generated
	 */
	PortConfiguration createPortConfiguration();

	/**
	 * Returns a new object of class '<em>Interface Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface Configuration</em>'.
	 * @generated
	 */
	InterfaceConfiguration createInterfaceConfiguration();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ConfigurationPackage getConfigurationPackage();

} //ConfigurationFactory
