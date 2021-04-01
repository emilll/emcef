package com.emcef.model;

import com.emcef.model.Journal.Journal_api_machine;
import java.util.Vector;

public class Types_acces_distance {
	private int _id;
	private String _nom;
	private String _controlleur;
	private Boolean _visible;
	public Vector<Journal_api_machine> _journal_api_machine = new Vector<Journal_api_machine>();
}