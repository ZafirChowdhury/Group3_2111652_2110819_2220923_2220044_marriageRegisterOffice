/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group3_2111652_2110819_2220923_2220044_marriageregisteroffice.sadia;

import group3_2111652_2110819_2220923_2220044_marriageregisteroffice.User;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
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
                oos = new ObjectOutputStream(fos);
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
    //public void viewGuides
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
                oos = new ObjectOutputStream(fos);
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
   public ObservableList<ContactLog> getcontactlist(){
        ObservableList<ContactLog> ContactList = FXCollections.observableArrayList();
        
        ObjectInputStream ois = null;
        try { ContactLog c;
            ois = new ObjectInputStream(new FileInputStream("ContactLog.bin"));
            while (true) {
                c = (ContactLog) ois.readObject();
                
                ContactList.add(c);
                System.out.println("contact dets added to list: " + c.toString());
            } //IOEXCEPTION,CLASSNOTFOUNDEXCEPTION,runtime
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("File reading done");
        }
        catch(Exception ex){
           System.out.println("error" +ex.getMessage()); 
        }
        
        return ContactList ;
    }
   
}

