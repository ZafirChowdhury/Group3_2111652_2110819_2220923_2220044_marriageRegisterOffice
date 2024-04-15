
package group3_2111652_2110819_2220923_2220044_marriageregisteroffice.arpita;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.input.MouseEvent;

public class CounselingDateController implements Initializable {

    @FXML
    private ComboBox<String> timeComboBox;
    @FXML
    private DatePicker dateDatePicker;
    @FXML
    private ComboBox<String> desComboBox;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        for (int i = 0; i < 10; i ++) {
            timeComboBox.getItems().add("0" + i + ":00");
        }
        for (int i = 10; i < 24; i ++) {
            timeComboBox.getItems().add(i + ":00");
        }
        ObservableList <PremaritalCounseling> list = PremaritalCounseling.getPremaritalCounselingList();
        for (int i = 0; i < list.size(); i ++) {
            if (list.get(i).getStatus().equals("accepted")) {
                desComboBox.getItems().add(list.get(i).getDescription());
            }
        }
    }    

    @FXML
    private void submitButtonOnClick(MouseEvent event) {
        String time = timeComboBox.getValue();
        String des = desComboBox.getValue();
        LocalDate date = dateDatePicker.getValue();
        PremaritalCounselingSchedule p = new PremaritalCounselingSchedule(date, time, des);
        PremaritalCounselingSchedule.CreateNewPremaritalCounselingSchedule(p);
        PopUp.Message("New Schedule has been added");
    }
}
