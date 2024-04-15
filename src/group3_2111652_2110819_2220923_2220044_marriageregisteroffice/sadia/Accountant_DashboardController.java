/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package group3_2111652_2110819_2220923_2220044_marriageregisteroffice.sadia;

import group3_2111652_2110819_2220923_2220044_marriageregisteroffice.User;
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
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author HP 840 G6
 */
public class Accountant_DashboardController implements Initializable {

    @FXML
    private Label noticeInfoLabel;
    @FXML
    private Label usernameLable;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }

    Accountant user;
    public void receiveUserData(User user){
        user = (Accountant) user;
        usernameLable.setText("Welcome,  " + user.getUsername() + "!");
        System.out.println("Logged in as: " + user.toString());
        return;
    }

    @FXML
    private void showInvoiceSceneOnclick(ActionEvent event) throws IOException {
        Parent root = null;
       FXMLLoader myLoader = new FXMLLoader(getClass().getResource("Accountant_InvoiceScene.fxml"));
       root = (Parent) myLoader.load();
       Scene myScene = new Scene(root); 
       Stage myStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
       myStage.setScene(myScene);
       myStage.show();
        
    }

    @FXML
    private void showPurchaseInfoSceneOnclick(ActionEvent event) throws IOException {
        Parent root = null;
       FXMLLoader myLoader = new FXMLLoader(getClass().getResource("Accountant_PurchaseInfoScene.fxml"));
       root = (Parent) myLoader.load();
       Scene myScene = new Scene(root); 
       Stage myStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
       myStage.setScene(myScene);
       myStage.show();
    }

    @FXML
    private void showClientBankInfoScene(ActionEvent event) throws IOException {
        Parent root = null;
       FXMLLoader myLoader = new FXMLLoader(getClass().getResource("Accountant_ClineBankInfoStorageScene.fxml"));
       root = (Parent) myLoader.load();
       Scene myScene = new Scene(root); 
       Stage myStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
       myStage.setScene(myScene);
       myStage.show();
        
    }

    @FXML
    private void gotoChartSceneOnclick(ActionEvent event) {
    }

    @FXML
    private void logoutOnclick(ActionEvent event) throws IOException {
         FXMLLoader loader= new FXMLLoader();

        loader.setLocation(getClass().getResource("/group3_2111652_2110819_2220923_2220044_marriageregisteroffice/login.fxml"));

        Parent parent= loader.load();
        Scene scene= new Scene(parent);
        Stage stage=(Stage)((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    
    
}
