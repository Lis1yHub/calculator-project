package calculator;

import calculator.exception.DivisionByZeroException;
import calculator.exception.InvalidOperatorException;

public class Calculator {

    // основной калькулятор
    public static int calculate(int a, int b, char operator) {
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
    public static int calculate(int a, int b, String operator) {
        if (operator.length() != 1) {
            throw new InvalidOperatorException();
        }
        return calculate(a, b, operator.charAt(0));
    }


    public static int sum(int a, int b){
        return a + b;
    }

    public static int subtract(int a, int b){
        return a - b;
    }

    public static int multiply(int a, int b){
        return a * b;
    }

    public static int divide(int a, int b){
        if (b == 0) {
            throw new DivisionByZeroException();
        }
        return a / b;
    }
}