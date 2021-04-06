package com.emcef.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Etatmachine")
public class Etatmachine {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "nom")
	private String nom;

	@Column(name = "description")
	private String description;

	@Column(name = "afficher_dans_rapport")
	private boolean afficher_dans_rapport;

	@Column(name = "compte_total")
	private boolean compte_total;

	@Column(name = "afficher_dans_machine")
	private boolean afficher_dans_machine;

	@Column(name = "afficher_dans_machine_installer")
	private boolean afficher_dans_machine_installer;

	@Column(name = "afficher_dans_installation")
	private Boolean afficher_dans_installation;

	@Temporal(TemporalType.TIMESTAMP)
    @Column(name = "datecreation")
    private Date dateCreation; 
	
	@PrePersist
    public void initDateCreation() {
        dateCreation = new Date();
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

	public boolean isAfficher_dans_rapport() {
		return afficher_dans_rapport;
	}

	public void setAfficher_dans_rapport(boolean afficher_dans_rapport) {
		this.afficher_dans_rapport = afficher_dans_rapport;
	}

	public boolean isCompte_total() {
		return compte_total;
	}

	public void setCompte_total(boolean compte_total) {
		this.compte_total = compte_total;
	}

	public boolean isAfficher_dans_machine() {
		return afficher_dans_machine;
	}

	public void setAfficher_dans_machine(boolean afficher_dans_machine) {
		this.afficher_dans_machine = afficher_dans_machine;
	}

	public boolean isAfficher_dans_machine_installer() {
		return afficher_dans_machine_installer;
	}

	public void setAfficher_dans_machine_installer(boolean afficher_dans_machine_installer) {
		this.afficher_dans_machine_installer = afficher_dans_machine_installer;
	}

	public Boolean getAfficher_dans_installation() {
		return afficher_dans_installation;
	}

	public void setAfficher_dans_installation(Boolean afficher_dans_installation) {
		this.afficher_dans_installation = afficher_dans_installation;
	}

	public Etatmachine(String nom, String description, boolean afficher_dans_rapport, boolean compte_total,
			boolean afficher_dans_machine, boolean afficher_dans_machine_installer,
			Boolean afficher_dans_installation) {
		this.nom = nom;
		this.description = description;
		this.afficher_dans_rapport = afficher_dans_rapport;
		this.compte_total = compte_total;
		this.afficher_dans_machine = afficher_dans_machine;
		this.afficher_dans_machine_installer = afficher_dans_machine_installer;
		this.afficher_dans_installation = afficher_dans_installation;
	}

	
	
}