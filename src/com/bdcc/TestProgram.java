package com.bdcc;

import java.util.Date;

public class TestProgram {

	public static void main(String[] args) {

		Mission mission1 = new Mission("Deplecement de remla mn tht l steh", 70);
		Mission mission2 = new Mission("mrtoub", 120);

		Projet projet1 = new Projet("Villa 1", 12000, 500);
		Projet projet2 = new Projet("Couri 1", 6000, 250);

		HeurSup heurSup1 = new HeurSup(10);
		HeurSup heurSup2 = new HeurSup(5);
		
		Technicien technicien = new Technicien("Batma", "Larbi", 3000, 3, "0616996563", 13);

		Ingenieur ingenieur = new Ingenieur("Saidii", "Hassan", 4000, 3, "09865433", 4);
		
//		Salaire d'ingenieur
		ingenieur.getMissions().add(mission1);
		ingenieur.getProjets().add(projet1);
		ingenieur.CalculerSalaire(new Date().getMonth());
		
		System.out.println("Salaire d'íngenieur :: "+ingenieur.getSalaireNet());
		
//		Salaire de technicien
		technicien.getMissions().add(mission2);
		technicien.CalculerSalaire(0);
		
		System.out.println("Salaire de technicien :: "+technicien.getSalaireNet());

	}

}
