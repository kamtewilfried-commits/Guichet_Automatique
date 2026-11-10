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
public class Facture {
    private String destinataire;
    private int codeClient, numeroFacture;
    private boolean isPayee;
    private float montant;

    public Facture(String destinataire, int codeClient, int numeroFacture, boolean isPayee, float montant) {
        this.destinataire = destinataire;
        this.codeClient = codeClient;
        this.numeroFacture = numeroFacture;
        this.isPayee = isPayee;
        this.montant = montant;
    }

    public String getDestinataire() {
        return destinataire;
    }

    public int getCodeClient() {
        return codeClient;
    }

    public int getNumeroFacture() {
        return numeroFacture;
    }

    public boolean isPayee() {
        return isPayee;
    }

    public void setDestinataire(String destinataire) {
        this.destinataire = destinataire;
    }

    public void setCodeClient(int codeClient) {
        this.codeClient = codeClient;
    }

    public void setNumeroFacture(int numeroFacture) {
        this.numeroFacture = numeroFacture;
    }

    public void setPayee(boolean isPayee) {
        this.isPayee = isPayee;
    }

    public void setMontant(float montant) {
        this.montant = montant;
    }

    public double getMontant() {
        return montant;
    }
}
