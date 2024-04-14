/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package group3_2111652_2110819_2220923_2220044_marriageregisteroffice.sadia;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author HP 840 G6
 */
public class LegalAdvisor_PrenupDocController implements Initializable {

    @FXML
    private TextArea aggremencontentTextArea;
    @FXML
    private TextField client1TF;
    @FXML
    private TextField client2TF;
    @FXML
    private DatePicker documentmakingDate;
    Alert blankinfo = new Alert(Alert.AlertType.WARNING,"Cannot keep blank");
    Alert wrongphninfo = new Alert(Alert.AlertType.WARNING,"Put valid contact no. Must be 11 digits with + sign ");
    Alert amount = new Alert(Alert.AlertType.WARNING,"Put valid amount. Amount cannot be 0tk");
     private LegalAdvisor adv;
    @FXML
    private Label viewdraftLabel;
    public LegalAdvisor getLegalAdvisor(){
    return adv;
    }
    public void setLegalAdvisor(LegalAdvisor adv){
    this.adv = adv;
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void generatePrenupDocPdfButton(ActionEvent event) {
        
        
    }

    @FXML
    private void returnButton(ActionEvent event) throws IOException {
        Parent root = null;
       FXMLLoader myLoader = new FXMLLoader(getClass().getResource("LegalAdvisor_Dashboard.fxml"));
       root = (Parent) myLoader.load();
       Scene myScene = new Scene(root); 
       Stage myStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
       myStage.setScene(myScene);
       myStage.show();
    }

    @FXML
    private void saveDraftOnclick(ActionEvent event) {
        String clientname = client1TF.getText();    
            if(clientname.isEmpty()){
            blankinfo.show();
        blankinfo.showAndWait();
        return;
        }
        String clientname2 = client2TF.getText();
        if(clientname2.isEmpty()){
            blankinfo.show();
        blankinfo.showAndWait();
        return;
        }
        String text = aggremencontentTextArea.getText();
        if(clientname2.isEmpty()){
            blankinfo.show();
        blankinfo.showAndWait();
        return;
        }
        
        LocalDate date = documentmakingDate.getValue();
        
        if(date == null){
            amount.showAndWait();
            return;
        }
        try {
            clientname.toString();
            clientname2.toString();
            text.toString();
        
        
       
        boolean madefile = adv.MakePrenupDoc(clientname, clientname2, date, text);
        if (madefile){
        Alert success = new Alert(Alert.AlertType.INFORMATION,"Bin file created");
        success.showAndWait();
        }
        
        }catch(InputMismatchException e) {
            System.err.println("Error: " + e.getMessage());
        }
        
        

    }

    @FXML
    private void viewDraftonClick(ActionEvent event) {
    }

    
    
}
