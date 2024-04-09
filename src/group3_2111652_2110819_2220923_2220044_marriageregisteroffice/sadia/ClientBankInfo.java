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

public class ClientBankInfo implements Serializable{
    private String clientName, bankName, bankBranch,phone,bankAccno;
    

public class ClientBankInfo {
    private String clientName, bankName, bankBranch;
    private int phone, bankAccNo;


    public ClientBankInfo(String clientName, String bankName, String bankBranch, int phone, int bankAccNo) {
        this.clientName = clientName;
        this.bankName = bankName;
        this.bankBranch = bankBranch;
        this.phone = phone;
        this.bankAccNo = bankAccNo;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankBranch() {
        return bankBranch;
    }

    public void setBankBranch(String bankBranch) {
        this.bankBranch = bankBranch;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getBankAccNo() {
        return bankAccNo;
    }

    public void setBankAccNo(int bankAccNo) {
        this.bankAccNo = bankAccNo;
    }

    @Override
    public String toString() {
        return "ClientBankInfo{" + "clientName=" + clientName + ", bankName=" + bankName + ", bankBranch=" + bankBranch + ", phone=" + phone + ", bankAccNo=" + bankAccNo + '}';
    }
    
}
