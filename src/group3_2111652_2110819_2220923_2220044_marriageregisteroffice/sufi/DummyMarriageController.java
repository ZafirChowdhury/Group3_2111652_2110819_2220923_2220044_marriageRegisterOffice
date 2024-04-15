/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package group3_2111652_2110819_2220923_2220044_marriageregisteroffice.sufi;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author User
 */
public class DummyMarriageController implements Initializable {

    @FXML
    private Label marriageIDL;
    @FXML
    private TextField candidate1L;
    @FXML
    private TextField age1L;
    @FXML
    private TextField nationality1L;
    @FXML
    private TextField NID1L;
    @FXML
    private TextField father1L;
    @FXML
    private TextField mother1L;
    @FXML
    private TextField rel1L;
    @FXML
    private TextField witness1L;
    @FXML
    private TextField venueL;
    @FXML
    private TextField candidate2L;
    @FXML
    private TextField age2L;
    @FXML
    private TextField nationality2L;
    @FXML
    private TextField NID2L;
    @FXML
    private TextField father2L;
    @FXML
    private TextField mother2L;
    @FXML
    private TextField witness2L;
    @FXML
    private TextField rel2L;
    @FXML
    private TextField dateL;
    @FXML
    private TextField witIDL1;
    @FXML
    private TextField witIDL2;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void submitMarriage(MouseEvent event) {
        String x = dateL.getText();
        String[] parts = x.split(" ");
        String d = parts[0];
        String t = parts[1];
        
        LocalDate date = LocalDate.parse(d);
        LocalTime time = LocalTime.parse(t);
        Random r = new Random();
        DummyMarriageSufi dm = new DummyMarriageSufi(Integer.toString(r.nextInt(10000)), candidate1L.getText(), Integer.parseInt(age1L.getText()), nationality1L.getText(), 
                Integer.parseInt(NID1L.getText()), father1L.getText(), mother1L.getText(), witness1L.getText(), Integer.parseInt(witIDL1.getText()), 
                rel1L.getText(),  candidate2L.getText(), Integer.parseInt(age2L.getText()), nationality2L.getText(), 
                Integer.parseInt(NID2L.getText()), father2L.getText(), mother2L.getText(), witness2L.getText(), Integer.parseInt(witIDL2.getText()), 
                rel2L.getText(), venueL.getText(), date, time);
        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        LocalDateTime current = LocalDateTime.now();
        LocalDateTime ldt = LocalDateTime.of(date, time);
        
        if (current.isAfter(ldt)){
            try{
                f = new File("bin/marriageCertificates.bin");
                if(f.exists()){
                    fos = new FileOutputStream(f, true);
                    oos = new AppendableObjectOutputStream(fos);
                }
                else{
                    fos = new FileOutputStream(f);
                    oos = new ObjectOutputStream(fos);
                }
                oos.writeObject(dm);
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
        else {
            try{
                f = new File("bin/upcomingWeddings.bin");
                if(f.exists()){
                    fos = new FileOutputStream(f, true);
                    oos = new AppendableObjectOutputStream(fos);
                }
                else{
                    fos = new FileOutputStream(f);
                    oos = new ObjectOutputStream(fos);
                }
                oos.writeObject(dm);
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
    
}
