package com.emcef.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "machineenregistrees")
public class MachinesInstallees implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "date_heure")
	private Date date_heure;

	@Column(name = "nom_proprietaire")
	private String nom_proprietaire;

	@Column(name = "id_sim")
	private String id_sim;

	@Column(name = "numero_sim")
	private String numero_sim;

	@Column(name = "date_enregistement")
	private Date date_enregistement;

	@Column(name = "date_acivation")
	private Date date_acivation;

	@Column(name = "operateur")
	private String operateur;

	@Column(name = "ident_machine_operateur")
	private String ident_machine_operateur;

	@Column(name = "id_profile_personalisation")
	private Integer id_profile_personalisation;

	@Column(name = "date_debut")
	private Date date_debut;

	@Column(name = "date_fin")
	private Date date_fin;

	@Column(name = "dernier_rapport")
	private Date dernier_rapport;

	@Column(name = "status_dernier_rapport")
	private Character status_dernier_rapport;

	@Column(name = "dernier_rapport_doc")
	private String dernier_rapport_doc;

	// @Column(name = "id_machine_enregistree")
	// public Machines_enregistrees id_machine_enregistree;

	// @Column(name = "id_installation")
	// public Installations id_installation;

	// @Column(name = "id_type_machine")
	// public Types_machines id_type_machine;
}