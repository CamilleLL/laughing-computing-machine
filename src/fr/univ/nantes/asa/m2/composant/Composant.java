/**
 * 
 */
package fr.univ.nantes.asa.m2.composant;

import java.util.Collection;
import fr.univ.nantes.asa.m2.IArchitecturalElement;

/**
 * @author francois
 *
 */
public abstract class Composant implements IArchitecturalElement{
	
	Collection<Propriete> proprietes;
	Collection<InterfaceComposant> interfaces;
	Collection<Contrainte> contraintes;
	
	/**
	 * @param proprietes
	 * @param interfaces
	 * @param contraintes
	 */
	public Composant() {
		super();
	}

	
}
