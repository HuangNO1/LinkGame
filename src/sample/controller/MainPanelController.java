package sample.controller;

import sample.Global;
import sample.Main;

import javafx.event.ActionEvent;
import java.io.IOException;

public class MainPanelController {
    
    public void StartGame(ActionEvent e) throws IOException {
        
        Main.manageStage.showWindow(Global.PlayingPanel);
        Main.manageStage.closeWindow(Global.MainPanel);
    }
    public void Settings(ActionEvent e) throws IOException {
        
        Main.manageStage.showWindow(Global.SettingPanel);
        Main.manageStage.closeWindow(Global.MainPanel);
    }
    public void Ranking(ActionEvent e) throws IOException {
        
        Main.manageStage.showWindow(Global.RankingPanel);
        Main.manageStage.closeWindow(Global.MainPanel);
    }
    public void About(ActionEvent e) throws IOException {
        
        Main.manageStage.showWindow(Global.AboutPanel);
        Main.manageStage.closeWindow(Global.MainPanel);
    }
    public void Exit(ActionEvent e) throws IOException {
        Main.manageStage.closeWindow(Global.MainPanel);
    }
}
