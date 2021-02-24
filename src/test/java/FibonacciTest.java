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

    @Test
    void shouldReturn3On4() {
        assertEquals(3, fib.getFibonacciOf(4));
    }

    @Test
    void shouldReturn5On5() {
        assertEquals(5, fib.getFibonacciOf(5) );
    }


    @Test
    void shouldReturn6On8() {
        assertEquals(8, fib.getFibonacciOf(6) );
    }


    @Test
    void shouldReturnOn8() {
        assertEquals(13, fib.getFibonacciOf(7) );
    }

    @Disabled
    @Test
    void ValueOf6() {
        assertEquals(1, fib.getFibonacciOf(6));
    }

    @Disabled
    @Test
    void ValueOf19() {
        assertEquals(2, fib.getFibonacciOf(19));
    }

    @Disabled
    @Test
    void ValueOf28() {
        assertEquals(3, fib.getFibonacciOf(28));
    }

    @Disabled
    @Test
    void ValueOf36() {
        assertEquals(4, fib.getFibonacciOf(36));
    }

    @Disabled
    @Test
    void ValueOf38() {
        assertEquals(5, fib.getFibonacciOf(38));
    }


}