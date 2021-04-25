package com.emcef.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contribuable")
public class Contribuable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "date_heure")
    private String date_heure;

    @Column(name = "ifu")
    private int ifu;

    @Column(name = "rccm")
    private String rccm;

    @Column(name = "nom")
    private String nom;

    @Column(name = "adresse")
    private String adresse;

    @Column(name = "adresse2")
    private String adresse2;

    @Column(name = "adresse3")
    private String adresse3;

    @Column(name = "adresse4")
    private String adresse4;

    @Column(name = "ville")
    private String ville;

    @Column(name = "zip")
    private String zip;

    @Column(name = "description_location")
    private String description_location;

    @Column(name = "telephone")
    private String telephone;

    @Column(name = "contact_personnel")
    private String contact_personnel;

    @Column(name = "email")
    private String email;

    @Column(name = "date_enregistrement")
    private String date_enregistrement;

    @Column(name = "id_activite")
    private Integer id_activite;

    @Column(name = "commentaire")
    private String commentaire;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate_heure() {
        return date_heure;
    }

    public void setDate_heure(String date_heure) {
        this.date_heure = date_heure;
    }

    public int getIfu() {
        return ifu;
    }

    public void setIfu(int ifu) {
        this.ifu = ifu;
    }

    public String getRccm() {
        return rccm;
    }

    public void setRccm(String rccm) {
        this.rccm = rccm;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getAdresse2() {
        return adresse2;
    }

    public void setAdresse2(String adresse2) {
        this.adresse2 = adresse2;
    }

    public String getAdresse3() {
        return adresse3;
    }

    public void setAdresse3(String adresse3) {
        this.adresse3 = adresse3;
    }

    public String getAdresse4() {
        return adresse4;
    }

    public void setAdresse4(String adresse4) {
        this.adresse4 = adresse4;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getDescription_location() {
        return description_location;
    }

    public void setDescription_location(String description_location) {
        this.description_location = description_location;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getContact_personnel() {
        return contact_personnel;
    }

    public void setContact_personnel(String contact_personnel) {
        this.contact_personnel = contact_personnel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDate_enregistrement() {
        return date_enregistrement;
    }

    public void setDate_enregistrement(String date_enregistrement) {
        this.date_enregistrement = date_enregistrement;
    }

    public Integer getId_activite() {
        return id_activite;
    }

    public void setId_activite(Integer id_activite) {
        this.id_activite = id_activite;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

}