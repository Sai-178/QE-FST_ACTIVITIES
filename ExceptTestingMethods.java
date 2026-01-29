package demos;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExceptTestingMethods {

    @Test
    public void notEnoughFunds() {
        ExceptionTest t = new ExceptionTest(10);

        assertThrows(NotEnoughFundsException.class, () -> {
            t.withdraw(100);
        });
    }

    @Test
    public void success() {
        ExceptionTest t = new ExceptionTest(100);
        assertDoesNotThrow(() -> t.withdraw(100));

    }

}
