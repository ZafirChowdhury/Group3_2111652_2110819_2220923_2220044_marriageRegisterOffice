package group3_2111652_2110819_2220923_2220044_marriageregisteroffice.arpita;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.input.MouseEvent;

public class ScheduleController implements Initializable {

    @FXML
    private DatePicker dateDatePicker;
    @FXML
    private ComboBox<String> timeComboBox;
    @FXML
    private ComboBox<Integer> durationComboBox;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        for (int i = 0; i < 10; i ++) {
            timeComboBox.getItems().add("0" + i + ":00");
        }
        for (int i = 10; i < 24; i ++) {
            timeComboBox.getItems().add(i + ":00");
        }
        for (int i = 1; i <= 5; i ++) {
            durationComboBox.getItems().add(i);
        }
        // TODO
    }    

    @FXML
    private void confirmButtonOnClick(MouseEvent event) {
        String time = timeComboBox.getValue();
        String duration = Integer.toString(durationComboBox.getValue());
        LocalDate date = dateDatePicker.getValue();
        Schedule s = new Schedule(date, time, duration);
        PopUp.Message("Schedule has been created");
    }
}
