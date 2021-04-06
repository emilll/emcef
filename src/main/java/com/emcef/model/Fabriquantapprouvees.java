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
@Table(name = "fabriquantapprouvees")
public class Fabriquantapprouvees {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name="nom")
	private String nom;

	@Column(name = "pays")
	private String pays;

	@Column(name = "adresse")
	private String adresse;

	@Column(name = "telephone")
	private String telephone;

	@Column(name="email")
	private String email;


	@Temporal(TemporalType.TIMESTAMP)
    @Column(name = "datecreation")
    private Date dateCreation;

	@PrePersist
    public void initDateCreation() {
        dateCreation = new Date();
    }

	public Fabriquantapprouvees(String nom, String pays, String adresse, String telephone, String email) {
		this.nom = nom;
		this.pays = pays;
		this.adresse = adresse;
		this.telephone = telephone;
		this.email = email;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	

}