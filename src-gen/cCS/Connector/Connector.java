/**
 */
package cCS.Connector;

import cCS.ArchitecturalElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cCS.Connector.Connector#getGlue <em>Glue</em>}</li>
 *   <li>{@link cCS.Connector.Connector#getInterfaceconnector <em>Interfaceconnector</em>}</li>
 * </ul>
 *
 * @see cCS.Connector.ConnectorPackage#getConnector()
 * @model
 * @generated
 */
public interface Connector extends ArchitecturalElement {
	/**
	 * Returns the value of the '<em><b>Glue</b></em>' containment reference list.
	 * The list contents are of type {@link cCS.Connector.Glue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Glue</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Glue</em>' containment reference list.
	 * @see cCS.Connector.ConnectorPackage#getConnector_Glue()
	 * @model containment="true"
	 * @generated
	 */
	EList<Glue> getGlue();

	/**
	 * Returns the value of the '<em><b>Interfaceconnector</b></em>' containment reference list.
	 * The list contents are of type {@link cCS.Connector.InterfaceConnector}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interfaceconnector</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaceconnector</em>' containment reference list.
	 * @see cCS.Connector.ConnectorPackage#getConnector_Interfaceconnector()
	 * @model containment="true"
	 * @generated
	 */
	EList<InterfaceConnector> getInterfaceconnector();

} // Connector
