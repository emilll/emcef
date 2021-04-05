package com.emcef.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "machinesenregistrees")
public class Machinesenregistrees {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@OneToOne
	Certificatsenregistres certificatsenregistres;

	@OneToOne
	Fabriquantapprouvees fabriquantapprouvees;

	@OneToOne
	Modelsmachines modelsmachines;

	@OneToOne
	Etatmachine etatmachine;
	
	@Column(name = "date_heure")
	private Date date_heure;

	@Column(name = "derniere_version")
	private String derniere_version;

	@Column(name = "commentaire")
	private String commentaire;

	@Column(name = "analyseur")
	private String analyseur;

	public Certificatsenregistres getCertificatsenregistres() {
		return certificatsenregistres;
	}

	public void setCertificatsenregistres(Certificatsenregistres certificatsenregistres) {
		this.certificatsenregistres = certificatsenregistres;
	}

	public Fabriquantapprouvees getFabriquantapprouvees() {
		return fabriquantapprouvees;
	}

	public void setFabriquantapprouvees(Fabriquantapprouvees fabriquantapprouvees) {
		this.fabriquantapprouvees = fabriquantapprouvees;
	}

	public Modelsmachines getModelsmachines() {
		return modelsmachines;
	}

	public void setModelsmachines(Modelsmachines modelsmachines) {
		this.modelsmachines = modelsmachines;
	}

	public Etatmachine getEtatmachine() {
		return etatmachine;
	}

	public void setEtatmachine(Etatmachine etatmachine) {
		this.etatmachine = etatmachine;
	}

	public Date getDate_heure() {
		return date_heure;
	}

	public void setDate_heure(Date date_heure) {
		this.date_heure = date_heure;
	}

	public String getDerniere_version() {
		return derniere_version;
	}

	public void setDerniere_version(String derniere_version) {
		this.derniere_version = derniere_version;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public String getAnalyseur() {
		return analyseur;
	}

	public void setAnalyseur(String analyseur) {
		this.analyseur = analyseur;
	}

	public Machinesenregistrees() {
	}

   
}