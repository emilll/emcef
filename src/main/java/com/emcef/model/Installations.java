package com.emcef.model;

import com.emcef.model.Centres.Secteurs;
import com.emcef.model.Contribuable.Contribuables;
import com.emcef.model.Machines.Machines_installees;
import com.emcef.model.Machines.Types_machines;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Vector;

public class Installations {
	private int _id;
	private Date _date_heure;
	private String _uid;
	private String _nom_commercial;
	private String _ville;
	private String _adresse;
	private String _adresse1;
	private String _adresse2;
	private String _adresse3;
	private String _adresse4;
	private String _zip;
	private String _description_location;
	private String _contact_personnel;
	private String _telephone;
	private String _email;
	private String _operateur;
	private String _operateur_machine_identifiant;
	private Date _valide_de;
	private Date _valide_au;
	private String _comment;
	private BigDecimal _latitude;
	private BigDecimal _longitude;
	public Contribuables _id_contribuable;
	public Types_machines _id_type_machine;
	public Secteurs _id_secteur;
	public Vector<Machines_installees> _machines_installees = new Vector<Machines_installees>();
	public Vector<Class> _classes = new Vector<Class>();
}