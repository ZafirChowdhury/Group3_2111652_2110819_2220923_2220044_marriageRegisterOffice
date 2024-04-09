/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group3_2111652_2110819_2220923_2220044_marriageregisteroffice;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author zafir
 */

public abstract class User implements Serializable {
    final String username;
    String password;
    final String type;

    public User(String username, String password, String type) {
        this.username = username;
        this.password = password;
        this.type = type;
    }

    public String getUsername() {
        return username;
    }

    public String getType() {
        return type;
    }
    
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" + "username=" + username + ", type=" + type + '}';
    }
    
    // Returns path to bin file according to the user type given
    public static String getPath(String type) {
        if (type.equals("Marriage Registrar")) return "bin/marriageRegistrar.bin";
        if (type.equals("IT Admin")) return "bin/iTadmin.bin";
        if (type.equals("Marriage Candidate")) return "bin/marriageCandidate.bin";
        if (type.equals("Legal Advisor")) return "bin/legalAdvisor.bin";
        if (type.equals("Accountant")) return "bin/accountant.bin";
        if (type.equals("Witness")) return "bin/witness.bin";
        if (type.equals("Archivist")) return "bin/archivist.bin";
        if (type.equals("Marriage Counselor")) return "bin/marriageCounselor.bin";
        return "";
    }
    
    // Returns true if username dose not exist
    public static boolean isUniqueUsername(String username){
        try {
            File file = new File("bin/username.bin");
            if (file.exists()) {
                FileInputStream fis = new FileInputStream(file);
                ObjectInputStream ois = new ObjectInputStream(fis);
                
                try {
                    while (true) {
                       String user = (String) ois.readObject();
                       if (user.equals(username)) return false;
                    }
                    
                } catch (EOFException e) {
                    ois.close();
                    return true;
                }
                              
            } else {
                // As file dose not exsit so
                // Username dose not exist
                return true;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        // Username dose not exist
        return true;
    }
    
    // Returns true if username is saved
    public static boolean saveUsername(String username) throws FileNotFoundException, IOException {
        File file = new File("bin/username.bin");
        FileOutputStream fos;
        ObjectOutputStream oos;
        
        try {
        if (file.exists()) {
            fos = new FileOutputStream(file, true);
            oos = new AppendableObjectOutputStream(fos);
        } else {
            fos = new FileOutputStream(file, true);
            oos = new ObjectOutputStream(fos);
        }
        
            oos.writeObject(username);
            System.out.println(username + "saved to database.");
            oos.close();
            
        } catch(Exception ex) {
            System.out.println("There was a error while saving the username");
            return false;
        }
        
        return true;
    }
       
    // Returns true if User object is saved 
    public boolean saveUser(String path){
        File file = new File(path);
        FileOutputStream fos;
        ObjectOutputStream oos;
        
        try {
        if (file.exists()) {
            fos = new FileOutputStream(file, true);
            oos = new AppendableObjectOutputStream(fos);
        } else {
            fos = new FileOutputStream(file, true);
            oos = new ObjectOutputStream(fos);
        }
        
        oos.writeObject(this);
        System.out.println(this.toString() + " Saved.");
        User.saveUsername(username);
        oos.close();
        
        } catch(Exception ex) {
            System.out.println("There was a error while saving the user");
            return false;
        }
        
        return true;
    }
    
    // Bit finiky, Test out the return null parts
    public static User verifyUser(String username, String password, String path) {
        try {
            File file = new File(path);
            if (!file.exists()) {
                System.out.println("File dose not exist");
                return null;
            }
            
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            try {
                User user = (User) ois.readObject();
                if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                    return user;
                }
            } catch(EOFException e) {
                // Not sure tho
                return null;
            }
            
        } catch(Exception e) {
            e.printStackTrace();
            return null;
        }
              
        return null;
    }
}
