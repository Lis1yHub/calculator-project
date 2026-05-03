package calculator;

import calculator.exception.AppException;

import java.util.Scanner;

public class Application {
    Scanner input = new Scanner(System.in);
    boolean running = true;

    public void run() {
        while (running) {
            System.out.println("Введите выражение:");

            String expr = input.nextLine();

            if (expr.equals(Constants.EXIT)) {
                System.out.println(Constants.GOODBYE_MESSAGE);
                break;
            }

            try {
                Expression expression = InputParser.parse(expr);

                int result = Calculator.calculate(
                        expression.num1,
                        expression.num2,
                        expression.operator
                );

                System.out.println(result);

                System.out.println("Вы хотите ввести еще одно выражение?");

                while (true) {
                    String ans = input.nextLine()
                            .toLowerCase()
                            .replaceAll("\\s", "");
                    if (ans.equals(Constants.YES)) {
                        break;
                    } else if (ans.equals(Constants.NO) || ans.equals(Constants.EXIT)) {
                        exitProgram();
                        running = false;
                        break;
                    } else {
                        System.out.println("Напишите \"да\" или \"нет\"");
                    }
                }
            } catch (AppException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void exitProgram() {
        System.out.println(Constants.GOODBYE_MESSAGE);
    }
}


