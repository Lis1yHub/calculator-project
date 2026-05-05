package calculator;
import java.util.Map;
import java.util.HashMap;
import calculator.exception.InvalidFormatException;

import java.util.regex.Pattern;

public class InputParser {

    private static final Map<String, String> operators = new HashMap<>();

    static {
        operators.put("+", "+");
        operators.put("-", "-");
        operators.put("*", "*");
        operators.put("/", "/");
        operators.put("%", "%");
    }

    public static Expression parse(String expr) {
        expr = expr.replaceAll("\\s", "");

        String operator = null;

        for (String op: operators.keySet()) {
            if (expr.contains(op)) {
                operator = op;
                break;
            }
        };

        if (operator == null) {
            throw new InvalidFormatException();
        }

        String[] parts = expr.split(Pattern.quote(operator));

        if (parts.length != 2) {
            throw new InvalidFormatException();
        }

        try {
            String leftPart = parts[0];
            String rightPart = parts[1];

            double num1 = Double.parseDouble(leftPart);
            double num2 = Double.parseDouble(rightPart);

            return new Expression(num1, num2, operator);
        } catch (NumberFormatException e) {
            throw new InvalidFormatException();
        }
    }
}
