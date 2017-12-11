/**
 * 
 */
package fr.univ.nantes.asa.m1.clientserveur.connecteur;

import java.util.ArrayList;

import fr.univ.nantes.asa.m2.connecteur.*;

/**
 * @author francois
 *
 */
public class RPC extends Connecteur{

	public RPC() {
		this.interfaces = new ArrayList<InterfaceConnecteur>();
		
		InterfaceConnecteur iclient = new InterfaceConnecteur(this,new RoleRequis("CalledClient"),new RoleFournis("CallClient"));
		InterfaceConnecteur iserveur = new InterfaceConnecteur(this,new RoleRequis("CalledServer"),new RoleFournis("CallServer"));
		
		this.interfaces.add(iserveur);
		this.interfaces.add(iclient);
		
		Glue cglue = new Glue(iclient.rolesRequis,iclient.roleFournis);
		Glue sglue = new Glue(iserveur.rolesRequis,iserveur.roleFournis);
		
		this.glues = new ArrayList<Glue>();
		this.glues.add(sglue);
		this.glues.add(cglue);
		
	}
	
	public InterfaceConnecteur getInterfaceServeur() {
		return this.interfaces.get(0);
	}
	
	public InterfaceConnecteur getInterfaceClient() {
		return this.interfaces.get(1);
	}
}
