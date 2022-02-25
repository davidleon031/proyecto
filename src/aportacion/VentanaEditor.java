/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package aportacion;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class VentanaEditor extends Application {
        @Override
    public void start(Stage stage) {
        
        //Label
        Label lblEditor = new Label("Editor");
        lblEditor.setFont(new Font(15));
        VBox.setMargin(lblEditor, new Insets(20, 0, 0, 30));
        
        Label lblNombreHeroe = new Label("Nombre del super Heroe");
        lblNombreHeroe.setFont(new Font(15));
        VBox.setMargin(lblNombreHeroe, new Insets(10, 0, 0, 30));
        
        Label lblAlterEgo = new Label("Alter ego");
        lblAlterEgo.setFont(new Font(15));
        VBox.setMargin(lblAlterEgo, new Insets(10, 0, 0, 30));
        
        Label lblPrimerPubli = new Label("Primer publicacion");
        lblPrimerPubli.setFont(new Font(15));
        VBox.setMargin(lblPrimerPubli, new Insets(10, 0, 0, 30));
        
        Label lblPersonaje = new Label("Personaje");
        lblPersonaje.setFont(new Font(15));
        VBox.setMargin(lblPersonaje, new Insets(10, 0, 0, 30));
        
        //Barra Desplegable
        
        ComboBox<String> cmbEditor = new ComboBox<>();
        cmbEditor.getItems().addAll("Marvel", "DC Comics");
        VBox.setMargin(cmbEditor, new Insets(5, 0, 0, 30));
        
        //Texto
        
        TextField txtNombreHeroe = new TextField();
        txtNombreHeroe.setMaxWidth(175);
        VBox.setMargin(txtNombreHeroe, new Insets(5, 0, 0, 30));
        txtNombreHeroe.setFont(new Font(15));
        
        TextField txtAlterEgo = new TextField();
        txtAlterEgo.setMaxWidth(175);
        VBox.setMargin(txtAlterEgo, new Insets(5, 0, 0, 30));
        txtAlterEgo.setFont(new Font(15));
        
        TextField txtPrimerPublic = new TextField();
        txtPrimerPublic.setMaxWidth(175);
        VBox.setMargin(txtPrimerPublic, new Insets(5, 0, 0, 30));
        txtPrimerPublic.setFont(new Font(15));
        
        TextField txtPersonaje = new TextField();
        txtPersonaje.setMaxWidth(175);
        VBox.setMargin(txtPersonaje, new Insets(5, 0, 0, 30));
        txtPersonaje.setFont(new Font(15));
        
        
        //Boton
        
        Button btnGuardar = new Button("Guardar");
        btnGuardar.setCursor(Cursor.HAND);
        btnGuardar.setFont(new Font(15));
        VBox.setMargin(btnGuardar, new Insets(10, 0, 50, 90));
        
        
        
        VBox root = new VBox();
        root.getChildren().addAll(lblEditor, cmbEditor, lblNombreHeroe, txtNombreHeroe, lblAlterEgo, txtAlterEgo, 
                lblPrimerPubli, txtPrimerPublic, lblPersonaje, txtPersonaje, btnGuardar);
        
        
        Scene scene = new Scene(root, 300, 400);
        
        stage.setTitle("Ventana Heroe");
        stage.setScene(scene);
        stage.show();
    }

   
    public static void main(String[] args) {
        launch(args);
    }
    
}
