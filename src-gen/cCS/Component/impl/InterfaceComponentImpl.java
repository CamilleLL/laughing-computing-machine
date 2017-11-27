/**
 */
package cCS.Component.impl;

import cCS.Component.ComponentPackage;
import cCS.Component.InterfaceComponent;
import cCS.Component.PortComponent;
import cCS.Component.ServiceComponent;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cCS.Component.impl.InterfaceComponentImpl#getPortcomponent <em>Portcomponent</em>}</li>
 *   <li>{@link cCS.Component.impl.InterfaceComponentImpl#getServicecomponent <em>Servicecomponent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceComponentImpl extends MinimalEObjectImpl.Container implements InterfaceComponent {
	/**
	 * The cached value of the '{@link #getPortcomponent() <em>Portcomponent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortcomponent()
	 * @generated
	 * @ordered
	 */
	protected EList<PortComponent> portcomponent;

	/**
	 * The cached value of the '{@link #getServicecomponent() <em>Servicecomponent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServicecomponent()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceComponent> servicecomponent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentPackage.Literals.INTERFACE_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortComponent> getPortcomponent() {
		if (portcomponent == null) {
			portcomponent = new EObjectContainmentEList<PortComponent>(PortComponent.class, this,
					ComponentPackage.INTERFACE_COMPONENT__PORTCOMPONENT);
		}
		return portcomponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceComponent> getServicecomponent() {
		if (servicecomponent == null) {
			servicecomponent = new EObjectContainmentEList<ServiceComponent>(ServiceComponent.class, this,
					ComponentPackage.INTERFACE_COMPONENT__SERVICECOMPONENT);
		}
		return servicecomponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ComponentPackage.INTERFACE_COMPONENT__PORTCOMPONENT:
			return ((InternalEList<?>) getPortcomponent()).basicRemove(otherEnd, msgs);
		case ComponentPackage.INTERFACE_COMPONENT__SERVICECOMPONENT:
			return ((InternalEList<?>) getServicecomponent()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ComponentPackage.INTERFACE_COMPONENT__PORTCOMPONENT:
			return getPortcomponent();
		case ComponentPackage.INTERFACE_COMPONENT__SERVICECOMPONENT:
			return getServicecomponent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ComponentPackage.INTERFACE_COMPONENT__PORTCOMPONENT:
			getPortcomponent().clear();
			getPortcomponent().addAll((Collection<? extends PortComponent>) newValue);
			return;
		case ComponentPackage.INTERFACE_COMPONENT__SERVICECOMPONENT:
			getServicecomponent().clear();
			getServicecomponent().addAll((Collection<? extends ServiceComponent>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ComponentPackage.INTERFACE_COMPONENT__PORTCOMPONENT:
			getPortcomponent().clear();
			return;
		case ComponentPackage.INTERFACE_COMPONENT__SERVICECOMPONENT:
			getServicecomponent().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ComponentPackage.INTERFACE_COMPONENT__PORTCOMPONENT:
			return portcomponent != null && !portcomponent.isEmpty();
		case ComponentPackage.INTERFACE_COMPONENT__SERVICECOMPONENT:
			return servicecomponent != null && !servicecomponent.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InterfaceComponentImpl
