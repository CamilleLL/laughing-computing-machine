/**
 */
package cCS.Component.impl;

import cCS.Component.Component;
import cCS.Component.ComponentPackage;
import cCS.Component.Constraint;
import cCS.Component.InterfaceComponent;
import cCS.Component.Property;

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
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cCS.Component.impl.ComponentImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link cCS.Component.impl.ComponentImpl#getInterfacecomponent <em>Interfacecomponent</em>}</li>
 *   <li>{@link cCS.Component.impl.ComponentImpl#getConstraint <em>Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentImpl extends ArchitecturalElementImpl implements Component {
	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> property;

	/**
	 * The cached value of the '{@link #getInterfacecomponent() <em>Interfacecomponent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfacecomponent()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceComponent> interfacecomponent;

	/**
	 * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> constraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentPackage.Literals.COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getProperty() {
		if (property == null) {
			property = new EObjectContainmentEList<Property>(Property.class, this,
					ComponentPackage.COMPONENT__PROPERTY);
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceComponent> getInterfacecomponent() {
		if (interfacecomponent == null) {
			interfacecomponent = new EObjectContainmentEList<InterfaceComponent>(InterfaceComponent.class, this,
					ComponentPackage.COMPONENT__INTERFACECOMPONENT);
		}
		return interfacecomponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getConstraint() {
		if (constraint == null) {
			constraint = new EObjectContainmentEList<Constraint>(Constraint.class, this,
					ComponentPackage.COMPONENT__CONSTRAINT);
		}
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ComponentPackage.COMPONENT__PROPERTY:
			return ((InternalEList<?>) getProperty()).basicRemove(otherEnd, msgs);
		case ComponentPackage.COMPONENT__INTERFACECOMPONENT:
			return ((InternalEList<?>) getInterfacecomponent()).basicRemove(otherEnd, msgs);
		case ComponentPackage.COMPONENT__CONSTRAINT:
			return ((InternalEList<?>) getConstraint()).basicRemove(otherEnd, msgs);
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
		case ComponentPackage.COMPONENT__PROPERTY:
			return getProperty();
		case ComponentPackage.COMPONENT__INTERFACECOMPONENT:
			return getInterfacecomponent();
		case ComponentPackage.COMPONENT__CONSTRAINT:
			return getConstraint();
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
		case ComponentPackage.COMPONENT__PROPERTY:
			getProperty().clear();
			getProperty().addAll((Collection<? extends Property>) newValue);
			return;
		case ComponentPackage.COMPONENT__INTERFACECOMPONENT:
			getInterfacecomponent().clear();
			getInterfacecomponent().addAll((Collection<? extends InterfaceComponent>) newValue);
			return;
		case ComponentPackage.COMPONENT__CONSTRAINT:
			getConstraint().clear();
			getConstraint().addAll((Collection<? extends Constraint>) newValue);
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
		case ComponentPackage.COMPONENT__PROPERTY:
			getProperty().clear();
			return;
		case ComponentPackage.COMPONENT__INTERFACECOMPONENT:
			getInterfacecomponent().clear();
			return;
		case ComponentPackage.COMPONENT__CONSTRAINT:
			getConstraint().clear();
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
		case ComponentPackage.COMPONENT__PROPERTY:
			return property != null && !property.isEmpty();
		case ComponentPackage.COMPONENT__INTERFACECOMPONENT:
			return interfacecomponent != null && !interfacecomponent.isEmpty();
		case ComponentPackage.COMPONENT__CONSTRAINT:
			return constraint != null && !constraint.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComponentImpl
