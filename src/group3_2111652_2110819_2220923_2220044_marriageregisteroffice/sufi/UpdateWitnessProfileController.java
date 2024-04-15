/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package group3_2111652_2110819_2220923_2220044_marriageregisteroffice.sufi;

import group3_2111652_2110819_2220923_2220044_marriageregisteroffice.User;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author User
 */
public class UpdateWitnessProfileController implements Initializable {

    @FXML
    private TextField nameL;
    @FXML
    private TextField ageL;
    @FXML
    private TextField NIDL;
    @FXML
    private Label witnessIDL;
    @FXML
    private TextField genderL;
    
    private String username, pass, type;
    private Witness x = new Witness("x","y","z");
    private boolean b = true;
    /**
     * Initializes the controller class.
     */
    void init(String a, String b, String c) {
        username = a;
        pass = b;
        type = c;
        ObservableList<Witness> wl = null;
        try {
            wl = x.getWitnessRecords();
            for(Witness w: wl){
            if(w.getUsername().equals(username)){
                witnessIDL.setText("Witness ID: "+Integer.toString(w.getWitnessID()));
                nameL.setText(w.getName());
                ageL.setText(Integer.toString(w.getAge()));
                NIDL.setText(Integer.toString(w.getNID()));
                genderL.setText(w.getGender());
            }
        }
        } catch (IOException ex) {
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void updateProfile(MouseEvent event) throws IOException {
        ObservableList<Witness> wl = null;
        try {
            wl = x.getWitnessRecords();
            for(Witness w: wl){
                if(w.getUsername().equals(username)){
                    b = false;
                }
            }
            if(b){
                x.addProfileConfirm(username, pass, type, nameL.getText(), Integer.parseInt(ageL.getText()), Integer.parseInt(NIDL.getText()), genderL.getText());
                x.dashboardScene(event, username, pass, type);
            }
            else{
                x.updateProfileConfirm(username, pass, type, nameL.getText(), Integer.parseInt(ageL.getText()), Integer.parseInt(NIDL.getText()), genderL.getText());
                x.dashboardScene(event, username, pass, type);
            }
        } catch (IOException ex) {
        }
    }


    @FXML
    private void dashboard(MouseEvent event) throws IOException {
        x.dashboardScene(event, username, pass, type);
    }

    @FXML
    private void logout(MouseEvent event) throws IOException {
        x.logoutScene(event);
    }
    
}
