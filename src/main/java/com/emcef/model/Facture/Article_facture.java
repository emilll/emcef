package com.emcef.model.Facture;

import com.emcef.model.Facture.Facture_selon_specification;
import java.math.BigDecimal;

public class Article_facture {
	private int _id;
	private String _nom;
	private BigDecimal _quantite;
	private BigDecimal _prix;
	private BigDecimal _prix_taxable;
	private BigDecimal _montant;
	private BigDecimal _montant_taxable;
	private Character _etiquette_group_taxation;
	private BigDecimal _taux_taxe;
	private BigDecimal _taxe;
	private BigDecimal _montant_taxe;
	private Integer _numero_ordinaire;
	private String _nom_modifier;
	private String _valeur_modifier;
	private BigDecimal _prixoriginal;
	private Boolean _est_etiquette;
	private Boolean _est_ts;
	private BigDecimal _ts_prix;
	private BigDecimal _ts_prix_taxable;
	private BigDecimal _ts_tax;
	private BigDecimal _ts_montant_tax;
	private BigDecimal _ts_montant;
	private BigDecimal _ts_montant_taxable;
	public Facture_selon_specification _id_facture_selon_specification;
}