/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group3_2111652_2110819_2220923_2220044_marriageregisteroffice;

import java.time.LocalDate;

/**
 *
 * @author zafir
 */

public abstract class User {
    protected String username, password, name, email;
    protected LocalDate DOB, DOJ;

    public User(String username, String password, String name, String email, LocalDate DOB, LocalDate DOJ) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.email = email;
        this.DOB = DOB;
        this.DOJ = DOJ;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }

    public LocalDate getDOJ() {
        return DOJ;
    }

    public void setDOJ(LocalDate DOJ) {
        this.DOJ = DOJ;
    }

    @Override
    public String toString() {
        return "User{" + "username=" + username + ", password=" + password + ", name=" + name + ", email=" + email + ", DOB=" + DOB + ", DOJ=" + DOJ + '}';
    }
    
    
    
}   
