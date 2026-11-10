/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.guichet_automatique;

import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author franc
 */
public class Guichet extends Application {
     public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Connection.fxml")); //TRANSFORME LE FICHIER SAMPLE EN OBJET
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.setTitle("Guichet Automatique");
        stage.show();
    }
  
    public static void main(String[] args) {
        launch(args);
    }
    
}
