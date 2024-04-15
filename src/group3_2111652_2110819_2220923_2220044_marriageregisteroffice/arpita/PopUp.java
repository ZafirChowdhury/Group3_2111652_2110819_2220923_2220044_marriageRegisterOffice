package group3_2111652_2110819_2220923_2220044_marriageregisteroffice.arpita;

import javafx.scene.control.Alert;


public interface PopUp {
    public static void Message(String message) {
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setTitle("Information Alert");
        a.setHeaderText("Alert");
        a.setContentText(message);
        a.showAndWait();
    }
}