package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.*;

import java.util.EmptyStackException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Test case for RevPolishCalc.
 *
 * @author muhtasim
 *
 */
class TestRevPolish {
  private RevPolishCalc revPolish;
  
  @BeforeEach
  void setup() throws Exception {
    revPolish = new RevPolishCalc();
  }

  /**
   * To test the first development of RevPolishCalc which is to split a string of inputs and print
   * them to see if they are split correctly. A new Instance of RevPolishCalc called revPolish is
   * created to test this.
   *
   * @throws BadTypeException if type is wrong.
   * @throws EmptyStackException if stack empty.
   */
  @Test
  void testSplitString() throws EmptyStackException, BadTypeException {
    String what = "3 5 +";
    Float eval = revPolish.evaluate(what);
    assertEquals(8, eval); // Checking if return is 8.
  }

  /**
   * To test the Divide case in evaluate.
   *
   * @throws BadTypeException if type is wrong.
   * @throws EmptyStackException if stack empty.
   */
  @Test
  void testDivide() throws EmptyStackException, BadTypeException {
    String what = "10 5 /";
    Float eval = revPolish.evaluate(what);
    assertEquals(2, eval);
  }

  /**
   * To test the Multiply case in evaluate.
   *
   * @throws BadTypeException if type is wrong.
   * @throws EmptyStackException if stack empty.
   */
  @Test
  void testMultiply() throws EmptyStackException, BadTypeException {
    String what = "10 5 x";
    Float eval = revPolish.evaluate(what);
    assertEquals(50, eval);
  }

  /**
   * To test the Minus case in evaluate.
   *
   * @throws BadTypeException if type is wrong.
   * @throws EmptyStackException if stack empty.
   */
  @Test
  void testMinus() throws EmptyStackException, BadTypeException {
    String what = "30 2 -";
    Float eval = revPolish.evaluate(what);
    assertEquals(28, eval);
  }

  /**
   * Try and catch statements for evaluate method when provided with an empty stack.
   *
   * @throws EmptyStackException stack is empty.
   */
  @Test
  void testEmptyStackException() throws EmptyStackException {
    try {
      String what = " ";
      Float eval = revPolish.evaluate(what);
    } catch (EmptyStackException e) {
      System.out.println(e); // Should print EmptyStackException.
    } catch (BadTypeException e) {
      System.out.println(e);
    }
  }
  
}
