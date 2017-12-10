/**
 * 
 */
package fr.univ.nantes.asa.m1.serveurdetail.connecteur;

import java.util.ArrayList;

import fr.univ.nantes.asa.m2.connecteur.Connecteur;
import fr.univ.nantes.asa.m2.connecteur.Glue;
import fr.univ.nantes.asa.m2.connecteur.InterfaceConnecteur;
import fr.univ.nantes.asa.m2.connecteur.RoleFournis;
import fr.univ.nantes.asa.m2.connecteur.RoleRequis;

/**
 * @author francois
 *
 */
public class ConnecteurConnexionDatabase extends Connecteur {

	public ConnecteurConnexionDatabase() {
		this.interfaces = new ArrayList<InterfaceConnecteur>();
		
		InterfaceConnecteur idatabase = new InterfaceConnecteur(this,new RoleRequis("CalledDB"),new RoleFournis("CallDB"));
		InterfaceConnecteur iconnexion = new InterfaceConnecteur(this,new RoleRequis("CalledCo"),new RoleFournis("CallCo"));
		
		this.interfaces.add(iconnexion);
		this.interfaces.add(idatabase);
		
		Glue cglue = new Glue(idatabase.rolesRequis,idatabase.roleFournis);
		Glue sglue = new Glue(iconnexion.rolesRequis,iconnexion.roleFournis);
		
		this.glues = new ArrayList<Glue>();
		this.glues.add(sglue);
		this.glues.add(cglue);
		
	}
	
	public InterfaceConnecteur getInterfaceDatabase() {
		return this.interfaces.get(0);
	}
	
	public InterfaceConnecteur getInterfaceConnexion() {
		return this.interfaces.get(1);
	}
}
