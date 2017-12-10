/**
 * 
 */
package fr.univ.nantes.asa.m2.composant;

/**
 * @author francois
 *
 */
public class PortComposantRequis extends PortComposant {

	public PortComposantRequis() {
		super();
	}

	@Override
	public void envoyer(Object o) {
		System.out.println("Erreur : Envoi impossible le port Requis");
	}

	@Override
	public void recevoir(Object o) {
		System.out.println();
		this.iComposant.recevoir(o);
		
	}

}
