package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.*;
import java.util.EmptyStackException;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestStrStack {

  private Stack strStack;
  
  /**
   * Creates a fresh new stack each time a test is undertaken. This ensures we don't have any
   * unexpected values in the test that may ruin the integrity of the test.
   *
   * @throws Exception is checked.
   */
  @BeforeEach
  void setUp() throws Exception {
    strStack = new Stack();

  }

  /**
   * Test to check if we can push an entry into the stack.
   */
  @Test
  void testPush() {
    Entry value = new Entry("test");
    strStack.push(value);
    assertEquals(strStack.size(), 1, "Pushes a value to the stack and checks size.");
  }


  /**
   * First an entry is pushed into the stack using push() method. The entry is then popped to leave
   * the stack empty. We do this with the pop() method. We need an aeertThrows() to indicate that
   * the method throws EmptyStackException.
   *
   * @throws BadTypeException if type does not match.
   */
  @Test // Test 2
  void testPushThenPop() throws BadTypeException {
    Entry value = new Entry("test");
    strStack.push(value);
    assertEquals(strStack.pop().getString(), "test",
        "Pushing then popping 'test' should return 'test'.");
    assertEquals(strStack.size(), 0, "After popping, the size should be 0.");
    assertThrows(EmptyStackException.class, () -> strStack.pop(),
        "Cannot pop from an empty stack.");
  }
  
  /**
   * Tests isEmpty method which checks if stack is empty.
   */
  @Test // Test 3
  void testIsEmpty() {
    assertEquals(strStack.isEmpty(), true,
        "Checks empty stack with isEmpty() to get true return value.");
  }
  
  /**
   * Tests isEmpty method with a value in the stack.
   */
  @Test // Test 3
  void testIsNotEmpty() {
    Entry value = new Entry("test");
    strStack.push(value);
    assertEquals(strStack.isEmpty(), false,
        "Checks non empty stack with isEmpty() to get false return value.");
  }
  
}
