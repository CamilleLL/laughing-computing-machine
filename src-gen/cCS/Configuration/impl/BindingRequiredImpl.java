/**
 */
package cCS.Configuration.impl;

import cCS.Component.PComp_Provided;

import cCS.Configuration.BindingRequired;
import cCS.Configuration.ConfigurationPackage;
import cCS.Configuration.PConf_Required;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding Required</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cCS.Configuration.impl.BindingRequiredImpl#getPcomp_provided <em>Pcomp provided</em>}</li>
 *   <li>{@link cCS.Configuration.impl.BindingRequiredImpl#getPconf_required <em>Pconf required</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BindingRequiredImpl extends BindingImpl implements BindingRequired {
	/**
	 * The cached value of the '{@link #getPcomp_provided() <em>Pcomp provided</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPcomp_provided()
	 * @generated
	 * @ordered
	 */
	protected PComp_Provided pcomp_provided;

	/**
	 * The cached value of the '{@link #getPconf_required() <em>Pconf required</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPconf_required()
	 * @generated
	 * @ordered
	 */
	protected PConf_Required pconf_required;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BindingRequiredImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigurationPackage.Literals.BINDING_REQUIRED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PComp_Provided getPcomp_provided() {
		if (pcomp_provided != null && pcomp_provided.eIsProxy()) {
			InternalEObject oldPcomp_provided = (InternalEObject) pcomp_provided;
			pcomp_provided = (PComp_Provided) eResolveProxy(oldPcomp_provided);
			if (pcomp_provided != oldPcomp_provided) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ConfigurationPackage.BINDING_REQUIRED__PCOMP_PROVIDED, oldPcomp_provided, pcomp_provided));
			}
		}
		return pcomp_provided;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PComp_Provided basicGetPcomp_provided() {
		return pcomp_provided;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPcomp_provided(PComp_Provided newPcomp_provided) {
		PComp_Provided oldPcomp_provided = pcomp_provided;
		pcomp_provided = newPcomp_provided;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.BINDING_REQUIRED__PCOMP_PROVIDED,
					oldPcomp_provided, pcomp_provided));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PConf_Required getPconf_required() {
		if (pconf_required != null && pconf_required.eIsProxy()) {
			InternalEObject oldPconf_required = (InternalEObject) pconf_required;
			pconf_required = (PConf_Required) eResolveProxy(oldPconf_required);
			if (pconf_required != oldPconf_required) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ConfigurationPackage.BINDING_REQUIRED__PCONF_REQUIRED, oldPconf_required, pconf_required));
			}
		}
		return pconf_required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PConf_Required basicGetPconf_required() {
		return pconf_required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPconf_required(PConf_Required newPconf_required) {
		PConf_Required oldPconf_required = pconf_required;
		pconf_required = newPconf_required;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.BINDING_REQUIRED__PCONF_REQUIRED,
					oldPconf_required, pconf_required));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ConfigurationPackage.BINDING_REQUIRED__PCOMP_PROVIDED:
			if (resolve)
				return getPcomp_provided();
			return basicGetPcomp_provided();
		case ConfigurationPackage.BINDING_REQUIRED__PCONF_REQUIRED:
			if (resolve)
				return getPconf_required();
			return basicGetPconf_required();
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
		case ConfigurationPackage.BINDING_REQUIRED__PCOMP_PROVIDED:
			setPcomp_provided((PComp_Provided) newValue);
			return;
		case ConfigurationPackage.BINDING_REQUIRED__PCONF_REQUIRED:
			setPconf_required((PConf_Required) newValue);
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
		case ConfigurationPackage.BINDING_REQUIRED__PCOMP_PROVIDED:
			setPcomp_provided((PComp_Provided) null);
			return;
		case ConfigurationPackage.BINDING_REQUIRED__PCONF_REQUIRED:
			setPconf_required((PConf_Required) null);
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
		case ConfigurationPackage.BINDING_REQUIRED__PCOMP_PROVIDED:
			return pcomp_provided != null;
		case ConfigurationPackage.BINDING_REQUIRED__PCONF_REQUIRED:
			return pconf_required != null;
		}
		return super.eIsSet(featureID);
	}

} //BindingRequiredImpl
