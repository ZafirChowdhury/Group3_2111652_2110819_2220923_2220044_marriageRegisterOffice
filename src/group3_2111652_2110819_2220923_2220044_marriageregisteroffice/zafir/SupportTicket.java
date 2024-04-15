/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group3_2111652_2110819_2220923_2220044_marriageregisteroffice.zafir;

/**
 *
 * @author zafir
 */
public class SupportTicket {
    private final String submittedBy;
    private String subject;
    private String description;
    private String closedBy;
    private boolean isCloded;

    public SupportTicket(String submittedBy, String subject, String description) {
        this.submittedBy = submittedBy;
        this.subject = subject;
        this.description = description;
        this.isCloded = false;
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

    public boolean isIsCloded() {
        return isCloded;
    }

    public void setIsCloded(boolean isCloded) {
        this.isCloded = isCloded;
    }

    @Override
    public String toString() {
        return "SupportTicket{" + "submittedBy=" + submittedBy + ", subject=" + subject + ", description=" + description + ", closedBy=" + closedBy + ", isCloded=" + isCloded + '}';
    }    
}

