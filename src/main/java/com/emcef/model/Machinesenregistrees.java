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

    public Machinesenregistrees(Certificatsenregistres certificatsenregistres,
            Fabriquantapprouvees fabriquantapprouvees, Modelsmachines modelsmachines, Etatmachine etatmachine,
            Date date_heure, String derniere_version, String commentaire, String analyseur) {
        this.certificatsenregistres = certificatsenregistres;
        this.fabriquantapprouvees = fabriquantapprouvees;
        this.modelsmachines = modelsmachines;
        this.etatmachine = etatmachine;
        this.date_heure = date_heure;
        this.derniere_version = derniere_version;
        this.commentaire = commentaire;
        this.analyseur = analyseur;
    }	
}