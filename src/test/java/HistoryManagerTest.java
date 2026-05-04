import static org.junit.jupiter.api.Assertions.assertEquals;
import calculator.commands.HistoryManager;
import org.junit.jupiter.api.Test;

public class HistoryManagerTest {
    @Test
    void historyStoresOperations() {
        HistoryManager history = new HistoryManager();
        history.add("5.0 + 3.0 = 8.0");
        assertEquals(1, history.size());
    }

    @Test
    void historyKeepsOnlyLastTen() {
        HistoryManager history = new HistoryManager();
        for (int i = 0; i < 11; i++) {
            history.add("операция " + i);
        }
        assertEquals(10, history.size());
    }

    @Test
    void clearEmptiesHistory() {
        HistoryManager history = new HistoryManager();
        history.add("5.0 + 3.0 = 8.0");
        history.clear();
        assertEquals(0, history.size());
    }

    @Test
    void lastReturnsLastOperation() {
        HistoryManager history = new HistoryManager();
        history.add("первая");
        history.add("вторая");
        assertEquals("вторая", history.getLast());
    }
}
