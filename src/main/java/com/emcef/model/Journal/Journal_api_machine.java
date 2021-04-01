package com.emcef.model.Journal;

import com.emcef.model.Types_acces_distance;
import java.util.Date;

public class Journal_api_machine {
	private int _id;
	private Date _debut_connexion;
	private Date _fin_connexion;
	private Integer _taille_requette;
	private Integer _taille_reponse;
	private Boolean _status;
	private String _identification_machine;
	private Integer _id_donnee_demande_distance;
	public Types_acces_distance _id_type_acces_distance;
}