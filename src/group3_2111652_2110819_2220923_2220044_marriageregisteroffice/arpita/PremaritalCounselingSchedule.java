package group3_2111652_2110819_2220923_2220044_marriageregisteroffice.arpita;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PremaritalCounselingSchedule implements Serializable {
    private LocalDate date;
    private String time;
    private String des;

    public PremaritalCounselingSchedule(LocalDate date, String time, String des) {
        this.date = date;
        this.time = time;
        this.des = des;
    }
    public static void CreateNewPremaritalCounselingSchedule(PremaritalCounselingSchedule ma) {
        File f = null;
        FileOutputStream fos = null;      
        ObjectOutputStream oos = null;

        try {
            f = new File("bin/PremaritalCounselingSchedule.bin");
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
            Logger.getLogger(PremaritalCounselingSchedule.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(oos != null) oos.close();
            } catch (IOException ex) {
                Logger.getLogger(PremaritalCounselingSchedule.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
    
    
    
}
