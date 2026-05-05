package calculator.commands;

import calculator.Constants;

public class HelpCommand implements Command {
    public void execute() {
        System.out.println(Constants.HELP_MESSAGE);
    }
}
