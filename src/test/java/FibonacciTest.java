import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    Fibonacci fib;

    @BeforeEach
    void setUp() {
        fib = new Fibonacci();
    }

    @Test
    void shouldFail() {
        assertEquals(true, false);
    }
}