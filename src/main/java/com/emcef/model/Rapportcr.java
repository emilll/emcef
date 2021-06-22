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
@Table(name = "rapportcr")
public class Rapportcr {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "dateheure")
    private Date date_heure;

    @OneToOne
    Machinesenregistrees machinesenregistrees;

    @Column(name = "date_rapport")
    private Date date_rapport;

    @Column(name = "id_fichier")
    private Integer id_fichier;

    @Column(name = "nom")
    private String nom;

    @Column(name = "tauxtaxa")
    private BigDecimal tauxtaxa;

    @Column(name = "tauxtaxb")
    private BigDecimal tauxtaxb;

    @Column(name = "tauxtaxc")
    private BigDecimal tauxtaxc;

    @Column(name = "tauxtaxd")
    private BigDecimal tauxtaxd;

    @Column(name = "tauxtaxe")
    private BigDecimal tauxtaxe;

    @Column(name = "tauxtaxf")
    private BigDecimal tauxtaxf;

    @Column(name = "tauxaiba")
    private BigDecimal tauxaiba;

    @Column(name = "tauxaibb")
    private BigDecimal tauxaibb;

    @Column(name = "tin")
    private String tin;

    @Column(name = "rccm")
    private String rccm;

    @Column(name = "adresse1")
    private String adresse1;

    @Column(name = "adresse2")
    private String adresse2;

    @Column(name = "adresse3")
    private String adresse3;

    @Column(name = "contact1")
    private String contact1;

    @Column(name = "contact2")
    private String contact2;

    @Column(name = "contact3")
    private String contact3;

    @Column(name = "entete")
    private String entete;

    @Column(name = "pieds")
    private String pieds;

    @Column(name = "numero_sim")
    private String numero_sim;

    @Column(name = "apn")
    private String apn;
    
    @Column(name = "ifu")
    private String ifu;

    @Column(name = "utilisation_apn")
    private String utilisation_apn;

    @Column(name = "apn_mot_de_passe")
    private String apn_mot_de_passe;

    @Column(name = "url_serveur")
    private String url_serveur;

    @Column(name = "serveur_ntp")
    private String serveur_ntp;

    @Column(name = "version_sw")
    private String version_sw;

    @Column(name = "revision_hw")
    private String revision_hw;

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

    public Machinesenregistrees getMachinesenregistrees() {
        return machinesenregistrees;
    }

    public void setMachinesenregistrees(Machinesenregistrees machinesenregistrees) {
        this.machinesenregistrees = machinesenregistrees;
    }

    public Date getDate_rapport() {
        return date_rapport;
    }

    public void setDate_rapport(Date date_rapport) {
        this.date_rapport = date_rapport;
    }

    public Integer getId_fichier() {
        return id_fichier;
    }

    public void setId_fichier(Integer id_fichier) {
        this.id_fichier = id_fichier;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public BigDecimal getTauxtaxa() {
        return tauxtaxa;
    }

    public void setTauxtaxa(BigDecimal tauxtaxa) {
        this.tauxtaxa = tauxtaxa;
    }

    public BigDecimal getTauxtaxb() {
        return tauxtaxb;
    }

    public void setTauxtaxb(BigDecimal tauxtaxb) {
        this.tauxtaxb = tauxtaxb;
    }

    public BigDecimal getTauxtaxc() {
        return tauxtaxc;
    }

    public void setTauxtaxc(BigDecimal tauxtaxc) {
        this.tauxtaxc = tauxtaxc;
    }

    public BigDecimal getTauxtaxd() {
        return tauxtaxd;
    }

    public void setTauxtaxd(BigDecimal tauxtaxd) {
        this.tauxtaxd = tauxtaxd;
    }

    public BigDecimal getTauxtaxe() {
        return tauxtaxe;
    }

    public void setTauxtaxe(BigDecimal tauxtaxe) {
        this.tauxtaxe = tauxtaxe;
    }

    public BigDecimal getTauxtaxf() {
        return tauxtaxf;
    }

    public void setTauxtaxf(BigDecimal tauxtaxf) {
        this.tauxtaxf = tauxtaxf;
    }

    public BigDecimal getTauxaiba() {
        return tauxaiba;
    }

    public void setTauxaiba(BigDecimal tauxaiba) {
        this.tauxaiba = tauxaiba;
    }

    public BigDecimal getTauxaibb() {
        return tauxaibb;
    }

    public void setTauxaibb(BigDecimal tauxaibb) {
        this.tauxaibb = tauxaibb;
    }

    public String getTin() {
        return tin;
    }

    public void setTin(String tin) {
        this.tin = tin;
    }

    public String getRccm() {
        return rccm;
    }

    public void setRccm(String rccm) {
        this.rccm = rccm;
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

    public String getContact1() {
        return contact1;
    }

    public void setContact1(String contact1) {
        this.contact1 = contact1;
    }

    public String getContact2() {
        return contact2;
    }

    public void setContact2(String contact2) {
        this.contact2 = contact2;
    }

    public String getContact3() {
        return contact3;
    }

    public void setContact3(String contact3) {
        this.contact3 = contact3;
    }

    public String getEntete() {
        return entete;
    }

    public void setEntete(String entete) {
        this.entete = entete;
    }

    public String getPieds() {
        return pieds;
    }

    public void setPieds(String pieds) {
        this.pieds = pieds;
    }

    public String getNumero_sim() {
        return numero_sim;
    }

    public void setNumero_sim(String numero_sim) {
        this.numero_sim = numero_sim;
    }

    public String getApn() {
        return apn;
    }

    public void setApn(String apn) {
        this.apn = apn;
    }

    public String getIfu() {
        return ifu;
    }

    public void setIfu(String ifu) {
        this.ifu = ifu;
    }

    public String getUtilisation_apn() {
        return utilisation_apn;
    }

    public void setUtilisation_apn(String utilisation_apn) {
        this.utilisation_apn = utilisation_apn;
    }

    public String getApn_mot_de_passe() {
        return apn_mot_de_passe;
    }

    public void setApn_mot_de_passe(String apn_mot_de_passe) {
        this.apn_mot_de_passe = apn_mot_de_passe;
    }

    public String getUrl_serveur() {
        return url_serveur;
    }

    public void setUrl_serveur(String url_serveur) {
        this.url_serveur = url_serveur;
    }

    public String getServeur_ntp() {
        return serveur_ntp;
    }

    public void setServeur_ntp(String serveur_ntp) {
        this.serveur_ntp = serveur_ntp;
    }

    public String getVersion_sw() {
        return version_sw;
    }

    public void setVersion_sw(String version_sw) {
        this.version_sw = version_sw;
    }

    public String getRevision_hw() {
        return revision_hw;
    }

    public void setRevision_hw(String revision_hw) {
        this.revision_hw = revision_hw;
    }
}
