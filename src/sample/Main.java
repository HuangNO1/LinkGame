package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    
    public static ManageStage manageStage = new ManageStage();
    
    @Override
    public void start(Stage primaryStage) throws Exception{
        
        manageStage.addStage(Global.MainPanel);
        manageStage.addStage(Global.PlayingPanel);
        manageStage.addStage(Global.RankingPanel);
        manageStage.addStage(Global.SettingPanel);
        manageStage.addStage(Global.AboutPanel);
        
        manageStage.showWindow(Global.MainPanel);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
