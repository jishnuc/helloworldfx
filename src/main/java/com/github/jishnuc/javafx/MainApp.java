package com.github.jishnuc.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;


public class MainApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        URL resource = getClass().getResource("scene.fxml");
        System.out.println("---->"+resource.toString());
        Parent root = FXMLLoader.load(resource);

        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());

        stage.setTitle("JavaFX and Maven");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
