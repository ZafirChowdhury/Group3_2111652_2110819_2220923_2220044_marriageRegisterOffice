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
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author User
 */
public class UpdateMarriageRecordConfirmController implements Initializable {

    @FXML
    private Label marriageRecordIDL;
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
    private MarriageRecord x;
    private Archivist a = new Archivist("x","y","z");
    private String username, pass, type;

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
        a.dashboardScene(event, username, pass, type);
        
    }

    @FXML
    private void updateMarriageRecord(MouseEvent event) throws IOException {
        a.updateMarriageRecordConfirm(x.getMarriageRecordID(), candidate1L.getText(),Integer.parseInt(age1L.getText()),Integer.parseInt(NID1L.getText()),
                nationality1L.getText(),father1L.getText(),mother1L.getText(), witness1L.getText(),rel1L.getText(), candidate2L.getText(),
                Integer.parseInt(age2L.getText()),Integer.parseInt(NID2L.getText()),nationality2L.getText(),father2L.getText(),mother2L.getText(),
                witness2L.getText(),rel2L.getText());
        a.dashboardScene(event, username, pass, type);
    }

    @FXML
    private void deleteMarriageRecord(MouseEvent event) throws IOException {
        a.deleteRecord(x.getMarriageRecordID());
        a.dashboardScene(event, username, pass, type);
    }

    void init(MarriageRecord m, String a, String b, String c) {
        username = a;
        pass = b;
        type = c;
        x=m;
        marriageRecordIDL.setText("Marriage Record ID: "+m.getMarriageRecordID());
        candidate1L.setText(m.getCandidateName1());
        age1L.setText(Integer.toString(m.getAge1()));
        NID1L.setText(Integer.toString(m.getNID1()));
        nationality1L.setText(m.getNationality1());
        father1L.setText(m.getFather1());
        mother1L.setText(m.getMother1());
        witness1L.setText(m.getWitness1());
        rel1L.setText(m.getRel1());
        candidate2L.setText(m.getCandidateName2());
        age2L.setText(Integer.toString(m.getAge2()));
        NID2L.setText(Integer.toString(m.getNID2()));
        nationality2L.setText(m.getNationality2());
        father2L.setText(m.getFather2());
        mother2L.setText(m.getMother2());
        witness2L.setText(m.getWitness2());
        rel2L.setText(m.getRel2());
    }
    
}
