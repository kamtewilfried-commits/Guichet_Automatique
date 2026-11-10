/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guichet_automatique;

/**
 *
 * @author franc
 */
public class Marge extends Compte {
    private double tauxInteret;

    public Marge(double tauxInteret, int numeroCompte, int codeClient, double soldeCompte, double retraitMaximum, double montantTransfertMaximum) {
        super(numeroCompte, codeClient, soldeCompte, retraitMaximum, montantTransfertMaximum);
        this.tauxInteret = tauxInteret;
    }
    
    public void augmenterSoldeMarge(double montant) {
        this.setSoldeCompte(this.getSoldeCompte() + montant);
    }

    @Override
    public String toString() {
        return "Marge{" + "tauxInteret=" + tauxInteret + '}';
    }
}
