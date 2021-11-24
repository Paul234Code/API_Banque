package com.comptebancaire.src.src.main.java;

import com.comptebancaire.src.src.main.java.CompteBancaire;

public class ComptePayant extends CompteBancaire {
	 private static  double frais = 5;

	/**
	 * 
	 */
	public ComptePayant() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param owner
	 * @param solde
	 */
	public ComptePayant(String owner, double solde) {
		super(owner, solde);
		// TODO Auto-generated constructor stub
	}
	public  void Deposer( double montant) {
		super.Depot(montant);
		super.Retrait(frais);
	}
	public void retirer( double montant) {
		super.Retrait(montant);
		super.Retrait(frais);
	}

	@Override
	public String toString() {
		return super.toString() +" frais du transfert : " + frais;
	}

}
