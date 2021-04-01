package com.emcef.model.Centres;

import com.emcef.model.Contribuable.Contribuables;
import java.util.Vector;

public class Centres_fiscaux {
	private int _id;
	private String _nom;
	public Vector<Contribuables> _contribuables = new Vector<Contribuables>();
}