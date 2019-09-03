package sample.controller;

import com.jfoenix.controls.JFXComboBox;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import sample.Global;
import sample.Main;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class SettingPanelController implements Initializable {
    
    @FXML
    JFXComboBox<Label> Diffcult;
    
    @FXML
    JFXComboBox<Label> Music;
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Diffcult.getItems().add(new Label("Easy"));
        Diffcult.getItems().add(new Label("Normal"));
        Diffcult.getItems().add(new Label("Hard"));
    
        Music.getItems().add(new Label("On"));
        Music.getItems().add(new Label("Off"));
        
    }
    
    public void Back(ActionEvent e) throws IOException {
        Main.manageStage.closeWindow(Global.SettingPanel);
        Main.manageStage.showWindow(Global.MainPanel);
    }
}
