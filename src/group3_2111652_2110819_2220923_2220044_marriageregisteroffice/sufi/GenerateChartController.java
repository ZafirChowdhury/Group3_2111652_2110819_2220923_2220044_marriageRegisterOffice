/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package group3_2111652_2110819_2220923_2220044_marriageregisteroffice.sufi;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author User
 */
public class GenerateChartController implements Initializable {

    @FXML
    private ComboBox<?> yearCB;
    @FXML
    private Label yearL;
    @FXML
    private BarChart<?, ?> generateChartL;
    @FXML
    private NumberAxis yearY;
    @FXML
    private CategoryAxis monthY;

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

    @FXML
    private void selectYear(MouseEvent event) {
    }

    @FXML
    private void submitCheckingStatus(MouseEvent event) {
    }
    
}
