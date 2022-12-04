package uk.ac.rhul.cs2800;

import java.util.EmptyStackException;

/**
 * NumStack class.
 *
 * @author muhtasim
 *
 */
public class NumStack {
  public Stack numStack;

  /**
   * Constructor for numStack.
   *
   * @param numStack is a new Stack.
   */
  public NumStack(Stack numStack) {
    this.numStack = new Stack();
  }

  /**
   * Pushes float value to stack values as a new Entry.
   *
   * @param i float value that is pushed in the stack as an entry.
   */
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
   * Returns true or false depending on whether the stack is empty or not.
   *
   * @return Boolean value true or false.
   */
  public Boolean isEmpty() {
    if (numStack.size() == 0) { // Checks for empty stack.
      return true; // If empty return true.
    }
    return false; // if empty return false.
  }
}
