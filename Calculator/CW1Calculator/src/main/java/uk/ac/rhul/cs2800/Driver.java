package uk.ac.rhul.cs2800;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
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

  /**
   * Used from demo video by lecturer Dave Cohen. https://rhul.hosted.panopto.com/Panopto/Pages/Viewer.aspx?id=8cba7ef9-4cb2-4624-9d22-af0400b259ac
   *
   * @author Dave Cohen
   */
  @Override
  public void start(Stage primaryStage) throws Exception {
    Pane pane = FXMLLoader.load(getClass().getClassLoader().getResource("ViewInterface.fxml"));
    Scene scene = new Scene(pane, 600, 400);
    primaryStage.setScene(scene);
    primaryStage.show();
  }
}
