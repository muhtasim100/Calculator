package uk.ac.rhul.cs2800;

import java.util.EmptyStackException;

/**
 * NumStack class. Works as a facade class for RevPolishCalc.
 *
 * @author muhtasim
 *
 */
public class NumStack {
  public Stack numStack;
  public int size;


  /**
   * Constructor for numStack.
   *
   */
  public NumStack() {
    this.numStack = new Stack();
    this.size = 0;
  }

  /**
   * Pushes float value to stack values as a new Entry.
   *
   * @param i float value that is pushed in the stack as an entry.
   */
  public void push(float i) {
    Entry values = new Entry(i);
    numStack.push(values);
    this.size++;
    
    
  }

  /**
   * Returns popped value if the stack is not empty.
   *
   * @return value with popped value from stack.
   * @throws BadTypeException if wrong type.
   */
  public float pop() throws EmptyStackException, BadTypeException {
    //Entry popIndex;
    
    if (numStack.size == 0) { // Checks for empty stack.
      throw new EmptyStackException();
    }
    //popIndex = numStack.entries.remove(this.size - 1);
    //this.numStack.pop();
    return this.numStack.pop().getValue();
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
  
  public int size() {
    return size;
  }
}
