package HW.CalculatorForTests.service;

import HW.CalculatorForTests.exception.DivisionByZeroAttemptedException;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public Double plus(Double a, Double b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("Какой-то из элементов операции отсутствует.");
        }
        return (a + b);
    }

    @Override
    public Double minus(Double a, Double b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("Какой-то из элементов операции отсутствует.");
        }
        return (a - b);
    }

    @Override
    public Double multiply(Double a, Double b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("Какой-то из элементов операции отсутствует.");
        }
        return (a * b);
    }

    @Override
    public Double divide(Double a, Double b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("Какой-то из элементов операции отсутствует.");
        } else if (b == 0) {
            throw new DivisionByZeroAttemptedException("Делить на ноль я вам запрещаю.");
        }
        return (a / b);
    }
}
