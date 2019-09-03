package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.HashMap;

/*
a class to manage the stages
 */

public class ManageStage {
    private static ManageStage manageStage = new ManageStage();
    public static ManageStage getManageStage(){
        return manageStage;
    }
    
    
    private static HashMap<String, Stage> hashMapStage = new HashMap<String, Stage>();
    /*
    add stages
     */
    public void addStage(String name){
        try {
            Parent root = FXMLLoader.load(getClass().getResource(name));
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            hashMapStage.put(name,stage);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public Stage getStage(String name){
        return (Stage) hashMapStage.get(name);
    }
    
    /*
    show windows
     */
    public boolean showWindow(String resource) throws IOException {
        try {
            getStage(resource).show();
        } catch (Exception e){
            return false;
        }
        return true;
    }
    /*
    close windows
     */
    public boolean closeWindow(String resource){
        getStage(resource).close();
        return true;
        
    }
    
}
