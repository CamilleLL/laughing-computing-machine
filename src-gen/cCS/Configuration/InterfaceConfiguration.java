/**
 */
package cCS.Configuration;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cCS.Configuration.InterfaceConfiguration#getPortconfiguration <em>Portconfiguration</em>}</li>
 * </ul>
 *
 * @see cCS.Configuration.ConfigurationPackage#getInterfaceConfiguration()
 * @model
 * @generated
 */
public interface InterfaceConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Portconfiguration</b></em>' containment reference list.
	 * The list contents are of type {@link cCS.Configuration.PortConfiguration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Portconfiguration</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portconfiguration</em>' containment reference list.
	 * @see cCS.Configuration.ConfigurationPackage#getInterfaceConfiguration_Portconfiguration()
	 * @model containment="true"
	 * @generated
	 */
	EList<PortConfiguration> getPortconfiguration();

} // InterfaceConfiguration
