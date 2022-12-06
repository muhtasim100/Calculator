package uk.ac.rhul.cs2800;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Driver class created for JavaFx based from the demo video by Dave on Moodle and also JavaFXDemo
 * folder from CS2800 example code folder.
 *
 * @author muhtasim
 *
 */
public class Driver extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) throws Exception {
    Parent parent = FXMLLoader.load(getClass().getClassLoader().getResource("ViewInterface.fxml"));
    Scene scene = new Scene(parent, 800, 500);
    primaryStage.setScene(scene);
    primaryStage.show();
  }
}
