/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package group3_2111652_2110819_2220923_2220044_marriageregisteroffice.sufi;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class BackupTableController implements Initializable {

    @FXML
    private TableView<MarriageRecord> verifyRecordTable;
    @FXML
    private TableColumn<MarriageRecord, String> marriageRecordIDCol;
    @FXML
    private TableColumn<MarriageRecord, String> candidateName1Col;
    @FXML
    private TableColumn<MarriageRecord, String> candidateName2Col;
    private Archivist a = new Archivist("x","y","z");
    private String username, pass, type;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        marriageRecordIDCol.setCellValueFactory(new PropertyValueFactory<MarriageRecord, String>("marriageRecordID"));
        candidateName1Col.setCellValueFactory(new PropertyValueFactory<MarriageRecord, String>("candidateName1"));
        candidateName2Col.setCellValueFactory(new PropertyValueFactory<MarriageRecord, String>("candidateName2"));
        verifyRecordTable.setItems(a.getMarriageRecord());
        verifyRecordTable.setRowFactory(tv -> {
            TableRow<MarriageRecord> row = new TableRow<>();
            row.setOnMouseClicked(event -> {
                if (!row.isEmpty() && event.getButton() == MouseButton.PRIMARY && event.getClickCount() == 1) {
                    MarriageRecord selectedRecord = row.getItem();
                    try {
                        a.backupSingleScene(selectedRecord);
                    } catch (IOException ex) {
                        
                    }
                }
            });
            return row;
        });
    }    


    @FXML
    private void logout(MouseEvent event) throws IOException {
        a.logoutScene(event);
    }

    @FXML
    private void dashboard(MouseEvent event) throws IOException {
        a.dashboardScene(event, username, pass, type);
    }

    @FXML
    private void downloadRecords(MouseEvent event) throws IOException {
        a.downloadAllRecords(event);
        a.dashboardScene(event, username, pass, type);
    }

    void init(String a, String b, String c) {
        username = a;
        pass = b;
        type = c;
    }
    
}
