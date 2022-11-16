package uk.ac.rhul.cs2800;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

/**
 * Stack class containing push, pop and size methods.
 *
 * @author muhtasim
 *
 */
public class Stack {
  
  private int size;
  private List<Entry> values;
  
  public Stack() {
    this.size = 0;
    this.values = new ArrayList<>();
  }
  
  /**
   * Checks size of stack.
   *
   * @return size value storing number of pushes.
   */
  public int size() {
    return size;
  }

  public void push(Entry i) {
    this.values.add(i);
    size = size + 1;
  }

  /**
   * Returns popped value if the stack is not empty.
   *
   * @return value with popped value from stack.
   */
  public Entry pop() {
    if (size == 0) { // Checks for empty stack.
      throw new EmptyStackException();
    }
    size = size - 1; // To return the value of the popped item.
    return values.get(size);
  }

  /**
   * Returns top value of the stack if the stack is not empty.
   *
   * @return value of the Entry at the top of the stack.
   */
  public Entry top() {
    if (size == 0) { // Checks for empty stack.
      throw new EmptyStackException();
    }
    return values.get(size - 1);
  }
}

