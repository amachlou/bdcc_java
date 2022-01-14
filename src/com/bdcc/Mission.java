package com.bdcc;

import java.util.Date;

public class Mission {
	
	private String nom;
	private double prime;
	private Date dateMission;
	
	public Mission() {
		// TODO Auto-generated constructor stub
	}
	
	public Mission(String nom, double prime) {
		super();
		this.nom = nom;
		this.prime = prime;
		this.dateMission = new Date();
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public double getPrime() {
		return prime;
	}
	public void setPrime(double prime) {
		this.prime = prime;
	}
	
	public Date getDateMission() {
		return dateMission;
	}
	public void setDateMission(Date dateMission) {
		this.dateMission = dateMission;
	}
}
