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
	
	protected Collection<Composant> composants;
	protected Collection<Connecteur> connecteurs;
	protected Collection<Attachement> attachements;
	protected Collection<Binding> bindings;
	protected Collection<InterfaceConfiguration> interfaces;
}
