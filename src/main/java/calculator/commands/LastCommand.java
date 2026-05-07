package calculator.commands;

import calculator.commands.history.HistoryManager;

public class LastCommand implements Command {

    private final HistoryManager history;

    public LastCommand(HistoryManager history){

        this.history = history;
    }

    public void execute() {
        history.last();
    }
}
