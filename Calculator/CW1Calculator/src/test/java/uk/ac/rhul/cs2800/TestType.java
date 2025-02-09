package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * A JUnit 5 test case for Type Enum class. Checks if all String values of Types are as expected.
 *
 * @author muhtasim
 *
 */
class TestType {
  /**
   * Checks that Type NUMBER is equal to "NUMBER".
   */
  @Test
  void testTypeNumber() {
    String expected = "NUMBER";
    assertEquals(expected, Type.NUMBER.toString());
  }

  /**
   * Checks that Type NUMBER is not equal to string "NUMBER " because there is a space.
   */
  @Test
  void testNumNotEq() {
    String expected = "NUMBER ";
    assertNotEquals(expected, Type.NUMBER.toString());
  }
  
  /**
   * Checks that Type NUMBER is not equal to string "number" because it is in lower case.
   */
  @Test
  void testNumLower() {
    String expected = "number";
    assertNotEquals(expected, Type.NUMBER.toString());
  }
  
}
