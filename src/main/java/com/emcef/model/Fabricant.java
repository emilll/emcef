/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emcef.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Holy
 */
@Entity
@Table(name = "fabricant")
public class Fabricant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int _id;
    
    @Column(name = "nom")
    private String _nom;
    
    @Column(name = "pays")
    private String _pays;
    
    @Column(name = "adresse")
    private String _adresse;
    
    @Column(name = "telephone")
    private String _contact_tel;
    
    @Column(name = "email")
    private String _contact_email;

    public int getId() {
        return _id;
    }

    public void setId(int _id) {
        this._id = _id;
    }

    public String getNom() {
        return _nom;
    }

    public void setNom(String _nom) {
        this._nom = _nom;
    }

    public String getPays() {
        return _pays;
    }

    public void setPays(String _pays) {
        this._pays = _pays;
    }

    public String getAdresse() {
        return _adresse;
    }

    public void setAdresse(String _adresse) {
        this._adresse = _adresse;
    }

    public String getContact_tel() {
        return _contact_tel;
    }

    public void setContact_tel(String _contact_tel) {
        this._contact_tel = _contact_tel;
    }

    public String getContact_email() {
        return _contact_email;
    }

    public void setContact_email(String _contact_email) {
        this._contact_email = _contact_email;
    }
    
    
}
