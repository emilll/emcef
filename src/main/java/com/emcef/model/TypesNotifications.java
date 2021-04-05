package com.emcef.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "typesnotifications")
public class TypesNotifications {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column( name = "nom")
	private String nom;

	@Column( name = "description")
	private String description;

	public TypesNotifications() {
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

}