package HW.CalculatorForTests.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static HW.CalculatorForTests.constants.CalculatorServiceTestConstants.*;

public class CalculatorServiceParameterizedTest {

    CalculatorServiceImpl out = new CalculatorServiceImpl();

    public static Stream<Arguments> provideArgumentsForSumReturningTests() {
        return Stream.of(
                Arguments.of(CORRECT_NUMBER1, CORRECT_NUMBER1, CORRECT_SUM1),
                Arguments.of(CORRECT_NUMBER1, CORRECT_NUMBER2, CORRECT_SUM)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForSumReturningTests")
    public void shouldReturnCorrectSum(Double num1, Double num2, Double expected) {
        Double actual = out.plus(num1, num2);
        Assertions.assertNotNull(num1);
        Assertions.assertNotNull(num2);
        Assertions.assertEquals(expected, actual);
    }

    public static Stream<Arguments> provideArgumentsForDifferenceReturningTests() {
        return Stream.of(
                Arguments.of(CORRECT_NUMBER1, CORRECT_NUMBER1, CORRECT_DIFFERENCE1),
                Arguments.of(CORRECT_NUMBER1, CORRECT_NUMBER2, CORRECT_DIFFERENCE)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForDifferenceReturningTests")
    public void shouldReturnCorrectDifference(Double num1, Double num2, Double expected) {
        Double actual = out.minus(num1, num2);
        Assertions.assertNotNull(num1);
        Assertions.assertNotNull(num2);
        Assertions.assertEquals(expected, actual);
    }

    public static Stream<Arguments> provideArgumentsForMultiplicationProductReturningTests() {
        return Stream.of(
                Arguments.of(CORRECT_NUMBER1, CORRECT_NUMBER1, CORRECT_MULTIPLICATION_PRODUCT1),
                Arguments.of(CORRECT_NUMBER1, CORRECT_NUMBER2, CORRECT_MULTIPLICATION_PRODUCT)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForMultiplicationProductReturningTests")
    public void shouldReturnCorrectMultiplicationProduct(Double num1, Double num2, Double expected) {
        Double actual = out.multiply(num1, num2);
        Assertions.assertNotNull(num1);
        Assertions.assertNotNull(num2);
        Assertions.assertEquals(expected, actual);
    }

    public static Stream<Arguments> provideArgumentsForQuotientReturningTests() {
        return Stream.of(
                Arguments.of(CORRECT_NUMBER1, CORRECT_NUMBER1, CORRECT_QUOTIENT1),
                Arguments.of(CORRECT_NUMBER1, CORRECT_NUMBER2, CORRECT_QUOTIENT)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForQuotientReturningTests")
    public void shouldReturnCorrectQuotient(Double num1, Double num2, Double expected) {
        Double actual = out.divide(num1, num2);
        Assertions.assertNotNull(num1);
        Assertions.assertNotNull(num2);
        Assertions.assertEquals(expected, actual);
    }
}
