package calculator.exception;
import calculator.Constants;

public class InvalidFormatException extends AppException{
    public InvalidFormatException () {
        super(Constants.ERROR_FORMAT);
    }
}
