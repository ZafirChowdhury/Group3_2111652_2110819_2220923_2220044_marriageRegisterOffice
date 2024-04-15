/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group3_2111652_2110819_2220923_2220044_marriageregisteroffice.sufi;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
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
import java.util.HashSet;
import java.util.Iterator;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.input.MouseEvent;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
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

    
    


    public void addMarriageRecordScene(MouseEvent event, String username, String pass, String type) throws IOException {
        FXMLLoader loader= new FXMLLoader();
        loader.setLocation(getClass().getResource("addMarriageRecord.fxml"));
        Parent parent= loader.load();
        AddMarriageRecordController c = loader.getController();
        c.init(username,pass,type);
        Scene scene= new Scene(parent);
        Stage stage=(Stage)((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Marriage Register Office");
        stage.show();
    }

    
    public void updateProfileScene(MouseEvent event, String username, String pass, String type) throws IOException {
        FXMLLoader loader= new FXMLLoader();
        loader.setLocation(getClass().getResource("updateArchivistProfile.fxml"));
        Parent parent= loader.load();
        UpdateArchivistProfileController c = loader.getController();
        c.init(username, pass, type);
        Scene scene= new Scene(parent);
        Stage stage=(Stage)((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Marriage Register Office");
        stage.show();
    }

    
    public void updateMarriageRecordsScene(MouseEvent event, String username, String pass, String type) throws IOException {
        FXMLLoader loader= new FXMLLoader();
        loader.setLocation(getClass().getResource("updateMarriageRecordTable.fxml"));
        Parent parent= loader.load();
        UpdateMarriageRecordTableController c = loader.getController();
        c.init(username,pass,type);
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

    
    public void viewFeedbackScene(MouseEvent event, String username, String pass, String type) throws IOException {
        FXMLLoader loader= new FXMLLoader();
        loader.setLocation(getClass().getResource("feedbackTable.fxml"));
        Parent parent= loader.load();
        FeedbackTableController c = loader.getController();
        c.init(username,pass,type);
        Scene scene= new Scene(parent);
        Stage stage=(Stage)((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Marriage Register Office");
        stage.show();
    }

    
    public void backupRecords(MouseEvent event, String username, String pass, String type) throws IOException {
        FXMLLoader loader= new FXMLLoader();
        loader.setLocation(getClass().getResource("backupTable.fxml"));
        Parent parent= loader.load();
        BackupTableController c = loader.getController();
        c.init(username,pass,type);
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
    

    public void dashboardScene(MouseEvent event, String username, String pass, String type) throws IOException {
        FXMLLoader loader= new FXMLLoader();
        loader.setLocation(getClass().getResource("archivistDashboard.fxml"));
        Parent parent= loader.load();
        ArchivistDashboardController c = loader.getController();
        c.init(username,pass,type);
        Scene scene= new Scene(parent);
        Stage stage=(Stage)((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Marriage Register Office");
        stage.show();
    }
     
     public void addMarriageRecordToFile(int marriageID, String candidateName1, int age1, String nationality1, int NID1, String father1, String mother1, String witness1, String rel1, String candidateName2, int age2, String nationality2, int NID2, String father2, String mother2, String witness2, String rel2) throws IOException{
        Random r = new Random();
        MarriageRecord m = new MarriageRecord(Integer.toString(r.nextInt(10000)), marriageID, candidateName1, age1, nationality1, NID1, father1, mother1, witness1, rel1, candidateName2, age2, nationality2, NID2, father2, mother2, witness2, rel2);
        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        
        try{
            f=new File("bin/marriageRecord.bin");
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
    }
     
     public ObservableList<MarriageRecord> getMarriageRecord(){
         ObservableList<MarriageRecord> mr= FXCollections.observableArrayList();
         File f = null;
         FileInputStream fis = null;
         ObjectInputStream ois = null;
         
         try{
             f= new File("bin/marriageRecord.bin");
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

     public void downloadAllRecords(MouseEvent event){
         ObservableList<MarriageRecord> mrd = FXCollections.observableArrayList();
         mrd = getMarriageRecord();
         FileChooser fc = new FileChooser();
         fc.getExtensionFilters().add(new ExtensionFilter("PDF files","*.pdf"));
         File f = fc.showSaveDialog(null);
         try{
            if(f!=null){
               PdfWriter pw = new PdfWriter(new FileOutputStream(f));
               PdfDocument pdf = new PdfDocument(pw);
               Document doc = new Document(pdf);
               for(MarriageRecord m:mrd){
                   pdf.addNewPage();
                   doc.setLeftMargin(70);
                   String s = "Maariage Record ID: "+ m.getMarriageRecordID()+ "\n"
                           + "Maariage ID: "+ m.getMarriageID()+ "\n"
                           + "Candidate Name 1: "+ m.getCandidateName1()+ "\n"
                           + "Age: "+ m.getAge1()+ "\n"
                           + "Nationality: "+ m.getNationality1()+ "\n"
                           + "NID: "+ m.getNID1()+ "\n"
                           + "Father's Name: "+ m.getFather1()+ "\n"
                           + "Mother's Name: "+ m.getMother1()+ "\n"
                           + "Witness Name: "+ m.getWitness1()+ "\n"
                           + "Witness Relationship: "+ m.getRel1()+ "\n"
                           + "Candidate Name 2: "+ m.getCandidateName2()+ "\n"
                           + "Age: "+ m.getAge2()+ "\n"
                           + "Nationality: "+ m.getNationality2()+ "\n"
                           + "NID: "+ m.getNID2()+ "\n"
                           + "Father's Name: "+ m.getFather2()+ "\n"
                           + "Mother's Name: "+ m.getMother2()+ "\n"
                           + "Witness Name: "+ m.getWitness2()+ "\n"
                           + "Witness Relationship: "+ m.getRel2()+ "\n";
                   Paragraph para = new Paragraph(s);
                   doc.add(para);
                   Paragraph para1 = new Paragraph("--------------------------------------------------------------------------");
                   doc.add(para1);
                   
                   
                           
               }
               doc.close();
                   
               Alert a = new Alert(Alert.AlertType.INFORMATION);
               a.setContentText("The pdf is saved.");
               a.showAndWait();
                   
            }
         }
         catch(IOException e){
             Alert a = new Alert(Alert.AlertType.INFORMATION);
                   a.setContentText("The pdf is not saved.");
                   a.showAndWait();
             
         }
         
     }
     
     public void backupSingleScene(MarriageRecord m) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("backupSingle.fxml"));
        Parent root = loader.load();
        BackupSingleController controller = loader.getController();
        controller.init(m); 
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setTitle("Marriage Register Office");
        stage.show();
     }
     
     public void downloadSingleRecord(MouseEvent event, MarriageRecord m){
         FileChooser fc = new FileChooser();
         fc.getExtensionFilters().add(new ExtensionFilter("PDF files","*.pdf"));
         File f = fc.showSaveDialog(null);
         try{
            if(f!=null){
               PdfWriter pw = new PdfWriter(new FileOutputStream(f));
               PdfDocument pdf = new PdfDocument(pw);
               Document doc = new Document(pdf);
               pdf.addNewPage();
               doc.setLeftMargin(70);
               String s = "Maariage Record ID: "+ m.getMarriageRecordID()+ "\n"
                           + "Maariage ID: "+ m.getMarriageID()+ "\n"
                           + "Candidate Name 1: "+ m.getCandidateName1()+ "\n"
                           + "Age: "+ m.getAge1()+ "\n"
                           + "Nationality: "+ m.getNationality1()+ "\n"
                           + "NID: "+ m.getNID1()+ "\n"
                           + "Father's Name: "+ m.getFather1()+ "\n"
                           + "Mother's Name: "+ m.getMother1()+ "\n"
                           + "Witness Name: "+ m.getWitness1()+ "\n"
                           + "Witness Relationship: "+ m.getRel1()+ "\n"
                           + "Candidate Name 2: "+ m.getCandidateName2()+ "\n"
                           + "Age: "+ m.getAge2()+ "\n"
                           + "Nationality: "+ m.getNationality2()+ "\n"
                           + "NID: "+ m.getNID2()+ "\n"
                           + "Father's Name: "+ m.getFather2()+ "\n"
                           + "Mother's Name: "+ m.getMother2()+ "\n"
                           + "Witness Name: "+ m.getWitness2()+ "\n"
                           + "Witness Relationship: "+ m.getRel2()+ "\n";
               Paragraph para = new Paragraph(s);
               doc.add(para);
               doc.close();
                   
               Alert a = new Alert(Alert.AlertType.INFORMATION);
               a.setContentText("The pdf is saved.");
               a.showAndWait();
                   
            }
         }
         catch(IOException e){
             Alert a = new Alert(Alert.AlertType.INFORMATION);
                   a.setContentText("The pdf is not saved.");
                   a.showAndWait();
             
         }
         
     }
     
     public void updateMarriageRecordConfirmScene(MouseEvent event, MarriageRecord m, String username, String pass, String type) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("updateMarriageRecordConfirm.fxml"));
        Parent root = loader.load();
        UpdateMarriageRecordConfirmController controller = loader.getController();
        controller.init(m, username, pass, type); 
        Stage stage=(Stage)((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Marriage Register Office");
        stage.show();
     }
     
     public void updateMarriageRecordConfirm(String marriageRecordID, String candidate1, int age1, int NID1, String nationality1, String father1, String mother1, String witness1, String rel1, String candidate2, int age2, int NID2, String nationality2, String father2, String mother2, String witness2, String rel2) throws IOException{
        ObservableList<MarriageRecord> mr = getMarriageRecord();
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try{
            for (MarriageRecord m : mr){
                if(m.getMarriageRecordID().equals(marriageRecordID)){
                    m.setCandidateName1(candidate1);
                    m.setAge1(age1);
                    m.setNID1(NID1);
                    m.setNationality1(nationality1);
                    m.setFather1(father1);
                    m.setMother1(mother1);
                    m.setWitness1(witness1);
                    m.setRel1(rel1);
                    m.setCandidateName2(candidate2);
                    m.setAge2(age2);
                    m.setNID2(NID2);
                    m.setNationality2(nationality2);
                    m.setFather2(father2);
                    m.setMother2(mother2);
                    m.setWitness2(witness2);
                    m.setRel2(rel2);
                    break;
                } 
            }
            fos = new FileOutputStream("bin/marriageRecord.bin");
            oos = new ObjectOutputStream(fos);
            for (MarriageRecord m : mr){
                oos.writeObject(m); 
            }
        }
        catch (Exception e){
        }
        finally{
            try{
                oos.close();
            }
            catch(Exception e){
            }
        }
    }
     public void deleteRecord(String marriageRecordID){
        ObservableList<MarriageRecord> mr = getMarriageRecord();
        Iterator<MarriageRecord> i = mr.iterator();
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try{
            while(i.hasNext()){
                MarriageRecord m = i.next();
                if(m.getMarriageRecordID().equals(marriageRecordID)){
                    i.remove();
                    break;
                }
            }
            fos = new FileOutputStream("bin/marriageRecord.bin");
            oos = new ObjectOutputStream(fos);
            for (MarriageRecord m : mr){
                oos.writeObject(m); 
            }
        }
        catch (Exception e){
        }
        finally{
            try{
                oos.close();
            }
            catch(Exception e){
            }
        }
     }
     
     public ObservableList<Archivist> getArchivistRecords() throws IOException{
        ObservableList<Archivist> al = FXCollections.observableArrayList();
        File f = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        
        try{
            f= new File("bin/archivistProfiles.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            try{
                Archivist a;
                while (true){
                    a =(Archivist) ois.readObject();
                    al.add(a);
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
        return al;
    }
     
     public void addProfileConfirm(String username, String pass, String type, String name, String address) throws IOException{
        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        Random r = new Random();
        Archivist a = new Archivist(r.nextInt(10000), name, address, username, pass, type);
        try{
            f = new File("bin/archivistProfiles.bin");
            if(f.exists()){
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }
            oos.writeObject(a);
        }
        catch (Exception e){
        }
        finally{
            try{
                oos.close();
            }
            catch(Exception e){
            }
        }
    }
     
     public void updateProfileConfirm(String username, String pass, String type, String name, String address) throws IOException{
        ObservableList<Archivist> al = getArchivistRecords();
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try{
            for (Archivist a: al){
                if(a.getUsername().equals(username)){
                    a.setAddress(address);
                    a.setName(name);
                    break;
                } 
            }
            fos = new FileOutputStream("bin/archivistProfiles.bin");
            oos = new ObjectOutputStream(fos);
            for (Archivist a: al){
                oos.writeObject(a); 
            }
        }
        catch (Exception e){
        }
        finally{
            try{
                oos.close();
            }
            catch(Exception e){
            }
        }
    }
     
     public ObservableList<Feedback> getFeedbacks(){
         ObservableList<Feedback> fl= FXCollections.observableArrayList();
         File f = null;
         FileInputStream fis = null;
         ObjectInputStream ois = null;
         
         try{
             f= new File("bin/feedback.bin");
             fis = new FileInputStream(f);
             ois = new ObjectInputStream(fis);
             Feedback fb;
             try{
                 while (true){
                     fb=(Feedback) ois.readObject();
                     
                     fl.add(fb);
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
         
         return fl;
     }
     
     public void singleFeedbackScene(Feedback f) throws IOException{
        FXMLLoader loader= new FXMLLoader();
        loader.setLocation(getClass().getResource("viewFeedback.fxml"));
        Parent parent= loader.load();
        ViewFeedbackController c = loader.getController();
        c.init(f);
        Stage stage = new Stage();
        stage.setScene(new Scene(parent));
        stage.setTitle("Marriage Register Office");
        stage.show();
     }
}
