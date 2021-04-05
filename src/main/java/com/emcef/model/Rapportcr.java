package com.emcef.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "rapportcr")
@Getter
@Setter
public class Rapportcr {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "date_heure")
	private Date date_heure;

	@OneToOne
	Machinesenregistrees machinesenregistrees;

	@Column(name = "date_rapport")
	private Date date_rapport;

	@Column(name = "id_fichier")
	private Integer id_fichier;

	@Column(name = "nom")
	private String nom;

	@Column(name = "tauxtaxa")
	private BigDecimal tauxtaxa;

	@Column(name = "tauxtaxb")
	private BigDecimal tauxtaxb;

	@Column(name = "tauxtaxc")
	private BigDecimal tauxtaxc;

	@Column(name = "tauxtaxd")
	private BigDecimal tauxtaxd;

	@Column(name = "tauxtaxe")
	private BigDecimal tauxtaxe;

	@Column(name = "tauxtaxf")
	private BigDecimal tauxtaxf;

	@Column(name = "tauxaiba")
	private BigDecimal tauxaiba;

	@Column(name = "tauxaibb")
	private BigDecimal tauxaibb;

	@Column(name = "tin")
	private String tin;

	@Column(name = "rccm")
	private String rccm;

	@Column(name = "adresse1")
	private String adresse1;

	@Column(name = "adresse2")
	private String adresse2;

	@Column(name = "adresse3")
	private String adresse3;

	@Column(name = "contact1")
	private String contact1;

	@Column(name = "contact2")
	private String contact2;

	@Column(name = "contact3")
	private String contact3;

	@Column(name = "entete")
	private String entete;

	@Column(name = "pieds")
	private String pieds;

	@Column(name = "numero_sim")
	private String numero_sim;

	@Column(name = "apn")
	private String apn;

	@Column(name = "utilisation_apn")
	private String utilisation_apn;

	@Column(name = "apn_mot_de_passe")
	private String apn_mot_de_passe;

	@Column(name = "url_serveur")
	private String url_serveur;

	@Column(name = "serveur_ntp")
	private String serveur_ntp;

	@Column(name = "version_sw")
	private String version_sw;

	@Column(name = "revision_hw")
	private String revision_hw;

	public Rapportcr() {
	}




}