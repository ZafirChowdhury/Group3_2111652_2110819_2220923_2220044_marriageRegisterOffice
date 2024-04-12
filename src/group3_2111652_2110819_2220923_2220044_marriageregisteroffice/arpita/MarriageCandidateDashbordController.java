/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package group3_2111652_2110819_2220923_2220044_marriageregisteroffice.arpita;

import group3_2111652_2110819_2220923_2220044_marriageregisteroffice.User;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author zafir
 */
public class MarriageCandidateDashbordController implements Initializable {

    @FXML
    private Label usernameLable;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  
    
    MarriageCandidate user;
    public void receiveUserData(User user){
        user = (MarriageCandidate) user;
        usernameLable.setText("You are logged in as: " + user.getUsername());
        System.out.println(user.toString());
        return;
    }

    @FXML
    private void submitMarriageApplicationOnClick(ActionEvent event) {
    }
    
}
