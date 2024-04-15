/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group3_2111652_2110819_2220923_2220044_marriageregisteroffice.zafir;

import java.io.File;
import java.io.Serializable;

/**
 *
 * @author zafir
 */
public class EarlyPayment implements Serializable{
    final String submittedBy;
    String subject;
    String description;
    boolean isGranted;
    float ammount;

    public EarlyPayment(String submittedBy, String subject, String description, float ammount) {
        this.submittedBy = submittedBy;
        this.subject = subject;
        this.description = description;
        this.isGranted = false;
        this.ammount = ammount;        
    }

    public float getAmmount() {
        return ammount;
    }

    public void setAmmount(float ammount) {
        this.ammount = ammount;
    }

    public void setIsGranted(boolean isGranted) {
        this.isGranted = isGranted;
    }

    public String getSubmittedBy() {
        return submittedBy;
    }

    public boolean isIsGranted() {
        return isGranted;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }    

    @Override
    public String toString() {
        return "EarlyPayment{" + "submittedBy=" + submittedBy + ", subject=" + subject + ", description=" + description + '}';
    }
    
    
}
