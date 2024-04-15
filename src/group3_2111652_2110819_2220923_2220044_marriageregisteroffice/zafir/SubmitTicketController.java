/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package group3_2111652_2110819_2220923_2220044_marriageregisteroffice.zafir;

import group3_2111652_2110819_2220923_2220044_marriageregisteroffice.User;
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
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author zafir
 */
public class SubmitTicketController implements Initializable {

    @FXML
    private Label outputLable;
    @FXML
    private TextArea descriptionTextField;
    @FXML
    private TextField subjectTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 
    
    User currentUser;
    public void receiveUserData(User user){
        currentUser = user;
        return;
    }

    @FXML
    private void submitButtonOnClick(ActionEvent event) {
        String subject = subjectTextField.getText();
        String description = descriptionTextField.getText();
        if ((subject == null) || (description == null)) {
            outputLable.setText("Please fill all the required filleds");
            return;
        }
        
        SupportTicket supportTicket = new SupportTicket(currentUser.getUsername(), subject, description);
        
        // Saving to Bin file
        File file = new File("bin/supportTicket.bin");
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
            
            oos.writeObject(supportTicket);
            System.out.println("Support Ticket saved succesfully");
            System.out.println(supportTicket.toString());
            oos.close();
            
        } catch (Exception e) {
            System.out.println("There was a error while saving support ticket");
            e.printStackTrace();
        }
        
        subjectTextField.clear();
        descriptionTextField.clear();
        outputLable.setText("Support Ticket submitted succesfully");
        
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
    
}
