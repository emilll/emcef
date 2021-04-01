package com.emcef.model.Machines;

import java.math.BigDecimal;
import java.util.Date;

public class Commandes_machines {
	private int _id;
	private Date _date_heure;
	private Date _date_creation;
	private String _createur;
	private int _status;
	private boolean _active;
	private Date _dete_envoi;
	private Integer _envoi_via_doc;
	private Integer _veille;
	private Integer _periode;
	private Integer _attente;
	private Integer _paquet;
	private Integer _fdoc;
	private Integer _bloquer;
	private String _nom;
	private String _rccm;
	private String _adresse1;
	private String _adresse2;
	private String _adresse3;
	private String _contact1;
	private String _contact2;
	private String _contact3;
	private String _entete;
	private String _pieds;
	private String _numero_sim;
	private String _apn;
	private String _utilisateur_apn;
	private String _mot_de_passe_apn;
	private Date _date_taux;
	private BigDecimal _taux_taxa;
	private BigDecimal _taux_taxb;
	private BigDecimal _taux_taxc;
	private BigDecimal _taux_taxd;
	private BigDecimal _taux_taxe;
	private BigDecimal _taux_taxf;
	private BigDecimal _taux_aiba;
	private BigDecimal _taux_aibb;
	private String _version;
	private String _fichier_mise_a_jour;
	public Machines_enregistrees _id_machine_enregistree;
}