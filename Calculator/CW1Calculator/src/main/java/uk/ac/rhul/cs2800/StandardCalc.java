package uk.ac.rhul.cs2800;

import java.util.EmptyStackException;

/**
 * 
 * @author muhtasim
 *
 */
public class StandardCalc {
  public OpStack values;
  OpStack op = new OpStack();
  RevPolishCalc rpCalc = new RevPolishCalc();

  /**
   * Method evaluate splits the string input by the user and pushes numbers into the stack. Then
   * pops when used in a calculation after a symbol is identified.
   *
   * @param what is the expression entered by the user in String format.
   * @return float value of the calculation at the end.
   * @throws BadTypeException if type does not match.
   * @throws EmptyStackException if stack is empty.
   */

  public float evaluate(String what) throws EmptyStackException, BadTypeException {
    String[] splitWhat = what.split(" ");
    String expression = "";
    int stringSize = splitWhat.length;
    for (int i = 0; i < stringSize; i++) {
      switch (splitWhat[i]) {
        case "x":
          op.push(Symbol.TIMES);
          break;
        case "/":
          op.push(Symbol.DIVIDE);
          break;
        case "+":
          op.push(Symbol.PLUS);
          break;
        case "-":
          op.push(Symbol.MINUS);
          break;
        case "(":
          op.push(Symbol.LEFTBRACKET);
          break;
        case ")":
          if (op.opStack.top().getSymbol() != Symbol.LEFTBRACKET && op.opStack.isEmpty()) {
            op.pop();
          }
          break;
        default:
          //op.push(Float.parseFloat(splitWhat[i])); // Convert to float from string.
          expression += splitWhat[i] + " ";
          break;
      }
    }
    expression = expression + op.pop();
    System.out.println(expression);
    return rpCalc.evaluate(expression);
  }
}
