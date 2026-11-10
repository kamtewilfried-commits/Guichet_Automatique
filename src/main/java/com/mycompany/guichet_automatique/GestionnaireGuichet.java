/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guichet_automatique;

import java.util.ArrayList;

/**
 *
 * @author franc
 */
public class GestionnaireGuichet {
    private Compte banque;
    private ArrayList<Client> clients;
    private ArrayList<Cheque> comptesCheque;
    private ArrayList<Epargne> comptesEpargne;
    private ArrayList<Marge> comptesMarge;
    private ArrayList<Hypothecaire> comptesHypothecaire;
    private ArrayList<Transaction> transactions;
    private ArrayList<Facture> factures;
    private float soldeCompteCourant;
    
    public GestionnaireGuichet(Compte banque, ArrayList<Client> clients, ArrayList<Cheque> comptesCheque, ArrayList<Epargne> comptesEpargne, ArrayList<Marge> comptesMarge, ArrayList<Hypothecaire> comptesHypothecaire, ArrayList<Transaction> transactions, float soldeCompteCourant) {
        this.banque = banque;
        this.clients = new ArrayList<>();
        this.comptesCheque = new ArrayList<>();
        this.comptesEpargne = new ArrayList<>();
        this.comptesMarge = new ArrayList<>();
        this.comptesHypothecaire = new ArrayList<>();
        this.transactions = new ArrayList<>();
        this.factures = new ArrayList<>();
        this.soldeCompteCourant = soldeCompteCourant;
    }
    
    public Client ValiderUtilisateur(int codeClient, int nip){
        for (Client client : clients) {
            if(client.getCodeClient() == codeClient && client.getNumeroNIP() == nip)
                return client;
        }
        return null;
    }
    
    public void RetraitCheque(int codeClient, float montant) {
        boolean resultat = false;
        for (Cheque compteCheque : comptesCheque){
            if (compteCheque.getCodeClient() == codeClient) {
                resultat = compteCheque.retirer(montant);
                if(!resultat){
                for(Marge compteMarge : comptesMarge){
                    if(compteMarge.getCodeClient() == codeClient){
                        compteMarge.augmenterSoldeMarge(montant);
                        Transaction transaction = new Transaction(montant, compteCheque, compteMarge, "marge");
                        transactions.add(transaction);
                    } else {
                        System.out.println("Le client na pas de compte Marge");
                    }
                }
            }
            }
        }
    }
     
    public void RetraitEpargne(int codeClient, int numeroCompte, float montant) {
        boolean resultat = false;
        for (Epargne compteEpargne : comptesEpargne){
            if (compteEpargne.getCodeClient() == codeClient) {
                resultat = compteEpargne.retirer(montant);
                if(!resultat){
                for(Marge compteMarge : comptesMarge){
                    if(compteMarge.getCodeClient() == codeClient){
                        compteMarge.augmenterSoldeMarge(montant);
                        Transaction transaction = new Transaction(montant, compteEpargne, compteMarge, "marge");
                        transactions.add(transaction);
                    } else {
                        System.out.println("Le client na pas de compte Marge");
                    }
                }
            }
            }
        }
    }
    
    public void DepotCheque(int codeClient, float montant) {
        for (Cheque compteCheque : comptesCheque){
            if (compteCheque.getCodeClient() == codeClient) {
                compteCheque.depot(montant);
                Transaction transaction = new Transaction(montant, compteCheque, compteCheque, "cheque");
                transactions.add(transaction);
                break;
            }
        }
    }
    
    public void DepotEpargne(int codeClient, float montant) {
        for (Epargne compteEpargne : comptesEpargne){
            if (compteEpargne.getCodeClient() == codeClient) {
                compteEpargne.depot(montant);
                Transaction transaction = new Transaction(montant, compteEpargne, compteEpargne, "marge");
                transactions.add(transaction);
                break;
            }
        }
    }
    
    public void PaiementFacture(int codeClient, float montant) {
        for (Cheque compteCheque : comptesCheque) {
            for(Facture facture : factures){
                if(facture.getCodeClient() == codeClient && compteCheque.getCodeClient() == codeClient && facture.isPayee() == false){
                    compteCheque.paiementFacture(montant);
                    facture.setPayee(true);
                }
            }
        }
    }
    
    public void TransferFonds(int codeClient, int numeroCompte, float montant, String typeCompte) {
        for (Cheque compteCheque : comptesCheque) {
            if (compteCheque.getCodeClient() == codeClient) {
                compteCheque.retirer(montant);
                if (typeCompte.toLowerCase().equals("epargne")) {
                    for (Epargne compteEpargne : comptesEpargne) {
                        if(compteEpargne.getCodeClient() == codeClient) {
                            compteEpargne.depot(montant);
                            Transaction transaction = new Transaction(montant, compteCheque, compteEpargne, "epargne");
                            
                } else if (typeCompte.toLowerCase().equals("hypothecaire")) {
                    for (Hypothecaire compteHypothecaire : comptesHypothecaire) {
                        if(compteHypothecaire.getCodeClient() == codeClient) {
                            compteHypothecaire.depot(montant);
                             Transaction transaction = new Transaction(montant, compteCheque, compteHypothecaire, "epargne");
                }
            }
        } else {
            for (Marge compteMarge : comptesMarge) {
                if(compteMarge.getCodeClient() == codeClient) {
                    compteMarge.depot(montant);
                     Transaction transaction = new Transaction(montant, compteCheque, compteMarge, "epargne");
                }
            }
        }
            }
        }
            }
        }
        
    }
    
    public float AfficherSoldeCompte(){
        return soldeCompteCourant;
    }
    
    public Client creerClient(int codeClient, String nom, String prenom, String telephone, int numeroNIP) {
        Client client = new Client(codeClient, nom, prenom, telephone, numeroNIP);
        return client;
    }
    
    public Compte creerCompte(int codeCompte, int codeClient, double solde, double retraitMaximum, double montantTransfertMaximum) {
        Compte compte = new Compte(codeCompte, codeClient, solde, retraitMaximum, montantTransfertMaximum);
        return compte;
    }
     
}
