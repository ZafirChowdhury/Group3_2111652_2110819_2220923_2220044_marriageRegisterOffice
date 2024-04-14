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
public class AdminDashbordController implements Initializable {

    @FXML
    private Label usernameLable;
    @FXML
    private Label supportTicketCounterLable;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }  
    
    User currentUser;
    public void receiveUserData(User user){
        currentUser = (ItAdmin) user;
        usernameLable.setText("Welcome, " + currentUser.getUsername() + ".");
        return;
    }

    @FXML // AllUserController.java // allUser.fxml
    private void viewAllUserOnClick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("allUser.fxml"));
        Parent root = loader.load(); 

        AllUserController allUserController = loader.getController();
        allUserController.receiveUserData(currentUser);

        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("All User View");
        stage.show();
    }

    @FXML // AddUserController.java // addUser.fxml
    private void addNewUserOnClick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("addUser.fxml"));
        Parent root = loader.load(); 

        AddUserController addUserController = loader.getController();
        addUserController.receiveUserData(currentUser);

        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Add New User");
        stage.show();
    }
    

    @FXML // EarlyPaymentController.java // earlyPayment.java
    private void paymentRequestOnClick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("earlyPayment.fxml"));
        Parent root = loader.load(); 

        EarlyPaymentController earlyPaymentController = loader.getController();
        earlyPaymentController.receiveUserData(currentUser);

        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Early Payment");
        stage.show();
    }
    

    @FXML // AllTicketsController.java // allTicketsController.fxml
    private void supportTicketOnClick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(".fxml"));
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
