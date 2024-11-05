package HW.CalculatorForTests.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.FORBIDDEN)
public class DivisionByZeroAttemptedException extends IllegalArgumentException {
    public DivisionByZeroAttemptedException() {
    }

    public DivisionByZeroAttemptedException(String s) {
        super(s);
    }

    public DivisionByZeroAttemptedException(String message, Throwable cause) {
        super(message, cause);
    }

    public DivisionByZeroAttemptedException(Throwable cause) {
        super(cause);
    }
}
