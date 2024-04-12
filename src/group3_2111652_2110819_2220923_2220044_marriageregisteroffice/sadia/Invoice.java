/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group3_2111652_2110819_2220923_2220044_marriageregisteroffice.sadia;

import java.io.Serializable;

/**
 *
 * @author HP 840 G6
 */
public class Invoice implements Serializable{
    private String clientname;
    private int Unpaidamount;
    private String clientnumbr;
    private Boolean paidstatus;
    

    public Invoice(String clientname, int Unpaidamount, String clientnumbr) {
        this.clientname = clientname;
        this.Unpaidamount = Unpaidamount;
        this.clientnumbr = clientnumbr;
        this.paidstatus = false;
    }
    public void paidstatus(){
        this.paidstatus = true;
    }
    public int getUnpaidamount() {
        return Unpaidamount;
    }

    public void setUnpaidamount(int Unpaidamount) {
        this.Unpaidamount = Unpaidamount;
    }

    public Boolean getPaidstatus() {
        return paidstatus;
    }

    public void setPaidstatus(Boolean paidstatus) {
        this.paidstatus = paidstatus;
    }

    public String getClientname() {
        return clientname;
    }

    public void setClientname(String clientname) {
        this.clientname = clientname;
    }

    public int getPaidamount() {
        return Unpaidamount;
    }

    public void setPaidamount(int Unpaidamount) {
        this.Unpaidamount = Unpaidamount;
    }

    public String getClientnumbr() {
        return clientnumbr;
    }

    public void setClientnumbr(String clientnumbr) {
        this.clientnumbr = clientnumbr;
    }

}
