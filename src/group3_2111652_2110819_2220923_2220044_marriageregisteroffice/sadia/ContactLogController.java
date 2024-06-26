/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package group3_2111652_2110819_2220923_2220044_marriageregisteroffice.sadia;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author HP 840 G6
 */
public class ContactLogController implements Initializable {
    // not able to bring the user instance data here so used dummy data;
   private LegalAdvisor adv;
    public LegalAdvisor getLegalAdvisor(){
    return adv;
    }
    public void setLegalAdvisor(LegalAdvisor adv){
    this.adv = adv;
    }
      Alert blankinfo = new Alert(Alert.AlertType.WARNING,"Cannot keep blank");
    Alert wrongphninfo = new Alert(Alert.AlertType.WARNING,"Put valid contact no. Must be 11 digits with + sign ");
    
    @FXML
    private TextField clientname;
    @FXML
    private TextField phonenumbrTextField;
    @FXML
    private TextField addressTextField;
    @FXML
    private TableView<ContactLog> contacrLogTableView;
    @FXML
    private TableColumn<ContactLog, String> clientnameColom;
    @FXML
    private TableColumn<ContactLog, String> phonenumbrColom;
    @FXML
    private TableColumn<ContactLog, String> addressColom;

    /**
     * Initializes the controller class.
     */
    ObservableList<ContactLog> ContactList = FXCollections.observableArrayList();
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        clientnameColom.setCellValueFactory(new PropertyValueFactory<ContactLog,String>("clientname"));
        phonenumbrColom.setCellValueFactory(new PropertyValueFactory<ContactLog,String>("phnnumber"));
       addressColom.setCellValueFactory(new PropertyValueFactory<ContactLog,String>("address"));
        contacrLogTableView.setItems(ContactList);
        
    }    

    @FXML
    private void addtoTableView(ActionEvent event) {
        ObservableList<ContactLog> contactList = adv.getcontactlist();
        for(ContactLog c:contactList){
        contacrLogTableView.getItems().addAll(c);
        }
        }
           
       
       
        
         
        //isnt working yet
      
    

    @FXML
    private void deletefromTableView(ActionEvent event) {
        
        ContactLog c = contacrLogTableView.getSelectionModel().getSelectedItem();
        if (c!=null);
        ContactList.remove(c);
       
    }

    @FXML
    private void BacktoDashOnClick(ActionEvent event) throws IOException {
        Parent root = null;
       FXMLLoader myLoader = new FXMLLoader(getClass().getResource("LegalAdvisor_Dashboard.fxml"));
       root = (Parent) myLoader.load();
       Scene myScene = new Scene(root); 
       Stage myStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
       myStage.setScene(myScene);
       myStage.show();
    }

    @FXML
    private void addtobin(ActionEvent event) {
        String name = clientname.getText();
          
            if(name.isEmpty()){
            blankinfo.show();
        blankinfo.showAndWait();
        return;
        }
        
        String number = phonenumbrTextField.getText();
        
        if(number.isEmpty()){
            blankinfo.show();
        blankinfo.showAndWait();
        return;
        }
        
        String addrs = addressTextField.getText();
        if(addrs.isEmpty()){
            blankinfo.show();
        blankinfo.showAndWait();
        return;
        }
        try{
            name.toString();
            number.toString();
            addrs.toString();
        boolean sign = number.contains("+");
        if(!sign==true && number.length()>11){
            wrongphninfo.showAndWait();
        }
        adv.Addcontact_tocontactlog(name,number,addrs);
        boolean ok = adv.Addcontact_tocontactlog(name, number, addrs);
        if (ok){
        Alert success = new Alert(Alert.AlertType.INFORMATION,"Bin file created");
        success.showAndWait();
        }
        
        }catch(Exception e) {
            System.err.println("Error: " + e.getMessage());
            
        }
    
    }
}


