/**
 */
package cCS.Configuration.impl;

import cCS.Component.PComp_Provided;

import cCS.Configuration.A_ComponentToConnector;
import cCS.Configuration.ConfigurationPackage;

import cCS.Connector.RoleRequired;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AComponent To Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cCS.Configuration.impl.A_ComponentToConnectorImpl#getPcomp_provided <em>Pcomp provided</em>}</li>
 *   <li>{@link cCS.Configuration.impl.A_ComponentToConnectorImpl#getRolerequired <em>Rolerequired</em>}</li>
 * </ul>
 *
 * @generated
 */
public class A_ComponentToConnectorImpl extends AttachmentImpl implements A_ComponentToConnector {
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
	 * The cached value of the '{@link #getRolerequired() <em>Rolerequired</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolerequired()
	 * @generated
	 * @ordered
	 */
	protected RoleRequired rolerequired;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected A_ComponentToConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigurationPackage.Literals.ACOMPONENT_TO_CONNECTOR;
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
							ConfigurationPackage.ACOMPONENT_TO_CONNECTOR__PCOMP_PROVIDED, oldPcomp_provided,
							pcomp_provided));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					ConfigurationPackage.ACOMPONENT_TO_CONNECTOR__PCOMP_PROVIDED, oldPcomp_provided, pcomp_provided));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequired getRolerequired() {
		if (rolerequired != null && rolerequired.eIsProxy()) {
			InternalEObject oldRolerequired = (InternalEObject) rolerequired;
			rolerequired = (RoleRequired) eResolveProxy(oldRolerequired);
			if (rolerequired != oldRolerequired) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ConfigurationPackage.ACOMPONENT_TO_CONNECTOR__ROLEREQUIRED, oldRolerequired, rolerequired));
			}
		}
		return rolerequired;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequired basicGetRolerequired() {
		return rolerequired;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRolerequired(RoleRequired newRolerequired) {
		RoleRequired oldRolerequired = rolerequired;
		rolerequired = newRolerequired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ConfigurationPackage.ACOMPONENT_TO_CONNECTOR__ROLEREQUIRED, oldRolerequired, rolerequired));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ConfigurationPackage.ACOMPONENT_TO_CONNECTOR__PCOMP_PROVIDED:
			if (resolve)
				return getPcomp_provided();
			return basicGetPcomp_provided();
		case ConfigurationPackage.ACOMPONENT_TO_CONNECTOR__ROLEREQUIRED:
			if (resolve)
				return getRolerequired();
			return basicGetRolerequired();
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
		case ConfigurationPackage.ACOMPONENT_TO_CONNECTOR__PCOMP_PROVIDED:
			setPcomp_provided((PComp_Provided) newValue);
			return;
		case ConfigurationPackage.ACOMPONENT_TO_CONNECTOR__ROLEREQUIRED:
			setRolerequired((RoleRequired) newValue);
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
		case ConfigurationPackage.ACOMPONENT_TO_CONNECTOR__PCOMP_PROVIDED:
			setPcomp_provided((PComp_Provided) null);
			return;
		case ConfigurationPackage.ACOMPONENT_TO_CONNECTOR__ROLEREQUIRED:
			setRolerequired((RoleRequired) null);
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
		case ConfigurationPackage.ACOMPONENT_TO_CONNECTOR__PCOMP_PROVIDED:
			return pcomp_provided != null;
		case ConfigurationPackage.ACOMPONENT_TO_CONNECTOR__ROLEREQUIRED:
			return rolerequired != null;
		}
		return super.eIsSet(featureID);
	}

} //A_ComponentToConnectorImpl
