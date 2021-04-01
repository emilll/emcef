package com.emcef.model;

import com.emcef.model.Machines.Machines_enregistrees;

public class Cles {
	private int _id;
	private String _cle_chiffrement;
	private String _cle_signature;
	private String _cle_interne;
	private String _ec384pub;
	private String _ec384priv;
	private String _rsa2048priv;
	private String _rsa4096pub;
	private String _rsa4096priv;
	public Machines_enregistrees _id_machine;
}