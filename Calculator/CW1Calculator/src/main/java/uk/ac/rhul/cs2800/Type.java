package uk.ac.rhul.cs2800;


/**
 * Enumeration class with a list of the types an entry value can be.
 * * @author muhtasim
 *
 */
public enum Type {
  NUMBER("NUMBER"),
  SYMBOL("SYMBOL"),
  STRING("STRING"),
  INVALID("INVALID");
  
  private String typeEntry;
  /**
   * Constructor for typeEntry.
   *
   * @param typeEntry instantiates typeEntry
   */
  
  private Type(String typeEntry) {
    this.typeEntry = typeEntry;
  }
  
  /**
   * toString Method.
   *
   * @return symEntry toString of Symbol.
   */
  @Override
  public String toString() {
    return typeEntry;
  }
  
}



