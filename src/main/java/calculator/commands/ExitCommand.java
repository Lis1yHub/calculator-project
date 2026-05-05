package calculator.commands;

import calculator.Constants;

public class ExitCommand implements Command {
    public void execute() {
        System.out.println(Constants.GOODBYE_MESSAGE);
        System.exit(0);
    }
}
