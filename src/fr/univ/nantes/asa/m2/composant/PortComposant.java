/**
 * 
 */
package fr.univ.nantes.asa.m2.composant;

/**
 * @author francois
 *
 */
public abstract class PortComposant {
	InterfaceComposant iComposant;
	
	public PortComposant() {
	}
	
	public void setInterface(InterfaceComposant c) {
		iComposant = c;		
	}
	
	public abstract void envoyer(Object o);
	
	public abstract void recevoir(Object o);

}
