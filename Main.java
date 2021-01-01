package com.comptebancaire;

import java.util.ArrayList;
import java.util.List;


public class Main {
	public static void main(String[]args) {
	CompteBancaire compte = new CompteBancaire("Paul",300.0);
	System.out.println(compte.toString());
	
	// depot d'un montant de 240 dollars
	System.out.println("depot de 240 dollars:");
		compte.Depot(240.0);
		System.out.println(compte.toString());
		// retrait de 50 dollars
		System.out.println("Retrait de 50 dollars:");
		compte.Retrait(50);
		System.out.println(compte.toString());
		// creation d'un deuxieme compte
	
	CompteBancaire compte1 = new CompteBancaire("Sophie",200d);
	System.out.println(compte1.toString());
	// creation d'un compte epargne
	ComptEpargne epargne=new ComptEpargne("Elisabeth", 200d);
	System.out.println(epargne.toString());
	
	
	System.out.println("Depot de 100 dollars:");
	epargne.Depot(100d);
	System.out.println(epargne.toString());
	System.out.println("Retrait de 60 dollars");
	epargne.Retrait(60);
	System.out.println("Nouveau solde apres retrait de 60 dollars");
	System.out.println(epargne.toString());		
	// creation d'un compte Payant
	ComptePayant payant= new ComptePayant("Etienne", 200d);
	System.out.println(payant.toString());
	payant.Deposer(100d);
	System.out.println("Solde apres depot de 100 dollars et 5 dollars de frais");
	System.out.println();
	System.out.println(payant.toString());
	System.out.println();
	System.out.println("nouveau solde apres retrait de 100 dollars:");
	payant.retirer(100d);
	System.out.println(payant.toString());
	
	
	// creation d'un ogbje banque
	List<CompteBancaire> banque = new ArrayList<CompteBancaire>();
	banque.add(compte);
	banque.add(epargne);
	banque.add(payant);
	System.out.println("L'ensemble des Clients de la banque:");
	System.out.println();
	for (CompteBancaire bank :banque)
		System.out.println(bank); 
	
	}
}
