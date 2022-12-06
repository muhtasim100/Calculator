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

  /**
   * Creates a fresh new stack each time a test is undertaken. This ensures we don't have any
   * unexpected values in the test that may ruin the integrity of the test.
   * 
   * @throws Exception
   */
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
   * the method throws EmptyStackException. We also use the assertEquals to check the stack size
   * after popping.
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
  
<<<<<<< HEAD

  /**
   * Tests isEmpty method which checks if stack is empty.
   */
  @Test // Test 3
  void testIsEmpty() {
    assertEquals(opStack.isEmpty(), true,
        "Checks empty stack with isEmpty() to get true return value.");
  }
  
  /**
   * Tests isEmpty method with a value in the stack.
   */
  @Test // Test 4
  void testIsNotEmpty() {
    Entry value = new Entry(Symbol.PLUS);
    opStack.push(value);
    assertEquals(opStack.isEmpty(), false,
        "Checks non empty stack with isEmpty() to get false return value.");
=======
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
>>>>>>> Update1
  }
}
