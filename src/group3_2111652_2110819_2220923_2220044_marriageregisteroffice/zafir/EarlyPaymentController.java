/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package group3_2111652_2110819_2220923_2220044_marriageregisteroffice.zafir;


import group3_2111652_2110819_2220923_2220044_marriageregisteroffice.User;
import group3_2111652_2110819_2220923_2220044_marriageregisteroffice.sufi.AppendableObjectOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
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
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author zafir
 */
public class EarlyPaymentController implements Initializable {

    @FXML
    private TextField subjectTextFiled;
    @FXML
    private TextArea descriptionTextFiled;
    @FXML
    private Label massageLable;
    @FXML
    private TextField ammout;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  
    
    User currentUser;
    public void receiveUserData(User user){
        currentUser = (ItAdmin) user;
        return;
    }

    @FXML
    private void backButtonOnClick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("adminDashbord.fxml"));
        Parent root = loader.load(); 

        AdminDashbordController adminDashbordController = loader.getController();
        adminDashbordController.receiveUserData(currentUser);

        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Admin Dashbord");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void submitButtonOnClick(ActionEvent event) throws FileNotFoundException, IOException {
        String subject = subjectTextFiled.getText();
        String description = descriptionTextFiled.getText();
        
        if (subject == null || description == null || ammout == null) {
            System.out.println("Please fill all the requred filds");
            // Add alart
            return;
        }
        
        EarlyPayment newEarlyPayment = new EarlyPayment(currentUser.getUsername(),
                                                                  subject,
                                                                  description,
                                                                  Float.parseFloat(ammout.getText()));
        
        File file = new File("bin/earlyPayment.bin");
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
            
            oos.writeObject(newEarlyPayment);
            System.out.println("Early payment saved succesfully");
            oos.close();
            
        } catch (Exception e) {
            System.out.println("There was a error while saving early payment");
            e.printStackTrace();
        }
        
        subjectTextFiled.clear();
        descriptionTextFiled.clear();
        ammout.clear();
        massageLable.setText("Payment request sent.");
    }
    
}
