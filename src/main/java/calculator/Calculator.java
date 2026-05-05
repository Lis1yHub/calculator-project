package calculator;
import java.util.Map;
import java.util.HashMap;

import calculator.Operations.*;
import calculator.exception.InvalidOperatorException;

public class Calculator {

    private static final Map<String, Operation> operations = new HashMap<>();

    static {
        operations.put("+", new AddOperation());
        operations.put("-", new SubtractOperation());
        operations.put("*", new MultiplyOperation());
        operations.put("/", new DivideOperation());
        operations.put("%", new ModuloOperation());
    }

    public static double calculate(double a, double b, String operator) {

        Operation op = operations.get(operator);

        if (op == null) {
            throw new InvalidOperatorException();
        }

        return op.execute(a, b);
    }
}