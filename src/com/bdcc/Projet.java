package com.bdcc;

public class Projet {
	
	private String nom;
	private double budget;
	private double prime;
	
	public Projet() {
		// TODO Auto-generated constructor stub
	}
	
	public Projet(String nom, double budget, double prime) {
		super();
		this.nom = nom;
		this.budget = budget;
		this.prime = prime;
	}

	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public double getBudget() {
		return budget;
	}
	public void setBudget(double budget) {
		this.budget = budget;
	}
	
	public double getPrime() {
		return prime;
	}
	public void setPrime(double prime) {
		this.prime = prime;
	}

}
