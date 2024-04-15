
package group3_2111652_2110819_2220923_2220044_marriageregisteroffice.arpita;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;


public class CheckApplicationStatusSceneController implements Initializable {



    @FXML
    private TextField applicationStatusTextfield;
    MarriageCandidate mc;
    MarriageApplication ma;
    @FXML
    private Button scheduleMeetingButton;

    public void receiveUserData(MarriageCandidate mc, MarriageApplication ma){
        this.mc = mc;
        this.ma = ma;
        if (ma.isGranted() == true) {
            applicationStatusTextfield.setText("Granted");
        }
        else {
            applicationStatusTextfield.setText("Not Granted");
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        applicationStatusTextfield.setEditable(false);
    }    


    @FXML
    private void scheduleMeetingButtonOnClick(MouseEvent event) throws IOException {
        if (applicationStatusTextfield.getText().equals("Granted")) {
            PopUp.Message("Application Has Not Been Granted Yet");
        }
        else {
            Parent root = FXMLLoader.load(getClass().getResource("Schedule.fxml"));
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Login");
            stage.show();
        }
    }

    
}
