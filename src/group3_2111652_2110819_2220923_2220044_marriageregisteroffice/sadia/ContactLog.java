/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group3_2111652_2110819_2220923_2220044_marriageregisteroffice.sadia;

import java.io.Serializable;

/**
 *
 * @author HP 840 G6
 */
public class ContactLog implements Serializable {
    private String clientname,phnnumber,address;

    public ContactLog(String clientname, String phnnumber, String address) {
        this.clientname = clientname;
        this.phnnumber = phnnumber;
        this.address = address;
    }

    public String getClientname() {
        return clientname;
    }

    public void setClientname(String clientname) {
        this.clientname = clientname;
    }

    public String getPhnnumber() {
        return phnnumber;
    }

    public void setPhnnumber(String phnnumber) {
        this.phnnumber = phnnumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "ContactLog{" + "clientname=" + clientname + ", phnnumber=" + phnnumber + ", address=" + address + '}';
    }
    
            
    
}
