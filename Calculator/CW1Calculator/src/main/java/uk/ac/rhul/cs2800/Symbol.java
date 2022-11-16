package uk.ac.rhul.cs2800;

/**
 * This Enumeration class has a list of non-number tokens possible in a mathematical expression.
 *
 * * @author muhtasim
 *
 */

public enum Symbol {
  LEFTBRACKET("("), 
  RIGHTBRACKET(")"),
  TIMES("x"),
  DIVIDE("/"),
  PLUS("+"),
  MINUS("-"),
  INVALID("INVALID");
  // 
  
  private String symEntry;
  /**
   * Constructor for symEntry.
   *
   * @param symEntry is instantiated. 
   */
  
  private Symbol(String symEntry) {
    this.symEntry = symEntry;
  }
  
  /**
   * toString Method.
   *
   * @return symEntry toString of Symbol.
   */
  @Override
  public String toString() {
    return symEntry;
  }
}