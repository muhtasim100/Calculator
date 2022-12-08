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
  public int size;

  /**
   * Constructor for strStack.
   *
   * @param strStack is a new Stack.
   */
  public StrStack(Stack strStack) {
    this.strStack = new Stack();
    this.size = 0;
  }

  /**
   * Push function pushes to the values Stack.
   *
   * @param str String is pushed to the stack.
   */
  public void push(String str) {
    Entry values = new Entry(str);
    strStack.push(values);
    this.size++;
  }

  /**
   * Returns popped value if the stack is not empty.
   *
   * @return value with popped value from stack.
   * @throws BadTypeException if type wrong.
   */
  public String pop() throws BadTypeException {
    if (strStack.size() == 0) { // Checks for empty stack.
      throw new EmptyStackException();
    }
    return this.strStack.pop().getString();

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

  public int size() {
    return size;
  }
}
