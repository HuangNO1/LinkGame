package sample.controller;

import javafx.event.ActionEvent;
import sample.Global;
import sample.Main;

import java.io.IOException;

public class AboutPanelController {
    public void Back(ActionEvent e) throws IOException {
        Main.manageStage.closeWindow(Global.AboutPanel);
        Main.manageStage.showWindow(Global.MainPanel);
    }
}
