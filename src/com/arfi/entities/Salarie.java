package com.arfi.entities;

import java.util.ArrayList;
import java.util.List;

public abstract class Salarie {

	private String nom;
	private String prenom;
	private double salaireBase;
	private int nbEnfant;
	private double SalaireNet;
	private String telephone;
	
	//----------------------------------------------------
	
	private List<Mission> missions = new ArrayList<Mission>();
	
	public List<Mission> getMissions() {
		return missions;
	}
	
	public void setMissions(List<Mission> missions) {
		this.missions = missions;
	}
	
	//----------------------------------------------------

	public Salarie() {
		// TODO Auto-generated constructor stub
	}

	public Salarie(String nom, String prenom, double salaireBase, int nbEnfant, String telephone) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.salaireBase = salaireBase;
		this.nbEnfant = nbEnfant;
		this.telephone = telephone;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public double getSalaireBase() {
		return salaireBase;
	}

	public void setSalaireBase(double salaireBase) {
		this.salaireBase = salaireBase;
	}

	public int getNbEnfant() {
		return nbEnfant;
	}

	public void setNbEnfant(int nbEnfant) {
		this.nbEnfant = nbEnfant;
	}

	public double getSalaireNet() {
		return SalaireNet;
	}

	public void setSalaireNet(double salaireNet) {
		SalaireNet = salaireNet;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public abstract void CalculerSalaire();
	
	public void getDetails() {
	}
}
