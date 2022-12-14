package com.example.videoplayer;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        VideoPlayer videoPlayer =new VideoPlayer();
        Scene scene =new Scene(videoPlayer, 1280, 760, Color.BLACK);
        Stage.setScene(scene);
        Stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}