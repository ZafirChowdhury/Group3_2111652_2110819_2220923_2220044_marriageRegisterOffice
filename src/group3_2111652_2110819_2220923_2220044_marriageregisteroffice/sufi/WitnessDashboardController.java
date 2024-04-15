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
public class WitnessDashboardController implements Initializable {

    @FXML
    private Label nameLabel;
    @FXML
    private Label idLabel;
    private Witness witness=new Witness("abc","abc","abc");
    private String username, pass, type;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
    
   
    public void receiveUserData(User user){
        username = user.getUsername();
        pass = user.getPassword();
        type = user.getType();
        ObservableList<Witness> wl = null;
        try {
            wl = witness.getWitnessRecords();
            for(Witness w: wl){
            if(w.getUsername().equals(username)){
                nameLabel.setText("Name: " + w.getName());
                idLabel.setText("ID: "+w.getWitnessID());
            }
        }
        } catch (IOException ex) {
        }
    }

    @FXML
    private void confirmWeddingAttendance(MouseEvent event) throws IOException {
        witness.confirmWeddingAttendanceScene(event);
    }

    @FXML
    private void updateProfile(MouseEvent event) throws IOException {
        witness.updateProfileScene(event,username, pass, type);
    }

    @FXML
    private void signWitnessForm(MouseEvent event) throws IOException {
        witness.signWitnessFormScene(event, username, pass, type);
    }

    @FXML
    private void viewMarriageCertificates(MouseEvent event) throws IOException {
        witness.viewMarriageCertificatesScene(event, username, pass, type);
    }

    @FXML
    private void viewWeddingDetails(MouseEvent event) throws IOException {
        witness.viewWeddingDetailsScene(event, username, pass, type);
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
        witness.provideFeedbackScene(event, username, pass, type);
    }

    @FXML
    private void logout(MouseEvent event) throws IOException {
        witness.logoutScene(event);
    }
    
    public void init(String a, String b, String c){
        username = a;
        pass = b;
        type = c;
        ObservableList<Witness> wl = null;
        try {
            wl = witness.getWitnessRecords();
            for(Witness w: wl){
            if(w.getUsername().equals(username)){
                nameLabel.setText("Name: " + w.getName());
                idLabel.setText("ID: "+w.getWitnessID());
            }
        }
        } catch (IOException ex) {
        }
    }
    
}
