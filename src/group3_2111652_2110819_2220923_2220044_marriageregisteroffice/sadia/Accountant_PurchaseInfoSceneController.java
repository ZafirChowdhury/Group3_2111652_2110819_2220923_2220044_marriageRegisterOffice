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
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author HP 840 G6
 */
public class Accountant_PurchaseInfoSceneController implements Initializable {

    @FXML
    private ComboBox<String> deptnameComboBox;
    @FXML
    private DatePicker purchaseDate;
    @FXML
    private TableView<PurchaseInfo> ViewdetailsonTable;
    @FXML
    private TextField quantityofItemTF;
    @FXML
    private RadioButton accountingdeptRadioButton;
    @FXML
    private RadioButton marriagedeptRadioButton;
    @FXML
    private RadioButton advisorsdeptRadioButton;
    @FXML
    private TextField itemnameTF;
    @FXML
    private TextField itempriceTF;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void createandStoreOnclick(ActionEvent event) {
    }

    @FXML
    private void viewonTextFieldOnclick(ActionEvent event) {
    }

    @FXML
    private void generatePDFonClick(ActionEvent event) {
    }

    @FXML
    private void deptwiseinfoSortOnclick(ActionEvent event) {
    }
    
}
