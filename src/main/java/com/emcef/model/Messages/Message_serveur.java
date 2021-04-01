package com.emcef.model.Messages;

import java.util.Date;
import java.util.Vector;

public class Message_serveur {
	private int _id;
	private Boolean _active;
	private Integer _compte_repete;
	private Integer _compte_veille_repete;
	private Date _date_debut;
	private Date _date_fin;
	private String _filtre;
	private String _entete;
	private String _text;
	private String _pieds;
	public Vector<Message_log_serveur> _message_log_serveur = new Vector<Message_log_serveur>();
}