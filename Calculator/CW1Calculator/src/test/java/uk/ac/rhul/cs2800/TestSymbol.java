package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Junit 5 Test case for Symbol Enum class. Checks if all String values of Symbols are as expected.
 *
 * @author muhtasim
 *
 */

class TestSymbol {

  /**
   * Checks that the Symbol Enumerations equates to the mathematical operator symbol. In this test,
   * we check Right Bracket is equal to ).
   */
  @Test
  void testSymbolRightBracket() {
    String expected = ")";
    assertEquals(expected, Symbol.RIGHTBRACKET.toString());
  }

  /**
   * Checks that the Symbol Enumerations equates to the mathematical operator symbol. In this test,
   * we check Left Bracket is equal to (.
   */
  @Test
  void testSymbolLeftBracket() {
    String expected = "(";
    assertEquals(expected, Symbol.LEFTBRACKET.toString());
  }

  /**
   * Checks that the Symbol Enumerations equates to the mathematical operator symbol. In this test,
   * we check SymbolTimes is equal to x.
   */
  @Test
  void testSymbolTimes() {
    String expected = "x";
    assertEquals(expected, Symbol.TIMES.toString());
  }

  /**
   * Checks that the Symbol Enumerations equates to the mathematical operator symbol.
   * In this test, we check SymbolDivide is equal to /.
   */

  @Test
  void testSymbolDivide() {
    String expected = "/";
    assertEquals(expected, Symbol.DIVIDE.toString());
  }
  
  /**
   * Checks that the Symbol Enumerations equates to the mathematical operator symbol.
   * In this test, we check SymbolPlus is equal to +.
   */
  @Test
  void testSymbolPlus() {
    String expected = "+";
    assertEquals(expected, Symbol.PLUS.toString());
  }

  /**
   * Checks that the Symbol Enumerations equates to the mathematical operator symbol.
   * In this test, we check SymbolMinus is equal to -.
   */
  @Test
  void testSymbolMinus() {
    String expected = "-";
    assertEquals(expected, Symbol.MINUS.toString());
  }
  
  /**
   * Checks the Invalid Symbol.
   */
  @Test
  void testSymbolInvalid() {
    String expected = "INVALID";
    assertEquals(expected, Symbol.INVALID.toString());
  }

  /**
   * Tests the symbol for Times with spaces.
   */
  @Test
  void testTimesSpace() {
    String expected = " x ";
    assertNotEquals(expected, Symbol.TIMES.toString());
  }

  /**
   * Tests the Symbol Times with a capital X.
   */
  @Test
  void testTimesCaps() {
    String expected = "X";
    assertNotEquals(expected, Symbol.TIMES.toString());
  }

  /**
   * Tests the symbol for Minus with spaces.
   */
  @Test
  void testMinusSpace() {
    String expected = "- ";
    assertNotEquals(expected, Symbol.MINUS.toString());
  }
  
  /**
   * Checks the Invalid Symbol with lower case.
   */
  @Test
  void testInvalidLower() {
    String expected = "invalid";
    assertNotEquals(expected, Symbol.INVALID.toString());
  }
}
