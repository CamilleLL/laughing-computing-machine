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
public class ConnecteurConnexionSecurity extends Connecteur{
	
	public ConnecteurConnexionSecurity() {
		this.interfaces = new ArrayList<InterfaceConnecteur>();
		
		InterfaceConnecteur isecurity = new InterfaceConnecteur(this,new RoleRequis("CalledSec"),new RoleFournis("CallSec"));
		InterfaceConnecteur iconnexion = new InterfaceConnecteur(this,new RoleRequis("CalledCo"),new RoleFournis("CallCo"));
		
		this.interfaces.add(iconnexion);
		this.interfaces.add(isecurity);
		
		Glue cglue = new Glue(isecurity.rolesRequis,isecurity.roleFournis);
		Glue sglue = new Glue(iconnexion.rolesRequis,iconnexion.roleFournis);
		
		this.glues = new ArrayList<Glue>();
		this.glues.add(sglue);
		this.glues.add(cglue);
		
	}
	
	public InterfaceConnecteur getInterfaceConnexion() {
		return this.interfaces.get(0);
	}
	
	public InterfaceConnecteur getInterfaceSecurity() {
		return this.interfaces.get(1);
	}

}
