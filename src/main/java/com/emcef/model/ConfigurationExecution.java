package com.emcef.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "configurationexecution")
public class ConfigurationExecution {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

	@Column( name = "description")
	private String description;

	@Column( name = "active")
	private Boolean active;

	@Column( name = "duree_token_mobile")
	private Integer duree_token_mobile;

	@Column( name = "taille_code_bar")
	private Short taille_code_bar;

	@Column( name = "taille_page")
	private Short taille_page;

	@Column( name = "max_rapport_enregistre")
	private Integer max_rapport_enregistre;

	@Column( name = "active_graphique_eleve")
	private Boolean active_graphique_eleve;

	@Column( name = "active_envoi_sms")
	private Boolean active_envoi_sms;

	@Column( name = "sms_aws_access_key_id")
	private String sms_aws_access_key_id;

	@Column( name = "sms_aws_secret_key")
	private String sms_aws_secret_key;

	@Column( name = "sujet_sms")
	private String sujet_sms;

	@Column( name = "active_envoi_email")
	private Boolean active_envoi_email;

	@Column( name = "email_destinataire")
	private String email_destinataire;

	@Column( name = "email_nom")
	private String email_nom;

	@Column( name = "email_smtp_serveur")
	private String email_smtp_serveur;

	@Column( name = "email_smtp_serveur_port")
	private Integer email_smtp_serveur_port;

	@Column( name = "email_smtp_serveur_utilisateur")
	private String email_smtp_serveur_utilisateur;

	@Column( name = "email_smtp_serveur_mdp")
	private String email_smtp_serveur_mdp;

	@Column( name = "drapeaux")
	private String drapeaux;

	@Column( name = "machine_cmd_renvoi_seconds")
	private Boolean machine_cmd_renvoi_seconds;

	@Column( name = "active_machine_cmd_sparams")
	private Boolean active_machine_cmd_sparams;

	@Column( name = "active_machine_cmd_logiciel")
	private Boolean active_machine_cmd_logiciel;

	@Column( name = "actuve_machine_cmd_taux_tax")
	private Boolean actuve_machine_cmd_taux_tax;

	
	public ConfigurationExecution() {
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Boolean getActive() {
		return active;
	}


	public void setActive(Boolean active) {
		this.active = active;
	}


	public Integer getDuree_token_mobile() {
		return duree_token_mobile;
	}


	public void setDuree_token_mobile(Integer duree_token_mobile) {
		this.duree_token_mobile = duree_token_mobile;
	}


	public Short getTaille_code_bar() {
		return taille_code_bar;
	}


	public void setTaille_code_bar(Short taille_code_bar) {
		this.taille_code_bar = taille_code_bar;
	}


	public Short getTaille_page() {
		return taille_page;
	}


	public void setTaille_page(Short taille_page) {
		this.taille_page = taille_page;
	}


	public Integer getMax_rapport_enregistre() {
		return max_rapport_enregistre;
	}


	public void setMax_rapport_enregistre(Integer max_rapport_enregistre) {
		this.max_rapport_enregistre = max_rapport_enregistre;
	}


	public Boolean getActive_graphique_eleve() {
		return active_graphique_eleve;
	}


	public void setActive_graphique_eleve(Boolean active_graphique_eleve) {
		this.active_graphique_eleve = active_graphique_eleve;
	}


	public Boolean getActive_envoi_sms() {
		return active_envoi_sms;
	}


	public void setActive_envoi_sms(Boolean active_envoi_sms) {
		this.active_envoi_sms = active_envoi_sms;
	}


	public String getSms_aws_access_key_id() {
		return sms_aws_access_key_id;
	}


	public void setSms_aws_access_key_id(String sms_aws_access_key_id) {
		this.sms_aws_access_key_id = sms_aws_access_key_id;
	}


	public String getSms_aws_secret_key() {
		return sms_aws_secret_key;
	}


	public void setSms_aws_secret_key(String sms_aws_secret_key) {
		this.sms_aws_secret_key = sms_aws_secret_key;
	}


	public String getSujet_sms() {
		return sujet_sms;
	}


	public void setSujet_sms(String sujet_sms) {
		this.sujet_sms = sujet_sms;
	}


	public Boolean getActive_envoi_email() {
		return active_envoi_email;
	}


	public void setActive_envoi_email(Boolean active_envoi_email) {
		this.active_envoi_email = active_envoi_email;
	}


	public String getEmail_destinataire() {
		return email_destinataire;
	}


	public void setEmail_destinataire(String email_destinataire) {
		this.email_destinataire = email_destinataire;
	}


	public String getEmail_nom() {
		return email_nom;
	}


	public void setEmail_nom(String email_nom) {
		this.email_nom = email_nom;
	}


	public String getEmail_smtp_serveur() {
		return email_smtp_serveur;
	}


	public void setEmail_smtp_serveur(String email_smtp_serveur) {
		this.email_smtp_serveur = email_smtp_serveur;
	}


	public Integer getEmail_smtp_serveur_port() {
		return email_smtp_serveur_port;
	}


	public void setEmail_smtp_serveur_port(Integer email_smtp_serveur_port) {
		this.email_smtp_serveur_port = email_smtp_serveur_port;
	}


	public String getEmail_smtp_serveur_utilisateur() {
		return email_smtp_serveur_utilisateur;
	}


	public void setEmail_smtp_serveur_utilisateur(String email_smtp_serveur_utilisateur) {
		this.email_smtp_serveur_utilisateur = email_smtp_serveur_utilisateur;
	}


	public String getEmail_smtp_serveur_mdp() {
		return email_smtp_serveur_mdp;
	}


	public void setEmail_smtp_serveur_mdp(String email_smtp_serveur_mdp) {
		this.email_smtp_serveur_mdp = email_smtp_serveur_mdp;
	}


	public String getDrapeaux() {
		return drapeaux;
	}


	public void setDrapeaux(String drapeaux) {
		this.drapeaux = drapeaux;
	}


	public Boolean getMachine_cmd_renvoi_seconds() {
		return machine_cmd_renvoi_seconds;
	}


	public void setMachine_cmd_renvoi_seconds(Boolean machine_cmd_renvoi_seconds) {
		this.machine_cmd_renvoi_seconds = machine_cmd_renvoi_seconds;
	}


	public Boolean getActive_machine_cmd_sparams() {
		return active_machine_cmd_sparams;
	}


	public void setActive_machine_cmd_sparams(Boolean active_machine_cmd_sparams) {
		this.active_machine_cmd_sparams = active_machine_cmd_sparams;
	}


	public Boolean getActive_machine_cmd_logiciel() {
		return active_machine_cmd_logiciel;
	}


	public void setActive_machine_cmd_logiciel(Boolean active_machine_cmd_logiciel) {
		this.active_machine_cmd_logiciel = active_machine_cmd_logiciel;
	}


	public Boolean getActuve_machine_cmd_taux_tax() {
		return actuve_machine_cmd_taux_tax;
	}


	public void setActuve_machine_cmd_taux_tax(Boolean actuve_machine_cmd_taux_tax) {
		this.actuve_machine_cmd_taux_tax = actuve_machine_cmd_taux_tax;
	}
	
}