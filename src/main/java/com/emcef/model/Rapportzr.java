package com.emcef.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Rapportzr")
public class Rapportzr {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@ManyToOne
	Machinesenregistrees machinesenregistrees;


	@Column(name = "date_heure")
	private Date date_heure;

	@Column(name = "date_heure_rapport")
	private Date date_heure_rapport;

	@Column(name = "cr_rapport")
	private Integer cr_rapport;

	// @Column(name = "id_doc")
	// private Integer id_doc;

	@Column(name = "ifu")
	private String ifu;

	@Column(name = "tauxtax_a")
	private BigDecimal tauxtax_a;

	@Column(name = "tauxtax_b")
	private BigDecimal tauxtax_b;

	@Column(name = "tauxtax_c")
	private BigDecimal tauxtax_c;

	@Column(name = "tauxtax_d")
	private BigDecimal tauxtax_d;

	@Column(name = "tauxtax_e")
	private BigDecimal tauxtax_e;

	@Column(name = "tauxtax_f")
	private BigDecimal tauxtax_f;

	@Column(name = "tauxtax_aib_a")
	private BigDecimal tauxtax_aib_a;

	@Column(name = "tauxtax_aid_b")
	private BigDecimal tauxtax_aid_b;

	@Column(name = "compte_rapport_journalier")
	private Integer compte_rapport_journalier;

	@Column(name = "compte_rapport_change")
	private Integer compte_rapport_change;

	@Column(name = "compte_vente_normal")
	private Integer compte_vente_normal;

	@Column(name = "compte_remboursement_normal")
	private Integer compte_remboursement_normal;

	@Column(name = "compte_copie_vente")
	private Integer compte_copie_vente;

	@Column(name = "compte_copie_remboursement_normal")
	private Integer compte_copie_remboursement_normal;

	@Column(name = "compte_vente_exportation")
	private Integer compte_vente_exportation;

	@Column(name = "compte_remboursement_exportation")
	private Integer compte_remboursement_exportation;

	@Column(name = "compte_copie_vente_exportation")
	private Integer compte_copie_vente_exportation;

	@Column(name = "compte_copie_remboursement_exportation")
	private Integer compte_copie_remboursement_exportation;

	@Column(name = "montant_a")
	private BigDecimal montant_a;

	@Column(name = "montant_b")
	private BigDecimal montant_b;

	@Column(name = "montant_c")
	private BigDecimal montant_c;

	@Column(name = "montant_d")
	private BigDecimal montant_d;

	@Column(name = "montant_e")
	private BigDecimal montant_e;

	@Column(name = "montant_f")
	private BigDecimal montant_f;

	@Column(name = "montant_taxable_a")
	private BigDecimal montant_taxable_a;

	@Column(name = "montant_taxable_b")
	private BigDecimal montant_taxable_b;

	@Column(name = "montant_taxable_c")
	private BigDecimal montant_taxable_c;

	@Column(name = "montant_taxable_d")
	private BigDecimal montant_taxable_d;

	@Column(name = "montant_taxable_e")
	private BigDecimal montant_taxable_e;

	@Column(name = "montant_taxable_f")
	private BigDecimal montant_taxable_f;

	@Column(name = "montant_tax_a")
	private BigDecimal montant_tax_a;

	@Column(name = "montant_tax_b")
	private BigDecimal montant_tax_b;

	@Column(name = "montant_tax_c")
	private BigDecimal montant_tax_c;

	@Column(name = "montant_tax_d")
	private BigDecimal montant_tax_d;

	@Column(name = "montant_tax_e")
	private BigDecimal montant_tax_e;

	@Column(name = "montant_tax_f")
	private BigDecimal montant_tax_f;

	@Column(name = "montant_tax_aib_a")
	private BigDecimal montant_tax_aib_a;

	@Column(name = "montant_tax_aib_b")
	private BigDecimal montant_tax_aib_b;

	@Column(name = "montant_ts_a")
	private BigDecimal montant_ts_a;

	@Column(name = "montant_ts_b")
	private BigDecimal montant_ts_b;

	@Column(name = "montant_ts_c")
	private BigDecimal montant_ts_c;

	@Column(name = "montant_ts_d")
	private BigDecimal montant_ts_d;

	@Column(name = "montant_ts_e")
	private BigDecimal montant_ts_e;

	@Column(name = "montant_ts_f")
	private BigDecimal montant_ts_f;

	@Column(name = "sw_version")
	private String sw_version;

	@Column(name = "tr_pen_date")
	private Date tr_pen_date;

	@Column(name = "tr_pen_ta")
	private BigDecimal tr_pen_ta;

	@Column(name = "tr_pen_tb")
	private BigDecimal tr_pen_tb;

	@Column(name = "tr_pen_tc")
	private BigDecimal tr_pen_tc;

	@Column(name = "tr_pen_td")
	private BigDecimal tr_pen_td;

	@Column(name = "tr_pen_te")
	private BigDecimal tr_pen_te;

	@Column(name = "tr_pen_tf")
	private BigDecimal tr_pen_tf;

	@Column(name = "tr_pen_aib_a")
	private BigDecimal tr_pen_aib_a;

	@Column(name = "tr_pen_aid_b")
	private BigDecimal tr_pen_aid_b;

	@Column(name = "fw_pen_date")
	private Date fw_pen_date;

	@Column(name = "fw_pen_current_version")
	private String fw_pen_current_version;

	@Column(name = "fw_pen_new_version")
	private String fw_pen_new_version;

	public Rapportzr() {
	}

	
}