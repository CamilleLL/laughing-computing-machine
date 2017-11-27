/**
 */
package cCS.Component.util;

import cCS.ArchitecturalElement;

import cCS.Component.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see cCS.Component.ComponentPackage
 * @generated
 */
public class ComponentSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ComponentPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentSwitch() {
		if (modelPackage == null) {
			modelPackage = ComponentPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case ComponentPackage.PCOMP_PROVIDED: {
			PComp_Provided pComp_Provided = (PComp_Provided) theEObject;
			T result = casePComp_Provided(pComp_Provided);
			if (result == null)
				result = casePortComponent(pComp_Provided);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ComponentPackage.SCOMP_PROVIDED: {
			SComp_Provided sComp_Provided = (SComp_Provided) theEObject;
			T result = caseSComp_Provided(sComp_Provided);
			if (result == null)
				result = caseServiceComponent(sComp_Provided);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ComponentPackage.SERVICE_COMPONENT: {
			ServiceComponent serviceComponent = (ServiceComponent) theEObject;
			T result = caseServiceComponent(serviceComponent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ComponentPackage.COMPONENT: {
			Component component = (Component) theEObject;
			T result = caseComponent(component);
			if (result == null)
				result = caseArchitecturalElement(component);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ComponentPackage.CONSTRAINT: {
			Constraint constraint = (Constraint) theEObject;
			T result = caseConstraint(constraint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ComponentPackage.PROPERTY: {
			Property property = (Property) theEObject;
			T result = caseProperty(property);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ComponentPackage.SCOMP_REQUIRED: {
			SComp_Required sComp_Required = (SComp_Required) theEObject;
			T result = caseSComp_Required(sComp_Required);
			if (result == null)
				result = caseServiceComponent(sComp_Required);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ComponentPackage.PCOMP_REQUIRED: {
			PComp_Required pComp_Required = (PComp_Required) theEObject;
			T result = casePComp_Required(pComp_Required);
			if (result == null)
				result = casePortComponent(pComp_Required);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ComponentPackage.PORT_COMPONENT: {
			PortComponent portComponent = (PortComponent) theEObject;
			T result = casePortComponent(portComponent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ComponentPackage.INTERFACE_COMPONENT: {
			InterfaceComponent interfaceComponent = (InterfaceComponent) theEObject;
			T result = caseInterfaceComponent(interfaceComponent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PComp Provided</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PComp Provided</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePComp_Provided(PComp_Provided object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SComp Provided</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SComp Provided</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSComp_Provided(SComp_Provided object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceComponent(ServiceComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent(Component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraint(Constraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SComp Required</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SComp Required</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSComp_Required(SComp_Required object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PComp Required</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PComp Required</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePComp_Required(PComp_Required object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortComponent(PortComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceComponent(InterfaceComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Architectural Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Architectural Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArchitecturalElement(ArchitecturalElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ComponentSwitch
