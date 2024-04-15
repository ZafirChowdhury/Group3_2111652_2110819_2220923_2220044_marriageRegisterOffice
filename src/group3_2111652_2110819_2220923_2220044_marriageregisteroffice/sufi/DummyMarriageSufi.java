/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group3_2111652_2110819_2220923_2220044_marriageregisteroffice.sufi;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author User
 */
public class DummyMarriageSufi implements Serializable{
    private String marriageID;
    private String candidateName1;
    private int age1;
    private String nationality1;
    private int NID1;
    private String father1;
    private String mother1;
    private String witness1;
    private int witID1;
    private String rel1;
    private String candidateName2;
    private int age2;
    private String nationality2;
    private int NID2;
    private String father2;
    private String mother2;
    private String witness2;
    private int witID2;
    private String rel2;
    private String venue;
    private LocalDate date;
    private LocalTime time;

    public DummyMarriageSufi() {
    }

    public DummyMarriageSufi(String marriageID, String candidateName1, int age1, String nationality1, int NID1, String father1, String mother1, String witness1, int witID1, String rel1, String candidateName2, int age2, String nationality2, int NID2, String father2, String mother2, String witness2, int witID2, String rel2, String venue, LocalDate date, LocalTime time) {
        this.marriageID = marriageID;
        this.candidateName1 = candidateName1;
        this.age1 = age1;
        this.nationality1 = nationality1;
        this.NID1 = NID1;
        this.father1 = father1;
        this.mother1 = mother1;
        this.witness1 = witness1;
        this.witID1 = witID1;
        this.rel1 = rel1;
        this.candidateName2 = candidateName2;
        this.age2 = age2;
        this.nationality2 = nationality2;
        this.NID2 = NID2;
        this.father2 = father2;
        this.mother2 = mother2;
        this.witness2 = witness2;
        this.witID2 = witID2;
        this.rel2 = rel2;
        this.venue = venue;
        this.date = date;
        this.time = time;
    }

    public String getMarriageID() {
        return marriageID;
    }

    public void setMarriageID(String marriageID) {
        this.marriageID = marriageID;
    }

    public String getCandidateName1() {
        return candidateName1;
    }

    public void setCandidateName1(String candidateName1) {
        this.candidateName1 = candidateName1;
    }

    public int getAge1() {
        return age1;
    }

    public void setAge1(int age1) {
        this.age1 = age1;
    }

    public String getNationality1() {
        return nationality1;
    }

    public void setNationality1(String nationality1) {
        this.nationality1 = nationality1;
    }

    public int getNID1() {
        return NID1;
    }

    public void setNID1(int NID1) {
        this.NID1 = NID1;
    }

    public String getFather1() {
        return father1;
    }

    public void setFather1(String father1) {
        this.father1 = father1;
    }

    public String getMother1() {
        return mother1;
    }

    public void setMother1(String mother1) {
        this.mother1 = mother1;
    }

    public String getWitness1() {
        return witness1;
    }

    public void setWitness1(String witness1) {
        this.witness1 = witness1;
    }

    public int getWitID1() {
        return witID1;
    }

    public void setWitID1(int witID1) {
        this.witID1 = witID1;
    }

    public String getRel1() {
        return rel1;
    }

    public void setRel1(String rel1) {
        this.rel1 = rel1;
    }

    public String getCandidateName2() {
        return candidateName2;
    }

    public void setCandidateName2(String candidateName2) {
        this.candidateName2 = candidateName2;
    }

    public int getAge2() {
        return age2;
    }

    public void setAge2(int age2) {
        this.age2 = age2;
    }

    public String getNationality2() {
        return nationality2;
    }

    public void setNationality2(String nationality2) {
        this.nationality2 = nationality2;
    }

    public int getNID2() {
        return NID2;
    }

    public void setNID2(int NID2) {
        this.NID2 = NID2;
    }

    public String getFather2() {
        return father2;
    }

    public void setFather2(String father2) {
        this.father2 = father2;
    }

    public String getMother2() {
        return mother2;
    }

    public void setMother2(String mother2) {
        this.mother2 = mother2;
    }

    public String getWitness2() {
        return witness2;
    }

    public void setWitness2(String witness2) {
        this.witness2 = witness2;
    }

    public int getWitID2() {
        return witID2;
    }

    public void setWitID2(int witID2) {
        this.witID2 = witID2;
    }

    public String getRel2() {
        return rel2;
    }

    public void setRel2(String rel2) {
        this.rel2 = rel2;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "DummyMarriageSufi{" + "marriageID=" + marriageID + ", candidateName1=" + candidateName1 + ", age1=" + age1 + ", nationality1=" + nationality1 + ", NID1=" + NID1 + ", father1=" + father1 + ", mother1=" + mother1 + ", witness1=" + witness1 + ", witID1=" + witID1 + ", rel1=" + rel1 + ", candidateName2=" + candidateName2 + ", age2=" + age2 + ", nationality2=" + nationality2 + ", NID2=" + NID2 + ", father2=" + father2 + ", mother2=" + mother2 + ", witness2=" + witness2 + ", witID2=" + witID2 + ", rel2=" + rel2 + ", venue=" + venue + ", date=" + date + ", time=" + time + '}';
    }
    
    
}
