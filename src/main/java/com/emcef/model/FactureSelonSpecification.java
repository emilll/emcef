package com.emcef.model;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "factureselonspecifiaction")
public class FactureSelonSpecification {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "dateheure")
	private Date date_time;

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

	@Column(name = "date_requette")
	private Date date_requette;

	@Column(name = "numero_execution")
	private int numero_execution;

	@Column(name = "Infodate")
	private Date info_date;

	@Column(name = "ifu")
	private String ifu;

	@Column(name = "taux_tax_a")
	private BigDecimal taux_tax_a;

	@Column(name ="taux_tax_b")
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
	private String ifu_client;

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

	
}