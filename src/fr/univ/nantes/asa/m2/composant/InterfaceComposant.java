/**
 * 
 */
package fr.univ.nantes.asa.m2.composant;


/**
 * @author francois
 *
 */
public abstract class InterfaceComposant {
	
	Composant composant;
	
	public PortComposantRequis portRequis;
	public PortComposantFournis portFournis;
	public ServiceComposantRequis serviceRequis;
	public ServiceComposantFournis serviceFournis;

	public InterfaceComposant(Composant c,PortComposantRequis p1,PortComposantFournis p2) {
		super();
		portRequis = p1;
		portFournis = p2;
		composant = c;
	}
	
	
}
