/**
 */
package cCS.Configuration.impl;

import cCS.Configuration.ConfigurationPackage;
import cCS.Configuration.InterfaceConfiguration;
import cCS.Configuration.PortConfiguration;

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
 * An implementation of the model object '<em><b>Interface Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cCS.Configuration.impl.InterfaceConfigurationImpl#getPortconfiguration <em>Portconfiguration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceConfigurationImpl extends MinimalEObjectImpl.Container implements InterfaceConfiguration {
	/**
	 * The cached value of the '{@link #getPortconfiguration() <em>Portconfiguration</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortconfiguration()
	 * @generated
	 * @ordered
	 */
	protected EList<PortConfiguration> portconfiguration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigurationPackage.Literals.INTERFACE_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortConfiguration> getPortconfiguration() {
		if (portconfiguration == null) {
			portconfiguration = new EObjectContainmentEList<PortConfiguration>(PortConfiguration.class, this,
					ConfigurationPackage.INTERFACE_CONFIGURATION__PORTCONFIGURATION);
		}
		return portconfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ConfigurationPackage.INTERFACE_CONFIGURATION__PORTCONFIGURATION:
			return ((InternalEList<?>) getPortconfiguration()).basicRemove(otherEnd, msgs);
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
		case ConfigurationPackage.INTERFACE_CONFIGURATION__PORTCONFIGURATION:
			return getPortconfiguration();
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
		case ConfigurationPackage.INTERFACE_CONFIGURATION__PORTCONFIGURATION:
			getPortconfiguration().clear();
			getPortconfiguration().addAll((Collection<? extends PortConfiguration>) newValue);
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
		case ConfigurationPackage.INTERFACE_CONFIGURATION__PORTCONFIGURATION:
			getPortconfiguration().clear();
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
		case ConfigurationPackage.INTERFACE_CONFIGURATION__PORTCONFIGURATION:
			return portconfiguration != null && !portconfiguration.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InterfaceConfigurationImpl
