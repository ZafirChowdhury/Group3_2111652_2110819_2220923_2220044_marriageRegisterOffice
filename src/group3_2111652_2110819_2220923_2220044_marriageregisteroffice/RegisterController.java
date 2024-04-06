package group3_2111652_2110819_2220923_2220044_marriageregisteroffice;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class RegisterController implements Initializable {

    @FXML
    private TextField usernameTextField;
    @FXML
    private ComboBox<String> userTypeComboBox;
    @FXML
    private PasswordField passwordField;
    @FXML
    private PasswordField passwordAgainFiled;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        userTypeComboBox.getItems().addAll("Marriage Registrar", "IT Admin", "Marriage Candidate", "Marriage Counselor",
                                            "Legal Advisor", "Accountant", "Witness", "Archivist");
    }    

    @FXML
    private void registerButtonOnClick(ActionEvent event) throws IOException {
        // TODO CREATE USER
        if (userTypeComboBox.getValue() != null) {
            // Show alart
            return;
        }
        
        if (passwordField.getText().length() < 6) {
            // Show munimum password lenth alart
            return;
        }
        
        if (passwordField.getText() != passwordAgainFiled.getText()) {
            // Show password dosent match alart
            return;
        }
        
        // Check username and save user instance 
        File file;
        FileOutputStream fos;
        ObjectOutputStream oos;
        
        if (userTypeComboBox.getValue() == "Marriage Registrar"){
            
        }
        else if (userTypeComboBox.getValue() == "IT Admin") {
            file = new File("itAdmin.bin");
            
        }
        
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        Scene loginScene = new Scene(root);
        
        // Get stage
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        
        stage.setScene(loginScene);
        stage.setTitle("login");
    }

    @FXML
    private void backButtonOnClick(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        Scene loginScene = new Scene(root);
        
        // Get stage
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        
        stage.setScene(loginScene);
        stage.setTitle("login");
    }
    
}
