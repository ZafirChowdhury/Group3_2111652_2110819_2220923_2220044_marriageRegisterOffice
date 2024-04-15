
package group3_2111652_2110819_2220923_2220044_marriageregisteroffice.arpita;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class PremaritalCounseling implements Serializable {
    private String description;
    private String status;

    public PremaritalCounseling(String description, String status) {
        this.description = description;
        this.status = status;
    }
    
    public static void update(PremaritalCounseling p) {
        ArrayList <PremaritalCounseling> list = new ArrayList<>();
        ObjectInputStream ois = null;
        try {
             PremaritalCounseling c;
             ois = new ObjectInputStream(new FileInputStream("bin/PremaritalCounseling.bin"));
             
            while(true){
                c = (PremaritalCounseling) ois.readObject();
                if(c.description.equals(p.getDescription())) c.setStatus("Accepted");
                list.add(c);
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
        
        File file = new File("bin/PremaritalCounseling.bin");
        file.delete();
        
        for (int i = 0; i < list.size(); i ++) {
            File f = null;
            FileOutputStream fos = null;      
            ObjectOutputStream oos = null;

            try {
                f = new File("bin/PremaritalCounseling.bin");
                if(f.exists()){
                    fos = new FileOutputStream(f,true);
                    oos = new AppendableObjectOutputStream(fos);                
                }
                else{
                    fos = new FileOutputStream(f);
                    oos = new ObjectOutputStream(fos);               
                }
                oos.writeObject(list.get(i));

            } catch (IOException ex) {
                Logger.getLogger(PremaritalCounseling.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    if(oos != null) oos.close();
                } catch (IOException ex) {
                    Logger.getLogger(PremaritalCounseling.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }     
    
    public static ObservableList <PremaritalCounseling> getPremaritalCounselingList() {
        ObjectInputStream ois = null;
        ObservableList <PremaritalCounseling> list = FXCollections.observableArrayList();
        try {
             PremaritalCounseling ma;
             ois = new ObjectInputStream(new FileInputStream("bin/PremaritalCounseling.bin"));
             
            while(true){
                ma = (PremaritalCounseling) ois.readObject();
                list.add(ma);
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
        return list;
    }
    public static void CreateNewPremaritalCounseling(PremaritalCounseling s) {
        File f = null;
        FileOutputStream fos = null;      
        ObjectOutputStream oos = null;

        try {
            f = new File("bin/PremaritalCounseling.bin");
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
            Logger.getLogger(PremaritalCounseling.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(oos != null) oos.close();
            } catch (IOException ex) {
                Logger.getLogger(PremaritalCounseling.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
