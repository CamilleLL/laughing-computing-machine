/**
 */
package cCS.Configuration;

import cCS.ArchitecturalElement;

import cCS.Component.Component;

import cCS.Connector.Connector;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cCS.Configuration.Configuration#getComponent <em>Component</em>}</li>
 *   <li>{@link cCS.Configuration.Configuration#getConnector <em>Connector</em>}</li>
 *   <li>{@link cCS.Configuration.Configuration#getLien <em>Lien</em>}</li>
 *   <li>{@link cCS.Configuration.Configuration#getInterfaceconfiguration <em>Interfaceconfiguration</em>}</li>
 *   <li>{@link cCS.Configuration.Configuration#getArchitecturalelement <em>Architecturalelement</em>}</li>
 * </ul>
 *
 * @see cCS.Configuration.ConfigurationPackage#getConfiguration()
 * @model
 * @generated
 */
public interface Configuration extends ArchitecturalElement {
	/**
	 * Returns the value of the '<em><b>Component</b></em>' containment reference list.
	 * The list contents are of type {@link cCS.Component.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' containment reference list.
	 * @see cCS.Configuration.ConfigurationPackage#getConfiguration_Component()
	 * @model containment="true"
	 * @generated
	 */
	EList<Component> getComponent();

	/**
	 * Returns the value of the '<em><b>Connector</b></em>' containment reference list.
	 * The list contents are of type {@link cCS.Connector.Connector}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector</em>' containment reference list.
	 * @see cCS.Configuration.ConfigurationPackage#getConfiguration_Connector()
	 * @model containment="true"
	 * @generated
	 */
	EList<Connector> getConnector();

	/**
	 * Returns the value of the '<em><b>Lien</b></em>' containment reference list.
	 * The list contents are of type {@link cCS.Configuration.Lien}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lien</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lien</em>' containment reference list.
	 * @see cCS.Configuration.ConfigurationPackage#getConfiguration_Lien()
	 * @model containment="true"
	 * @generated
	 */
	EList<Lien> getLien();

	/**
	 * Returns the value of the '<em><b>Interfaceconfiguration</b></em>' containment reference list.
	 * The list contents are of type {@link cCS.Configuration.InterfaceConfiguration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interfaceconfiguration</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaceconfiguration</em>' containment reference list.
	 * @see cCS.Configuration.ConfigurationPackage#getConfiguration_Interfaceconfiguration()
	 * @model containment="true"
	 * @generated
	 */
	EList<InterfaceConfiguration> getInterfaceconfiguration();

	/**
	 * Returns the value of the '<em><b>Architecturalelement</b></em>' containment reference list.
	 * The list contents are of type {@link cCS.ArchitecturalElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Architecturalelement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Architecturalelement</em>' containment reference list.
	 * @see cCS.Configuration.ConfigurationPackage#getConfiguration_Architecturalelement()
	 * @model containment="true"
	 * @generated
	 */
	EList<ArchitecturalElement> getArchitecturalelement();

} // Configuration
