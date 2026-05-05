package calculator;
import calculator.commands.*;
import calculator.exception.AppException;
import calculator.exception.InvalidFormatException;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Application {
    private Scanner input = new Scanner(System.in);
    private boolean running = true;
    HistoryManager history = new HistoryManager();
    private final Map<String, Command> commands = new HashMap<>();

    public Application () {
        commands.put("exit", new ExitCommand());
        commands.put("help", new HelpCommand());
        commands.put("history", new HistoryCommand(history));
        commands.put("last", new LastCommand(history));
        commands.put("clear", new ClearCommand(history));
    }

    public void run() {
        while (running) {
            try {

                System.out.println("Введите выражение или команду:");
                String expr = input.nextLine();

                Command command = commands.get(expr);
                if (command != null) {
                    command.execute();
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

            } catch (AppException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}




