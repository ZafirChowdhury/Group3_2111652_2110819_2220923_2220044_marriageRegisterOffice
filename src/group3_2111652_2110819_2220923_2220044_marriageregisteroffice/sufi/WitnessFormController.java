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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author User
 */
public class WitnessFormController implements Initializable {

    @FXML
    private TextField candidate1;
    @FXML
    private TextField relTo;
    @FXML
    private TextField candidate2;
    @FXML
    private TextField rel;
    @FXML
    private TextArea witnessStatementTA;
    private String username;
    private String pass;
    private String type;
    private Witness w = new Witness("x","y","z");

    /**
     * Initializes the controller class.
     */
    
    public void init(String a, String b, String c){
        username = a;
        pass = b;
        type = c;
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void logout(MouseEvent event) throws IOException {
        w.logoutScene(event);
    }

    @FXML
    private void dashboard(MouseEvent event) throws IOException {
        w.dashboardScene(event, username, pass, type);
    }

    @FXML
    private void submitWitnessForm(MouseEvent event) throws IOException {
        w.submitWitnessFormScene(username, candidate1.getText(), candidate2.getText(), relTo.getText(), rel.getText(), witnessStatementTA.getText());
        w.dashboardScene(event, username, pass, type);
    }
    
}
