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
public class MarriageRegistrarDashbordController implements Initializable {

    @FXML
    private Label usernameLable;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    User currentUser;
    public void receiveUserData(User user){
        currentUser = user;
        usernameLable.setText("Welcome " + currentUser.getUsername());
        return;
    }

    @FXML
    private void submitSipportTicketOnClick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("submitTicket.fxml"));
        Parent root = loader.load(); 

        SubmitTicketController submitTicketController = loader.getController();
        submitTicketController.receiveUserData(currentUser);

        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("New Support Ticket");
        stage.show();
    }

    @FXML
    private void viewSubmittedTicketsOnClick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("allSubmittedTicket.fxml"));
        Parent root = loader.load(); 

        AllSubmittedTicketController allSubmittedTicketController = loader.getController();
        allSubmittedTicketController.receiveUserData(currentUser);

        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("All Submitted Tickets");
        stage.show();
    }
    
}
