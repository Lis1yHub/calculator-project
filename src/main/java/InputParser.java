import java.util.regex.Pattern;

public class InputParser {
    public static Expression parse(String expr) {
        expr = expr.replaceAll("\\s", "");

        char operator = ' ';

        if (expr.contains("+")) {
            operator = '+';
        } else if (expr.contains("-")) {
            operator = '-';
        } else if (expr.contains("*")) {
            operator = '*';
        } else if (expr.contains("/")) {
            operator = '/';
        }

        if (!expr.matches(".*\\d.*\\d.*")) {
            throw new InvalidFormatException();
        }

        if (operator == ' ') {
            throw new InvalidOperatorException();
        }

        String[] parts = expr.split(Pattern.quote(String.valueOf(operator)));

        if (parts.length != 2) {
            throw new InvalidFormatException();
        }

        try {
            String leftPart = parts[0];
            String rightPart = parts[1];

            int num1 = Integer.parseInt(leftPart);
            int num2 = Integer.parseInt(rightPart);

            return new Expression(num1, num2, operator);
        } catch (NumberFormatException e) {
            throw new InvalidFormatException();
        }
    }
}
