package com.emcef.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name = "machineinstallees")
public class MachinesInstallees implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "date_heure")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date date_heure;

    @Column(name = "nom_proprietaire")
    private String nom_proprietaire;

    @Column(name = "id_sim")
    private String id_sim;

    @Column(name = "numero_sim")
    private String numero_sim;

    @Column(name = "status")
    private String status;

    @Column(name = "nim", unique = true, nullable = false)
    private String nim;

    @Column(name = "ifu", unique = true, nullable = false)
    private String ifu;

    @Column(name = "date_enregistement")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date date_enregistement;

    @Column(name = "date_acivation")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date date_activation;

    @Column(name = "operateur")
    private String operateur;

    @Column(name = "ident_machine_operateur")
    private String ident_machine_operateur;

    @Column(name = "id_profile_personalisation")
    private Integer id_profile_personalisation;

    @Column(name = "date_debut")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date date_debut;

    @Column(name = "date_fin")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date date_fin;

    @Column(name = "dernier_rapport")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dernier_rapport;

    @Column(name = "status_dernier_rapport")
    private Character status_dernier_rapport;

    @Column(name = "dernier_rapport_doc")
    private String dernier_rapport_doc;

    @OneToOne
    Installations id_installation;

    public Installations getId_installation() {
        return id_installation;
    }

    public void setId_installation(Installations id_installation) {
        this.id_installation = id_installation;
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

    public String getNom_proprietaire() {
        return nom_proprietaire;
    }

    public void setNom_proprietaire(String nom_proprietaire) {
        this.nom_proprietaire = nom_proprietaire;
    }

    public String getId_sim() {
        return id_sim;
    }

    public void setId_sim(String id_sim) {
        this.id_sim = id_sim;
    }

    public String getNumero_sim() {
        return numero_sim;
    }

    public void setNumero_sim(String numero_sim) {
        this.numero_sim = numero_sim;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getIfu() {
        return ifu;
    }

    public void setIfu(String ifu) {
        this.ifu = ifu;
    }

    public Date getDate_enregistement() {
        return date_enregistement;
    }

    public void setDate_enregistement(Date date_enregistement) {
        this.date_enregistement = date_enregistement;
    }

    public Date getDate_activation() {
        return date_activation;
    }

    public void setDate_activation(Date date_acivation) {
        this.date_activation = date_acivation;
    }

    public String getOperateur() {
        return operateur;
    }

    public void setOperateur(String operateur) {
        this.operateur = operateur;
    }

    public String getIdent_machine_operateur() {
        return ident_machine_operateur;
    }

    public void setIdent_machine_operateur(String ident_machine_operateur) {
        this.ident_machine_operateur = ident_machine_operateur;
    }

    public Integer getId_profile_personalisation() {
        return id_profile_personalisation;
    }

    public void setId_profile_personalisation(Integer id_profile_personalisation) {
        this.id_profile_personalisation = id_profile_personalisation;
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

    public Date getDernier_rapport() {
        return dernier_rapport;
    }

    public void setDernier_rapport(Date dernier_rapport) {
        this.dernier_rapport = dernier_rapport;
    }

    public Character getStatus_dernier_rapport() {
        return status_dernier_rapport;
    }

    public void setStatus_dernier_rapport(Character status_dernier_rapport) {
        this.status_dernier_rapport = status_dernier_rapport;
    }

    public String getDernier_rapport_doc() {
        return dernier_rapport_doc;
    }

    public void setDernier_rapport_doc(String dernier_rapport_doc) {
        this.dernier_rapport_doc = dernier_rapport_doc;
    }

}
