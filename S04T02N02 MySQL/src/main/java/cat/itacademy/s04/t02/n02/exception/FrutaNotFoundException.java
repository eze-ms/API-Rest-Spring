package cat.itacademy.s04.t02.n02.exception;

public class FrutaNotFoundException extends RuntimeException {
    public FrutaNotFoundException(String message) {
        super(message);
    }
}
