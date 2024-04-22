/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package group3_2111652_2110819_2220923_2220044_marriageregisteroffice.zafir;

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
 * @author zafir
 */
public class TicketViewController implements Initializable {

    @FXML
    private Label subjectLable;
    @FXML
    private Label descriptionLable;
    @FXML
    private Label statusLable;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    User currentUser;
    SupportTicket selectedSupportTicket;
    public void receiveUserData(User user, SupportTicket selectedST){
        currentUser = (ItAdmin) user;
        selectedSupportTicket = selectedST;
        
        subjectLable.setText("Subject: " + selectedSupportTicket.getSubject());
        descriptionLable.setText(selectedSupportTicket.getDescription());
        statusLable.setText("Status: " + selectedSupportTicket.getIsCloded());
        
        return;
    }    

    @FXML
    private void closeTicketOnClick(ActionEvent event) {
        // TODO
    }

    @FXML
    private void backButtonOnClick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("allTIckets.fxml"));
        Parent root = loader.load(); 

        AllTIcketsController allTIcketsController = loader.getController();
        allTIcketsController.receiveUserData(currentUser);

        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Support");
        stage.show();
    }
    
}
