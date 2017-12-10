/**
 * 
 */
package fr.univ.nantes.asa.m1.clientserveur.composant;


import java.util.ArrayList;

import fr.univ.nantes.asa.m2.composant.Composant;
import fr.univ.nantes.asa.m2.composant.InterfaceComposant;
import fr.univ.nantes.asa.m2.composant.PortComposantFournis;
import fr.univ.nantes.asa.m2.composant.PortComposantRequis;

/**
 * @author francois
 *
 */
public class ComposantClient extends Composant{

	public ComposantClient() {
		this.interfaces = new ArrayList<InterfaceComposant>();
		this.interfaces.add(new InterfaceClient(this,new PortComposantRequis(), new PortComposantFournis()));
	}
	
	public PortComposantRequis getPortRequis() {
		return this.interfaces.get(0).portRequis.get(0);
	}

	public PortComposantFournis getPortFournis() {
		return this.interfaces.get(0).portFournis.get(0);
	}

	@Override
	public void envoyer(Object o) {
		PortComposantFournis pf = this.getPortFournis();
		pf.envoyer(o);
		
	}

	@Override
	public void recevoir(Object o) {
		System.out.println(o.toString());
		
	}
}
