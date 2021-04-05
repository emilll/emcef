package com.emcef.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "RapportExterne")
public class RapportExterne {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column( name = "nom")
	private String nom;

	@Column( name = "description")
	private String description;

	@Column( name = "fichier_de_rapport")
	private String fichier_de_rapport;

	public RapportExterne() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getFichier_de_rapport() {
		return fichier_de_rapport;
	}

	public void setFichier_de_rapport(String fichier_de_rapport) {
		this.fichier_de_rapport = fichier_de_rapport;
	}
}