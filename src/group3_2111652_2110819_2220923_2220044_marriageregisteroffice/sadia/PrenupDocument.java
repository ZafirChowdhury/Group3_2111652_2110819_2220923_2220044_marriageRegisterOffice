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
public class PrenupDocument implements Serializable{
      
    private String Clientname1;
    private String Clientname2;
    private LocalDate documadeDate;
    private String texts;

    public PrenupDocument(String Clientname1, String Clientname2, LocalDate documadeDate, String texts) {
        this.Clientname1 = Clientname1;
        this.Clientname2 = Clientname2;
        this.documadeDate = documadeDate;
        this.texts = texts;
    }

    public String getClientname1() {
        return Clientname1;
    }

    public void setClientname1(String Clientname1) {
        this.Clientname1 = Clientname1;
    }

    public String getClientname2() {
        return Clientname2;
    }

    public void setClientname2(String Clientname2) {
        this.Clientname2 = Clientname2;
    }

    public LocalDate getDocumadeDate() {
        return documadeDate;
    }

    public void setDocumadeDate(LocalDate documadeDate) {
        this.documadeDate = documadeDate;
    }

    public String getTexts() {
        return texts;
    }

    public void setTexts(String texts) {
        this.texts = texts;
    }

    @Override
    public String toString() {
        return "PrenupDocument{" + "Clientname1=" + Clientname1 + ", Clientname2=" + Clientname2 + ", documadeDate=" + documadeDate + ", texts=" + texts + '}';
    }
    
}
