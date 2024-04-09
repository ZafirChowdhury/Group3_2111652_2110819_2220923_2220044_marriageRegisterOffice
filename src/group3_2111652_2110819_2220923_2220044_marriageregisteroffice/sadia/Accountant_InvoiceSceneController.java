/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package group3_2111652_2110819_2220923_2220044_marriageregisteroffice.sadia;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;

import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author HP 840 G6
 */
public class Accountant_InvoiceSceneController implements Initializable {

    @FXML
    private TextField clientnameTF;
    @FXML
    private TextField unpaidAmountTF;
    @FXML
    private TextField clientContactnoTF;
    Alert blankinfo = new Alert(Alert.AlertType.WARNING,"Cannot keep blank");
    Alert wrongphninfo = new Alert(Alert.AlertType.WARNING,"Put valid contact no. Must be 11 digits with + sign ");
    Alert amount = new Alert(Alert.AlertType.WARNING,"Put valid amount. Amount cannot be 0tk");
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // invoice er controller will call its method that will be placed in the accountant class
    }    

    @FXML
    private void CreateandStoreInvoiceOnclick(ActionEvent event) {
        
        String clientname = clientnameTF.getText();
        if(clientname.isEmpty()){
            blankinfo.show();
        blankinfo.showAndWait();
        return;
        }

try{  
        int unpaidamnt = Integer.parseInt(unpaidAmountTF.getText());
        if(unpaidamnt<=0){
            amount.showAndWait();
            return;
        }

        
        String numbr = clientContactnoTF.getText();
        boolean sign = numbr.contains("+");
        if(numbr.isEmpty()){
            blankinfo.showAndWait();
            return;
        }
        if(numbr.length()>11 || sign!= true){
            wrongphninfo.showAndWait();
            return;
        }

        
        //Boolean inv = Accountant.CreateInvoice(clientname,unpaidamnt,numbr);
       




} catch(Exception e){
    Alert numbrinfo = new Alert(Alert.AlertType.ERROR,"Invalid data type");
     numbrinfo.showAndWait();
     return;

}
        


    }

//done
    
    @FXML
    private void UpdateInvoiceOnclick(ActionEvent event) {
        
    }

    

    @FXML
    private void ViewInvoiceonTable(ActionEvent event) throws IOException, FileNotFoundException, ClassNotFoundException {
        ObservableList<Invoice> invoiceList = FXCollections.observableArrayList();
        
        accountant.showinvoice(invoiceList);
        invoiceTable.setItems(invoiceList);


    @FXML
    private void ViewInvoiceonTxtField(ActionEvent event) {
    }

    @FXML
    private void UpdateInvoiceOnclick(ActionEvent event) {
    }

    @FXML
    private void ViewUpdatedInvoiceOnclick(ActionEvent event) {

    }
    
}
