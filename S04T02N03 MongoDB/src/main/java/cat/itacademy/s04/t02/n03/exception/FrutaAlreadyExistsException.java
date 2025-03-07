package cat.itacademy.s04.t02.n03.exception;

public class FrutaAlreadyExistsException extends RuntimeException {
  public FrutaAlreadyExistsException(String message) {
    super(message);
  }
}
