/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package group3_2111652_2110819_2220923_2220044_marriageregisteroffice.zafir;

import group3_2111652_2110819_2220923_2220044_marriageregisteroffice.User;
import group3_2111652_2110819_2220923_2220044_marriageregisteroffice.arpita.MarriageApplication;
import group3_2111652_2110819_2220923_2220044_marriageregisteroffice.sufi.AppendableObjectOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author zafir
 */
public class MarriageViewController implements Initializable {

    @FXML
    private Label bridelable;
    @FXML
    private Label groomLable;
    @FXML
    private Label dateLable;
    @FXML
    private Label witnessLable;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    User currentUser;
    MarriageApplication ma;
    public void receiveUserData(User user, MarriageApplication SelectedMa){
        currentUser = user;
        if (SelectedMa == null) return;
        
        ma = SelectedMa;
        
        bridelable.setText("Bride: " + ma.getBrideName());
        groomLable.setText("Groom: " + ma.getGroomName());
        dateLable.setText("Date: " + ma.getPefferredMarriageDate());
        witnessLable.setText("Witness: " + ma.getWitnessName());
        
        return;
    }

    @FXML
    private void backButtonOnClick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("marriageRegistrarDashbord.fxml"));
        Parent root = loader.load(); 

        MarriageRegistrarDashbordController marriageRegistrarDashbordController = loader.getController();
        marriageRegistrarDashbordController.receiveUserData(currentUser);

        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Marriage Registrar Dashbord");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void createMarriageCertificateOnClick(ActionEvent event) {
        MarriageCertificate mc = new MarriageCertificate(ma.getBrideName(), 
                                                        ma.getGroomName(), 
                                                        ma.getPefferredMarriageDate().toString(), 
                                                        currentUser.getUsername(), 
                                                        ma.getWitnessName(), 
                                                        ma.getMc().getUsername());
        
        File file = new File("bin/marriageCertificate.bin");
        FileOutputStream fos;
        ObjectOutputStream oos;
        
        try {
            if (file.exists()) {
                fos = new FileOutputStream(file, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(file, true);
                oos = new ObjectOutputStream(fos);
            }
            
            oos.writeObject(mc);
            System.out.println("Marriage certificate saved succesfully");
            oos.close();
            
        } catch (Exception e) {
            System.out.println("There was a error while saving Marriage");
            e.printStackTrace();
        }
    }
    
}
