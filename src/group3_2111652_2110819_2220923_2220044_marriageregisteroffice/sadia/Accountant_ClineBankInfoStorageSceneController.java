/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package group3_2111652_2110819_2220923_2220044_marriageregisteroffice.sadia;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author HP 840 G6
 */
public class Accountant_ClineBankInfoStorageSceneController implements Initializable {

    @FXML
    private TextField clientnameTF;
    @FXML
    private TextField accntnumberTF;
    @FXML
    private TextField bankbranchTF;
    @FXML
    private ComboBox<String> banknameComboBox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        banknameComboBox.getItems().addAll("City Bank","Jamuna Bank","BRAC Bank");
    }    

    @FXML
    private void StoreBankAccntInfoButton(ActionEvent event) {
        
    }

    @FXML
    private void viewBankAccntInfoButton(ActionEvent event) {
    }
    
}
