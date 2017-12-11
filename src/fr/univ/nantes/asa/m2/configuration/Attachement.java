/**
 * 
 */
package fr.univ.nantes.asa.m2.configuration;

import fr.univ.nantes.asa.m2.composant.PortComposant;
import fr.univ.nantes.asa.m2.connecteur.Role;

/**
 * @author francois
 *
 */
public class Attachement extends Lien{

	PortComposant p;
	Role r;
	
	public Attachement(PortComposant p,Role r) {
		this.p = p;
		this.r = r;
	}
}
