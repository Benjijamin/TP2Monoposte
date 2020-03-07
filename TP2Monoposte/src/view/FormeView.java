package view;

import controller.FormeController;
import javafx.collections.*;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class FormeView {
	private FormeController controller;
	private Scene scene;
	
	public FormeView(FormeController controller) {
		this.controller = controller;
		
		BorderPane bp = new BorderPane();
		// Elements de la scene
		bp.setCenter(center());
		bp.setBottom(bottom());
		bp.setRight(right());
		
		scene = new Scene(bp);
		scene.getStylesheets().setAll(this.getClass().getResource("/css/app.css").toString());
	}
	
	public Scene getScene() {
		return scene;
	}
	
	private HBox bottom() {
		HBox bottom = new HBox();
		Button gen = new Button("Generer");
		Button re = new Button("Reinitialiser");
		Button quit = new Button("Quitter");
		
		bottom.getChildren().addAll(gen,re,quit);
		bottom.setId("bottom");
		
		return bottom;
	}
	
	private Pane center() {
		Pane center = new Pane();
		center.setId("canvas");
		return center;
	}
	private VBox right() {
		VBox controls = new VBox();

		controls.setSpacing(20);

		// Formes
		Label labFormes = new Label("Formes");

		ObservableList<String> olFormes = FXCollections.observableArrayList("Ovale", "Rectangle", "Triangle", "Ligne");
		ListView<String> listeFormes = new ListView<String>(olFormes);
		listeFormes.setPrefHeight(150);

		VBox formes = new VBox(labFormes, listeFormes);

		// Couleurs
		Label labCouleur = new Label("Couleur");

		ColorPicker cpCouleur = new ColorPicker();
		cpCouleur.setPrefWidth(250);

		VBox couleurs = new VBox(labCouleur, cpCouleur);

		// Effet
		Label labEffet = new Label("Effet");

		CheckBox cbEffet = new CheckBox();

		VBox effet = new VBox(labEffet, cbEffet);

		// Position
		Label labPosx = new Label("Position x");
		Label labPosy = new Label("Position y");

		TextField tfPosx = new TextField();
		tfPosx.setMaxWidth(60);
		TextField tfPosy = new TextField();
		tfPosy.setMaxWidth(60);

		VBox vbPosx = new VBox(labPosx, tfPosx);
		VBox vbPosy = new VBox(labPosy, tfPosy);

		HBox position = new HBox(vbPosx, vbPosy);
		position.setSpacing(30);
		position.setPadding(new Insets(0, 30, 0, 30));

		// Cote
		Label labCoteA = new Label("Cote a");
		Label labCoteB = new Label("Cote b");
		Label labCoteC = new Label("Cote c");

		TextField tfCoteA = new TextField();
		tfCoteA.setMaxWidth(40);
		TextField tfCoteB = new TextField();
		tfCoteB.setMaxWidth(40);
		TextField tfCoteC = new TextField();
		tfCoteC.setMaxWidth(40);

		VBox vbCoteA = new VBox(labCoteA, tfCoteA);
		VBox vbCoteB = new VBox(labCoteB, tfCoteB);
		VBox vbCoteC = new VBox(labCoteC, tfCoteC);

		HBox cote = new HBox(vbCoteA, vbCoteB, vbCoteC);
		cote.setSpacing(30);
		cote.setPadding(new Insets(0, 12, 0, 12));

		// Opacite
		Label labOpacite = new Label("Opacite");

		Slider sliderOpacite = new Slider(0, 1, 0);

		VBox opacite = new VBox(labOpacite, sliderOpacite);

		// addAll
		controls.getChildren().addAll(formes, couleurs, effet, position, cote, opacite);

		controls.setPrefWidth(250);
		controls.setId("droite");
		return controls;
	}
}
