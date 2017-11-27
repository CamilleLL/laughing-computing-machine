/**
 */
package cCS.Component;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see cCS.Component.ComponentPackage
 * @generated
 */
public interface ComponentFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComponentFactory eINSTANCE = cCS.Component.impl.ComponentFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>PComp Provided</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PComp Provided</em>'.
	 * @generated
	 */
	PComp_Provided createPComp_Provided();

	/**
	 * Returns a new object of class '<em>SComp Provided</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SComp Provided</em>'.
	 * @generated
	 */
	SComp_Provided createSComp_Provided();

	/**
	 * Returns a new object of class '<em>Service Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Component</em>'.
	 * @generated
	 */
	ServiceComponent createServiceComponent();

	/**
	 * Returns a new object of class '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component</em>'.
	 * @generated
	 */
	Component createComponent();

	/**
	 * Returns a new object of class '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constraint</em>'.
	 * @generated
	 */
	Constraint createConstraint();

	/**
	 * Returns a new object of class '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property</em>'.
	 * @generated
	 */
	Property createProperty();

	/**
	 * Returns a new object of class '<em>SComp Required</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SComp Required</em>'.
	 * @generated
	 */
	SComp_Required createSComp_Required();

	/**
	 * Returns a new object of class '<em>PComp Required</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PComp Required</em>'.
	 * @generated
	 */
	PComp_Required createPComp_Required();

	/**
	 * Returns a new object of class '<em>Port Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Component</em>'.
	 * @generated
	 */
	PortComponent createPortComponent();

	/**
	 * Returns a new object of class '<em>Interface Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface Component</em>'.
	 * @generated
	 */
	InterfaceComponent createInterfaceComponent();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ComponentPackage getComponentPackage();

} //ComponentFactory
