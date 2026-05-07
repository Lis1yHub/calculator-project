package calculator.commands;

import calculator.commands.history.HistoryManager;

public class ClearCommand implements Command {

    private final HistoryManager history;

    public ClearCommand(HistoryManager history) {
        this.history = history;
    }

    public void execute() {
        history.clear();
    }
}