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

        String[] expr_last = expr.split(Pattern.quote(String.valueOf(operator)));

        int num1 = Integer.parseInt(expr_last[0].trim());
        int num2 = Integer.parseInt(expr_last[1].trim());

        return new Expression(num1, num2, operator);
    }
}
