/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group3_2111652_2110819_2220923_2220044_marriageregisteroffice.sadia;

import group3_2111652_2110819_2220923_2220044_marriageregisteroffice.User;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


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


        System.out.println("Bank info made" + cbi.toString());
        
        
        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try{
            f = new File("ClientBankInfo.bin");
            if(f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new ObjectOutputStream(fos);
            } else { fos = new FileOutputStream(f);
                     oos = new ObjectOutputStream(fos);       
            }
            oos.writeObject(cbi);
            oos.close();
            return true;
            
            
        } catch(IOException i){
            if(oos!=null){
                try{oos.close();
                } catch(IOException e){
                    Logger.getLogger(Accountant.class.getName()).log(Level.SEVERE,null,e);
     
                }
            
            }  
    }      
         System.out.println("Failed to make bin");
         return false;
    }        
    
    
    

//        save to bin file here
        return true;
//        if fail return false
    }

//goal 2

    public boolean StorepurchaseInfo(String Deptname, String sellername, String itemname, String modelno) {
        PurchaseInfo purchInfo = new PurchaseInfo(Deptname, sellername, itemname, modelno);
        System.out.println("Bank info made" + purchInfo.toString());
        
        
        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try{
            f = new File("PurchaseInfo.bin");
            if(f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new ObjectOutputStream(fos);
            } else { fos = new FileOutputStream(f);
                     oos = new ObjectOutputStream(fos);       
            }
            oos.writeObject(purchInfo);
            oos.close();
            return true;
            
            
        } catch(IOException i){
            if(oos!=null){
                try{oos.close();
                } catch(IOException e){
                    Logger.getLogger(Accountant.class.getName()).log(Level.SEVERE,null,e);
     
                }
            
            }  
    }      
         System.out.println("Failed to make bin");
         return false;
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
                     Logger.getLogger(Accountant.class.getName()).log(Level.SEVERE,null,e);
     
                }
            
            }  
    }      
         System.out.println("Failed to make bin");
         return false;
    }

//public void viewInvoiceOnTable(ObservableList<Invoice> invList){
    public void showinvoice(ObservableList<Invoice> invoiceList) throws FileNotFoundException, IOException, ClassNotFoundException{
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Invoice.bin"))){
            while(true){ Invoice inv = (Invoice) ois.readObject();
            System.out.println(inv);
            if (inv.getPaidstatus()){
                invoiceList.add(inv);
            }
            else{
                Alert faild = new Alert(Alert.AlertType.ERROR,"Something went wrong");
                faild.showAndWait();
                
            }
            }
        } catch(FileNotFoundException | EOFException e){
        }catch(IOException | ClassNotFoundException e ){ System.out.println("Could not show on table");
                }
        //return invoiceList
    }
        
    




    
    
    
    
    


}
             
 

        //File i = 
        return true;


//goal 4 Update Invoice
//goal 5 Make financial chart spend vs income
//goal 6 Make Calculate Tax
// goal 7 sort dpetwise info
// goal 8 sent notice/check notice
    }
}
