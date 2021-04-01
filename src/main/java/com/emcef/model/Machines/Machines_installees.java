package com.emcef.model.Machines;

import com.emcef.model.Installations;
import java.util.Date;

public class Machines_installees {
	private int _id;
	private Date _date_heure;
	private String _nom_proprietaire;
	private String _id_sim;
	private String _numero_sim;
	private Date _date_enregistement;
	private Date _date_acivation;
	private String _operateur;
	private String _ident_machine_operateur;
	private Integer _id_profile_personalisation;
	private Date _date_debut;
	private Date _date_fin;
	private Date _dernier_rapport;
	private Character _status_dernier_rapport;
	private String _dernier_rapport_doc;
	public Machines_enregistrees _id_machine_enregistree;
	public Installations _id_installation;
	public Types_machines _id_type_machine;
}