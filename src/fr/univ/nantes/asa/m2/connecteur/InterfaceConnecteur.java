/**
 * 
 */
package fr.univ.nantes.asa.m2.connecteur;

import java.util.Collection;

/**
 * @author francois
 *
 */
public abstract class InterfaceConnecteur {
	Connecteur connecteur;
	
	Collection<RoleRequis> rolesRequis;
	Collection<RoleFournis> roleFournis;

}
