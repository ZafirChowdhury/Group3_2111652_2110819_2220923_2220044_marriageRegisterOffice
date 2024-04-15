/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group3_2111652_2110819_2220923_2220044_marriageregisteroffice.sufi;

import java.io.Serializable;

/**
 *
 * @author User
 */
public class Feedback implements Serializable{
    private String marriageID;
    private String username;
    private String feedback;

    public Feedback() {
    }

    public Feedback(String marriageID, String username, String feedback) {
        this.marriageID = marriageID;
        this.username = username;
        this.feedback = feedback;
    }

    public String getMarriageID() {
        return marriageID;
    }

    public void setMarriageID(String marriageID) {
        this.marriageID = marriageID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    @Override
    public String toString() {
        return "Feedback{" + "marriageID=" + marriageID + ", username=" + username + ", feedback=" + feedback + '}';
    }
}
