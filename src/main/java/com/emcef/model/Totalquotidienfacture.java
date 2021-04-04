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
@Table(name = "Totalquotidienfacture")

public class Totalquotidienfacture {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@OneToOne
	Machinesenregistrees machinesenregistrees;

	@Column(name = "total_date")
	private Date total_date;

	@Column(name = "status")
	private Boolean status;

	@Column(name = "ns_tauxtax_a")
	private BigDecimal ns_tauxtax_a;

	@Column(name = "ns_tauxtax_b")
	private BigDecimal ns_tauxtax_b;

	@Column(name = "ns_tauxtax_c")
	private BigDecimal ns_tauxtax_c;

	@Column(name = "ns_tauxtax_d")
	private BigDecimal ns_tauxtax_d;

	@Column(name = "ns_total")
	private BigDecimal ns_total;

	@Column(name = "ns_compte")
	private Integer ns_compte;

	@Column(name = "ns_total_a")
	private BigDecimal ns_total_a;

	@Column(name = "ns_total_b")
	private BigDecimal ns_total_b;

	@Column(name = "ns_total_c")
	private BigDecimal ns_total_c;

	@Column(name = "ns_total_d")
	private BigDecimal ns_total_d;

	@Column(name = "ns_total_tax_a")
	private BigDecimal ns_total_tax_a;

	@Column(name = "ns_total_tax_b")
	private BigDecimal ns_total_tax_b;

	@Column(name = "ns_total_tax_c")
	private BigDecimal ns_total_tax_c;

	@Column(name = "ns_total_tax_d")
	private BigDecimal ns_total_tax_d;

	@Column(name = "ns_total_taxable_a")
	private BigDecimal ns_total_taxable_a;

	@Column(name = "ns_total_taxable_b")
	private BigDecimal ns_total_taxable_b;

	@Column(name = "ns_total_taxable_c")
	private BigDecimal ns_total_taxable_c;

	@Column(name = "ns_total_taxable_d")
	private BigDecimal ns_total_taxable_d;

	@Column(name = "nr_compte")
	private Integer nr_compte;

	@Column(name = "nr_tauxtax_a")
	private BigDecimal nr_tauxtax_a;

	@Column(name = "nr_tauxtax_b")
	private BigDecimal nr_tauxtax_b;

	@Column(name = "nr_tauxtax_c")
	private BigDecimal nr_tauxtax_c;

	@Column(name = "nr_tauxtax_d")
	private BigDecimal nr_tauxtax_d;

	@Column(name = "nr_total_a")
	private BigDecimal nr_total_a;

	@Column(name = "nr_total_b")
	private BigDecimal nr_total_b;

	@Column(name = "nr_total_c")
	private BigDecimal nr_total_c;

	@Column(name = "nr_total_d")
	private BigDecimal nr_total_d;

	@Column(name = "nr_totaltax")
	private BigDecimal nr_totaltax;

	@Column(name = "nr_totaltax_a")
	private BigDecimal nr_totaltax_a;

	@Column(name = "nr_totaltax_b")
	private BigDecimal nr_totaltax_b;

	@Column(name = "nr_totaltax_c")
	private BigDecimal nr_totaltax_c;

	@Column(name = "nr_totaltax_d")
	private BigDecimal nr_totaltax_d;

	@Column(name = "nr_totaltaxable_a")
	private BigDecimal nr_totaltaxable_a;

	@Column(name = "nr_totaltaxable_b")
	private BigDecimal nr_totaltaxable_b;

	@Column(name = "nr_totaltaxable_c")
	private BigDecimal nr_totaltaxable_c;

	@Column(name = "nr_totaltaxable_d")
	private BigDecimal nr_totaltaxable_d;



	// les getter 


}