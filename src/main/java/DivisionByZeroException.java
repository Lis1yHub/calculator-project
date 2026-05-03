public class DivisionByZeroException extends RuntimeException{
    public DivisionByZeroException () {
        super(Constants.ERROR_DIV_ZERO);
    }
}
