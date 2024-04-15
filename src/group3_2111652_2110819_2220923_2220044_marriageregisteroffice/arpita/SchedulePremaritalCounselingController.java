package group3_2111652_2110819_2220923_2220044_marriageregisteroffice.arpita;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;

public class SchedulePremaritalCounselingController implements Initializable {

    @FXML
    private TextArea descriptionTextArea;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    

    @FXML
    private void submitButtonOnClick(MouseEvent event) { 
        String des = descriptionTextArea.getText();
        PremaritalCounseling p = new PremaritalCounseling(des, "Pending");
        PremaritalCounseling.CreateNewPremaritalCounseling(p);
        PopUp.Message("Premarital Counseling Schedule has been added");
    }
}
