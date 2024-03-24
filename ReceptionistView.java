package homework4;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.scene.text.Font;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

public class ReceptionistView {
	private Scene receptionScene;
	private HBox columns;
	private VBox firstColumn, secondColumn, thirdColumn;
	private TextField firstNameTF, lastNameTF, emailTF, phoneTF, healthHistTF, insurTF;
	private Label formTitle, firstTitle, lastTitle, emailTitle, phoneTitle, healthHisTitle, insurTitle;
	private Button saveButton;
	public ReceptionistView(){
		columns = new HBox();

		firstColumn = new VBox();
		secondColumn = new VBox();
		thirdColumn = new VBox();
		
		firstSec();
		secondSec();
		thirdSec();
		
		columns.getChildren().addAll(firstColumn, secondColumn, thirdColumn);
		columns.setMargin(firstColumn, new Insets(100,50,50,50));
		columns.setMargin(secondColumn, new Insets(0,0,0,50));
		receptionScene = new Scene(columns, 900, 500);
	}
	
	private void firstSec() {
		firstTitle = new Label("First Name: ");
		lastTitle = new Label("Last Name: ");
		emailTitle = new Label("Email: ");
		phoneTitle = new Label("Phone Number: ");
		healthHisTitle = new Label("Health History: ");
		insurTitle = new Label("Insurance ID: ");
		
		firstTitle.setFont(new Font("Times New Roman", 15));
		lastTitle.setFont(new Font("Times New Roman", 15));
		emailTitle.setFont(new Font("Times New Roman", 15));
		phoneTitle.setFont(new Font("Times New Roman", 15));
		healthHisTitle.setFont(new Font("Times New Roman", 15));
		insurTitle.setFont(new Font("Times New Roman", 15));
		
		firstColumn.setSpacing(30);
		
		
		firstColumn.getChildren().addAll(firstTitle, lastTitle, emailTitle, phoneTitle, healthHisTitle,insurTitle);
	}
	
	private void secondSec() {
		formTitle = new Label("Patient Intake Form");
		
		formTitle.setFont(new Font("Times New Roman", 15));
		
		firstNameTF = new TextField();
		lastNameTF = new TextField();
		emailTF = new TextField();
		phoneTF = new TextField();
		healthHistTF = new TextField();
		insurTF = new TextField();
		
		secondColumn.setMargin(formTitle, new Insets(30,0,0,100));
		secondColumn.setMargin(firstNameTF,new Insets(25,0,0,0));
		
		secondColumn.setSpacing(22.7);
		
		firstNameTF.setPrefWidth(340);
		secondColumn.getChildren().addAll(formTitle, firstNameTF, lastNameTF, emailTF, phoneTF, healthHistTF, insurTF);
		
	}
	
	private void thirdSec() {
		saveButton = new Button("Save");
		saveButton.setStyle("-fx-background-color: #5b89cf; -fx-text-fill: black;");
		saveButton.setFont(new Font("Times New Roman", 15));
		saveButton.setOnAction(new patientIntake());
		thirdColumn.getChildren().addAll(saveButton);
		thirdColumn.setMargin(saveButton, new Insets(350,0,0,150));
		
		saveButton.setPadding(new Insets(10,28,10,28));
		saveButton.setAlignment(Pos.BOTTOM_LEFT);
	}
	
	public Scene getScene() {
		return receptionScene;
	}
	
	private class patientIntake implements EventHandler<ActionEvent>{
		public void handle(ActionEvent e) {
			Object source = e.getSource();
			if (source == saveButton) {
				System.out.println("Save button pressed!");
			}
		}
	}
}
