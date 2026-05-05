package calculator.Operations;

import calculator.exception.DivisionByZeroException;

public class DivideOperation implements Operation {
    public double execute(double a, double b) {
        if (b == 0) {
            throw new DivisionByZeroException();
        }
        return a / b;
    }
}
