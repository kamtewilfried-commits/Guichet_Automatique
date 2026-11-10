/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guichet_automatique;

/**
 *
 * @author franc
 */
public class Epargne extends Compte {
    private double tauxInteret = 0.01;

    public Epargne(int numeroCompte, int codeClient, double soldeCompte, double retraitMaximum, double montantTransfertMaximum) {
        super(numeroCompte, codeClient, soldeCompte, retraitMaximum, montantTransfertMaximum);
    }
    
    public void paiementInteret() {
        this.setSoldeCompte(tauxInteret*this.getSoldeCompte());
    }
    
     @Override
    public String toString() {
        return "Epargne{" + " Numero de compte: " + this.getNumeroCompte() + " Code Client: " + this.getCodeClient() + " Solde: " + this.getSoldeCompte() + '}';
    }
    
    
    
}
