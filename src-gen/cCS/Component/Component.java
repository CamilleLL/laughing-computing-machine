/**
 */
package cCS.Component;

import cCS.ArchitecturalElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cCS.Component.Component#getProperty <em>Property</em>}</li>
 *   <li>{@link cCS.Component.Component#getInterfacecomponent <em>Interfacecomponent</em>}</li>
 *   <li>{@link cCS.Component.Component#getConstraint <em>Constraint</em>}</li>
 * </ul>
 *
 * @see cCS.Component.ComponentPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends ArchitecturalElement {
	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference list.
	 * The list contents are of type {@link cCS.Component.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' containment reference list.
	 * @see cCS.Component.ComponentPackage#getComponent_Property()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getProperty();

	/**
	 * Returns the value of the '<em><b>Interfacecomponent</b></em>' containment reference list.
	 * The list contents are of type {@link cCS.Component.InterfaceComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interfacecomponent</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfacecomponent</em>' containment reference list.
	 * @see cCS.Component.ComponentPackage#getComponent_Interfacecomponent()
	 * @model containment="true"
	 * @generated
	 */
	EList<InterfaceComponent> getInterfacecomponent();

	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link cCS.Component.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint</em>' containment reference list.
	 * @see cCS.Component.ComponentPackage#getComponent_Constraint()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constraint> getConstraint();

} // Component
