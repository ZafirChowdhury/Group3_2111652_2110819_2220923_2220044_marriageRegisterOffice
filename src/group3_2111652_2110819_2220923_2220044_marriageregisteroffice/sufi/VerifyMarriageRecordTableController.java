/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package group3_2111652_2110819_2220923_2220044_marriageregisteroffice.sufi;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author User
 */
public class VerifyMarriageRecordTableController implements Initializable {

    @FXML
    private TableView<?> verifyRecordTable;
    @FXML
    private TableColumn<?, ?> marriageIDCol;
    @FXML
    private TableColumn<?, ?> candidateName1Col;
    @FXML
    private TableColumn<?, ?> candidateName2Col;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void logout(MouseEvent event) {
    }

    @FXML
    private void dashboard(MouseEvent event) {
    }
    
}
