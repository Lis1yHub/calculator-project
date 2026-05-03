package exception;

public class DivisionByZeroException extends AppException{
    public DivisionByZeroException () {
        super(Constants.ERROR_DIV_ZERO);
    }
}
