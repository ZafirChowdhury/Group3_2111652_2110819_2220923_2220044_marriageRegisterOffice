/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package group3_2111652_2110819_2220923_2220044_marriageregisteroffice.sufi;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
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
public class UpdateArchivistProfileController implements Initializable {

    @FXML
    private Label archivistIDL;
    @FXML
    private TextField nameL;
    @FXML
    private TextField addressL;
    private String username, pass, type;
    private Archivist x = new Archivist("x", "y", "z");
    private boolean b = false;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void updateProfile(MouseEvent event) {
        ObservableList<Archivist> al = null;
        try {
            al = x.getArchivistRecords();
            for(Archivist a: al){
                if(a.getUsername().equals(username)){
                    b = true;
                }
            }
            if(b){
                x.updateProfileConfirm(username, pass, type, nameL.getText(), addressL.getText());
                x.dashboardScene(event, username, pass, type);
            }
            else{
                x.addProfileConfirm(username, pass, type, nameL.getText(), addressL.getText());
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

    void init(String a, String b, String c) {
        username = a;
        pass = b;
        type = c;
        ObservableList<Archivist> al = null;
        try {
            al = x.getArchivistRecords();
            for(Archivist ax: al){
                if(ax.getUsername().equals(username)){
                    archivistIDL.setText("Archivist ID: "+Integer.toString(ax.getArchivistID()));
                    nameL.setText(ax.getName());
                    addressL.setText(ax.getAddress());
                }
            }
        } catch (IOException ex) {
        }
    }
    
}
