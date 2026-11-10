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
public class Client {
   private int codeClient ; 
   private String nom;
   private  String prenom;
   private  String telephone;
   private int numeroNIP;

    public Client(int codeClient, String nom, String prenom, String telephone, int numeroNIP) {
        this.codeClient = codeClient;
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.numeroNIP = numeroNIP;
    }

    public int getCodeClient() {
        return codeClient;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getNumeroNIP() {
        return numeroNIP;
    }
    
    

    @Override
    public String toString() {
        return "Client{" + "codeClient=" + codeClient + ", nom=" + nom + ", prenom=" + prenom + ", telephone=" + telephone + ", numeroNIP=" + numeroNIP + '}';
    }
    
    
    
}
