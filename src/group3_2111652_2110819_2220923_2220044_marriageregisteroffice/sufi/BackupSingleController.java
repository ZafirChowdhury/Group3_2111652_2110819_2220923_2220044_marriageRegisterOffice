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
public class BackupSingleController implements Initializable {

    @FXML
    private Label candidate1L;
    @FXML
    private Label age1L;
    @FXML
    private Label nationality1L;
    @FXML
    private Label NID1L;
    @FXML
    private Label father1L;
    @FXML
    private Label mother1L;
    @FXML
    private Label witness1L;
    @FXML
    private Label rel1L;
    @FXML
    private Label candidate2L;
    @FXML
    private Label age2L;
    @FXML
    private Label nationality2L;
    @FXML
    private Label NID2L;
    @FXML
    private Label father2L;
    @FXML
    private Label mother2L;
    @FXML
    private Label witness2L;
    @FXML
    private Label rel2L;
    @FXML
    private Label marriageIDL;
    
    MarriageRecord x;
    private Archivist a = new Archivist("x","y","z");

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    


    @FXML
    private void downloadRecord(MouseEvent event) {
        a.downloadSingleRecord(event,x);
    }

    void init(MarriageRecord m) {
        x=m;
        marriageIDL.setText("Marriage ID: "+Integer.toString(m.getMarriageID()));
        candidate1L.setText("Candidate Name 1: "+m.getCandidateName1());
        age1L.setText("Age: "+Integer.toString(m.getAge1()));
        NID1L.setText("NID: "+Integer.toString(m.getNID1()));
        nationality1L.setText("Nationality: "+m.getNationality1());
        father1L.setText("Father's Name: "+m.getFather1());
        mother1L.setText("Mother's Name: "+m.getMother1());
        witness1L.setText("Witness Name: "+m.getWitness1());
        rel1L.setText("Witness Relationship: "+m.getRel1());
        candidate2L.setText("Candidate Name 2: "+m.getCandidateName2());
        age2L.setText("Age: "+Integer.toString(m.getAge2()));
        NID2L.setText("NID: "+Integer.toString(m.getNID2()));
        nationality2L.setText("Nationality: "+m.getNationality2());
        father2L.setText("Father's Name: "+m.getFather2());
        mother2L.setText("Mother's Name: "+m.getMother2());
        witness2L.setText("Witness Name: "+m.getWitness2());
        rel2L.setText("Witness Relationship: "+m.getRel2());
    }
    
}
