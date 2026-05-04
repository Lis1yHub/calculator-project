package calculator;
import calculator.commands.Help;
import calculator.commands.HistoryManager;
import calculator.commands.Exit;
import calculator.exception.AppException;
import java.util.Scanner;

public class Application {
    Scanner input = new Scanner(System.in);
    boolean running = true;
    HistoryManager history = new HistoryManager();

    public void run() {
        while (running) {
            try {

                System.out.println("Введите выражение или команду:");
                String expr = input.nextLine();

                if (handleCommand(expr)) {
                    continue;
                }

                Expression expression = InputParser.parse(expr);

                double result = Calculator.calculate(
                        expression.num1,
                        expression.num2,
                        expression.operator
                );

                System.out.println(result);

                String record = expression.num1 + " "
                        + expression.operator + " "
                        + expression.num2 + " "
                        + " = " + result;
                history.add(record);

            } catch(AppException e){
                System.out.println(e.getMessage());
            }
        }
    }
    private boolean handleCommand(String expr) {
        switch (expr) {
            case "history":
                history.printHistory();
                return true;
            case "last":
                history.last();
                return true;
            case "clear":
                history.clear();
                return true;
            case "help":
                Help.execute();
                return true;
            case "exit":
                Exit.execute();
                return true;
            default:
                return false;
        }
    }
}




