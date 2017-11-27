/**
 */
package cCS.Configuration.util;

import cCS.ArchitecturalElement;

import cCS.Configuration.*;

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
 * @see cCS.Configuration.ConfigurationPackage
 * @generated
 */
public class ConfigurationSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ConfigurationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationSwitch() {
		if (modelPackage == null) {
			modelPackage = ConfigurationPackage.eINSTANCE;
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
		case ConfigurationPackage.ACOMPONENT_TO_CONNECTOR: {
			A_ComponentToConnector a_ComponentToConnector = (A_ComponentToConnector) theEObject;
			T result = caseA_ComponentToConnector(a_ComponentToConnector);
			if (result == null)
				result = caseAttachment(a_ComponentToConnector);
			if (result == null)
				result = caseLien(a_ComponentToConnector);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ConfigurationPackage.BINDING: {
			Binding binding = (Binding) theEObject;
			T result = caseBinding(binding);
			if (result == null)
				result = caseLien(binding);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ConfigurationPackage.BINDING_PROVIDED: {
			BindingProvided bindingProvided = (BindingProvided) theEObject;
			T result = caseBindingProvided(bindingProvided);
			if (result == null)
				result = caseBinding(bindingProvided);
			if (result == null)
				result = caseLien(bindingProvided);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ConfigurationPackage.BINDING_REQUIRED: {
			BindingRequired bindingRequired = (BindingRequired) theEObject;
			T result = caseBindingRequired(bindingRequired);
			if (result == null)
				result = caseBinding(bindingRequired);
			if (result == null)
				result = caseLien(bindingRequired);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ConfigurationPackage.ATTACHMENT: {
			Attachment attachment = (Attachment) theEObject;
			T result = caseAttachment(attachment);
			if (result == null)
				result = caseLien(attachment);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ConfigurationPackage.LIEN: {
			Lien lien = (Lien) theEObject;
			T result = caseLien(lien);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ConfigurationPackage.PCONF_PROVIDED: {
			PConf_Provided pConf_Provided = (PConf_Provided) theEObject;
			T result = casePConf_Provided(pConf_Provided);
			if (result == null)
				result = casePortConfiguration(pConf_Provided);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ConfigurationPackage.ACONNECTOR_TO_COMPONENT: {
			A_ConnectorToComponent a_ConnectorToComponent = (A_ConnectorToComponent) theEObject;
			T result = caseA_ConnectorToComponent(a_ConnectorToComponent);
			if (result == null)
				result = caseAttachment(a_ConnectorToComponent);
			if (result == null)
				result = caseLien(a_ConnectorToComponent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ConfigurationPackage.CONFIGURATION: {
			Configuration configuration = (Configuration) theEObject;
			T result = caseConfiguration(configuration);
			if (result == null)
				result = caseArchitecturalElement(configuration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ConfigurationPackage.PCONF_REQUIRED: {
			PConf_Required pConf_Required = (PConf_Required) theEObject;
			T result = casePConf_Required(pConf_Required);
			if (result == null)
				result = casePortConfiguration(pConf_Required);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ConfigurationPackage.PORT_CONFIGURATION: {
			PortConfiguration portConfiguration = (PortConfiguration) theEObject;
			T result = casePortConfiguration(portConfiguration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ConfigurationPackage.INTERFACE_CONFIGURATION: {
			InterfaceConfiguration interfaceConfiguration = (InterfaceConfiguration) theEObject;
			T result = caseInterfaceConfiguration(interfaceConfiguration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AComponent To Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AComponent To Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseA_ComponentToConnector(A_ComponentToConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinding(Binding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding Provided</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding Provided</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBindingProvided(BindingProvided object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding Required</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding Required</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBindingRequired(BindingRequired object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attachment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attachment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttachment(Attachment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lien</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lien</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLien(Lien object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PConf Provided</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PConf Provided</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePConf_Provided(PConf_Provided object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AConnector To Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AConnector To Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseA_ConnectorToComponent(A_ConnectorToComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfiguration(Configuration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PConf Required</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PConf Required</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePConf_Required(PConf_Required object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortConfiguration(PortConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceConfiguration(InterfaceConfiguration object) {
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

} //ConfigurationSwitch
