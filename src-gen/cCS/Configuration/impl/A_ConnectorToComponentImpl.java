/**
 */
package cCS.Configuration.impl;

import cCS.Component.PComp_Required;

import cCS.Configuration.A_ConnectorToComponent;
import cCS.Configuration.ConfigurationPackage;

import cCS.Connector.RoleProvided;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AConnector To Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cCS.Configuration.impl.A_ConnectorToComponentImpl#getRoleprovided <em>Roleprovided</em>}</li>
 *   <li>{@link cCS.Configuration.impl.A_ConnectorToComponentImpl#getPcomp_required <em>Pcomp required</em>}</li>
 * </ul>
 *
 * @generated
 */
public class A_ConnectorToComponentImpl extends AttachmentImpl implements A_ConnectorToComponent {
	/**
	 * The cached value of the '{@link #getRoleprovided() <em>Roleprovided</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleprovided()
	 * @generated
	 * @ordered
	 */
	protected RoleProvided roleprovided;

	/**
	 * The cached value of the '{@link #getPcomp_required() <em>Pcomp required</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPcomp_required()
	 * @generated
	 * @ordered
	 */
	protected PComp_Required pcomp_required;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected A_ConnectorToComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigurationPackage.Literals.ACONNECTOR_TO_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleProvided getRoleprovided() {
		if (roleprovided != null && roleprovided.eIsProxy()) {
			InternalEObject oldRoleprovided = (InternalEObject) roleprovided;
			roleprovided = (RoleProvided) eResolveProxy(oldRoleprovided);
			if (roleprovided != oldRoleprovided) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ConfigurationPackage.ACONNECTOR_TO_COMPONENT__ROLEPROVIDED, oldRoleprovided, roleprovided));
			}
		}
		return roleprovided;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleProvided basicGetRoleprovided() {
		return roleprovided;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoleprovided(RoleProvided newRoleprovided) {
		RoleProvided oldRoleprovided = roleprovided;
		roleprovided = newRoleprovided;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ConfigurationPackage.ACONNECTOR_TO_COMPONENT__ROLEPROVIDED, oldRoleprovided, roleprovided));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PComp_Required getPcomp_required() {
		if (pcomp_required != null && pcomp_required.eIsProxy()) {
			InternalEObject oldPcomp_required = (InternalEObject) pcomp_required;
			pcomp_required = (PComp_Required) eResolveProxy(oldPcomp_required);
			if (pcomp_required != oldPcomp_required) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ConfigurationPackage.ACONNECTOR_TO_COMPONENT__PCOMP_REQUIRED, oldPcomp_required,
							pcomp_required));
			}
		}
		return pcomp_required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PComp_Required basicGetPcomp_required() {
		return pcomp_required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPcomp_required(PComp_Required newPcomp_required) {
		PComp_Required oldPcomp_required = pcomp_required;
		pcomp_required = newPcomp_required;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ConfigurationPackage.ACONNECTOR_TO_COMPONENT__PCOMP_REQUIRED, oldPcomp_required, pcomp_required));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ConfigurationPackage.ACONNECTOR_TO_COMPONENT__ROLEPROVIDED:
			if (resolve)
				return getRoleprovided();
			return basicGetRoleprovided();
		case ConfigurationPackage.ACONNECTOR_TO_COMPONENT__PCOMP_REQUIRED:
			if (resolve)
				return getPcomp_required();
			return basicGetPcomp_required();
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
		case ConfigurationPackage.ACONNECTOR_TO_COMPONENT__ROLEPROVIDED:
			setRoleprovided((RoleProvided) newValue);
			return;
		case ConfigurationPackage.ACONNECTOR_TO_COMPONENT__PCOMP_REQUIRED:
			setPcomp_required((PComp_Required) newValue);
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
		case ConfigurationPackage.ACONNECTOR_TO_COMPONENT__ROLEPROVIDED:
			setRoleprovided((RoleProvided) null);
			return;
		case ConfigurationPackage.ACONNECTOR_TO_COMPONENT__PCOMP_REQUIRED:
			setPcomp_required((PComp_Required) null);
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
		case ConfigurationPackage.ACONNECTOR_TO_COMPONENT__ROLEPROVIDED:
			return roleprovided != null;
		case ConfigurationPackage.ACONNECTOR_TO_COMPONENT__PCOMP_REQUIRED:
			return pcomp_required != null;
		}
		return super.eIsSet(featureID);
	}

} //A_ConnectorToComponentImpl
