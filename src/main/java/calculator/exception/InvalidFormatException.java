package exception;

public class InvalidFormatException extends AppException{
    public InvalidFormatException () {
        super(Constants.ERROR_FORMAT);
    }
}
