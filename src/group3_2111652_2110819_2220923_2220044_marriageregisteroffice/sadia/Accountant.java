/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group3_2111652_2110819_2220923_2220044_marriageregisteroffice.sadia;

import group3_2111652_2110819_2220923_2220044_marriageregisteroffice.User;
import java.time.LocalDate;

/**
 *
 * @author HP 840 G6
 */
public class Accountant extends User {
    
    public Accountant(String username, String password, String name, String email, LocalDate DOB, LocalDate DOJ) {
        super(username, password, name, email, DOB, DOJ);
    }
    
    public boolean StoreClientBankInfo(String name, int phone, String bankName, int bankAccNo, String bankBranch){
        ClientBankInfo cbi = new ClientBankInfo(name, bankName, bankBranch, phone, bankAccNo);
        
//        save to bin file here
        return true;
//        if fail return false
    } 
    
}
