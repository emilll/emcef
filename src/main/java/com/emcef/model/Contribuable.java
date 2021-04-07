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
    private int _id;

    @Column(name = "date_heure")
    private String _date_heure;
    
    @Column(name = "ifu")
    private String _ifu;
    
    @Column(name = "rccm")
    private String _rccm;
    
    @Column(name = "nom")
    private String _nom;
    
    @Column(name = "adresse")
    private String _adresse;
    
    @Column(name = "adresse2")
    private String _adresse2;
    
    @Column(name = "adresse3")
    private String _adresse3;
    
    @Column(name = "adresse4")
    private String _adresse4;
    
    @Column(name = "ville")
    private String _ville;
    
    @Column(name = "zip")
    private String _zip;
    
    @Column(name = "description_location")
    private String _description_location;
    
    @Column(name = "telephone")
    private String _telephone;
    
    @Column(name = "contact_personnel")
    private String _contact_personnel;
    
    @Column(name = "email")
    private String _email;
    
    @Column(name = "date_enregistrement")
    private String _date_enregistrement;
    
    @Column(name = "id_activite")
    private Integer _id_activite;
    
    @Column(name = "commentaire")
    private String _commentaire;
    
     public int getId() {
        return _id;
    }

    public void setId(int _id) {
        this._id = _id;
    }

    public String getDate_heure() {
        return _date_heure;
    }

    public void setDate_heure(String _date_heure) {
        this._date_heure = _date_heure;
    }

    public String getIfu() {
        return _ifu;
    }

    public void setIfu(String _ifu) {
        this._ifu = _ifu;
    }

    public String getRccm() {
        return _rccm;
    }

    public void setRccm(String _rccm) {
        this._rccm = _rccm;
    }

    public String getNom() {
        return _nom;
    }

    public void setNom(String _nom) {
        this._nom = _nom;
    }

    public String getAdresse() {
        return _adresse;
    }

    public void setAdresse(String _adresse) {
        this._adresse = _adresse;
    }

    public String getAdresse2() {
        return _adresse2;
    }

    public void setAdresse2(String _adresse2) {
        this._adresse2 = _adresse2;
    }

    public String getAdresse3() {
        return _adresse3;
    }

    public void setAdresse3(String _adresse3) {
        this._adresse3 = _adresse3;
    }

    public String getAdresse4() {
        return _adresse4;
    }

    public void setAdresse4(String _adresse4) {
        this._adresse4 = _adresse4;
    }

    public String getVille() {
        return _ville;
    }

    public void setVille(String _ville) {
        this._ville = _ville;
    }

    public String getZip() {
        return _zip;
    }

    public void setZip(String _zip) {
        this._zip = _zip;
    }

    public String getDescription_location() {
        return _description_location;
    }

    public void setDescription_location(String _description_location) {
        this._description_location = _description_location;
    }

    public String getTelephone() {
        return _telephone;
    }

    public void setTelephone(String _telephone) {
        this._telephone = _telephone;
    }

    public String getContact_personnel() {
        return _contact_personnel;
    }

    public void setContact_personnel(String _contact_personnel) {
        this._contact_personnel = _contact_personnel;
    }

    public String getEmail() {
        return _email;
    }

    public void setEmail(String _email) {
        this._email = _email;
    }

    public String getDate_enregistrement() {
        return _date_enregistrement;
    }

    public void setDate_enregistrement(String _date_enregistrement) {
        this._date_enregistrement = _date_enregistrement;
    }

    public Integer getId_activite() {
        return _id_activite;
    }

    public void setId_activite(Integer _id_activite) {
        this._id_activite = _id_activite;
    }

    public String getCommentaire() {
        return _commentaire;
    }

    public void setCommentaire(String _commentaire) {
        this._commentaire = _commentaire;
    }

}