package group3_2111652_2110819_2220923_2220044_marriageregisteroffice;

import group3_2111652_2110819_2220923_2220044_marriageregisteroffice.zafir.ItAdmin;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ArrayList;
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
    private void registerButtonOnClick(ActionEvent event) throws IOException, ClassNotFoundException {
        // Validations and verifications
        if (userTypeComboBox.getValue() == null) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Please select a user type.");
            a.showAndWait();
            System.out.println("Please select a user type.");
            return;
        }
        
        if ((usernameTextField.getText().trim()).equals("") || usernameTextField.getText().equals(null)) {
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
        
        if (!passwordField.getText().equals(passwordAgainFiled.getText())) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Password and confirmation password dose not match");
            a.showAndWait();
            System.err.println("Password and confirmation password dose not match");
            return;
        }
        
        // Check if username exists
        // True means username is unique
        if (!User.isUniqueUsername(usernameTextField.getText().trim())) {
            // Username is not unique
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Username taken, please use another one");
            a.showAndWait();
            System.err.println("Username taken, please use another one");
            return;
        }
        
        
        // Create user depending on what is selected in comboboxs
        if (userTypeComboBox.getValue() == "Marriage Registrar"){
            
        }
        else if (userTypeComboBox.getValue() == "IT Admin") {
            ItAdmin itAdmin = new ItAdmin(usernameTextField.getText(),
                                          passwordField.getText(),
                                          userTypeComboBox.getValue());
            
            if (itAdmin.saveUser("bin/itAdmin.bin"))
            {
                User.saveUsername(usernameTextField.getText().trim());
            }
        }
        
        // Change the scene to the login scene
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
