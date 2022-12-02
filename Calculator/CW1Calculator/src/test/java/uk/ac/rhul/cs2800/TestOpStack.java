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

  private Stack oStack;

  @BeforeEach
  void setUp() throws Exception {
    oStack = new Stack();

  }

  /**
   * Pushes a test value to the opStack then checks the size of the stack to see if its been pushed.
   *
   */
  @Test
  void testPush() {
    Entry value = new Entry("test");
    oStack.push(value);
    assertEquals(oStack.size(), 1, "Pushes a value to the stack and checks size.");
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
    Entry value = new Entry("test");
    oStack.push(value);
    assertEquals(oStack.pop().getValue(), "test",
        "Pushing then popping 'test' should return 'test'.");
    assertEquals(oStack.size(), 0, "After popping, the size should be 0.");
    assertThrows(EmptyStackException.class, () -> oStack.pop(), "Cannot pop from an empty stack.");
  }
}
