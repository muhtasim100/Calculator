package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.*;

import java.util.EmptyStackException;
import org.junit.jupiter.api.Test;

class TestRevPolish {

  /**
   * To test the first development of RevPolishCalc which is to split a string of inputs and print
   * them to see if they are split correctly. A new Instance of RevPolishCalc called revPolish is
   * created to test this.
   * 
   * @throws BadTypeException
   * @throws EmptyStackException
   */
  @Test
  void testSplitString() throws EmptyStackException, BadTypeException {
    RevPolishCalc revPolish = new RevPolishCalc();
    String what = "3 5 +";
    Float eval = revPolish.evaluate(what);
    assertEquals(8, eval);
  }

  @Test
  void testDivide() throws EmptyStackException, BadTypeException {
    RevPolishCalc revPolish = new RevPolishCalc();
    String what = "10 5 /";
    Float eval = revPolish.evaluate(what);
    assertEquals(2, eval);
  }

}
