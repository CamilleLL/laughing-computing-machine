/**
 * 
 */
package fr.univ.nantes.asa.m2.composant;

/**
 * @author francois
 *
 */
public abstract class Contrainte {
	
	Composant composant;

	/**
	 * @param composant
	 */
	public Contrainte(Composant composant) {
		super();
		this.composant = composant;
	}
	
	
}
