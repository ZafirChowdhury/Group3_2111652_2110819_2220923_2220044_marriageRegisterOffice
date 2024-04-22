/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package group3_2111652_2110819_2220923_2220044_marriageregisteroffice.sadia;

import group3_2111652_2110819_2220923_2220044_marriageregisteroffice.User;
import group3_2111652_2110819_2220923_2220044_marriageregisteroffice.sufi.AppendableObjectOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author HP 840 G6
 */
public class LegalAdvisor extends User implements Serializable {

    public LegalAdvisor(String username, String password, String type) {
        super(username, password, type);
        
    }
   
    //goal 1
    public Boolean MakePrenupDoc(String Clientname1, String Clientname2, LocalDate documadeDate, String texts){
      PrenupDocument doc = new PrenupDocument(Clientname1,Clientname2,documadeDate,texts);
      System.out.println("Prenup info stored in bin" + doc.toString());
        
        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try{
            f = new File("PrenupDocument.bin");
            if(f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);
            } else { fos = new FileOutputStream(f);
                     oos = new ObjectOutputStream(fos);       
            }
            oos.writeObject(doc);
            oos.close();
            return true;
            
            
        } catch(IOException i){
            if(oos!=null){
                try{oos.close();
                } catch(IOException e){
                    Logger.getLogger(LegalAdvisor.class.getName()).log(Level.SEVERE,null,e);
     
                }
            
            }  
    }      
         System.out.println("Failed to make bin");
         return false;
    
    }
    
    public Boolean Addcontact_tocontactlog(String Clientname,String phnnumber,String address){
     ContactLog contact = new ContactLog(Clientname,phnnumber,address);
      System.out.println("new Contact info stored in bin" + contact.toString());
   File x = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try{
            x = new File("ContactLog.bin");
            if(x.exists()){
                fos = new FileOutputStream(x,true);
                oos = new AppendableObjectOutputStream(fos);
            } else { fos = new FileOutputStream(x);
                     oos = new ObjectOutputStream(fos);       
            }
            oos.writeObject(contact);
            oos.close();
            return true;
            
            
        } catch(IOException i){
            if(oos!=null){
                try{oos.close();
                } catch(IOException e){
                    Logger.getLogger(LegalAdvisor.class.getName()).log(Level.SEVERE,null,e);
     
                }
            
            }  
    }      
         System.out.println("Failed to make bin");
         return false;
    
    }
    //helper method not goal;
   public ObservableList<ContactLog> getcontactlist() {
        ObservableList<ContactLog> ContactList = FXCollections.observableArrayList();
        ContactLog c;
        ObjectInputStream ois = null;
        try { ois = new ObjectInputStream( new FileInputStream("ContactLog.bin"));
        while (true){
        c = (ContactLog)ois.readObject();
         System.out.println("u read" + c.toString());
        ContactList.add(c);
        }
        } catch( IOException | ClassNotFoundException e) {
            System.out.println("Read bin");
        }
        System.out.println(ContactList);
       
        return ContactList;
       
    }
   public  ArrayList<PrenupDocument> getDocList(){
       ArrayList<PrenupDocument> listn = new ArrayList();
       PrenupDocument p;
        ObjectInputStream ois = null;
        try { ois = new ObjectInputStream( new FileInputStream("PrenupDocument.bin"));
        while (true){
        p = (PrenupDocument)ois.readObject();
        listn.add(p);
        }
        } catch( IOException | ClassNotFoundException e) {
            System.out.println("Read bin");
        }
        System.out.println(listn);
        return listn ;
   }
   //goal
   public Boolean Adddate_toconsultationList( String Cname, String cnumber,LocalDate consultDate){
     LegAd_ConsultationList cdate = new LegAd_ConsultationList(Cname,cnumber,consultDate);

      System.out.println("new Contact info stored in bin" + cdate.toString()); 
      
      File x = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try{
            x = new File("ConsultationList.bin");
            if(x.exists()){
                fos = new FileOutputStream(x,true);
                oos = new AppendableObjectOutputStream(fos);
            } else { fos = new FileOutputStream(x);
                     oos = new ObjectOutputStream(fos);       
            }
            oos.writeObject(cdate);
            oos.close();
            return true;
            
            
        } catch(IOException i){
            if(oos!=null){
                try{oos.close();
                } catch(IOException e){
                    Logger.getLogger(LegalAdvisor.class.getName()).log(Level.SEVERE,null,e);
     
                }
            
            }  
   }
        System.out.println("Failed to make bin");
         return false;
   } //helper
   public ObservableList<LegAd_ConsultationList>pendingList(){
   ObservableList<LegAd_ConsultationList> pendingList = FXCollections.observableArrayList();
         LegAd_ConsultationList c;
        ObjectInputStream ois = null;
        try { ois = new ObjectInputStream( new FileInputStream("ConsultationList.bin"));
        while (true){
        c = (LegAd_ConsultationList)ois.readObject();
         System.out.println("u read" + c.toString());
        pendingList.add(c);
        }
        } catch( IOException | ClassNotFoundException e) {
            System.out.println("Read bin");
        }
        System.out.println(pendingList);
       
        return pendingList;
   } //helper
  /* public static void deletecontact(ContactLog x) {
        // create a arraylist for storing all intance from bin file
        ArrayList<ContactLog> listn = new ArrayList<>();
        ObjectInputStream ois = null;
        try {
            ContactLog c;
            ois = new ObjectInputStream(new FileInputStream("ContactLog.bin"));

            while (true) {
                c = (ContactLog) ois.readObject();
                
                if (!(c.getClientname()== x.getClientname())){
                    listn.add(c);
                }
            }
        } catch (RuntimeException e) {
            e.printStackTrace();
        } catch (Exception ex) {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException ex1) {
            }
        }

        // get file path
        File file = new File("ContactLog.bin");

        // Now delete the file
        file.delete();

        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        // again create a new file
        f = new File("ContactLog.bin");
        try {
            fos = new FileOutputStream(f);
            oos = new ObjectOutputStream(fos);
            
            for ( ContactLog e : listn) {
                oos.writeObject(e);
            }
        } catch (IOException ex) {
            Logger.getLogger(Package.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(Package.class.getName()).log(Level.SEVERE, null, ex);
            }
          
        }

    }*/
 
}       
          
           


