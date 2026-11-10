/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.guichet_automatique;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author franc
 */
public class GestionnaireGuichetTest {
    
    public GestionnaireGuichetTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @org.junit.jupiter.api.Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ValiderUtilisateur method, of class GestionnaireGuichet.
     */
    @Test
    public void testValiderUtilisateur() {
        System.out.println("ValiderUtilisateur");
        int codeClient = 0;
        int nip = 0;
        GestionnaireGuichet instance = null;
        Client expResult = null;
        Client result = instance.ValiderUtilisateur(codeClient, nip);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of RetraitCheque method, of class GestionnaireGuichet.
     */
    @Test
    public void testRetraitCheque() {
        System.out.println("RetraitCheque");
        int codeClient = 0;
        float montant = 0.0F;
        GestionnaireGuichet instance = null;
        instance.RetraitCheque(codeClient, montant);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of RetraitEpargne method, of class GestionnaireGuichet.
     */
    @Test
    public void testRetraitEpargne() {
        System.out.println("RetraitEpargne");
        int codeClient = 0;
        int numeroCompte = 0;
        float montant = 0.0F;
        GestionnaireGuichet instance = null;
        instance.RetraitEpargne(codeClient, numeroCompte, montant);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of DepotCheque method, of class GestionnaireGuichet.
     */
    @Test
    public void testDepotCheque() {
        System.out.println("DepotCheque");
        int codeClient = 0;
        float montant = 0.0F;
        GestionnaireGuichet instance = null;
        instance.DepotCheque(codeClient, montant);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of DepotEpargne method, of class GestionnaireGuichet.
     */
    @Test
    public void testDepotEpargne() {
        System.out.println("DepotEpargne");
        int codeClient = 0;
        float montant = 0.0F;
        GestionnaireGuichet instance = null;
        instance.DepotEpargne(codeClient, montant);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of PaiementFacture method, of class GestionnaireGuichet.
     */
    @Test
    public void testPaiementFacture() {
        System.out.println("PaiementFacture");
        int codeClient = 0;
        float montant = 0.0F;
        GestionnaireGuichet instance = null;
        instance.PaiementFacture(codeClient, montant);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of TransferFonds method, of class GestionnaireGuichet.
     */
    @Test
    public void testTransferFonds() {
        System.out.println("TransferFonds");
        int codeClient = 0;
        int numeroCompte = 0;
        float montant = 0.0F;
        String typeCompte = "";
        GestionnaireGuichet instance = null;
        instance.TransferFonds(codeClient, numeroCompte, montant, typeCompte);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AfficherSoldeCompte method, of class GestionnaireGuichet.
     */
    @Test
    public void testAfficherSoldeCompte() {
        System.out.println("AfficherSoldeCompte");
        GestionnaireGuichet instance = null;
        float expResult = 0.0F;
        float result = instance.AfficherSoldeCompte();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of creerClient method, of class GestionnaireGuichet.
     */
    @Test
    public void testCreerClient() {
        System.out.println("creerClient");
        String nom = "";
        String prenom = "";
        String telephone = "";
        int numeroNIP = 0;
        GestionnaireGuichet instance = null;
        Client expResult = null;
        Client result = instance.creerClient(nom, prenom, telephone, numeroNIP);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of creerCompte method, of class GestionnaireGuichet.
     */
    @Test
    public void testCreerCompte() {
        System.out.println("creerCompte");
        double solde = 0.0;
        double retraitMaximum = 0.0;
        double montantTransfertMaximum = 0.0;
        GestionnaireGuichet instance = null;
        Compte expResult = null;
        Compte result = instance.creerCompte(solde, retraitMaximum, montantTransfertMaximum);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
