/**
 * 
 */
package fr.univ.nantes.asa.m2.composant;

import java.util.ArrayList;
import java.util.List;

/**
 * @author francois
 *
 */
public abstract class InterfaceComposant {
	
	Composant composant;
	
	public List<PortComposantRequis> portRequis = new ArrayList<PortComposantRequis>();
	public List<PortComposantFournis> portFournis = new ArrayList<PortComposantFournis>();
	public ServiceComposantRequis serviceRequis;
	public ServiceComposantFournis serviceFournis;

	public InterfaceComposant(Composant c,PortComposantRequis p1,PortComposantFournis p2) {
		super();
		portRequis.add(p1);
		portFournis.add(p2);
		composant = c;
	}
	
	public InterfaceComposant(Composant c) {
		super();
		composant = c;
	}
	
	
	public void recevoir(Object o){
		if(this.composant!=null)
			this.composant.recevoir(o);
	}
	
	public void envoyer(Object o){
		if(this.composant!=null)
			this.composant.envoyer(o);
	}
	
}
