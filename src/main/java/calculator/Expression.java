package calculator;

public class Expression {
    private final double num1;
    private final double num2;
    private final String operator;

    public Expression (double num1, double num2, String operator) {
        this.num1 = num1;
        this.num2 = num2;
        this.operator = operator;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public String getOperator() {
        return operator;
    }
}
