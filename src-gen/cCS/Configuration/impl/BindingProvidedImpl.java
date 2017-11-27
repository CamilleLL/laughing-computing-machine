/**
 */
package cCS.Configuration.impl;

import cCS.Configuration.BindingProvided;
import cCS.Configuration.ConfigurationPackage;
import cCS.Configuration.PConf_Provided;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding Provided</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cCS.Configuration.impl.BindingProvidedImpl#getPconf_provided <em>Pconf provided</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BindingProvidedImpl extends BindingImpl implements BindingProvided {
	/**
	 * The cached value of the '{@link #getPconf_provided() <em>Pconf provided</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPconf_provided()
	 * @generated
	 * @ordered
	 */
	protected PConf_Provided pconf_provided;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BindingProvidedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigurationPackage.Literals.BINDING_PROVIDED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PConf_Provided getPconf_provided() {
		if (pconf_provided != null && pconf_provided.eIsProxy()) {
			InternalEObject oldPconf_provided = (InternalEObject) pconf_provided;
			pconf_provided = (PConf_Provided) eResolveProxy(oldPconf_provided);
			if (pconf_provided != oldPconf_provided) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ConfigurationPackage.BINDING_PROVIDED__PCONF_PROVIDED, oldPconf_provided, pconf_provided));
			}
		}
		return pconf_provided;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PConf_Provided basicGetPconf_provided() {
		return pconf_provided;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPconf_provided(PConf_Provided newPconf_provided) {
		PConf_Provided oldPconf_provided = pconf_provided;
		pconf_provided = newPconf_provided;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.BINDING_PROVIDED__PCONF_PROVIDED,
					oldPconf_provided, pconf_provided));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ConfigurationPackage.BINDING_PROVIDED__PCONF_PROVIDED:
			if (resolve)
				return getPconf_provided();
			return basicGetPconf_provided();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ConfigurationPackage.BINDING_PROVIDED__PCONF_PROVIDED:
			setPconf_provided((PConf_Provided) newValue);
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
		case ConfigurationPackage.BINDING_PROVIDED__PCONF_PROVIDED:
			setPconf_provided((PConf_Provided) null);
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
		case ConfigurationPackage.BINDING_PROVIDED__PCONF_PROVIDED:
			return pconf_provided != null;
		}
		return super.eIsSet(featureID);
	}

} //BindingProvidedImpl
