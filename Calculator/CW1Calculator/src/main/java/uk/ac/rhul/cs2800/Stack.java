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

  int size;
  public List<Entry> entries;

  public Stack() {
    this.size = 0;
    this.entries = new ArrayList<>();
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
    this.entries.add(i);
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
    return entries.remove(entries.size() - 1);
    
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
    return entries.get(size - 1);
  }

  /**
   * Checks if the stack is empty with the method size().
   *
   * @return true if empty or false if not.
   */

  public Boolean isEmpty() {
    if (entries.size() == 0) { // Checks for empty stack.
      return true; // If empty return true.
    }

    return false; // if empty return false.
  }

}

