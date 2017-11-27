/**
 */
package cCS.Configuration;

import cCS.Component.PComp_Provided;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding Required</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cCS.Configuration.BindingRequired#getPcomp_provided <em>Pcomp provided</em>}</li>
 *   <li>{@link cCS.Configuration.BindingRequired#getPconf_required <em>Pconf required</em>}</li>
 * </ul>
 *
 * @see cCS.Configuration.ConfigurationPackage#getBindingRequired()
 * @model
 * @generated
 */
public interface BindingRequired extends Binding {
	/**
	 * Returns the value of the '<em><b>Pcomp provided</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pcomp provided</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pcomp provided</em>' reference.
	 * @see #setPcomp_provided(PComp_Provided)
	 * @see cCS.Configuration.ConfigurationPackage#getBindingRequired_Pcomp_provided()
	 * @model
	 * @generated
	 */
	PComp_Provided getPcomp_provided();

	/**
	 * Sets the value of the '{@link cCS.Configuration.BindingRequired#getPcomp_provided <em>Pcomp provided</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pcomp provided</em>' reference.
	 * @see #getPcomp_provided()
	 * @generated
	 */
	void setPcomp_provided(PComp_Provided value);

	/**
	 * Returns the value of the '<em><b>Pconf required</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pconf required</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pconf required</em>' reference.
	 * @see #setPconf_required(PConf_Required)
	 * @see cCS.Configuration.ConfigurationPackage#getBindingRequired_Pconf_required()
	 * @model
	 * @generated
	 */
	PConf_Required getPconf_required();

	/**
	 * Sets the value of the '{@link cCS.Configuration.BindingRequired#getPconf_required <em>Pconf required</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pconf required</em>' reference.
	 * @see #getPconf_required()
	 * @generated
	 */
	void setPconf_required(PConf_Required value);

} // BindingRequired
