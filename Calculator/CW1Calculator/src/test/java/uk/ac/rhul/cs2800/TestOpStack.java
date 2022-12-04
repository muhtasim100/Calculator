package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.*;

import java.util.EmptyStackException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Test case for OpStack.
 *
 * @author muhtasim
 *
 */
class TestOpStack {

  private Stack opStack;

  @BeforeEach
  void setUp() throws Exception {
    opStack = new Stack();

  }

  /**
   * Pushes a test value to the opStack then checks the size of the stack to see if its been pushed.
   *
   */
  @Test
  void testPush() {
    Entry value = new Entry(Symbol.PLUS);
    opStack.push(value);
    assertEquals(opStack.size(), 1, "Pushes a value to the stack and checks size.");
  }


  /**
   * First an entry is pushed into the stack using push() method. The entry is then popped to leave
   * the stack empty. We do this with the pop() method. We need an aeertThrows() to indicate that
   * the method throws EmptyStackException. We also use the assertEquals to check the stack 
   * size after popping.
   * 
   *
   * @throws BadTypeException if type does not match.
   */
  @Test // Test 2
  void testPushThenPop() throws BadTypeException {
    Entry value = new Entry(Symbol.PLUS);
    opStack.push(value);
    assertEquals(opStack.pop().getSymbol(), Symbol.PLUS,
        "Pushing then popping Symbol.PLUS should return Symbol.PLUS.");
    assertEquals(opStack.size(), 0, "After popping, the size should be 0.");
    assertThrows(EmptyStackException.class, () -> opStack.pop(), "Cannot pop from an empty stack.");
  }
  
  /**
   * Test case for isEmpty method. Checks if the boolean value when the stack is empty is true.
   */
  @Test
  void testisEmpty() {
    assertEquals(opStack.isEmpty(), true, "Stack should be empty");
  }

  
  /**
   * Test case for isEmpty method. Checks if the boolean value when the stack is empty is true.
   */
  @Test
  void testisNotEmpty() {
    Entry value = new Entry("test");
    opStack.push(value);
    assertEquals(opStack.isEmpty(), false, "Stack should be empty");
  }
}
