/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group3_2111652_2110819_2220923_2220044_marriageregisteroffice.zafir;

import group3_2111652_2110819_2220923_2220044_marriageregisteroffice.sufi.AppendableObjectOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author zafir
 */
public class MarriageCertificate implements Serializable {
    public String bride;
    public String groom;
    public String location;
    public String date;
    final public String owner;
    final public String officiatedBy;
    final public String witnessedBy;

    public MarriageCertificate(String bride, String groom, String date, String officiatedBy, String witnessedBy, String owner) {
        this.bride = bride;
        this.groom = groom;
        this.date = date;
        this.officiatedBy = officiatedBy;
        this.witnessedBy = witnessedBy;
        this.owner = owner;
    }

    public String getBride() {
        return bride;
    }

    public void setBride(String bride) {
        this.bride = bride;
    }

    public String getGroom() {
        return groom;
    }

    public void setGroom(String groom) {
        this.groom = groom;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "MarriageCertificate{" + "bride=" + bride + ", groom=" + groom + ", location=" + location + ", date=" + date + ", officiatedBy=" + officiatedBy + ", witnessedBy=" + witnessedBy + '}';
    }
    
    public void saveAsBin() {
        File file = new File("bin/marriageCertificate.bin");
        FileOutputStream fos;
        ObjectOutputStream oos;
        
        try {
            if (file.exists()) {
                fos = new FileOutputStream(file, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(file, true);
                oos = new ObjectOutputStream(fos);
            }
            
            oos.writeObject(this);
            System.out.println("Marriage certificate saved succesfully");
            oos.close();
            
        } catch (Exception e) {
            System.out.println("There was a error while saving Marriage");
            e.printStackTrace();
    }
}
}
