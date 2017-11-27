/**
 */
package cCS.Configuration;

import cCS.Component.PComp_Provided;

import cCS.Connector.RoleRequired;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AComponent To Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cCS.Configuration.A_ComponentToConnector#getPcomp_provided <em>Pcomp provided</em>}</li>
 *   <li>{@link cCS.Configuration.A_ComponentToConnector#getRolerequired <em>Rolerequired</em>}</li>
 * </ul>
 *
 * @see cCS.Configuration.ConfigurationPackage#getA_ComponentToConnector()
 * @model
 * @generated
 */
public interface A_ComponentToConnector extends Attachment {
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
	 * @see cCS.Configuration.ConfigurationPackage#getA_ComponentToConnector_Pcomp_provided()
	 * @model
	 * @generated
	 */
	PComp_Provided getPcomp_provided();

	/**
	 * Sets the value of the '{@link cCS.Configuration.A_ComponentToConnector#getPcomp_provided <em>Pcomp provided</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pcomp provided</em>' reference.
	 * @see #getPcomp_provided()
	 * @generated
	 */
	void setPcomp_provided(PComp_Provided value);

	/**
	 * Returns the value of the '<em><b>Rolerequired</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rolerequired</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rolerequired</em>' reference.
	 * @see #setRolerequired(RoleRequired)
	 * @see cCS.Configuration.ConfigurationPackage#getA_ComponentToConnector_Rolerequired()
	 * @model
	 * @generated
	 */
	RoleRequired getRolerequired();

	/**
	 * Sets the value of the '{@link cCS.Configuration.A_ComponentToConnector#getRolerequired <em>Rolerequired</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rolerequired</em>' reference.
	 * @see #getRolerequired()
	 * @generated
	 */
	void setRolerequired(RoleRequired value);

} // A_ComponentToConnector
