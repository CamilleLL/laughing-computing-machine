/**
 * 
 */
package fr.univ.nantes.asa.m1.serveurdetail;

import java.util.ArrayList;
import fr.univ.nantes.asa.m1.serveurdetail.composant.SecurityManager;
import fr.univ.nantes.asa.m1.serveurdetail.composant.ConnexionManager;
import fr.univ.nantes.asa.m1.serveurdetail.composant.Database;
import fr.univ.nantes.asa.m1.serveurdetail.connecteur.ConnecteurConnexionDatabase;
import fr.univ.nantes.asa.m1.serveurdetail.connecteur.ConnecteurConnexionSecurity;
import fr.univ.nantes.asa.m1.serveurdetail.connecteur.ConnecteurSecurityDatabase;
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
public class ServeurDetail extends Configuration {
	//Déclaration des composants
	ConnexionManager cm = new ConnexionManager();
	SecurityManager sm = new SecurityManager();
	Database db = new Database();
	
	//Déclaration des connecteurs
	ConnecteurConnexionDatabase conCxDb = new ConnecteurConnexionDatabase();
	ConnecteurConnexionSecurity conCxSec = new ConnecteurConnexionSecurity();
	ConnecteurSecurityDatabase conSecDb = new ConnecteurSecurityDatabase();
	
	public ServeurDetail() {
		this.composants = new ArrayList<Composant>();
		this.connecteurs = new ArrayList<Connecteur>();
		
		this.composants.add(cm);
		this.composants.add(db);
		this.composants.add(sm);
		
		this.connecteurs.add(conCxSec);
		this.connecteurs.add(conSecDb);
		this.connecteurs.add(conCxDb);
		
		//connexion vers db
		//port fournis connexion vers role requis connexion
		PortComposantFournis portCoDbF = cm.getInterface().getPortFournisPourDB();
		RoleRequis roleCoR =  conCxDb.getInterfaceConnexion().rolesRequis;
		this.attachements.add(new Attachement(portCoDbF,roleCoR));
		//role fournis connexion vers port requis db
		PortComposantRequis portDbCoR = db.getInterface().getPortRequisPourCx();
		RoleFournis roleCoF = conCxDb.getInterfaceConnexion().roleFournis;
		this.attachements.add(new Attachement(portDbCoR,roleCoF));
		
		//connexion vers sec
		//port fournis connexion vers role requis connexion
		PortComposantFournis portCoSecF = cm.getInterface().getPortFournisPourSec();
		RoleRequis roleCoSecR =  conCxSec.getInterfaceConnexion().rolesRequis;
		this.attachements.add(new Attachement(portCoSecF,roleCoSecR));
		//role fournis connexion vers port requis security
		PortComposantRequis portSecCoR = sm.getInterface().getPortRequisPourCx();
		RoleFournis roleCoSecF = conCxSec.getInterfaceConnexion().roleFournis;
		this.attachements.add(new Attachement(portSecCoR,roleCoSecF));
		
		
		//sec vers db
		//port fournis security vers role requis security
		PortComposantFournis portSecDbF = sm.getInterface().getPortFournisPourDB();
		RoleRequis roleSecDbR =  conSecDb.getInterfaceSecurity().rolesRequis;
		this.attachements.add(new Attachement(portSecDbF,roleSecDbR));
		//role fournis security vers port requis db
		PortComposantRequis portDbSecR = db.getInterface().getPortRequisPourSec();
		RoleFournis roleSecDbF = conSecDb.getInterfaceSecurity().roleFournis;
		this.attachements.add(new Attachement(portDbSecR,roleSecDbF));
		
		//sec vers connexion
		//port fournis security vers role requis security
		PortComposantFournis portSecCoF = sm.getInterface().getPortFournisPourCx();
		RoleRequis roleSecCoR =  conCxSec.getInterfaceSecurity().rolesRequis;
		this.attachements.add(new Attachement(portSecCoF,roleSecCoR));
		//role fournis security vers port requis connexion
		PortComposantRequis portCoSecR = cm.getInterface().getPortRequisPourSec();
		RoleFournis roleSeCoF = conCxSec.getInterfaceSecurity().roleFournis;
		this.attachements.add(new Attachement(portCoSecR,roleSeCoF));
		
		//db vers sec
		//port fournis db vers role requis db
		PortComposantFournis portDbSecF = db.getInterface().getPortFournisPourSec();
		RoleRequis roleDbSecR =  conSecDb.getInterfaceDatabase().rolesRequis;
		this.attachements.add(new Attachement(portDbSecF,roleDbSecR));
		//role fournis db vers port requis sec
		PortComposantRequis portSecDbR = sm.getInterface().getPortRequisPourDB();
		RoleFournis roleDbSecF = conSecDb.getInterfaceDatabase().roleFournis;
		this.attachements.add(new Attachement(portSecDbR,roleDbSecF));
		
		//db vers connexion
	}
}
