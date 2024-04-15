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
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author zafir
 */
public class AllUserController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    ArrayList<String> roles = new ArrayList<>();
    ArrayList<DummyUserView> dummyUsers = new ArrayList<>();
    ArrayList<User> realUser = new ArrayList<>();
    
    @FXML
    private TableView<DummyUserView> userViewTable;
    @FXML
    private TableColumn<DummyUserView, String> userNameCol;
    @FXML
    private TableColumn<DummyUserView, String> typeCol;
    @FXML
    private ComboBox<String> filterComboBox;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // All user type
        roles.add("Marriage Registrar");
        roles.add("IT Admin");
        roles.add("Marriage Candidate");
        roles.add("Marriage Counselor");
        roles.add("Legal Advisor");
        roles.add("Accountant");
        roles.add("Witness");
        roles.add("Archivist");
        
        
        
        // Loading user data from bin files
        loadUserData();
        
        // Initializing talbe
        userNameCol.setCellValueFactory(new PropertyValueFactory<>("username"));
        typeCol.setCellValueFactory(new PropertyValueFactory<>("type"));
        
        // Setting data to table
        userViewTable.getItems().addAll(dummyUsers);
        
        // Setting up ComboBox
        filterComboBox.getItems().addAll(roles);
    }
       
    User currentUser;
    public void receiveUserData(User user){
        currentUser = (ItAdmin) user;
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
    
    private void loadUserData() {
        dummyUsers.clear();
        for (String type : roles) {
            File file;
            FileInputStream fis;
            ObjectInputStream ois;
            
            try {
                file = new File(User.getPath(type));
                fis = new FileInputStream(file);
                ois = new ObjectInputStream(fis);
                
                try {
                    
                    while (true) {
                        User user = ((User) ois.readObject());
                        DummyUserView newDummyUser = new DummyUserView(user.getUsername(), user.getType());
                        dummyUsers.add(newDummyUser);
                        realUser.add(user);
                    }
                    
                } catch (EOFException eOFException) {
                    System.out.println(type + " bin file read successfully");
                }
                
            } catch(Exception e) {
                System.out.println(type + " bin file dose not exist.");
            }
        }
        
        System.out.println("All user bin file read successfully");
    }

    @FXML
    private void filterByComboBoxOnSelect(ActionEvent event) {
        String type = filterComboBox.getValue();
        ArrayList<DummyUserView> filtered = new ArrayList<>();
        
        for (DummyUserView d : dummyUsers) {
            if (d.getType().equals(type)) {
                filtered.add(d);
            }
        }
        
        userViewTable.getItems().clear();
        userViewTable.getItems().setAll(filtered);
    }

    @FXML
    private void clearButtonOnClick(ActionEvent event) {
        userViewTable.getItems().clear();
        userViewTable.getItems().addAll(dummyUsers);
    }

    @FXML
    private void viewUserOnClick(ActionEvent event) throws IOException {
        DummyUserView dummySelected = userViewTable.getSelectionModel().getSelectedItem();
        User selectedUser = null;
        
        for (User u : realUser) {
            if (u.getUsername().equals(dummySelected.username)) {
                selectedUser = u;
            }
        }
        
        if (dummySelected == null) {
            // Show alart
            System.out.println("No user selected");
            return;
        }
        
        // userView
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("userView.fxml"));
        Parent root = loader.load(); 

        UserViewController userViewController = loader.getController();
        userViewController.receiveUserData(currentUser, selectedUser);

        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("User View");
        stage.setScene(scene);
        stage.show();
    }
}
