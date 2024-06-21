package com.jdojo.intro;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ExemplePositionnement extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		Button button = new Button("clique ici");
		button.relocate(100, 80);
		
		Pane root = new Pane(button);
        Scene scene = new Scene(root, 300, 250);
        stage.setScene(scene);
        stage.setTitle("Exemple de positionnement");
        stage.show();
	}
	
	public static void main(String[] args) {
        launch(args);
    }
	
}
