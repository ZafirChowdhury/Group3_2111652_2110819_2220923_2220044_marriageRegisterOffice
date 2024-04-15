package group3_2111652_2110819_2220923_2220044_marriageregisteroffice.arpita;

import group3_2111652_2110819_2220923_2220044_marriageregisteroffice.User;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

public class MarriageCounselorDashbordController implements Initializable {

    @FXML
    private BorderPane borderPane;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 
    
    MarriageCounselor user;
    public void receiveUserData(User user){
        user = (MarriageCounselor) user;
        System.out.println(user.toString());
        return;
    }

    @FXML
    private void viewPendingCounselingApplicationOnClick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Application.fxml"));
        Parent root = loader.load();
        borderPane.setCenter(root);
    }

    @FXML
    private void inboxLegalAdvisorOnClick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Communication.fxml"));
        Parent root = loader.load();
        borderPane.setCenter(root);
    }

    @FXML
    private void counselingDateOnClick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("CounselingDate.fxml"));
        Parent root = loader.load();
        borderPane.setCenter(root);
    }

    @FXML
    private void marriageRecordOnClick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MarriageRecord.fxml"));
        Parent root = loader.load();
        borderPane.setCenter(root);
    }
    
}
