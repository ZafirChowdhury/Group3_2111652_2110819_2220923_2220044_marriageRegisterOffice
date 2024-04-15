
package group3_2111652_2110819_2220923_2220044_marriageregisteroffice.arpita;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.TextField;

public class CheckApplicationStatusSceneController implements Initializable {


    private TextField applicationStatusTextfield;
    MarriageCandidate mc;
    MarriageApplication ma;
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
    
}
