package group3_2111652_2110819_2220923_2220044_marriageregisteroffice.arpita;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Complaints implements Serializable {
    private String complaint;

    public String getComplaint() {
        return complaint;
    }

    public void setComplaint(String complaint) {
        this.complaint = complaint;
    }

    public Complaints(String complaint) {
        this.complaint = complaint;
    }
    
    public static void CreateNewComplaints(Complaints s) {
        File f = null;
        FileOutputStream fos = null;      
        ObjectOutputStream oos = null;

        try {
            f = new File("bin/Complaints.bin");
            if(f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);                
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);               
            }
            oos.writeObject(s);

        } catch (IOException ex) {
            Logger.getLogger(Complaints.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(oos != null) oos.close();
            } catch (IOException ex) {
                Logger.getLogger(Complaints.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
}
