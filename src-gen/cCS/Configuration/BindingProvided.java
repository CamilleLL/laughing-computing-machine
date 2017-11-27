/**
 */
package cCS.Configuration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding Provided</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cCS.Configuration.BindingProvided#getPconf_provided <em>Pconf provided</em>}</li>
 * </ul>
 *
 * @see cCS.Configuration.ConfigurationPackage#getBindingProvided()
 * @model
 * @generated
 */
public interface BindingProvided extends Binding {
	/**
	 * Returns the value of the '<em><b>Pconf provided</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pconf provided</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pconf provided</em>' reference.
	 * @see #setPconf_provided(PConf_Provided)
	 * @see cCS.Configuration.ConfigurationPackage#getBindingProvided_Pconf_provided()
	 * @model
	 * @generated
	 */
	PConf_Provided getPconf_provided();

	/**
	 * Sets the value of the '{@link cCS.Configuration.BindingProvided#getPconf_provided <em>Pconf provided</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pconf provided</em>' reference.
	 * @see #getPconf_provided()
	 * @generated
	 */
	void setPconf_provided(PConf_Provided value);

} // BindingProvided
