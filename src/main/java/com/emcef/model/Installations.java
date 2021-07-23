package com.emcef.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "installations")
public class Installations {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    Contribuable contribuable;

    @OneToOne
    Typesmachines typesmachines;

    @Column(name = "date_heure")
    private Date date_heure;

    @Column(name = "uid")
    private String uid;

    @Column(name = "ifuseller")
    private String ifuseller;

    @Column(name = "nom_commercial")
    private String nom_commercial;

    @Column(name = "ville")
    private String ville;

    @Column(name = "adresse")
    private String adresse;

    @Column(name = "adresse1")
    private String adresse1;

    @Column(name = "adresse2")
    private String adresse2;

    @Column(name = "adresse3")
    private String adresse3;

    @Column(name = "adresse4")
    private String adresse4;

    @Column(name = "zip")
    private String zip;

    @Column(name = "description_location")
    private String description_location;

    @Column(name = "contact_personnel")
    private String contact_personnel;

    @Column(name = "telephone")
    private String telephone;

    @Column(name = "email")
    private String email;

    @Column(name = "operateur")
    private String operateur;

    @Column(name = "operateur_machine_identifiant")
    private String operateur_machine_identifiant;

    @Column(name = "valide_de")
    private Date valide_de;

    @Column(name = "valide_au")
    private Date valide_au;

    @Column(name = "comment")
    private String comment;

    @Column(name = "latitude")
    private BigDecimal latitude;

    @Column(name = "longitude")
    private BigDecimal longitude;
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Contribuable getContribuable() {
        return contribuable;
    }

    public void setContribuable(Contribuable contribuable) {
        this.contribuable = contribuable;
    }

    public Typesmachines getTypesmachines() {
        return typesmachines;
    }

    public void setTypesmachines(Typesmachines typesmachines) {
        this.typesmachines = typesmachines;
    }

    public Date getDate_heure() {
        return date_heure;
    }

    public void setDate_heure(Date date_heure) {
        this.date_heure = date_heure;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getIfuseller() {
        return ifuseller;
    }

    public void setIfuseller(String ifuseller) {
        this.ifuseller = ifuseller;
    }

    public String getNom_commercial() {
        return nom_commercial;
    }

    public void setNom_commercial(String nom_commercial) {
        this.nom_commercial = nom_commercial;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getAdresse1() {
        return adresse1;
    }

    public void setAdresse1(String adresse1) {
        this.adresse1 = adresse1;
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

    public String getContact_personnel() {
        return contact_personnel;
    }

    public void setContact_personnel(String contact_personnel) {
        this.contact_personnel = contact_personnel;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOperateur() {
        return operateur;
    }

    public void setOperateur(String operateur) {
        this.operateur = operateur;
    }

    public String getOperateur_machine_identifiant() {
        return operateur_machine_identifiant;
    }

    public void setOperateur_machine_identifiant(String operateur_machine_identifiant) {
        this.operateur_machine_identifiant = operateur_machine_identifiant;
    }

    public Date getValide_de() {
        return valide_de;
    }

    public void setValide_de(Date valide_de) {
        this.valide_de = valide_de;
    }

    public Date getValide_au() {
        return valide_au;
    }

    public void setValide_au(Date valide_au) {
        this.valide_au = valide_au;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }
}
