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

    public EarlyPayment(String submittedBy, String subject, String description) {
        this.submittedBy = submittedBy;
        this.subject = subject;
        this.description = description;
        this.isGranted = false;
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
