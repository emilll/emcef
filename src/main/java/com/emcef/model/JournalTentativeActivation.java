package com.emcef.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "JournalTentativeActivation")
public class JournalTentativeActivation {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@OneToOne
	Machinesenregistrees machinesenregistrees;
	
	@Column(name = "date_heure")
	private Date date_heure;

	@Column(name = "status")
	private int status;

	@Column(name = "message")
	private String message;

	public Machinesenregistrees getMachinesenregistrees() {
		return machinesenregistrees;
	}

	public void setMachinesenregistrees(Machinesenregistrees machinesenregistrees) {
		this.machinesenregistrees = machinesenregistrees;
	}

	public Date getDate_heure() {
		return date_heure;
	}

	public void setDate_heure(Date date_heure) {
		this.date_heure = date_heure;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public JournalTentativeActivation() {
	}


	// public Rapport_etat_technique rapport_etat_technique;

	
}