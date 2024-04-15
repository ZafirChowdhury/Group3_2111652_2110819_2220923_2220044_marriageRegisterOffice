/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package group3_2111652_2110819_2220923_2220044_marriageregisteroffice.sufi;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author User
 */
public class ProvideFeedbackController implements Initializable {

    @FXML
    private Label userNameL;
    @FXML
    private TextArea feedbackTA;
    @FXML
    private Label marriageIDL;
    private String marriageID;
    private String username, pass, type;
    private Witness w = new Witness("x", "y", "z");

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void submitFeedback(MouseEvent event) throws IOException {
        w.confirmFeedback(marriageID, username, feedbackTA.getText());
        w.dashboardScene(event, username, pass, type);
    }

    void init(DummyMarriageSufi m, String b, String c, String d) {
        String a = m.getMarriageID();
        marriageIDL.setText("Marriage ID: "+a);
        userNameL.setText("User Name: "+b);
        marriageID = a;
        username = b;
        pass = c;
        type = d;
    }
    
}
