package com.emcef.model.Machines;

import com.emcef.model.Certificats_enregistres;
import com.emcef.model.Fabricant.Fabriquant_approuvees;
import java.util.Vector;

public class Models_machines {
	private int _id;
	private String _nom;
	public Fabriquant_approuvees _id_fabriquant_approuvees;
	public Types_machines _id_type_machine;
	public Vector<Certificats_enregistres> _certificats_enregistres = new Vector<Certificats_enregistres>();
	public Vector<Machines_enregistrees> _machines_enregistrees = new Vector<Machines_enregistrees>();
}