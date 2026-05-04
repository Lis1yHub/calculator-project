package calculator;

import calculator.exception.DivisionByZeroException;
import calculator.exception.InvalidOperatorException;

public class Calculator {

    // основной калькулятор
    public static double calculate(double a, double b, char operator) {
        switch (operator) {
            case '+':
                return sum(a, b);
            case '-':
                return subtract(a, b);
            case '*':
                return multiply(a, b);
            case '/':
                return divide(a, b);
            default:
                throw new InvalidOperatorException();
        }
    }

    // для обработки тестов, возвращает основной калькулятор
    public static double calculate(double a, double b, String operator) {
        if (operator.length() != 1) {
            throw new InvalidOperatorException();
        }
        return calculate(a, b, operator.charAt(0));
    }


    public static double sum(double a, double b){
        return a + b;
    }

    public static double subtract(double a, double b){
        return a - b;
    }

    public static double multiply(double a, double b){
        return a * b;
    }

    public static double divide(double a, double b){
        if (b == 0) {
            throw new DivisionByZeroException();
        }
        return a / b;
    }
}