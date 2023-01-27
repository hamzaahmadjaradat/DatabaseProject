package com.example.databaseproject;

import com.example.databaseproject.ui.Scenes;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class Driver extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        stage.setTitle("Hello!");
        stage.setScene(Scenes.getLoginScene());
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}