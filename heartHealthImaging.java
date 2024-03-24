package homework4;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import homework4.mainUI;
 
public class heartHealthImaging extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    public void start(Stage primaryStage) {
    	mainUI mainView = new mainUI();
		Scene scene = mainView.getScene();
		
		primaryStage.setTitle("Your Pediatric Portal");
		primaryStage.setScene(scene);
		primaryStage.show();
    }
}