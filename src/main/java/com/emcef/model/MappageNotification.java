package com.emcef.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table( name = "mappagenotification")
public class MappageNotification {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@OneToOne
	TypesNotifications typesNotifications;

	@Column( name = "nom_utilisateur")
	private String nom_utilisateur;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public TypesNotifications getTypesNotifications() {
		return typesNotifications;
	}

	public void setTypesNotifications(TypesNotifications typesNotifications) {
		this.typesNotifications = typesNotifications;
	}

	public String getNom_utilisateur() {
		return nom_utilisateur;
	}

	public void setNom_utilisateur(String nom_utilisateur) {
		this.nom_utilisateur = nom_utilisateur;
	}

	public MappageNotification() {
	}

	
	
}