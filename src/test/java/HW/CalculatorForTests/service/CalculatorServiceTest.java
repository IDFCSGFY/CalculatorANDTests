package HW.CalculatorForTests.service;

import HW.CalculatorForTests.exception.DivisionByZeroAttemptedException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static HW.CalculatorForTests.constants.CalculatorServiceTestConstants.*;

class CalculatorServiceTest {

    private final CalculatorServiceImpl out = new CalculatorServiceImpl();

    @Test
    public void shouldReturnCorrectSum() {
        Double actual = out.plus(CORRECT_NUMBER1, CORRECT_NUMBER1);
        assertNotNull(actual);
        assertEquals(CORRECT_SUM1, actual);
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhileAdding() {
        assertThrows(IllegalArgumentException.class, () -> out.plus(NULL_NUMBER, CORRECT_NUMBER1));
        assertThrows(IllegalArgumentException.class, () -> out.plus(CORRECT_NUMBER1, NULL_NUMBER));
    }

    @Test
    public void shouldReturnCorrectDifference() {
        Double actual = out.minus(CORRECT_NUMBER1, CORRECT_NUMBER1);
        assertNotNull(actual);
        assertEquals(CORRECT_DIFFERENCE1, actual);
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhileSubtracting() {
        assertThrows(IllegalArgumentException.class, () -> out.minus(NULL_NUMBER, CORRECT_NUMBER1));
        assertThrows(IllegalArgumentException.class, () -> out.minus(CORRECT_NUMBER1, NULL_NUMBER));
    }

    @Test
    public void shouldReturnCorrectMultiplicationProduct() {
        Double actual = out.multiply(CORRECT_NUMBER1, CORRECT_NUMBER1);
        assertNotNull(actual);
        assertEquals(CORRECT_MULTIPLICATION_PRODUCT1, actual);
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhileMultiplying() {
        assertThrows(IllegalArgumentException.class, () -> out.multiply(NULL_NUMBER, CORRECT_NUMBER1));
        assertThrows(IllegalArgumentException.class, () -> out.multiply(CORRECT_NUMBER1, NULL_NUMBER));
    }

    @Test
    public void shouldReturnCorrectQuotient() {
        Double actual = out.divide(CORRECT_NUMBER1, CORRECT_NUMBER1);
        assertNotNull(actual);
        assertEquals(CORRECT_QUOTIENT1, actual);
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhileDividing() {
        assertThrows(IllegalArgumentException.class, () -> out.divide(NULL_NUMBER, CORRECT_NUMBER1));
        assertThrows(IllegalArgumentException.class, () -> out.divide(CORRECT_NUMBER1, NULL_NUMBER));
    }

    @Test
    public void shouldThrowDivisionByZeroAttemptedException() {
        assertThrows(DivisionByZeroAttemptedException.class, () -> out.divide(CORRECT_NUMBER1, ZERO_NUMBER));
    }
}