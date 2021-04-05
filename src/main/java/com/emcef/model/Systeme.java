package com.emcef.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "Systeme")
public class Systeme {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "date_time")
	private Date date_time;

	@Column(name = "date_valide_debut")
	private Date date_valide_debut;

	@Column(name = "date_valide_fin")
	private Date date_valide_fin;

	@Column(name = "designation_certificat")
	private String designation_certificat;

	@Column(name = "nom_fichier")
	private String nom_fichier;

	@Column(name = "son_controle")
	private String son_controle;

	@Column(name = "version")
	private String version;

	@Column(name = "description")
	private String description;

	@Column(name = "active")
	private boolean active;

	public Systeme() {
	}
}