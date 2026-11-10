/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guichet_automatique;

/**
 *
 * @author franc
 */
public class Banque extends Compte {
    
    private final double montantMaximum = 20000;
    private double montantRemplissage;
    private double montantGuichet;
    
    public Banque(int numeroCompte, int codeClient, double soldeCompte, double montantRemplissage, double retraitMaximum, double montantTransfertMaximum) {
        super(numeroCompte, codeClient, soldeCompte, retraitMaximum, montantTransfertMaximum);
        this.montantRemplissage = montantRemplissage;
        this.montantGuichet = montantGuichet;
    }
     
    
    public void remplirGuichet(){
        
        if ((montantGuichet + montantRemplissage )<= montantMaximum){
                montantGuichet += this.getSoldeCompte() + montantRemplissage;
        } else {
            System.out.println("La capacité maximale du guichet (" + montantMaximum + "$).");
        }
    }
    
    public double getmontantGuichet(){
        return montantGuichet;
    }
    
    public double getmontantRemplissage(){
        return montantRemplissage;
    }
            
    @Override
    public String toString() {
        return "Banque : solde actuel = " + getSoldeCompte() + " $, " +
                "montantGuichet = " + getmontantGuichet() + " $, remplissage = " 
                + getmontantRemplissage() + "$";    }
    
    }
