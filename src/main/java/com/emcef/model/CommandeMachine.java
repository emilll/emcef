package com.emcef.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CommandeMachine")
public class CommandeMachine {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@OneToOne
	Machinesenregistrees machinesenregistrees;

	@Column(name = "date_heure")
	private Date date_heure;

	@Column(name = "date_creation")
	private Date date_creation;

	@Column(name = "createur")
	private String createur;

	@Column(name = "status")
	private int status;

	@Column(name = "active")
	private boolean active;

	@Column(name = "dete_envoi")
	private Date dete_envoi;

	@Column(name = "envoi_via_doc")
	private Integer envoi_via_doc;

	@Column(name = "veille")
	private Integer veille;

	@Column(name = "periode")
	private Integer periode;

	@Column(name = "attente")
	private Integer attente;

	@Column(name = "paquet")
	private Integer paquet;

	@Column(name = "fdoc")
	private Integer fdoc;

	@Column(name = "bloquer")
	private Integer bloquer;

	@Column(name = "nom")
	private String nom;

	@Column(name = "rccm")
	private String rccm;

	@Column(name = "adresse1")
	private String adresse1;

	@Column(name = "adresse2")
	private String adresse2;

	@Column(name = "adresse3")
	private String adresse3;

	@Column(name = "contact1")
	private String contact1;

	@Column(name = "contact2")
	private String contact2;

	@Column(name = "contact3")
	private String contact3;

	@Column(name = "entete")
	private String entete;

	@Column(name = "pieds")
	private String pieds;

	@Column(name = "numero_sim")
	private String numero_sim;

	@Column(name = "apn")
	private String apn;

	@Column(name = "utilisateur_apn")
	private String utilisateur_apn;

	@Column(name = "mot_de_passe_apn")
	private String mot_de_passe_apn;

	@Column(name = "date_taux")
	private Date date_taux;

	@Column(name = "taux_taxa")
	private BigDecimal taux_taxa;

	@Column(name = "taux_taxb")
	private BigDecimal taux_taxb;

	@Column(name = "taux_taxc")
	private BigDecimal taux_taxc;

	@Column(name = "taux_taxd")
	private BigDecimal taux_taxd;

	@Column(name = "taux_taxe")
	private BigDecimal taux_taxe;

	@Column(name = "taux_taxf")
	private BigDecimal taux_taxf;

	@Column(name = "taux_aiba")
	private BigDecimal taux_aiba;

	@Column(name = "taux_aibb")
	private BigDecimal taux_aibb;

	@Column(name = "version")
	private String version;

	@Column(name = "fichier_mise_a_jour")
	private String fichier_mise_a_jour;

	public Machinesenregistrees getMachinesenregistrees() {
		return machinesenregistrees;
	}

	public void setMachinesenregistrees(Machinesenregistrees machinesenregistrees) {
		this.machinesenregistrees = machinesenregistrees;
	}

	public Date getDate_heure() {
		return date_heure;
	}

	public void setDate_heure(Date date_heure) {
		this.date_heure = date_heure;
	}

	public Date getDate_creation() {
		return date_creation;
	}

	public void setDate_creation(Date date_creation) {
		this.date_creation = date_creation;
	}

	public String getCreateur() {
		return createur;
	}

	public void setCreateur(String createur) {
		this.createur = createur;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Date getDete_envoi() {
		return dete_envoi;
	}

	public void setDete_envoi(Date dete_envoi) {
		this.dete_envoi = dete_envoi;
	}

	public Integer getEnvoi_via_doc() {
		return envoi_via_doc;
	}

	public void setEnvoi_via_doc(Integer envoi_via_doc) {
		this.envoi_via_doc = envoi_via_doc;
	}

	public Integer getVeille() {
		return veille;
	}

	public void setVeille(Integer veille) {
		this.veille = veille;
	}

	public Integer getPeriode() {
		return periode;
	}

	public void setPeriode(Integer periode) {
		this.periode = periode;
	}

	public Integer getAttente() {
		return attente;
	}

	public void setAttente(Integer attente) {
		this.attente = attente;
	}

	public Integer getPaquet() {
		return paquet;
	}

	public void setPaquet(Integer paquet) {
		this.paquet = paquet;
	}

	public Integer getFdoc() {
		return fdoc;
	}

	public void setFdoc(Integer fdoc) {
		this.fdoc = fdoc;
	}

	public CommandeMachine() {
	}

	}