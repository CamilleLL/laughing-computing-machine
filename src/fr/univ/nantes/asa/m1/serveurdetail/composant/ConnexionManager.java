/**
 * 
 */
package fr.univ.nantes.asa.m1.serveurdetail.composant;

import java.util.ArrayList;

import fr.univ.nantes.asa.m2.composant.Composant;
import fr.univ.nantes.asa.m2.composant.InterfaceComposant;
import fr.univ.nantes.asa.m2.composant.PortComposantFournis;
import fr.univ.nantes.asa.m2.composant.PortComposantRequis;

/**
 * @author francois
 *
 */
public class ConnexionManager extends Composant {
	public ConnexionManager() {
		this.interfaces = new ArrayList<InterfaceComposant>();
		this.interfaces.add(new IConnexionManager(this));
	}
	
	public IConnexionManager getInterface() {
		return (IConnexionManager)this.interfaces.get(0);
	}

}
