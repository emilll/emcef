package com.emcef.model.Journal;

import com.emcef.model.Machines.Machines_enregistrees;
import com.emcef.model.Rapport.Rapport_etat_technique;
import java.util.Date;

public class Journal_tentative_activation {
	private int _id;
	private Date _date_heure;
	private int _status;
	private String _message;
	public Machines_enregistrees _id_machine_enregistree;
	public Rapport_etat_technique _rapport_etat_technique;
}