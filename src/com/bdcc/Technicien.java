package com.bdcc;

import java.util.ArrayList;
import java.util.List;

public class Technicien extends Salarie {
	
	private double montantHSup;
	
	//----------------------------------------------------
	private List<HeurSup> heurs = new ArrayList<HeurSup>();
	
	public List<HeurSup> getHeurs() {
		return heurs;
	}
	public void setHeurs(List<HeurSup> heurs) {
		this.heurs = heurs;
	}
	//----------------------------------------------------
	
	public Technicien() {
		// TODO Auto-generated constructor stub
	}
	
	public Technicien(String nom, String prenom, double salaireBase, int nbEnfant, String telephone, double montantHSup) {
		super(nom, prenom, salaireBase, nbEnfant, telephone);
		this.montantHSup = montantHSup;
	}

	public double getMontantHSup() {
		return montantHSup;
	}
	public void setMontantHSup(double montantHSup) {
		this.montantHSup = montantHSup;
	}
	
	@Override
	public void CalculerSalaire() {
		// TODO Auto-generated method stub
		
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
	
	public double getMontantHeurSupByMonth(int month){
		double montantTotal = 0;
		for(HeurSup heurSup : heurs) {
			if (heurSup.getDate().getMonth() == month) {
				montantTotal += heurSup.getNbrHeurs()*getMontantHSup();
			}
		}
		return montantTotal;
	}
	
	public void CalculerSalaire(int month) {
		// salaireNet=salairedebase+nbEnfant*300+ primes des missions concernant le mois en question + le montant total des heures sup réalisés dans le mois en questions
		double salaireNet = getSalaireBase() + getNbEnfant()*300 + getMissionByMonth(month) + getMontantHeurSupByMonth(month);
		setSalaireNet(salaireNet);
	}
	
}
