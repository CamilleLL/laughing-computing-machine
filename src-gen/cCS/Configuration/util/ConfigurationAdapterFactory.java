/**
 */
package cCS.Configuration.util;

import cCS.ArchitecturalElement;

import cCS.Configuration.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see cCS.Configuration.ConfigurationPackage
 * @generated
 */
public class ConfigurationAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ConfigurationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ConfigurationPackage.eINSTANCE;
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
	protected ConfigurationSwitch<Adapter> modelSwitch = new ConfigurationSwitch<Adapter>() {
		@Override
		public Adapter caseA_ComponentToConnector(A_ComponentToConnector object) {
			return createA_ComponentToConnectorAdapter();
		}

		@Override
		public Adapter caseBinding(Binding object) {
			return createBindingAdapter();
		}

		@Override
		public Adapter caseBindingProvided(BindingProvided object) {
			return createBindingProvidedAdapter();
		}

		@Override
		public Adapter caseBindingRequired(BindingRequired object) {
			return createBindingRequiredAdapter();
		}

		@Override
		public Adapter caseAttachment(Attachment object) {
			return createAttachmentAdapter();
		}

		@Override
		public Adapter caseLien(Lien object) {
			return createLienAdapter();
		}

		@Override
		public Adapter casePConf_Provided(PConf_Provided object) {
			return createPConf_ProvidedAdapter();
		}

		@Override
		public Adapter caseA_ConnectorToComponent(A_ConnectorToComponent object) {
			return createA_ConnectorToComponentAdapter();
		}

		@Override
		public Adapter caseConfiguration(Configuration object) {
			return createConfigurationAdapter();
		}

		@Override
		public Adapter casePConf_Required(PConf_Required object) {
			return createPConf_RequiredAdapter();
		}

		@Override
		public Adapter casePortConfiguration(PortConfiguration object) {
			return createPortConfigurationAdapter();
		}

		@Override
		public Adapter caseInterfaceConfiguration(InterfaceConfiguration object) {
			return createInterfaceConfigurationAdapter();
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
	 * Creates a new adapter for an object of class '{@link cCS.Configuration.A_ComponentToConnector <em>AComponent To Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.Configuration.A_ComponentToConnector
	 * @generated
	 */
	public Adapter createA_ComponentToConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.Configuration.Binding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.Configuration.Binding
	 * @generated
	 */
	public Adapter createBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.Configuration.BindingProvided <em>Binding Provided</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.Configuration.BindingProvided
	 * @generated
	 */
	public Adapter createBindingProvidedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.Configuration.BindingRequired <em>Binding Required</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.Configuration.BindingRequired
	 * @generated
	 */
	public Adapter createBindingRequiredAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.Configuration.Attachment <em>Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.Configuration.Attachment
	 * @generated
	 */
	public Adapter createAttachmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.Configuration.Lien <em>Lien</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.Configuration.Lien
	 * @generated
	 */
	public Adapter createLienAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.Configuration.PConf_Provided <em>PConf Provided</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.Configuration.PConf_Provided
	 * @generated
	 */
	public Adapter createPConf_ProvidedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.Configuration.A_ConnectorToComponent <em>AConnector To Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.Configuration.A_ConnectorToComponent
	 * @generated
	 */
	public Adapter createA_ConnectorToComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.Configuration.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.Configuration.Configuration
	 * @generated
	 */
	public Adapter createConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.Configuration.PConf_Required <em>PConf Required</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.Configuration.PConf_Required
	 * @generated
	 */
	public Adapter createPConf_RequiredAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.Configuration.PortConfiguration <em>Port Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.Configuration.PortConfiguration
	 * @generated
	 */
	public Adapter createPortConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cCS.Configuration.InterfaceConfiguration <em>Interface Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cCS.Configuration.InterfaceConfiguration
	 * @generated
	 */
	public Adapter createInterfaceConfigurationAdapter() {
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

} //ConfigurationAdapterFactory
