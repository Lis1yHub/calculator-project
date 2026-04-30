import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean Flag = true;

        while (Flag) {
            System.out.println("Введите выражение:");

            String expr = input.nextLine();

            if (expr.equals("exit")) {
                System.out.println("До свидания!");
                break;
            }

            try {
                Expression expr_obj = InputParser.parse(expr);

                try {
                    int result;

                    switch (expr_obj.operator) {
                        case '+':
                            result = Calculator.sum(expr_obj.num1, expr_obj.num2);
                            System.out.println(result);
                            break;

                        case '-':
                            result = Calculator.subtract(expr_obj.num1, expr_obj.num2);
                            System.out.println(result);
                            break;

                        case '*':
                            result = Calculator.multiply(expr_obj.num1, expr_obj.num2);
                            System.out.println(result);
                            break;

                        case '/':
                            result = Calculator.divide(expr_obj.num1, expr_obj.num2);
                            System.out.println(result);
                            break;
                    }
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                }

                System.out.println("Вы хотите ввести еще одно выражение?");

                while (true) {
                    String ans = input.nextLine().toLowerCase().replaceAll("//s", "");
                    if (ans.equals("да")) {
                        break;
                    } else if (ans.equals("нет")) {
                        System.out.println("До свидания!");
                        Flag = false;
                        break;
                    } else if (ans.equals("exit")) {
                        System.out.println("До свидания!");
                        System.exit(0);
                    } else {
                        System.out.println("Напишите \"да\" или \"нет\"");
                    }
                }
            } catch (Exception e) {
                System.out.println("Ошибка: неверный формат. Используйте: число оператор число");
            }
        }
    }
}