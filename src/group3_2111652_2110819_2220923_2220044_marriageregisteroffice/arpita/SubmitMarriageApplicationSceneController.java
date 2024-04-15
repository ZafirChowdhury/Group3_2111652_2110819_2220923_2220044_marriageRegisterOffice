package group3_2111652_2110819_2220923_2220044_marriageregisteroffice.arpita;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class SubmitMarriageApplicationSceneController implements Initializable {

    @FXML
    private TextField applicationIDTextField;
    @FXML
    private TextField groomNameTextField;
    @FXML
    private TextField brideNameTextField;
    @FXML
    private TextField groomNIDTextField;
    @FXML
    private TextField brideNIDTextField;
    @FXML
    private DatePicker preferredDateDatePicker;
    @FXML
    private TextField groomReligionTextField;
    @FXML
    private TextField brideReligionTextField;
    @FXML
    private TextField presentAdressTextField;
    @FXML
    private TextField permanentAdressTextField;
    @FXML
    private TextField mobileNumberTextField;
    @FXML
    private TextField witnessNameTExtField;
    @FXML
    private DatePicker groomDOBDatePicker;
    @FXML
    private DatePicker brideDOBDatePicker;
    
    MarriageCandidate mc;
    public void receiveUserData(MarriageCandidate mc){
        this.mc = mc;
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    

    @FXML
    private void SubmitButtonOnClick(MouseEvent event) {
        String applicationID = applicationIDTextField.getText();
        String groomName = groomNameTextField.getText();
        String brideName = brideNameTextField.getText();
        String groomNID = groomNIDTextField.getText();
        String brideNID = brideNIDTextField.getText();
        LocalDate pefferredMarriageDate = preferredDateDatePicker.getValue();
        String groomReligion = groomReligionTextField.getText();
        String brideReligion = brideReligionTextField.getText();
        String presentAddress = presentAdressTextField.getText();
        String permanentAddress = permanentAdressTextField.getText();
        String mobileNumber = mobileNumberTextField.getText();
        String witnessName = witnessNameTExtField.getText();
        LocalDate groomDOB = groomDOBDatePicker.getValue();
        LocalDate brideDOB = brideDOBDatePicker.getValue();
        MarriageApplication ma = new MarriageApplication(applicationID, groomName, brideName, groomNID, brideNID, groomReligion, brideReligion, groomDOB, brideDOB, presentAddress, permanentAddress, pefferredMarriageDate, mobileNumber, witnessName, mc);
        MarriageApplication.CreateNewMarriageApplication(ma);
        PopUp.Message("Marriage Application has been submitted successfully");
    }
}
