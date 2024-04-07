/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group3_2111652_2110819_2220923_2220044_marriageregisteroffice;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
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
    
    // Returns true if username dose not exist
    public static boolean isUniqueUsername(String username){
        ArrayList<String> usernames =  new ArrayList<>();
        
        try {
            File usernameFile = new File("bin/username.bin");
            if (usernameFile.exists()) {
                FileInputStream fis = new FileInputStream(usernameFile);
                ObjectInputStream ois = new ObjectInputStream(fis);
                
                try {
                    while (true) {
                        usernames.add((String) ois.readObject());
                    }
                } catch (EOFException e) {
                    ois.close();
                }
                
                for (String s : usernames) {
                    if (s.equals(username)) {
                        // Username exists
                        return false;
                    }
                }
                
            } else {
                // Username dose not exist
                return true;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        // Username dose not exist
        return true;
    }
    
    // Returns true if given username is saved successfully
    public static boolean saveUsername(String username) {
        if (!isUniqueUsername(username)) {
            // Username exists
            System.out.println("Invalid use of method, username allready exists");
            return false;
        }
        
        try {
            File usernameFile = new File("bin/username.bin");
            FileOutputStream fos;
            ObjectOutputStream oos;
            if (usernameFile.exists()) {
                fos = new FileOutputStream(usernameFile, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(usernameFile, true);
                oos = new ObjectOutputStream(fos);
            }
            
            oos.writeObject(username);
            oos.close();            
            
        } catch(Exception ex) {
            System.err.println("There was a error writing to username.bin");
            return false;
        }        
        return true;
    }
    
    // Returns true if object is saved 
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
        System.out.println(this.toString() + "Saved.");
        oos.close();
        
        } catch(Exception ex) {
            System.out.println("There was a error while saving the user");
            return false;
        }
        
        return true;
    }
    
    // TODO : DOSE NOT WORK
    // TRY : Use type to set path and ArrayList type
    public static User verifyUser(String username, String password, String path) {
        // Add all the obj instace in array list
        ArrayList userList = new ArrayList();
        
        try {
            File file = new File(path);
            if (!file.exists()) {
                System.out.println("File dose not exist");
            }
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            try {
                userList.add((User) ois.readObject());
            } catch(EOFException e) {
                
            }
            
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        for (Object u : userList) {
            System.out.println(u.toString());
        }
        
        return null;
    }
}
