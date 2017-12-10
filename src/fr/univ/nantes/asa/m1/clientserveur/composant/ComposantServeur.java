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
public class ComposantServeur extends Composant{

	public ComposantServeur() {
		this.interfaces = new ArrayList<InterfaceComposant>();
		this.interfaces.add(new InterfaceServeur(this,new PortComposantRequis(), new PortComposantFournis()));
	}
	
	public PortComposantRequis getPortRequis() {
		return this.interfaces.get(0).portRequis.get(0);
	}

	public PortComposantFournis getPortFournis() {
		return this.interfaces.get(0).portFournis.get(0);
	}
}
