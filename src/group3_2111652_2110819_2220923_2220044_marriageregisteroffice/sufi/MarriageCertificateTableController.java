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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author User
 */
public class MarriageCertificateTableController implements Initializable {

    @FXML
    private TableView<DummyMarriageSufi> verifyRecordTable;
    @FXML
    private TableColumn<DummyMarriageSufi, String> marriageIDCol;
    @FXML
    private TableColumn<DummyMarriageSufi, String> candidateName1Col;
    @FXML
    private TableColumn<DummyMarriageSufi, String> candidateName2Col;
    private Witness w = new Witness("x","y","z");
    private String username, pass, type;
    private int witnessID;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void logout(MouseEvent event) throws IOException {
        w.logoutScene(event);
    }

    @FXML
    private void dashboard(MouseEvent event) throws IOException {
        w.dashboardScene(event, username, pass, type);
    }

    void init(String a, String b, String c) throws IOException {
       username=a;
       pass=b;
       type=c;
       ObservableList<Witness> wl = w.getWitnessRecords();
       for (Witness x : wl){
           if(x.getUsername().equals(username)){
               witnessID = x.getWitnessID();
           }
       }
       
       marriageIDCol.setCellValueFactory(new PropertyValueFactory<DummyMarriageSufi, String>("marriageID"));
       candidateName1Col.setCellValueFactory(new PropertyValueFactory<DummyMarriageSufi, String>("candidateName1"));
       candidateName2Col.setCellValueFactory(new PropertyValueFactory<DummyMarriageSufi, String>("candidateName2"));
       verifyRecordTable.setItems(w.getMarriageCertificate(witnessID));
       verifyRecordTable.setRowFactory(tv -> {
           TableRow<DummyMarriageSufi> row = new TableRow<>();
           row.setOnMouseClicked(event -> {
               if (!row.isEmpty() && event.getButton() == MouseButton.PRIMARY && event.getClickCount() == 1) {
                   DummyMarriageSufi selectedMarriage = row.getItem();
                   try {
                       w.marriageCertificateScene(selectedMarriage, event);
                   } catch (IOException ex) {
                        
                   }
               }
           });
           return row;
       });
    }
    
}
