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
public class PurchaseInfo implements Serializable{
    private String Deptname,sellername,itemname,modelno;

    public PurchaseInfo(String Deptname, String sellername, String itemname, String modelno) {
        this.Deptname = Deptname;
        this.sellername = sellername;
        this.itemname = itemname;
        this.modelno = modelno;
    }

    public String getDeptname() {
        return Deptname;
    }

    public void setDeptname(String Deptname) {
        this.Deptname = Deptname;
    }

    public String getSellername() {
        return sellername;
    }

    public void setSellername(String sellername) {
        this.sellername = sellername;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public String getModelno() {
        return modelno;
    }

    public void setModelno(String modelno) {
        this.modelno = modelno;
    }

    @Override
    public String toString() {
        return "PurchaseInfo{" + "Deptname=" + Deptname + ", sellername=" + sellername + ", itemname=" + itemname + ", modelno=" + modelno + '}';
    }
    
}
