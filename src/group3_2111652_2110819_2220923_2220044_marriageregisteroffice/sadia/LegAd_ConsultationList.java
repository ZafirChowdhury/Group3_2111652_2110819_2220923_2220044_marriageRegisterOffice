/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group3_2111652_2110819_2220923_2220044_marriageregisteroffice.sadia;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author HP 840 G6
 */
public class LegAd_ConsultationList implements Serializable{
    private String Cname, cnumber;
    private LocalDate consultDate;
    private Boolean doneStatus;

    public LegAd_ConsultationList(String Cname, String cnumber, LocalDate consultDate) {
        this.Cname = Cname;
        this.cnumber = cnumber;
        this.consultDate = consultDate;
        this.doneStatus = false;
    }

  

    public String getCname() {
        return Cname;
    }

    public void setCname(String Cname) {
        this.Cname = Cname;
    }

    public String getCnumber() {
        return cnumber;
    }

    public void setCnumber(String cnumber) {
        this.cnumber = cnumber;
    }

    public LocalDate getConsultDate() {
        return consultDate;
    }

    public void setConsultDate(LocalDate consultDate) {
        this.consultDate = consultDate;
    }
    
    public void markasDone(){
    this.doneStatus = true;}
}

