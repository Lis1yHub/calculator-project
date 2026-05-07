package operation;
import calculator.exception.DivisionByZeroException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;
import calculator.exception.InvalidOperatorException;
import calculator.Operations.Operation;
import calculator.Operations.AddOperation;
import calculator.Operations.DivideOperation;
import calculator.Calculator;

public class OperationsTest {
    @Test
    void addOperationWorks() {
        Operation op = new AddOperation();
        assertEquals(8.0, op.execute(5, 3), 0.001);
    }
    @Test
    void divideOperationWorks() {
        Operation op = new DivideOperation();
        assertEquals(2.5, op.execute(5, 2), 0.001);
    }
    @Test
    void divideByZeroThrows() {
        Operation op = new DivideOperation();
        assertThrows(DivisionByZeroException.class,
                () -> op.execute(5, 0));
    }

    @Test
    void unknownOperatorThrows() {
        assertThrows(InvalidOperatorException.class,
            () -> Calculator.calculate(5, 3, "р"));
    }
}
