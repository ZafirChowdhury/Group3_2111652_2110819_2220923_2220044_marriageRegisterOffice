/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package group3_2111652_2110819_2220923_2220044_marriageregisteroffice.sufi;

import java.net.URL;
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
public class ViewFeedbackController implements Initializable {

    @FXML
    private Label userNameL;
    @FXML
    private Label feedbackL;
    @FXML
    private Label marriageIDL;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    void init(Feedback f) {
        userNameL.setText("User Name: "+f.getUsername());
        feedbackL.setText(f.getFeedback());
        marriageIDL.setText("Marriage ID: "+f.getMarriageID());
    }

    
}
