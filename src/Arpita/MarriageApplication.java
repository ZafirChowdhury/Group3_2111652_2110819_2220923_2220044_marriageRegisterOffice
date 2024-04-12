package Arpita;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MarriageApplication implements Serializable {
    private String applicationID;
    private String groomName;
    private String brideName;
    private String groomNID;
    private String brideNID;
    private String groomReligion;
    private String brideReligion;
    private LocalDate groomDOB;
    private LocalDate brideDOB;
    private String presentAddress;
    private String permanentAddress;
    private LocalDate pefferredMarriageDate;
    private String MobileNumber;
    private String WitnessName;

    public MarriageApplication(String applicationID, String groomName, String brideName, String groomNID, String brideNID, String groomReligion, String brideReligion, LocalDate groomDOB, LocalDate brideDOB, String presentAddress, String permanentAddress, LocalDate pefferredMarriageDate, String MobileNumber, String WitnessName) {
        this.applicationID = applicationID;
        this.groomName = groomName;
        this.brideName = brideName;
        this.groomNID = groomNID;
        this.brideNID = brideNID;
        this.groomReligion = groomReligion;
        this.brideReligion = brideReligion;
        this.groomDOB = groomDOB;
        this.brideDOB = brideDOB;
        this.presentAddress = presentAddress;
        this.permanentAddress = permanentAddress;
        this.pefferredMarriageDate = pefferredMarriageDate;
        this.MobileNumber = MobileNumber;
        this.WitnessName = WitnessName;
    }
    
    public static void CreateNewMarriageApplication(MarriageApplication ma) {
        File f = null;
        FileOutputStream fos = null;      
        ObjectOutputStream oos = null;

        try {
            f = new File("MarriageApplication.bin");
            if(f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);                
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);               
            }
            oos.writeObject(ma);

        } catch (IOException ex) {
            Logger.getLogger(MarriageApplication.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(oos != null) oos.close();
            } catch (IOException ex) {
                Logger.getLogger(MarriageApplication.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public String getApplicationID() {
        return applicationID;
    }

    public void setApplicationID(String applicationID) {
        this.applicationID = applicationID;
    }

    public String getGroomName() {
        return groomName;
    }

    public void setGroomName(String groomName) {
        this.groomName = groomName;
    }

    public String getBrideName() {
        return brideName;
    }

    public void setBrideName(String brideName) {
        this.brideName = brideName;
    }

    public String getGroomNID() {
        return groomNID;
    }

    public void setGroomNID(String groomNID) {
        this.groomNID = groomNID;
    }

    public String getBrideNID() {
        return brideNID;
    }

    public void setBrideNID(String brideNID) {
        this.brideNID = brideNID;
    }

    public String getGroomReligion() {
        return groomReligion;
    }

    public void setGroomReligion(String groomReligion) {
        this.groomReligion = groomReligion;
    }

    public String getBrideReligion() {
        return brideReligion;
    }

    public void setBrideReligion(String brideReligion) {
        this.brideReligion = brideReligion;
    }

    public LocalDate getGroomDOB() {
        return groomDOB;
    }

    public void setGroomDOB(LocalDate groomDOB) {
        this.groomDOB = groomDOB;
    }

    public LocalDate getBrideDOB() {
        return brideDOB;
    }

    public void setBrideDOB(LocalDate brideDOB) {
        this.brideDOB = brideDOB;
    }

    public String getPresentAddress() {
        return presentAddress;
    }

    public void setPresentAddress(String presentAddress) {
        this.presentAddress = presentAddress;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(String permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public LocalDate getPefferredMarriageDate() {
        return pefferredMarriageDate;
    }

    public void setPefferredMarriageDate(LocalDate pefferredMarriageDate) {
        this.pefferredMarriageDate = pefferredMarriageDate;
    }

    public String getMobileNumber() {
        return MobileNumber;
    }

    public void setMobileNumber(String MobileNumber) {
        this.MobileNumber = MobileNumber;
    }

    public String getWitnessName() {
        return WitnessName;
    }

    public void setWitnessName(String WitnessName) {
        this.WitnessName = WitnessName;
    }
    

    
}
