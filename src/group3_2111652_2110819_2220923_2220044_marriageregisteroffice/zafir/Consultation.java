/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group3_2111652_2110819_2220923_2220044_marriageregisteroffice.zafir;

import java.util.Date;

/**
 *
 * @author zafir
 */
public class Consultation {
    public String registrar;
    public String marriageCandidate;
    public Date date;

    public String getRegistrar() {
        return registrar;
    }

    public void setRegistrar(String registrar) {
        this.registrar = registrar;
    }

    public String getMarriageCandidate() {
        return marriageCandidate;
    }

    public void setMarriageCandidate(String marriageCandidate) {
        this.marriageCandidate = marriageCandidate;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Consultation(String registrar, String marriageCandidate, Date date) {
        this.registrar = registrar;
        this.marriageCandidate = marriageCandidate;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Consultation{" + "registrar=" + registrar + ", marriageCandidate=" + marriageCandidate + ", date=" + date + '}';
    }
    
    
}
