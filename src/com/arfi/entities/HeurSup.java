package com.arfi.entities;

import java.util.Date;

public class HeurSup {
	
	private Date date;
	private double nbrHeurs;
	
	public HeurSup() {
		this.date = new Date();
	}
	
	
	
	public HeurSup(double nbrHeurs) {
		super();
		this.date = new Date();
		this.nbrHeurs = nbrHeurs;
	}



	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	public double getNbrHeurs() {
		return nbrHeurs;
	}
	public void setNbrHeurs(double nbrHeurs) {
		this.nbrHeurs = nbrHeurs;
	}

}
