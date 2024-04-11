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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author HP 840 G6
 */
public class ContactLogController implements Initializable {

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
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void addtoTableView(ActionEvent event) {
    }

    @FXML
    private void deletefromTableView(ActionEvent event) {
    }
    
}
