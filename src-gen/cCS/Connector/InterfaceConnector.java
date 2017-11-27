/**
 */
package cCS.Connector;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cCS.Connector.InterfaceConnector#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @see cCS.Connector.ConnectorPackage#getInterfaceConnector()
 * @model
 * @generated
 */
public interface InterfaceConnector extends EObject {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' containment reference list.
	 * The list contents are of type {@link cCS.Connector.Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' containment reference list.
	 * @see cCS.Connector.ConnectorPackage#getInterfaceConnector_Role()
	 * @model containment="true"
	 * @generated
	 */
	EList<Role> getRole();

} // InterfaceConnector
