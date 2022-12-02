
package uk.ac.rhul.cs2800;

/**
 * This is a Entry class with constructors and getters.
 *
 * @author muhtasim
 *
 */

public class Entry {
  private float number;
  private Symbol other;
  private String str;
  private Type type;

  public Entry(float number) {
    this.number = number;
    type = Type.NUMBER;
  }


  public Entry(Symbol which) {
    this.other = which;
    type = Type.SYMBOL;
  }

  public Entry(String str) {
    this.str = str;
    type = Type.STRING;
  }

  public Entry(Type type) {
    this.type = type;
  }


  /**
   * Getter method for type. Called to retrieve type value which is an Enum Type.
   *
   * @return gets and returns the type
   */

  public Type getType() {
    return type;
  }

  /**
   * Getter method for String.
   *
   * @return gets and returns the String argument str
   */

  public String getString() throws BadTypeException {
    if (type != Type.STRING) { // if Type doesn't match, throw exception.
      throw new BadTypeException("BadTypeException: type is not in class Type.");
    }
    return str;
  }

  /**
   * Getter method for symbol.
   *
   * @return gets and returns the enumeration Symbol argument other
   * @throws BadType Exception is thrown when type is not of Enum
   */
  public Symbol getSymbol() throws BadTypeException {
    if (type != Type.SYMBOL) {
      throw new BadTypeException("BadTypeException: type is not in class Type.");
    }
    return other;
  }

  /**
   * Getter method for number.
   *
   * @return gets and returns the value of number which is a float
   */
  public float getValue() throws BadTypeException {
    if (type != Type.NUMBER) {
      throw new BadTypeException("BadTypeException: type is not in class Type.");
    }
    return number;
  }

}
