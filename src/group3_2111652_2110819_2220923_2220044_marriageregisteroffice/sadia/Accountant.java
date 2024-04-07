/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group3_2111652_2110819_2220923_2220044_marriageregisteroffice.sadia;

import group3_2111652_2110819_2220923_2220044_marriageregisteroffice.User;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import javafx.scene.control.Alert;


/**
 *
 * @author HP 840 G6
 */

public class Accountant extends User implements  Serializable{


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

    public boolean CreateInvoice(String clientname, int Unpaidamount, String clientnumbr) {
        Invoice inv = new Invoice(clientname, Unpaidamount, clientnumbr);
        System.out.println("Invoice made" + inv.toString());
        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try{
            f = new File("Invoice.bin");
            if(f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new ObjectOutputStream(fos);
            } else { fos = new FileOutputStream(f);
                     oos = new ObjectOutputStream(fos);       
            }
            oos.writeObject(inv);
            oos.close();
            return true;
            
            
        } catch(IOException i){
            if(oos!=null){
                try{oos.close();
                } catch(IOException e){
                     Alert info = new Alert(Alert.AlertType.ERROR,"Oops");
     info.showAndWait();
     
                }
            
            }  
    }      
         System.out.println("Failed to make bin");
         return false;
    }
}
             
    

//goal 4 Update Invoice
//goal 5 Make financial chart spend vs income
//goal 6 Make Calculate Tax
// goal 7 sort dpetwise info
// goal 8 sent notice/check notice
    

