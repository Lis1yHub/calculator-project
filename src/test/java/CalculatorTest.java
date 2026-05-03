import calculator.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    void additionReturnsCorrectResult() {
        assertEquals(8.0, Calculator.calculate(5, 3, "+"), 0.001);
    }

    @Test
    void subtractionReturnsCorrectResult() {
        assertEquals(2.0, Calculator.calculate(5, 3, "-"), 0.001);
    }

    @Test
    void multiplicationReturnsCorrectResult() {
        assertEquals(15.0, Calculator.calculate(5, 3, "*"), 0.001);
    }

    @Test
    void divisionReturnsCorrectResult() {
        assertEquals(2.5, Calculator.calculate(5, 2, "/"), 0.001);
    }

    @Test
    void divisionByZeroThrowsException() {
        assertThrows(ArithmeticException.class,
                () -> Calculator.calculate(5, 0, "/"));
    }
}