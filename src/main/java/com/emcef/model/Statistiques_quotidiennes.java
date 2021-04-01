package com.emcef.model;

import java.math.BigDecimal;
import java.util.Date;

public class Statistiques_quotidiennes {
	private int _id;
	private Date _date;
	private Date _date_time;
	private Integer _rapport_machine;
	private Integer _machine_active;
	private Integer _machine_activee;
	private Integer _machine_enregistree;
	private Integer _total_machine_enregistree;
	private Integer _connexion_serveur;
	private Integer _donnee_recue;
	private Integer _donnee_envoyer;
	private Integer _recus;
	private Integer _vente_recus;
	private Integer _rembousement_recus;
	private BigDecimal _total;
	private BigDecimal _totaltax;
}