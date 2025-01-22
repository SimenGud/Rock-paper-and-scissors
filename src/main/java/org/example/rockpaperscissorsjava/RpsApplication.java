package org.example.rockpaperscissorsjava;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class RpsApplication extends Application {
  @Override
  public void start(Stage stage) throws IOException {
    FXMLLoader fxmlLoader = new FXMLLoader(RpsApplication.class.getResource("Rps-view.fxml"));
    Scene scene = new Scene(fxmlLoader.load(), 400, 300);
    stage.setTitle("Rock, Paper, Scissors");
    stage.setScene(scene);
    stage.show();
  }

  public static void main(String[] args) {
    launch();
  }
}