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
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author User
 */
public class AddMarriageRecordController implements Initializable {

    @FXML
    private TextField candidate1L;
    @FXML
    private TextField age1L;
    @FXML
    private TextField nationality1L;
    @FXML
    private TextField NID1L;
    @FXML
    private TextField father1L;
    @FXML
    private TextField mother1L;
    @FXML
    private TextField witness1L;
    @FXML
    private TextField rel1L;
    @FXML
    private TextField candidate2L;
    @FXML
    private TextField age2L;
    @FXML
    private TextField nationality2L;
    @FXML
    private TextField NID2L;
    @FXML
    private TextField father2L;
    @FXML
    private TextField mother2L;
    @FXML
    private TextField witness2L;
    @FXML
    private TextField rel2L;
    @FXML
    private TextField marriageIDL;
    private Archivist a = new Archivist("x","y","z");

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void logout(MouseEvent event) throws IOException {
        a.logoutScene(event);
    }

    @FXML
    private void dashboard(MouseEvent event) throws IOException {
        a.dashboardScene(event);
    }

    @FXML
    private void submitMarriageRecord(MouseEvent event) throws IOException {
       a.addMarriageRecordToFile(event,Integer.parseInt(marriageIDL.getText()),candidate1L.getText(),Integer.parseInt(age1L.getText()),
               nationality1L.getText(),Integer.parseInt(NID1L.getText()),father1L.getText(),mother1L.getText(),witness1L.getText(),rel1L.getText(),
               candidate2L.getText(),Integer.parseInt(age2L.getText()),nationality2L.getText(),Integer.parseInt(NID2L.getText()),father2L.getText(),
               mother2L.getText(),witness2L.getText(),rel2L.getText());
    }
    
}
