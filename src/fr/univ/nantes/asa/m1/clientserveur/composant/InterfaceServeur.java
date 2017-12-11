package fr.univ.nantes.asa.m1.clientserveur.composant;

import fr.univ.nantes.asa.m2.composant.Composant;
import fr.univ.nantes.asa.m2.composant.InterfaceComposant;
import fr.univ.nantes.asa.m2.composant.PortComposantFournis;
import fr.univ.nantes.asa.m2.composant.PortComposantRequis;

public class InterfaceServeur  extends InterfaceComposant{

	public InterfaceServeur(Composant c,PortComposantRequis p1,PortComposantFournis p2) {
		super(c,p1,p2);
	}

}
