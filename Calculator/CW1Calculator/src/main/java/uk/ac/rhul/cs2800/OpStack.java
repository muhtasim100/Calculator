package uk.ac.rhul.cs2800;

import java.util.EmptyStackException;

/**
 * OpStack class.
 *
 * @author muhtasim
 *
 */
public class OpStack {
  public Stack opStack;
  public int size;
  
  /**
   * Constructor for opStack.
   *
   */

  public OpStack() {
    this.opStack = new Stack();
    this.size = 0;
  }
  
  /**
   * Push function pushes to the values Stack.
   *
   * @param i Symbol i is pushed to the stack.
   */
  public void push(Symbol i) {
    Entry values = new Entry(i);
    opStack.push(values);
    this.size++;
  }

  /**
   * Returns popped value if the stack is not empty.
   *
   * @return value with popped value from stack.
   * @throws BadTypeException if wrong type.
   */
  public Symbol pop() throws BadTypeException {
    if (opStack.size() == 0) { // Checks for empty stack.
      throw new EmptyStackException();
    }
    return this.opStack.pop().getSymbol();

  }

  /**
   * Returns true or false depending on whether the stack is empty or not.
   *
   * @return Boolean value true or false.
   */
  public Boolean isEmpty() {
    if (opStack.size() == 0) { // Checks for empty stack.
      return true; // If empty return true.
    }
    return false; // if empty return false.
  }
  
  public int size() {
    return size;
  }
}
