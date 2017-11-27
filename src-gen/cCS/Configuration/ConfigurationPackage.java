/**
 */
package cCS.Configuration;

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
 * @see cCS.Configuration.ConfigurationFactory
 * @model kind="package"
 * @generated
 */
public interface ConfigurationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Configuration";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/cCS/Configuration";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Configuration";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConfigurationPackage eINSTANCE = cCS.Configuration.impl.ConfigurationPackageImpl.init();

	/**
	 * The meta object id for the '{@link cCS.Configuration.impl.LienImpl <em>Lien</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.Configuration.impl.LienImpl
	 * @see cCS.Configuration.impl.ConfigurationPackageImpl#getLien()
	 * @generated
	 */
	int LIEN = 5;

	/**
	 * The number of structural features of the '<em>Lien</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIEN_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Lien</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIEN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cCS.Configuration.impl.AttachmentImpl <em>Attachment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.Configuration.impl.AttachmentImpl
	 * @see cCS.Configuration.impl.ConfigurationPackageImpl#getAttachment()
	 * @generated
	 */
	int ATTACHMENT = 4;

	/**
	 * The number of structural features of the '<em>Attachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_FEATURE_COUNT = LIEN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Attachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_OPERATION_COUNT = LIEN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.Configuration.impl.A_ComponentToConnectorImpl <em>AComponent To Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.Configuration.impl.A_ComponentToConnectorImpl
	 * @see cCS.Configuration.impl.ConfigurationPackageImpl#getA_ComponentToConnector()
	 * @generated
	 */
	int ACOMPONENT_TO_CONNECTOR = 0;

	/**
	 * The feature id for the '<em><b>Pcomp provided</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACOMPONENT_TO_CONNECTOR__PCOMP_PROVIDED = ATTACHMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rolerequired</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACOMPONENT_TO_CONNECTOR__ROLEREQUIRED = ATTACHMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>AComponent To Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACOMPONENT_TO_CONNECTOR_FEATURE_COUNT = ATTACHMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>AComponent To Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACOMPONENT_TO_CONNECTOR_OPERATION_COUNT = ATTACHMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.Configuration.impl.BindingImpl <em>Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.Configuration.impl.BindingImpl
	 * @see cCS.Configuration.impl.ConfigurationPackageImpl#getBinding()
	 * @generated
	 */
	int BINDING = 1;

	/**
	 * The number of structural features of the '<em>Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FEATURE_COUNT = LIEN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OPERATION_COUNT = LIEN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.Configuration.impl.BindingProvidedImpl <em>Binding Provided</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.Configuration.impl.BindingProvidedImpl
	 * @see cCS.Configuration.impl.ConfigurationPackageImpl#getBindingProvided()
	 * @generated
	 */
	int BINDING_PROVIDED = 2;

	/**
	 * The feature id for the '<em><b>Pconf provided</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_PROVIDED__PCONF_PROVIDED = BINDING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Binding Provided</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_PROVIDED_FEATURE_COUNT = BINDING_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Binding Provided</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_PROVIDED_OPERATION_COUNT = BINDING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.Configuration.impl.BindingRequiredImpl <em>Binding Required</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.Configuration.impl.BindingRequiredImpl
	 * @see cCS.Configuration.impl.ConfigurationPackageImpl#getBindingRequired()
	 * @generated
	 */
	int BINDING_REQUIRED = 3;

	/**
	 * The feature id for the '<em><b>Pcomp provided</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_REQUIRED__PCOMP_PROVIDED = BINDING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pconf required</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_REQUIRED__PCONF_REQUIRED = BINDING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Binding Required</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_REQUIRED_FEATURE_COUNT = BINDING_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Binding Required</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_REQUIRED_OPERATION_COUNT = BINDING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.Configuration.impl.PortConfigurationImpl <em>Port Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.Configuration.impl.PortConfigurationImpl
	 * @see cCS.Configuration.impl.ConfigurationPackageImpl#getPortConfiguration()
	 * @generated
	 */
	int PORT_CONFIGURATION = 10;

	/**
	 * The number of structural features of the '<em>Port Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONFIGURATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Port Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cCS.Configuration.impl.PConf_ProvidedImpl <em>PConf Provided</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.Configuration.impl.PConf_ProvidedImpl
	 * @see cCS.Configuration.impl.ConfigurationPackageImpl#getPConf_Provided()
	 * @generated
	 */
	int PCONF_PROVIDED = 6;

	/**
	 * The number of structural features of the '<em>PConf Provided</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCONF_PROVIDED_FEATURE_COUNT = PORT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PConf Provided</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCONF_PROVIDED_OPERATION_COUNT = PORT_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.Configuration.impl.A_ConnectorToComponentImpl <em>AConnector To Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.Configuration.impl.A_ConnectorToComponentImpl
	 * @see cCS.Configuration.impl.ConfigurationPackageImpl#getA_ConnectorToComponent()
	 * @generated
	 */
	int ACONNECTOR_TO_COMPONENT = 7;

	/**
	 * The feature id for the '<em><b>Roleprovided</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONNECTOR_TO_COMPONENT__ROLEPROVIDED = ATTACHMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pcomp required</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONNECTOR_TO_COMPONENT__PCOMP_REQUIRED = ATTACHMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>AConnector To Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONNECTOR_TO_COMPONENT_FEATURE_COUNT = ATTACHMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>AConnector To Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONNECTOR_TO_COMPONENT_OPERATION_COUNT = ATTACHMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.Configuration.impl.ConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.Configuration.impl.ConfigurationImpl
	 * @see cCS.Configuration.impl.ConfigurationPackageImpl#getConfiguration()
	 * @generated
	 */
	int CONFIGURATION = 8;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__COMPONENT = CCSPackage.ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__CONNECTOR = CCSPackage.ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lien</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__LIEN = CCSPackage.ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Interfaceconfiguration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__INTERFACECONFIGURATION = CCSPackage.ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Architecturalelement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__ARCHITECTURALELEMENT = CCSPackage.ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FEATURE_COUNT = CCSPackage.ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_OPERATION_COUNT = CCSPackage.ARCHITECTURAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.Configuration.impl.PConf_RequiredImpl <em>PConf Required</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.Configuration.impl.PConf_RequiredImpl
	 * @see cCS.Configuration.impl.ConfigurationPackageImpl#getPConf_Required()
	 * @generated
	 */
	int PCONF_REQUIRED = 9;

	/**
	 * The number of structural features of the '<em>PConf Required</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCONF_REQUIRED_FEATURE_COUNT = PORT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PConf Required</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCONF_REQUIRED_OPERATION_COUNT = PORT_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cCS.Configuration.impl.InterfaceConfigurationImpl <em>Interface Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cCS.Configuration.impl.InterfaceConfigurationImpl
	 * @see cCS.Configuration.impl.ConfigurationPackageImpl#getInterfaceConfiguration()
	 * @generated
	 */
	int INTERFACE_CONFIGURATION = 11;

	/**
	 * The feature id for the '<em><b>Portconfiguration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CONFIGURATION__PORTCONFIGURATION = 0;

	/**
	 * The number of structural features of the '<em>Interface Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CONFIGURATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Interface Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link cCS.Configuration.A_ComponentToConnector <em>AComponent To Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AComponent To Connector</em>'.
	 * @see cCS.Configuration.A_ComponentToConnector
	 * @generated
	 */
	EClass getA_ComponentToConnector();

	/**
	 * Returns the meta object for the reference '{@link cCS.Configuration.A_ComponentToConnector#getPcomp_provided <em>Pcomp provided</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pcomp provided</em>'.
	 * @see cCS.Configuration.A_ComponentToConnector#getPcomp_provided()
	 * @see #getA_ComponentToConnector()
	 * @generated
	 */
	EReference getA_ComponentToConnector_Pcomp_provided();

	/**
	 * Returns the meta object for the reference '{@link cCS.Configuration.A_ComponentToConnector#getRolerequired <em>Rolerequired</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rolerequired</em>'.
	 * @see cCS.Configuration.A_ComponentToConnector#getRolerequired()
	 * @see #getA_ComponentToConnector()
	 * @generated
	 */
	EReference getA_ComponentToConnector_Rolerequired();

	/**
	 * Returns the meta object for class '{@link cCS.Configuration.Binding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding</em>'.
	 * @see cCS.Configuration.Binding
	 * @generated
	 */
	EClass getBinding();

	/**
	 * Returns the meta object for class '{@link cCS.Configuration.BindingProvided <em>Binding Provided</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding Provided</em>'.
	 * @see cCS.Configuration.BindingProvided
	 * @generated
	 */
	EClass getBindingProvided();

	/**
	 * Returns the meta object for the reference '{@link cCS.Configuration.BindingProvided#getPconf_provided <em>Pconf provided</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pconf provided</em>'.
	 * @see cCS.Configuration.BindingProvided#getPconf_provided()
	 * @see #getBindingProvided()
	 * @generated
	 */
	EReference getBindingProvided_Pconf_provided();

	/**
	 * Returns the meta object for class '{@link cCS.Configuration.BindingRequired <em>Binding Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding Required</em>'.
	 * @see cCS.Configuration.BindingRequired
	 * @generated
	 */
	EClass getBindingRequired();

	/**
	 * Returns the meta object for the reference '{@link cCS.Configuration.BindingRequired#getPcomp_provided <em>Pcomp provided</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pcomp provided</em>'.
	 * @see cCS.Configuration.BindingRequired#getPcomp_provided()
	 * @see #getBindingRequired()
	 * @generated
	 */
	EReference getBindingRequired_Pcomp_provided();

	/**
	 * Returns the meta object for the reference '{@link cCS.Configuration.BindingRequired#getPconf_required <em>Pconf required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pconf required</em>'.
	 * @see cCS.Configuration.BindingRequired#getPconf_required()
	 * @see #getBindingRequired()
	 * @generated
	 */
	EReference getBindingRequired_Pconf_required();

	/**
	 * Returns the meta object for class '{@link cCS.Configuration.Attachment <em>Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attachment</em>'.
	 * @see cCS.Configuration.Attachment
	 * @generated
	 */
	EClass getAttachment();

	/**
	 * Returns the meta object for class '{@link cCS.Configuration.Lien <em>Lien</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lien</em>'.
	 * @see cCS.Configuration.Lien
	 * @generated
	 */
	EClass getLien();

	/**
	 * Returns the meta object for class '{@link cCS.Configuration.PConf_Provided <em>PConf Provided</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PConf Provided</em>'.
	 * @see cCS.Configuration.PConf_Provided
	 * @generated
	 */
	EClass getPConf_Provided();

	/**
	 * Returns the meta object for class '{@link cCS.Configuration.A_ConnectorToComponent <em>AConnector To Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AConnector To Component</em>'.
	 * @see cCS.Configuration.A_ConnectorToComponent
	 * @generated
	 */
	EClass getA_ConnectorToComponent();

	/**
	 * Returns the meta object for the reference '{@link cCS.Configuration.A_ConnectorToComponent#getRoleprovided <em>Roleprovided</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Roleprovided</em>'.
	 * @see cCS.Configuration.A_ConnectorToComponent#getRoleprovided()
	 * @see #getA_ConnectorToComponent()
	 * @generated
	 */
	EReference getA_ConnectorToComponent_Roleprovided();

	/**
	 * Returns the meta object for the reference '{@link cCS.Configuration.A_ConnectorToComponent#getPcomp_required <em>Pcomp required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pcomp required</em>'.
	 * @see cCS.Configuration.A_ConnectorToComponent#getPcomp_required()
	 * @see #getA_ConnectorToComponent()
	 * @generated
	 */
	EReference getA_ConnectorToComponent_Pcomp_required();

	/**
	 * Returns the meta object for class '{@link cCS.Configuration.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see cCS.Configuration.Configuration
	 * @generated
	 */
	EClass getConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link cCS.Configuration.Configuration#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component</em>'.
	 * @see cCS.Configuration.Configuration#getComponent()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Component();

	/**
	 * Returns the meta object for the containment reference list '{@link cCS.Configuration.Configuration#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connector</em>'.
	 * @see cCS.Configuration.Configuration#getConnector()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Connector();

	/**
	 * Returns the meta object for the containment reference list '{@link cCS.Configuration.Configuration#getLien <em>Lien</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lien</em>'.
	 * @see cCS.Configuration.Configuration#getLien()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Lien();

	/**
	 * Returns the meta object for the containment reference list '{@link cCS.Configuration.Configuration#getInterfaceconfiguration <em>Interfaceconfiguration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interfaceconfiguration</em>'.
	 * @see cCS.Configuration.Configuration#getInterfaceconfiguration()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Interfaceconfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link cCS.Configuration.Configuration#getArchitecturalelement <em>Architecturalelement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Architecturalelement</em>'.
	 * @see cCS.Configuration.Configuration#getArchitecturalelement()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Architecturalelement();

	/**
	 * Returns the meta object for class '{@link cCS.Configuration.PConf_Required <em>PConf Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PConf Required</em>'.
	 * @see cCS.Configuration.PConf_Required
	 * @generated
	 */
	EClass getPConf_Required();

	/**
	 * Returns the meta object for class '{@link cCS.Configuration.PortConfiguration <em>Port Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Configuration</em>'.
	 * @see cCS.Configuration.PortConfiguration
	 * @generated
	 */
	EClass getPortConfiguration();

	/**
	 * Returns the meta object for class '{@link cCS.Configuration.InterfaceConfiguration <em>Interface Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Configuration</em>'.
	 * @see cCS.Configuration.InterfaceConfiguration
	 * @generated
	 */
	EClass getInterfaceConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link cCS.Configuration.InterfaceConfiguration#getPortconfiguration <em>Portconfiguration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Portconfiguration</em>'.
	 * @see cCS.Configuration.InterfaceConfiguration#getPortconfiguration()
	 * @see #getInterfaceConfiguration()
	 * @generated
	 */
	EReference getInterfaceConfiguration_Portconfiguration();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConfigurationFactory getConfigurationFactory();

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
		 * The meta object literal for the '{@link cCS.Configuration.impl.A_ComponentToConnectorImpl <em>AComponent To Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.Configuration.impl.A_ComponentToConnectorImpl
		 * @see cCS.Configuration.impl.ConfigurationPackageImpl#getA_ComponentToConnector()
		 * @generated
		 */
		EClass ACOMPONENT_TO_CONNECTOR = eINSTANCE.getA_ComponentToConnector();

		/**
		 * The meta object literal for the '<em><b>Pcomp provided</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACOMPONENT_TO_CONNECTOR__PCOMP_PROVIDED = eINSTANCE.getA_ComponentToConnector_Pcomp_provided();

		/**
		 * The meta object literal for the '<em><b>Rolerequired</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACOMPONENT_TO_CONNECTOR__ROLEREQUIRED = eINSTANCE.getA_ComponentToConnector_Rolerequired();

		/**
		 * The meta object literal for the '{@link cCS.Configuration.impl.BindingImpl <em>Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.Configuration.impl.BindingImpl
		 * @see cCS.Configuration.impl.ConfigurationPackageImpl#getBinding()
		 * @generated
		 */
		EClass BINDING = eINSTANCE.getBinding();

		/**
		 * The meta object literal for the '{@link cCS.Configuration.impl.BindingProvidedImpl <em>Binding Provided</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.Configuration.impl.BindingProvidedImpl
		 * @see cCS.Configuration.impl.ConfigurationPackageImpl#getBindingProvided()
		 * @generated
		 */
		EClass BINDING_PROVIDED = eINSTANCE.getBindingProvided();

		/**
		 * The meta object literal for the '<em><b>Pconf provided</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING_PROVIDED__PCONF_PROVIDED = eINSTANCE.getBindingProvided_Pconf_provided();

		/**
		 * The meta object literal for the '{@link cCS.Configuration.impl.BindingRequiredImpl <em>Binding Required</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.Configuration.impl.BindingRequiredImpl
		 * @see cCS.Configuration.impl.ConfigurationPackageImpl#getBindingRequired()
		 * @generated
		 */
		EClass BINDING_REQUIRED = eINSTANCE.getBindingRequired();

		/**
		 * The meta object literal for the '<em><b>Pcomp provided</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING_REQUIRED__PCOMP_PROVIDED = eINSTANCE.getBindingRequired_Pcomp_provided();

		/**
		 * The meta object literal for the '<em><b>Pconf required</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING_REQUIRED__PCONF_REQUIRED = eINSTANCE.getBindingRequired_Pconf_required();

		/**
		 * The meta object literal for the '{@link cCS.Configuration.impl.AttachmentImpl <em>Attachment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.Configuration.impl.AttachmentImpl
		 * @see cCS.Configuration.impl.ConfigurationPackageImpl#getAttachment()
		 * @generated
		 */
		EClass ATTACHMENT = eINSTANCE.getAttachment();

		/**
		 * The meta object literal for the '{@link cCS.Configuration.impl.LienImpl <em>Lien</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.Configuration.impl.LienImpl
		 * @see cCS.Configuration.impl.ConfigurationPackageImpl#getLien()
		 * @generated
		 */
		EClass LIEN = eINSTANCE.getLien();

		/**
		 * The meta object literal for the '{@link cCS.Configuration.impl.PConf_ProvidedImpl <em>PConf Provided</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.Configuration.impl.PConf_ProvidedImpl
		 * @see cCS.Configuration.impl.ConfigurationPackageImpl#getPConf_Provided()
		 * @generated
		 */
		EClass PCONF_PROVIDED = eINSTANCE.getPConf_Provided();

		/**
		 * The meta object literal for the '{@link cCS.Configuration.impl.A_ConnectorToComponentImpl <em>AConnector To Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.Configuration.impl.A_ConnectorToComponentImpl
		 * @see cCS.Configuration.impl.ConfigurationPackageImpl#getA_ConnectorToComponent()
		 * @generated
		 */
		EClass ACONNECTOR_TO_COMPONENT = eINSTANCE.getA_ConnectorToComponent();

		/**
		 * The meta object literal for the '<em><b>Roleprovided</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACONNECTOR_TO_COMPONENT__ROLEPROVIDED = eINSTANCE.getA_ConnectorToComponent_Roleprovided();

		/**
		 * The meta object literal for the '<em><b>Pcomp required</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACONNECTOR_TO_COMPONENT__PCOMP_REQUIRED = eINSTANCE.getA_ConnectorToComponent_Pcomp_required();

		/**
		 * The meta object literal for the '{@link cCS.Configuration.impl.ConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.Configuration.impl.ConfigurationImpl
		 * @see cCS.Configuration.impl.ConfigurationPackageImpl#getConfiguration()
		 * @generated
		 */
		EClass CONFIGURATION = eINSTANCE.getConfiguration();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__COMPONENT = eINSTANCE.getConfiguration_Component();

		/**
		 * The meta object literal for the '<em><b>Connector</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__CONNECTOR = eINSTANCE.getConfiguration_Connector();

		/**
		 * The meta object literal for the '<em><b>Lien</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__LIEN = eINSTANCE.getConfiguration_Lien();

		/**
		 * The meta object literal for the '<em><b>Interfaceconfiguration</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__INTERFACECONFIGURATION = eINSTANCE.getConfiguration_Interfaceconfiguration();

		/**
		 * The meta object literal for the '<em><b>Architecturalelement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__ARCHITECTURALELEMENT = eINSTANCE.getConfiguration_Architecturalelement();

		/**
		 * The meta object literal for the '{@link cCS.Configuration.impl.PConf_RequiredImpl <em>PConf Required</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.Configuration.impl.PConf_RequiredImpl
		 * @see cCS.Configuration.impl.ConfigurationPackageImpl#getPConf_Required()
		 * @generated
		 */
		EClass PCONF_REQUIRED = eINSTANCE.getPConf_Required();

		/**
		 * The meta object literal for the '{@link cCS.Configuration.impl.PortConfigurationImpl <em>Port Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.Configuration.impl.PortConfigurationImpl
		 * @see cCS.Configuration.impl.ConfigurationPackageImpl#getPortConfiguration()
		 * @generated
		 */
		EClass PORT_CONFIGURATION = eINSTANCE.getPortConfiguration();

		/**
		 * The meta object literal for the '{@link cCS.Configuration.impl.InterfaceConfigurationImpl <em>Interface Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cCS.Configuration.impl.InterfaceConfigurationImpl
		 * @see cCS.Configuration.impl.ConfigurationPackageImpl#getInterfaceConfiguration()
		 * @generated
		 */
		EClass INTERFACE_CONFIGURATION = eINSTANCE.getInterfaceConfiguration();

		/**
		 * The meta object literal for the '<em><b>Portconfiguration</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_CONFIGURATION__PORTCONFIGURATION = eINSTANCE.getInterfaceConfiguration_Portconfiguration();

	}

} //ConfigurationPackage
