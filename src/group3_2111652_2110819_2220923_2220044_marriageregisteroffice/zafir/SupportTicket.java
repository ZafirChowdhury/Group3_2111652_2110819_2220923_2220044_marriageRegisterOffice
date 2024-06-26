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

public class SupportTicket implements Serializable{
    private final String submittedBy;
    private String subject;
    private String description;
    private String closedBy;
    private String isCloded;

    public SupportTicket(String submittedBy, String subject, String description) {
        this.submittedBy = submittedBy;
        this.subject = subject;
        this.description = description;
        this.isCloded = "Open";
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

    public String getClosedBy() {
        return closedBy;
    }

    public void setClosedBy(String closedBy) {
        this.closedBy = closedBy;
    }

    public String getIsCloded() {
        return isCloded;
    }

    public void setIsCloded(String isCloded) {
        this.isCloded = isCloded;
    }

    public String getSubmittedBy() {
        return submittedBy;
    }

    @Override
    public String toString() {
        return "SupportTicket{" + "submittedBy=" + submittedBy + ", subject=" + subject + ", description=" + description + ", closedBy=" + closedBy + ", isCloded=" + isCloded + '}';
    }  
    
    public boolean delete(){
        return true;
    }
}

