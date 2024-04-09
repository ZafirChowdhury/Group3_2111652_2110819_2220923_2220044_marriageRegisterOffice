/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package group3_2111652_2110819_2220923_2220044_marriageregisteroffice;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author zafir
 */
public class LoginController implements Initializable {

    @FXML
    private TextField usernameTextFiled;
    @FXML
    private TextField passwordField;
    @FXML
    private ComboBox<String> userTypeComboBox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        userTypeComboBox.getItems().addAll("Marriage Registrar", "IT Admin", "Marriage Candidate", "Marriage Counselor",
                                            "Legal Advisor", "Accountant", "Witness", "Archivist");
    }    

    @FXML
    private void registerButtonOnClick(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("register.fxml"));
        Scene registerationScene = new Scene(root);
        
        // Get stage
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        
        stage.setScene(registerationScene);
        stage.setTitle("Register");
    }

    @FXML
    private void loginButtonOnClick(ActionEvent event) throws IOException {
        // Validations and verifications
        if (userTypeComboBox.getValue() == null) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Please select a user type.");
            a.showAndWait();
            System.out.println("Please select a user type.");
            return;
        }
        
        if ((usernameTextFiled.getText().trim()).equals("") || usernameTextFiled.getText().equals(null)) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Please enter a username.");
            a.showAndWait();
            System.out.println("Please enter a username.");
            return;
        }
        
        if (passwordField.getText().length() < 6) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Password must be at least 6 characters long");
            a.showAndWait();
            System.err.println("Password must be at least 6 characters long");
            return;
        }
        
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = null;
        if(userTypeComboBox.getValue().equals("Marriage Candidate")) {
            loader = new FXMLLoader(getClass().getResource("/Arpita/MarriageCandidateHomepage.fxml"));
        }
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        stage.setTitle("Marriage Candidate");

        
        
        // User.verifyUser("", "", "bin/itAdmin.bin");
        
    }
    
}
