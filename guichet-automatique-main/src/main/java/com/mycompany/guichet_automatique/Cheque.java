/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guichet_automatique;

/**
 *
 * @author franc
 */
public class Cheque extends Compte {
    private double fraisPaiementFacture = 1.25;
    private double montantFactureMaximum;

    public Cheque(int numeroCompte, int codeClient, double soldeCompte, double montantFactureMaximum, double retraitMaximum, double montantTransfertMaximum) {
        super(numeroCompte, codeClient, soldeCompte, retraitMaximum, montantTransfertMaximum);
        this.montantFactureMaximum = montantFactureMaximum;
    }
    
    
    public void paiementFacture(double montant) {
        
        this.setSoldeCompte(this.getSoldeCompte() - (montant + this.fraisPaiementFacture));
    }

    @Override
    public String toString() {
        return "Cheque{" + " Numero de compte: " + this.getNumeroCompte() + " Code Client: " + this.getCodeClient() + " Solde: " + this.getSoldeCompte() + '}';
    }
    
    
    
    
}
