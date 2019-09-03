package sample.controller;

import com.jfoenix.controls.*;
import com.jfoenix.controls.cells.editors.TextFieldEditorBuilder;
import com.jfoenix.controls.cells.editors.base.GenericEditableTreeTableCell;
import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.util.Callback;
import sample.Global;
import sample.Main;

import java.io.IOException;
import java.net.URL;
import java.util.Observable;
import java.util.ResourceBundle;

public class RankingPanelController implements Initializable {
    public void Back(ActionEvent e) throws IOException {
        Main.manageStage.closeWindow(Global.RankingPanel);
        Main.manageStage.showWindow(Global.MainPanel);
    }
    
    @FXML
    JFXTabPane tabPane;
    
    @FXML
    JFXListView<Label> easyOder;
    
    @FXML
    JFXListView<Label> normalOder;
    
    @FXML
    JFXListView<Label> hardOder;
    
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
        for(int i = 0 ; i < 4 ; i++) {
            easyOder.getItems().add(new Label("Item " + i));
        }
        easyOder.getStyleClass().add("mylistview");
    
        for(int i = 10 ; i < 14 ; i++) {
            normalOder.getItems().add(new Label("Item " + i));
        }
        normalOder.getStyleClass().add("mylistview");
    
        for(int i = 20 ; i < 24 ; i++) {
            hardOder.getItems().add(new Label("Item " + i));
        }
        hardOder.getStyleClass().add("mylistview");
        
        Tab easyTab = new Tab();
        
        easyTab.setText("Easy");
        easyTab.setContent(easyOder);
        tabPane.getTabs().add(easyTab);
    
        Tab NormalTab = new Tab();
        NormalTab.setText("Normal");
        NormalTab.setContent(normalOder);
        tabPane.getTabs().add(NormalTab);
    
        Tab HardTab = new Tab();
        HardTab.setText("Hard");
        HardTab.setContent(hardOder);
        tabPane.getTabs().add(HardTab);
    }
    
}
