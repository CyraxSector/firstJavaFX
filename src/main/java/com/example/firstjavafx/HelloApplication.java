package com.example.firstjavafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 370, 290);
        stage.setTitle("Hi!");
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void init() {
        // System.exit(0);
    }

    public static void main(String[] args) {
        launch();
    }
}