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

public class PatientView {
	private Scene patientScene;
	private HBox columns;
	private VBox section1, section2;
	private Label welcomeLabel, cacLabel, lmLabel, ladLabel,lcxLabel,rcaLabel,pdaLabel;
	private TextField cacTF, lmTF, ladTF, lcxTF, rcaTF, pdaTF;
	private int cac, lm, lad, lcx, rca, pda;
	private String name;
	
	public PatientView(){
		columns = new HBox();
		section1 = new VBox();
		section2 = new VBox();
		
		firstCol();
		secCol();
		columns.getChildren().addAll(section1, section2);
		patientScene = new Scene(columns, 900, 500);
	}
	
	private void firstCol() {
		cacLabel = new Label("The total Agatston CAC score");
		
		lmLabel = new Label("LM: ");
		ladLabel = new Label("LAD: ");
		lcxLabel = new Label("LCX: ");
		rcaLabel = new Label("RCA: ");
		pdaLabel = new Label("PDA: ");
		
		section1.getChildren().addAll(cacLabel, lmLabel, ladLabel, lcxLabel, rcaLabel, pdaLabel);
		
	}
	
	private void secCol() {
		name = "ur mom";
		welcomeLabel = new Label("Hello " + name);
		cacTF = new TextField();
		lmTF = new TextField();
		ladTF = new TextField();
		lcxTF = new TextField();
		rcaTF = new TextField();
		pdaTF = new TextField();
		
		
		section2.getChildren().addAll(welcomeLabel, cacTF, lmTF, ladTF, lcxTF, rcaTF, pdaTF);
		
	}
	
	public Scene getScene() {
		return patientScene;
	}
}
