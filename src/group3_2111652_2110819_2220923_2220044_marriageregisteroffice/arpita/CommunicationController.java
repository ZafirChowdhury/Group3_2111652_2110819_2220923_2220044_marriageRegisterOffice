package group3_2111652_2110819_2220923_2220044_marriageregisteroffice.arpita;

import group3_2111652_2110819_2220923_2220044_marriageregisteroffice.sadia.LegalAdvisor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;

public class CommunicationController implements Initializable {

    @FXML
    private ComboBox<String> legalAdvisorComboBox;
    @FXML
    private TextArea textTextField;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObjectInputStream ois = null;
        try {
             LegalAdvisor ma;
             ois = new ObjectInputStream(new FileInputStream("bin/legalAdvisor.bin"));
             
            while(true){
                ma = (LegalAdvisor) ois.readObject();
                legalAdvisorComboBox.getItems().add(ma.getUsername());
            }
        }
        catch(RuntimeException e){
            e.printStackTrace();
        }
        catch (Exception ex) {
            try {
                if(ois!=null)
                    ois.close();
            } catch (IOException ex1) {  }           
        }
    }    

    @FXML
    private void submitButtonOnClick(MouseEvent event) {
        String username = legalAdvisorComboBox.getValue();
        String msg = textTextField.getText();
        inbox i = new inbox (username, msg);
        inbox.CreateNewinbox(i);
        PopUp.Message("Message has been sent");
    }
    
}
