package com.emcef.model.Centres;

import java.util.Vector;

public class District {
	private int _id;
	private String _nom;
	public Province _id_province;
	public Vector<Secteurs> _secteurs = new Vector<Secteurs>();
}