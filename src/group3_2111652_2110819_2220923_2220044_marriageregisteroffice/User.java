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
        if (type.equals("IT Admin")) return "bin/itAdmin.bin";
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
        System.out.println(this.toString() + "  Saved.");
        User.saveUsername(username);
        oos.close();
        
        } catch(Exception ex) {
            System.out.println("There was a error while saving the user");
            return false;
        }
        
        return true;
    }
    
    // Bit finiky, Test out the return null parts
    // Try suing a array liArrayListst
    public static User verifyUser(String username, String password, String path) {
        ArrayList<User> userList = new ArrayList<>();
        
        try {
            File file = new File(path);
            if (!file.exists()) {
                System.out.println("File dose not exist, No user of that type exists");
                return null;
            }
            
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            try {
                while (true) {
                User user = (User) ois.readObject();
                userList.add(user);
                System.out.println("All users added to the ArrayList");
            }
                
            } catch(EOFException e) {
                System.out.println("End of file reached.");
                ois.close();
            }
            
        } catch(Exception e) {
            System.out.println("Error while reading file");            
            return null;
        }
        
        for (User u : userList) {
            if (u.getUsername().equals(username)) {
                System.out.println("User found, checking password");
                if (u.getPassword().equals(password)) {
                    System.out.println("Password matched, loggin in user: " + u.toString());
                    return u;
                }
                else {
                    System.out.println("Password dose not match.");
                    return null;
                }
            }
        }
                
        System.out.println("End of method, User not found");
        return null;
    }
    
    public boolean deleteUser() {
        // Read all user obj of that type and save it in a array
        // Read all username obj and save in in a array
        ArrayList<User> userList = new ArrayList<>();
        ArrayList<String> usernameList = new ArrayList<>();
        
        // Reading all the user obj to userList
        try {
            File file = new File(User.getPath(this.type));
            if (!file.exists()) {
                System.out.println("File dose not exist, No user of that type exists");
                return false;
            }
            
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            try {
                while (true) {
                User user = (User) ois.readObject();
                userList.add(user);
            }
                
            } catch(EOFException e) {
                System.out.println("End of file reached.");
                ois.close();
            }
            
        } catch(Exception e) {
            System.out.println("Error while reading file");            
            return false;
        }
        
        try {
            File file = new File("bin/username.bin");
            if (file.exists()) {
                FileInputStream fis = new FileInputStream(file);
                ObjectInputStream ois = new ObjectInputStream(fis);
                
                try {
                    while (true) {
                       String username = (String) ois.readObject();
                       usernameList.add(username);
                    }
                    
                } catch (EOFException e) {
                    ois.close();
                    System.out.println("All username read");
                }
                              
            } else {
                System.out.println("No user exists");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        
        // TODO REMOVING USER PART NOT WORKING
        // Removing user obj
        usernameList.remove(this.username);
        // Removing username obj
        userList.remove(this);
        
        // Deleting file
        File usernameFile = new File("bin/username.bin");
        File userObjFile = new File(User.getPath(this.type));
        
        // Saving all the old user obj intance
        for (User u : userList) {
            u.saveUser(User.getPath(this.type));
        }
        
        return true;
        
        // Test then remove username part, it isnt needed
        
        
        // Reading all the username to usrnameList
        
        
        // Remove the user obj from the array
        // Remove the username string from the array
        
        // Rewrite all obj from bin file with the objects from array
    }
}
