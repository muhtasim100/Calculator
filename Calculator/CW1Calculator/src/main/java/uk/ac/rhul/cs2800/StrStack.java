package uk.ac.rhul.cs2800;

import java.util.EmptyStackException;

/**
 * StrStack class.
 *
 * @author muhtasim
 *
 */
public class StrStack {
  public Stack strStack;

  /**
   * Constructor for strStack.
   *
   * @param strStack is a new Stack.
   */
  public StrStack(Stack strStack) {
    this.strStack = new Stack();
  }

  /**
   * Push function pushes to the values Stack.
   *
   * @param str String is pushed to the stack.
   */
  public void push(String str) {
    Entry values = new Entry(str);
    strStack.push(values);
  }

  /**
   * Returns popped value if the stack is not empty.
   *
   * @return value with popped value from stack.
   */
  public Entry pop() {
    if (strStack.size() == 0) { // Checks for empty stack.
      throw new EmptyStackException();
    }
    return strStack.entries.remove(strStack.size() - 1);

  }

  /**
   * Returns true or false depending on whether the stack is empty or not.
   *
   * @return Boolean value true or false.
   */
  public Boolean isEmpty() {
    if (strStack.size() == 0) { // Checks for empty stack.
      return true; // If empty return true.
    }

    return false; // if empty return false.
  }

}
