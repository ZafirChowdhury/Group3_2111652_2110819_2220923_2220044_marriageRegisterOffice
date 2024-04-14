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
public class UserViewController implements Initializable {

    @FXML
    private Label usernameLable;
    @FXML
    private Label typeLable;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }

    User currentUser;
    User showUser;
    public void receiveUserData(User user, User selectedUser){
        currentUser = (ItAdmin) user;
        showUser = selectedUser;
        
        String name = "";
        String type = "";
        if (!(showUser == null)) {
            name = showUser.getUsername();
            type = showUser.getType();
        }
        
        usernameLable.setText("Username: " + name);
        typeLable.setText("Type: " + type);
    }

    @FXML
    private void backButtonOnClick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("allUser.fxml"));
        Parent root = loader.load(); 

        AllUserController allUserController = loader.getController();
        allUserController.receiveUserData(currentUser);

        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("All User View");
        stage.setScene(scene);
        stage.show();
    }
}

