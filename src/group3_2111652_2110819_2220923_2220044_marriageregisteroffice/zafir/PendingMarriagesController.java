/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package group3_2111652_2110819_2220923_2220044_marriageregisteroffice.zafir;

import group3_2111652_2110819_2220923_2220044_marriageregisteroffice.User;
import group3_2111652_2110819_2220923_2220044_marriageregisteroffice.arpita.MarriageApplication;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author zafir
 */
public class PendingMarriagesController implements Initializable {

    @FXML
    private TableView<DummyMarriage> table;
    @FXML
    private TableColumn<DummyMarriage, String> brideCol;
    @FXML
    private TableColumn<DummyMarriage, String> groomCol;
    @FXML
    private TableColumn<DummyMarriage, String> dateCol;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        brideCol.setCellValueFactory(new PropertyValueFactory<>("bride"));
        groomCol.setCellValueFactory(new PropertyValueFactory<>("groom")); 
        dateCol.setCellValueFactory(new PropertyValueFactory<>("date"));
    }  
    
    User currentUser;
    ArrayList<MarriageApplication> maList = new ArrayList<>();
    ArrayList<DummyMarriage> dummyList = new ArrayList<>();
    public void receiveUserData(User user) throws IOException{
        currentUser = user;
        
        loadMarriges();
        
        table.getItems().addAll(dummyList);
        
        return;
    }

    @FXML
    private void viewInDetailOnclick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("marriageView.fxml"));
        Parent root = loader.load(); 
        
        DummyMarriage selectedDummy = table.getSelectionModel().getSelectedItem();
        if (selectedDummy == null) {
            System.err.println("Please select a marrage to view");
            return;
        }
        
        MarriageApplication selectedMA = null;
        for (MarriageApplication ma : maList) {
            if (selectedDummy.getId().equals(ma.getApplicationID())) {
                selectedMA = ma;
            }
        }

        MarriageViewController marriageViewController = loader.getController();
        marriageViewController.receiveUserData(currentUser, selectedMA);

        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Marriage Registrar Dashbord");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void backButtonOnClick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("marriageRegistrarDashbord.fxml"));
        Parent root = loader.load(); 

        MarriageRegistrarDashbordController marriageRegistrarDashbordController = loader.getController();
        marriageRegistrarDashbordController.receiveUserData(currentUser);

        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Marriage Registrar Dashbord");
        stage.setScene(scene);
        stage.show();
    }
    
    private void loadMarriges() throws FileNotFoundException, IOException {
        File file;
        FileInputStream fis;
        ObjectInputStream ois;

        try {
            file = new File("bin/MarriageApplication.bin");
            
            if (!file.exists()) return;
            
            fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);
                      
            try {
                while (true) {
                    MarriageApplication realMA = (MarriageApplication) ois.readObject();
                    DummyMarriage dm = new DummyMarriage(realMA.getBrideName(), realMA.getGroomName(), 
                            realMA.getPefferredMarriageDate().toString(), realMA.getApplicationID());
                    
                    maList.add(realMA);
                    dummyList.add(dm);
                }                
            } catch (EOFException e) {
                System.out.println("All marrage read succesfully");
                ois.close();
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
}
