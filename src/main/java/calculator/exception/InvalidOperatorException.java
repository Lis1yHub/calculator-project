package exception;

public class InvalidOperatorException extends AppException {
    public InvalidOperatorException() {
        super(Constants.ERROR_INVALID_OPERATOR);
    }
}
