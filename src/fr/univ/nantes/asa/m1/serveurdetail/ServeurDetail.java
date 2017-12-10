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
import fr.univ.nantes.asa.m2.configuration.Configuration;
import fr.univ.nantes.asa.m2.connecteur.Connecteur;

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
	}
}
