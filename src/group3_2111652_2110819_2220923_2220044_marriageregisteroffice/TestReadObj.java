/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group3_2111652_2110819_2220923_2220044_marriageregisteroffice;

import group3_2111652_2110819_2220923_2220044_marriageregisteroffice.arpita.MarriageApplication;
import group3_2111652_2110819_2220923_2220044_marriageregisteroffice.zafir.EarlyPayment;
import group3_2111652_2110819_2220923_2220044_marriageregisteroffice.zafir.MarriageCertificate;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 *
 * @author zafir
 */
public class TestReadObj {
    
    // Working
    public static void main(String[] args) {
        try {
            File file = new File("bin/username.bin");
            if (file.exists()) {
                FileInputStream fis = new FileInputStream(file);
                ObjectInputStream ois = new ObjectInputStream(fis);
                
                try {
                    while (true) {
                       String user = (String) ois.readObject();
                        System.out.println(user.toString());
                    }
                } catch (EOFException e) {
                    System.out.println("End of file reached");
                    ois.close();
                }
                              
            } else {
                System.out.println("File dose not exist");
            }
    } catch (Exception ex) {
        System.out.println("Error wile reading file.");
    }
        
        System.out.println("Reading User Bin files.");
        try {
            File file = new File("bin/marriageCertificate.bin");
            if (file.exists()) {
                FileInputStream fis = new FileInputStream(file);
                ObjectInputStream ois = new ObjectInputStream(fis);
                
                try {
                    while (true) {
                        MarriageCertificate ma = (MarriageCertificate) ois.readObject();
                       System.out.println(ma.toString());
                    }
                } catch (EOFException e) {
                    System.out.println("End of file reached");
                    ois.close();
                }
                              
            } else {
                System.out.println("File dose not exist");
            }
            
        } catch (Exception ex) {
            System.out.println("Error wile reading file.");
        }
}
    
}
