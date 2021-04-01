package com.emcef.model.Centres;

import com.emcef.model.Contribuable.Contribuables;
import com.emcef.model.Installations;
import java.util.Vector;

public class Secteurs {
	private int _id;
	private String _nom;
	public District _id_district;
	public Vector<Contribuables> _contribuables = new Vector<Contribuables>();
	public Vector<Installations> _installations = new Vector<Installations>();
}