/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.guichet_automatique;

/**
 *
 * @author grego
 */
public class Compte {
    private int numeroCompte;
    private int codeClient;
    private double soldeCompte;
    private double retraitMaximum;
    private double montantTransfertMaximum;
    private static int cpt = 1;

    public Compte(int numeroCompte, int codeClient, double soldeCompte, double retraitMaximum, double montantTransfertMaximum) {
        this.numeroCompte = cpt;
        this.codeClient = codeClient;
        this.soldeCompte = soldeCompte;
        this.retraitMaximum = retraitMaximum;
        this.montantTransfertMaximum = montantTransfertMaximum;
    }
    
    public boolean retirer(double montant) {
        if (montant <= soldeCompte && montant % 10 == 0 && montant <= 1000) {
            this.setSoldeCompte(this.soldeCompte -= montant);
        } else if(montant > soldeCompte || montant % 10 != 0 || montant > 1000) {
            return false;
        }
        return true;
    }
    
    public void depot (double montant) {
        this.setSoldeCompte(soldeCompte + montant);
        
    }

    public int getNumeroCompte() {
        return numeroCompte;
    }

    public int getCodeClient() {
        return codeClient;
    }

    public double getSoldeCompte() {
        return soldeCompte;
    }

    public void setNumeroCompte(int numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public void setCodeClient(int codeClient) {
        this.codeClient = codeClient;
    }

    public void setSoldeCompte(double soldeCompte) {
        this.soldeCompte = soldeCompte;
    }

    public void setRetraitMaximum(double retraitMaximum) {
        this.retraitMaximum = retraitMaximum;
    }

    public void setMontantTransfertMaximum(double montantTransfertMaximum) {
        this.montantTransfertMaximum = montantTransfertMaximum;
    }
    
    

    @Override
    public String toString() {
        return "Compte{" + "numeroCompte=" + numeroCompte + ", codeClient=" + codeClient + ", soldeCompte=" + soldeCompte + ", retraitMaximum=" + retraitMaximum + ", montantTransfertMaximum=" + montantTransfertMaximum + '}';
    }
    
    
}
