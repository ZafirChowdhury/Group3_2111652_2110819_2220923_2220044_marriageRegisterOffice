/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package group3_2111652_2110819_2220923_2220044_marriageregisteroffice.arpita;

import group3_2111652_2110819_2220923_2220044_marriageregisteroffice.User;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author zafir
 */
public class MarriageCounselorDashbordController implements Initializable {

    @FXML
    private Label userNameLable;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 
    
    MarriageCounselor user;
    public void receiveUserData(User user){
        user = (MarriageCounselor) user;
        userNameLable.setText("You are logged in as: " + user.getUsername());
        System.out.println(user.toString());
        return;
    }
    
}
