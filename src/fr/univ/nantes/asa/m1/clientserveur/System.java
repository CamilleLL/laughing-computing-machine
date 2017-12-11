/**
 * 
 */
package fr.univ.nantes.asa.m1.clientserveur;

import java.util.ArrayList;

import fr.univ.nantes.asa.m1.clientserveur.composant.ComposantClient;
import fr.univ.nantes.asa.m1.clientserveur.composant.ComposantServeur;
import fr.univ.nantes.asa.m1.clientserveur.connecteur.RPC;
import fr.univ.nantes.asa.m2.composant.Composant;
import fr.univ.nantes.asa.m2.composant.PortComposantFournis;
import fr.univ.nantes.asa.m2.composant.PortComposantRequis;
import fr.univ.nantes.asa.m2.configuration.Attachement;
import fr.univ.nantes.asa.m2.configuration.Configuration;
import fr.univ.nantes.asa.m2.connecteur.Connecteur;
import fr.univ.nantes.asa.m2.connecteur.RoleFournis;
import fr.univ.nantes.asa.m2.connecteur.RoleRequis;

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
		this.connecteurs = new ArrayList<Connecteur>();
		//le serveur fait un appel
		// étape 1 : serveur.portFournis -> rpc.serveur.roleRequis
		// étape 2 : rpc.serveur.roleFournis -> client.portRequis 
		PortComposantFournis portServeurF =  serveur.getPortFournis();
		RoleRequis roleServeurR =  rpc.getInterfaceServeur().rolesRequis;
		this.attachements.add(new Attachement(portServeurF,roleServeurR));
		
		PortComposantRequis portClientR1 = client.getPortRequis();
		RoleFournis roleServeurF1 = rpc.getInterfaceServeur().roleFournis;
		this.attachements.add(new Attachement(portClientR1,roleServeurF1));
		//-------------------------------------------------
		
		//le client fait un appel
		//étape 1 : client.portFournis -> rpc.client.roleRequis
		//étape 2 : rpc.client.roleFournis -> serveur.portRequis
		PortComposantFournis portClientF = client.getPortFournis();
		RoleRequis roleClientR = rpc.getInterfaceClient().rolesRequis;
		this.attachements.add(new Attachement(portClientF,roleClientR));
		
		PortComposantRequis portServeurR =  serveur.getPortRequis();
		RoleFournis roleClientF =  rpc.getInterfaceClient().roleFournis;
		this.attachements.add(new Attachement(portServeurR,roleClientF));
		
		this.composants.add(client);
		this.composants.add(serveur);
		this.connecteurs.add(rpc);
		client.setConfiguration(this);
		serveur.setConfiguration(this);
	}
}
