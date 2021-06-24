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
@Table(name = "certificatsenregistres")
public class Certificatsenregistres {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    Modelsmachines modelsmachines;

    @OneToOne
    Contribuable contribuables;

    @Column(name = "version_logiciel")
    private String version_logiciel;

    @Column(name = "materiel_maj")
    private String materiel_maj;

    @Column(name = "date_emission")
    private Date date_emission;

    @Column(name = "description_emission")
    private String description_emission;

    @Column(name = "description_revocation")
    private String description_revocation;

    @Column(name = "date_revocation")
    private Date date_revocation;

}
