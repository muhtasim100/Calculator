
package uk.ac.rhul.cs2800;

import java.util.EmptyStackException;

/**
 * RevPolishCalc evaluates mathematical expressions written in Reverse Polish style using facade
 * class NumStack.
 *
 * @author muhtasim
 *
 */
public class RevPolishCalc {
  public NumStack values;
  NumStack numStack = new NumStack();
  float pop1;
  float pop2;

  /**
   * Method evaluate splits the string input by the user and pushes numbers into the stack. Then
   * pops when used in a calculation after a symbol is identified.
   * This code is inspired from https://www.youtube.com/watch?v=MJ23yC-1tVw&t=1s
   *
   * @param what is the expression entered by the user in String format.
   * @return float value of the calculation at the end.
   * @throws BadTypeException if type does not match.
   * @throws EmptyStackException if stack is empty.
   */

  public float evaluate(String what) throws EmptyStackException, BadTypeException {

    // NumStack numStack = new NumStack();
    String[] splitWhat = what.split(" ");
    int stringSize = splitWhat.length;
    for (int i = 0; i < stringSize; i++) {
      switch (splitWhat[i]) {
        case "x":
          numStack.push(numStack.pop() * numStack.pop());
          break;
        case "/":
          pop1 = numStack.pop();
          pop2 = numStack.pop();
          // variables made to store stacks to make sure the order of the expression makes sense.
          numStack.push(pop2 / pop1);
          break;
        case "+":
          // System.out.println("bob");
          numStack.push(numStack.pop() + numStack.pop());
          break;
        case "-":
          pop1 = numStack.pop();
          pop2 = numStack.pop();
          // variables made to store stacks to make sure the order of the expression makes sense.
          numStack.push(pop2 - pop1);
          break;
        default:
          numStack.push(Float.parseFloat(splitWhat[i])); // Convert to float from string.
          break;
      }
    }
    return numStack.pop();
  }
}

