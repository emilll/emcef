package com.emcef.model.Rapport;

import com.emcef.model.Journal.Journal_tentative_activation;
import com.emcef.model.Machines.Machines_enregistrees;
import java.util.Date;


public class Rapport_etat_technique {
	private int _id;
	private Date _bd_date_heure;
	private Date _date_heure_audit;
	private String _ifu;
	private Date _dernier_audit_local;
	private Date _dernier_audit_distance;
	private String _version_logiciel;
	private String _revision_materiel;
	private String _id_tache;
	private String _commande;
	private String _mod;
	private String _imsi;
	private String _rtype;
	private String _fdrid;
	private String _fdin;
	private String _fmin;
	private String _bat;
	private String _dbv;
	private String _upd;
	private Integer _zenvoi;
	private Integer _zsauvegarder;
	private Integer _rcnt;
	private String _svcend;
	private String _ttc;
	private String _drc;
	private String _crc;
	private String _irc;
	private String _id_doc;
	public Machines_enregistrees _id_machine_enregistree;
	public Journal_tentative_activation _journal_tentative_activation;
}