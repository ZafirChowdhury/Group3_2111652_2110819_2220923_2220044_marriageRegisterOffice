/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package group3_2111652_2110819_2220923_2220044_marriageregisteroffice.sufi;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
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
public class FeedbackTableController implements Initializable {

    @FXML
    private TableView<Feedback> requestTable;
    @FXML
    private TableColumn<Feedback, String> feedbackCol;
    @FXML
    private TableColumn<Feedback, String> marriageIDCol;
    @FXML
    private TableColumn<Feedback, String> userNameCol;
    private Archivist ar = new Archivist("x", "y", "z");
    private String username, pass, type;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void logout(MouseEvent event) throws IOException {
        ar.logoutScene(event);
    }

    @FXML
    private void dashboard(MouseEvent event) throws IOException {
        ar.dashboardScene(event, username, pass, type);
    }

    void init(String a, String b, String c) {
        username = a;
        pass = b;
        type = c;
        
        marriageIDCol.setCellValueFactory(new PropertyValueFactory<Feedback, String>("marriageID"));
        userNameCol.setCellValueFactory(new PropertyValueFactory<Feedback, String>("username"));
        feedbackCol.setCellValueFactory(new PropertyValueFactory<Feedback, String>("feedback"));
        requestTable.setItems(ar.getFeedbacks());
        requestTable.setRowFactory(tv -> {
            TableRow<Feedback> row = new TableRow<>();
            row.setOnMouseClicked(event -> {
                if (!row.isEmpty() && event.getButton() == MouseButton.PRIMARY && event.getClickCount() == 1) {
                    Feedback selectedFeedback = row.getItem();
                    try {
                        ar.singleFeedbackScene(selectedFeedback);
                    } catch (IOException ex) {
                        
                    }
                }
            });
            return row;
        });
    }
    
    
    
}
