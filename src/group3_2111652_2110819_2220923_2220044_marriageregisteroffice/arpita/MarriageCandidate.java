package group3_2111652_2110819_2220923_2220044_marriageregisteroffice.arpita;

import group3_2111652_2110819_2220923_2220044_marriageregisteroffice.User;
import java.io.Serializable;


public class MarriageCandidate extends User implements Serializable{

    public MarriageCandidate(String username, String password, String type) {
        super(username, password, type);
    }
    public MarriageApplication ma;
    
}
