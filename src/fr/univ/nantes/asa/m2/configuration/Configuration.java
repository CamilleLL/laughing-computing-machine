/**
 * 
 */
package fr.univ.nantes.asa.m2.configuration;

import java.util.Collection;

import fr.univ.nantes.asa.m2.IArchitecturalElement;
import fr.univ.nantes.asa.m2.composant.Composant;
import fr.univ.nantes.asa.m2.connecteur.Connecteur;

/**
 * @author francois
 *
 */
public abstract class Configuration implements IArchitecturalElement{
	
	Collection<Composant> composants;
	Collection<Connecteur> connecteurs;
	Collection<Attachement> attachements;
	Collection<Binding> bindings;
	Collection<InterfaceConfiguration> interfaces;
}
