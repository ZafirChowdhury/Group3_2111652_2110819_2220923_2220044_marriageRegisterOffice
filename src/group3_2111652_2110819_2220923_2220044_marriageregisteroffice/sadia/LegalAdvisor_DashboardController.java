 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package group3_2111652_2110819_2220923_2220044_marriageregisteroffice.sadia;

import group3_2111652_2110819_2220923_2220044_marriageregisteroffice.User;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node; 
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author HP 840 G6
 */
public class LegalAdvisor_DashboardController implements Initializable {
    private LegalAdvisor adv = new LegalAdvisor("c","x","y");
    
    @FXML
    private TextArea viewGuideTextArea;
    @FXML
    private TextArea viewdocTextArea;
    public LegalAdvisor getLegalAdvisor(){
    return adv;
    }
    public void setLegalAdvisor(LegalAdvisor adv){
    this.adv = adv;
    }
    @FXML
    private Label usernameLable;
    private ArrayList<String> fileTypeList, fileTypeList2;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         fileTypeList = new ArrayList<String>();
        fileTypeList.add("*.txt");
        fileTypeList.add("*.doc");
        fileTypeList.add("*.docx");
        fileTypeList.add("*.TXT");
        fileTypeList.add("*.DOC");
        fileTypeList.add("*.DOCX");

        fileTypeList2 = new ArrayList<String>();
        fileTypeList2.add("*.*");
    } 
    
    
    public void receiveUserData(User user){
        adv = (LegalAdvisor) user;
        usernameLable.setText("Welcome,  " + user.getUsername() + "!");
        System.out.println("Logged in as: " + user.toString());
        return;
    }

    @FXML
    private void gotoPrenupSceneOnclick(ActionEvent event) throws IOException {
        Parent root = null;
       FXMLLoader myLoader = new FXMLLoader(getClass().getResource("LegalAdvisor_PrenupDoc.fxml"));
       root = (Parent) myLoader.load();
       Scene myScene = new Scene(root); 
       
       LegalAdvisor_PrenupDocController x = myLoader.getController();
        
        x.setLegalAdvisor(adv);
       
       Stage myStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
       myStage.setScene(myScene);
       myStage.show();
    }

    @FXML
    private void ViewGuidesOnclick(ActionEvent event) {
         FileChooser fc = new FileChooser();
        fc.getExtensionFilters().add(new ExtensionFilter("Text files", fileTypeList));
        fc.getExtensionFilters().add(new ExtensionFilter("All files", fileTypeList2));
        //File f2 = fc.showSaveDialog(null);
        File f = fc.showOpenDialog(null);
        if(f != null){
            try {
                Scanner sc = new Scanner(f);
                String str="";
                while(sc.hasNextLine()){
                    str+=sc.nextLine()+"\n";
                }
               viewdocTextArea.setText(str);
            } catch (FileNotFoundException ex) {
                //Logger.getLogger(FileChooserViewController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @FXML
    private void viewLegalDocumentOnclick(ActionEvent event) {
         FileChooser fc = new FileChooser();
        fc.getExtensionFilters().add(new ExtensionFilter("Text files", fileTypeList));
        fc.getExtensionFilters().add(new ExtensionFilter("All files", fileTypeList2));
        //File f2 = fc.showSaveDialog(null);
        File f = fc.showOpenDialog(null);
        if(f != null){
            try {
                Scanner sc = new Scanner(f);
                String str="";
                while(sc.hasNextLine()){
                    str+=sc.nextLine()+"\n";
                }
               viewGuideTextArea.setText(str);
            } catch (FileNotFoundException ex) {
                //Logger.getLogger(FileChooserViewController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @FXML
    private void gotoChartSceneOnclick(ActionEvent event) {
    }

    @FXML
    private void gotoContactLogScene(ActionEvent event) throws IOException {
        Parent root = null;
       FXMLLoader myLoader = new FXMLLoader(getClass().getResource("ContactLog.fxml"));
       root = (Parent) myLoader.load();
       Scene myScene = new Scene(root); 
       
       ContactLogController y = myLoader.getController();
        
        y.setLegalAdvisor(adv);
       
       Stage myStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
       myStage.setScene(myScene);
       myStage.show();
    }

    @FXML
    private void gotoConsultationListSceneOnclick(ActionEvent event) throws IOException {
        Parent root = null;
       FXMLLoader myLoader = new FXMLLoader(getClass().getResource("ConsultationListScene.fxml"));
       root = (Parent) myLoader.load();
       Scene myScene = new Scene(root); 
       
       ConsultationListSceneController y = myLoader.getController();
        y.setLegalAdvisor(adv);
       
       
       Stage myStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
       myStage.setScene(myScene);
       myStage.show();
    }

    @FXML
    private void logoutOnclick(ActionEvent event) throws IOException {
        FXMLLoader loader= new FXMLLoader();

        loader.setLocation(getClass().getResource("/group3_2111652_2110819_2220923_2220044_marriageregisteroffice/login.fxml"));

        Parent parent= loader.load();
        Scene scene= new Scene(parent);
        Stage stage=(Stage)((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    
}
