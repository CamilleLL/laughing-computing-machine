/**
 * 
 */
package fr.univ.nantes.asa.m2.composant;


import java.util.List;

import fr.univ.nantes.asa.m2.IArchitecturalElement;
import fr.univ.nantes.asa.m2.configuration.Configuration;

/**
 * @author francois
 *
 */
public abstract class Composant implements IArchitecturalElement{
	
	protected Configuration configuration;
	protected List<Propriete> proprietes;
	protected List<InterfaceComposant> interfaces;
	protected List<Contrainte> contraintes;
	
	/**
	 * @param proprietes
	 * @param interfaces
	 * @param contraintes
	 */
	public Composant() {
		super();
	}

	public void setConfiguration(Configuration c) {
		configuration = c;
	}
	
}
