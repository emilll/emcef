package com.emcef.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "RapportEtatTechnique")
public class RapportEtatTechnique {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@ManyToOne
	Machinesenregistrees machinesenregistrees;

	@Column(name = "bd_date_heure")
	private Date bd_date_heure;

	@Column(name = "date_heure_audit")
	private Date date_heure_audit;

	@Column(name = "ifu")
	private String ifu;

	@Column(name = "dateDernier_audit_local")
	private Date dateDernier_audit_local;

	@Column(name = "dateDernier_audit_distance")
	private Date dateDernier_audit_distance;

	@Column(name = "version_logiciel")
	private String version_logiciel;

	@Column(name = "revision_materiel")
	private String revision_materiel;

	@Column(name = "id_tache")
	private String id_tache;

	@Column(name = "commande")
	private String commande;

	@Column(name = "mod")
	private String mod;

	@Column(name = "imsi")
	private String imsi;

	@Column(name = "rtype")
	private String rtype;

	@Column(name = "fdrid")
	private String fdrid;

	@Column(name = "fdin")
	private String fdin;

	@Column(name = "fmin")
	private String fmin;

	@Column(name = "bat")
	private String bat;

	@Column(name = "dbv")
	private String dbv;

	@Column(name = "upd")
	private String upd;

	@Column(name = "zenvoi")
	private Integer zenvoi;

	@Column(name = "zsauvegarder")
	private Integer zsauvegarder;

	@Column(name = "rcnt")
	private Integer rcnt;

	@Column(name = "svcend")
	private String svcend;

	@Column(name = "ttc")
	private String ttc;

	@Column(name = "drc")
	private String drc;

	@Column(name = "crc")
	private String crc;

	@Column(name = "irc")
	private String irc;

	@Column(name = "id_doc")
	private String id_doc;

	public Machinesenregistrees getMachinesenregistrees() {
		return machinesenregistrees;
	}

	public void setMachinesenregistrees(Machinesenregistrees machinesenregistrees) {
		this.machinesenregistrees = machinesenregistrees;
	}

	public Date getBd_date_heure() {
		return bd_date_heure;
	}

	public void setBd_date_heure(Date bd_date_heure) {
		this.bd_date_heure = bd_date_heure;
	}

	public Date getDate_heure_audit() {
		return date_heure_audit;
	}

	public void setDate_heure_audit(Date date_heure_audit) {
		this.date_heure_audit = date_heure_audit;
	}

	public String getIfu() {
		return ifu;
	}

	public void setIfu(String ifu) {
		this.ifu = ifu;
	}

	public Date getDateDernier_audit_local() {
		return dateDernier_audit_local;
	}

	public void setDateDernier_audit_local(Date dateDernier_audit_local) {
		this.dateDernier_audit_local = dateDernier_audit_local;
	}

	public Date getDateDernier_audit_distance() {
		return dateDernier_audit_distance;
	}

	public void setDateDernier_audit_distance(Date dateDernier_audit_distance) {
		this.dateDernier_audit_distance = dateDernier_audit_distance;
	}

	public String getVersion_logiciel() {
		return version_logiciel;
	}

	public void setVersion_logiciel(String version_logiciel) {
		this.version_logiciel = version_logiciel;
	}

	public String getRevision_materiel() {
		return revision_materiel;
	}

	public void setRevision_materiel(String revision_materiel) {
		this.revision_materiel = revision_materiel;
	}

	public String getId_tache() {
		return id_tache;
	}

	public void setId_tache(String id_tache) {
		this.id_tache = id_tache;
	}

	public String getCommande() {
		return commande;
	}

	public void setCommande(String commande) {
		this.commande = commande;
	}

	public String getMod() {
		return mod;
	}

	public void setMod(String mod) {
		this.mod = mod;
	}

	public String getImsi() {
		return imsi;
	}

	public void setImsi(String imsi) {
		this.imsi = imsi;
	}

	public String getRtype() {
		return rtype;
	}

	public void setRtype(String rtype) {
		this.rtype = rtype;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public RapportEtatTechnique() {
	}

	
	// public JournalTentativeActivation journal_tentative_activation;

	
}