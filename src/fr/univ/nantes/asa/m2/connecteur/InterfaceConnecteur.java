/**
 * 
 */
package fr.univ.nantes.asa.m2.connecteur;

import java.util.Collection;

/**
 * @author francois
 *
 */
public class InterfaceConnecteur {
	protected Connecteur connecteur;	
	public RoleRequis rolesRequis;
	public RoleFournis roleFournis;
	
	/**
	 * @param connecteur
	 * @param rolesRequis
	 * @param roleFournis
	 */
	public InterfaceConnecteur(Connecteur connecteur, RoleRequis rolesRequis, RoleFournis roleFournis) {
		super();
		this.connecteur = connecteur;
		this.rolesRequis = rolesRequis;
		this.roleFournis = roleFournis;
	}
	
	

}
