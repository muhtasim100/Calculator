package uk.ac.rhul.cs2800;

import java.util.EmptyStackException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 * View class for GUI. Taken from scenebuilder sample skeleton code.
 *
 * @author muhtasim
 *
 */
public class ViewInterface {
  // References to objects in Scenebuilder.
  @FXML
  private RadioButton RPN;

  @FXML
  private RadioButton Stndrd;

  @FXML
  private ToggleGroup Toggle;

  @FXML
  private TextField answerBox;

  @FXML
  private Button calcButton;

  @FXML
  private TextField textField;

  /**
   * isPressed() uses an event handler to check if he button has been pressed. If so, isPressed()
   * method uses try catch statement to handle exceptions and return a message. But if a valid
   * expression is given, RevPolishCalc() is used to evaluate the answer and it returned in a text
   * field.
   *
   * @param event handler that checks if button is pressed.
   * @throws EmptyStackException if stack is empty.
   * @throws BadTypeException if type is wrong.
   */
  @FXML
  void isPressed(ActionEvent event) throws EmptyStackException, BadTypeException {
    try {
      String what = textField.getText();
      RevPolishCalc rpCalc = new RevPolishCalc();
      Float rpAnswer = rpCalc.evaluate(what);
      answerBox.setText(rpAnswer.toString());
    } catch (Exception e) {
      answerBox.setText("Invalid Expression.");
    }
  }
}
