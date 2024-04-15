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
import javafx.collections.ObservableList;
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
    private String username, pass, type;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public void receiveUserData(User user){
        username = user.getUsername();
        pass = user.getPassword();
        type = user.getType();
        ObservableList<Archivist> al = null;
        try {
            al = archivist.getArchivistRecords();
            for(Archivist ax: al){
                if(ax.getUsername().equals(username)){
                    nameLabel.setText("Name: " + ax.getName());
                    idLabel.setText("ID: "+ax.getArchivistID());
                }
            }
        } catch (IOException ex) {
        }
    }

    @FXML
    private void addMarriageRecord(MouseEvent event) throws IOException {
        archivist.addMarriageRecordScene(event, username, pass, type);
    }

    @FXML
    private void updateProfile(MouseEvent event) throws IOException {
        archivist.updateProfileScene(event, username, pass, type);
    }

    @FXML
    private void updateMarriageRecords(MouseEvent event) throws IOException {
        archivist.updateMarriageRecordsScene(event, username, pass, type);
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
        archivist.viewFeedbackScene(event, username, pass, type);
    }

    @FXML
    private void backupRecords(MouseEvent event) throws IOException {
        archivist.backupRecords(event, username, pass, type);
    }

    @FXML
    private void logout(MouseEvent event) throws IOException {
        archivist.logoutScene(event);
    }

    void init(String a, String b, String c) {
        username = a;
        pass = b;
        type = c;
        ObservableList<Archivist> al = null;
        try {
            al = archivist.getArchivistRecords();
            for(Archivist ax: al){
                if(ax.getUsername().equals(username)){
                    nameLabel.setText("Name: " + ax.getName());
                    idLabel.setText("ID: "+ax.getArchivistID());
                }
            }
        } catch (IOException ex) {
        }
    }
    
}
