/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group3_2111652_2110819_2220923_2220044_marriageregisteroffice.sufi;

import java.io.Serializable;

/**
 *
 * @author User
 */
public class WitnessForm implements Serializable {
    private String username;
    private int WitnessID;
    private String name;
    private int age;
    private int NID;
    private String gender;
    private String can1;
    private String can2;
    private String relTo;
    private String rel;
    private String statement;

    public WitnessForm() {
    }

    public WitnessForm(String username, int WitnessID, String name, int age, int NID, String gender, String can1, String can2, String relTo, String rel, String statement) {
        this.username = username;
        this.WitnessID = WitnessID;
        this.name = name;
        this.age = age;
        this.NID = NID;
        this.gender = gender;
        this.can1 = can1;
        this.can2 = can2;
        this.relTo = relTo;
        this.rel = rel;
        this.statement = statement;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getWitnessID() {
        return WitnessID;
    }

    public void setWitnessID(int WitnessID) {
        this.WitnessID = WitnessID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNID() {
        return NID;
    }

    public void setNID(int NID) {
        this.NID = NID;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCan1() {
        return can1;
    }

    public void setCan1(String can1) {
        this.can1 = can1;
    }

    public String getCan2() {
        return can2;
    }

    public void setCan2(String can2) {
        this.can2 = can2;
    }

    public String getRelTo() {
        return relTo;
    }

    public void setRelTo(String relTo) {
        this.relTo = relTo;
    }

    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement;
    }

    public String getRel() {
        return rel;
    }

    public void setRel(String rel) {
        this.rel = rel;
    }

    @Override
    public String toString() {
        return "WitnessForm{" + "username=" + username + ", WitnessID=" + WitnessID + ", name=" + name + ", age=" + age + ", NID=" + NID + ", gender=" + gender + ", can1=" + can1 + ", can2=" + can2 + ", relTo=" + relTo + ", rel=" + rel + ", statement=" + statement + '}';
    }
}
