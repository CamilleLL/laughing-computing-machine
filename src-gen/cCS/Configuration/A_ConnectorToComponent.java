/**
 */
package cCS.Configuration;

import cCS.Component.PComp_Required;

import cCS.Connector.RoleProvided;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AConnector To Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cCS.Configuration.A_ConnectorToComponent#getRoleprovided <em>Roleprovided</em>}</li>
 *   <li>{@link cCS.Configuration.A_ConnectorToComponent#getPcomp_required <em>Pcomp required</em>}</li>
 * </ul>
 *
 * @see cCS.Configuration.ConfigurationPackage#getA_ConnectorToComponent()
 * @model
 * @generated
 */
public interface A_ConnectorToComponent extends Attachment {
	/**
	 * Returns the value of the '<em><b>Roleprovided</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roleprovided</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roleprovided</em>' reference.
	 * @see #setRoleprovided(RoleProvided)
	 * @see cCS.Configuration.ConfigurationPackage#getA_ConnectorToComponent_Roleprovided()
	 * @model
	 * @generated
	 */
	RoleProvided getRoleprovided();

	/**
	 * Sets the value of the '{@link cCS.Configuration.A_ConnectorToComponent#getRoleprovided <em>Roleprovided</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roleprovided</em>' reference.
	 * @see #getRoleprovided()
	 * @generated
	 */
	void setRoleprovided(RoleProvided value);

	/**
	 * Returns the value of the '<em><b>Pcomp required</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pcomp required</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pcomp required</em>' reference.
	 * @see #setPcomp_required(PComp_Required)
	 * @see cCS.Configuration.ConfigurationPackage#getA_ConnectorToComponent_Pcomp_required()
	 * @model
	 * @generated
	 */
	PComp_Required getPcomp_required();

	/**
	 * Sets the value of the '{@link cCS.Configuration.A_ConnectorToComponent#getPcomp_required <em>Pcomp required</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pcomp required</em>' reference.
	 * @see #getPcomp_required()
	 * @generated
	 */
	void setPcomp_required(PComp_Required value);

} // A_ConnectorToComponent
