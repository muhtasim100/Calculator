package uk.ac.rhul.cs2800;

/**
 * BadType Exception class containing a String.
 *
 * @author muhtasim
 *
 */
public class BadTypeException extends Exception {
  // New class for custom exception extends class Exception.

  public BadTypeException(String message) {
    super(message);
  }

}
