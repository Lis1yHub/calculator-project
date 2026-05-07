package calculator.commands;
import java.util.ArrayList;

public class HistoryManager {

    private ArrayList<String> history = new ArrayList<>();

    public void add(String operation) {
        if (history.size() == 10) {
            history.remove(0);
            history.add(operation);
        } else {
            history.add(operation);
        }
    }

    public void printHistory() {
        if (history.isEmpty()) {
            System.out.println("История вычислений пуста.");
        } else {
            for (String op : history) {
                System.out.println(op);
            }
        }
    }

    public void clear() {
        System.out.println("История вычислений очищена.");
        history.clear();
    }

    public void last() {
        if (history.isEmpty()) {
            System.out.println("История вычислений пуста.");
        } else {
            String last_operation = history.get(history.size() - 1);
            System.out.println(last_operation);
        }
    }

    // для тестов
    public String getLast() {
        if (history.isEmpty()) {
            return null;
        }
        return history.get(history.size() - 1);
    }

    public int size() {
        return history.size();
    }
}
