package com.emcef.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "HistoriqueEtatMachine")
public class HistoriqueEtatMachine {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	
	@ManyToOne
	Machinesenregistrees machinesenregistrees;

	@OneToOne
	Etatmachine etatmachine;

	@Column(name = "date_debut")
	private Date date_debut;

	@Column(name = "date_fin")
	private Date date_fin;

	public HistoriqueEtatMachine() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Machinesenregistrees getMachinesenregistrees() {
		return machinesenregistrees;
	}

	public void setMachinesenregistrees(Machinesenregistrees machinesenregistrees) {
		this.machinesenregistrees = machinesenregistrees;
	}

	public Etatmachine getEtatmachine() {
		return etatmachine;
	}

	public void setEtatmachine(Etatmachine etatmachine) {
		this.etatmachine = etatmachine;
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
	
	
}