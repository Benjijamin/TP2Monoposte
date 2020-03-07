package application;

import controller.FormeController;
import javafx.application.Application;
import javafx.stage.Stage;

public class ApplicationForme extends Application{
	private FormeController controller;
	
	public void start(Stage stage) {
		controller = new FormeController();
		stage.setTitle("Dessin de formes");
		stage.setScene(controller.getView().getScene());
		stage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
	
}
