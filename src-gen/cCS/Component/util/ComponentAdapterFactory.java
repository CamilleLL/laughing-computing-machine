/**
 */
package cCS.Component.util;

import cCS.ArchitecturalElement;

import cCS.Component.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see cCS.Component.ComponentPackage
 * @generated
 */
public class ComponentAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ComponentPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ComponentPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentSwitch<Adapter> modelSwitch = new ComponentSwitch<Adapter>() {
		@Override
		public Adapter casePComp_Provided(PComp_Provided object) {
			return createPComp_ProvidedAdapter();
		}

		@Override
		public Adapter caseSComp_Provided(SComp_Provided object) {
			return createSComp_ProvidedAdapter();
		}

		@Override
		public Adapter caseServiceComponent(ServiceComponent object) {
			return createServiceComponentAdapter();
		}

		@Override
		public Adapter caseComponent(Component object) {
			return createComponentAdapter();
		}

		@Override
		public Adapter caseConstraint(Constraint object) {
			return createConstraintAdapter();
		}

		@Override
		public Adapter caseProperty(Property object) {
			return createPropertyAdapter();
		}

		@Override
		public Adapter caseSComp_Required(SComp_Required object) {
			return createSComp_RequiredAdapter();
		}

		@Override
		public Adapter casePComp_Required(PComp_Required object) {
			return createPComp_RequiredAdapter();
		}

		@Override
		public Adapter casePortComponent(PortComponent object) {
			return createPortComponentAdapter();
		}

		@Override
		public Adapter caseInterfaceComponent(InterfaceComponent object) {
			return createInterfaceComponentAdapter();
		}

		@Override
		public Adapter caseArchitecturalElement(ArchitecturalElement object) {
			return createArchitecturalElementAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.Component.PComp_Provided <em>PComp Provided</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.Component.PComp_Provided
	 * @generated
	 */
	public Adapter createPComp_ProvidedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.Component.SComp_Provided <em>SComp Provided</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.Component.SComp_Provided
	 * @generated
	 */
	public Adapter createSComp_ProvidedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.Component.ServiceComponent <em>Service Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.Component.ServiceComponent
	 * @generated
	 */
	public Adapter createServiceComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.Component.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.Component.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.Component.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.Component.Constraint
	 * @generated
	 */
	public Adapter createConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.Component.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.Component.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.Component.SComp_Required <em>SComp Required</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.Component.SComp_Required
	 * @generated
	 */
	public Adapter createSComp_RequiredAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.Component.PComp_Required <em>PComp Required</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.Component.PComp_Required
	 * @generated
	 */
	public Adapter createPComp_RequiredAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.Component.PortComponent <em>Port Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.Component.PortComponent
	 * @generated
	 */
	public Adapter createPortComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.Component.InterfaceComponent <em>Interface Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.Component.InterfaceComponent
	 * @generated
	 */
	public Adapter createInterfaceComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.ArchitecturalElement <em>Architectural Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.ArchitecturalElement
	 * @generated
	 */
	public Adapter createArchitecturalElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ComponentAdapterFactory
