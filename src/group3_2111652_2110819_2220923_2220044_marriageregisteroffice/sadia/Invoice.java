/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group3_2111652_2110819_2220923_2220044_marriageregisteroffice.sadia;

/**
 *
 * @author HP 840 G6
 */
public class Invoice {
    private String clientname;
    private int paidamount;
    private String clientnumbr;


    public Invoice(String clientname, int paidamount, String clientnumbr) {
        this.clientname = clientname;
        this.paidamount = paidamount;
        this.clientnumbr = clientnumbr;
    }

    public String getClientname() {
        return clientname;
    }

    public void setClientname(String clientname) {
        this.clientname = clientname;
    }

    public int getPaidamount() {
        return paidamount;
    }

    public void setPaidamount(int paidamount) {
        this.paidamount = paidamount;
    }

    public String getClientnumbr() {
        return clientnumbr;
    }

    public void setClientnumbr(String clientnumbr) {
        this.clientnumbr = clientnumbr;
    }

}
