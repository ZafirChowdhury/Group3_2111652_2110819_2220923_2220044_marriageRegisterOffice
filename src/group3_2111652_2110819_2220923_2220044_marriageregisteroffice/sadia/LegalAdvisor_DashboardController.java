/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package group3_2111652_2110819_2220923_2220044_marriageregisteroffice.sadia;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author HP 840 G6
 */
public class LegalAdvisor_DashboardController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void gotoPrenupSceneOnclick(ActionEvent event) throws IOException {
        Parent root = null;
       FXMLLoader myLoader = new FXMLLoader(getClass().getResource("LegalAdvisor_PrenupDoc.fxml"));
       root = (Parent) myLoader.load();
       Scene myScene = new Scene(root); 
       Stage myStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
       myStage.setScene(myScene);
       myStage.show();
    }

    @FXML
    private void ViewGuidesOnclick(ActionEvent event) {
    }

    @FXML
    private void viewLegalDocumentOnclick(ActionEvent event) {
    }

    @FXML
    private void gotoChartSceneOnclick(ActionEvent event) {
    }

    @FXML
    private void gotoContactLogScene(ActionEvent event) {
    }

    @FXML
    private void gotoConsultationListSceneOnclick(ActionEvent event) {
    }
    
}
