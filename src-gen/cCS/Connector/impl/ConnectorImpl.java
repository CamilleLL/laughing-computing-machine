/**
 */
package cCS.Connector.impl;

import cCS.Connector.Connector;
import cCS.Connector.ConnectorPackage;
import cCS.Connector.Glue;
import cCS.Connector.InterfaceConnector;

import cCS.impl.ArchitecturalElementImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cCS.Connector.impl.ConnectorImpl#getGlue <em>Glue</em>}</li>
 *   <li>{@link cCS.Connector.impl.ConnectorImpl#getInterfaceconnector <em>Interfaceconnector</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectorImpl extends ArchitecturalElementImpl implements Connector {
	/**
	 * The cached value of the '{@link #getGlue() <em>Glue</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlue()
	 * @generated
	 * @ordered
	 */
	protected EList<Glue> glue;

	/**
	 * The cached value of the '{@link #getInterfaceconnector() <em>Interfaceconnector</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceconnector()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceConnector> interfaceconnector;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConnectorPackage.Literals.CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Glue> getGlue() {
		if (glue == null) {
			glue = new EObjectContainmentEList<Glue>(Glue.class, this, ConnectorPackage.CONNECTOR__GLUE);
		}
		return glue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceConnector> getInterfaceconnector() {
		if (interfaceconnector == null) {
			interfaceconnector = new EObjectContainmentEList<InterfaceConnector>(InterfaceConnector.class, this,
					ConnectorPackage.CONNECTOR__INTERFACECONNECTOR);
		}
		return interfaceconnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ConnectorPackage.CONNECTOR__GLUE:
			return ((InternalEList<?>) getGlue()).basicRemove(otherEnd, msgs);
		case ConnectorPackage.CONNECTOR__INTERFACECONNECTOR:
			return ((InternalEList<?>) getInterfaceconnector()).basicRemove(otherEnd, msgs);
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
		case ConnectorPackage.CONNECTOR__GLUE:
			return getGlue();
		case ConnectorPackage.CONNECTOR__INTERFACECONNECTOR:
			return getInterfaceconnector();
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
		case ConnectorPackage.CONNECTOR__GLUE:
			getGlue().clear();
			getGlue().addAll((Collection<? extends Glue>) newValue);
			return;
		case ConnectorPackage.CONNECTOR__INTERFACECONNECTOR:
			getInterfaceconnector().clear();
			getInterfaceconnector().addAll((Collection<? extends InterfaceConnector>) newValue);
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
		case ConnectorPackage.CONNECTOR__GLUE:
			getGlue().clear();
			return;
		case ConnectorPackage.CONNECTOR__INTERFACECONNECTOR:
			getInterfaceconnector().clear();
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
		case ConnectorPackage.CONNECTOR__GLUE:
			return glue != null && !glue.isEmpty();
		case ConnectorPackage.CONNECTOR__INTERFACECONNECTOR:
			return interfaceconnector != null && !interfaceconnector.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConnectorImpl
