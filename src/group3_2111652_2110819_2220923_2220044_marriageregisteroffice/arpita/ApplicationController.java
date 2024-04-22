package group3_2111652_2110819_2220923_2220044_marriageregisteroffice.arpita;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;

public class ApplicationController implements Initializable {

    @FXML
    private TableView<PremaritalCounseling> tableView;
    @FXML
    private TableColumn<PremaritalCounseling, String> DateColumn;
    @FXML
    private TableColumn<PremaritalCounseling, String> descriptionColumn;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        descriptionColumn.setCellValueFactory(cellData -> {
            return new SimpleStringProperty(cellData.getValue().getDescription());});
        tableView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        tableView.getItems().clear();
        tableView.getItems().addAll(PremaritalCounseling.getPremaritalCounselingList());
        // TODO
    }    

    @FXML
    private void AcceptedButtonOnClick(MouseEvent event) {
        ObservableList<PremaritalCounseling> selectedItems = tableView.getSelectionModel().getSelectedItems();
        for (int i = 0; i < selectedItems.size(); i ++) {
            PremaritalCounseling.update(selectedItems.get(i));
        }
        PopUp.Message(selectedItems.size() + " applications has been accepted");
    }
    
}
