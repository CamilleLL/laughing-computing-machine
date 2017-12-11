/**
 * 
 */
package fr.univ.nantes.asa.m1.serveurdetail.composant;

import fr.univ.nantes.asa.m2.composant.Composant;
import fr.univ.nantes.asa.m2.composant.InterfaceComposant;
import fr.univ.nantes.asa.m2.composant.PortComposantFournis;
import fr.univ.nantes.asa.m2.composant.PortComposantRequis;

/**
 * @author francois
 *
 */
public class IDatabase extends InterfaceComposant {

	public IDatabase(Composant c) {
		super(c);
		//port vers Security
		this.portFournis.add(new PortComposantFournis());
		this.portRequis.add(new PortComposantRequis());
		//port vers Connexion
		this.portFournis.add(new PortComposantFournis());
		this.portRequis.add(new PortComposantRequis());
	}
	
	public PortComposantRequis getPortRequisPourSec() {
		return this.portRequis.get(0);
	}
	
	public PortComposantFournis getPortFournisPourSec() {
		return this.portFournis.get(0);
	}
	
	public PortComposantRequis getPortRequisPourCx() {
		return this.portRequis.get(1);
	}
	
	public PortComposantFournis getPortFournisPourCx() {
		return this.portFournis.get(1);
	}

}
