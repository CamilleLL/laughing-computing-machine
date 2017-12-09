/**
 * 
 */
package fr.univ.nantes.asa.m2.composant;

import java.util.Collection;

/**
 * @author francois
 *
 */
public abstract class InterfaceComposant {
	
	Composant composant;
	
	Collection<PortComposantRequis> portsRequis;
	Collection<PortComposantFournis> portsFournis;
	Collection<ServiceComposantRequis> servicesRequis;
	Collection<ServiceComposantFournis> servicesFournis;
	
	/**
	 * @param composant
	 * @param portsRequis
	 * @param portsFournis
	 * @param servicesRequis
	 * @param servicesFournis
	 */
	public InterfaceComposant(Composant composant, Collection<PortComposantRequis> portsRequis,
			Collection<PortComposantFournis> portsFournis, Collection<ServiceComposantRequis> servicesRequis,
			Collection<ServiceComposantFournis> servicesFournis) {
		super();
		this.composant = composant;
		this.portsRequis = portsRequis;
		this.portsFournis = portsFournis;
		this.servicesRequis = servicesRequis;
		this.servicesFournis = servicesFournis;
	}
	
	
}
