package calculator.exception;
import calculator.Constants;

public class DivisionByZeroException extends AppException{
    public DivisionByZeroException () {
        super(Constants.ERROR_DIV_ZERO);
    }
}
