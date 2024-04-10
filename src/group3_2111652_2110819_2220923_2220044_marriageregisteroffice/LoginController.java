/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package group3_2111652_2110819_2220923_2220044_marriageregisteroffice;

import group3_2111652_2110819_2220923_2220044_marriageregisteroffice.arpita.MarriageCandidateDashbordController;
import group3_2111652_2110819_2220923_2220044_marriageregisteroffice.arpita.MarriageCounselorDashbordController;
import group3_2111652_2110819_2220923_2220044_marriageregisteroffice.sadia.Accountant_DashboardController;
import group3_2111652_2110819_2220923_2220044_marriageregisteroffice.sadia.LegalAdvisor_DashboardController;
import group3_2111652_2110819_2220923_2220044_marriageregisteroffice.sufi.ArchivistDashboardController;
import group3_2111652_2110819_2220923_2220044_marriageregisteroffice.sufi.WitnessDashboardController;
import group3_2111652_2110819_2220923_2220044_marriageregisteroffice.zafir.AdminDashbordController;
import group3_2111652_2110819_2220923_2220044_marriageregisteroffice.zafir.MarriageRegistrarDashbordController;
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
            System.out.println("Password must be at least 6 characters long");
            return;
        }
        
        // User Verification
        User user = User.verifyUser(usernameTextFiled.getText().trim(), ((String) passwordField.getText()).trim(), User.getPath(userTypeComboBox.getValue()));
        if (user == null) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Incorrect passowrd or username, please try again");
            a.showAndWait();
            System.out.println("Incorrect passowrd or username, please try again");
            return;
        }
        
        // IT Admin - Zafir
        else if (userTypeComboBox.getValue().equals("IT Admin")) {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("zafir/adminDashbord.fxml"));
            Parent root = loader.load(); 
            
            AdminDashbordController adminDashbordController = loader.getController();
            adminDashbordController.receiveUserData(user);
            
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show(); 
        }
        
        // Marriage Registrar - Zafir
        else if (userTypeComboBox.getValue().equals("Marriage Registrar")) {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("zafir/marriageRegistrarDashbord.fxml"));
            Parent root = loader.load(); 
            
            MarriageRegistrarDashbordController marriageRegistrarDashbordController  = loader.getController();
            marriageRegistrarDashbordController.receiveUserData(user);
            
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        }
        
        // Witness - Sufi
        else if (userTypeComboBox.getValue().equals("Witness")) {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("sufi/witnessDashboard.fxml"));
            Parent root = loader.load(); 
            
            WitnessDashboardController witnessDashboardController = loader.getController();
            witnessDashboardController.receiveUserData(user);
            
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        }
        
        // Archivist - Sufi
        else if (userTypeComboBox.getValue().equals("Archivist")) {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("sufi/archivistDashboard.fxml"));
            Parent root = loader.load(); 
            
            ArchivistDashboardController archivistDashboardController = loader.getController();
            archivistDashboardController.receiveUserData(user);
            
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        }
        
        // Accountant - Sadia
        else if (userTypeComboBox.getValue().equals("Accountant")) {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("sadia/Accountant_Dashboard.fxml"));
            Parent root = loader.load(); 
            
            Accountant_DashboardController accountant_DashboardController = loader.getController();
            accountant_DashboardController.receiveUserData(user);
            
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        }
        
        // Legal Advisor - Sadia
        else if (userTypeComboBox.getValue().equals("Legal Advisor")) {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("sadia/LegalAdvisor_Dashboard.fxml"));
            Parent root = loader.load(); 
            
            LegalAdvisor_DashboardController legalAdvisor_DashboardController = loader.getController();
            legalAdvisor_DashboardController.receiveUserData(user);
            
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        }
        
        // Marriage Candidate - Arpita
        else if (userTypeComboBox.getValue().equals("Marriage Candidate")) {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("arpita/marriageCandidateDashbord.fxml"));
            Parent root = loader.load(); 
            
            MarriageCandidateDashbordController marriageCandidateDashbordController = loader.getController();
            marriageCandidateDashbordController.receiveUserData(user);
            
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        }
        
        // Marriage Counselor - Arpita
        else if (userTypeComboBox.getValue().equals("Marriage Counselor")) {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("arpita/marriageCounselorDashbord.fxml"));
            Parent root = loader.load(); 
            
            MarriageCounselorDashbordController marriageCounselorDashbordController = loader.getController();
            marriageCounselorDashbordController.receiveUserData(user);
            
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        }
    }
    
    
    
}

/*
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("zafir/adminDashbord.fxml"));
            Parent root = loader.load(); 
            
            AdminDashbordController adminDashbordController = loader.getController();
            adminDashbordController.receiveUserData(user);
            
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();

            ADD THIS CODE TO YOUR DASHBORD CONTROLLR to recive the user obj
                User user;
                public void receiveUserData(User user){
                    userNameLable.setText("You are logged in as: " + user.getUsername());
                    System.out.println(user.toString());
                    return;
                }
*/
