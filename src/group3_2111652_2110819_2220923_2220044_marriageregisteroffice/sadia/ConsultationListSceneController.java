/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package group3_2111652_2110819_2220923_2220044_marriageregisteroffice.sadia;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
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
public class ConsultationListSceneController implements Initializable {
    private LegalAdvisor adv;
    
    public LegalAdvisor getLegalAdvisor(){
    return adv;
    }
    public void setLegalAdvisor(LegalAdvisor adv){
        
    this.adv = adv;
    
    }
    @FXML
    private TableView<LegAd_ConsultationList> ConsultationListTableView;
    @FXML
    private TableColumn<LegAd_ConsultationList, String> clientnameColom;
    @FXML
    private TableColumn<LegAd_ConsultationList, String> phonenumbrColom;
    @FXML
    private TableColumn<LegAd_ConsultationList, LocalDate> consultationDateColom;
    @FXML
    private TextField clientname;
    @FXML
    private TextField phonenumbrTextField;
    @FXML
    private DatePicker consultDate;
    @FXML
    private TableView<LegAd_ConsultationList> consultationDoneTableView;
    @FXML
    private TableColumn<LegAd_ConsultationList, String> cnameColom;
    @FXML
    private TableColumn<LegAd_ConsultationList, String> doneStatusColom;
    ObservableList<LegAd_ConsultationList> pendList = FXCollections.observableArrayList();
     ObservableList<LegAd_ConsultationList> doneList = FXCollections.observableArrayList();
    Alert blankinfo = new Alert(Alert.AlertType.WARNING,"Cannot keep blank");
    Alert wrongphninfo = new Alert(Alert.AlertType.WARNING,"Put valid contact no. Must be 11 digits with + sign ");
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        clientnameColom.setCellValueFactory(new PropertyValueFactory<LegAd_ConsultationList,String>("Cname"));
        phonenumbrColom.setCellValueFactory(new PropertyValueFactory<LegAd_ConsultationList,String>("cnumber"));
        consultationDateColom.setCellValueFactory(new PropertyValueFactory<LegAd_ConsultationList,LocalDate>("consultDate"));
        cnameColom.setCellValueFactory(new PropertyValueFactory<LegAd_ConsultationList,String>("Cname"));
       
       ConsultationListTableView.setItems(pendList);
       consultationDoneTableView.setItems(doneList);
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
        
        LocalDate doc = consultDate.getValue();
        if(doc==null){
            blankinfo.show();
        blankinfo.showAndWait();
        return;
        }
        try{
            name.toString();
            number.toString();
            
        boolean sign = number.contains("+");
        if(!sign==true && number.length()>11){
            wrongphninfo.showAndWait();
        }
        adv.Adddate_toconsultationList(name, number, doc);
        boolean ok = adv.Adddate_toconsultationList(name, number, doc);
        if (ok){
        Alert success = new Alert(Alert.AlertType.INFORMATION,"Bin file created");
        success.showAndWait();
        }
        
        }catch(Exception e) {
            System.err.println("Error: " + e.getMessage());
            
        }
    
    }
    

    @FXML
    private void markAsDoneOnclick(ActionEvent event) throws IOException {
        
        LegAd_ConsultationList c = ConsultationListTableView.getSelectionModel().getSelectedItem();
        if (c!=null){
        
        pendList.remove(c);
        c.markasDone();
        doneList.add(c);
        
        consultationDoneTableView.setItems(doneList);

        }
        //add to completed consultation list by changing paid status
        
        

        
       
       
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
    private void addtoTableView(ActionEvent event) {
        ObservableList<LegAd_ConsultationList> pendList = adv.pendingList();
        for( LegAd_ConsultationList c:pendList){
      ConsultationListTableView.getItems().addAll(c);
        }
        
    }

}