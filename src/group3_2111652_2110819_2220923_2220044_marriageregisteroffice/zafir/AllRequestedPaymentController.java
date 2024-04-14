/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package group3_2111652_2110819_2220923_2220044_marriageregisteroffice.zafir;

import group3_2111652_2110819_2220923_2220044_marriageregisteroffice.User;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
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
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author zafir
 */
public class AllRequestedPaymentController implements Initializable {

    @FXML
    private TableView<DummyEarlyPaymentView> table;
    @FXML
    private TableColumn<DummyEarlyPaymentView, String> subCol;
    @FXML
    private TableColumn<DummyEarlyPaymentView, String> statusCol;
    @FXML
    private Label pendingLable;
    @FXML
    private Label acceptedLable;

    /**
     * Initializes the controller class.
     */
    
    ArrayList<DummyEarlyPaymentView> dummyEarlyPaymentViews = new ArrayList<>();
    
    // Note to self
    // Too way too long to realize
    // intialize method runs firts, then recivedUser
    // I was getting nullPointer exeption becase of i was trying to load stuff in 
    // Intializer before I had any CurretUser
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        subCol.setCellValueFactory(new PropertyValueFactory<>("subject"));
        statusCol.setCellValueFactory(new PropertyValueFactory<>("isGranted"));    
    } 
    
    User currentUser;
    public void receiveUserData(User user){
        currentUser = (ItAdmin) user;
        
        if (currentUser == null) System.err.println("CurrentUser is Null");
        
        loadPayments();
        table.getItems().setAll(dummyEarlyPaymentViews);
        
        int pendingCount = 0;
        int acceptedCount = 0;
        for (DummyEarlyPaymentView d : dummyEarlyPaymentViews) {
            if (d.isGranted.equals("Yes")) acceptedCount++;
            if (d.isGranted.equals("No")) pendingCount++;
        }
        
        pendingLable.setText("Pending: " + pendingCount);
        acceptedLable.setText("Accepted: " + acceptedCount);
        
        return;
    }
    
    private void loadPayments(){
        File file;
        FileInputStream fis;
        ObjectInputStream ois;

        try {
            file = new File("bin/earlyPayment.bin");
            
            if (!file.exists()) return;
            
            fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);
                      
            try {
                while (true) {
                    EarlyPayment payment = (EarlyPayment) ois.readObject();
                    
                    if (payment == null) {
                        System.err.println("Payment obj is null");
                    }
                    
                    payment.toString();
                    if (payment.getSubmittedBy().equals(currentUser.getUsername())) {
                        String subject = payment.getSubject();
                        String isGranted = "No";
                   
                        if (payment.isIsGranted()) isGranted = "Yes";
                        
                        DummyEarlyPaymentView dummyEarlyPaymentView = new DummyEarlyPaymentView(subject, isGranted);
                        dummyEarlyPaymentViews.add(dummyEarlyPaymentView);
                    }
                }

            } catch (EOFException eOFException) {
                System.out.println("All early payment read succesfully");
                ois.close();
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void backButtonOnClick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("adminDashbord.fxml"));
        Parent root = loader.load(); 

        AdminDashbordController adminDashbordController = loader.getController();
        adminDashbordController.receiveUserData(currentUser);

        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Admin Dashbord");
        stage.setScene(scene);
        stage.show();
    }
    
}
