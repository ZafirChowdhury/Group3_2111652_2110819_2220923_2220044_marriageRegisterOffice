/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group3_2111652_2110819_2220923_2220044_marriageregisteroffice.zafir;

/**
 *
 * @author zafir
 */
public class DummyEarlyPaymentView {
    String subject;
    String isGranted;

    public DummyEarlyPaymentView(String subject, String isGranted) {
        this.subject = subject;
        this.isGranted = isGranted;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getIsGranted() {
        return isGranted;
    }

    public void setIsGranted(String isGranted) {
        this.isGranted = isGranted;
    }

    @Override
    public String toString() {
        return "DummyEarlyPaymentView{" + "subject=" + subject + ", isGranted=" + isGranted + '}';
    }
}
