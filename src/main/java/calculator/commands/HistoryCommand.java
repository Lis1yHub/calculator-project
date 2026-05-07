package calculator.commands;

import calculator.commands.history.HistoryManager;

public class HistoryCommand implements Command {

    private final HistoryManager history;

    public HistoryCommand(HistoryManager history) {
        this.history = history;
    }

    public void execute() {
        history.printHistory();
    }
}
