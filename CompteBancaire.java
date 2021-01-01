package com.comptebancaire;

public class CompteBancaire {
	protected double solde;
	protected String owner;
	private static int codeidentication = (int)(Math.random()*100);
	
	// constructeur  par defaut de la classe
	public CompteBancaire() {
		super();
	}
	public CompteBancaire(String owner, double solde) {
		this.owner= owner;
		this.solde= solde;
		codeidentication++;
		
	}
	public String getowner() {
		return this.owner;
	}
	public double getSolde() {
		return this.solde;
	}
	public static int getCode() {
		return codeidentication;
	}
	public void Depot( double  montant) {
		this.solde += montant;
	}
	public void Retrait( double montant) {
		this.solde -= montant;
	}
    public String toString() {
    	return "[ Proprietaire= " + this.getowner() + ",  Balance= " + this.getSolde() +
    			", NumeroDeCompte : " +CompteBancaire.getCode() +"]";
    }
}
