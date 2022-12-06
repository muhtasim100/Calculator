package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.*;
import java.util.EmptyStackException;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestStrStack {

  private Stack nStack;

  @BeforeEach
  void setUp() throws Exception {
    nStack = new Stack();

  }

  @Test
  void testPush() {
    Entry value = new Entry("test");
    nStack.push(value);
    assertEquals(nStack.size(), 1, "Pushes a value to the stack and checks size.");
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
    Entry value = new Entry("test");
    nStack.push(value);
    assertEquals(nStack.pop().getValue(), "test",
        "Pushing then popping 'test' should return 'test'.");
    assertEquals(nStack.size(), 0, "After popping, the size should be 0.");
    assertThrows(EmptyStackException.class, () -> nStack.pop(), "Cannot pop from an empty stack.");
  }
}
