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
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.input.MouseEvent;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 *
 * @author User
 */
public class Witness extends User implements Serializable{
    private int witnessID;
    private String name;
    private int NID;
    private int age;
    private String gender;

    public Witness(String username, String password, String type) {
        super(username, password, type);
    }

    public Witness(int witnessID, String name, int NID, int age, String gender, String username, String password, String type) {
        super(username, password, type);
        this.witnessID = witnessID;
        this.name = name;
        this.NID = NID;
        this.age = age;
        this.gender = gender;
    }

    public int getWitnessID() {
        return witnessID;
    }

    public void setWitnessID(int witnessID) {
        this.witnessID = witnessID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNID() {
        return NID;
    }

    public void setNID(int NID) {
        this.NID = NID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Witness{" + "witnessID=" + witnessID + ", name=" + name + ", NID=" + NID + ", age=" + age + ", gender=" + gender + '}';
    }

    
    
    public void confirmWeddingAttendanceScene(MouseEvent event) throws IOException {
        FXMLLoader loader= new FXMLLoader();
        loader.setLocation(getClass().getResource("confirmAttendanceTable.fxml"));
        Parent parent= loader.load();
        Scene scene= new Scene(parent);
        Stage stage=(Stage)((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Marriage Register Office");
        stage.show();
    }

    
    public void updateProfileScene(MouseEvent event, String username, String pass, String type) throws IOException {
        FXMLLoader loader= new FXMLLoader();
        loader.setLocation(getClass().getResource("updateWitnessProfile.fxml"));
        Parent parent= loader.load();
        UpdateWitnessProfileController c = loader.getController();
        c.init(username, pass, type);
        Scene scene= new Scene(parent);        
        Stage stage=(Stage)((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Marriage Register Office");
        stage.show();
    }

    
    public void signWitnessFormScene(MouseEvent event, String username, String pass, String type) throws IOException {
        FXMLLoader loader= new FXMLLoader();
        loader.setLocation(getClass().getResource("witnessForm.fxml"));
        Parent parent= loader.load();
        WitnessFormController c = loader.getController();
        c.init(username, pass, type);
        Scene scene= new Scene(parent);
        Stage stage=(Stage)((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Marriage Register Office");
        stage.show();
    }

    
    public void viewMarriageCertificatesScene(MouseEvent event, String username, String pass, String type) throws IOException {
        FXMLLoader loader= new FXMLLoader();
        loader.setLocation(getClass().getResource("marriageCertificateTable.fxml"));
        Parent parent= loader.load();
        MarriageCertificateTableController c = loader.getController();
        c.init(username, pass, type);
        Scene scene= new Scene(parent);
        Stage stage=(Stage)((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Marriage Register Office");
        stage.show();
    }

    
    public void viewWeddingDetailsScene(MouseEvent event, String username, String pass, String type) throws IOException {
        FXMLLoader loader= new FXMLLoader();
        loader.setLocation(getClass().getResource("upcomingWeddingDetailsTable.fxml"));
        Parent parent= loader.load();
        UpcomingWeddingDetailsTableController c = loader.getController();
        c.init(username, pass, type);
        Scene scene= new Scene(parent);
        Stage stage=(Stage)((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Marriage Register Office");
        stage.show();
    }

    
    public void viewWeddingHistoryScene(MouseEvent event) throws IOException {
        FXMLLoader loader= new FXMLLoader();
        loader.setLocation(getClass().getResource("weddingHistoryTable.fxml"));
        Parent parent= loader.load();
        Scene scene= new Scene(parent);
        Stage stage=(Stage)((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Marriage Register Office");
        stage.show();
    }

    
    public void viewNotificationsScene(MouseEvent event) throws IOException {
        FXMLLoader loader= new FXMLLoader();
        loader.setLocation(getClass().getResource("unknown.fxml"));
        Parent parent= loader.load();
        Scene scene= new Scene(parent);
        Stage stage=(Stage)((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Marriage Register Office");
        stage.show();
    }

    public void provideFeedbackScene(MouseEvent event, String username, String pass, String type) throws IOException {
        FXMLLoader loader= new FXMLLoader();
        loader.setLocation(getClass().getResource("provideFeedbackTable.fxml"));
        Parent parent= loader.load();
        ProvideFeedbackTableController c = loader.getController();
        c.init(username, pass, type);
        Scene scene= new Scene(parent);
        Stage stage=(Stage)((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Marriage Register Office");
        stage.show();
    }
    
    public void logoutScene(MouseEvent event) throws IOException {
        FXMLLoader loader= new FXMLLoader();

        loader.setLocation(getClass().getResource("/group3_2111652_2110819_2220923_2220044_marriageregisteroffice/login.fxml"));

        Parent parent= loader.load();
        Scene scene= new Scene(parent);
        Stage stage=(Stage)((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Marriage Register Office");
        stage.show();
    }
    
    public void dashboardScene(MouseEvent event, String username, String pass, String type) throws IOException {
        FXMLLoader loader= new FXMLLoader();
        loader.setLocation(getClass().getResource("witnessDashboard.fxml"));
        Parent parent= loader.load();
        Scene scene= new Scene(parent);
        WitnessDashboardController c = loader.getController();
        c.init(username, pass, type);
        Stage stage=(Stage)((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Marriage Register Office");
        stage.show();
    }
    
    public ObservableList<Witness> getWitnessRecords() throws IOException{
        ObservableList<Witness> wl = FXCollections.observableArrayList();
        File f = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        
        try{
            f= new File("bin/witnessProfiles.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            try{
                Witness w;
                while (true){
                    w =(Witness) ois.readObject();
                    wl.add(w);
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
        return wl;
    }
    
    public void addProfileConfirm(String username, String pass, String type, String name, int age, int NID, String gender) throws IOException{
        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        Random r = new Random();
        Witness w = new Witness(r.nextInt(10000), name, NID, age, gender, username, pass, type);
        try{
            f = new File("bin/witnessProfiles.bin");
            if(f.exists()){
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }
            oos.writeObject(w);
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
    
    public void updateProfileConfirm(String username, String pass, String type, String name, int age, int NID, String gender) throws IOException{
        ObservableList<Witness> wl = getWitnessRecords();
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try{
            for (Witness w: wl){
                if(w.getUsername().equals(username)){
                    w.setAge(age);
                    w.setGender(gender);
                    w.setNID(NID);
                    w.setName(name);
                    break;
                } 
            }
            fos = new FileOutputStream("bin/witnessProfiles.bin");
            oos = new ObjectOutputStream(fos);
            for (Witness w: wl){
                oos.writeObject(w); 
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
    
    public void submitWitnessFormScene(String username, String can1, String can2, String relTo, String rel, String statement) throws IOException{
        ObservableList<Witness> wl = getWitnessRecords();
        Witness x = new Witness("x", "y", "z");
        String n = "", g = "";
        int a = 0, nid = 0, id = 0;
        for(Witness w: wl){
            if(w.getUsername().equals(username)){
                n = w.getName();
                g = w.getGender();
                a = w.getAge();
                nid = w.getNID();
                id = w.getWitnessID();
            }
        }
        WitnessForm wf = new WitnessForm(username, id, n, a, nid, g, can1, can2, relTo, rel, statement);
        System.out.println(wf);
        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try{
            f = new File("bin/witnessForms.bin");
            if(f.exists()){
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }
            oos.writeObject(wf);
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
    
    public ObservableList<DummyMarriageSufi> getMarriage(int witnessID){
        ObservableList<DummyMarriageSufi> wl = FXCollections.observableArrayList();
        File f = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        
        try{
            f= new File("bin/upcomingWeddings.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            try{
                DummyMarriageSufi w;
                while (true){
                    w =(DummyMarriageSufi) ois.readObject();
                    if(w.getWitID1()==(witnessID) || w.getWitID2()==(witnessID)){
                        wl.add(w);
                    }
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
        return wl;
    }
    
    public void upcomingWeddingDetailsScene(DummyMarriageSufi selectedMarriage, MouseEvent event) throws IOException {
        FXMLLoader loader= new FXMLLoader();
        loader.setLocation(getClass().getResource("upcomingWeddingDetails.fxml"));
        Parent parent= loader.load();
        UpcomingWeddingDetailsController c = loader.getController();
        c.init(selectedMarriage);
        Stage stage = new Stage();
        stage.setScene(new Scene(parent));
        stage.setTitle("Marriage Register Office");
        stage.show();
    }
    
    public ObservableList<DummyMarriageSufi> getMarriageCertificate(int witnessID){
        ObservableList<DummyMarriageSufi> wl = FXCollections.observableArrayList();
        File f = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        
        try{
            f= new File("bin/marriageCertificates.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            try{
                DummyMarriageSufi w;
                while (true){
                    w =(DummyMarriageSufi) ois.readObject();
                    if(w.getWitID1()== witnessID || w.getWitID2()== witnessID){
                        wl.add(w);
                    }
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
        return wl;
    }
    
    public void marriageCertificateScene(DummyMarriageSufi selectedMarriage, MouseEvent event) throws IOException {
        FXMLLoader loader= new FXMLLoader();
        loader.setLocation(getClass().getResource("marriageCertificate.fxml"));
        Parent parent= loader.load();
        MarriageCertificateController c = loader.getController();
        c.init(selectedMarriage);
        Stage stage = new Stage();
        stage.setScene(new Scene(parent));
        stage.setTitle("Marriage Register Office");
        stage.show();
    }
    
    public void downloadMC(DummyMarriageSufi m){
         FileChooser fc = new FileChooser();
         fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("PDF files","*.pdf"));
         File f = fc.showSaveDialog(null);
         try{
            if(f!=null){
               PdfWriter pw = new PdfWriter(new FileOutputStream(f));
               PdfDocument pdf = new PdfDocument(pw);
               Document doc = new Document(pdf);
               pdf.addNewPage();
               doc.setLeftMargin(70);
               String s = "Maariage ID: "+ m.getMarriageID()+ "\n"
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
    
    public void feedbackScene(DummyMarriageSufi marriage, String username, String pass, String type, MouseEvent event) throws IOException{
        FXMLLoader loader= new FXMLLoader();
        loader.setLocation(getClass().getResource("provideFeedback.fxml"));
        Parent parent= loader.load();
        ProvideFeedbackController c = loader.getController();
        c.init(marriage, username, pass, type);
        Scene scene= new Scene(parent);
        Stage stage=(Stage)((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Marriage Register Office");
        stage.show();
    }
    
    public void confirmFeedback(String marriageID, String username, String feedback){
        Feedback fb = new Feedback(marriageID, username, feedback);
        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try{
            f = new File("bin/feedback.bin");
            if(f.exists()){
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }
            oos.writeObject(fb);
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
}
