package cat.itacademy.s04.t02.n03.exception;

public class FrutaNotFoundException extends RuntimeException {
    public FrutaNotFoundException(String message) {
        super(message);
    }
}
