package com.emcef.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "journalacces")
public class JournalAcces {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column( name = "date_heure")
	private Date date_heure;

	@Column( name = "utilisateur")
	private String utilisateur;

	@Column( name = "ip")
	private String ip;

	@Column( name = "action")
	private String action;

	@Column( name = "status")
	private String status;

	public JournalAcces() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate_heure() {
		return date_heure;
	}

	public void setDate_heure(Date date_heure) {
		this.date_heure = date_heure;
	}

	public String getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(String utilisateur) {
		this.utilisateur = utilisateur;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}