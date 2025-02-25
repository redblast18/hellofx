package com.jdojo.intro;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ChoiceBoxExample extends Application {
    @Override
    public void start(Stage primaryStage) {
        ChoiceBox<String> choiceBox = new ChoiceBox<>(FXCollections.observableArrayList(
            "Option 1", "Option 2", "Option 3"
        ));

        Label selectedLabel = new Label("Sélection: ");

        choiceBox.setOnAction(e -> selectedLabel.setText("Sélection: " + choiceBox.getValue()));

        VBox root = new VBox(10, choiceBox, selectedLabel);
        root.setPadding(new Insets(20));
        Scene scene = new Scene(root, 300, 200);
        primaryStage.setTitle("Exemple de ChoiceBox");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}