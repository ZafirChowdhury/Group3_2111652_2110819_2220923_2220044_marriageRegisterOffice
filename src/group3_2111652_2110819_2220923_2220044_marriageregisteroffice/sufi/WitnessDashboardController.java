/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package group3_2111652_2110819_2220923_2220044_marriageregisteroffice.sufi;

import group3_2111652_2110819_2220923_2220044_marriageregisteroffice.User;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author User
 */
public class WitnessDashboardController implements Initializable {

    @FXML
    private Label nameLabel;
    @FXML
    private Label idLabel;
    private Witness witness=new Witness("abc","abc","abc");

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    Witness user;
    public void receiveUserData(User user){
        user = (Witness) user;
        nameLabel.setText("Name: " + user.getUsername());
        System.out.println("Logged in as: " + user.toString());
        return;
    }

    @FXML
    private void confirmWeddingAttendance(MouseEvent event) throws IOException {
        witness.confirmWeddingAttendanceScene(event);
    }

    @FXML
    private void updateProfile(MouseEvent event) throws IOException {
        witness.updateProfileScene(event);
    }

    @FXML
    private void signWitnessForm(MouseEvent event) throws IOException {
        witness.signWitnessFormScene(event);
    }

    @FXML
    private void viewMarriageCertificates(MouseEvent event) throws IOException {
        witness.viewMarriageCertificatesScene(event);
    }

    @FXML
    private void viewWeddingDetails(MouseEvent event) throws IOException {
        witness.viewWeddingDetailsScene(event);
    }

    @FXML
    private void viewWeddingHistory(MouseEvent event) throws IOException {
        witness.viewWeddingHistoryScene(event);
    }

    @FXML
    private void viewNotifications(MouseEvent event) throws IOException {
        witness.viewNotificationsScene(event);
    }

    @FXML
    private void provideFeedback(MouseEvent event) throws IOException {
        witness.provideFeedbackScene(event);
    }

    @FXML
    private void logout(MouseEvent event) throws IOException {
        witness.logoutScene(event);
    }
    
}
