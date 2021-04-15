package com.emcef.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "factureselonspecification")
public class FactureSelonSpecification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "dateheure")
    private Date dateTime;

    @Column(name = "id_document")
    private Integer id_document;

    @Column(name = "id_fichier")
    private Integer id_fichier;

    @Column(name = "type")
    private String type;

    @Column(name = "type_document")
    private String type_document;

    @Column(name = "type_machine")
    private String type_machine;

    @Temporal(TemporalType.DATE)
    @Column(name = "date_requette")
    private Date date_requette;

    @Column(name = "numero_execution")
    private int numero_execution;

    @Column(name = "Infodate")
    private Date info_date;

    @Column(name = "ifu")
    private int ifu;

    @Column(name = "taux_tax_a")
    private BigDecimal taux_tax_a;

    @Column(name = "taux_tax_b")
    private BigDecimal taux_tax_b;

    @Column(name = "taux_tax_c")
    private BigDecimal taux_tax_c;

    @Column(name = "taux_tax_d")
    private BigDecimal taux_tax_d;

    @Column(name = "total")
    private BigDecimal total;

    @Column(name = "total_a")
    private BigDecimal total_a;

    @Column(name = "total_b")
    private BigDecimal total_b;

    @Column(name = "total_c")
    private BigDecimal total_c;

    @Column(name = "total_d")
    private BigDecimal total_d;

    @Column(name = "total_taxable")
    private BigDecimal total_taxable;

    @Column(name = "taxable_a")
    private BigDecimal taxable_a;

    @Column(name = "taxable_b")
    private BigDecimal taxable_b;

    @Column(name = "taxable_c")
    private BigDecimal taxable_c;

    @Column(name = "taxable_d")
    private BigDecimal taxable_d;

    @Column(name = "total_tax")
    private BigDecimal total_tax;

    @Column(name = "total_tax_a")
    private BigDecimal total_tax_a;

    @Column(name = "total_tax_b")
    private BigDecimal total_tax_b;

    @Column(name = "total_tax_c")
    private BigDecimal total_tax_c;

    @Column(name = "total_tax_d")
    private BigDecimal total_tax_d;

    @Column(name = "mrc")
    private String mrc;

    @Column(name = "controle_identifaction")
    private String controle_identifaction;

    @Column(name = "compteur_schema_controleur")
    private Integer compteur_schema_controleur;

    @Column(name = "compteur_total_controuleur")
    private Integer compteur_total_controuleur;

    @Column(name = "date_heure_controleur")
    private Date date_heure_controleur;

    @Column(name = "date_controleur")
    private Date date_controleur;

    @Column(name = "harchage_document")
    private String harchage_document;

    @Column(name = "signature_controleur")
    private String signature_controleur;

    @Column(name = "donneecontrole_controleur")
    private String donneecontrole_controleur;

    @Column(name = "signaturepublique_controleur")
    private String signaturepublique_controleur;

    @Column(name = "nom_commercial")
    private String nom_commercial;

    @Column(name = "adresse1")
    private String adresse1;

    @Column(name = "adresse2")
    private String adresse2;

    @Column(name = "contact1")
    private String contact1;

    @Column(name = "contact2")
    private String contact2;

    @Column(name = "entete1")
    private String entete1;

    @Column(name = "entete2")
    private String entete2;

    @Column(name = "entete3")
    private String entete3;

    @Column(name = "pieds1")
    private String pieds1;

    @Column(name = "pieds2")
    private String pieds2;

    @Column(name = "pieds3")
    private String pieds3;

    @Column(name = "ifu_client")
    private int ifu_client;

    @Column(name = "nom_client")
    private String nom_client;

    @Column(name = "adresse1_client")
    private String adresse1_client;

    @Column(name = "adresse2_client")
    private String adresse2_client;

    @Column(name = "contact1_client")
    private String contact1_client;

    @Column(name = "contact2_client")
    private String contact2_client;

    @Column(name = "payement")
    private String payement;

    @Column(name = "montant_payement")
    private BigDecimal montant_payement;

    @Column(name = "operateur")
    private String operateur;

    @Column(name = "reference_remboursement")
    private String reference_remboursement;

    @Column(name = "aib")
    private BigDecimal aib;

    @Column(name = "montant_aib")
    private BigDecimal montant_aib;

    @Column(name = "tax_specifique_a")
    private BigDecimal tax_specifique_a;

    @Column(name = "tax_specifique_b")
    private BigDecimal tax_specifique_b;

    @Column(name = "tax_specifique_c")
    private BigDecimal tax_specifique_c;

    @Column(name = "tax_specifique_d")
    private BigDecimal tax_specifique_d;

    @Column(name = "total_tax_specifique")
    private BigDecimal total_tax_specifique;

    @Column(name = "status")
    private Boolean status;

    @Column(name = "calcul")
    private boolean calcul;

    @Column(name = "tauxtax_e")
    private BigDecimal tauxtax_e;

    @Column(name = "tauxtax_f")
    private BigDecimal tauxtax_f;

    @Column(name = "total_e")
    private BigDecimal total_e;

    @Column(name = "total_f")
    private BigDecimal total_f;

    @Column(name = "taxable_e")
    private BigDecimal taxable_e;

    @Column(name = "taxable_f")
    private BigDecimal taxable_f;

    @Column(name = "total_tax_e")
    private BigDecimal total_tax_e;

    @Column(name = "total_tax_f")
    private BigDecimal total_tax_f;

    @Column(name = "adresse3")
    private String adresse3;

    @Column(name = "contact3")
    private String contact3;

    @Column(name = "tax_specifique_e")
    private BigDecimal tax_specifique_e;

    @Column(name = "tax_specifique_f")
    private BigDecimal tax_specifique_f;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public Integer getId_document() {
        return id_document;
    }

    public void setId_document(Integer id_document) {
        this.id_document = id_document;
    }

    public Integer getId_fichier() {
        return id_fichier;
    }

    public void setId_fichier(Integer id_fichier) {
        this.id_fichier = id_fichier;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType_document() {
        return type_document;
    }

    public void setType_document(String type_document) {
        this.type_document = type_document;
    }

    public String getType_machine() {
        return type_machine;
    }

    public void setType_machine(String type_machine) {
        this.type_machine = type_machine;
    }

    public Date getDate_requette() {
        return date_requette;
    }

    public void setDate_requette(Date date_requette) {
        this.date_requette = date_requette;
    }

    public int getNumero_execution() {
        return numero_execution;
    }

    public void setNumero_execution(int numero_execution) {
        this.numero_execution = numero_execution;
    }

    public Date getInfo_date() {
        return info_date;
    }

    public void setInfo_date(Date info_date) {
        this.info_date = info_date;
    }

    public int getIfu() {
        return ifu;
    }

    public void setIfu(int ifu) {
        this.ifu = ifu;
    }

    public BigDecimal getTaux_tax_a() {
        return taux_tax_a;
    }

    public void setTaux_tax_a(BigDecimal taux_tax_a) {
        this.taux_tax_a = taux_tax_a;
    }

    public BigDecimal getTaux_tax_b() {
        return taux_tax_b;
    }

    public void setTaux_tax_b(BigDecimal taux_tax_b) {
        this.taux_tax_b = taux_tax_b;
    }

    public BigDecimal getTaux_tax_c() {
        return taux_tax_c;
    }

    public void setTaux_tax_c(BigDecimal taux_tax_c) {
        this.taux_tax_c = taux_tax_c;
    }

    public BigDecimal getTaux_tax_d() {
        return taux_tax_d;
    }

    public void setTaux_tax_d(BigDecimal taux_tax_d) {
        this.taux_tax_d = taux_tax_d;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public BigDecimal getTotal_a() {
        return total_a;
    }

    public void setTotal_a(BigDecimal total_a) {
        this.total_a = total_a;
    }

    public BigDecimal getTotal_b() {
        return total_b;
    }

    public void setTotal_b(BigDecimal total_b) {
        this.total_b = total_b;
    }

    public BigDecimal getTotal_c() {
        return total_c;
    }

    public void setTotal_c(BigDecimal total_c) {
        this.total_c = total_c;
    }

    public BigDecimal getTotal_d() {
        return total_d;
    }

    public void setTotal_d(BigDecimal total_d) {
        this.total_d = total_d;
    }

    public BigDecimal getTotal_taxable() {
        return total_taxable;
    }

    public void setTotal_taxable(BigDecimal total_taxable) {
        this.total_taxable = total_taxable;
    }

    public BigDecimal getTaxable_a() {
        return taxable_a;
    }

    public void setTaxable_a(BigDecimal taxable_a) {
        this.taxable_a = taxable_a;
    }

    public BigDecimal getTaxable_b() {
        return taxable_b;
    }

    public void setTaxable_b(BigDecimal taxable_b) {
        this.taxable_b = taxable_b;
    }

    public BigDecimal getTaxable_c() {
        return taxable_c;
    }

    public void setTaxable_c(BigDecimal taxable_c) {
        this.taxable_c = taxable_c;
    }

    public BigDecimal getTaxable_d() {
        return taxable_d;
    }

    public void setTaxable_d(BigDecimal taxable_d) {
        this.taxable_d = taxable_d;
    }

    public BigDecimal getTotal_tax() {
        return total_tax;
    }

    public void setTotal_tax(BigDecimal total_tax) {
        this.total_tax = total_tax;
    }

    public BigDecimal getTotal_tax_a() {
        return total_tax_a;
    }

    public void setTotal_tax_a(BigDecimal total_tax_a) {
        this.total_tax_a = total_tax_a;
    }

    public BigDecimal getTotal_tax_b() {
        return total_tax_b;
    }

    public void setTotal_tax_b(BigDecimal total_tax_b) {
        this.total_tax_b = total_tax_b;
    }

    public BigDecimal getTotal_tax_c() {
        return total_tax_c;
    }

    public void setTotal_tax_c(BigDecimal total_tax_c) {
        this.total_tax_c = total_tax_c;
    }

    public BigDecimal getTotal_tax_d() {
        return total_tax_d;
    }

    public void setTotal_tax_d(BigDecimal total_tax_d) {
        this.total_tax_d = total_tax_d;
    }

    public String getMrc() {
        return mrc;
    }

    public void setMrc(String mrc) {
        this.mrc = mrc;
    }

    public String getControle_identifaction() {
        return controle_identifaction;
    }

    public void setControle_identifaction(String controle_identifaction) {
        this.controle_identifaction = controle_identifaction;
    }

    public Integer getCompteur_schema_controleur() {
        return compteur_schema_controleur;
    }

    public void setCompteur_schema_controleur(Integer compteur_schema_controleur) {
        this.compteur_schema_controleur = compteur_schema_controleur;
    }

    public Integer getCompteur_total_controuleur() {
        return compteur_total_controuleur;
    }

    public void setCompteur_total_controuleur(Integer compteur_total_controuleur) {
        this.compteur_total_controuleur = compteur_total_controuleur;
    }

    public Date getDate_heure_controleur() {
        return date_heure_controleur;
    }

    public void setDate_heure_controleur(Date date_heure_controleur) {
        this.date_heure_controleur = date_heure_controleur;
    }

    public Date getDate_controleur() {
        return date_controleur;
    }

    public void setDate_controleur(Date date_controleur) {
        this.date_controleur = date_controleur;
    }

    public String getHarchage_document() {
        return harchage_document;
    }

    public void setHarchage_document(String harchage_document) {
        this.harchage_document = harchage_document;
    }

    public String getSignature_controleur() {
        return signature_controleur;
    }

    public void setSignature_controleur(String signature_controleur) {
        this.signature_controleur = signature_controleur;
    }

    public String getDonneecontrole_controleur() {
        return donneecontrole_controleur;
    }

    public void setDonneecontrole_controleur(String donneecontrole_controleur) {
        this.donneecontrole_controleur = donneecontrole_controleur;
    }

    public String getSignaturepublique_controleur() {
        return signaturepublique_controleur;
    }

    public void setSignaturepublique_controleur(String signaturepublique_controleur) {
        this.signaturepublique_controleur = signaturepublique_controleur;
    }

    public String getNom_commercial() {
        return nom_commercial;
    }

    public void setNom_commercial(String nom_commercial) {
        this.nom_commercial = nom_commercial;
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

    public String getEntete1() {
        return entete1;
    }

    public void setEntete1(String entete1) {
        this.entete1 = entete1;
    }

    public String getEntete2() {
        return entete2;
    }

    public void setEntete2(String entete2) {
        this.entete2 = entete2;
    }

    public String getEntete3() {
        return entete3;
    }

    public void setEntete3(String entete3) {
        this.entete3 = entete3;
    }

    public String getPieds1() {
        return pieds1;
    }

    public void setPieds1(String pieds1) {
        this.pieds1 = pieds1;
    }

    public String getPieds2() {
        return pieds2;
    }

    public void setPieds2(String pieds2) {
        this.pieds2 = pieds2;
    }

    public String getPieds3() {
        return pieds3;
    }

    public void setPieds3(String pieds3) {
        this.pieds3 = pieds3;
    }

    public int getIfu_client() {
        return ifu_client;
    }

    public void setIfu_client(int ifu_client) {
        this.ifu_client = ifu_client;
    }

    public String getNom_client() {
        return nom_client;
    }

    public void setNom_client(String nom_client) {
        this.nom_client = nom_client;
    }

    public String getAdresse1_client() {
        return adresse1_client;
    }

    public void setAdresse1_client(String adresse1_client) {
        this.adresse1_client = adresse1_client;
    }

    public String getAdresse2_client() {
        return adresse2_client;
    }

    public void setAdresse2_client(String adresse2_client) {
        this.adresse2_client = adresse2_client;
    }

    public String getContact1_client() {
        return contact1_client;
    }

    public void setContact1_client(String contact1_client) {
        this.contact1_client = contact1_client;
    }

    public String getContact2_client() {
        return contact2_client;
    }

    public void setContact2_client(String contact2_client) {
        this.contact2_client = contact2_client;
    }

    public String getPayement() {
        return payement;
    }

    public void setPayement(String payement) {
        this.payement = payement;
    }

    public BigDecimal getMontant_payement() {
        return montant_payement;
    }

    public void setMontant_payement(BigDecimal montant_payement) {
        this.montant_payement = montant_payement;
    }

    public String getOperateur() {
        return operateur;
    }

    public void setOperateur(String operateur) {
        this.operateur = operateur;
    }

    public String getReference_remboursement() {
        return reference_remboursement;
    }

    public void setReference_remboursement(String reference_remboursement) {
        this.reference_remboursement = reference_remboursement;
    }

    public BigDecimal getAib() {
        return aib;
    }

    public void setAib(BigDecimal aib) {
        this.aib = aib;
    }

    public BigDecimal getMontant_aib() {
        return montant_aib;
    }

    public void setMontant_aib(BigDecimal montant_aib) {
        this.montant_aib = montant_aib;
    }

    public BigDecimal getTax_specifique_a() {
        return tax_specifique_a;
    }

    public void setTax_specifique_a(BigDecimal tax_specifique_a) {
        this.tax_specifique_a = tax_specifique_a;
    }

    public BigDecimal getTax_specifique_b() {
        return tax_specifique_b;
    }

    public void setTax_specifique_b(BigDecimal tax_specifique_b) {
        this.tax_specifique_b = tax_specifique_b;
    }

    public BigDecimal getTax_specifique_c() {
        return tax_specifique_c;
    }

    public void setTax_specifique_c(BigDecimal tax_specifique_c) {
        this.tax_specifique_c = tax_specifique_c;
    }

    public BigDecimal getTax_specifique_d() {
        return tax_specifique_d;
    }

    public void setTax_specifique_d(BigDecimal tax_specifique_d) {
        this.tax_specifique_d = tax_specifique_d;
    }

    public BigDecimal getTotal_tax_specifique() {
        return total_tax_specifique;
    }

    public void setTotal_tax_specifique(BigDecimal total_tax_specifique) {
        this.total_tax_specifique = total_tax_specifique;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public boolean isCalcul() {
        return calcul;
    }

    public void setCalcul(boolean calcul) {
        this.calcul = calcul;
    }

    public BigDecimal getTauxtax_e() {
        return tauxtax_e;
    }

    public void setTauxtax_e(BigDecimal tauxtax_e) {
        this.tauxtax_e = tauxtax_e;
    }

    public BigDecimal getTauxtax_f() {
        return tauxtax_f;
    }

    public void setTauxtax_f(BigDecimal tauxtax_f) {
        this.tauxtax_f = tauxtax_f;
    }

    public BigDecimal getTotal_e() {
        return total_e;
    }

    public void setTotal_e(BigDecimal total_e) {
        this.total_e = total_e;
    }

    public BigDecimal getTotal_f() {
        return total_f;
    }

    public void setTotal_f(BigDecimal total_f) {
        this.total_f = total_f;
    }

    public BigDecimal getTaxable_e() {
        return taxable_e;
    }

    public void setTaxable_e(BigDecimal taxable_e) {
        this.taxable_e = taxable_e;
    }

    public BigDecimal getTaxable_f() {
        return taxable_f;
    }

    public void setTaxable_f(BigDecimal taxable_f) {
        this.taxable_f = taxable_f;
    }

    public BigDecimal getTotal_tax_e() {
        return total_tax_e;
    }

    public void setTotal_tax_e(BigDecimal total_tax_e) {
        this.total_tax_e = total_tax_e;
    }

    public BigDecimal getTotal_tax_f() {
        return total_tax_f;
    }

    public void setTotal_tax_f(BigDecimal total_tax_f) {
        this.total_tax_f = total_tax_f;
    }

    public String getAdresse3() {
        return adresse3;
    }

    public void setAdresse3(String adresse3) {
        this.adresse3 = adresse3;
    }

    public String getContact3() {
        return contact3;
    }

    public void setContact3(String contact3) {
        this.contact3 = contact3;
    }

    public BigDecimal getTax_specifique_e() {
        return tax_specifique_e;
    }

    public void setTax_specifique_e(BigDecimal tax_specifique_e) {
        this.tax_specifique_e = tax_specifique_e;
    }

    public BigDecimal getTax_specifique_f() {
        return tax_specifique_f;
    }

    public void setTax_specifique_f(BigDecimal tax_specifique_f) {
        this.tax_specifique_f = tax_specifique_f;
    }
    
    

}
