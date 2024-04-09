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
public class ArchivistDashboardController implements Initializable {

    @FXML
    private Label nameLabel;
    @FXML
    private Label idLabel;
    private Archivist archivist=new Archivist("abc","abc","abc");

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    Archivist user;
    public void receiveUserData(User user){
        user = (Archivist) user;
        nameLabel.setText("Name: " + user.getUsername());
        System.out.println("Logged in as: " + user.toString());
        return;
    }

    @FXML
    private void addMarriageRecord(MouseEvent event) throws IOException {
        archivist.addMarriageRecordScene(event);
    }

    @FXML
    private void verifyMarriageRecords(MouseEvent event) throws IOException {
        archivist.verifyMarriageRecordsScene(event);
    }

    @FXML
    private void updateMarriageRecords(MouseEvent event) throws IOException {
        archivist.updateMarriageRecordsScene(event);
    }

    @FXML
    private void verifyMaritalStatus(MouseEvent event) throws IOException {
        archivist.verifyMaritalStatusScene(event);
    }

    @FXML
    private void viewMarriageStatistics(MouseEvent event) throws IOException {
        archivist.viewMarriageStatisticsScene(event);
    }

    @FXML
    private void viewOfficialRequests(MouseEvent event) throws IOException {
        archivist.viewOfficialRequestsScene(event);
    }

    @FXML
    private void viewFeedback(MouseEvent event) throws IOException {
        archivist.viewFeedbackScene(event);
    }

    @FXML
    private void backupRecords(MouseEvent event) throws IOException {
        archivist.backupRecords(event);
    }

    @FXML
    private void logout(MouseEvent event) throws IOException {
        archivist.logoutScene(event);
    }
    
}
