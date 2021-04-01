package com.emcef.model.Machines;

import java.util.Vector;

public class Etat_machine {
	private int _id;
	private String _nom;
	private String _description;
	private boolean _afficher_dans_rapport;
	private boolean _compte_total;
	private boolean _afficher_dans_machine;
	private boolean _afficher_dans_machine_installer;
	private Boolean _afficher_dans_installation;
	public Vector<Historique_etat_machine> _historique_etat_machine = new Vector<Historique_etat_machine>();
	public Vector<Machines_enregistrees> _machines_enregistrees = new Vector<Machines_enregistrees>();
}