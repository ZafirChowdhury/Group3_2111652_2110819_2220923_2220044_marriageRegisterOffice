/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package group3_2111652_2110819_2220923_2220044_marriageregisteroffice.zafir;

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
public class AdminDashbordController implements Initializable {

    @FXML
    private Label usernameLable;
    @FXML
    private Label supportTicketCounterLable;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        usernameLable.setText("Welcome, " + currentUser.getUsername());
    }  
    
    User currentUser;
    public void receiveUserData(User user){
        currentUser = user;
        return;
    }

    @FXML
    private void viewAllUserOnClick(ActionEvent event) {
    }

    @FXML
    private void addNewUserOnClick(ActionEvent event) {
    }

    @FXML
    private void paymentRequestOnClick(ActionEvent event) {
    }

    @FXML
    private void supportTicketOnClick(ActionEvent event) {
    }
    
}
