package uk.ac.rhul.cs2800;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * CalcController class for calculator project which serves as the main class for the controller.
 *
 * @author muhtasim
 *
 */
public class CalcController extends Application {
  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) throws Exception {
    Pane pane = FXMLLoader.load(getClass().getResource("CalcController.fxml"));
    Scene scene = new Scene(pane, 800, 500);
    primaryStage.setScene(scene);
    primaryStage.show();    
  }
    
}
