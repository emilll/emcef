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
@Table( name = "messagelogserveur")
public class MessageLogServeur {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@OneToOne
	MessageServeur messageServeur;
	
	@Column( name = "date_heure")
	private Date date_heure;

	@Column( name = "bc_identification")
	private String bc_identification;

	@Column( name = "compte_encours")
	private Integer compte_encours;

	@Column( name = "total_compte")
	private Integer total_compte;

	
}