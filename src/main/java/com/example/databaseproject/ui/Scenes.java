package com.example.databaseproject.ui;

import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public class Scenes {

    public static Scene getLoginScene(){
        Pane pane = new Pane();

        Button loginButton = new Button();
        loginButton.setText("Login");
        loginButton.setPrefSize(50,10);
        loginButton.setLayoutX(50);
        loginButton.setLayoutY(60);

        pane.getChildren().add(loginButton);

        loginButton.setOnAction(e ->{
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setTitle("Fatel Error");
            a.setContentText("You need to finish DB Project !!!!");
//            a.setAlertType(Alert.AlertType.CONFIRMATION);
            a.show();
        });


        Scene scene = new Scene(pane,500,400);
        return scene;
    }

}
