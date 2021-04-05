package com.emcef.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

public class JournalApiMachine {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@OneToOne
	TypesAccesDistance typesAccesDistance;

	@Column( name = "debut_connexion")
	private Date debut_connexion;

	@Column( name = "fin_connexion")
	private Date fin_connexion;

	@Column( name = "taille_requette")
	private Integer taille_requette;

	@Column( name = "taille_reponse")
	private Integer taille_reponse;

	@Column( name = "status")
	private Boolean status;

	@Column( name = "identification_machine")
	private String identification_machine;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public TypesAccesDistance getTypesAccesDistance() {
		return typesAccesDistance;
	}

	public void setTypesAccesDistance(TypesAccesDistance typesAccesDistance) {
		this.typesAccesDistance = typesAccesDistance;
	}

	public Date getDebut_connexion() {
		return debut_connexion;
	}

	public void setDebut_connexion(Date debut_connexion) {
		this.debut_connexion = debut_connexion;
	}

	public Date getFin_connexion() {
		return fin_connexion;
	}

	public void setFin_connexion(Date fin_connexion) {
		this.fin_connexion = fin_connexion;
	}

	public Integer getTaille_requette() {
		return taille_requette;
	}

	public void setTaille_requette(Integer taille_requette) {
		this.taille_requette = taille_requette;
	}

	public Integer getTaille_reponse() {
		return taille_reponse;
	}

	public void setTaille_reponse(Integer taille_reponse) {
		this.taille_reponse = taille_reponse;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getIdentification_machine() {
		return identification_machine;
	}

	public void setIdentification_machine(String identification_machine) {
		this.identification_machine = identification_machine;
	}

	public JournalApiMachine() {
	}



	// public Types_acces_distance id_type_acces_distance;
}