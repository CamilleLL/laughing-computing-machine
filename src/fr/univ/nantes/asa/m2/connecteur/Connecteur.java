/**
 * 
 */
package fr.univ.nantes.asa.m2.connecteur;

import java.util.Collection;

import fr.univ.nantes.asa.m2.IArchitecturalElement;

/**
 * @author francois
 *
 */
public abstract class Connecteur implements IArchitecturalElement{


	Collection<InterfaceConnecteur> interfaces;
	Collection<Glue> glues;
}
