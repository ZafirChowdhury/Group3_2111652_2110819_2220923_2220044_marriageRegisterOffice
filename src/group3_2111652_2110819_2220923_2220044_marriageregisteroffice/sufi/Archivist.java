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
public class Archivist extends User implements Serializable {
    private int archivistID;
    private String name;
    private String address;

    public Archivist(String username, String password, String type) {
        super(username, password, type);
    }

    public Archivist(int archivistID, String name, String address, String username, String password, String type) {
        super(username, password, type);
        this.archivistID = archivistID;
        this.name = name;
        this.address = address;
    }
    
    

    public void addMarriageRecordScene(MouseEvent event) throws IOException {
        FXMLLoader loader= new FXMLLoader();
        loader.setLocation(getClass().getResource("addMarriageRecord.fxml"));
        Parent parent= loader.load();
        Scene scene= new Scene(parent);
        Stage stage=(Stage)((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Marriage Register Office");
        stage.show();
    }

    
    public void verifyMarriageRecordsScene(MouseEvent event) throws IOException {
        FXMLLoader loader= new FXMLLoader();
        loader.setLocation(getClass().getResource("verifyMarrieageRecordTable.fxml"));
        Parent parent= loader.load();
        Scene scene= new Scene(parent);
        Stage stage=(Stage)((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Marriage Register Office");
        stage.show();
    }

    
    public void updateMarriageRecordsScene(MouseEvent event) throws IOException {
        FXMLLoader loader= new FXMLLoader();
        loader.setLocation(getClass().getResource("updateMarriageRecordTable.fxml"));
        Parent parent= loader.load();
        Scene scene= new Scene(parent);
        Stage stage=(Stage)((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Marriage Register Office");
        stage.show();
    }

    
    public void verifyMaritalStatusScene(MouseEvent event) throws IOException {
        FXMLLoader loader= new FXMLLoader();
        loader.setLocation(getClass().getResource("verifyMaritalStatusTable.fxml"));
        Parent parent= loader.load();
        Scene scene= new Scene(parent);
        Stage stage=(Stage)((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Marriage Register Office");
        stage.show();
    }

    
    public void viewMarriageStatisticsScene(MouseEvent event) throws IOException {
        FXMLLoader loader= new FXMLLoader();
        loader.setLocation(getClass().getResource("generateChart.fxml"));
        Parent parent= loader.load();
        Scene scene= new Scene(parent);
        Stage stage=(Stage)((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Marriage Register Office");
        stage.show();
    }

    
    public void viewOfficialRequestsScene(MouseEvent event) throws IOException {
        FXMLLoader loader= new FXMLLoader();
        loader.setLocation(getClass().getResource("requestofMarriageRecordTable.fxml"));
        Parent parent= loader.load();
        Scene scene= new Scene(parent);
        Stage stage=(Stage)((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Marriage Register Office");
        stage.show();
    }

    
    public void viewFeedbackScene(MouseEvent event) throws IOException {
        FXMLLoader loader= new FXMLLoader();
        loader.setLocation(getClass().getResource("feedbackTable.fxml"));
        Parent parent= loader.load();
        Scene scene= new Scene(parent);
        Stage stage=(Stage)((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Marriage Register Office");
        stage.show();
    }

    
    public void backupRecords(MouseEvent event) throws IOException {
        FXMLLoader loader= new FXMLLoader();
        loader.setLocation(getClass().getResource("backupTable.fxml"));
        Parent parent= loader.load();
        Scene scene= new Scene(parent);
        Stage stage=(Stage)((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Marriage Register Office");
        stage.show();
    }
    
    public void logoutScene(MouseEvent event) throws IOException {
        FXMLLoader loader= new FXMLLoader();
        loader.setLocation(getClass().getResource("login.fxml"));
        Parent parent= loader.load();
        Scene scene= new Scene(parent);
        Stage stage=(Stage)((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Marriage Register Office");
        stage.show();
    }
    

    

    
    
    
}
