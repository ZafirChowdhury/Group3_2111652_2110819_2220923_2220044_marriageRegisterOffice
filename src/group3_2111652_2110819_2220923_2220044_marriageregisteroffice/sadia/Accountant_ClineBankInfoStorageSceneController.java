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
    @FXML
    private TextField clientContactno;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        banknameComboBox.getItems().addAll("City Bank","Jamuna Bank","BRAC Bank");
        
    }    

    @FXML
    private void StoreBankAccntInfoButton(ActionEvent event) {

        String clientname = clientnameTF.getText();
        if(clientname.isEmpty()){
            blankinfo.show();
        blankinfo.showAndWait();
        return;
        }
         String bankbranch = bankbranchTF.getText();
         if(bankbranch.isEmpty()){
            blankinfo.show();
        blankinfo.showAndWait();
        return;
        }
        
try{  
        String bankname = banknameComboBox.getValue();
        if(bankname == null || bankname.isEmpty()){
        blankinfo.showAndWait();
        return;}
       

        
        String numbr = clientContactno.getText();
        boolean sign = numbr.contains("+");
        if(numbr.isEmpty()){
            blankinfo.showAndWait();
            return;
        }
        if(numbr.length()>11 || sign!= true){
            wrongphninfo.showAndWait();
            return;
        }
        String accnmbr = accntnumberTF.getText();
        Boolean ptrn = accnmbr.contains("AccNo");
        
        if(accnmbr.isEmpty()){
            blankinfo.showAndWait();
            return;
        }
        if(accnmbr.length()>11 || ptrn!= true){
            wrongaccno.showAndWait();
            return;
        
        
        }
        
        accountant.StoreClientBankInfo(numbr, numbr, bankname, bankname, bankbranch);
        boolean madefile = accountant.StoreClientBankInfo(numbr, numbr, bankname, bankname, bankbranch);
        if (madefile){
        Alert success = new Alert(Alert.AlertType.INFORMATION,"Bin file created");
        success.showAndWait();
        }

} catch(Exception e){
    Alert numbrinfo = new Alert(Alert.AlertType.ERROR,"Invalid data type");
     numbrinfo.showAndWait();
     return;

}

        
    }

    @FXML
    private void viewBankAccntInfoButton(ActionEvent event) {
    }
    
}
