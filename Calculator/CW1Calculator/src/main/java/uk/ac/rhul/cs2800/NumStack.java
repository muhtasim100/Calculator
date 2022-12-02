package uk.ac.rhul.cs2800;

import java.util.ArrayList;
import java.util.EmptyStackException;

/**
 * NumStack class.
 *
 * @author muhtasim
 *
 */
public class NumStack {
  public Stack numStack;

  public NumStack(Stack numStack) {
    this.numStack = new Stack();
  }

  public void push(float i) {
    Entry values = new Entry(i);
    numStack.push(values);
  }

  /**
   * Returns popped value if the stack is not empty.
   *
   * @return value with popped value from stack.
   */
  public Entry pop() {
    if (numStack.size() == 0) { // Checks for empty stack.
      throw new EmptyStackException();
    }
    return numStack.values.get(numStack.size() - 1);

  }

  /**
   * 
   * @return
   */
  public Boolean isEmpty() {
    if (numStack.size() == 0) { // Checks for empty stack.
      return true; // If empty return true.
    }
    return false; // if empty return false.
  }
}
