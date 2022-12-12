package uk.ac.rhul.cs2800;

import java.util.EmptyStackException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class ViewInterface {

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

    @FXML
    void isPressed(ActionEvent event) throws EmptyStackException, BadTypeException {
    	
    	try {
    	String what = textField.getText();
    	RevPolishCalc rpCalc = new RevPolishCalc();
    	Float rpAnswer = rpCalc.evaluate(what);
    	answerBox.setText(rpAnswer.toString());
    	}
    	catch(Exception e){
    		answerBox.setText("Invalid Expression.");	
    		}
    	}
}
