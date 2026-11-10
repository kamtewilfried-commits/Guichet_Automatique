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
public class Transaction {
   private int numeroTransaction;
   private double montant;
   private Compte compte;
   private Compte compteTransfert;
   private String type;
   private static int cpt = 1;

    public Transaction( double montant, Compte compte, Compte compteTransfert, String type) {
        this.numeroTransaction = cpt;
        this.montant = montant;
        this.compte = compte;
        this.compteTransfert = compteTransfert;
        this.type = type;
        cpt++;
    }

    @Override
    public String toString() {
        return "Transaction{" + "numeroTransaction=" + numeroTransaction + ", montant=" + montant + ", compte=" + compte + ", compteTransfert=" + compteTransfert + ", type=" + type + '}';
    }
   
   
}
