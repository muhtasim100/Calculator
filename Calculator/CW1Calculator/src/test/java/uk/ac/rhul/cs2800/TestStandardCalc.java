package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.*;

import java.util.EmptyStackException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Test case for StandardCal.
 *
 * @author muhtasim
 *
 */
public class TestStandardCalc {
  @BeforeEach
  void setup() throws Exception {
    StandardCalc standard = new StandardCalc();
  }

  /**
   * To test the first development of StandardCalc which is to change from infix to postfix. A new
   * Instance of StandardCalc called standard is created to test this.
   *
   * @throws BadTypeException if type is wrong.
   * @throws EmptyStackException if stack empty.
   */
  @Test
  void testInfixToPostfix() throws EmptyStackException, BadTypeException {
    StandardCalc standard = new StandardCalc();
    String what = "3 + 5";
    String eval = standard.evaluate(what);
    assertEquals("3 5 +", eval);
  }
}
