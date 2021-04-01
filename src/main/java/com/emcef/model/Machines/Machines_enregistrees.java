package com.emcef.model.Machines;

import com.emcef.model.Certificats_enregistres;
import com.emcef.model.Cles;
import com.emcef.model.Fabricant.Fabriquant_approuvees;
import com.emcef.model.Facture.Total_quotidien_facture;
import com.emcef.model.Journal.Journal_tentative_activation;
import com.emcef.model.Rapport.Rapport_etat_technique;
import com.emcef.model.Rapport.Rapport_zr;
import java.util.Date;
import java.util.Vector;

public class Machines_enregistrees {
	private int _id;
	private String _identification;
	private Date _date_heure;
	private String _derniere_version;
	private String _commentaire;
	private String _analyseur;
	public Certificats_enregistres _id_certificats_enregistres;
	public Fabriquant_approuvees _id_fabriquant_approuve;
	public Models_machines _id_model_machine;
	public Etat_machine _id_etat_machine;
	public Vector<Cles> _cles = new Vector<Cles>();
	public Vector<Commandes_machines> _commandes_machines = new Vector<Commandes_machines>();
	public Vector<Historique_etat_machine> _historique_etat_machine = new Vector<Historique_etat_machine>();
	public Vector<Journal_tentative_activation> _journal_tentative_activation = new Vector<Journal_tentative_activation>();
	public Vector<Machines_installees> _machines_installees = new Vector<Machines_installees>();
	public Vector<Rapport_etat_technique> _rapport_etat_technique = new Vector<Rapport_etat_technique>();
	public Vector<Rapport_zr> _rapport_zr = new Vector<Rapport_zr>();
	public Vector<Total_quotidien_facture> _total_quotidien_facture = new Vector<Total_quotidien_facture>();
}