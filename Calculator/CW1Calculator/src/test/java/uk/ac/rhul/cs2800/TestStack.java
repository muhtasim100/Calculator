package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.EmptyStackException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Test case for stack.
 *
 * @author muhtasim
 *
 */
class TestStack {
  private Stack s;

  @BeforeEach
  public void setup() {

    s = new Stack();
  }

  /**
   * Checks that size() method in Stack works. New stack is created then assertEquals() and size()
   * method is used to check if the stack size is equal to 0.
   */
  @Test // Test 1
  void testSize() {
    Stack s = new Stack();
    assertEquals(s.size(), 0, "Test a new stack to check its size is zero.");
  }

  /**
   * An entry is pushed into the Stack value using the push() method. The size of the stack is then
   * checked with assertEquals() and size() to see if the push worked.
   */
  @Test // Test 2
  void testPush() {
    Entry value = new Entry(3);
    s.push(value);
    assertEquals(s.size(), 1, "Pushes a value to the stack and checks size.");
  }

  /**
   * Checks to ensure we cannot pop in an empty stack. AssertThrows() throws an EmptyStackException
   * because there is nothing to pop.
   */
  @Test // Test 3
  void testEmptyPop() {
    assertThrows(EmptyStackException.class, () -> s.pop(), "Cannot pop from an empty stack.");
  }

  /**
   * First an entry is pushed into the stack using push() method. The entry is then popped to leave
   * the stack empty. We do this with the pop() method. We need an aeertThrows() to indicate that
   * the method throws EmptyStackException.
   *
   * @throws BadTypeException if type does not match.
   */
  @Test // Test 4
  void testPushThenPop() throws BadTypeException {
    Entry value = new Entry(7);
    s.push(value);
    assertEquals(s.pop().getValue(), 7, "Pushing then popping 7 should return 7.");
    assertEquals(s.size(), 0, "After popping, the size should be 0.");
    assertThrows(EmptyStackException.class, () -> s.pop(), "Cannot pop from an empty stack.");
  }

  /**
   * Test pushes 2 entries in the stack with push() and then uses pop() to pop both entries.
   * AssertEquals() is used to check the size the end to check if the stack in empty.
   *
   * @throws BadTypeException if wrong Type.
   */
  @Test // Test 5
  void testDoublePop() throws BadTypeException {
    Entry value = new Entry(7);
    Entry value2 = new Entry(4);
    s.push(value);
    s.push(value2);
    assertEquals(s.size(), 2, "The size should be 2.");
    assertEquals(s.pop().getValue(), 4, "Pushing then popping 4 should return 4.");
    assertEquals(s.pop().getValue(), 7, "Pushing then popping 7 should return 7.");
    assertEquals(s.size(), 0, "After popping, the size should be 0.");
  }

  /**
   * Testing to check the correct function of top() method. 3 entries are pushed in the stack and
   * then the getValue() method is used to check if the last pushed entry is the returned value.
   *
   * @throws BadTypeException if wrong Type.
   */
  @Test // Test 6
  void testTop() throws BadTypeException {
    Entry value = new Entry(10);
    Entry value2 = new Entry(1);
    Entry value3 = new Entry(30);
    s.push(value);
    s.push(value2);
    s.push(value3);
    assertEquals(s.top().getValue(), 30, "Top method should return 30.");

  }

}


