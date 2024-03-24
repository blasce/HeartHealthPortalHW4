package homework4;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.Window;
import homework4.ReceptionistView;
import homework4.CTScanView;
import homework4.PatientView;
import homework4.PatientView;
import javafx.scene.text.Font;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;


public class mainUI {
	private BorderPane center;
	private VBox mainPage;
	private Scene mainScene;
	private Button receptionistButton, ctTechButton, patientButton;
	private Label title;
	
	public mainUI () {
		center = new BorderPane();
		mainPage = new VBox();
		
		
		center.setCenter(mainPage);
		mainScene = new Scene(center, 900, 500);
		mainObjects();
	}
	
	private void mainObjects() {	
		mainPage.alignmentProperty();
		title = new Label("Welcome to Heart Health Imaging and Recording System");
		
		receptionistButton = new Button("Patient Intake");
		ctTechButton = new Button("CT Scan Tech View");
		patientButton = new Button("Patient View");
		
		receptionistButton.setMaxWidth(300);
		ctTechButton.setMaxWidth(300);
		patientButton.setMaxWidth(300);
		
		title.setPadding(new Insets(15,0,0,70));
		receptionistButton.setPadding(new Insets(15,50,10,50));
		ctTechButton.setPadding(new Insets(15,50,10,50));
		patientButton.setPadding(new Insets(15,50,10,50));
		mainPage.setSpacing(20);

		mainPage.setMargin(receptionistButton, new Insets(0,25,0,95));
		mainPage.setMargin(ctTechButton, new Insets(0,25,0,95));
		mainPage.setMargin(patientButton, new Insets(0,25,200,95));
		
		title.setFont(new Font("Times New Roman", 15));
		receptionistButton.setStyle("-fx-background-color: #5b89cf; -fx-text-fill: black;");
		ctTechButton.setStyle("-fx-background-color: #5b89cf; -fx-text-fill: black;");
		patientButton.setStyle("-fx-background-color: #5b89cf; -fx-text-fill: black;");
		
		receptionistButton.setFont(new Font("Times New Roman", 15));
		ctTechButton.setFont(new Font("Times New Roman", 15));
		patientButton.setFont(new Font("Times New Roman", 15));
		mainPage.setMaxWidth(500);
		mainPage.setMaxHeight(300);
		mainPage.setMinWidth(500);
		mainPage.setMinHeight(300);
		
		
		String mainLayout = "-fx-border-color: black;\n" +
                "-fx-border-insets: 1;\n" ;
		mainPage.setStyle(mainLayout);
		
		mainPage.getChildren().addAll(title);
		mainPage.getChildren().addAll(receptionistButton);
		mainPage.getChildren().addAll(ctTechButton);
		mainPage.getChildren().addAll(patientButton);
		
		
		
		receptionistButton.setOnAction(new viewChooser());
		ctTechButton.setOnAction(new viewChooser());
		patientButton.setOnAction(new viewChooser());
		
	}
	
	public Scene getScene() {
		return mainScene;
	}
	
	private class viewChooser implements EventHandler<ActionEvent>{
		public void handle(ActionEvent e) {
			Object source = e.getSource();
			if (source == receptionistButton) {
				System.out.println("Patient Intake form was clicked!");
				
				ReceptionistView formIntake = new ReceptionistView(); //changes to account screen
				Window newWindow = mainScene.getWindow();
				
				if (newWindow instanceof Stage) {
					Stage newStage = (Stage) newWindow;
					newStage.setScene(formIntake.getScene());
				}
			} else if (source == ctTechButton) {
				System.out.println("CT Scan Tech View was clicked!");
				
				
				
			} else {
				System.out.println("Patient view was clicked!");
				PatientView patientPage = new PatientView();
				Window newWindow = mainScene.getWindow();
				
				if (newWindow instanceof Stage) {
					Stage newStage = (Stage) newWindow;
					newStage.setScene(patientPage.getScene());
				}
			}
		}
	}
}
