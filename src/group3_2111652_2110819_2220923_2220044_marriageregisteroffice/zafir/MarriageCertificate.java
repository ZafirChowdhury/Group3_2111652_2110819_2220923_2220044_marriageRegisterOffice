/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group3_2111652_2110819_2220923_2220044_marriageregisteroffice.zafir;

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
    
    
}
