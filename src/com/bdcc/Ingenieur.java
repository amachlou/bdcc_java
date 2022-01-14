package com.bdcc;

import java.util.ArrayList;
import java.util.List;

public class Ingenieur extends Salarie {
	
	private int grade;
	
	//----------------------------------------------------
	private  List<Projet> projets = new ArrayList<Projet>();
	
	public List<Projet> getProjets() {
		return projets;
	}
	
	public void setProjets(List<Projet> projets) {
		this.projets = projets;
	}
	//----------------------------------------------------
	
	public Ingenieur() {
		// TODO Auto-generated constructor stub
	}
	
	public Ingenieur(String nom, String prenom, double salaireBase, int nbEnfant, String telephone, int grade) {
		super(nom, prenom, salaireBase, nbEnfant, telephone);
		this.grade = grade;
	}


	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getGrade() {
		return grade;
	}
	
	@Override
	public void getDetails() {
		// TODO Auto-generated method stub
		super.getDetails();
	}
	
	public double getMissionByMonth(int month){
		double primes = 0;
		for(Mission mission : getMissions()) {
			if (mission.getDateMission().getMonth() == month) {
				primes += mission.getPrime();
			}
		}
		return primes;
	}
	
	public double getPrimeProjetRealise(){
		double primes = 0;
		for(Projet projet : getProjets()) { 
				primes += projet.getPrime();
			 
		}
		return primes;
	}

	public void CalculerSalaire(int month) {
		// salaireNet=salairedebase+nbEnfant*300+ primes des missions concernant le mois en question + prime des projets réalisés
		double salaireNet = getSalaireBase() + getNbEnfant()*300 + getMissionByMonth(month) + getPrimeProjetRealise();
		setSalaireNet(salaireNet);
	}

	@Override
	public void CalculerSalaire() {
		// TODO Auto-generated method stub
		
	}
	
}
