package com.emcef.model.Fabricant;

import com.emcef.model.Machines.Machines_enregistrees;
import com.emcef.model.Machines.Models_machines;
import java.util.Vector;

public class Fabriquant_approuvees {
	private int _id;
	private String _nom;
	private String _pays;
	private String _adresse;
	private String _contact_tel;
	private String _contact_email;
	public Vector<Machines_enregistrees> _machines_enregistrees = new Vector<Machines_enregistrees>();
	public Vector<Models_machines> _models_machines = new Vector<Models_machines>();
}