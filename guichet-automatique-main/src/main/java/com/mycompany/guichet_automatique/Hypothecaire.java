/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guichet_automatique;

/**
 *
 * @author franc
 */
public class Hypothecaire extends Compte {
    
    
    
    public Hypothecaire(int numeroCompte, int codeClient, double soldeCompte, double retraitMaximum, double montantTransfertMaximum) {
      super(numeroCompte, codeClient, soldeCompte, retraitMaximum, montantTransfertMaximum);
    }
    
    public boolean preleverMontantHypotheque(double montant) {
        if(montant > this.getSoldeCompte()) {
            return false;
    } else {
            this.setSoldeCompte(this.getSoldeCompte() - montant);
        }
        return true;
        
    }
    
    @Override
    public String toString() {
        return "Hypothecaire{" + " Numero de compte: " + this.getNumeroCompte() + " Code Client: " + this.getCodeClient() + " Solde: " + this.getSoldeCompte() + '}';
    }
    
      
}
