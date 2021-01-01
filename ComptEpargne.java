package com.comptebancaire;

public class ComptEpargne extends CompteBancaire {
	private static double tauxInteret=6d;
	
	// constructeur par defaut
	public ComptEpargne(){
		super();
	}
	public ComptEpargne(String owner, double solde) {
		super(owner,solde);
		this.calculInteret();
	}
	public double calculInteret( ) {
		return this.solde*(1+ tauxInteret/100);
	}
	public String toString() {
		
		return super.toString() + ", de taux de : " + tauxInteret + ",  Nouveau Solde= " + this.calculInteret();
	}

}
