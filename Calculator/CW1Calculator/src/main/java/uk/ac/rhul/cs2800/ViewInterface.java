package uk.ac.rhul.cs2800;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


/**
 * View class for the GUI of the calculator project. Used Demo video by lecturer Dave Cohen and
 * CS2800 code examples folder.
 *
 * @author Dave Cohen
 *
 */

public class ViewInterface {

  @FXML
  private Button mainButton;

  @FXML
  private Label label;

  @FXML
  void isPressed(ActionEvent event) {
    label.setText("Button has been pressed");
  }
}
