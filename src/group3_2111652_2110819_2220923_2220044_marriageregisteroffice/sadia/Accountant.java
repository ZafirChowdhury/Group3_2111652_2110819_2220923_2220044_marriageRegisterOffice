/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group3_2111652_2110819_2220923_2220044_marriageregisteroffice.sadia;

import group3_2111652_2110819_2220923_2220044_marriageregisteroffice.User;
import java.io.Serializable;

/**
 *
 * @author HP 840 G6
 */
public class Accountant extends User implements Serializable {

    public Accountant(String username, String password, String type) {
        super(username, password, type);
    }

    
    

//goal 1
    public boolean StoreClientBankInfo(String name, int phone, String bankName, int bankAccNo, String bankBranch) {
        ClientBankInfo cbi = new ClientBankInfo(name, bankName, bankBranch, phone, bankAccNo);

//        save to bin file here
        return true;
//        if fail return false
    }
//goal 2

    public boolean StorepurchaseInfo(String Deptname, String sellername, String itemname, String modelno) {
        PurchaseInfo purchInfo = new PurchaseInfo(Deptname, sellername, itemname, modelno);
        //to do

        return true;
    }
//goal 3

    public boolean CreateInvoice(String clientname, int Unpaidamount, String clientnumbr,Boolean paidstatus) {
        Invoice inv = new Invoice(clientname, Unpaidamount, clientnumbr,paidstatus);
        System.out.println("Invoice made" + inv.toString());
        //File i = 
        return true;

//goal 4 Update Invoice
//goal 5 Make financial chart spend vs income
//goal 6 Make Calculate Tax
// goal 7 sort dpetwise info
// goal 8 sent notice/check notice
    }
}
