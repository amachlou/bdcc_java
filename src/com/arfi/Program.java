package com.arfi;

import java.util.Date;

import com.arfi.entities.HeurSup;
import com.arfi.entities.Ingenieur;
import com.arfi.entities.Mission;
import com.arfi.entities.Projet;
import com.arfi.entities.Technicien;

public class Program {

	public static void main(String[] args) {

		Mission mission1 = new Mission("Designe et conception du projet", 70);
		Mission mission2 = new Mission("implementation et mesur", 120);

		Projet projet1 = new Projet("Maroc vert", 12000, 500);
		Projet projet2 = new Projet("Projet d;autoroute R1", 6000, 250);

		HeurSup heurSup1 = new HeurSup(10);
		HeurSup heurSup2 = new HeurSup(5);
		
		Technicien technicien = new Technicien("Batma", "Larbi", 3000, 3, "0616996563", 13);

		Ingenieur ingenieur = new Ingenieur("Saidii", "Hassan", 4000, 3, "09865433", 4);
		
//		Salaire d'ingenieur
		ingenieur.getMissions().add(mission1);
		ingenieur.getProjets().add(projet1);
		ingenieur.CalculerSalaire(new Date().getMonth());

		System.out.println("------- Fich de paye d'íngenieur ");
		System.out.println("------- Nom Complete: "+ingenieur.getNom()+" "+ingenieur.getPrenom());
		System.out.println("Projet :: "+ingenieur.getProjets().get(0).getNom());
		System.out.println("Mission :: "+ingenieur.getMissions().get(0).getNom());
		System.out.println("Salaire d'íngenieur :: "+ingenieur.getSalaireNet()+"DH");
		
//		Salaire de technicien
		technicien.getMissions().add(mission2);
		technicien.CalculerSalaire(0);

		System.out.println();
		System.out.println("------------------------------------");
		System.out.println();
		
		System.out.println("------- Fich de paye technicien ");
		System.out.println("------- Nom Complete: "+technicien.getNom()+" "+technicien.getPrenom());
		System.out.println("Mission :: "+technicien.getMissions().get(0).getNom());
		System.out.println("Salaire de technicien :: "+technicien.getSalaireNet()+"DH");
		
//		TODO To customize the displaying messages
	}

}
