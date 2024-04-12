/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group3_2111652_2110819_2220923_2220044_marriageregisteroffice.arpita;

/**
 *
 * @author zafir
 */
public class Marriage {
    final String applicant;
    final String partnet1FullLegalName;
    final String partnet2FullLegalName;
    final int partnet1NidNumber;
    final int partnet2NidNumber;
    String email;
    String contactNumber;

    public Marriage(String applicant, String partnet1FullLegalName, String partnet2FullLegalName, int partnet1NidNumber, int partnet2NidNumber, String email, String contactNumber) {
        this.applicant = applicant;
        this.partnet1FullLegalName = partnet1FullLegalName;
        this.partnet2FullLegalName = partnet2FullLegalName;
        this.partnet1NidNumber = partnet1NidNumber;
        this.partnet2NidNumber = partnet2NidNumber;
        this.email = email;
        this.contactNumber = contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
    
    public void deleteMarriage() {
        // TODO
        // Deleats the marrige obj from bin file
    }
}
