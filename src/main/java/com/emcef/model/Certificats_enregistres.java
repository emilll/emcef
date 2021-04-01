package com.emcef.model;

import com.emcef.model.Contribuable.Contribuables;
import com.emcef.model.Machines.Machines_enregistrees;
import com.emcef.model.Machines.Models_machines;
import java.util.Date;
import java.util.Vector;

public class Certificats_enregistres {
	private int _id;
	private String _id_certificat;
	private String _version_logiciel;
	private String _materiel_maj;
	private Date _date_emission;
	private String _description_emission;
	private String _description_revocation;
	private Date _date_revocation;
	public Models_machines _id_model_machine;
	public Contribuables _id_contribuable;
	public Vector<Machines_enregistrees> _machines_enregistrees = new Vector<Machines_enregistrees>();
}