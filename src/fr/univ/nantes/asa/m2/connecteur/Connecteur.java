/**
 * 
 */
package fr.univ.nantes.asa.m2.connecteur;

import java.util.List;

import fr.univ.nantes.asa.m2.IArchitecturalElement;

/**
 * @author francois
 *
 */
public abstract class Connecteur implements IArchitecturalElement{


	protected List<InterfaceConnecteur> interfaces;
	protected List<Glue> glues;
}
