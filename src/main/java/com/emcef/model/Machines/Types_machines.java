package com.emcef.model.Machines;

import com.emcef.model.Installations;
import java.util.Vector;

public class Types_machines {
	private int _id;
	private String _identifiant_type;
	private String _nom;
	private String _description;
	public Vector<Installations> _installations = new Vector<Installations>();
	public Vector<Machines_installees> _machines_installees = new Vector<Machines_installees>();
	public Vector<Models_machines> _models_machines = new Vector<Models_machines>();
}