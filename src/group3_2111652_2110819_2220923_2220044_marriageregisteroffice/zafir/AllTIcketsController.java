/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package group3_2111652_2110819_2220923_2220044_marriageregisteroffice.zafir;

import group3_2111652_2110819_2220923_2220044_marriageregisteroffice.User;
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
public class AllTIcketsController implements Initializable {

    @FXML
    private TableView<SupportTicket> table;
    @FXML
    private TableColumn<SupportTicket, String> subCol;
    @FXML
    private TableColumn<SupportTicket, String> statusCol;
    @FXML
    private Label openTicketCountLable;
    @FXML
    private Label outputLable;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        subCol.setCellValueFactory(new PropertyValueFactory<>("subject"));
        statusCol.setCellValueFactory(new PropertyValueFactory<>("isCloded")); 
    }

    User currentUser;
    ArrayList<SupportTicket> supportTicketList = new ArrayList<>();
    public void receiveUserData(User user) throws IOException{
        currentUser = (ItAdmin) user;
        
        loadTickets();
        
        table.getItems().setAll(supportTicketList);
        
        int openTicketCounter = 0;
        for (SupportTicket st : supportTicketList) {
            if (st.getIsCloded().equals("Open")) {
                openTicketCounter++;
            }
        }
        openTicketCountLable.setText("Open Ticket Count: " + openTicketCounter);
        
        return;
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
    
    private void loadTickets() throws FileNotFoundException, IOException {
        File file;
        FileInputStream fis;
        ObjectInputStream ois;

        try {
            file = new File("bin/supportTicket.bin");
            
            if (!file.exists()) return;
            
            fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);
                      
            try {
                while (true) {
                    SupportTicket sp = (SupportTicket) ois.readObject();                  
                        supportTicketList.add(sp);
                }                
            } catch (EOFException e) {
                System.out.println("All tickets read succesfully");
                ois.close();
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void viewSupportTicketOnClick(ActionEvent event) throws IOException {
        SupportTicket selectedSupportTicket = table.getSelectionModel().getSelectedItem();
        if (selectedSupportTicket == null) {
            outputLable.setText("Please select a support ticket to view.");
            return;
        }
        
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("ticketView.fxml"));
        Parent root = loader.load(); 

        TicketViewController ticketViewController = loader.getController();
        ticketViewController.receiveUserData(currentUser, selectedSupportTicket);

        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Ticket View");
        stage.show();
    }
    
}
