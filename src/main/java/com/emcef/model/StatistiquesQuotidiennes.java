package com.emcef.model;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "StatistiquesQuotidiennes")
public class StatistiquesQuotidiennes {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column( name = "date")
	private Date date;

	@Column( name = "date_time")
	private Date date_time;

	@Column( name = "rapport_machine")
	private Integer rapport_machine;

	@Column( name = "machine_active")
	private Integer machine_active;

	@Column( name = "machine_activee")
	private Integer machine_activee;

	@Column( name = "machine_enregistree")
	private Integer machine_enregistree;

	@Column( name = "total_machine_enregistree")
	private Integer total_machine_enregistree;

	@Column( name = "connexion_serveur")
	private Integer connexion_serveur;

	@Column( name = "donnee_recue")
	private Integer donnee_recue;

	@Column( name = "donnee_envoyer")
	private Integer donnee_envoyer;

	@Column( name = "recus")
	private Integer recus;

	@Column( name = "vente_recus")
	private Integer vente_recus;

	@Column( name = "rembousement_recus")
	private Integer rembousement_recus;

	@Column( name = "total")
	private BigDecimal total;

	@Column( name = "totaltax")
	private BigDecimal totaltax;

	public StatistiquesQuotidiennes() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getDate_time() {
		return date_time;
	}

	public void setDate_time(Date date_time) {
		this.date_time = date_time;
	}

	public Integer getRapport_machine() {
		return rapport_machine;
	}

	public void setRapport_machine(Integer rapport_machine) {
		this.rapport_machine = rapport_machine;
	}

	public Integer getMachine_active() {
		return machine_active;
	}

	public void setMachine_active(Integer machine_active) {
		this.machine_active = machine_active;
	}

	public Integer getMachine_activee() {
		return machine_activee;
	}

	public void setMachine_activee(Integer machine_activee) {
		this.machine_activee = machine_activee;
	}

	public Integer getMachine_enregistree() {
		return machine_enregistree;
	}

	public void setMachine_enregistree(Integer machine_enregistree) {
		this.machine_enregistree = machine_enregistree;
	}

	public Integer getTotal_machine_enregistree() {
		return total_machine_enregistree;
	}

	public void setTotal_machine_enregistree(Integer total_machine_enregistree) {
		this.total_machine_enregistree = total_machine_enregistree;
	}

	public Integer getConnexion_serveur() {
		return connexion_serveur;
	}

	public void setConnexion_serveur(Integer connexion_serveur) {
		this.connexion_serveur = connexion_serveur;
	}

	public Integer getDonnee_recue() {
		return donnee_recue;
	}

	public void setDonnee_recue(Integer donnee_recue) {
		this.donnee_recue = donnee_recue;
	}

	public Integer getDonnee_envoyer() {
		return donnee_envoyer;
	}

	public void setDonnee_envoyer(Integer donnee_envoyer) {
		this.donnee_envoyer = donnee_envoyer;
	}

	public Integer getRecus() {
		return recus;
	}

	public void setRecus(Integer recus) {
		this.recus = recus;
	}

	public Integer getVente_recus() {
		return vente_recus;
	}

	public void setVente_recus(Integer vente_recus) {
		this.vente_recus = vente_recus;
	}

	public Integer getRembousement_recus() {
		return rembousement_recus;
	}

	public void setRembousement_recus(Integer rembousement_recus) {
		this.rembousement_recus = rembousement_recus;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public BigDecimal getTotaltax() {
		return totaltax;
	}

	public void setTotaltax(BigDecimal totaltax) {
		this.totaltax = totaltax;
	}
}