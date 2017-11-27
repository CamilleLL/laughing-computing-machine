/**
 */
package cCS.Configuration.impl;

import cCS.ArchitecturalElement;

import cCS.Component.Component;

import cCS.Configuration.Configuration;
import cCS.Configuration.ConfigurationPackage;
import cCS.Configuration.InterfaceConfiguration;
import cCS.Configuration.Lien;

import cCS.Connector.Connector;

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
 * An implementation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cCS.Configuration.impl.ConfigurationImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link cCS.Configuration.impl.ConfigurationImpl#getConnector <em>Connector</em>}</li>
 *   <li>{@link cCS.Configuration.impl.ConfigurationImpl#getLien <em>Lien</em>}</li>
 *   <li>{@link cCS.Configuration.impl.ConfigurationImpl#getInterfaceconfiguration <em>Interfaceconfiguration</em>}</li>
 *   <li>{@link cCS.Configuration.impl.ConfigurationImpl#getArchitecturalelement <em>Architecturalelement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigurationImpl extends ArchitecturalElementImpl implements Configuration {
	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> component;

	/**
	 * The cached value of the '{@link #getConnector() <em>Connector</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnector()
	 * @generated
	 * @ordered
	 */
	protected EList<Connector> connector;

	/**
	 * The cached value of the '{@link #getLien() <em>Lien</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLien()
	 * @generated
	 * @ordered
	 */
	protected EList<Lien> lien;

	/**
	 * The cached value of the '{@link #getInterfaceconfiguration() <em>Interfaceconfiguration</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceconfiguration()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceConfiguration> interfaceconfiguration;

	/**
	 * The cached value of the '{@link #getArchitecturalelement() <em>Architecturalelement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchitecturalelement()
	 * @generated
	 * @ordered
	 */
	protected EList<ArchitecturalElement> architecturalelement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigurationPackage.Literals.CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getComponent() {
		if (component == null) {
			component = new EObjectContainmentEList<Component>(Component.class, this,
					ConfigurationPackage.CONFIGURATION__COMPONENT);
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connector> getConnector() {
		if (connector == null) {
			connector = new EObjectContainmentEList<Connector>(Connector.class, this,
					ConfigurationPackage.CONFIGURATION__CONNECTOR);
		}
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Lien> getLien() {
		if (lien == null) {
			lien = new EObjectContainmentEList<Lien>(Lien.class, this, ConfigurationPackage.CONFIGURATION__LIEN);
		}
		return lien;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceConfiguration> getInterfaceconfiguration() {
		if (interfaceconfiguration == null) {
			interfaceconfiguration = new EObjectContainmentEList<InterfaceConfiguration>(InterfaceConfiguration.class,
					this, ConfigurationPackage.CONFIGURATION__INTERFACECONFIGURATION);
		}
		return interfaceconfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArchitecturalElement> getArchitecturalelement() {
		if (architecturalelement == null) {
			architecturalelement = new EObjectContainmentEList<ArchitecturalElement>(ArchitecturalElement.class, this,
					ConfigurationPackage.CONFIGURATION__ARCHITECTURALELEMENT);
		}
		return architecturalelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ConfigurationPackage.CONFIGURATION__COMPONENT:
			return ((InternalEList<?>) getComponent()).basicRemove(otherEnd, msgs);
		case ConfigurationPackage.CONFIGURATION__CONNECTOR:
			return ((InternalEList<?>) getConnector()).basicRemove(otherEnd, msgs);
		case ConfigurationPackage.CONFIGURATION__LIEN:
			return ((InternalEList<?>) getLien()).basicRemove(otherEnd, msgs);
		case ConfigurationPackage.CONFIGURATION__INTERFACECONFIGURATION:
			return ((InternalEList<?>) getInterfaceconfiguration()).basicRemove(otherEnd, msgs);
		case ConfigurationPackage.CONFIGURATION__ARCHITECTURALELEMENT:
			return ((InternalEList<?>) getArchitecturalelement()).basicRemove(otherEnd, msgs);
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
		case ConfigurationPackage.CONFIGURATION__COMPONENT:
			return getComponent();
		case ConfigurationPackage.CONFIGURATION__CONNECTOR:
			return getConnector();
		case ConfigurationPackage.CONFIGURATION__LIEN:
			return getLien();
		case ConfigurationPackage.CONFIGURATION__INTERFACECONFIGURATION:
			return getInterfaceconfiguration();
		case ConfigurationPackage.CONFIGURATION__ARCHITECTURALELEMENT:
			return getArchitecturalelement();
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
		case ConfigurationPackage.CONFIGURATION__COMPONENT:
			getComponent().clear();
			getComponent().addAll((Collection<? extends Component>) newValue);
			return;
		case ConfigurationPackage.CONFIGURATION__CONNECTOR:
			getConnector().clear();
			getConnector().addAll((Collection<? extends Connector>) newValue);
			return;
		case ConfigurationPackage.CONFIGURATION__LIEN:
			getLien().clear();
			getLien().addAll((Collection<? extends Lien>) newValue);
			return;
		case ConfigurationPackage.CONFIGURATION__INTERFACECONFIGURATION:
			getInterfaceconfiguration().clear();
			getInterfaceconfiguration().addAll((Collection<? extends InterfaceConfiguration>) newValue);
			return;
		case ConfigurationPackage.CONFIGURATION__ARCHITECTURALELEMENT:
			getArchitecturalelement().clear();
			getArchitecturalelement().addAll((Collection<? extends ArchitecturalElement>) newValue);
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
		case ConfigurationPackage.CONFIGURATION__COMPONENT:
			getComponent().clear();
			return;
		case ConfigurationPackage.CONFIGURATION__CONNECTOR:
			getConnector().clear();
			return;
		case ConfigurationPackage.CONFIGURATION__LIEN:
			getLien().clear();
			return;
		case ConfigurationPackage.CONFIGURATION__INTERFACECONFIGURATION:
			getInterfaceconfiguration().clear();
			return;
		case ConfigurationPackage.CONFIGURATION__ARCHITECTURALELEMENT:
			getArchitecturalelement().clear();
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
		case ConfigurationPackage.CONFIGURATION__COMPONENT:
			return component != null && !component.isEmpty();
		case ConfigurationPackage.CONFIGURATION__CONNECTOR:
			return connector != null && !connector.isEmpty();
		case ConfigurationPackage.CONFIGURATION__LIEN:
			return lien != null && !lien.isEmpty();
		case ConfigurationPackage.CONFIGURATION__INTERFACECONFIGURATION:
			return interfaceconfiguration != null && !interfaceconfiguration.isEmpty();
		case ConfigurationPackage.CONFIGURATION__ARCHITECTURALELEMENT:
			return architecturalelement != null && !architecturalelement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConfigurationImpl
