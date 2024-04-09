package Arpita;

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