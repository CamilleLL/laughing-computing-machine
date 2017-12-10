/**
 * 
 */
package fr.univ.nantes.asa.m2.composant;

/**
 * @author francois
 *
 */
public class PortComposantFournis extends PortComposant{

	public PortComposantFournis() {
		super();
	}

	public void envoyer(Object o){
		System.out.println();
		this.iComposant.envoyer(o);
	}
	
	public void recevoir(Object o){
		System.out.println("Erreur : Réception impossible sur le port fournis");
}
}
