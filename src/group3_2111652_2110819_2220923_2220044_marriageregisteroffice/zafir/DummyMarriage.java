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
public class DummyMarriage implements Serializable{
    public String bride;
    public String groom;
    public String date;
    public String id;

    public DummyMarriage(String bride, String groom, String date, String id) {
        this.bride = bride;
        this.groom = groom;
        this.date = date;
        this.id = id;
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

    public String getDate() {
        return date;
    }

    public void setDate(String Date) {
        this.date = Date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "DummyMarriage{" + "bride=" + bride + ", groom=" + groom + ", date=" + date + ", id=" + id + '}';
    }    
}
