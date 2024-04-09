/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group3_2111652_2110819_2220923_2220044_marriageregisteroffice.sufi;

import group3_2111652_2110819_2220923_2220044_marriageregisteroffice.User;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Random;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import java.io.IOException;
import java.io.Serializable;
import java.time.LocalDate;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 *
 * @author User
 */
public class Archivist extends User implements Serializable {
    private int archivistID;
    private String name;
    private String address;

    public Archivist(String username, String password, String type) {
        super(username, password, type);
    }

    public Archivist(int archivistID, String name, String address, String username, String password, String type) {
        super(username, password, type);
        this.archivistID = archivistID;
        this.name = name;
        this.address = address;
    }


    public int getArchivistID() {
        return archivistID;
    }

    public void setArchivistID(int archivistID) {
        this.archivistID = archivistID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Archivist{" + "archivistID=" + archivistID + ", name=" + name + ", address=" + address + '}';
    }

    
    


    public void addMarriageRecordScene(MouseEvent event) throws IOException {
        FXMLLoader loader= new FXMLLoader();
        loader.setLocation(getClass().getResource("addMarriageRecord.fxml"));
        Parent parent= loader.load();
        Scene scene= new Scene(parent);
        Stage stage=(Stage)((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Marriage Register Office");
        stage.show();
    }

    
    public void verifyMarriageRecordsScene(MouseEvent event) throws IOException {
        FXMLLoader loader= new FXMLLoader();
        loader.setLocation(getClass().getResource("verifyMarrieageRecordTable.fxml"));
        Parent parent= loader.load();
        Scene scene= new Scene(parent);
        Stage stage=(Stage)((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Marriage Register Office");
        stage.show();
    }

    
    public void updateMarriageRecordsScene(MouseEvent event) throws IOException {
        FXMLLoader loader= new FXMLLoader();
        loader.setLocation(getClass().getResource("updateMarriageRecordTable.fxml"));
        Parent parent= loader.load();
        Scene scene= new Scene(parent);
        Stage stage=(Stage)((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Marriage Register Office");
        stage.show();
    }

    
    public void verifyMaritalStatusScene(MouseEvent event) throws IOException {
        FXMLLoader loader= new FXMLLoader();
        loader.setLocation(getClass().getResource("verifyMaritalStatusTable.fxml"));
        Parent parent= loader.load();
        Scene scene= new Scene(parent);
        Stage stage=(Stage)((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Marriage Register Office");
        stage.show();
    }

    
    public void viewMarriageStatisticsScene(MouseEvent event) throws IOException {
        FXMLLoader loader= new FXMLLoader();
        loader.setLocation(getClass().getResource("generateChart.fxml"));
        Parent parent= loader.load();
        Scene scene= new Scene(parent);
        Stage stage=(Stage)((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Marriage Register Office");
        stage.show();
    }

    
    public void viewOfficialRequestsScene(MouseEvent event) throws IOException {
        FXMLLoader loader= new FXMLLoader();
        loader.setLocation(getClass().getResource("requestofMarriageRecordTable.fxml"));
        Parent parent= loader.load();
        Scene scene= new Scene(parent);
        Stage stage=(Stage)((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Marriage Register Office");
        stage.show();
    }

    
    public void viewFeedbackScene(MouseEvent event) throws IOException {
        FXMLLoader loader= new FXMLLoader();
        loader.setLocation(getClass().getResource("feedbackTable.fxml"));
        Parent parent= loader.load();
        Scene scene= new Scene(parent);
        Stage stage=(Stage)((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Marriage Register Office");
        stage.show();
    }

    
    public void backupRecords(MouseEvent event) throws IOException {
        FXMLLoader loader= new FXMLLoader();
        loader.setLocation(getClass().getResource("backupTable.fxml"));
        Parent parent= loader.load();
        Scene scene= new Scene(parent);
        Stage stage=(Stage)((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Marriage Register Office");
        stage.show();
    }
    
    public void logoutScene(MouseEvent event) throws IOException {
        FXMLLoader loader= new FXMLLoader();

        loader.setLocation(getClass().getResource("/group3_2111652_2110819_2220923_2220044_marriageregisteroffice/login.fxml"));

        loader.setLocation(getClass().getResource("login.fxml"));

        Parent parent= loader.load();
        Scene scene= new Scene(parent);
        Stage stage=(Stage)((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Marriage Register Office");
        stage.show();
    }
    

     public void dashboardScene(MouseEvent event) throws IOException {
        FXMLLoader loader= new FXMLLoader();
        loader.setLocation(getClass().getResource("archivistDashboard.fxml"));
        Parent parent= loader.load();
        Scene scene= new Scene(parent);
        Stage stage=(Stage)((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Marriage Register Office");
        stage.show();
    }
     
     public void addMarriageRecordToFile(MouseEvent event, int marriageID, String candidateName1, int age1, String nationality1, int NID1, String father1, String mother1, String witness1, String rel1, String candidateName2, int age2, String nationality2, int NID2, String father2, String mother2, String witness2, String rel2) throws IOException{
        Random r = new Random();
        MarriageRecord m = new MarriageRecord(Integer.toString(r.nextInt(10000)), marriageID, candidateName1, age1, nationality1, NID1, father1, mother1, witness1, rel1, candidateName2, age2, nationality2, NID2, father2, mother2, witness2, rel2);
        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        
        try{
            f=new File("MarriageRecord.bin");
            if(f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }
            
            oos.writeObject(m);
            
        }
        catch(IOException ex){ 
        }
        finally{
            try{
                if(oos!=null){
                    oos.close();
                }
            }
            catch(IOException ex){
            }
        }
        FXMLLoader loader= new FXMLLoader();
        loader.setLocation(getClass().getResource("archivistDashboard.fxml"));
        Parent parent= loader.load();
        Scene scene= new Scene(parent);
        Stage stage=(Stage)((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Marriage Register Office");
        stage.show();
    }
     
     public ObservableList<MarriageRecord> getMarriageRecord(){
         ObservableList<MarriageRecord> mr= FXCollections.observableArrayList();
         File f = null;
         FileInputStream fis = null;
         ObjectInputStream ois = null;
         
         try{
             f= new File("MarriageRecord.bin");
             fis = new FileInputStream(f);
             ois = new ObjectInputStream(fis);
             MarriageRecord m;
             try{
                 while (true){
                     m=(MarriageRecord) ois.readObject();
                     
                     mr.add(m);
                 }
             }
             catch(EOFException e){
                 
             }
         }
         catch(Exception e){
             
         }
         finally{
            try{
                if(ois!=null){
                    ois.close();
                }
            }
            catch(IOException ex){
            }
        }
         
         return mr;
     }


    

    
    
    
}
