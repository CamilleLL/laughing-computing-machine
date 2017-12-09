/**
 * 
 */
package fr.univ.nantes.asa.m1.clientserveur;

import java.util.ArrayList;

import fr.univ.nantes.asa.m1.clientserveur.composant.ComposantClient;
import fr.univ.nantes.asa.m1.clientserveur.composant.ComposantServeur;
import fr.univ.nantes.asa.m1.clientserveur.connecteur.RPC;
import fr.univ.nantes.asa.m2.composant.Composant;
import fr.univ.nantes.asa.m2.configuration.Configuration;

/**
 * @author francois
 *
 */
public class System extends Configuration{

	ComposantClient client = new ComposantClient();
	ComposantServeur serveur = new ComposantServeur();
	RPC rpc = new RPC();
	
	public System() {
		this.composants = new ArrayList<Composant>();
		this.composants.add(client);
		this.composants.add(serveur);
	}
}
