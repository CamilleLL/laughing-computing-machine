/**
 * 
 */
package fr.univ.nantes.asa.m2.configuration;

import java.util.Collection;
import java.util.List;

import fr.univ.nantes.asa.m2.IArchitecturalElement;
import fr.univ.nantes.asa.m2.composant.Composant;
import fr.univ.nantes.asa.m2.connecteur.Connecteur;

/**
 * @author francois
 *
 */
public abstract class Configuration implements IArchitecturalElement{
	
	protected Collection<Composant> composants;
	protected Collection<Connecteur> connecteurs;
	protected List<Attachement> attachements;
	protected List<Binding> bindings;
	protected Collection<InterfaceConfiguration> interfaces;
	
	public void envoyer(Object o) {
		//TODO stuff with glue
	}
	
	public void recevoir(Object o) {
		//TODO stuff with glue
	}
}
