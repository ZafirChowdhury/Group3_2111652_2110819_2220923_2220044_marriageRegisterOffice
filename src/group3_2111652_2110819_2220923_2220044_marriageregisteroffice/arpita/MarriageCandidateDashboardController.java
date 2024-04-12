package group3_2111652_2110819_2220923_2220044_marriageregisteroffice.arpita;

import group3_2111652_2110819_2220923_2220044_marriageregisteroffice.User;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;

public class MarriageCandidateDashboardController implements Initializable {

    @FXML
    private BorderPane borderPane;
    MarriageCandidate mc;
    public void receiveUserData(User user){
        this.mc =(MarriageCandidate) user;
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    

    private void marriageApplicationsSubmitOnClick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("SubmitMarriageApplicationScene.fxml"));
        Parent root = loader.load();
        borderPane.setCenter(root);
    }

    @FXML
    private void marriageApplicationOnClick(ActionEvent event) throws IOException {
        ObservableList <MarriageApplication> list = FXCollections.observableArrayList();
        MarriageApplication ma = null;
        for (int i = 0; i < list.size(); i ++) {
            if (list.get(i).getMc() == this.mc) {
                ma = list.get(i);
                break;
            }
        }
        if (ma == null) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("SubmitMarriageApplicationScene.fxml"));
            Parent root = loader.load();
            SubmitMarriageApplicationSceneController sma = loader.getController();
            sma.receiveUserData(mc);
            borderPane.setCenter(root);
        }
        else {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("CheckApplicationStatusScene.fxml"));
            Parent root = loader.load();
            CheckApplicationStatusSceneController cassc = loader.getController();
            cassc.receiveUserData(mc, ma);
            borderPane.setCenter(root);
        }
    }
}
