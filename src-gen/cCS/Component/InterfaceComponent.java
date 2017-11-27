/**
 */
package cCS.Component;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cCS.Component.InterfaceComponent#getPortcomponent <em>Portcomponent</em>}</li>
 *   <li>{@link cCS.Component.InterfaceComponent#getServicecomponent <em>Servicecomponent</em>}</li>
 * </ul>
 *
 * @see cCS.Component.ComponentPackage#getInterfaceComponent()
 * @model
 * @generated
 */
public interface InterfaceComponent extends EObject {
	/**
	 * Returns the value of the '<em><b>Portcomponent</b></em>' containment reference list.
	 * The list contents are of type {@link cCS.Component.PortComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Portcomponent</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portcomponent</em>' containment reference list.
	 * @see cCS.Component.ComponentPackage#getInterfaceComponent_Portcomponent()
	 * @model containment="true"
	 * @generated
	 */
	EList<PortComponent> getPortcomponent();

	/**
	 * Returns the value of the '<em><b>Servicecomponent</b></em>' containment reference list.
	 * The list contents are of type {@link cCS.Component.ServiceComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Servicecomponent</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Servicecomponent</em>' containment reference list.
	 * @see cCS.Component.ComponentPackage#getInterfaceComponent_Servicecomponent()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServiceComponent> getServicecomponent();

} // InterfaceComponent
