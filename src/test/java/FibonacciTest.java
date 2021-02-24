import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    Fibonacci fib;

    @BeforeEach
    void setUp() {
        fib = new Fibonacci();
    }

    @Test
    void shouldReturnIntegerNumber() {
        assertEquals(0, fib.getFibonacciOf(0));
    }

    @Test
    void shouldReturn1On1() {
        assertEquals(1, fib.getFibonacciOf(1));
    }

    @Test
    void shouldReturn1On2() {
        assertEquals(1, fib.getFibonacciOf(2));
    }

    @Test
    void shouldReturn2On3() {
        assertEquals(2, fib.getFibonacciOf(3));
    }

    @Disabled
    @Test
    void shouldReturn3On4() {
        assertEquals(3, fib.getFibonacciOf(4));
    }
}