package calculator.exception;

import calculator.Constants;

public class UnknownCommandException extends AppException{
    public UnknownCommandException() {
        super(Constants.UNKNOWN_COMMAND);
    }
}
