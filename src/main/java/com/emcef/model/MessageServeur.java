package com.emcef.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "mesageserveur")
public class MessageServeur {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column( name = "active")
	private Boolean active;

	@Column( name = "compte_repete")
	private Integer compte_repete;

	@Column( name = "compte_veille_repete")
	private Integer compte_veille_repete;

	@Column( name = "date_debut")
	private Date date_debut;

	@Column( name = "date_fin")
	private Date date_fin;

	@Column( name = "filtre")
	private String filtre;

	@Column( name = "entete")
	private String entete;

	@Column( name = "text")
	private String text;

	@Column( name = "pieds")
	private String pieds;

	public MessageServeur() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Integer getCompte_repete() {
		return compte_repete;
	}

	public void setCompte_repete(Integer compte_repete) {
		this.compte_repete = compte_repete;
	}

	public Integer getCompte_veille_repete() {
		return compte_veille_repete;
	}

	public void setCompte_veille_repete(Integer compte_veille_repete) {
		this.compte_veille_repete = compte_veille_repete;
	}

	public Date getDate_debut() {
		return date_debut;
	}

	public void setDate_debut(Date date_debut) {
		this.date_debut = date_debut;
	}

	public Date getDate_fin() {
		return date_fin;
	}

	public void setDate_fin(Date date_fin) {
		this.date_fin = date_fin;
	}

	public String getFiltre() {
		return filtre;
	}

	public void setFiltre(String filtre) {
		this.filtre = filtre;
	}

	public String getEntete() {
		return entete;
	}

	public void setEntete(String entete) {
		this.entete = entete;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getPieds() {
		return pieds;
	}

	public void setPieds(String pieds) {
		this.pieds = pieds;
	}
}