/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group3_2111652_2110819_2220923_2220044_marriageregisteroffice.sufi;

import group3_2111652_2110819_2220923_2220044_marriageregisteroffice.User;
import java.io.IOException;
import java.io.Serializable;
import java.time.LocalDate;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 *
 * @author User
 */
public class Witness extends User implements Serializable{
    private int witnessID;
    private String name;
    private int NID;
    private String address;
    private String phone;

    public Witness(String username, String password, String type) {
        super(username, password, type);
    }

    public Witness(int witnessID, String name, int NID, String address, String phone, String username, String password, String type) {
        super(username, password, type);
        this.witnessID = witnessID;
        this.name = name;
        this.NID = NID;
        this.address = address;
        this.phone = phone;
    }
    
    public void confirmWeddingAttendanceScene(MouseEvent event) throws IOException {
        FXMLLoader loader= new FXMLLoader();
        loader.setLocation(getClass().getResource("confirmAttendanceTable.fxml"));
        Parent parent= loader.load();
        Scene scene= new Scene(parent);
        Stage stage=(Stage)((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Marriage Register Office");
        stage.show();
    }

    
    public void updateProfileScene(MouseEvent event) throws IOException {
        FXMLLoader loader= new FXMLLoader();
        loader.setLocation(getClass().getResource("updateWitnessProfile.fxml"));
        Parent parent= loader.load();
        Scene scene= new Scene(parent);
        Stage stage=(Stage)((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Marriage Register Office");
        stage.show();
    }

    
    public void signWitnessFormScene(MouseEvent event) throws IOException {
        FXMLLoader loader= new FXMLLoader();
        loader.setLocation(getClass().getResource("witnessForm.fxml"));
        Parent parent= loader.load();
        Scene scene= new Scene(parent);
        Stage stage=(Stage)((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Marriage Register Office");
        stage.show();
    }

    
    public void viewMarriageCertificatesScene(MouseEvent event) throws IOException {
        FXMLLoader loader= new FXMLLoader();
        loader.setLocation(getClass().getResource("marriageCertificateTable.fxml"));
        Parent parent= loader.load();
        Scene scene= new Scene(parent);
        Stage stage=(Stage)((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Marriage Register Office");
        stage.show();
    }

    
    public void viewWeddingDetailsScene(MouseEvent event) throws IOException {
        FXMLLoader loader= new FXMLLoader();
        loader.setLocation(getClass().getResource("upcomingWeddingDetailsTable.fxml"));
        Parent parent= loader.load();
        Scene scene= new Scene(parent);
        Stage stage=(Stage)((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Marriage Register Office");
        stage.show();
    }

    
    public void viewWeddingHistoryScene(MouseEvent event) throws IOException {
        FXMLLoader loader= new FXMLLoader();
        loader.setLocation(getClass().getResource("weddingHistoryTable.fxml"));
        Parent parent= loader.load();
        Scene scene= new Scene(parent);
        Stage stage=(Stage)((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Marriage Register Office");
        stage.show();
    }

    
    public void viewNotificationsScene(MouseEvent event) throws IOException {
        FXMLLoader loader= new FXMLLoader();
        loader.setLocation(getClass().getResource("unknown.fxml"));
        Parent parent= loader.load();
        Scene scene= new Scene(parent);
        Stage stage=(Stage)((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Marriage Register Office");
        stage.show();
    }

    
    public void provideFeedbackScene(MouseEvent event) throws IOException {
        FXMLLoader loader= new FXMLLoader();
        loader.setLocation(getClass().getResource("provideFeedbackTable.fxml"));
        Parent parent= loader.load();
        Scene scene= new Scene(parent);
        Stage stage=(Stage)((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Marriage Register Office");
        stage.show();
    }
    
    public void logoutScene(MouseEvent event) throws IOException {
        FXMLLoader loader= new FXMLLoader();

        loader.setLocation(getClass().getResource("/group3_2111652_2110819_2220923_2220044_marriageregisteroffice/login.fxml"));

        Parent parent= loader.load();
        Scene scene= new Scene(parent);
        Stage stage=(Stage)((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Marriage Register Office");
        stage.show();
    }
    

}
