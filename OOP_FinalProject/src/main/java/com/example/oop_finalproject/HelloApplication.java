package com.example.oop_finalproject;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    //constructor
    public HelloApplication() {
    }
    //override
    @Override
    public void start(Stage stage) throws IOException // "GUI"
    {
        final VBox mainbox = new VBox(); //root
        final VBox mainmenu = new VBox();
        final VBox maingame = new VBox();
        final VBox addcustomwords = new VBox();

        Button play = new Button("Start");
        Button addwerds = new Button("Add Custom Words");
        Button quit = new Button("Quit");

//        play.setMinWidth(120);
//        play.setMaxWidth(320);
        play.setPrefWidth(120);
        play.setPrefHeight(60);

        mainmenu.getChildren().addAll(play, addwerds, quit);
        mainbox.getChildren().add((Pane)mainmenu); //casting
        mainmenu.setAlignment(Pos.CENTER);
        mainmenu.setMinSize(480, 360);
        mainmenu.setSpacing(50);


        play.setOnAction(actionEvent ->
        {
            mainbox.getChildren().set(0,maingame);
        });

        quit.setOnAction(actionEvent -> {
            Platform.exit();
            System.exit(0);
        });

        Scene scene = new Scene(mainbox, 960, 720);
        scene.setFill(Color.RED);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();



    }

    public static void main(String[] args) {
        launch();
    }
}