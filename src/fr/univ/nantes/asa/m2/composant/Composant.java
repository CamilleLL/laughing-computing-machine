/**
 * 
 */
package fr.univ.nantes.asa.m2.composant;


import java.util.List;

import fr.univ.nantes.asa.m2.IArchitecturalElement;

/**
 * @author francois
 *
 */
public abstract class Composant implements IArchitecturalElement{
	
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

	
}
