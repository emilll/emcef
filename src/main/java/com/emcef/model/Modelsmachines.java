package com.emcef.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Modelsmachines")
public class Modelsmachines {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @ManyToOne
    Typesmachines typesmachines;

    @Column(name = "nom")
    private String nom;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "datecreation")
    private Date dateCreation;

    @PrePersist
    public void initDateCreation() {
        dateCreation = new Date();
    }
    
    // @Version
    // private Timestamp version;


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }


    public Modelsmachines(String nom, String description) {
        this.nom = nom;
    }

    public Modelsmachines() {
    }
    
}